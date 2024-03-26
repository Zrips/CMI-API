/*
 * LookupService.java
 *
 * Copyright (C) 2003 MaxMind LLC. All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package com.Zrips.CMI.Modules.GeoIP;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Provides a lookup service for information based on an IP address. The
 * location of a database file is supplied when creating a lookup service
 * instance. The edition of the database determines what information is
 * available about an IP address. See the DatabaseInfo class for further
 * details.
 * <p>
 *
 * The following code snippet demonstrates looking up the country that an IP
 * address is from:
 *
 * <pre>
 * // First, create a LookupService instance with the location of the database.
 * LookupService lookupService = new LookupService(&quot;c:\\geoip.dat&quot;);
 * // Assume we have a String ipAddress (in dot-decimal form).
 * Country country = lookupService.getCountry(ipAddress);
 * System.out.println(&quot;The country is: &quot; + country.getName());
 * System.out.println(&quot;The country code is: &quot; + country.getCode());
 * </pre>
 *
 * In general, a single LookupService instance should be created and then reused
 * repeatedly.
 * <p>
 *
 * <i>Tip:</i> Those deploying the GeoIP API as part of a web application may
 * find it difficult to pass in a File to create the lookup service, as the
 * location of the database may vary per deployment or may even be part of the
 * web-application. In this case, the database should be added to the classpath
 * of the web-app. For example, by putting it into the WEB-INF/classes directory
 * of the web application. The following code snippet demonstrates how to create
 * a LookupService using a database that can be found on the classpath:
 *
 * <pre>
 * String fileName = getClass().getResource(&quot;/GeoIP.dat&quot;).toExternalForm()
 *         .substring(6);
 * LookupService lookupService = new LookupService(fileName);
 * </pre>
 *
 * @author Matt Tucker (matt@jivesoftware.com)
 */
public class LookupService {

    /**
     * Database file.
     */
    private RandomAccessFile file;
    private final File databaseFile;

    private static final Charset charset = Charset.forName("ISO-8859-1");
    private final CharsetDecoder charsetDecoder = charset.newDecoder();

    ConcurrentHashMap<String, IPLocation> cache = new ConcurrentHashMap<String, IPLocation>();

    /**
     * The database type. Default is the country edition.
     */
    private byte databaseType = DatabaseInfo.COUNTRY_EDITION;

    private int[] databaseSegments;
    private int recordLength;

    private int dboptions;
    private byte[] dbbuffer;
    private byte[] index_cache;
    private long mtime;
    private static final int COUNTRY_BEGIN = 16776960;
    private static final int STATE_BEGIN_REV0 = 16700000;
    private static final int STATE_BEGIN_REV1 = 16000000;
    private static final int STRUCTURE_INFO_MAX_SIZE = 20;
    public static final int GEOIP_STANDARD = 0;
    public static final int GEOIP_MEMORY_CACHE = 1;
    public static final int GEOIP_CHECK_CACHE = 2;
    public static final int GEOIP_INDEX_CACHE = 4;
    public static final int GEOIP_UNKNOWN_SPEED = 0;
    public static final int GEOIP_DIALUP_SPEED = 1;
    public static final int GEOIP_CABLEDSL_SPEED = 2;
    public static final int GEOIP_CORPORATE_SPEED = 3;

    private static final int SEGMENT_RECORD_LENGTH = 3;
    private static final int STANDARD_RECORD_LENGTH = 3;
    private static final int ORG_RECORD_LENGTH = 4;
    private static final int MAX_RECORD_LENGTH = 4;

    private static final int FULL_RECORD_LENGTH = 60;

    private static final String[] countryCode = { "--", "AP", "EU", "AD", "AE",
        "AF", "AG", "AI", "AL", "AM", "CW", "AO", "AQ", "AR", "AS", "AT",
        "AU", "AW", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI",
        "BJ", "BM", "BN", "BO", "BR", "BS", "BT", "BV", "BW", "BY", "BZ",
        "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN",
        "CO", "CR", "CU", "CV", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM",
        "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ",
        "FK", "FM", "FO", "FR", "SX", "GA", "GB", "GD", "GE", "GF", "GH",
        "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW",
        "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IN",
        "IO", "IQ", "IR", "IS", "IT", "JM", "JO", "JP", "KE", "KG", "KH",
        "KI", "KM", "KN", "KP", "KR", "KW", "KY", "KZ", "LA", "LB", "LC",
        "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD",
        "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS",
        "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF",
        "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE",
        "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW",
        "PY", "QA", "RE", "RO", "RU", "RW", "SA", "SB", "SC", "SD", "SE",
        "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "ST",
        "SV", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TM",
        "TN", "TO", "TL", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM",
        "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF",
        "WS", "YE", "YT", "RS", "ZA", "ZM", "ME", "ZW", "A1", "A2", "O1",
        "AX", "GG", "IM", "JE", "BL", "MF", "BQ", "SS", "O1" };

    private static final String[] countryName = { "N/A", "Asia/Pacific Region",
        "Europe", "Andorra", "United Arab Emirates", "Afghanistan",
        "Antigua and Barbuda", "Anguilla", "Albania", "Armenia", "Curacao",
        "Angola", "Antarctica", "Argentina", "American Samoa", "Austria",
        "Australia", "Aruba", "Azerbaijan", "Bosnia and Herzegovina",
        "Barbados", "Bangladesh", "Belgium", "Burkina Faso", "Bulgaria",
        "Bahrain", "Burundi", "Benin", "Bermuda", "Brunei Darussalam",
        "Bolivia", "Brazil", "Bahamas", "Bhutan", "Bouvet Island",
        "Botswana", "Belarus", "Belize", "Canada",
        "Cocos (Keeling) Islands", "Congo, The Democratic Republic of the",
        "Central African Republic", "Congo", "Switzerland",
        "Cote D'Ivoire", "Cook Islands", "Chile", "Cameroon", "China",
        "Colombia", "Costa Rica", "Cuba", "Cape Verde", "Christmas Island",
        "Cyprus", "Czech Republic", "Germany", "Djibouti", "Denmark",
        "Dominica", "Dominican Republic", "Algeria", "Ecuador", "Estonia",
        "Egypt", "Western Sahara", "Eritrea", "Spain", "Ethiopia",
        "Finland", "Fiji", "Falkland Islands (Malvinas)",
        "Micronesia, Federated States of", "Faroe Islands", "France",
        "Sint Maarten (Dutch part)", "Gabon", "United Kingdom", "Grenada",
        "Georgia", "French Guiana", "Ghana", "Gibraltar", "Greenland",
        "Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece",
        "South Georgia and the South Sandwich Islands", "Guatemala",
        "Guam", "Guinea-Bissau", "Guyana", "Hong Kong",
        "Heard Island and McDonald Islands", "Honduras", "Croatia",
        "Haiti", "Hungary", "Indonesia", "Ireland", "Israel", "India",
        "British Indian Ocean Territory", "Iraq",
        "Iran, Islamic Republic of", "Iceland", "Italy", "Jamaica",
        "Jordan", "Japan", "Kenya", "Kyrgyzstan", "Cambodia", "Kiribati",
        "Comoros", "Saint Kitts and Nevis",
        "Korea, Democratic People's Republic of", "Korea, Republic of",
        "Kuwait", "Cayman Islands", "Kazakhstan",
        "Lao People's Democratic Republic", "Lebanon", "Saint Lucia",
        "Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Lithuania",
        "Luxembourg", "Latvia", "Libya", "Morocco", "Monaco",
        "Moldova, Republic of", "Madagascar", "Marshall Islands",
        "Macedonia", "Mali", "Myanmar", "Mongolia", "Macau",
        "Northern Mariana Islands", "Martinique", "Mauritania",
        "Montserrat", "Malta", "Mauritius", "Maldives", "Malawi", "Mexico",
        "Malaysia", "Mozambique", "Namibia", "New Caledonia", "Niger",
        "Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway",
        "Nepal", "Nauru", "Niue", "New Zealand", "Oman", "Panama", "Peru",
        "French Polynesia", "Papua New Guinea", "Philippines", "Pakistan",
        "Poland", "Saint Pierre and Miquelon", "Pitcairn Islands",
        "Puerto Rico", "Palestinian Territory", "Portugal", "Palau",
        "Paraguay", "Qatar", "Reunion", "Romania", "Russian Federation",
        "Rwanda", "Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan",
        "Sweden", "Singapore", "Saint Helena", "Slovenia",
        "Svalbard and Jan Mayen", "Slovakia", "Sierra Leone", "San Marino",
        "Senegal", "Somalia", "Suriname", "Sao Tome and Principe",
        "El Salvador", "Syrian Arab Republic", "Swaziland",
        "Turks and Caicos Islands", "Chad", "French Southern Territories",
        "Togo", "Thailand", "Tajikistan", "Tokelau", "Turkmenistan",
        "Tunisia", "Tonga", "Timor-Leste", "Turkey", "Trinidad and Tobago",
        "Tuvalu", "Taiwan", "Tanzania, United Republic of", "Ukraine",
        "Uganda", "United States Minor Outlying Islands", "United States",
        "Uruguay", "Uzbekistan", "Holy See (Vatican City State)",
        "Saint Vincent and the Grenadines", "Venezuela",
        "Virgin Islands, British", "Virgin Islands, U.S.", "Vietnam",
        "Vanuatu", "Wallis and Futuna", "Samoa", "Yemen", "Mayotte",
        "Serbia", "South Africa", "Zambia", "Montenegro", "Zimbabwe",
        "Anonymous Proxy", "Satellite Provider", "Other", "Aland Islands",
        "Guernsey", "Isle of Man", "Jersey", "Saint Barthelemy",
        "Saint Martin", "Bonaire, Saint Eustatius and Saba", "South Sudan",
        "Other" };

    /* init the hashmap once at startup time */
    static {
        if (countryCode.length != countryName.length) {
            throw new AssertionError("countryCode.length!=countryName.length");
        }
    }

    /**
     * Create a new lookup service using the specified database file.
     *
     * @param databaseFile
     *            the database file.
     * @param options
     *            database flags to use when opening the database GEOIP_STANDARD
     *            read database from disk GEOIP_MEMORY_CACHE cache the database
     *            in RAM and read it from RAM
     * @throws IOException
     *             if an error occured creating the lookup service from the
     *             database file.
     */

    public LookupService(File databaseFile, int options) throws IOException {
        this.databaseFile = databaseFile;
        if (databaseFile.isFile())
            file = new RandomAccessFile(databaseFile, "r");
        dboptions = options;
        init();
    }

    /**
     * Reads meta-data from the database file.
     *
     * @throws IOException
     *             if an error occurs reading from the database file.
     */
    private synchronized void init() throws IOException {

    }

    /**
     * Closes the lookup service.
     */
    public synchronized void close() {
        try {
            if (file != null) {
                file.close();
            }
            file = null;
        } catch (IOException e) {
            // Here for backward compatibility.
        }
    }

    synchronized void _check_mtime() {

    }

    public IPLocation getLocation(InetAddress addr) {
        if (!this.databaseFile.isFile()) {
            return getEmpty();
        }
        return getLocation(bytesToLong(addr.getAddress()));
    }

    public IPLocation getLocation(String str) {

        return null;
    }

    private synchronized IPLocation getLocation(long ipnum) {

        return null;
    }

    private static IPLocation getEmpty() {
        return null;
    }

    private IPLocation readCityRecord(int seekCountry) throws IOException {

        return null;
    }

    private ByteBuffer readRecordBuf(int seek, int maxLength) throws IOException {

        return null;
    }

    private String readString(ByteBuffer buffer) throws CharacterCodingException {

        return null;
    }

    /**
     * Finds the country index value given an IP address.
     *
     * @param ipAddress
     *            the ip address to find in long format.
     * @return the country index.
     */
    private synchronized int seekCountry(long ipAddress) {

        return 0;
    }

    private void readNode(byte[] buf, int[] x, int offset) {

    }

    /**
     * Returns the long version of an IP address given an InetAddress object.
     *
     * @param address
     *            the InetAddress.
     * @return the long form of the IP address.
     */
    private static long bytesToLong(byte[] address) {
        long ipnum = 0;
        return ipnum;
    }

    private static int unsignedByteToInt(byte b) {
        return (int) b & 0xFF;
    }
}