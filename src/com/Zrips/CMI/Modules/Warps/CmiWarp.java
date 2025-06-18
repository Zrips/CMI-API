package com.Zrips.CMI.Modules.Warps;

import java.util.List;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Container.CMILocation;

public class CmiWarp {
    private CMILocation loc;
    private List<CMILocation> locations;
    private String name;
    private String displayName;
    private ItemStack item;
    private ItemStack offItem;
    private Integer slot;
    private Integer page;
    private Boolean reqPerm;
    private Boolean showUnavailable;
    private Boolean autoLore;
    private boolean randomizeYaw;
    private boolean repeatingLocation;
    private String group;
    private boolean hidden;
    private UUID creator;
    private List<CMILocation> temp;

    public CmiWarp(String name) {
    }

    public void reset() {
    }

    public CmiWarp(String name, CMILocation loc) {
    }

    public CMILocation getLoc() {
        return null;
    }

    public void resetQueue() {
    }

    public CMILocation getLocIncRand() {
        return null;
    }

    public String getName() {
        return null;
    }

    public ItemStack getItem() {
        return null;
    }

    public ItemStack getIcon() {
        return null;
    }

    public ItemStack getOffIcon() {
        return null;
    }

    public void setItem(ItemStack item) {
    }

    public void setLoc(CMILocation loc) {
    }

    public boolean isReqPerm() {
        return false;
    }

    public void setReqPerm(boolean reqPerm) {
    }

    public Integer getSlot() {
        return null;
    }

    public void setSlot(Integer slot) {
    }

    public UUID getCreator() {
        return null;
    }

    public String getCreatorName() {
        return null;
    }

    public void setCreator(UUID creator) {
    }

    public Boolean isAutoLore() {
        return null;
    }

    public void setAutoLore(Boolean autoLore) {
    }

    public ItemStack getOffItem() {
        return null;
    }

    public void setOffItem(ItemStack offItem) {
    }

    public Boolean isShowUnavailable() {
        return null;
    }

    public void setShowUnavailable(Boolean showUnavailable) {
    }

    public Integer getPage() {
        return null;
    }

    public void setPage(int p) {
    }

    public void setName(String name) {
    }

    public boolean isRandomizeYaw() {
        return false;
    }

    public void setRandomizeYaw(boolean randomizeYaw) {
    }

    public String getGroup() {
        return null;
    }

    public void setGroup(String group) {
    }

    public boolean sameGroup(String group) {
        return false;
    }

    public boolean isHidden() {
        return false;
    }

    public void setHidden(boolean hidden) {
    }

    public String getShownName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public void setDisplayName(String displayName) {
    }

    public boolean isRepeatingLocation() {
        return false;
    }

    public void setRepeatingLocation(boolean repeatingLocation) {
    }

    public boolean hasSecondaryLocations() {
        return false;
    }

    public List<CMILocation> getLocations() {
        return null;
    }

    public void setLocations(List<CMILocation> locations) {
    }

    public void addLocation(CMILocation location) {
    }
}
