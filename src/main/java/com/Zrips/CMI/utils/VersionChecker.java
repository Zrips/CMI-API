package com.Zrips.CMI.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.commands.CommandsHandler;

public class VersionChecker {
    private int resource = 3742;

    private CMI plugin;

    public VersionChecker(CMI plugin) {
    }

    @Deprecated
    public Version getVersion() {
	return Version.getCurrent();
    }

    public Integer convertVersion(String v) {
	return null;
    }

    public enum Version {
	v1_7_R1,
	v1_7_R2,
	v1_7_R3,
	v1_7_R4,
	v1_8_R1,
	v1_8_R2,
	v1_8_R3,
	v1_9_R1,
	v1_9_R2,
	v1_10_R1,
	v1_11_R1,
	v1_12_R1,
	v1_13_R1,
	v1_13_R2,
	v1_13_R3,
	v1_14_R1,
	v1_14_R2,
	v1_15_R1,
	v1_15_R2,
	v1_16_R1,
	v1_16_R2,
	v1_17_R1,
	v1_17_R2,
	v1_18_R1,
	v1_18_R2,
	v1_19_R1,
	v1_19_R2,
	v1_20_R1,
	v1_20_R2;

	private Integer value;
	private String shortVersion;
	private static Version current = null;

	Version() {
	    try {
		this.value = Integer.valueOf(this.name().replaceAll("[^\\d.]", ""));
	    } catch (Exception e) {
	    }
	    shortVersion = this.name().substring(0, this.name().length() - 3);
	}

	public Integer getValue() {
	    return value;
	}

	public String getShortVersion() {
	    return shortVersion;
	}

	public String getShortFormated() {
	    return shortVersion.replace("v", "").replace("_", ".") + ".x";
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

	public boolean isEqualOrLower(Version version) {
	    return getValue() <= version.getValue();
	}

	public boolean isEqualOrHigher(Version version) {
	    return getValue() >= version.getValue();
	}

	public static boolean isCurrentEqualOrHigher(Version v) {
	    return current.getValue() >= v.getValue();
	}

	public static boolean isCurrentHigher(Version v) {
	    return current.getValue() > v.getValue();
	}

	public static boolean isCurrentLower(Version v) {
	    return current.getValue() < v.getValue();
	}

	public static boolean isCurrentEqualOrLower(Version v) {
	    return current.getValue() <= v.getValue();
	}

	public static boolean isCurrentEqual(Version v) {
	    return current.getValue() == v.getValue();
	}
    }

    public void recVersion() {
    }

    public void VersionCheck(final Player player) {
    }

    public String getOfficialVersion() {

	return null;
    }
}
