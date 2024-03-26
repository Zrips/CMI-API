package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class TotemManager {

    private HashMap<UUID, TotemBossBar> totem = new HashMap<UUID, TotemBossBar>();
    CMI plugin;

    private boolean TotemRemoveFromInventory = false;
    private boolean TotemCooldownUse = false;
    private boolean TotemWarmupUse = false;
    private boolean TotemProtectFromVoid = false;
    private int TotemCooldownTime = -1;
    private int TotemWarmupTime = -1;

    private int TotemEffectRegeneration = -1;
    private int TotemEffectFireResistance = -1;
    private int TotemEffectAbsorbtion = -1;

    public enum BossBarType {
        Cooldown, Warmup
    }

    public TotemManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {

    }

    public boolean isTotemRemoveFromInventory() {
        return TotemRemoveFromInventory;
    }

    public boolean isTotemCooldownUse() {
        return TotemCooldownUse;
    }

    public boolean isTotemWarmupUse() {
        return TotemWarmupUse;
    }

    public int getTotemCooldownTime() {
        return TotemCooldownTime;
    }

    public int getTotemWarmupTime() {
        return TotemWarmupTime;
    }

    public boolean isTotemProtectFromVoid() {
        return TotemProtectFromVoid;
    }

    public void hideAllBars() {
    }

    public boolean isOnCd(Player player) {
        return false;
    }

    public boolean isOnWarmup(Player player) {
        TotemBossBar tbar = totem.get(player.getUniqueId());
        if (tbar == null)
            return false;
        return tbar.getType() == BossBarType.Warmup;
    }

    public TotemBossBar getBossBar(Player player) {
        return null;
    }

    @Deprecated
    public TotemBossBar getBossBar(Player player, BossBarType type) {
        return getBossBar(player.getUniqueId(), type);
    }

    public TotemBossBar getBossBar(UUID uuid, BossBarType type) {
        return null;
    }

    public void addCooldownPlayer(Player player) {
    }

    public void addWarmupPlayer(Player player) {
    }

    public void showWarmupEffect(Player player) {
    }

    public void stopWarmupEffect(Player player) {
    }

    @Deprecated
    public boolean toggleBar(Player player) {
        return false;
    }

    public boolean toggleBar(CMIUser user, Boolean state) {
        return true;
    }

    public void removePlayer(Player player, BossBarType type) {
    }

    public synchronized void ShowTotemWarmup(Player player) {

    }

    @Deprecated
    public synchronized void ShowTotemCooldown(Player player) {
    }

    public synchronized void ShowTotemCooldown(CMIUser user) {

    }

    public Long getLeftCd(Player player, int cd) {
        CMIUser user = plugin.getPlayerManager().getUser(player);
        if (user == null)
            return 0L;
        Long usedOn = user.getTotemCooldown();
        return getLeftCd(usedOn, cd);
    }

    private Long getLeftCd(Long usedOn, int cd) {
        long t = (((cd * 1000) + usedOn) - System.currentTimeMillis());
        if (t < 0)
            t = 0L;
        return t;
    }

    private static double getLeftCdPercentage(Long usedOn, int cd) {
        double t = (((cd * 1000D) + usedOn) - System.currentTimeMillis()) / (cd * 1000D);
        if (t < 0D)
            t = 0D;
        if (t > 1D)
            t = 1D;
        return t;
    }

    public void checkAllForTotemCd() {
    }

    public int getRegenerationDuration() {
        return TotemEffectRegeneration;
    }

    public int getFireResistanceDuration() {
        return TotemEffectFireResistance;
    }

    public int getAbsorbtionDuration() {
        return TotemEffectAbsorbtion;
    }
}
