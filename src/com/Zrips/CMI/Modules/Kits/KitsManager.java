package com.Zrips.CMI.Modules.Kits;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.ChatColor;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.Enchants.CMIEnchantment;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIRows;
import com.Zrips.CMI.Modules.GUI.GUIManager.InvType;
import com.Zrips.CMI.utils.RawMessage;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class KitsManager {

    private HashMap<String, Kit> map = new HashMap<String, Kit>();
    private HashMap<UUID, Kit> editorsMap = new HashMap<UUID, Kit>();
    private HashMap<UUID, Kit> previewMap = new HashMap<UUID, Kit>();
    private HashMap<UUID, Clickery> clickeryMap = new HashMap<UUID, Clickery>();
    private HashMap<UUID, String> chatMap = new HashMap<UUID, String>();
    private HashMap<UUID, List<ItemStack>> cloneCache = new HashMap<UUID, List<ItemStack>>();

    private Kit NewbieKit;

    private CMI plugin;

    public KitsManager(CMI plugin) {
	this.plugin = plugin;
	this.load();
    }

    public boolean isChatEditing(Player player) {
	return chatMap.containsKey(player.getUniqueId());
    }

    public void addChatEditor(Player player, String cmd) {
	chatMap.put(player.getUniqueId(), cmd);
    }

    public void removeChatEditor(Player player) {
	chatMap.remove(player.getUniqueId());
    }

    public String getChatEditorCmd(Player player) {
	return chatMap.get(player.getUniqueId());
    }

    public boolean isEditing(Player player) {
	return true;
    }

    public void addEditor(Player player, Kit kit) {
	editorsMap.put(player.getUniqueId(), kit);
    }

    public void removeEditor(Player player) {
	editorsMap.remove(player.getUniqueId());
    }

    public boolean isInPreview(Player player) {
	return previewMap.containsKey(player.getUniqueId());
    }

    public void addPreview(Player player, Kit kit) {
	previewMap.put(player.getUniqueId(), kit);
    }

    public void removePreview(Player player) {
	previewMap.remove(player.getUniqueId());
    }

    public void addKit(Kit kit) {
	map.put(kit.getConfigName().toLowerCase(), kit);
    }

    public boolean removeKit(String name) {
	return map.remove(name.toLowerCase()) != null;
    }

    public void renameKitConfigName(Kit kit, String newName) {
    }

    public void renameKitCommandName(Kit kit, String newName) {
    }

    public Kit getKit(Player player, String name) {
	return null;
    }

    public Kit getKit(Player player, String name, boolean ignorePerm) {

	return null;
    }

    public Kit getKit(String name, boolean getdisabled) {

	return null;
    }

    public List<Kit> getKitsByCommandName(Kit kit) {

	return null;
    }

    public List<Kit> getGroupedKits(Kit kit) {

	return null;
    }

    public HashMap<String, Kit> getKitMap() {
	return map;
    }

    public void setKits(HashMap<String, Kit> map) {
	this.map = map;
    }

    public void load() {

    }

    public void save() {
    }

    private static Material getMaterial(String val) {

	return null;
    }

    private static Integer getData(String val) {

	return 0;
    }

    public String processText(String text, Player player, Kit kit) {

	return null;
    }

    public String listPlayersKits(Player player) {

	return null;
    }

    public void listPlayersKitsInGUI(Player player) {

    }

    public void listPlayersKitsForEditing(Player player) {

    }

    public boolean isClickedProtected(int slot) {
	HashSet<Integer> slots = new HashSet<Integer>();
	slots.add(slot);
	return isClickedProtected(slots);
    }

    public boolean isClickedProtected(Set<Integer> slot) {
	for (Integer oneS : slot) {
	    if (oneS >= min && oneS <= max)
		return true;
	}

	return false;
    }

    private int min = 36;
    private int max = 53;

    private enum kitGUI {
	Separator(-1),
	OffHand(36),
	Helmet(37),
	Chest(38),
	Legs(39),
	Boots(40),
	Clone(41),
	configName(42),
	displayName(43),
	Weight(44),
	Slot(45),
	Delay(46),
	Money(47),
	Exp(48),
	Group(49),
	Commands(50),
	Conditions(51),
	Description(52),
	Enabled(53);
	private Integer slots;

	kitGUI(Integer slot) {
	    this.slots = slot;
	}

	public Integer getSlot() {
	    return slots;
	}

	public static kitGUI getButton(int slot) {
	    for (kitGUI one : kitGUI.values()) {
		if (one.getSlot() == slot)
		    return one;
	    }
	    return null;
	}
    }

    @SuppressWarnings("incomplete-switch")
    public void proccessClick(final Player player, int slot, ClickType click) {

    }

    public void updateItems(Player player) {

    }

    public void updateItems(Player player, Kit kit) {

    }

    private void setCloneItem(Inventory GuiInv, Player player) {

    }

    private ItemStack setOffHandItem(Kit kit) {

	return null;
    }

    private ItemStack setHelmetItem(Kit kit) {

	return null;
    }

    private ItemStack setChestItem(Kit kit) {

	return null;
    }

    private ItemStack setLegsItem(Kit kit) {

	return null;
    }

    private ItemStack setBootsItem(Kit kit) {

	return null;
    }

    private ItemStack setWeightItem(Inventory GuiInv, Kit kit) {

	return null;
    }

    private ItemStack setSlotItem(Inventory GuiInv, Kit kit) {

	return null;
    }

    private ItemStack setDelayItem(Kit kit, boolean extra) {

	return null;
    }

    private ItemStack getMoneyItem(Kit kit, boolean extra) {

	return null;
    }

    private ItemStack getExpItem(Kit kit, boolean extra) {

	return null;
    }

    private void setEnabledItem(Inventory GuiInv, Kit kit) {

    }

    private void setFillerItem(Inventory GuiInv) {
    }

    private ItemStack setConfigNameItem(Kit kit) {
	return null;
    }

    private ItemStack setCommandNameItem(Kit kit) {
	return null;
    }

    private ItemStack setGroupItem(Inventory GuiInv, Kit kit) {
	return null;
    }

    private ItemStack setCommandsItem(Kit kit, boolean extra) {
	return null;
    }

    private ItemStack setConditionsItem(Kit kit, boolean extra) {
	return null;
    }

    private ItemStack setDescriptionItem(Kit kit, boolean extra) {
	return null;
    }

    public void createPreview(Kit kit, Player player) {

    }

    private void updateItems(Inventory GuiInv, Kit kit) {
    }

    public void createGui(Kit kit, Player player) {

    }

    public void removeCommandLine(Kit kit, int place) {

    }

    public void removeConditionLine(Kit kit, int place) {

    }

    public void removeDescLine(Kit kit, int place) {

    }

    public void moveConditionLine(Kit kit, int place, int direction) {

    }

    public void moveCommandLine(Kit kit, int place, int direction) {

    }

    public void moveDescLine(Kit kit, int place, int direction) {

    }

    private static List<String> move(List<String> list, int place, int direction) {

	return null;
    }

    public void addCommandLine(Kit kit, String line) {
    }

    public void addConditionLine(Kit kit, String line) {
    }

    public void addDescLine(Kit kit, String line) {
    }

    public void giveKit(Player player, Kit kit) {

    }

    String newbieKitName;

    public Kit getNewbieKit() {
	return null;
    }

    public void setNewbieKit(String name) {
	newbieKitName = name;
    }
}
