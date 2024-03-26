package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIInvSee {
    Player watcher = null;
    Player target = null;
    private ItemStack[] contents;
    private ItemStack[] armor;
    private ItemStack offHand;
    private ItemStack cursor;
    private CMITask task;
    private CMITask lockTask;

    private boolean tempLocked = false;

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
        if (CMIUser.getOnlinePlayer(target.getUniqueId()) != null)
            return CMIUser.getOnlinePlayer(target.getUniqueId());
        return this.target;
    }

    public CMIInvSee setTarget(Player target) {
        this.target = target;
        return this;
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

    public void setTask(CMITask task) {
        this.task = task;
    }

    public CMITask getTask() {
        return this.task;
    }

    public boolean isTempLocked() {
        return tempLocked;
    }

    public void setTempLocked(boolean tempLocked) {
    }
}