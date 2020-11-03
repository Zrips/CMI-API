package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

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
	    return false;
    }

    public TotemBossBar getBossBar(Player player) {
	return null;
    }

    public TotemBossBar getBossBar(Player player, BossBarType type) {
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

    public boolean toggleBar(Player player) {
	
	return true;
    }

    public void removePlayer(Player player, BossBarType type) {
	
    }

    public synchronized void ShowTotemWarmup(Player player) {
	
    }

    public synchronized void ShowTotemCooldown(Player player) {

    }

    public Long getLeftCd(Player player, int cd) {
	return null;
    }

    private Long getLeftCd(Long usedOn, int cd) {
	return null;
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
