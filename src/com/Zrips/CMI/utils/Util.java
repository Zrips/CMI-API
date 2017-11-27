package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.SpawnEgg;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.tp.TpManager.TpAction;
import com.Zrips.CMI.commands.list.colorlimits.CMIColorTypes;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class Util {

    public boolean Debug = true;

    private HashMap<String, String> replayMap = new HashMap<String, String>();

    private CMI plugin;

    public Util(CMI plugin) {
	this.plugin = plugin;
    }

    public void addMessageReplayTo(String sender, String gets) {
	replayMap.put(sender, gets);
    }

    public String getMessageReplayTo(String sender) {
	return replayMap.get(sender);
    }

    public enum CommandType {
	gui, warmup, acmd, rank, silent
    }

    public String firstToUpperCase(String name) {
	return null;
    }

    public Block getTargetBlock(Player player, int distance) {
	return null;
    }

    public Entity getTargetEntity(Player player) {

	return null;
    }

    public Block getTargetBlock(Player player, Material lookingFor, int distance) {

	return null;
    }

    public void performCommand(Player player, String command, CommandType type) {

    }

    public String getMessageFromArray(String[] args, Integer from, Integer to) {

	return null;
    }

    public Long getPlayTime(UUID uuid) {

	return null;
    }

    public String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean) {

	return null;
    }

    public EntityType getEntityType(String type) {

	return null;
    }

    public itemInfo getItemInfo(String text) {

	return null;
    }

    public int getItemData(ItemStack item) {
	int data = item.getData().getData();
	return data;
    }

    public String translateDamageCause(String cause) {

	return null;
    }

    public List<Player> getPlayersFromRange(Location loc, int range, boolean forced) {

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

    public boolean Debug(Object... message) {

	return true;
    }

    public boolean hasPermission(CommandSender sender, String permision, Boolean output) {

	return false;
    }

    public boolean isFullInv(ItemStack[] cn, List<ItemStack> list) {

	return false;
    }

    public List<ItemStack> ConvertInvToList(Inventory inv) {

	return null;
    }

    public void setExp(Player player, int exp) {
    }

    public void addExp(Player player, int exp) {
    }

    public void takeExp(Player player, int exp) {
    }

    public int getExpForCurrentLevel(Player player) {
	return plugin.getUtilManager().getExp(player) - plugin.getUtilManager().getExpToLevel(player.getLevel());
    }

    public int getExp(Player player) {
	int bukkitExp = (getExpToLevel(player.getLevel()) + Math.round(deltaLevelToExp(player.getLevel()) * player.getExp()));
	return bukkitExp;
    }

    // total xp calculation based by lvl
    public int getExpToLevel(int level) {
	return 0;
    }

    // xp calculation for one current lvl
    public int deltaLevelToExp(int level) {
	return 0;
    }

    public boolean isOnline(String name) {
	return false;
    }

    public Color getColorByName(String name) {

	return null;
    }

    public String TranslatePotionEffect(String effect) {

	return null;
    }

    public boolean canRepair(ItemStack item) {

	return true;
    }

    public ItemStack repairItem(ItemStack item) {

	return null;
    }

    public boolean HasSilkTouch(ItemStack is, int lvl) {

	return false;
    }

    @SuppressWarnings("deprecation")
    public EntityType getEntityType(ItemStack is) {

	return null;
    }

    @SuppressWarnings("deprecation")
    public ItemStack setEntityType(ItemStack is, EntityType type) throws IllegalArgumentException {

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

    public String listToString(List<String> ls) {

	return null;
    }
}
