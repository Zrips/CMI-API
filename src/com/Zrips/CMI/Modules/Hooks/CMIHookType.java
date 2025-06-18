package com.Zrips.CMI.Modules.Hooks;

import org.bukkit.plugin.Plugin;

public enum CMIHookType {
    CMILib, BlueMap, AureliumSkills, AuraSkills, DiscordSRV, dynmap, Towny, mcMMO, Jobs, Vault, LWC, VaultPermissions("Vault"), PlayerVaults(false), PlaceholderAPI, MVdWPlaceholderAPI, Votifier, Citizens,
    NoCheatPlus, ProtocolLib;

    private boolean present = false;
    private boolean enabled = false;
    private boolean showFoundMsg = true;
    private String targetPlugin = null;
    private CMIHookSubType subType = null;

    CMIHookType() {
    }

    CMIHookType(boolean showFoundMsg) {
    }

    CMIHookType(String targetPlugin) {
    }

    public Plugin getPlugin() {
        return null;
    }

    private static void setPresent(CMIHookType type) {
    }

    private static void message(CMIHookType type) {
    }

    public void init() {
    }

    private void updateEnabled() {
    }

    public void update() {
    }

    public boolean isPresent() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setPresent(boolean present) {
    }

    public void setEnabled(boolean loaded) {
    }

    public CMIHookSubType getSubType() {
        return null;
    }

    public boolean hasSubType() {
        return false;
    }

    public void setSubType(CMIHookSubType subType) {
    }

    public boolean isShowFoundMessage() {
        return false;
    }
}
