package com.Zrips.CMI.Modules.Skin;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.mojang.authlib.GameProfile;

public class SkinManager {
    public HashMap<UUID, CMISkin> skinCacheByUUID = new HashMap<UUID, CMISkin>();
    public HashMap<String, CMISkin> skinCacheByName = new HashMap<String, CMISkin>();

    CMI plugin;
//    private boolean Enabled = true;
    private boolean SteveOnOff = true;
    private boolean AutoApply = false;
    private boolean RequireSpecificPerm = false;
    private long SkinUpdateTimer = 60;
    private long SkinRequestFrequency = 60;

    public SkinManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {

    }

    public void removeSkinFromCache(String playerName) {
        CMISkin skin = skinCacheByName.remove(playerName);
        if (skin != null)
            skinCacheByUUID.remove(skin.getUuid());
    }

    public boolean applySkin(Player player, String playerName) {
        return false;
    }

    public boolean applySkin(final Player player, UUID uuid) {

        return false;
    }

    Long lastUpdateRequest = 0L;

    public boolean setSkin(GameProfile profile, UUID uuid) {

        return false;
    }

    private boolean checkCache(GameProfile profile, UUID uuid) {
        return false;
    }

    public CMISkin getSkin(String name) {

        return null;
    }

    boolean saving = false;

    public void save(CMISkin skin) {

    }

    private String fileName = "SkinsCache.yml";

    public void load() {

    }

    public boolean isSteveOnOff() {
        return SteveOnOff;
    }

    public void setSteveOnOff(boolean steveOnOff) {
        SteveOnOff = steveOnOff;
    }

    public boolean isRequireSpecificPerm() {
        return RequireSpecificPerm;
    }

    public void setRequireSpecificPerm(boolean requireSpecificPerm) {
        RequireSpecificPerm = requireSpecificPerm;
    }

    public boolean isAutoApply() {
        return AutoApply;
    }

}
