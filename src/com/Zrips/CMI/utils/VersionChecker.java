package com.Zrips.CMI.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;

public class VersionChecker {
    private int resource = 3742;

    private CMI plugin;
    private Version version = Version.v1_11_R1;

    public VersionChecker(CMI plugin) {
    }

    public Version getVersion() {
	return version;
    }

    public Integer convertVersion(String v) {
	return null;
    }

    public enum Version {
	v1_7_R1(171, "v1_7"),
	v1_7_R2(172, "v1_7"),
	v1_7_R3(173, "v1_7"),
	v1_7_R4(174, "v1_7"),
	v1_8_R1(181, "v1_8"),
	v1_8_R2(182, "v1_8"),
	v1_8_R3(183, "v1_8"),
	v1_9_R1(191, "v1_9"),
	v1_9_R2(192, "v1_9"),
	v1_10_R1(1101, "v1_10"),
	v1_11_R1(1111, "v1_11"),
	v1_11_R2(1112, "v1_11"),
	v1_12_R1(1121, "v1_12"),
	v1_12_R2(1122, "v1_12"),
	v1_13_R1(1131, "v1_13"),
	v1_13_R2(1132, "v1_13");

	private Integer value;
	private String shortVersion;

	Version(Integer value, String ShortVersion) {
	    this.value = value;
	    shortVersion = ShortVersion;
	}

	public Integer getValue() {
	    return value;
	}

	public String getShortVersion() {
	    return shortVersion;
	}

	public static Version getCurrent() {
	    return null;
	}

	public boolean isLower(Version version) {
	    return getValue() < version.getValue();
	}

	public boolean isHigher(Version version) {
	    return getValue() > version.getValue();
	}
    }

    public void VersionCheck(final Player player) {
    }

    public String getOfficialVersion() {
	return null;
    }

    public void recVersion() {

    }

}
