package com.Zrips.CMI.Modules.Kits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class KitsManager {

    private LinkedHashMap<String, Kit> map = new LinkedHashMap<String, Kit>();
    private static HashMap<UUID, Clickery> clickeryMap = new HashMap<UUID, Clickery>();
//    private HashMap<UUID, String> chatMap = new HashMap<UUID, String>();
    private static HashMap<UUID, List<ItemStack>> cloneCache = new HashMap<UUID, List<ItemStack>>();

    private String NewbieKitName;
    private Kit NewbieKit;

    private CMI plugin;

    private boolean KitsGUI = true;
//    private boolean complexGui = true;
    private boolean KitsGUIFillEmptyFields = true;
    private boolean allowKitPreview = true;

    HashMap<CMIKitGUILayout, CMIItemStack> kitButtons = new HashMap<CMIKitGUILayout, CMIItemStack>();

    private boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;

    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;

    public void clearCache(UUID uuid) {
        clickeryMap.remove(uuid);
        cloneCache.remove(uuid);
//	chatMap.remove(uuid);
    }

    public void onDisable() {

    }

    public KitsManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void loadConfig(ConfigReader cfg) {

    }

    public void addKit(Kit kit) {
        map.put(kit.getConfigName().toLowerCase(), kit);
    }

    public boolean removeKit(String name) {
        return map.remove(name.toLowerCase()) != null;
    }

    public void renameKitConfigName(Kit kit, String newName) {

    }

    public void renameKitCommandName(Kit kit, String newName) {

    }

    public HashMap<String, List<Kit>> getValidKitsForPlayer(Player player, boolean includePreview) {

        return null;
    }

    public Kit getKit(Player player, String name) {
        return getKit(player, name, false);
    }

    public Kit getKit(Player player, String name, boolean ignorePerm) {
        return getKit(player, name, ignorePerm, false);
    }

    public Kit getKit(Player player, String name, boolean ignorePerm, boolean includePreview) {

        return null;
    }

    public Kit getKit(String name, boolean getdisabled) {

        return null;
    }

    public List<Kit> getKitsByCommandName(Kit kit) {
        List<Kit> l = new ArrayList<Kit>();
        for (Entry<String, Kit> one : map.entrySet()) {
            if (one.getValue().getCommandName().equalsIgnoreCase(kit.getCommandName()))
                l.add(one.getValue());
        }
        return l;
    }

    public List<Kit> getGroupedKits(Kit kit) {

        return null;
    }

    public LinkedHashMap<String, Kit> getKitMap() {
        return map;
    }

    public void setKits(LinkedHashMap<String, Kit> map) {
        this.map = map;
    }

    private String fileName = "Kits.yml";

    public void load() {

    }

    private CMITask saveTask = null;

    public void safeSave() {
        if (saveTask != null)
            return;

        saveTask = CMIScheduler.runLaterAsync(() -> {
            save();
            saveTask = null;
        }, 1 * 20);
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
        listPlayersKits(null, player, 1);
    }

    public void listPlayersKits(CommandSender sender, Player player, int page) {

    }

    private List<String> getLoreForButton(CMIUser user, Kit oneKit) {

        return null;
    }

    private int slotToGUIrelativeSlot(int slot) {
        return 9 + (((slot) / 7) * 2 + 1) + slot;
    }

    public void listPlayersKitsInComplexGUI(Player player, int page) {

    }

    public void listPlayersKitsInGUI(Player player) {
        listPlayersKitsInGUI(player, 1);
    }

    public void listPlayersKitsInGUI(Player player, int page) {
//	if (complexGui)
        listPlayersKitsInComplexGUI(player, page);
//	else
//	    listPlayersKitsInSimpleGUI(player, page);
    }

    @Deprecated
    public void listPlayersKitsInSimpleGUI(Player player, int page) {

    }

    public void listPlayersKitsForEditing(Player player, Integer page) {

    }

    public boolean startChatKitAdd(Player player, String kitName) {

        return true;
    }

    public boolean startChatKitRename(Player player, Kit kit) {

        return true;
    }

    public boolean startChatKitCommandRename(Player player, Kit kit) {

        return true;
    }

    public boolean startChatKitGroupRename(Player player, Kit kit) {

        return true;
    }

    public void startChatKitRemove(Player player, Kit kit, boolean confirmed) {

    }

    private static int min = 36;

    public void giveKit(Player player, Kit kit) {
        giveKit(player, kit, true);
    }

    public void giveKit(Player player, Kit kit, boolean giveItems) {

    }

    public Kit getNewbieKit() {
        if (NewbieKit == null)
            this.NewbieKit = this.getKit(NewbieKitName, true);
        return NewbieKit;
    }

    public enum CMIKitGUILayout {
        Separator(-1),
        OffHand(11),
        Helmet(0),
        Chest(9),
        Legs(1),
        Boots(10),
        Clone(4),

        configName(39),
        commandName(40),
        fileName(48),
        displayName(49),

        ShowDespiteWeight(36),
        Weight(37),
        Group(28),

        Slot(15),
        Page(6),

        DropItems(35),

        Icon(12),
        IconCD(13),

        Delay(10),

        Money(21),
        Exp(22),
        Back(9),

        Commands(33),
        Conditions(42),
        ShowWithoutUsage(18),
        Usages(19),
        Description(24),
        Enabled(8),
        Settings(17),
        MainMenu(17);

        private Integer slots;

        CMIKitGUILayout(Integer slot) {
            this.slots = slot;
        }

        public Integer getSlot() {
            return slots;
        }

        public static CMIKitGUILayout getButton(int slot) {
            for (CMIKitGUILayout one : CMIKitGUILayout.values()) {
                if (one.getSlot() == slot)
                    return one;
            }
            return null;
        }
    }

    public void openGuiEditorMain(Kit kit, Player player, boolean editor) {

    }

    public static void saveOnClose() {
        CMI.getInstance().getKitsManager().save();
    }

    public static void ItemClickInGui(final Player player, final Kit kit) {

    }

    public static void openGuiEditorSettingsPreview(Player player, Kit kit) {
        CMI.getInstance().getKitsManager().openGuiEditorSettings(kit, player, false);
    }

    public void openGuiEditorSettings(final Kit kit, final Player player, final boolean editor) {

    }

    private static int getSpeed(UUID uuid) {
        Clickery clickery = clickeryMap.get(uuid);
        int speed = 1;
        if (clickery == null) {
            clickeryMap.put(uuid, new Clickery());
        } else
            speed = clickery.getSpeed();
        return speed;
    }

    public CMIItemStack getKitPreviewIcon(CMIKitGUILayout type) {
        return kitButtons.get(type) == null ? new CMIItemStack(new ItemStack(Material.STONE)) : kitButtons.get(type);
    }

    public boolean isKitsGUI() {
        return KitsGUI;
    }

    public boolean isKitsGUIFillEmptyFields() {
        return KitsGUIFillEmptyFields;
    }
}
