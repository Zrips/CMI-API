package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;

public class AnimationManager {

    private CMI plugin;

    RotateStand task = null;

    public static final String CMIArmorStandForSit = "CMIArmorStandForSit";
    public static final String CMIRainbowArmor = "CMIRainbowArmor";
    public static final String CMISoulBound = "CMISoulBound";
    public static final String CMIFakeSlime = "CMIFakeSlime";

    HashMap<UUID, Long> doubleClick = new HashMap<UUID, Long>();

    HashMap<UUID, LeatherAnimation> leatherArmor = new HashMap<UUID, LeatherAnimation>();

    HashMap<UUID, Chair> map = new HashMap<UUID, Chair>();
    HashMap<String, UUID> chairLoc = new HashMap<String, UUID>();

    private HashMap<UUID, UUID> riding = new HashMap<UUID, UUID>();

    public AnimationManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void clearCache(UUID uuid) {
    }

    private boolean SitOnStairs = true;
    private boolean StairsAsChairs = true;
    private boolean SlabsAsChairs = true;
    private boolean CarpetsAsChairs = true;
    private boolean RemoveFromChairOnDamage = true;
    private boolean DoubleClick = true;
    private int DoubleClickDelay = 200;
    private int chairRange = 200;

    List<CMIInventorySlot> armorTypes = new ArrayList<CMIInventorySlot>(Arrays.asList(CMIInventorySlot.Helmet, CMIInventorySlot.ChestPlate, CMIInventorySlot.Pants, CMIInventorySlot.Boots));

    public enum LeatherAnimationType {
	Rainbow(1), Health(2), Biome(3), Day(4);

	private Integer id;

	LeatherAnimationType(Integer id) {
	    this.id = id;
	}

	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public static LeatherAnimationType getById(int id) {
	    for (LeatherAnimationType one : values()) {
		if (one.getId() == id)
		    return one;
	    }
	    return null;
	}

	public static LeatherAnimationType getByName(String name) {
	    for (LeatherAnimationType one : values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}

    }

    public void addLeatherArmor(Player player) {

    }

    private int autoTimerBukkitId = 0;

    public void stopLeatherUpdate() {
	if (autoTimerBukkitId != 0) {
	    Bukkit.getScheduler().cancelTask(autoTimerBukkitId);
	    autoTimerBukkitId = 0;
	}
    }

    public static int getIntFromColor(int Red, int Green, int Blue) {
	Red = (Red << 16) & 0x00FF0000;
	Green = (Green << 8) & 0x0000FF00;
	Blue = Blue & 0x000000FF;

	return 0xFF000000 | Red | Green | Blue;
    }

    public boolean isDoubleClickWait(Player player) {

	return false;
    }

    public void loadConfig() {

    }

    public class Chair {
	private Entity ent = null;
	private Location ChairBlockLoc = null;
	private Location armorStandLoc = null;
	private long lastCheck = 0L;
	private boolean persistent = false;

	public Entity getEnt() {
	    return ent;
	}

	public Chair setEnt(Entity ent) {
	    this.ent = ent;
	    return this;
	}

	public Location getChairLoc() {
	    return ChairBlockLoc;
	}

	public Chair setChairLoc(Location chairLoc) {
	    this.ChairBlockLoc = chairLoc;
	    return this;
	}

	public Location getArmorStandLoc() {
	    return armorStandLoc;
	}

	public Chair setArmorStandLoc(Location armorStandLoc) {
	    this.armorStandLoc = armorStandLoc;
	    return this;
	}

	public long getLastCheck() {
	    return lastCheck;
	}

	public void setLastCheck(long lastCheck) {
	    this.lastCheck = lastCheck;
	}

	public boolean isPersistent() {
	    return persistent;
	}

	public void setPersistent(boolean persistent) {
	    this.persistent = persistent;
	}

    }

    public boolean isValidChairBlock(Block block) {

	return true;
    }

    public void sit(Player player) {
	sit(player, false);
    }

    public void sit(Player player, boolean persistent) {
	sit(player, player.getLocation(), persistent);
    }

    public void sit(Player player, Location location, boolean persistent) {
	Chair chair = new Chair().setArmorStandLoc(location.clone().add(0.0D, -1.7D, 0.0D)).setChairLoc(location.clone().add(0, -1, 0));
	chair.setPersistent(persistent);
	if (sit(player, chair)) {
	    chairLoc.put(plugin.getUtilManager().convertLocToStringShort(location.clone().add(0, -1, 0)), player.getUniqueId());
	}
    }

    public boolean isSomeOneSittingHere(Block block) {
	UUID who = chairLoc.get(plugin.getUtilManager().convertLocToStringShort(block.getLocation().clone()));
	return who != null;
    }

    private static Vector getStairLedgeDirection(Block block) {

	return new Vector(0, 0, 0);
    }

    public void sit(Player player, Block block) {
	sit(player, block, false);
    }

    public void sit(Player player, Block block, boolean persistent) {

    }

    public boolean isSitting(Player player) {
	if (map.isEmpty())
	    return false;
	return map.containsKey(player.getUniqueId());
    }

    public Entity getChair(Player player) {
	if (map.isEmpty())
	    return null;
	Chair chair = map.get(player.getUniqueId());
	return chair == null ? null : chair.getEnt();
    }

    public void sitOnPlayer(Player player, Player target) {

    }

    private boolean sit(Player player, Chair chair) {

	return true;
    }

    @Deprecated
    public void removePlayer(UUID uuid) {
	Player player = Bukkit.getPlayer(uuid);
	if (player != null)
	    removePlayer(player);
    }

    @Deprecated
    public void removePlayer(final Player player) {
	removePlayer(player, true);
    }

    @Deprecated
    public void removePlayer(final Player player, boolean delay) {
	removePlayerFromChair(player, delay, false);
    }

    public void removePlayerFromChair(UUID uuid) {
	Player player = Bukkit.getPlayer(uuid);
	if (player != null)
	    removePlayerFromChair(player);
    }

    public void removePlayerFromChair(final Player player) {
	removePlayerFromChair(player, true);
    }

    public void removePlayerFromChair(final Player player, boolean delay) {
	removePlayerFromChair(player, delay, false);
    }

    public void removePlayerFromChair(final Player player, boolean delay, boolean center) {

    }

    private void tpPlayer(Player player, Chair chair, boolean center) {

    }

    private void updateSitTask() {

    }

    public boolean isSitOnStairs() {
	return SitOnStairs;
    }

    public void setSitOnStairs(boolean sitOnStairs) {
	SitOnStairs = sitOnStairs;
    }

    public boolean isSlabsAsChairs() {
	return SlabsAsChairs;
    }

    public boolean isStairsAsChairs() {
	return StairsAsChairs;
    }

    public UUID removeRiding(UUID uuid) {
	return riding.remove(uuid);
    }

    public boolean isRiding(UUID uuid) {
	return riding.containsKey(uuid);
    }

    public UUID isBeingRiden(UUID uuid) {
	for (Entry<UUID, UUID> one : riding.entrySet()) {
	    if (one.getValue().equals(uuid))
		return one.getKey();
	}
	return null;
    }

    public void addRiding(UUID riding, UUID vehicle) {
	this.riding.put(riding, vehicle);
    }

    public boolean isDoubleClick() {
	return DoubleClick;
    }

    public int getChairRange() {
	return chairRange;
    }

    public boolean isRemoveFromChairOnDamage() {
	return RemoveFromChairOnDamage;
    }

    private class RotateStand extends BukkitRunnable {
	private BukkitTask id = null;

	public void stop() {
	    if (id != null)
		id.cancel();
	}

	public RotateStand() {
	    id = runTaskTimerAsynchronously(plugin, 0L, 1L);
	}

	private Method method = null;
	private Field field = null;

	@Override
	public void run() {

	}
    }

}
