package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Version.Version;

public class CMIPlayerInventory {

    private CMIUser user;

    public static enum CMIInventorySlot {
        Armor(36, 39), Helmet(39), ChestPlate(38), Pants(37), Boots(36), OffHand(40), MainHand(-1), QuickBar(0, 8), PartInventory(9, 35), MainInventory(0, 35), CraftingIngredients(1, 4), CraftingResult(0);

        private List<Integer> slot = new ArrayList<Integer>();

        CMIInventorySlot(Integer from, Integer to) {
            for (int i = from; i <= to; i++) {
                this.slot.add(i);
            }
        }

        CMIInventorySlot(Integer slot) {
            this.slot.add(slot);
        }

        CMIInventorySlot(List<Integer> slot) {
            this.slot.addAll(slot);
        }

        public List<Integer> getSlots() {
            return slot;
        }

        public Integer getSlot() {
            return slot.get(0);
        }
    }

    public CMIPlayerInventory(CMIUser user) {
        this.user = user;
    }

    public void setItem(CMIInventorySlot type, ItemStack item) {
        Player player = user.getPlayer();
        if (type.equals(CMIInventorySlot.MainHand)) {
            CMILib.getInstance().getReflectionManager().setItemInMainHand(user.getPlayer(), item);
        } else {
            for (Integer slot : type.getSlots()) {
                player.getInventory().setItem(slot, item);
            }
        }
    }

    public static enum CMIFullInventoryAction {
        Abort, Drop, Return;
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, int preferredSlot) {
        return addItem(item, CMIFullInventoryAction.Drop, preferredSlot);
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item) {
        return addItem(item, CMIFullInventoryAction.Drop, -1);
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, CMIFullInventoryAction action) {
        return addItem(item, action, -1);
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack item, CMIFullInventoryAction action, int preferredSlot) {

        return null;
    }

    public enum itemCheckType {
        name, lore, amount, nbt, material, custommodel;
    }

    public HashMap<Integer, ItemStack> removeItemByCriteria(ItemStack item, itemCheckType... checkTypes) {

        return null;
    }

    public HashMap<Integer, ItemStack> removeItem(ItemStack... items) {

        return null;
    }

    public ItemStack getItem(int index) {
        return this.user.getPlayer().getInventory().getItem(index);
    }

    public void clear(int index) {
        this.user.getPlayer().getInventory().setItem(index, null);
    }

    public void setItem(int index, ItemStack item) {
        this.user.getPlayer().getInventory().setItem(index, item);
    }

    private ItemStack[] getStorageContents() {
        if (Version.isCurrentEqualOrLower(Version.v1_9_R1))
            return this.user.getPlayer().getInventory().getContents();
        return this.user.getPlayer().getInventory().getStorageContents();
    }

    public boolean has(ItemStack item, itemCheckType... checkTypes) {
        if (item == null)
            return true;
        return getTotalAmount(item, checkTypes) >= item.getAmount();
    }

    public int getTotalAmount(ItemStack item, itemCheckType... checkTypes) {
        if (item == null) {
            return 0;
        }
        int amount = 0;

        return amount;
    }

    private int check(ItemStack item, itemCheckType... checkTypes) {
        return -1;
    }

    public static boolean matches(ItemStack citem, ItemStack item, itemCheckType... checkTypes) {

        return true;
    }

    public boolean canFit(List<ItemStack> item) {
        List<ItemStack> temp = new ArrayList<ItemStack>();
        for (ItemStack one : item) {
            if (one == null)
                continue;
            temp.add(one);
        }
        ItemStack[] array = new ItemStack[temp.size()];
        temp.toArray(array);

        return canFit(array);
    }

    public boolean canFit(ItemStack... items) {
        Player player = user.getPlayer();
        if (player == null)
            return false;
        Inventory inv = Bukkit.createInventory(null, 36);
        for (int i = 0; i < 36; i++) {
            ItemStack oldItem = player.getInventory().getItem(i);
            if (oldItem != null)
                inv.setItem(i, oldItem.clone());
        }

        return inv.addItem(items).isEmpty();
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
        return getFreeSlots(CMIInventorySlot.MainInventory);
    }

    public int getFreeSlots(CMIInventorySlot place) {
        return place.getSlots().size() - getItems(place).size();
    }

    public boolean contains(ItemStack item) {

        return false;
    }

}
