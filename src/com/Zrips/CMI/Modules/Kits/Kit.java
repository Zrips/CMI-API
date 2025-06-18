package com.Zrips.CMI.Modules.Kits;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;

public class Kit {
    private List<ItemStack> item;
    private List<String> commands;
    private List<String> conditions;
    private List<String> Description;
    private HashMap<CMIInventorySlot, ItemStack> extraItems;
    private ItemStack Icon;
    private ItemStack IconOff;
    private double cost;
    private int expCost;
    private Long delay;
    private String name;
    private String displayName;
    private String group;
    private String fileName;
    private boolean enabled;
    private int weight;
    private String cmdName;
    private Integer slot;
    private Integer page;
    private int maxUsages;
    private boolean showDespiteUsage;
    private boolean showDespiteWeight;
    private boolean dropItems;

    public Kit(String name) {
    }

    public void reset() {
    }

    public ItemStack getFirstNotNullItem() {
        return null;
    }

    public List<ItemStack> getItems() {
        return null;
    }

    public List<ItemStack> getItems(Player player) {
        return null;
    }

    public boolean enoughFreeSpace(Player player) {
        return false;
    }

    private ItemStack checkBook(ItemStack book) {
        return null;
    }

    public void setItem(List<ItemStack> item) {
    }

    public void setItem(int slot, ItemStack item) {
    }

    public void addItem(ItemStack item) {
    }

    public List<String> getCommands(Player player) {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public double getCost() {
        return 0.0;
    }

    public void setCost(double cost) {
    }

    public int getExpCost() {
        return 0;
    }

    public void setExpCost(int expCost) {
    }

    public long getDelay() {
        return 0;
    }

    public void setDelay(long delay) {
    }

    public List<String> getConditions() {
        return null;
    }

    public void setConditions(List<String> conditions) {
    }

    public String getConfigName() {
        return null;
    }

    public void setName(String name) {
    }

    public List<String> getDescription(Player player) {
        return null;
    }

    public List<String> getDescription() {
        return null;
    }

    public void setDescription(List<String> description) {
    }

    public String getGroup() {
        return null;
    }

    public void setGroup(String group) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public int getWeight() {
        return 0;
    }

    public void setWeight(int weight) {
    }

    public String getCommandName() {
        return null;
    }

    public void setCommandName(String CommandName) {
    }

    public ItemStack getExtraItem(CMIInventorySlot slot) {
        return null;
    }

    public ItemStack getExtraItem(Player player, CMIInventorySlot slot) {
        return null;
    }

    public void setExtraItem(CMIInventorySlot slot, ItemStack item) {
    }

    @Deprecated
    public ItemStack getHelmet() {
        return null;
    }

    @Deprecated
    public void setHelmet(ItemStack helmet) {
    }

    @Deprecated
    public ItemStack getChest() {
        return null;
    }

    @Deprecated
    public void setChest(ItemStack chest) {
    }

    @Deprecated
    public ItemStack getLegs() {
        return null;
    }

    @Deprecated
    public void setLegs(ItemStack legs) {
    }

    @Deprecated
    public ItemStack getBoots() {
        return null;
    }

    @Deprecated
    public void setBoots(ItemStack boots) {
    }

    @Deprecated
    public ItemStack getOffHand() {
        return null;
    }

    @Deprecated
    public void setOffHand(ItemStack offHand) {
    }

    public Integer getSlot() {
        return null;
    }

    public void setSlot(Integer slot) {
    }

    public ItemStack getSafeIcon() {
        return null;
    }

    public ItemStack getIcon() {
        return null;
    }

    public void setIcon(ItemStack icon) {
    }

    public ItemStack getSafeIconOff() {
        return null;
    }

    public ItemStack getIconOff() {
        return null;
    }

    public void setIconOff(ItemStack iconOff) {
    }

    public int getMaxUsages() {
        return 0;
    }

    public void setMaxUsages(int maxUsages) {
    }

    public boolean isLimitedUse() {
        return false;
    }

    public boolean isShowDespiteWeight() {
        return false;
    }

    public void setShowDespiteWeight(boolean showDespiteWeight) {
    }

    public boolean isDropItems() {
        return false;
    }

    public void setDropItems(boolean dropItems) {
    }

    public String getDisplayName() {
        return null;
    }

    public void setDisplayName(String displayName) {
    }

    public boolean isShowDespiteUsage() {
        return false;
    }

    public void setShowDespiteUsage(boolean showDespiteUsage) {
    }

    public Integer getPage() {
        return null;
    }

    public void setPage(Integer page) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String fileName) {
    }
}
