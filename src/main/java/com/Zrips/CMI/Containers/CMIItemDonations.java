package com.Zrips.CMI.Containers;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class CMIItemDonations {

    private UUID donor;
    private UUID receiver;
    private ItemStack item;
    private Long time;

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
