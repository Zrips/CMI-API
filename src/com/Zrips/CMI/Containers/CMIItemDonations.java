package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class CMIItemDonations {

    private UUID donor;
    private UUID receiver;
    private ItemStack item;
    private long time = 0;

    private static HashMap<UUID, HashMap<UUID, CMIItemDonations>> donationsCache = new HashMap<UUID, HashMap<UUID, CMIItemDonations>>();

    public static void addItemDonation(CMIItemDonations donation) {
        HashMap<UUID, CMIItemDonations> records = donationsCache.computeIfAbsent(donation.getReceiver(), k -> new HashMap<UUID, CMIItemDonations>());
        records.put(donation.getDonor(), donation);
    }

    public static HashMap<UUID, CMIItemDonations> getPendingDonations(UUID uuid) {
        return donationsCache.getOrDefault(uuid, new HashMap<UUID, CMIItemDonations>());
    }

    public CMIItemDonations() {
    }

    public UUID getDonor() {
        return donor;
    }

    public void setDonor(UUID donor) {
        this.donor = donor;
    }

    public UUID getReceiver() {
        return receiver;
    }

    public void setReceiver(UUID receiver) {
        this.receiver = receiver;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

}
