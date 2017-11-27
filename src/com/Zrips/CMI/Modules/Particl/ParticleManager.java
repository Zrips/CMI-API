package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

public class ParticleManager {

    private CMI plugin;

    public ParticleManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void drawLine(Player player, Location loc1, Location loc2, Effect effect, boolean center) {
    }

    public void drawLine(Location loc1, Location loc2, Effect effect, boolean center) {
    }

    private ArrayList<Location> getLineLocations(Location loc1, Location loc2, boolean center) {
	return null;
    }

    private void drawShed(final ArrayList<Location> primaryLocations, final Effect effect) {
    }

    private void markBlockShed(final Block block, final Effect effect, final Long until) {
    }

    private void markBlock(Block block, Effect effect) {


    }

    private static List<Vector> remakePlotLineInRange(Double rowSpacing, int range, Vector p1, Vector p2, Location loc) {
	return null;
    }

    private static boolean inRange(Location loc, Location loc2, Integer range) {

	return true;
    }

    private static Vectors shortenVectors(Double rowSpacing, Integer range, Vector p1, Vector p2, Location loc) {

	return null;
    }

}
