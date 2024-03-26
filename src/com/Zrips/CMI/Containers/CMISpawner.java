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
import net.Zrips.CMILib.Version.Version;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.NBT.CMINBT;

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
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getDelay();
        }
        return getValue("Delay");
    }

    public int getMaxNearbyEntities() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getMaxNearbyEntities();
        }
        return getValue("MaxNearbyEntities");
    }

    public int getMaxSpawnDelay() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getMaxSpawnDelay();
        }
        return getValue("MaxSpawnDelay");
    }

    public int getMinSpawnDelay() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getMinSpawnDelay();
        }
        return getValue("MinSpawnDelay");
    }

    public int getRequiredPlayerRange() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getRequiredPlayerRange();
        }
        return getValue("RequiredPlayerRange");
    }

    public int getSpawnCount() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getSpawnCount();
        }
        return getValue("SpawnCount");
    }

    public int getSpawnRange() {
        if (Version.isCurrentEqualOrHigher(Version.v1_13_R1)) {
            return spawner.getSpawnRange();
        }
        return getValue("SpawnRange");
    }

    private int getValue(String path) {
        Object v = new CMINBT(block).getShort(path);
        if (v instanceof Short)
            return (Short) v;
        return 0;
    }

    public EntityType getSpawnedType() {
        return spawner.getSpawnedType();
    }

    @Deprecated
    public void setCreatureTypeByName(String arg0) {
        spawner.setCreatureTypeByName(arg0);
    }

    public void setDelay(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setDelay(arg0);
            return;
        }
        updateValue("Delay", arg0);
    }

    public void setMaxNearbyEntities(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setMaxNearbyEntities(arg0);
            return;
        }
        updateValue("MaxNearbyEntities", arg0);

    }

    public void setMaxSpawnDelay(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setMaxSpawnDelay(arg0);
            return;
        }
        updateValue("MaxSpawnDelay", arg0);
    }

    public void setMinSpawnDelay(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setMinSpawnDelay(arg0);
            return;
        }
        updateValue("MinSpawnDelay", arg0);
    }

    public void setRequiredPlayerRange(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setRequiredPlayerRange(arg0);
            return;
        }
        updateValue("RequiredPlayerRange", arg0);
    }

    public void setSpawnCount(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setSpawnCount(arg0);
            return;
        }
        updateValue("SpawnCount", arg0);
    }

    public void setSpawnRange(int arg0) {
        if (Version.isCurrentEqualOrHigher(Version.v1_12_R1)) {
            spawner.setSpawnRange(arg0);
            return;
        }
        updateValue("SpawnRange", arg0);
    }

    private void updateValue(String type, int val) {
        Object tag = new CMINBT(block).setShort(type, (short) val);
        CMILib.getInstance().getReflectionManager().updateTileEntity(this.getLocation(), tag);
        spawner.update();
    }

    public void setSpawnedType(EntityType arg0) {
        spawner.setSpawnedType(arg0);
    }

}
