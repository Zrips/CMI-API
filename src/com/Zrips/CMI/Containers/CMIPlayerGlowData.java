package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.ChatColor;

public class CMIPlayerGlowData {
    private ChatColor glow;
    private static HashMap<UUID, CMIPlayerGlowData> glowData;

    public CMIPlayerGlowData(ChatColor glow) {
    }

    public ChatColor getGlow() {
        return null;
    }

    public void setGlow(ChatColor glow) {
    }

    public static ChatColor getGlow(UUID uuid) {
        return null;
    }

    public static void setGlow(UUID uuid, ChatColor glow) {
    }

    public static void applyGlow(UUID uuid) {
    }
}
