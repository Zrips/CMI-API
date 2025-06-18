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

public class LookupService {
    private RandomAccessFile file;
    private final File databaseFile = null;
    private static final Charset charset = null;
    private final CharsetDecoder charsetDecoder = null;
    ConcurrentHashMap<String, IPLocation> cache;
    private byte databaseType;
    private int databaseSegments;
    private int recordLength;
    private int dboptions;
    private byte dbbuffer;
    private byte index_cache;
    private long mtime;
    private static final int COUNTRY_BEGIN = 0;
    private static final int STATE_BEGIN_REV0 = 0;
    private static final int STATE_BEGIN_REV1 = 0;
    private static final int STRUCTURE_INFO_MAX_SIZE = 0;
    public static final int GEOIP_STANDARD = 0;
    public static final int GEOIP_MEMORY_CACHE = 0;
    public static final int GEOIP_CHECK_CACHE = 0;
    public static final int GEOIP_INDEX_CACHE = 0;
    public static final int GEOIP_UNKNOWN_SPEED = 0;
    public static final int GEOIP_DIALUP_SPEED = 0;
    public static final int GEOIP_CABLEDSL_SPEED = 0;
    public static final int GEOIP_CORPORATE_SPEED = 0;
    private static final int SEGMENT_RECORD_LENGTH = 0;
    private static final int STANDARD_RECORD_LENGTH = 0;
    private static final int ORG_RECORD_LENGTH = 0;
    private static final int MAX_RECORD_LENGTH = 0;
    private static final int FULL_RECORD_LENGTH = 0;
    private static final String countryCode = null;
    private static final String countryName = null;

    public LookupService(File databaseFile, int options) throws IOException {
    }

    private synchronized void init() throws IOException {
    }

    public synchronized void close() {
    }

    synchronized void _check_mtime() {
    }

    public IPLocation getLocation(InetAddress addr) {
        return null;
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

    private synchronized int seekCountry(long ipAddress) {
        return 0;
    }

    private void readNode(byte[] buf, int[] x, int offset) {
    }

    private static long bytesToLong(byte[] address) {
        return 0;
    }

    private static int unsignedByteToInt(byte b) {
        return 0;
    }
}
