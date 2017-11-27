package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;

public class TotemManager {

    private HashMap<UUID, TotemBossBar> totem = new HashMap<UUID, TotemBossBar>();
    CMI plugin;

    public enum BossBarType {
	Cooldown, Warmup
    }

    public TotemManager(CMI plugin) {
	this.plugin = plugin;
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
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user == null)
	    return 0L;
	Long usedOn = user.getTotemCooldown();
	return getLeftCd(usedOn, cd);
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
}
