package com.Zrips.CMI.Modules.Selection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class SelectionManager {
    protected Map<String, Location> playerLoc1;
    protected Map<String, Location> playerLoc2;
    protected CMI plugin;

    private HashMap<String, Visualizer> vMap = new HashMap<String, Visualizer>();

    public SelectionManager(CMI plugin) {
	this.plugin = plugin;
	playerLoc1 = Collections.synchronizedMap(new HashMap<String, Location>());
	playerLoc2 = Collections.synchronizedMap(new HashMap<String, Location>());
    }

    public void updateLocations(Player player, Location loc1, Location loc2) {
	updateLocations(player, loc1, loc2, false);
    }

    public void updateLocations(Player player, Location loc1, Location loc2, boolean force) {
    }

    public void placeLoc1(Player player, Location loc) {
	placeLoc1(player, loc, false);
    }

    public void placeLoc1(Player player, Location loc, boolean show) {
    }

    public void placeLoc2(Player player, Location loc) {
    }

    public void placeLoc2(Player player, Location loc, boolean show) {
    }

    public void afterSelectionUpdate(Player player) {
    }

    public void afterSelectionUpdate(Player player, boolean force) {

    }

    public Location getPlayerLoc1(Player player) {
	return getPlayerLoc1(player.getName());
    }

    public Location getPlayerLoc1(String player) {
	return playerLoc1.get(player);
    }

    public Location getPlayerLoc2(Player player) {
	return getPlayerLoc2(player.getName());
    }

    public Location getPlayerLoc2(String player) {
	return playerLoc2.get(player);
    }

    public CuboidArea getSelectionCuboid(Player player) {
	return getSelectionCuboid(player.getName());
    }

    public CuboidArea getSelectionCuboid(String player) {
	return null;
    }

    public boolean hasPlacedBoth(Player player) {
	return hasPlacedBoth(player.getName());
    }

    public boolean hasPlacedBoth(String player) {
	return playerLoc1.containsKey(player) && playerLoc2.containsKey(player);
    }

    public void showSelectionInfo(Player player) {
    }

    public void showBounds(final Player player, final Visualizer v) {
    }

    public List<Location> getLocations(Location lowLoc, Location loc, Double TX, Double TY, Double TZ, Double Range, boolean StartFromZero) {

	return null;
    }

    public List<Location> GetLocationsWallsByData(Location loc, Double TX, Double TY, Double TZ, Location lowLoc, SelectionSides Sides,
	double Range) {
	return null;
    }

    public List<Location> GetLocationsCornersByData(Location loc, Double TX, Double TY, Double TZ, Location lowLoc, SelectionSides Sides,
	double Range) {
	return null;
    }

    public boolean MakeBorders(final Player player) {

	return true;
    }

    public void clearSelection(Player player) {
    }

    public boolean worldEdit(Player player) {
	return false;
    }

    public boolean worldEditUpdate(Player player) {
	return false;
    }
}
