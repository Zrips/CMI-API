package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PlayerCombatManager {

    private HashMap<CombatDamageType, Set<UUID>> combatMap = new HashMap<CombatDamageType, Set<UUID>>();

    private HashMap<UUID, CMIPlayerCombat> playerCombatMap = new HashMap<UUID, CMIPlayerCombat>();

    private HashMap<UUID, HashMap<UUID, PlayerKillCount>> playerKills = new HashMap<UUID, HashMap<UUID, PlayerKillCount>>();
    private HashMap<UUID, HashMap<EntityType, EntityKillCount>> entityKills = new HashMap<UUID, HashMap<EntityType, EntityKillCount>>();

    private HashMap<EntityType, EntityHeadDrop> entityHeadDropChance = new HashMap<EntityType, EntityHeadDrop>();
    private HashMap<Integer, Double> lootMobBonus = new HashMap<Integer, Double>();
    private HashMap<Integer, Double> lootPlayerBonus = new HashMap<Integer, Double>();

    private CMI plugin;
    private boolean dropHead = false;
    private boolean IncludeVictim = false;
    private boolean PlayerShowBossBar = false;
    private boolean PlayerShowDamageNumbers = false;
    private String PlayerDamageNumbersFormat = "";
    private boolean MobShowBossBar = false;
    private boolean MobIncludeEnvironment = false;
    private boolean MobShowDamageNumbers = false;
    private String MobDamageNumbersFormat = "";
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

    private List<String> PlayerHeadLore = new ArrayList<String>();

    Pattern lorePattern = Pattern.compile("(lore\\{(\"|'))(.+)((\"|')\\})");

    public HashMap<UUID, PlayerKillCount> getKills(UUID uuid) {
        return playerKills.computeIfAbsent(uuid, k -> new HashMap<UUID, PlayerKillCount>());
    }

    public HashMap<EntityType, EntityKillCount> getEntityKills(UUID uuid) {
        return entityKills.computeIfAbsent(uuid, k -> new HashMap<EntityType, EntityKillCount>());
    }

    public PlayerCombatManager(CMI plugin) {
        this.plugin = plugin; 
    }

    public void clearCache(UUID uuid) {
       
    }

    private CMITask sched = null;

    public void stop() {
        if (sched != null) {
            sched.cancel();
            sched = null;
        }
    }

    public void loadConfig() {
 
    }

    private String fileName = "CustomHeads.yml";

    public void loadHeads() {
        
    }

    private Set<UUID> get(CombatDamageType type) {
        return combatMap.get(type);
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

    public List<String> getPlayerHeadLore() {
        return new ArrayList<String>(PlayerHeadLore);
    }

    public void showDamageNumber(Player player, Double damage, Location loc, boolean isPlayer) {
 
    }

    public void show(Player player, String text, Location loc) {
       
    }

    public boolean isPlayerShowDamageNumbers() {
        return PlayerShowDamageNumbers;
    }

    public boolean isMobShowDamageNumbers() {
        return MobShowDamageNumbers;
    }

    public Long getGotLastDamageAt(UUID uuid) {
        CMIPlayerCombat data = playerCombatMap.get(uuid);
        return data == null ? null : data.getGotLastDamageAt();
    }

    private CMIPlayerCombat getCombatRecord(UUID uuid) {
        return playerCombatMap.computeIfAbsent(uuid, k -> new CMIPlayerCombat());
    }

    public void setGotLastDamageAt(UUID uuid, Long gotLastDamageAt) {
        getCombatRecord(uuid).setGotLastDamageAt(gotLastDamageAt);
    }

    public boolean isInCombatWithPlayer(UUID uuid) {
        if (!playerCombatMap.containsKey(uuid))
            return false;
        return playerCombatMap.get(uuid).isInCombatWithPlayer();
    }

    public Long getGotLastDamageFromPlayer(UUID uuid) {
        CMIPlayerCombat data = playerCombatMap.get(uuid);
        return data == null ? 0L : data.getGotLastDamageFromPlayer();
    }

    public void setGotLastDamageFromPlayer(UUID uuid, Long gotLastDamageFromPlayer) {
        if (!isInCombatWithPlayer(uuid))
            addPlayerIntoCombat(CMIUser.getUser(uuid));
        getCombatRecord(uuid).setGotLastDamageFromPlayer(gotLastDamageFromPlayer);
    }

    public void setDidLastDamageToPlayer(UUID uuid, Long didLastDamageToPlayer) {
        if (!isInCombatWithPlayer(uuid))
            addPlayerIntoCombat(CMIUser.getUser(uuid));
        getCombatRecord(uuid).setDidLastDamageToPlayer(didLastDamageToPlayer);
    }

    public boolean isInCombatWithMob(UUID uuid) {
        if (!playerCombatMap.containsKey(uuid))
            return false;
        return playerCombatMap.get(uuid).isInCombatWithMob();
    }

    public Long getGotLastDamageFromMob(UUID uuid) {
        CMIPlayerCombat data = playerCombatMap.get(uuid);
        return data == null ? 0L : data.getGotLastDamageFromMob();
    }

    public void setGotLastDamageFromMob(UUID uuid, Long gotLastDamageFromMob) {
        if (!isInCombatWithMob(uuid))
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoMobCombat(CMIUser.getUser(uuid));
        getCombatRecord(uuid).setGotLastDamageFromMob(gotLastDamageFromMob);
    }

    public void setDidLastDamageToEntity(UUID uuid, Long didLastDamageToMob) {
        if (!isInCombatWithMob(uuid)) {
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoMobCombat(CMIUser.getUser(uuid));
        }
        getCombatRecord(uuid).setDidLastDamageToMob(didLastDamageToMob);
    }

    public long getLeftCombatTime(UUID uuid) {
        if (!playerCombatMap.containsKey(uuid))
            return 0L;
        return playerCombatMap.get(uuid).getLeftCombatTime();
    } 

    public boolean isMobIncludeEnvironment() {
        return MobIncludeEnvironment;
    }

//    }

}
