package com.Zrips.CMI.Modules.Vanish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import net.Zrips.CMILib.Locale.LC;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.SilentChest.silentChestListener;
import com.Zrips.CMI.commands.list.vanishedit.VanishAction;
import com.Zrips.CMI.events.CMIPlayerUnVanishEvent;
import com.Zrips.CMI.events.CMIPlayerVanishEvent;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Version;

public class VanishManager {

    private CMI plugin;

    Set<UUID> vanishedOnlineList = new HashSet<UUID>();
    Set<UUID> vanishedList = new HashSet<UUID>();

    public VanishManager(CMI plugin) {
	this.plugin = plugin;
    }

    public Set<UUID> getAllVanished() {
	return vanishedList;
    }

    public void addPlayer(CMIUser user) {
	if (user == null)
	    return;
	addPlayer(user.getUniqueId());
    }

    public void addPlayer(Player player) {
	if (player == null)
	    return;
	addPlayer(player.getUniqueId());
    }

    public void addPlayer(UUID uuid) {
    }

    private static final String vanishBossBar = "CMIVanishBossBar";


    public boolean nearActivePlayer(Location loc) {
	

	return false;
    }

    public void applyVanish(CMIUser user) {
	applyVanish(user, true, true);
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent) {
	applyVanish(user, fireUnvanishEvent, true);
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages) {
	
    }

    public static String defaultString = "";

    public void loadConfig() {
    }

    public void hideVanishedPlayersFor(Player player) {
	
    }

    public void hidePlayerForEveryone(Player player) {
    }

    public void removePlayer(CMIUser user) {
    }

    public void removePlayer(Player player) {
    }

    public void removePlayer(UUID uuid) {
	removePlayer(uuid, true);
    }

    public void removePlayer(UUID uuid, boolean showForOthers) {
    }
}
