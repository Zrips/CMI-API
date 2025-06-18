package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class CMISpawner {
    private Block block;
    private CreatureSpawner spawner;

    public CMISpawner(Block block) {
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

    public void removeMetadata(String arg0, Plugin arg1) {
    }

    public void setMetadata(String arg0, MetadataValue arg1) {
    }

    @Deprecated
    public String getCreatureTypeName() {
        return null;
    }

    public int getDelay() {
        return 0;
    }

    public int getMaxNearbyEntities() {
        return 0;
    }

    public int getMaxSpawnDelay() {
        return 0;
    }

    public int getMinSpawnDelay() {
        return 0;
    }

    public int getRequiredPlayerRange() {
        return 0;
    }

    public int getSpawnCount() {
        return 0;
    }

    public int getSpawnRange() {
        return 0;
    }

    private int getValue(String path) {
        return 0;
    }

    public EntityType getSpawnedType() {
        return null;
    }

    @Deprecated
    public void setCreatureTypeByName(String arg0) {
    }

    public void setDelay(int arg0) {
    }

    public void setMaxNearbyEntities(int arg0) {
    }

    public void setMaxSpawnDelay(int arg0) {
    }

    public void setMinSpawnDelay(int arg0) {
    }

    public void setRequiredPlayerRange(int arg0) {
    }

    public void setSpawnCount(int arg0) {
    }

    public void setSpawnRange(int arg0) {
    }

    private void updateValue(String type, int val) {
    }

    public void setSpawnedType(EntityType arg0) {
    }
}
