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

    private static final String[] countryCode = { "--" };

    private static final String[] countryName = { "N/A" };

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
        int seekCountry;

        if (!this.databaseFile.isFile()) {
            return getEmpty();
        }

        try {
            seekCountry = seekCountry(ipnum);
            return readCityRecord(seekCountry);
        } catch (IOException e) {
        }

        return getEmpty();
    }

    private static IPLocation getEmpty() {
        IPLocation record = new IPLocation();
        record.setCountryCode("--");
        record.setCountryName("N/A");
        return record;
    }

    private IPLocation readCityRecord(int seekCountry) throws IOException {

        return null;
    }

    private ByteBuffer readRecordBuf(int seek, int maxLength) throws IOException {

        return null;
    }

    private String readString(ByteBuffer buffer) throws CharacterCodingException {
        int start = buffer.position();
        int oldLimit = buffer.limit();

        while (buffer.hasRemaining() && buffer.get() != 0) {
        }

        int end = buffer.position() - 1;
        String str = null;
        if (end > start) {
            buffer.position(start);
            buffer.limit(end);
            str = charsetDecoder.decode(buffer).toString();
            buffer.limit(oldLimit);
        }
        buffer.position(end + 1);
        return str;
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
        for (int i = 0; i < 4; ++i) {
            long y = address[i];
            if (y < 0) {
                y += 256;
            }
            ipnum += y << ((3 - i) * 8);
        }
        return ipnum;
    }

    private static int unsignedByteToInt(byte b) {
        return (int) b & 0xFF;
    }
}