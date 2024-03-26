package com.Zrips.CMI.utils;

import java.util.Base64;
import java.util.Base64.Decoder;
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
        try {
            Decoder ed = Base64.getDecoder();
            ed.decode(str);
            return true;
        } catch (Exception | Error e) {
            return false;
        }
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
