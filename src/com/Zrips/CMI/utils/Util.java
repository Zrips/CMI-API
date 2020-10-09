package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIEntityType;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.Modules.tp.TpManager.TpAction;
import com.Zrips.CMI.commands.list.colorlimits.CMIColorTypes;
import com.Zrips.CMI.utils.VersionChecker.Version;
import com.google.common.base.Charsets;

public class Util {

    public boolean Debug = true;

    private HashMap<String, replyResponder> replayMapBySender = new HashMap<String, replyResponder>();
    private HashMap<String, replyResponder> replayMapByReceiver = new HashMap<String, replyResponder>();

    private HashMap<UUID, String> worldCache = new HashMap<UUID, String>();

    static Random random = new Random(System.nanoTime());

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

    private CMI plugin;

    public Util(CMI plugin) {
	this.plugin = plugin;
	for (World one : Bukkit.getWorlds()) {
	    worldCache.put(one.getUID(), one.getName());
	}
    }

    Integer range = null;

    public int getPlayerTrackingRange() {
	return getPlayerTrackingRange(null);
    }

    public int getPlayerTrackingRange(World world) {
	return 0;
    }

    public void addMessageReplayTo(String target, String sender) {
    }

    public double getDistance(Location loc1, Location loc2) {
	return 0;
    }

    public int getMaxWorldHeight(World world) {
	return 256;
    }

    public Vector getVector(Location loc1, Location loc2) {

	return null;
    }

    public double getYaw(Location loc1, Location loc2) {
	return 0d;
    }

    public double getPitch(Location loc1, Location loc2) {
	return 0;
    }

    public String getMessageReplayTo(String sender) {
	return null;
    }

    public enum CommandType {
	gui, warmup, acmd, rank, silent
    }

    public enum CMIText {

	ten;

	public static String getFirstVariable(String message) {
	    if (message == null)
		return null;
	    if (!message.contains(" "))
		return message;
	    return message.split(" ")[0];
	}

	public static String replaceUnderScoreSpace(String message) {
	    String underScore = "U" + random.nextInt(Integer.MAX_VALUE) + "U";
	    message = message.replace("__", underScore);
	    message = message.replace("_", " ");
	    message = message.replace(underScore, "_");
	    return message;
	}

	public static boolean isValidString(String message) {
	    return message != null && !message.isEmpty();
	}
    }

    public String createTextProbgressBar(int bars, int total, int current) {

	return null;
    }

    public String firstToUpperCase(String name) {
	return null;
    }

    public String eachWordToFirstUpperCase(String name) {
	return null;
    }

    public void toLowerCase(List<String> strings) {
	ListIterator<String> iterator = strings.listIterator();
	while (iterator.hasNext()) {
	    iterator.set(iterator.next().toLowerCase());
	}
    }

    public Block getHighestBlockAt(Location loc, boolean includeSolids) {
	return null;
    }

    public Entity getClosestEntity(Location center, int range, EntityType type) {

	return null;
    }

    public Entity getTargetEntity(Player player) {
	return getTargetEntity(player, 0.95);
    }

    public Entity getTargetEntity(Player player, double pov) {

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

    public void performCommand(CommandSender sender, String command, CommandType type) {
    }

    public void performCommand(Player player, String command, CommandType type) {

    }

    public String getMessageFromArray(String[] args, Integer from, Integer to) {

	return null;
    }

    private static int cicles = 0;

    public String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean) {

	return null;
    }

    private static boolean hasColorPermission(Player player, CMIColorTypes type, String color) {
	return false;
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

    public int getOnlinePlayerCount() {
	int i = 0;
	for (Player one : Bukkit.getOnlinePlayers()) {
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
    }

    public boolean isFullInv(ItemStack[] cn, List<ItemStack> list) {
	return false;
    }

    public List<ItemStack> ConvertInvToList(Inventory inv) {
	return null;
    }

    public boolean isOnline(String name) {
	return Bukkit.getPlayer(name) != null;
    }

    public boolean canRepair(ItemStack item) {
	return true;
    }

    public String arrayToString(String[] args) {
	return arrayToString(args, null);
    }

    public String[] removeFirst(String[] args) {
	if (args.length == 0)
	    return args;
	return Arrays.copyOfRange(args, 1, args.length);
    }

    public String[] copyOfRange(String[] args, int from, int to) {
	return Arrays.copyOfRange(args, from, to);
    }

    public String arrayToString(String[] args, String seperator) {
	return null;
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

    public String listToString(List<String> ls, String spliter) {
	return null;
    }

    public List<String> StringToList(String ls, String spliter) {
	return null;
    }

    public String listToString(List<String> ls) {
	return null;
    }

    public List<String> spreadList(List<String> ls) {
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

    public void printNBT(List<String> list, CommandSender sender, String pre, String name, String type, String value, int typeId) {
    }

}
