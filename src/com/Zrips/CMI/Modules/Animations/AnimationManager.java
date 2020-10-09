package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIBlock;
import com.Zrips.CMI.Containers.CMIBlock.Bisect;
import com.Zrips.CMI.Containers.CMIBlock.StairShape;
import com.Zrips.CMI.Containers.CMIBlock.blockDirection;
import com.Zrips.CMI.Containers.CMIHitBox;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.CmiItems.ItemManager.SlabType;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Worlds.CMIWorld;
import com.Zrips.CMI.Modules.Worlds.WorldManager.CMIBiome;
import com.Zrips.CMI.events.CMIPlayerSitEvent;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class AnimationManager {

    private CMI plugin;

    RotateStand task = null;

    public static final String CMIArmorStandForSit = "CMIArmorStandForSit";
    public static final String CMIRainbowArmor = "CMIRainbowArmor";
    public static final String CMISoulBound = "CMISoulBound";

    HashMap<UUID, Long> doubleClick = new HashMap<UUID, Long>();

    HashMap<UUID, LeatherAnimation> leatherArmor = new HashMap<UUID, LeatherAnimation>();

    HashMap<UUID, Chair> map = new HashMap<UUID, Chair>();
    HashMap<String, UUID> chairLoc = new HashMap<String, UUID>();

    private HashMap<UUID, UUID> riding = new HashMap<UUID, UUID>();

    public AnimationManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void clearCache(UUID uuid) {
	doubleClick.remove(uuid);
	leatherArmor.remove(uuid);
	riding.remove(uuid);
	Chair chair = map.remove(uuid);
	if (chair != null && chair.getChairLoc() != null)
	    chairLoc.remove(plugin.getUtilManager().convertLocToStringShort(chair.getChairLoc()));
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
    }

    private Runnable autoTimer = new Runnable() {
	@Override
	public void run() {
	    try {
		checkLeatherArmors();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
    };

    private void checkLeatherArmors() {

    }

    private static void setColor(CMIUser user, LeatherAnimationType type, List<CMIInventorySlot> slot, LeatherAnimation anim) {

    }

    public static int getIntFromColor(int Red, int Green, int Blue) {
	return 0;
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

    }

    public boolean isValidChairBlock(Block block) {
	return true;
    }

    public void sit(Player player) {
    }

    public boolean isSomeOneSittingHere(Block block) {
	UUID who = chairLoc.get(plugin.getUtilManager().convertLocToStringShort(block.getLocation().clone()));
	return who != null;
    }

    private static Vector getStairLedgeDirection(Block block) {

	return null;
    }

    public void sit(Player player, Block block) {
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

//    public DeadBodies getDeadManager() {
//	return deadmanager;
//    }

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

	@Override
	public void run() {
	   
	}
    }

}
