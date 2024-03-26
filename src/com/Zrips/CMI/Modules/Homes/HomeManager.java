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
    HashMap<String, Integer> homeGroups = new HashMap<String, Integer>();

    private HashMap<String, HomeWorldLimit> homeLimits = new HashMap<String, HomeWorldLimit>();

    private boolean checkBlockbreak = false;
    private boolean pickRealBlock = false;
    private boolean homesWorldLimits = false;
    private boolean confirmation = true;
    private String defaultHomeName = "Home";
    private String defaultBedHomeName = "Home";
    private String homeNameRegex = "/([\\p{L}-]+)/ug";
    private int respawnImmortality = 0;
    private int HomesMaxGuiSlots = 99;

    private boolean HomesGui = true;
    private boolean HomesGuiComplex = true;
    private boolean guiExpanded = false;

    private CMIItemStack guiBorder = null;
    private CMIItemStack guiInfill = null;
//    private CMISound guiSound = null;

    private boolean guiInfoButton = true;
    private int guiInfoButtonSlot = 45;
    private CMIItemStack guiInfoButtonItem = null;
    private List<String> guiInfoButtonCommands = null;

    private boolean guiCloseButton = true;
    private int guiCloseButtonSlot = 45;
    private CMIItemStack guiCloseButtonItem = null;
    private List<String> guiCloseButtonCommands = null;

    private boolean guiBedButton = true;
    private int guiBedButtonSlot = 45;
    private CMIItemStack guiBedButtonItem = null;

    private boolean guiHomeButton = true;
    private int guiHomeButtonSlot = 45;
    private CMIItemStack guiHomeButtonItem = null;

    private boolean guiDeathButton = true;
    private int guiDeathButtonSlot = 45;
    private CMIItemStack guiDeathButtonItem = null;

    private int guiPrevButtonSlot = 49;
    private int guiMiddleButtonSlot = 50;
    private int guiNextButtonSlot = 51;

    private boolean HomesBedInteraction = true;
    private boolean onlyShiftBed = false;
    private boolean RemoveBedLocationOnBedBreak = true;
    private HashMap<String, List<String>> ReSpawnPriorityOrder = new HashMap<String, List<String>>();
    private HashMap<String, HashMap<CMIUser, CmiHome>> bedHomes = new HashMap<String, HashMap<CMIUser, CmiHome>>();

    public HomeManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void addHomeGroup(String group, int amount) {
        homeGroups.put(group, amount);
    }

    public enum RespawnPriority {
        anchor, bedLocation, spawn, homeLocation, worldSpawn;

        public static RespawnPriority getByName(String name) {
            for (RespawnPriority one : RespawnPriority.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }

        public static List<String> getAsStringList() {
            return null;
        }

        public static String getAsString() {
            return null;
        }
    }

    public int getMaxHomes(CommandSender sender) {
        if (sender instanceof Player)
            return getMaxHomes((Player) sender);
        return 999;
    }

    public int getMaxHomes(Player player) {
        int homes = 1;
        return homes;
    }

    public void loadConfig() {

    }

    public boolean isHomesBedInteraction() {
        return HomesBedInteraction;
    }

    public Location getReSpawnLocation(Player player) {
        return getReSpawnLocation(player, null);
    }

    public Location getReSpawnLocation(Player player, Location respawnLoc) {

        return null;
    }

    public boolean isCheckBlockbreak() {
        return checkBlockbreak;
    }

    public String getDefaultHomeName() {
        return defaultHomeName;
    }

    public String getDefaultBedHomeName() {
        return defaultBedHomeName;
    }

    public HashMap<String, HashMap<CMIUser, CmiHome>> getBedHomes() {
        return bedHomes;
    }

    public void addBedHome(CMIUser user, CmiHome bedHome) {
    }

    public boolean removeBedHome(Location loc) {
        String l = plugin.getPlayerManager().convertBlockLocToString(loc);
        HashMap<CMIUser, CmiHome> res = bedHomes.remove(l);

        return res != null;
    }

    public boolean isRemoveBedLocationOnBedBreak() {
        return RemoveBedLocationOnBedBreak;
    }

    public boolean openHomeGui(Player player, CMIUser user, int page) {

        if (page < 1)
            page = 1;

        if (this.isHomesGuiComplex())
            return openComplexHomeGui(player, user, page);
        return openSimpleHomeGui(player, user, page);
    }

    public boolean openComplexHomeGui(Player player, CMIUser user, int page) {

        return true;
    }

    private void homeEditor(Player player, CmiHome home, int page) {

    }

    public boolean openSimpleHomeGui(Player player, CMIUser user, int page) {

        return true;
    }

    public boolean isHomesGui() {
        return HomesGui;
    }

    public int getRespawnImmortality() {
        return respawnImmortality;
    }

    public String getHomeNameRegex() {
        return homeNameRegex;
    }

    public void setHomeNameRegex(String homeNameRegex) {
        this.homeNameRegex = homeNameRegex;
    }

    public boolean isPickRealBlock() {
        return pickRealBlock;
    }

    public boolean isOnlyShiftBed() {
        return onlyShiftBed;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public boolean isHomesWorldLimits() {
        return homesWorldLimits;
    }

    public void setHomesWorldLimits(boolean homesWorldLimits) {
        this.homesWorldLimits = homesWorldLimits;
    }

    public int getWorldLimit(String worldName) {
        HomeWorldLimit limit = getWorldLimitObject(worldName);
        if (limit == null)
            return -1;
        return limit.getLimit();
    }

    public HomeWorldLimit getWorldLimitObject(String worldName) {
        return homeLimits.get(worldName.toLowerCase());
    }

    public boolean isHomesGuiComplex() {
        return HomesGuiComplex;
    }

    public int getGuiCloseButtonSlot() {
        return guiCloseButtonSlot;
    }

    public CMIItemStack getGuiCloseButtonItem() {
        return guiCloseButtonItem;
    }

    public int getHomesMaxGuiSlots() {
        return HomesMaxGuiSlots;
    }
}
