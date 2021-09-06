package com.Zrips.CMI.utils;

import java.security.Security;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.UUID;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Config;
import net.Zrips.CMILib.FileHandler.ConfigReader;

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

    public static List<String> decode2(List<String> str) {
	return null;
    }
}
