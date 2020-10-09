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

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class CMISpawner {

    private Block block;
    private CreatureSpawner spawner = null;

    public CMISpawner(Block block) {
	this.block = block;
	this.spawner = (CreatureSpawner) block.getState();
    }

    public Block getBlock() {
	return block;
    }

    public BlockData getBlockData() {
	return block.getBlockData();
    }

    public byte getLightLevel() {
	return spawner.getLightLevel();
    }

    public Location getLocation() {
	return block.getLocation();
    }

    public Material getType() {
	return block.getType();
    }

    public World getWorld() {
	return block.getWorld();
    }

    public int getX() {
	return block.getX();
    }

    public int getY() {
	return block.getY();
    }

    public int getZ() {
	return block.getZ();
    }

    public void setBlockData(BlockData data) {
	block.setBlockData(data);
    }

    public boolean update() {
	return spawner.update();
    }

    public boolean update(boolean arg0) {
	return spawner.update(arg0);
    }

    public boolean update(boolean arg0, boolean arg1) {
	return spawner.update(arg0, arg1);
    }

    public List<MetadataValue> getMetadata(String arg0) {
	return spawner.getMetadata(arg0);
    }

    public boolean hasMetadata(String arg0) {
	return spawner.hasMetadata(arg0);
    }

    public void removeMetadata(String arg0, Plugin arg1) {
	spawner.removeMetadata(arg0, arg1);
    }

    public void setMetadata(String arg0, MetadataValue arg1) {
	spawner.setMetadata(arg0, arg1);
    }

    @Deprecated
    public String getCreatureTypeName() {
	return spawner.getCreatureTypeName();
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
