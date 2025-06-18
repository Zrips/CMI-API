package com.Zrips.CMI.Modules.Kits;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIKitUsage;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class KitsManager {
    private LinkedHashMap<String, Kit> map;
    private static HashMap<UUID, Clickery> clickeryMap;
    private static HashMap<UUID, List<ItemStack>> cloneCache;
    private String NewbieKitName;
    private Kit NewbieKit;
    private CMI plugin;
    private boolean KitsGUI;
    private boolean KitsGUIFillEmptyFields;
    private boolean allowKitPreview;
    private boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;
    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;
    private static ConcurrentHashMap<UUID, LinkedHashMap<String, CMIKitUsage>> kitsData;
    private String fileName;
    private CMITask saveTask;
    private static int min;

    public void clearCache(UUID uuid) {
    }

    public void onDisable() {
    }

    public KitsManager(CMI plugin) {
    }

    public static LinkedHashMap<String, CMIKitUsage> getUserKits(UUID uuid) {
        return null;
    }

    @Nullable
    public static HashMap<String, Object> getPlayersKitsDataForSave(UUID uuid) {
        return null;
    }

    public void loadConfig(ConfigReader cfg) {
    }

    public void addKit(Kit kit) {
    }

    public boolean removeKit(String name) {
        return false;
    }

    public void renameKitConfigName(Kit kit, String newName) {
    }

    public void renameKitCommandName(Kit kit, String newName) {
    }

    public HashMap<String, List<Kit>> getValidKitsForPlayer(Player player, boolean includePreview) {
        return null;
    }

    public Kit getKit(Player player, String name) {
        return null;
    }

    public Kit getKit(Player player, String name, boolean ignorePerm) {
        return null;
    }

    public Kit getKit(Player player, String name, boolean ignorePerm, boolean includePreview) {
        return null;
    }

    public Kit getKit(String name) {
        return null;
    }

    public Kit getKit(String name, boolean getdisabled) {
        return null;
    }

    public List<Kit> getKitsByCommandName(Kit kit) {
        return null;
    }

    public List<Kit> getGroupedKits(String kitConfigName) {
        return null;
    }

    public List<Kit> getGroupedKits(Kit kit) {
        return null;
    }

    public LinkedHashMap<String, Kit> getKitMap() {
        return null;
    }

    public void setKits(LinkedHashMap<String, Kit> map) {
    }

    public void load() {
    }

    private void parseItems(ConfigurationSection section, Kit kit) {
    }

    public void safeSave() {
    }

    public void save() {
    }

    private static Material getMaterial(String val) {
        return null;
    }

    private static Integer getData(String val) {
        return null;
    }

    public ItemStack updateItemStackLore(ItemStack item, Player player, Kit kit) {
        return null;
    }

    public String processText(String text, Player player, Kit kit) {
        return null;
    }

    public void listPlayersKits(Player player) {
    }

    public void listPlayersKits(CommandSender sender, Player player, int page) {
    }

    private List<String> getLoreForButton(CMIUser user, Kit oneKit) {
        return null;
    }

    private int slotToGUIrelativeSlot(int slot) {
        return 0;
    }

    public void listPlayersKitsInComplexGUI(Player player, int page) {
    }

    public void listPlayersKitsInGUI(Player player) {
    }

    public void listPlayersKitsInGUI(Player player, int page) {
    }

    public void listPlayersKitsForEditing(Player player, Integer page) {
    }

    public boolean startChatKitAdd(Player player, String kitName) {
        return false;
    }

    public boolean startChatKitRename(Player player, Kit kit) {
        return false;
    }

    public boolean startChatKitCommandRename(Player player, Kit kit) {
        return false;
    }

    public boolean startChatKitGroupRename(Player player, Kit kit) {
        return false;
    }

    public void startChatKitRemove(Player player, Kit kit, boolean confirmed) {
    }

    public void giveKit(Player player, Kit kit) {
    }

    public void giveKit(Player player, Kit kit, boolean giveItems) {
    }

    public Kit getNewbieKit() {
        return null;
    }

    public void openGuiEditorMain(Kit kit, Player player, boolean editor) {
    }

    public static void saveOnClose() {
    }

    public static void ItemClickInGui(Player player, Kit kit) {
    }

    public static void openGuiEditorSettingsPreview(Player player, Kit kit) {
    }

    public void openGuiEditorSettings(Kit kit, Player player, boolean editor) {
    }

    private static int getSpeed(UUID uuid) {
        return 0;
    }

    @Deprecated
    public CMIItemStack getKitPreviewIcon(CMIKitGUILayout type) {
        return null;
    }

    public boolean isKitsGUI() {
        return false;
    }

    public boolean isKitsGUIFillEmptyFields() {
        return false;
    }

    public enum CMIKitGUILayout {
        Separator(-1), OffHand(11), Helmet(0), Chest(9), Legs(1), Boots(10), Clone(4), configName(39), commandName(40), fileName(48), displayName(49), ShowDespiteWeight(36), Weight(37), Group(28), Slot(
            15), Page(6), DropItems(35), Icon(12), IconCD(13), Delay(10), Money(21), Exp(22), Back(9), Commands(33), Conditions(42), ShowWithoutUsage(18), Usages(19), Description(24), Enabled(8), Settings(
                17), MainMenu(17);

        private int slots;
        private CMIItemStack icon = null;

        CMIKitGUILayout(Integer slot) {
        }

        public Integer getSlot() {
            return null;
        }

        public static CMIKitGUILayout getButton(int slot) {
            return null;
        }

        public CMIItemStack getIcon() {
            return null;
        }

        public void setIcon(CMIItemStack icon) {
        }
    }
}
