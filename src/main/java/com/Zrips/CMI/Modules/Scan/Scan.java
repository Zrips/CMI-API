package com.Zrips.CMI.Modules.Scan;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

@SuppressWarnings("deprecation")
public class Scan {

    public Pattern regionPattern = Pattern.compile("r\\.([0-9-]+)\\.([0-9-]+)\\.mca");
    public ConcurrentHashMap<UUID, ScanInfo> ScanInfo = new ConcurrentHashMap<UUID, ScanInfo>();
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

    private static void RemoveItemsFromBlock(List<ItemStack> toRemove, Block block) {

    }

    private void RemoveItemsFromEntity(List<ItemStack> toRemove, Entity ent) {

    }

    public boolean isValidContainer(Block block) {
	return block.getState() instanceof InventoryHolder;
    }

    private static ScanResultLocations checkArmorStand(ScanResultLocations ScanResult, Entity oneEnt) {

	return null;
    }

    private static void removeFromArmorStand(List<ItemStack> toRemove, Entity oneEnt) {
	
    }

    public List<ItemStack> CheckContent(ScanInfo scan, ScanResultLocations ScanResult, Block block, Entity ent) {

	return null;
    }

    @SuppressWarnings("incomplete-switch")
    public Location findLocation(Location loc, BlockFace oldDir, boolean checkDouble, int rotate) {

	return null;
    }

    public void setCheckedPlace(Player player, int id) {
	    }
}
