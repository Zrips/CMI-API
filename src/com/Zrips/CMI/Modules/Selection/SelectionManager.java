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
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.Locale.LC;

public class SelectionManager {

    protected Map<UUID, CuboidArea> selections;
    protected CMI plugin;

    private HashMap<UUID, Visualizer> vMap = new HashMap<UUID, Visualizer>();

    int visualizerSidesCap = 1000;
    int visualizerFrameCap = 1000;
    CMIParticle selectedSpigotSides = CMIParticle.COLOURED_DUST;
    CMIParticle selectedSpigotFrame = CMIParticle.HAPPY_VILLAGER;
    long visualizerShowFor = 60 * 1000L;
    long visualizerUpdateInterval = 10L;

    public SelectionManager(CMI plugin) {
        this.plugin = plugin;
        selections = Collections.synchronizedMap(new HashMap<UUID, CuboidArea>());
    }

    public void hideSelection(Player player) {
        Visualizer vis = vMap.get(player.getUniqueId());
        if (vis == null)
            return;
        vis.cancelAll();
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
        CuboidArea selection = selections.get(uuid);
        if (selection == null)
            return null;
        return selection.getHighLoc();
    }

    public CuboidArea getSelectionCuboid(Player player) {
        if (player == null)
            return null;
        return getSelectionCuboid(player.getUniqueId());
    }

    public void setSelectionCuboid(Player player, CuboidArea area) {
    }

    @Deprecated
    public CuboidArea getSelectionCuboid(String player) {
        CMIUser user = plugin.getPlayerManager().getUser(player);
        if (user == null)
            return null;
        return getSelectionCuboid(user.getUniqueId());
    }

    public CuboidArea getSelectionCuboid(UUID uuid) {
        if (uuid == null)
            return null;
        return selections.get(uuid);
    }

    public boolean hasPlacedBoth(Player player) {
        return hasPlacedBoth(player.getUniqueId());
    }

    @Deprecated
    public boolean hasPlacedBoth(String player) {
        CMIUser user = plugin.getPlayerManager().getUser(player);
        if (user == null)
            return false;
        return hasPlacedBoth(user.getUniqueId());
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
        if (hasPlacedBoth(player.getUniqueId())) {
            Visualizer v = new Visualizer(player);
            v.setAreas(this.getSelectionCuboid(player));
            this.showBounds(player, v);
        }
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
        LC.info_NoInformation.sendMessage(player);
        return false;
    }

    public boolean worldEditUpdate(Player player) {
        LC.info_NoInformation.sendMessage(player);
        return false;
    }

}
