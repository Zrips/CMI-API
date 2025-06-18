package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.TrialSpawner;
import org.bukkit.block.data.BlockData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class CMITrialSpawner {
    private Block block;
    private TrialSpawner spawner;

    public CMITrialSpawner(Block block) {
    }

    public Block getBlock() {
        return null;
    }

    public BlockData getBlockData() {
        return null;
    }

    public byte getLightLevel() {
        return 0;
    }

    public Location getLocation() {
        return null;
    }

    public Material getType() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    public void setBlockData(BlockData data) {
    }

    public boolean update() {
        return false;
    }

    public boolean update(boolean arg0) {
        return false;
    }

    public boolean update(boolean arg0, boolean arg1) {
        return false;
    }

    public List<MetadataValue> getMetadata(String arg0) {
        return null;
    }

    public boolean hasMetadata(String arg0) {
        return false;
    }

    public void removeMetadata(String key, Plugin plugin) {
    }

    public void setMetadata(String key, MetadataValue meta) {
    }
}
