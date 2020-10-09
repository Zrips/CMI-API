package com.Zrips.CMI.Modules.Worth;

import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;

public class WorthManager {

    private CMI plugin;

//    private HashMap<CMIUser, Double> soldFor = new HashMap<CMIUser, Double>();
//    private boolean reset = false;

    public WorthManager(CMI plugin) {
	this.plugin = plugin;
    }

    private LinkedHashMap<CMIMaterial, List<WorthItem>> map = new LinkedHashMap<CMIMaterial, List<WorthItem>>();
    private HashMap<Enchantment, HashMap<Integer, WorthEnchantment>> enchantMap = new HashMap<Enchantment, HashMap<Integer, WorthEnchantment>>();

    public Double getEnchantSellPrice(Enchantment enchant, int level) {
	return null;
    }

    public WorthEnchantment getEnchantWorth(Enchantment enchant, int level) {
	return null;
    }

    public void addEnchantWorth(WorthEnchantment worth) {

    }

    public void load() {
    }

    public void loadEnchtWorth() {

    }

    private void addSellPriceButton(CMIGui gui, WorthItem worth, int slot, CMIMaterial material, double change) {

    }

    private void addBuyPriceButton(CMIGui gui, WorthItem worth, int slot, CMIMaterial material, double change) {

    }

    public void openWorthGui(Player player, CMIItemStack iih) {

    }

    private void priceLore(CMIGuiButton button, WorthItem worth) {

    }

    File file = null;
    Writer writer = null;
    boolean checkedOldFile = false;

    public void closeStream() {
    }

    public void sellLog(Player player, HashMap<WorthItem, Integer> total) {

    }

    public void updatePriceInFile(WorthItem worth) {
	updatePriceInFile(worth, null);
    }

    public void updatePriceInFile(WorthEnchantment enchantWorth) {
	updatePriceInFile(null, enchantWorth);
    }

    public void updatePriceInFile(final WorthItem worth, final WorthEnchantment enchantWorth) {

    }

    public WorthItem getWorth(ItemStack item) {
	return getWorth(item, false);
    }

    public boolean containsBlockedLore(CMIItemStack citem) {

	return false;
    }

    public WorthItem getWorth(ItemStack item, boolean includeFree) {

	return null;
    }

    public enum worthType {
	all, hand, blocks, same;

	public static worthType getByname(String name) {
	    return null;
	}
    }

    public List<ItemStack> getItems(Player player, worthType type) {
	return null;
    }

    List<String> badLore = new ArrayList<String>();

    public void loadConfig() {
    }

    public HashMap<CMIMaterial, List<WorthItem>> getMap() {
	return map;
    }

    public WorthItem addWorth(WorthItem worth) {
	return null;
    }

    public void openWorthListGui(Player player, int page) {

    }
}
