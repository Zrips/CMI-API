package com.Zrips.CMI.Modules.Scan;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BrewingStand;
import org.bukkit.block.Chest;
import org.bukkit.block.Dispenser;
import org.bukkit.block.DoubleChest;
import org.bukkit.block.Dropper;
import org.bukkit.block.Furnace;
import org.bukkit.block.Hopper;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.StorageMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ScanFindPlace;
import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Region.WorldInfo;

@SuppressWarnings("deprecation")
public class Scan {

    public Pattern regionPattern = Pattern.compile("r\\.([0-9-]+)\\.([0-9-]+)\\.mca");
    public ConcurrentHashMap<String, ScanInfo> ScanInfo = new ConcurrentHashMap<String, ScanInfo>();
    private CMI plugin;

    public Scan(CMI plugin) {
	this.plugin = plugin;
    }

    public void start(final ScanInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final ScanInfo scan) {

    }

    @SuppressWarnings("incomplete-switch")
    private static void RemoveItemsFromBlock(List<ItemStack> toRemove, Block block) {
    }

    private void RemoveItemsFromEntity(List<ItemStack> toRemove, Entity ent) {

    }

    public List<ItemStack> CheckContent(ScanInfo scan, Location loc, ScanResultLocations ScanResult, BlockFace dir) {

	return null;
    }

    public static void gc() {

    }

    private static boolean isEmptyPlace(Location tpLoc) {

	return false;
    }

    @SuppressWarnings("incomplete-switch")
    public Location findLocation(Location loc, BlockFace oldDir, boolean checkDouble, int rotate) {

	return null;
    }

    public void setCheckedPlace(Player player, int id) {

    }
}
