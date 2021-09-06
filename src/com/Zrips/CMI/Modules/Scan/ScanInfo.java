package com.Zrips.CMI.Modules.Scan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Region.WorldInfo;

public class ScanInfo {

    private int scheduleId = -1;

    private long showedInfo = 0L;
    private boolean showInfo = false;

    private boolean autoSpeed = true;
    private boolean messages = true;

    private boolean purge = false;
    private boolean oversize = false;

    private Player player;
    private String Playername;

    private int found = 0;

    private long startTime = 0L;

    private int speed = CMI.getInstance().getConfigManager().scanDefaultSpeed;

    private boolean running = false;

    private int amount = -1;

    List<itemInfo> itemIds = new ArrayList<itemInfo>();

    private String name = null;
    private String lore = null;
    private Enchantment enchant = null;
    private int enchantLvl = -1;

    HashMap<Integer, ArrayList<ScanResultLocations>> multimap = new HashMap<Integer, ArrayList<ScanResultLocations>>();

    private WorldInfo RI;

    private int currentId = -1;

    public ScanInfo() {
    }

    public HashMap<Integer, ArrayList<ScanResultLocations>> getLocations() {
	return this.multimap;
    }

    public void addLocation(int amount, ScanResultLocations location) {
	if (multimap.containsKey(amount)) {
	    ArrayList<ScanResultLocations> list = multimap.get(amount);
	    list.add(location);
	    multimap.put(amount, list);
	} else {
	    ArrayList<ScanResultLocations> list = new ArrayList<ScanResultLocations>();
	    list.add(location);
	    multimap.put(amount, list);
	}
    }

    public int getCurrentId() {
	return this.currentId;
    }

    public void setCurrentId(int id) {
	this.currentId = id;
    }

    public void setPurge(boolean state) {
	this.purge = state;
    }

    public boolean isPurge() {
	return this.purge;
    }

    public void setOversize(boolean state) {
	this.oversize = state;
    }

    public boolean isOversize() {
	return this.oversize;
    }

    public void setscheduleId(int id) {
	this.scheduleId = id;
    }

    public int getScheduleId() {
	return this.scheduleId;
    }

    public void setShowInfo(long time) {
	this.showedInfo = time;
    }

    public long getShowInfo() {
	return this.showedInfo;
    }

    public void setAutoSpeed(boolean autoSpeed) {
	this.autoSpeed = autoSpeed;
    }

    public boolean isAutoSpeed() {
	return this.autoSpeed;
    }

    public void setMessages(boolean messages) {
	this.messages = messages;
    }

    public boolean isMessages() {
	return this.messages;
    }

    public void setShowRegionInfo(boolean state) {
	this.showInfo = state;
    }

    public boolean isShowRegionInfo() {
	return this.showInfo;
    }

    public void addFound() {
	this.found++;
    }

    public int getFound() {
	return this.found;
    }

    public void setAmount(int q) {
	this.amount = q;
    }

    public int getAmount() {
	return this.amount;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }

    public void setEnchant(Enchantment enchant) {
	this.enchant = enchant;
    }

    public Enchantment getEnchant() {
	return this.enchant;
    }

    public void setEnchantLvl(int enchantlvl) {
	this.enchantLvl = enchantlvl;
    }

    public int getEnchantLvl() {
	return this.enchantLvl;
    }

    public void setLore(String lore) {
	this.lore = lore.toLowerCase();
    }

    public String getLore() {
	return this.lore;
    }

    public void addItemInfo(itemInfo info) {
	this.itemIds.add(info);
    }

    public List<itemInfo> getItemInfo() {
	return itemIds;
    }

    public void setSpeed(int speed) {
	this.speed = speed;
    }

    public int getSpeed() {
	return this.speed;
    }

    public void setRunning(boolean state) {
	this.running = state;
    }

    public boolean isRunning() {
	return this.running;
    }

    public void setStartTime() {
	this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
	return this.startTime;
    }

    public String getPlayerName() {
	return this.Playername;
    }

    public Player getPlayer() {
	return this.player;
    }

    public void setPlayer(Player Player) {
	this.Playername = Player.getName();
	this.player = Player;
    }

    public WorldInfo getRI() {
	return RI;
    }

    public void setRI(WorldInfo RI) {
	this.RI = RI;
    }
}
