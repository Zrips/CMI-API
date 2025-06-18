package com.Zrips.CMI.Modules.Warps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class WarpManager {
    private CMI plugin;
    LinkedHashMap<String, CmiWarp> warps;
    HashMap<UUID, HashMap<String, CmiWarp>> userWarps;
    private boolean warpGUI;
    private boolean GUIOnCreation;
    private boolean warpShowCreator;
    private boolean warpRequirePerm;
    private int warpPerPage;
    private int MinLength;
    private int MaxLength;
    private Boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;
    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;
    private String fileName;
    boolean saving;
    private CMITask saveId;

    public WarpManager(CMI plugin) {
    }

    public void onDisable() {
    }

    public HashMap<String, CmiWarp> getWarps() {
        return null;
    }

    public int getWarpCount(Player player) {
        return 0;
    }

    public int getMaxWarps(CommandSender sender) {
        return 0;
    }

    public int getMaxWarps(Player player) {
        return 0;
    }

    public List<CmiWarp> getWarps(Player player, String group) {
        return null;
    }

    public List<CmiWarp> getWarps(Player player) {
        return null;
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group) {
        return null;
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden) {
        return null;
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden, boolean onlyOwn) {
        return null;
    }

    private void process(Player player, HashMap<Integer, HashMap<Integer, CmiWarp>> w, LinkedHashMap<String, CmiWarp> copyWarps, List<CmiWarp> leftOver, String group, boolean admin, boolean includeHidden,
        boolean onlyOwn, boolean first) {
    }

    public HashMap<Integer, HashMap<Integer, CmiWarp>> getPagedWarps(Player player, String group, boolean includeHidden, boolean onlyOwn) {
        return null;
    }

    public void openWarpEditor(Player player, String warp) {
    }

    public void openWarpEditor(Player player, CmiWarp warp) {
    }

    public List<CmiWarp> getWarps(int page, String group) {
        return null;
    }

    public int getPageCountFrom(int page, String group) {
        return 0;
    }

    public int getPageCount(Player player) {
        return 0;
    }

    public int getPageCount(List<CmiWarp> w) {
        return 0;
    }

    public List<CmiWarp> getWarps(int page, Integer slot, String group) {
        return null;
    }

    private static int slotToGUIrelativeSlot(int slot) {
        return 0;
    }

    public CMIGui openComplexGUI(Player player, int page, String group) {
        return null;
    }

    public CMIGui openComplexGUI(Player player, int page, HashMap<Integer, HashMap<Integer, CmiWarp>> warpMap) {
        return null;
    }

    public CMIGui openGUI(Player player, int page, String group) {
        return null;
    }

    public CMIGui openGUI(Player player, List<CmiWarp> warpList, String group) {
        return null;
    }

    public void remove(CmiWarp warp) {
    }

    public void addWarp(CmiWarp warp) {
    }

    public void addWarp(CmiWarp warp, boolean save) {
    }

    public CmiWarp getWarp(Player player, String name) {
        return null;
    }

    public CmiWarp getWarp(String name) {
        return null;
    }

    public void loadConfig(ConfigReader cfg) {
    }

    public boolean isWarpGUI() {
        return false;
    }

    public void load() {
    }

    public void safeSave() {
    }

    public void asyncSave() {
    }

    public void save() {
    }

    public int getWarpPerPage() {
        return 0;
    }

    public boolean isWarpShowCreator() {
        return false;
    }

    public boolean isGUIOnCreation() {
        return false;
    }

    public int getMinLength() {
        return 0;
    }

    public void setMinLenght(int minLenght) {
    }

    public int getMaxLength() {
        return 0;
    }

    public void setMaxLenght(int maxLenght) {
    }

    public boolean isWarpRequirePerm() {
        return false;
    }

    private enum warpEditorSlots {
        icon(10), offIcon(19), randomYaw(20), autoLore(11), permission(13), reqPermission(22), hidden(32), group(25), displayName(34), iconSlot(14), page(23), back(8), location(37), seclocation(38),
        repeat(39);

        private int slot;

        warpEditorSlots(int slot) {
        }

        public int getSlot() {
            return 0;
        }

        public void setSlot(int slot) {
        }
    }
}
