package com.Zrips.CMI.Modules.Selection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class SelectionManager {

    protected Map<UUID, CuboidArea> selections;
    protected CMI plugin;

    public static final int MIN_HEIGHT = 0;

    private HashMap<UUID, Visualizer> vMap = new HashMap<UUID, Visualizer>();

    public SelectionManager(CMI plugin) {
	this.plugin = plugin;
	selections = Collections.synchronizedMap(new HashMap<UUID, CuboidArea>());
    }

    public void hideSelection(Player player) {
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
	placeLoc2(player, loc, false);
    }

    public void placeLoc2(Player player, Location loc, boolean show) {
	
    }
	
	

    public void afterSelectionUpdate(Player player) {
	afterSelectionUpdate(player, false);
    }

    public void afterSelectionUpdate(Player player, boolean force) {
	
    }
	

    @Deprecated
    public Location getPlayerLoc1(Player player) {
	return getPlayerLoc1(player.getUniqueId());
    }

    @Deprecated
    public Location getPlayerLoc1(String player) {
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user == null)
	    return null;
	return getPlayerLoc1(user.getUniqueId());
    }

    @Deprecated
    public Location getPlayerLoc1(UUID uuid) {
	CuboidArea selection = selections.get(uuid);
	if (selection == null)
	    return null;
	return selection.getLowLoc();
    }

    @Deprecated
    public Location getPlayerLoc2(Player player) {
	return getPlayerLoc2(player.getUniqueId());
    }

    @Deprecated
    public Location getPlayerLoc2(String player) {
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user == null)
	    return null;
	return getPlayerLoc2(user.getUniqueId());
    }

    @Deprecated
    public Location getPlayerLoc2(UUID uuid) {
	return null;
    }

    public CuboidArea getSelectionCuboid(Player player) {
	return getSelectionCuboid(player.getUniqueId());
    }

    public void setSelectionCuboid(Player player, CuboidArea area) {
	this.selections.put(player.getUniqueId(), area);
    }

    @Deprecated
    public CuboidArea getSelectionCuboid(String player) {
	return null;
    }

    public CuboidArea getSelectionCuboid(UUID uuid) {
	return selections.get(uuid);
    }

    public boolean hasPlacedBoth(Player player) {
	return hasPlacedBoth(player.getUniqueId());
    }

    @Deprecated
    public boolean hasPlacedBoth(String player) {
	return false;
    }

    public boolean hasPlacedBoth(UUID uuid) {
	CuboidArea selection = selections.get(uuid);
	if (selection == null)
	    return false;
	return selection.valid();
    }

    @Deprecated
    public void showSelectionInfo(Player player) {
	showSelection(player);
    }

    public void showSelection(Player player) {
    }

    public void showBounds(final Player player, final Visualizer v) {
    }

    public List<Location> getLocations(Location lowLoc, Location loc, Vector vector, boolean StartFromZero) {
	
	return null;
    }

    private List<Location> getLocationsWallsByData(Location loc, Vector vector, Location lowLoc, SelectionSides Sides) {
	
	return null;
    }

    private List<Location> getLocationsCornersByData(Location loc, Vector vector, Location lowLoc, SelectionSides Sides) {
	
	return null;
    }

    private static int Range = 16;

    public boolean makeBorders(final Player player) {
	return true;
    }

    public void clearSelection(Player player) {
	selections.remove(player.getUniqueId());
    }

    public boolean worldEdit(Player player) {
	plugin.sendMessage(player, LC.info_NoInformation);
	return false;
    }

    public boolean worldEditUpdate(Player player) {
	plugin.sendMessage(player, LC.info_NoInformation);
	return false;
    }

}
