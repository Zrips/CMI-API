/**
 * DatabaseInfo.java
 *
 * Copyright (C) 2003 MaxMind LLC.  All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.Zrips.CMI.Modules.GeoIP;

/**
 * Encapsulates metadata about the GeoIP database. The database has a date, is a
 * premium or standard version, and is one of the following types:
 *
 * <ul>
 * <li>Country edition -- this is the most common version of the database. It
 * includes the name of the country and it's ISO country code given an IP
 * address.
 * <li>Region edition -- includes the country information as well as what U.S.
 * state or Canadian province the IP address is from if the IP address is from
 * the U.S. or Canada.
 * <li>City edition -- includes country, region, city, postal code, latitude,
 * and longitude information.
 * <li>Org edition -- includes netblock owner.
 * <li>ISP edition -- ISP information.
 * </ul>
 *
 * @see com.maxmind.geoip.LookupService#getDatabaseInfo()
 * @author Matt Tucker
 */
public class DatabaseInfo {

    public static final int COUNTRY_EDITION = 1;
    public static final int REGION_EDITION_REV0 = 7;
    public static final int REGION_EDITION_REV1 = 3;
    public static final int CITY_EDITION_REV0 = 6;
    public static final int CITY_EDITION_REV1 = 2;
    public static final int ORG_EDITION = 5;
    public static final int ISP_EDITION = 4;
    public static final int PROXY_EDITION = 8;
    public static final int ASNUM_EDITION = 9;
    public static final int NETSPEED_EDITION = 10;
    public static final int DOMAIN_EDITION = 11;
    public static final int COUNTRY_EDITION_V6 = 12;
    public static final int ASNUM_EDITION_V6 = 21;
    public static final int ISP_EDITION_V6 = 22;
    public static final int ORG_EDITION_V6 = 23;
    public static final int DOMAIN_EDITION_V6 = 24;
    public static final int CITY_EDITION_REV1_V6 = 30;
    public static final int CITY_EDITION_REV0_V6 = 31;
    public static final int NETSPEED_EDITION_REV1 = 32;
    public static final int NETSPEED_EDITION_REV1_V6 = 33;
}