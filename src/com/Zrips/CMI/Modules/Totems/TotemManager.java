package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class TotemManager {
    private HashMap<UUID, TotemBossBar> totem;
    CMI plugin;
    private boolean TotemRemoveFromInventory;
    private boolean TotemRequirePermission;
    private boolean TotemCooldownUse;
    private boolean TotemWarmupUse;
    private boolean TotemProtectFromVoid;
    private int TotemCooldownTime;
    private int TotemWarmupTime;
    private int TotemEffectRegeneration;
    private int TotemEffectFireResistance;
    private int TotemEffectAbsorbtion;
    private List<String> blackListedWorlds;
    private List<String> fullDisableInWorlds;

    public TotemManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public boolean isTotemRemoveFromInventory() {
        return false;
    }

    public boolean isTotemRequirePermission() {
        return false;
    }

    public boolean isTotemCooldownUse() {
        return false;
    }

    public boolean isTotemWarmupUse() {
        return false;
    }

    public int getTotemCooldownTime() {
        return 0;
    }

    public int getTotemWarmupTime() {
        return 0;
    }

    public boolean isTotemProtectFromVoid() {
        return false;
    }

    public void hideAllBars() {
    }

    public boolean isOnCd(Player player) {
        return false;
    }

    public boolean isOnWarmup(Player player) {
        return false;
    }

    public TotemBossBar getBossBar(Player player) {
        return null;
    }

    @Deprecated
    public TotemBossBar getBossBar(Player player, BossBarType type) {
        return null;
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
        return false;
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
        return null;
    }

    private Long getLeftCd(Long usedOn, int cd) {
        return null;
    }

    private static double getLeftCdPercentage(Long usedOn, int cd) {
        return 0.0;
    }

    public void checkAllForTotemCd() {
    }

    public int getRegenerationDuration() {
        return 0;
    }

    public int getFireResistanceDuration() {
        return 0;
    }

    public int getAbsorbtionDuration() {
        return 0;
    }

    public List<String> getBlackListedWorlds() {
        return null;
    }

    public boolean isBlackListedWorld(World world) {
        return false;
    }

    public boolean isBlackListedWorld(String worldName) {
        return false;
    }

    public List<String> getFullDisableInWorlds() {
        return null;
    }

    public boolean isFullDisableInWorlds(World world) {
        return false;
    }

    public boolean isFullDisableInWorlds(String worldName) {
        return false;
    }

    public enum BossBarType {
        Cooldown, Warmup;
    }
}
