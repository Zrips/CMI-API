package com.Zrips.CMI.utils;

import java.util.List;

import javax.crypto.Cipher;

public class CMIEncoder {
    static Cipher encryptor;
    static Cipher decryptor;
    private final static String fineName = "security.key";

    public static void initialize() {

    }

    public static String encode(String str) {

        return null;
    }

    public static boolean isEncoded(String str) {
        return true;
    }

    public static String decode(String str) {
        return null;
    }

    public static List<String> encode(List<String> str) {
        return null;
    }

    @Deprecated
    public static List<String> decode2(List<String> str) {
        return decodeList(str);
    }

    public static List<String> decodeList(List<String> str) {
        return null;
    }
}
