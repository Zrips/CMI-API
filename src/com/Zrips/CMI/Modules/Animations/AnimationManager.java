package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIBlock;
import com.Zrips.CMI.Containers.CMIBlock.blockDirection;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class AnimationManager {

    private CMI plugin;

    RotateStand task = null;

    public static final String CMIArmorStandForSit = "CMIArmorStandForSit";

//    private DeadBodies deadmanager;

    public AnimationManager(CMI plugin) {
	this.plugin = plugin;
//	this.deadmanager = new DeadBodies();
    }

    private boolean SitOnStairs = true;
    private boolean StairsAsChairs = true;
    private boolean SlabsAsChairs = true;

    public void loadConfig() {

    }

    HashMap<UUID, Entity> map = new HashMap<UUID, Entity>();

    public boolean isValidChairBlock(Block block) {
	return false;
    }

    public void sit(Player player) {
    }

    public void sit(Player player, Block block) {

    }

    public boolean isSitting(Player player) {
	return false;
    }

    public Entity getChair(Player player) {
	return null;
    }

    public void sit(Player player, Location loc) {

    }

    public void removePlayer(Player player) {

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
	    return;
	}
    }
}
