package com.Zrips.CMI.Modules.Skin;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.mojang.authlib.GameProfile;

public class SkinManager {
    public HashMap<UUID, CMISkin> skinCacheByUUID;
    public HashMap<String, CMISkin> skinCacheByName;
    CMI plugin;
    private boolean SteveOnOff;
    private boolean AutoApply;
    private boolean RequireSpecificPerm;
    private long SkinUpdateTimer;
    private long SkinRequestFrequency;
    Long lastUpdateRequest;
    boolean saving;
    private String fileName;

    public SkinManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void removeSkinFromCache(String playerName) {
    }

    public boolean applySkin(Player player, String playerName) {
        return false;
    }

    public boolean applySkin(Player player, UUID uuid) {
        return false;
    }

    public boolean setSkin(GameProfile profile, UUID uuid) {
        return false;
    }

    private boolean checkCache(GameProfile profile, UUID uuid) {
        return false;
    }

    public CMISkin getSkin(String name) {
        return null;
    }

    public void save(CMISkin skin) {
    }

    public void load() {
    }

    public boolean isSteveOnOff() {
        return false;
    }

    public void setSteveOnOff(boolean steveOnOff) {
    }

    public boolean isRequireSpecificPerm() {
        return false;
    }

    public void setRequireSpecificPerm(boolean requireSpecificPerm) {
    }

    public boolean isAutoApply() {
        return false;
    }
}
