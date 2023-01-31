package com.Zrips.CMI.Modules.Worth;

import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.CMIGuiButton;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class WorthManager {

    private CMI plugin;

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

    private void addSellPriceButton(CMIGui gui, CMIItemStack iih, WorthItem worth, int slot, CMIMaterial material, double change) {

    }

    private void addBuyPriceButton(CMIGui gui, CMIItemStack iih, WorthItem worth, int slot, CMIMaterial material, double change) {

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

    public void updatePriceInFile() {
        updateWorthInFile(null, null);
    }

    public void updatePriceInFile(WorthItem worth) {
        updatePriceInFile(worth, null);
    }

    public void updatePriceInFile(WorthEnchantment enchantWorth) {
        updatePriceInFile(null, enchantWorth);
    }

    public void updatePriceInFile(final WorthItem worth, final WorthEnchantment enchantWorth) {

    }

    private void updateWorthInFile(final Set<WorthItem> worths, final Set<WorthEnchantment> enchantWorths) {

    }

    public WorthItem getWorth(ItemStack item) {
        return getWorth(item, false);
    }

    public boolean containsBlockedLore(CMIItemStack citem) {
        for (String one : citem.getLore()) {
            String o = CMIChatColor.stripColor(one).toLowerCase();
            for (String oneBad : badLore) {
                if (o.contains(oneBad))
                    return true;
            }
        }

        return false;
    }

    public boolean isRepairBeforeSell(ItemStack item) {
        CMIItemStack citem = CMILib.getInstance().getItemManager().getItem(item);
        return requireFullDurability && citem.getMaxDurability() > 2 && citem.getDurability() > 0;
    }

    public double damagePercentage(ItemStack item) {

        return 0;
    }

    public double getWorthByDurability(ItemStack item, double amount) {
        if (!devalueByDurability)
            return amount;

        CMIItemStack citem = CMILib.getInstance().getItemManager().getItem(item);

        if (citem.getMaxDurability() < 2)
            return amount;

        double percent = (citem.getMaxDurability() - citem.getDurability()) / (double) citem.getMaxDurability();

        return (int) ((amount * percent) * 10000) / 10000D;
    }

    public WorthItem getWorth(ItemStack item, boolean includeFree) {

        return null;
    }

    public enum worthType {
        all, hand, blocks, same, material, gui;

        public static worthType getByName(String name) {
            for (worthType one : worthType.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }
    }

    public List<ItemStack> getItems(Player player, worthType type) {
        return getItems(player, type, null);
    }

    public List<ItemStack> getItems(Player player, worthType type, CMIMaterial material) {
        return getItems(player, type, material, 0);
    }

    public List<ItemStack> getItems(Player player, worthType type, CMIMaterial material, int amount) {

        return null;
    }

    public boolean isShulkerWithItems(ItemStack item) {
        if (!CMIMaterial.isShulkerBox(item.getType()))
            return false;
        List<ItemStack> items = plugin.getShulkerBoxManager().getShulkerBoxContents(item);
        return !items.isEmpty();
    }

    List<String> badLore = new ArrayList<String>();
    private boolean loreBlock = false;
    private boolean requireFullDurability = false;
    private boolean devalueByDurability = false;
    private int autoGeneratePriceIncrease = 0;
    private boolean customNameBlocking = false;

    public void loadConfig() {

    }

    public HashMap<CMIMaterial, List<WorthItem>> getMap() {
        return map;
    }

    public WorthItem addWorth(WorthItem worth) {

        return null;
    }

    @Deprecated
    public void openWorthListGui(Player player, int page) {
        openWorthListGui(player, page, false);
    }

    public void openWorthListGui(Player player, int page, boolean missing) {

    }

    public int getAutoGeneratePriceIncrease() {
        return autoGeneratePriceIncrease;
    }
}
