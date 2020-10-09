package com.Zrips.CMI.Modules.SavedInv;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.GUI.CMIGui;

public class SavedInventoryManager {

    private HashMap<UUID, SavedInventories> map = new HashMap<UUID, SavedInventories>();
    private CMI plugin;

    public SavedInventoryManager(CMI plugin) {
	this.plugin = plugin;
    }

    private SavedInventories getInventories(UUID uuid) {
	return map.get(uuid);
    }

    public void addInventory(CMIUser user, CMIInventory inventory) {
	addInventory(user, inventory, null);
    }

    public void addInventory(CMIUser user, CMIInventory inventory, Integer id) {
    }

    private void checkInvLimit(SavedInventories inventories) {
    }

    public CMIInventory getInvById(CMIUser user, int id) {
	return null;
    }

    public CMIInventory getFirstInv(CMIUser user) {
	return getFirstInv(getInventories(user));
    }

    public CMIInventory getFirstInv(SavedInventories inventories) {
	return null;
    }

    public CMIInventory getLastInv(CMIUser user) {
	return null;
    }

    public CMIInventory getNextInv(CMIUser user, int id) {
	return null;
    }

    public CMIInventory getPrevInv(CMIUser user, int id) {
	return null;
    }

    public SavedInventories getInventories(CMIUser user) {
	return null;
    }

    public void loadInventories(CMIUser user) {
    }

    public void loadInventories(CMIUser user, String invString) {

    }

    public boolean saveAllInventories(UUID uuid) {
	return true;
    }

    public CMIInventory saveInv(Player player, Entity killer, DamageCause cause) {
	return saveInv(player, killer, cause, null);
    }

    public CMIInventory saveInv(Player player, Entity killer, DamageCause cause, Integer id) {

	return null;
    }

    @SuppressWarnings("deprecation")
    public CMIInventory generateCMIInventory(Player player, Entity killer, DamageCause cause) {

	return null;
    }

    @SuppressWarnings("unchecked")
    public CMIInventory generateInvFromMap(HashMap<String, Object> map) {

	return null;
    }

    public HashMap<String, Object> generateMapFromPlayerInv(CMIInventory inv) {

	return null;
    }

    private static String serialize(HashMap<String, Object> map) {

	return null;
    }

    @SuppressWarnings("unchecked")
    private static HashMap<String, Object> deserialize(String string) {

	return null;
    }

    private void fillFields(CMIGui gui, CMIInventory inv) {

    }

    public void updateCMIInventoryItems(Inventory top, CMIInventory inv) {

    }

    public void openSavedInv(Player player, CMIInventory inv, boolean preview) {

    }

    public void InvList(CommandSender sender, Player player) {
    }

    public void InvList(CommandSender sender, CMIUser user) {

    }

    @SuppressWarnings("deprecation")
    public boolean loadInv(CommandSender sender, CMIUser user, CMIInventory inv) {

	return true;
    }

    public boolean removeInventory(CMIUser user, int id) {

	return true;
    }

    public int showTimer(Player player, int current, int found, int total, int skipped, int currentplace) {
	return 1;
    }

    private Boolean restoreHP = true;
    private Boolean restoreXP = true;
    private Boolean restoreFood = true;
    private Boolean restoreSaturation = true;
    private Boolean restorePotions = true;
    private Boolean restoreItems = true;
    private Boolean SaveOnDeath = false;
    private Boolean ignoreEmpty = false;
    private Boolean SaveOnDeathRequiresPermission = false;
    private int SavedInventorys = 10;

    public void loadConfig() {

    }

    public Boolean isSaveOnDeath() {
	return SaveOnDeath;
    }

    public Boolean isSaveOnDeathRequiresPermission() {
	return SaveOnDeathRequiresPermission;
    }

    public int getMaxSavedInventorys() {
	return SavedInventorys;
    }

    public HashMap<UUID, SavedInventories> getMap() {
	return map;
    }

    public void clearAll() {
	map.clear();
    }
}
