package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.ChatColor;

public class CMINamePlate {
    private static HashMap<UUID, CMINamePlate> namePlates;
    private String namePlatePrefix;
    private String namePlateSuffix;
    private ChatColor namePlateNameColor;

    public String getNamePlatePrefix() {
        return null;
    }

    public void setNamePlatePrefix(String namePlatePrefix) {
    }

    public String getNamePlateSuffix() {
        return null;
    }

    public void setNamePlateSuffix(String namePlateSuffix) {
    }

    public ChatColor getNamePlateNameColor() {
        return null;
    }

    public void setNamePlateNameColor(ChatColor namePlateNameColor) {
    }

    public boolean isEmptyRecord() {
        return false;
    }

    public static String getNamePlatePrefix(UUID uuid) {
        return null;
    }

    public static void setNamePlatePrefix(UUID uuid, String namePlatePrefix) {
    }

    public static String getNamePlateSuffix(UUID uuid) {
        return null;
    }

    public static void setNamePlateSuffix(UUID uuid, String namePlateSuffix) {
    }

    public static ChatColor getNamePlateNameColor(UUID uuid) {
        return null;
    }

    public static void setNamePlateNameColor(UUID uuid, ChatColor namePlateNameColor) {
    }
}
