package com.Zrips.CMI.Modules.Homes;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIItemStack;

public class HomeManager {
    private CMI plugin;
    HashMap<String, Integer> homeGroups;
    private HashMap<String, HomeWorldLimit> homeLimits;
    private boolean checkBlockbreak;
    private boolean pickRealBlock;
    private boolean homesWorldLimits;
    private boolean confirmation;
    private String defaultHomeName;
    private String defaultBedHomeName;
    private String homeNameRegex;
    private int respawnImmortality;
    private int HomesMaxGuiSlots;
    private boolean HomesGui;
    private boolean HomesGuiComplex;
    private boolean guiExpanded;
    private CMIItemStack guiBorder;
    private CMIItemStack guiInfill;
    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;
    private boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;
    private boolean guiBedButton;
    private int guiBedButtonSlot;
    private CMIItemStack guiBedButtonItem;
    private boolean guiHomeButton;
    private int guiHomeButtonSlot;
    private CMIItemStack guiHomeButtonItem;
    private boolean guiDeathButton;
    private boolean guiBackButton;
    private int guiDeathButtonSlot;
    private CMIItemStack guiDeathButtonItem;
    private int guiBackButtonSlot;
    private CMIItemStack guiBackButtonItem;
    private int guiPrevButtonSlot;
    private int guiMiddleButtonSlot;
    private int guiNextButtonSlot;
    private boolean HomesBedInteraction;
    private boolean onlyShiftBed;
    private boolean RemoveBedLocationOnBedBreak;
    private HashMap<String, List<String>> ReSpawnPriorityOrder;
    private HashMap<String, HashMap<CMIUser, CmiHome>> bedHomes;

    public HomeManager(CMI plugin) {
    }

    public void addHomeGroup(String group, int amount) {
    }

    public int getMaxHomes(CommandSender sender) {
        return 0;
    }

    public int getMaxHomes(Player player) {
        return 0;
    }

    public void loadConfig() {
    }

    public boolean isHomesBedInteraction() {
        return false;
    }

    public Location getReSpawnLocation(Player player) {
        return null;
    }

    public Location getReSpawnLocation(Player player, Location respawnLoc) {
        return null;
    }

    public boolean isCheckBlockbreak() {
        return false;
    }

    public String getDefaultHomeName() {
        return null;
    }

    public String getDefaultBedHomeName() {
        return null;
    }

    public HashMap<String, HashMap<CMIUser, CmiHome>> getBedHomes() {
        return null;
    }

    public void addBedHome(CMIUser user, CmiHome bedHome) {
    }

    public boolean removeBedHome(Location loc) {
        return false;
    }

    public boolean isRemoveBedLocationOnBedBreak() {
        return false;
    }

    public boolean openHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    public boolean openComplexHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    private void homeEditor(Player player, CMIUser targetUser, CmiHome home, int page) {
    }

    public boolean openSimpleHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    public boolean isHomesGui() {
        return false;
    }

    public int getRespawnImmortality() {
        return 0;
    }

    public String getHomeNameRegex() {
        return null;
    }

    public void setHomeNameRegex(String homeNameRegex) {
    }

    public boolean isPickRealBlock() {
        return false;
    }

    public boolean isOnlyShiftBed() {
        return false;
    }

    public boolean isConfirmation() {
        return false;
    }

    public boolean isHomesWorldLimits() {
        return false;
    }

    public void setHomesWorldLimits(boolean homesWorldLimits) {
    }

    public int getWorldLimit(String worldName) {
        return 0;
    }

    public HomeWorldLimit getWorldLimitObject(String worldName) {
        return null;
    }

    public boolean isHomesGuiComplex() {
        return false;
    }

    public int getGuiCloseButtonSlot() {
        return 0;
    }

    public CMIItemStack getGuiCloseButtonItem() {
        return null;
    }

    public int getHomesMaxGuiSlots() {
        return 0;
    }

    public enum RespawnPriority {
        anchor, bedLocation, spawn, homeLocation, worldSpawn;

        public static RespawnPriority getByName(String name) {
            return null;
        }

        public static List<String> getAsStringList() {
            return null;
        }

        public static String getAsString() {
            return null;
        }
    }
}
