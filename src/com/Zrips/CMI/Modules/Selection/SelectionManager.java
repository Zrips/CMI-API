package com.Zrips.CMI.Modules.Selection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class SelectionManager {
    protected Map<UUID, CuboidArea> selections;
    protected CMI plugin;
    private HashMap<UUID, Visualizer> vMap;
    int visualizerSidesCap;
    int visualizerFrameCap;
    CMIParticle selectedSpigotSides;
    CMIParticle selectedSpigotFrame;
    long visualizerShowFor;
    long visualizerUpdateInterval;
    private static int Range;

    public SelectionManager(CMI plugin) {
    }

    public void hideSelection(Player player) {
    }

    public void updateLocations(Player player, Location loc1, Location loc2) {
    }

    public void updateLocations(Player player, Location loc1, Location loc2, boolean force) {
    }

    public void placeLoc1(Player player, Location loc) {
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

    @Deprecated
    public Location getPlayerLoc1(Player player) {
        return null;
    }

    @Deprecated
    public Location getPlayerLoc1(String player) {
        return null;
    }

    @Deprecated
    public Location getPlayerLoc1(UUID uuid) {
        return null;
    }

    @Deprecated
    public Location getPlayerLoc2(Player player) {
        return null;
    }

    @Deprecated
    public Location getPlayerLoc2(String player) {
        return null;
    }

    @Deprecated
    public Location getPlayerLoc2(UUID uuid) {
        return null;
    }

    public CuboidArea getSelectionCuboid(Player player) {
        return null;
    }

    public void setSelectionCuboid(Player player, CuboidArea area) {
    }

    @Deprecated
    public CuboidArea getSelectionCuboid(String player) {
        return null;
    }

    public CuboidArea getSelectionCuboid(UUID uuid) {
        return null;
    }

    public boolean hasPlacedBoth(Player player) {
        return false;
    }

    @Deprecated
    public boolean hasPlacedBoth(String player) {
        return false;
    }

    public boolean hasPlacedBoth(UUID uuid) {
        return false;
    }

    @Deprecated
    public void showSelectionInfo(Player player) {
    }

    public void showSelection(Player player) {
    }

    public void showBounds(Player player, Visualizer v) {
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

    public boolean makeBorders(Player player) {
        return false;
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
