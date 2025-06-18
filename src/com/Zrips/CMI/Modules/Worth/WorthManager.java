package com.Zrips.CMI.Modules.Worth;

import java.io.File;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.CMIGuiButton;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class WorthManager {
    private CMI plugin;
    private LinkedHashMap<CMIMaterial, List<WorthItem>> map;
    private HashMap<Enchantment, HashMap<Integer, WorthEnchantment>> enchantMap;
    public static String fileName;
    File file;
    Writer writer;
    boolean checkedOldFile;
    CompletableFuture<Void> saveTask;
    List<String> badLore;
    private boolean loreBlock;
    private boolean requireFullDurability;
    private boolean devalueByDurability;
    private int autoGeneratePriceIncrease;
    private boolean customNameBlocking;

    public WorthManager(CMI plugin) {
    }

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

    public void closeStream() {
    }

    public void sellLog(Player player, HashMap<WorthItem, Integer> total) {
    }

    public void updatePriceInFile() {
    }

    public void updatePriceInFile(WorthItem worth) {
    }

    public void updatePriceInFile(WorthEnchantment enchantWorth) {
    }

    public void updatePriceInFile(WorthItem worth, WorthEnchantment enchantWorth) {
    }

    private void updateWorthInFile(Set<WorthItem> worths, Set<WorthEnchantment> enchantWorths) {
    }

    public WorthItem getWorth(ItemStack item) {
        return null;
    }

    public boolean containsBlockedLore(CMIItemStack citem) {
        return false;
    }

    public boolean isRepairBeforeSell(ItemStack item) {
        return false;
    }

    public double damagePercentage(ItemStack item) {
        return 0.0;
    }

    public double getWorthByDurability(ItemStack item, double amount) {
        return 0.0;
    }

    public WorthItem getWorth(ItemStack item, boolean includeFree) {
        return null;
    }

    public List<ItemStack> getItems(Player player, worthType type) {
        return null;
    }

    public List<ItemStack> getItems(Player player, worthType type, CMIMaterial material) {
        return null;
    }

    public List<ItemStack> getItems(Player player, worthType type, CMIMaterial material, int amount) {
        return null;
    }

    public boolean isShulkerWithItems(ItemStack item) {
        return false;
    }

    public void loadConfig() {
    }

    public HashMap<CMIMaterial, List<WorthItem>> getMap() {
        return null;
    }

    public WorthItem addWorth(WorthItem worth) {
        return null;
    }

    @Deprecated
    public void openWorthListGui(Player player, int page) {
    }

    public void openWorthListGui(Player player, int page, boolean missing) {
    }

    public int getAutoGeneratePriceIncrease() {
        return 0;
    }

    public enum worthType {
        all, hand, blocks, same, material, gui;

        public static worthType getByName(String name) {
            return null;
        }
    }
}
