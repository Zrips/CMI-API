package com.Zrips.CMI.Modules.Hooks;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public enum CMIHookType {
    CMILib,
    AureliumSkills,
    DiscordSRV,
    dynmap,
    Towny,
    mcMMO,
    Jobs,
    Vault,
    LWC,
    VaultPermissions("Vault"),
    PlayerVaults(false),
    PlaceholderAPI,
    MVdWPlaceholderAPI,
    Votifier,
    Citizens,
    NoCheatPlus,
    ProtocolLib;

    private boolean present = false;
    private boolean enabled = false;

    private boolean showFoundMsg = true;
    private String targetPlugin = null;

    private CMIHookSubType subType = null;

    CMIHookType() {

    }

    CMIHookType(boolean showFoundMsg) {
        this.showFoundMsg = showFoundMsg;
    }

    CMIHookType(String targetPlugin) {
        this.targetPlugin = targetPlugin;
    }

    public Plugin getPlugin() {
        return Bukkit.getPluginManager().getPlugin(this.toString());
    }

    private static void setPresent(CMIHookType type) {
        type.setPresent(true);
        type.setEnabled(CMI.getInstance().getServer().getPluginManager().isPluginEnabled(type.targetPlugin == null ? type.toString() : type.targetPlugin));
    }

    private static void message(CMIHookType type) {
        if (type.isPresent() && type.showFoundMsg) {
            CMI.getInstance().consoleMessage("&f" + (type.getSubType() == null ? type : type.getSubType()).toString() + "&3 found. (Loaded: " + type.isEnabled() + ")");
        }
    }

    public void init() {
        try {
            update();
            if (this.isPresent() && !this.isEnabled()) {
                CMIScheduler.runTaskLater(() -> updateEnabled(), 1);
            }
            message(this);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void updateEnabled() {
        setEnabled(CMI.getInstance().getServer().getPluginManager().isPluginEnabled(targetPlugin == null ? toString() : targetPlugin));
    }

    public void update() {
        if (CMI.getInstance().getServer().getPluginManager().getPlugin(this.toString()) == null)
            return;
        setPresent(this);
    }

    public boolean isPresent() {
        return present;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void setEnabled(boolean loaded) {
        this.enabled = loaded;
    }

    public CMIHookSubType getSubType() {
        return subType;
    }

    public boolean hasSubType() {
        return subType != null;
    }

    public void setSubType(CMIHookSubType subType) {
        this.subType = subType;
    }

    public boolean isShowFoundMessage() {
        return showFoundMsg;
    }
}
