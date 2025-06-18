package com.Zrips.CMI.Modules.MirrorV2;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class CMIMirrorManagerV2 {
    HashMap<UUID, CMIBlockMirroringV2> mirrorMap;
    private final String CMIMirrorBlock = null;
    private CMI plugin;
    private static Method setDataMethod;
    private static Set<Block> ignorePlaced;
    private static Set<Block> ignoreBroken;

    public CMIBlockMirroringV2 getMirror(CMIUser user) {
        return null;
    }

    public CMIBlockMirroringV2 getMirror(Player player) {
        return null;
    }

    public void setMirror(UUID uuid, CMIBlockMirroringV2 mirror) {
    }

    public CMIMirrorManagerV2(CMI plugin) {
    }

    public boolean isMirroring(Player player) {
        return false;
    }

    public boolean addMirroring(Player player) {
        return false;
    }

    public void removeMirroring(Player player) {
    }

    public void removeMirroring(UUID uuid) {
    }

    private boolean inRange(Location center, Location location) {
        return false;
    }

    public void placeBlock(Player player, Block block, ItemStack i) {
    }

    public void breakBlock(Player player, Block block) {
    }

    public void openGui(CMIUser user) {
    }
}
