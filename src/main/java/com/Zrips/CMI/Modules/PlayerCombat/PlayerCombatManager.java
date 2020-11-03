package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.CmiItems.CMIEntityType;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;

public class PlayerCombatManager {

    private Set<UUID> playerCombat = new HashSet<UUID>();
    private HashMap<EntityType, EntityHeadDrop> entityHeadDropChance = new HashMap<EntityType, EntityHeadDrop>();
    private HashMap<Integer, Double> lootMobBonus = new HashMap<Integer, Double>();
    private HashMap<Integer, Double> lootPlayerBonus = new HashMap<Integer, Double>();

    private CMI plugin;
    private Boolean dropHead = false;
    private Boolean IncludeVictim = false;
    private Boolean noGodDamage = false;
    private Boolean noGodDamageInform = false;
    private Boolean dropEntityHead = false;
    private double DropHeadPercentage = 1D;
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
	return 0;
    }

    @Deprecated
    public ItemStack tryToGetEntityHead(EntityType type) {
	return null;
    }

    public ItemStack tryToGetEntityHead(Player player, Entity ent) {
	return null;
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

    public Boolean isNoGodDamage() {
	return noGodDamage;
    }

    public Boolean isNoGodDamageInform() {
	return noGodDamageInform;
    }
}
