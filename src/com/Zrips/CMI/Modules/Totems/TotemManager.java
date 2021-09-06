package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Time.CMITimeManager;

import net.Zrips.CMILib.Locale.LC;
import com.Zrips.CMI.Modules.Particl.CMIPEAnimationInterface;
import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

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
	TotemBossBar tbar = totem.get(player.getUniqueId());
	if (tbar == null)
	    return false;
	return tbar.getType() == BossBarType.Cooldown;
    }

    public boolean isOnWarmup(Player player) {
	TotemBossBar tbar = totem.get(player.getUniqueId());
	if (tbar == null)
	    return false;
	return tbar.getType() == BossBarType.Warmup;
    }

//    public TotemBossBar getBossBar(Player player, BossBarType type) {
//	return this.totem.get(player.getUniqueId());
//    }

    public TotemBossBar getBossBar(Player player) {
	TotemBossBar tb = this.totem.get(player.getUniqueId());
	if (tb != null)
	    return tb;
	return null;
    }

    @Deprecated
    public TotemBossBar getBossBar(Player player, BossBarType type) {
	return getBossBar(player.getUniqueId(), type);
    }

    public TotemBossBar getBossBar(UUID uuid, BossBarType type) {
	TotemBossBar tb = this.totem.get(uuid);
	if (tb != null && tb.getType() == type)
	    return tb;
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
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user == null)
	    return false;
	return toggleBar(user, null);
    }

    public boolean toggleBar(CMIUser user, Boolean state) {
	return true;
    }

    public void removePlayer(Player player, BossBarType type) {
	TotemBossBar totemBar = getBossBar(player, type);
	if (totemBar == null)
	    return;
	totemBar.getBar().setVisible(false);
	totem.remove(player.getUniqueId());
    }

    public synchronized void ShowTotemWarmup(Player player) {
	
    }

    @Deprecated
    public synchronized void ShowTotemCooldown(Player player) {
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user == null)
	    return;
	ShowTotemCooldown(user);
    }

    public synchronized void ShowTotemCooldown(CMIUser user) {

    }

    public Long getLeftCd(Player player, int cd) {
	
	return null;
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
