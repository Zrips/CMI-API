package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIPvEEndEventAsync;
import com.Zrips.CMI.events.CMIPvEStartEventAsync;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;
import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.Container.CMIList;
import net.Zrips.CMILib.Entities.CMIEntitySubType;
import net.Zrips.CMILib.Entities.CMIEntityType;
import net.Zrips.CMILib.Entities.MobHeadInfo;

public class PlayerCombatManager {

    private Set<UUID> playerCombat = new HashSet<UUID>();
    private Set<UUID> entityCombat = new HashSet<UUID>();
    private HashMap<EntityType, EntityHeadDrop> entityHeadDropChance = new HashMap<EntityType, EntityHeadDrop>();
    private HashMap<Integer, Double> lootMobBonus = new HashMap<Integer, Double>();
    private HashMap<Integer, Double> lootPlayerBonus = new HashMap<Integer, Double>();

    private CMI plugin;
    private boolean dropHead = false;
    private boolean IncludeVictim = false;
    private boolean PlayerShowBossBar = false;
    private boolean MobShowBossBar = false;
    private boolean PDisableFlight = false;
    private boolean PDisableFallDamage = false;
    private boolean MDisableFallDamage = false;
    private boolean MDisableFlight = false;
    private boolean PlayerBlockCommands = false;
    private List<String> playerWorlds = new ArrayList<String>();
    private boolean MobBlockCommands = false;
    private List<String> PlayerAllowedCommands = new ArrayList<String>();
    private List<String> MobAllowedCommands = new ArrayList<String>();

    private boolean PlayerMakeBlackList = false;
    private boolean MobMakeBlackList = false;

    private boolean pvpNoGodDamage = false;
    private boolean pvpNoGodDamageInform = false;
    private boolean pveNoGodDamage = false;
    private boolean pveNoGodDamageInform = false;
    private boolean safeZoneDamage = false;
    private boolean dropEntityHead = false;
    private double DropHeadPercentage = 1D;
    private List<String> mobWorlds = new ArrayList<String>();
    private double LowerChanceWithEachKill = 50D;
    private int CombatTimer = 15;

    Pattern lorePattern = Pattern.compile("(lore\\{(\"|'))(.+)((\"|')\\})");

    public PlayerCombatManager(CMI plugin) {
	this.plugin = plugin;
	tasker();
    }

    private int sched = -1;

    public void stop() {
	if (sched != -1) {
	    Bukkit.getScheduler().cancelTask(sched);
	    sched = -1;
	}
    }

    public void loadConfig() {

    }

    public void loadHeads() {
	

    }

    public void removePlayerFromCombat(CMIUser user) {
	
    }

    public void addPlayerIntoCombat(CMIUser user) {
	
    }

    public void addPlayerIntoMobCombat(CMIUser user) {
	
    }

    private void tasker() {
	
    }

    public Boolean isDropPlayerHead() {
	return dropHead;
    }

    public Boolean isDropEntityHead() {
	return dropEntityHead;
    }

    public double getLowerChanceWithEachKill() {
	return LowerChanceWithEachKill;
    }

    public double getPlayerDropHeadPercentage() {
	return DropHeadPercentage;
    }

    public double getEntityDropHeadPercentage(EntityType type) {
	EntityHeadDrop c = entityHeadDropChance.get(type);
	return c == null ? 0D : c.getBaseDropChance();
    }

    public double getEntityHeadDropChanceLowering(EntityType type) {
	EntityHeadDrop c = entityHeadDropChance.get(type);
	return c == null ? 0D : c.getBaseLowerAmount();
    }

    @Deprecated
    public ItemStack tryToGetEntityHead(EntityType type) {
	EntityHeadDrop c = entityHeadDropChance.get(type);
	return c == null ? null : c.getHead();
    }

//    public ItemStack tryToGetEntityHead(Entity ent) {
//	return tryToGetEntityHead(null, ent);
//    }

    public ItemStack tryToGetEntityHead(Player player, Entity ent) {
	EntityHeadDrop c = entityHeadDropChance.get(ent.getType());
	return c == null ? null : c.getHead(player, ent);
    }

    public HashMap<EntityType, EntityHeadDrop> getEntityHeadDropChance() {
	return entityHeadDropChance;
    }

    public int getCombatTimer() {
	return CombatTimer;
    }

    public void setCombatTimer(int combatTimer) {
	CombatTimer = combatTimer;
    }

    public Boolean isIncludeVictim() {
	return IncludeVictim;
    }

    public HashMap<Integer, Double> getLootMobBonus() {
	return lootMobBonus;
    }

    public HashMap<Integer, Double> getLootPlayerBonus() {
	return lootPlayerBonus;
    }

    public Boolean isPVPNoGodDamage() {
	return pvpNoGodDamage;
    }

    public Boolean isPVPNoGodDamageInform() {
	return pvpNoGodDamageInform;
    }

    public Boolean isPVENoGodDamage() {
	return pveNoGodDamage;
    }

    public Boolean isPVENoGodDamageInform() {
	return pveNoGodDamageInform;
    }
    
    public Boolean isPDisableFlight() {
	return PDisableFlight;
    }

    public Boolean isMDisableFlight() {
	return MDisableFlight;
    }

    public boolean isAllowedPlayerCommand(String command) {
	for (String one : PlayerAllowedCommands) {
	    if (command.equalsIgnoreCase(one.toLowerCase()) || command.startsWith(one.toLowerCase() + " ")) {
		return !PlayerMakeBlackList;
	    }
	}
	return PlayerMakeBlackList;
    }

    public boolean isAllowedMobCommand(String command) {
	for (String one : MobAllowedCommands) {
	    if (command.equalsIgnoreCase(one.toLowerCase()) || command.startsWith(one.toLowerCase() + " ")) {
		return !MobMakeBlackList;
	    }
	}
	return MobMakeBlackList;
    }

    public boolean isPlayerShowBossBar() {
	return PlayerShowBossBar;
    }

    public boolean isMobShowBossBar() {
	return MobShowBossBar;
    }

    public boolean isPlayerBlockCommands() {
	return PlayerBlockCommands;
    }

    public boolean isMobBlockCommands() {
	return MobBlockCommands;
    }

    public boolean isPDisableFallDamage() {
	return PDisableFallDamage;
    }

    public boolean isMDisableFallDamage() {
	return MDisableFallDamage;
    }

    public List<String> getMobWorlds() {
	return mobWorlds;
    }

    public List<String> getPlayerWorlds() {
	return playerWorlds;
    }

    public boolean isSafeZoneDamage() {
	return safeZoneDamage;
    }

}
