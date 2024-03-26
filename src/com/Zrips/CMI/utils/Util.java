package com.Zrips.CMI.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
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
import com.google.common.base.Charsets;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class Util {

    public boolean Debug = true;

    private HashMap<String, replyResponder> replyMapBySender = new HashMap<String, replyResponder>();
    private HashMap<String, replyResponder> replyMapByReceiver = new HashMap<String, replyResponder>();

    private HashMap<UUID, String> worldCache = new HashMap<UUID, String>();

    static Random random = new Random(System.nanoTime());

    private CMI plugin;

    public Util(CMI plugin) {
        this.plugin = plugin;
        for (World one : Bukkit.getWorlds()) {
            worldCache.put(one.getUID(), one.getName());
        }
    }

    public static enum SignSide {
        FRONT,
        BACK
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
        return deserializePotionEffect(effect, null);
    }

    public PotionEffect deserializePotionEffect(String effect, Integer overrideDuration) {

        return null;
    }

    public class replyResponder {
        private String name;
        private Long time;

        public replyResponder(String name, Long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getTime() {
            return time;
        }

        public void setTime(Long time) {
            this.time = time;
        }
    }

    public boolean isNPC(Player player) {
        if (player.hasMetadata("NPC"))
            return true;
        return false;
    }

    public UUID generateUUID(String playerName) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + playerName).getBytes(Charsets.UTF_8));
    }

    Integer range = null;

    public int getPlayerTrackingRange() {
        return getPlayerTrackingRange(null);
    }

    public boolean lookingAt(Player player, Vector target, double maxYawAngle, double maxPitchAngle) {
        return false;
    }

    public int getPlayerTrackingRange(World world) {
        return range;
    }

    @Deprecated
    public void addMessageReplayTo(String target, String sender) {
        addMessageReplyTo(target, sender);
    }

    public void addMessageReplyTo(String target, String sender) {

    }

    @Deprecated
    public void removeMessageReplayTo(String sender) {
        removeMessageReplyTo(sender);
    }

    public void removeMessageReplyTo(String sender) {
    }

    public double getDistance(Location loc1, Location loc2) {
        if (loc1 == null || loc2 == null || loc1.getWorld() != loc2.getWorld())
            return Integer.MAX_VALUE;

        try {
            return loc1.distance(loc2);
        } catch (Throwable e) {
            return Integer.MAX_VALUE;
        }
    }

    public int getMaxWorldHeight(World world) {
        return 256;
    }

    public Vector getVector(Location loc1, Location loc2) {

        return null;
    }

    public double getYaw(Location loc1, Location loc2) {
        double dX = loc1.getX() - loc2.getX();
        double dZ = loc1.getZ() - loc2.getZ();
        return Math.toDegrees(Math.atan2(dZ, dX));
    }

    public double getPitch(Location loc1, Location loc2) {
        double dX = loc1.getX() - loc2.getX();
        double dY = loc1.getY() - loc2.getY();
        double dZ = loc1.getZ() - loc2.getZ();
        return Math.toDegrees(Math.atan2(Math.sqrt(dZ * dZ + dX * dX), dY) + Math.PI);
    }

    @Deprecated
    public String getMessageReplayTo(String sender) {
        return getMessageReplyTo(sender);
    }

    public String getMessageReplyTo(String sender) {
        return null;
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
        return getTargetEntity(player, 0.95, false, true);
    }

    public Entity getTargetEntity(Player player, double pov) {
        return getTargetEntity(player, pov, false, true);
    }

    public Entity getTargetEntity(Player player, boolean includeSpectator, boolean includeInvisible) {
        return getTargetEntity(player, 0.95, includeSpectator, includeInvisible);
    }

    public Entity getTargetEntity(Player player, double pov, boolean includeSpectator, boolean includeInvisible) {

        return null;
    }

    public Block getTargetBlock(Player player, int distance, boolean ignoreNoneSolids) {
        return getTargetBlock(player, null, distance, ignoreNoneSolids);
    }

    public Block getTargetBlock(Player player, int distance) {
        return getTargetBlock(player, null, distance, false);
    }

    public Block getTargetBlock(Player player, Material lookingFor, int distance) {
        return getTargetBlock(player, lookingFor, distance, false);
    }

    public Block getTargetBlock(Player player, Material lookingFor, int distance, boolean ignoreNoneSolids) {
        ArrayList<Block> blocks = getLastTwoTargetBlock(player, lookingFor, distance, ignoreNoneSolids);
        return blocks.isEmpty() ? null : blocks.get(blocks.size() - 1);
    }

    public ArrayList<Block> getLastTwoTargetBlock(Player player, int distance) {
        return getLastTwoTargetBlock(player, null, distance, false);
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
        if (CMILib.getInstance().getLM().containsKey("info.DamageCause." + cause.toLowerCase()))
            cause = CMILib.getInstance().getLM().getMessage("info.DamageCause." + cause.toLowerCase());
        return cause;
    }

    public int getOnlinePlayerCount() {
        return getOnlinePlayerCount(null);
    }

    public int getOnlinePlayerCount(World world) {
        int i = 0;
        for (Player one : Bukkit.getOnlinePlayers()) {
            if (world != null && !one.getWorld().equals(world))
                continue;
            i++;
        }
        return i;
    }

    public String getOnlinePlayersAsString() {
        return getOnlinePlayersAsString(null);
    }

    public String getOnlinePlayersAsString(String ignore) {
        return null;
    }

    @Deprecated
    public List<Player> getPlayersFromRange(Location loc, int range, @SuppressWarnings("unused") boolean forced) {
        return getPlayersFromRange(loc, range);
    }

    public List<Player> getPlayersFromRange(Location loc, int range) {
        return getPlayersFromRange(null, loc, range);
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

    public void resendBlockInfo(final Player player, final Block block) {
        CMIScheduler.runTaskLater(() -> player.sendBlockChange(block.getLocation(), block.getType(), (byte) 0), 10L);
    }

    public boolean isFullInv(ItemStack[] cn, List<ItemStack> list) {
        return false;
    }

    public List<ItemStack> ConvertInvToList(Inventory inv) {
        return null;
    }

    public boolean canRepair(ItemStack item) {

        return true;
    }

    public boolean needRepair(ItemStack item) {

        return true;
    }

    public ItemStack repairItem(ItemStack item) {

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
        return validName("[^a-zA-Z0-9\\-\\_]", name);
    }

    public boolean validName(String regex, String name) {

        return false;

    }

    public String getWorldName(UUID uuid) {
        World w = Bukkit.getWorld(uuid);
        if (w != null)
            return w.getName();
        return this.worldCache.get(uuid);
    }

    public CMIChatColor getTpsColor(Double tps) {

        return null;
    }

    public static File getFile(Player player) {
        return getFile(player.getUniqueId());
    }

    public static File getFile(UUID uuid) {
        return new File(Bukkit.getWorlds().get(0).getWorldFolder(), "playerdata" + File.separator + uuid + ".dat");
    }

    public Player getRandomOnlinePlayer() {
        return getRandomOnlinePlayer(null);
    }

    public Player getRandomOnlinePlayer(Set<Player> exclude) {

        return null;
    }

    public boolean blockedItemFromRenaming(CommandSender sender, ItemStack item, String newName) {

        return false;
    }

    public String getLineSplitter(String text) {

        return null;
    }

}
