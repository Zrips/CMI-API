package com.Zrips.CMI.utils;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class VersionChecker {
    private int resource = 3742;

    private CMI plugin;

    public VersionChecker(CMI plugin) {
        this.plugin = plugin;
    }

    public Integer convertVersion(String v) {

        return null;
    }

    public String deconvertVersion(Integer v) {

        return null;
    }

    public void VersionCheck(final Player player) {

    }

    public String getOfficialVersion() {
        return getOfficialVersion(resource);
    }

    public String getOfficialVersion(int resource) {

        return null;
    }

    public static String s1 = "%%__USER__%%";
    public static String s2 = "%%__RESOURCE__%%";
    public static String s3 = "%%__NONCE__%%";

}
