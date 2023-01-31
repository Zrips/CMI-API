package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIInvSee {
    Player watcher = null;
    Player target = null;
    private int schedID;
    private ItemStack[] contents;
    private ItemStack[] armor;
    private ItemStack offHand;
    private ItemStack cursor;

    public CMIInvSee(Player watcher, Player target) {
        this.watcher = watcher;
        this.target = target;
    }

    public Player getWatcher() {
        return this.watcher;
    }

    public CMIInvSee setWatcher(Player watcher) {
        this.watcher = watcher;
        return this;
    }

    public Player getTarget() {
        if (Bukkit.getPlayer(target.getUniqueId()) != null)
            return Bukkit.getPlayer(target.getUniqueId());
        return this.target;
    }

    public CMIInvSee setTarget(Player target) {
        this.target = target;
        return this;
    }

    public void setSchedId(int scheduleSyncRepeatingTask) {
        this.schedID = scheduleSyncRepeatingTask;
    }

    public int getSchedID() {
        return schedID;
    }

    public void setTargetContents(ItemStack[] contents) {
        this.contents = contents;
    }

    public void setTargetArmorContents(ItemStack[] armor) {
        this.armor = armor;
    }

    public ItemStack[] getContents() {
        return contents;
    }

    public ItemStack[] getArmorContents() {
        return armor;
    }

    public void setOffHand(ItemStack offHand) {
        this.offHand = offHand;
    }

    public ItemStack getOffHand() {
        return this.offHand;
    }

    public ItemStack getCursor() {
        return cursor;
    }

    public void setCursor(ItemStack cursor) {
        this.cursor = cursor;
    }
}