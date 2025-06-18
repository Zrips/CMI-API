package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class CMIItemDonations {
    private UUID donor;
    private UUID receiver;
    private ItemStack item;
    private long time;
    private static HashMap<UUID, HashMap<UUID, CMIItemDonations>> donationsCache;

    public static void addItemDonation(CMIItemDonations donation) {
    }

    public static HashMap<UUID, CMIItemDonations> getPendingDonations(UUID uuid) {
        return null;
    }

    public CMIItemDonations() {
    }

    public UUID getDonor() {
        return null;
    }

    public void setDonor(UUID donor) {
    }

    public UUID getReceiver() {
        return null;
    }

    public void setReceiver(UUID receiver) {
    }

    public ItemStack getItem() {
        return null;
    }

    public void setItem(ItemStack item) {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long time) {
    }
}
