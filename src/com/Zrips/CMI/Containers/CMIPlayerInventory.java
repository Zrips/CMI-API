package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CMIPlayerInventory {
    private CMIUser user;
    private static Method topInventory;

    public CMIPlayerInventory(CMIUser user) {
    }

    public void setItem(CMIInventorySlot type, ItemStack item) {
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, int preferredSlot) {
        return null;
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item) {
        return null;
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, CMIFullInventoryAction action) {
        return null;
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, CMIFullInventoryAction action, int preferredSlot) {
        return null;
    }

    private static HashMap<Integer, ItemStack> addItem(Inventory inventory, ItemStack... items) {
        return null;
    }

    public HashMap<Integer, ItemStack> removeItemByCriteria(ItemStack item, itemCheckType... checkTypes) {
        return null;
    }

    public HashMap<Integer, ItemStack> removeItemByCriteria(ItemStack item, boolean exact, itemCheckType... checkTypes) {
        return null;
    }

    public HashMap<Integer, ItemStack> removeItem(ItemStack... items) {
        return null;
    }

    public ItemStack getItem(int index) {
        return null;
    }

    public void clear(int index) {
    }

    public void setItem(int index, ItemStack item) {
    }

    private ItemStack[] getStorageContents() {
        return null;
    }

    public boolean has(ItemStack item, itemCheckType... checkTypes) {
        return false;
    }

    public boolean has(ItemStack item, boolean exact, itemCheckType... checkTypes) {
        return false;
    }

    public int getTotalAmount(ItemStack item, itemCheckType... checkTypes) {
        return 0;
    }

    public int getTotalAmount(ItemStack item, boolean exact, itemCheckType... checkTypes) {
        return 0;
    }

    private int check(ItemStack item, boolean exact, itemCheckType... checkTypes) {
        return 0;
    }

    public static boolean matches(ItemStack checkingItem, ItemStack lookingFor, itemCheckType... checkTypes) {
        return false;
    }

    public static boolean matches(ItemStack checkingItem, ItemStack lookingFor, boolean exact, itemCheckType... checkTypes) {
        return false;
    }

    private int first(ItemStack item, boolean withAmount) {
        return 0;
    }

    private static boolean isSimilar(ItemStack stack, ItemStack stack2) {
        return false;
    }

    public boolean canFit(List<ItemStack> item) {
        return false;
    }

    public boolean canFit(ItemStack... items) {
        return false;
    }

    public int emptySlotsRemainingIfAdded(List<ItemStack> item) {
        return 0;
    }

    public int emptySlotsRemainingIfAdded(ItemStack... items) {
        return 0;
    }

    public void removeItemFromMainHand(ItemStack item) {
    }

    public ItemStack getItem(CMIInventorySlot type) {
        return null;
    }

    public List<ItemStack> getItems(CMIInventorySlot type) {
        return null;
    }

    public int getFreeSlots() {
        return 0;
    }

    public int getFreeSlots(CMIInventorySlot place) {
        return 0;
    }

    public boolean contains(ItemStack item) {
        return false;
    }

    @Nonnull
    public static ItemStack[] getTopInventoryContents(Player player) {
        return null;
    }

    @Nullable
    public static Inventory getTopInventory(Player player) {
        return null;
    }

    public static enum CMIInventorySlot {
        Armor(36, 39), Helmet(39), ChestPlate(38), Pants(37), Boots(36), OffHand(40), MainHand(-1), QuickBar(0, 8), PartInventory(9, 35), MainInventory(0, 35), CraftingIngredients(1, 4), CraftingResult(0);

        private List<Integer> slot = new ArrayList<>();

        CMIInventorySlot(Integer from, Integer to) {
        }

        CMIInventorySlot(Integer slot) {
        }

        CMIInventorySlot(List<Integer> slot) {
        }

        public List<Integer> getSlots() {
            return null;
        }

        public Integer getSlot() {
            return null;
        }
    }

    public static enum CMIFullInventoryAction {
        Abort, Drop, Return;
    }

    public enum itemCheckType {
        name, lore, amount, nbt, material, custommodel, durability;
    }
}
