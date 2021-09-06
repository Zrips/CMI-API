package com.Zrips.CMI.Modules.Kits;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class KitsManager {

    private LinkedHashMap<String, Kit> map = new LinkedHashMap<String, Kit>();
    private static HashMap<UUID, Clickery> clickeryMap = new HashMap<UUID, Clickery>();
//    private HashMap<UUID, String> chatMap = new HashMap<UUID, String>();
    private static HashMap<UUID, List<ItemStack>> cloneCache = new HashMap<UUID, List<ItemStack>>();

    private Kit NewbieKit;

    private CMI plugin;

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


    public void addKit(Kit kit) {
	map.put(kit.getConfigName().toLowerCase(), kit);
    }

    public boolean removeKit(String name) {
	return map.remove(name.toLowerCase()) != null;
    }

    public void renameKitConfigName(Kit kit, String newName) {
	map.remove(kit.getConfigName().toLowerCase());
	kit.setName(newName);
	map.put(kit.getConfigName().toLowerCase(), kit);
	save();
    }

    public void renameKitCommandName(Kit kit, String newName) {
	kit.setCommandName(newName);
	save();
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
	
	return null;
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

    public void load() {
	
    }

    private int saveId = -1;

    public void safeSave() {
	if (saveId != -1)
	    return;

	saveId = Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(CMI.getInstance(), new Runnable() {
	    @Override
	    public void run() {
		save();
		saveId = -1;
	    }
	}, 60 * 20);
    }

    public void save() {
	
    }

    private static Material getMaterial(String val) {
	
	return null;
    }

    private static Integer getData(String val) {
	return 0;
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

    private List<String> getLoreForButton(CMIUser user, Kit kit) {
	
	return null;
    }

    public void listPlayersKitsInGUI(Player player) {
	listPlayersKitsInGUI(player, 1);
    }

    public void listPlayersKitsInGUI(Player player, int page) {

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

    String newbieKitName;

    public Kit getNewbieKit() {
	if (NewbieKit == null)
	    this.NewbieKit = this.getKit(newbieKitName, true);
	return NewbieKit;
    }

    public void setNewbieKit(String name) {
	newbieKitName = name;
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
	displayName(49),

	ShowDespiteWeight(36),
	Weight(37),
	Group(28),

	Slot(15),

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
	return speed;
    }

}
