package com.Zrips.CMI.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class Util {
    public boolean Debug;
    private HashMap<UUID, String> worldCache;
    static Random random;
    private CMI plugin;
    Integer range;
    private static boolean updatedFile;

    public Util(CMI plugin) {
    }

    public static Player getAttacker(EntityDamageEvent event) {
        return null;
    }

    public static Entity getDamager(EntityDamageEvent event) {
        return null;
    }

    public static SignSide getSignSide(Block sign, Location loc) {
        return null;
    }

    public String serializePotionEffect(PotionEffect effect) {
        return null;
    }

    public PotionEffect deserializePotionEffect(String effect) {
        return null;
    }

    public PotionEffect deserializePotionEffect(String effect, Integer overrideDuration) {
        return null;
    }

    public boolean isNPC(Player player) {
        return false;
    }

    public UUID generateUUID(String playerName) {
        return null;
    }

    public int getPlayerTrackingRange() {
        return 0;
    }

    public boolean lookingAt(Player player, Vector target, double maxYawAngle, double maxPitchAngle) {
        return false;
    }

    public int getPlayerTrackingRange(World world) {
        return 0;
    }

    @Deprecated
    public void addMessageReplayTo(String target, String sender) {
    }

    @Deprecated
    public void addMessageReplyTo(String target, String sender) {
    }

    @Deprecated
    public void addMessageReplyToBySender(String target, String sender) {
    }

    @Deprecated
    public void removeMessageReplayTo(String sender) {
    }

    @Deprecated
    public void removeMessageReplyTo(String sender) {
    }

    @Deprecated
    public String getMessageReplayTo(String sender) {
        return null;
    }

    @Deprecated
    public String getMessageReplyTo(String sender) {
        return null;
    }

    public double getDistance(Location loc1, Location loc2) {
        return 0.0;
    }

    public int getMaxWorldHeight(World world) {
        return 0;
    }

    public Vector getVector(Location loc1, Location loc2) {
        return null;
    }

    public double getYaw(Location loc1, Location loc2) {
        return 0.0;
    }

    public double getPitch(Location loc1, Location loc2) {
        return 0.0;
    }

    public String createTextProbgressBar(int bars, float total, float current) {
        return null;
    }

    public Block getHighestBlockAt(Location loc, boolean includeSolids) {
        return null;
    }

    public TreeMap<Double, Entity> getClosestEntities(Location center, int range, double treshold, EntityType type) {
        return null;
    }

    public Entity getClosestEntity(Location center, int range, EntityType type) {
        return null;
    }

    public Entity getTargetEntity(Player player) {
        return null;
    }

    public Entity getTargetEntity(Player player, double pov) {
        return null;
    }

    public Entity getTargetEntity(Player player, boolean includeSpectator, boolean includeInvisible) {
        return null;
    }

    public Entity getTargetEntity(Player player, double pov, boolean includeSpectator, boolean includeInvisible) {
        return null;
    }

    public Block getTargetBlock(Player player, int distance, boolean ignoreNoneSolids) {
        return null;
    }

    public Block getTargetBlock(Player player, int distance) {
        return null;
    }

    public Block getTargetBlock(Player player, Material lookingFor, int distance) {
        return null;
    }

    public Block getTargetBlock(Player player, Material lookingFor, int distance, boolean ignoreNoneSolids) {
        return null;
    }

    public ArrayList<Block> getLastTwoTargetBlock(Player player, int distance) {
        return null;
    }

    public ArrayList<Block> getLastTwoTargetBlock(Player player, Material lookingFor, int distance, boolean fluids) {
        return null;
    }

    public itemInfo getItemInfo(String text) {
        return null;
    }

    public int getItemData(ItemStack item) {
        return 0;
    }

    public String translateDamageCause(String cause) {
        return null;
    }

    public static int getOnlinePlayersCount() {
        return 0;
    }

    public int getOnlinePlayerCount() {
        return 0;
    }

    public int getOnlinePlayerCount(World world) {
        return 0;
    }

    public String getOnlinePlayersAsString() {
        return null;
    }

    public String getOnlinePlayersAsString(String ignore) {
        return null;
    }

    @Deprecated
    public List<Player> getPlayersFromRange(Location loc, int range, boolean forced) {
        return null;
    }

    public List<Player> getPlayersFromRange(Location loc, int range) {
        return null;
    }

    public List<Player> getPlayersFromRange(Player player, Location loc, int range) {
        return null;
    }

    public List<Player> getPlayersFromRangeForCounter(Location loc, int range, boolean forced) {
        return null;
    }

    public World getWorld(String name) {
        return null;
    }

    public List<String> getWorldList() {
        return null;
    }

    public void resendBlockInfo(Player player, Block block) {
    }

    public boolean isFullInv(ItemStack[] cn, List<ItemStack> list) {
        return false;
    }

    public List<ItemStack> ConvertInvToList(Inventory inv) {
        return null;
    }

    public boolean canRepair(ItemStack item) {
        return false;
    }

    public boolean needRepair(ItemStack item) {
        return false;
    }

    public ItemStack repairItem(ItemStack item) {
        return null;
    }

    public static Integer getCustomModelData(ItemStack item) {
        return null;
    }

    public static ItemStack setCustomModelData(ItemStack item, int data) {
        return null;
    }

    public static boolean isUnbreakable(ItemStack item) {
        return false;
    }

    public static ItemStack setUnbreakable(ItemStack item, boolean state) {
        return null;
    }

    public boolean hasSilkTouch(ItemStack is, int lvl) {
        return false;
    }

    @SuppressWarnings("deprecation")
    public ItemStack setEntityType(ItemStack is, EntityType type) {
        return null;
    }

    public boolean haveBlackListedItems(Player player, TpAction action) {
        return false;
    }

    private void showBlackListedItemList(Player player, HashMap<Material, Integer> items) {
    }

    public HashMap<Material, Integer> getBlackListedItems(Player player) {
        return null;
    }

    private HashMap<Material, Integer> getAllItemsFromInv(Inventory inv, HashMap<Material, Integer> t) {
        return null;
    }

    public String convertLocToStringShort(Location loc) {
        return null;
    }

    public boolean validName(String name) {
        return false;
    }

    public boolean validName(String regex, String name) {
        return false;
    }

    public String getWorldName(UUID uuid) {
        return null;
    }

    public CMIChatColor getTpsColor(Double tps) {
        return null;
    }

    public static File getFile(Player player) {
        return null;
    }

    public static File getFile(UUID uuid) {
        return null;
    }

    public Player getRandomOnlinePlayer() {
        return null;
    }

    public Player getRandomOnlinePlayer(Set<Player> exclude) {
        return null;
    }

    public boolean blockedItemFromRenaming(CommandSender sender, ItemStack itemFrom, ItemStack item, String newName) {
        return false;
    }

    public String getLineSplitter(String text) {
        return null;
    }

    private static Map<String, Object> replaceInternalWithCustom(Map<String, Object> data) {
        return null;
    }

    public static void fixItemStackFile(File file) {
    }

    public static void fixHeadNameSection(ConfigurationSection section) {
    }

    public static String simplifyGradientColors(String text) {
        return null;
    }

    @Deprecated
    public static ItemStack getItemFromObject(Object itemObject) {
        return null;
    }

    public static enum SignSide {
        FRONT, BACK;
    }
}
