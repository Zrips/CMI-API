package com.Zrips.CMI.Modules.Homes;

import java.util.ArrayList;
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
            List<String> list = new ArrayList<String>();
            for (RespawnPriority one : RespawnPriority.values()) {
                list.add(one.name());
            }
            return list;
        }

        public static String getAsString() {
            String list = "";
            for (RespawnPriority one : RespawnPriority.values()) {
                if (!list.isEmpty())
                    list += ", ";
                list += one.name();
            }
            return list;
        }
    }

    public int getMaxHomes(CommandSender sender) {
        return 999;
    }

    public int getMaxHomes(Player player) {
        return 9999;
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
        // Only bedhomes will have exact 0.5 as x coordinates

        if (Math.abs(bedHome.getLoc().getX() % 1) != 0.5 && Math.abs(bedHome.getLoc().getZ() % 1) != 0.5)
            return;

        String l = plugin.getPlayerManager().convertBlockLocToString(bedHome.getLoc());
        HashMap<CMIUser, CmiHome> m = new HashMap<CMIUser, CmiHome>();
        m.put(user, bedHome);
        bedHome.setBed(true);
        this.bedHomes.put(l, m);
    }

    public boolean removeBedHome(Location loc) {

        return false;
    }

    public boolean isRemoveBedLocationOnBedBreak() {
        return RemoveBedLocationOnBedBreak;
    }

    public boolean openHomeGui(Player player, CMIUser user, int page) {
        if (this.isHomesGuiComplex())
            return openComplexHomeGui(player, user, page);
        return openSimpleHomeGui(player, user, page);
    }

    public boolean openComplexHomeGui(Player player, CMIUser user, int page) {

        return true;
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
