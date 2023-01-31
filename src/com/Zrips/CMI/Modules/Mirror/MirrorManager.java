package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Container.CMIBlock;

public class MirrorManager {

    public enum MirrorAction {
        X("&eMirrors by &6X &eaxis", 1),
        Y("&eMirrors by &6Y &eaxis", 3),
        Z("&eMirrors by &6Z &eaxis", 5),

        XY("&eMirrors by &6X &eto &6Y &eaxis", 11),
        ZY("&eMirrors by &6Z &eto &6Y &eaxis", 13),
        XZ("&eMirrors by &6X &eto &6Z &eaxis", 20),
        ZX("&eMirrors by &6Z &eto &6Y &eaxis", 22),
        Rotate90V("&eRotates up", 28),
        Rotate90H("&eRotates &690 &edegrees clock wise", 29),
        Rotate90HC("&eRotates &690 &edegrees counter clock wise", 31),
        Rotate180H("&eRotates &6180 &edegrees", 32),
        Pause("&ePauses mirroring", 16),
        Location("&eSets mirroring center location", 34);

        private int slot;
        private String desc;
        private String name;

        private MirrorAction(String desc, int slot) {
            this.slot = slot;
            this.desc = desc;
        }

        public int getSlot() {
            return this.slot;
        }

        public String getDesc() {
            return this.desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    HashMap<UUID, CMIUser> map = new HashMap<UUID, CMIUser>();
    private final String CMIMirrorBlock = "CMIMirrorBlock";
    private CMI plugin;

    public MirrorManager(CMI plugin) {
        this.plugin = plugin;
    }

    public boolean isMirroring(Player player) {
        return map.containsKey(player.getUniqueId());
    }

    public boolean addMirroring(Player player) {
        CMIUser user = plugin.getPlayerManager().getUser(player);
        if (user != null)
            return map.put(player.getUniqueId(), user) != null;
        return false;
    }

    public void removeMirroring(Player player) {
        map.remove(player.getUniqueId());
    }

    class blockInfo {

        private Location loc;
        private Object data;

        blockInfo(Location loc, Object data) {
            this.loc = loc;
            this.data = data;
        }

        public Location getLoc() {
            return loc;
        }

        public void setLoc(Location loc) {
            this.loc = loc;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

    }

    private static String toString(Location loc) {
        return loc.getBlockX() + ":" + loc.getBlockY() + ":" + loc.getBlockZ();
    }

    private HashMap<String, blockInfo> getMapLocations(Mirrors mirror, Location loc, Block b) {

        return null;
    }

    private static Set<Location> getLocations(Mirrors mirror, Location loc) {

        return null;
    }

    private boolean inRange(Location center, Location location) {
        if (!center.getWorld().getName().equalsIgnoreCase(location.getWorld().getName()))
            return false;

        int difx = getXdif(center, location);
        int dify = getYdif(center, location);
        int difz = getZdif(center, location);

        difx = difx < 0 ? -difx : difx;
        dify = dify < 0 ? -dify : dify;
        difz = difz < 0 ? -difz : difz;

        int range = plugin.getConfigManager().MirrorMaxRange;

        return difx < range && dify < range && difz < range;
    }

    public enum mirrorShift {
        north(0, 0, -1),
        northEast(1, 0, -1),
        east(1, 0, 0),
        southEast(1, 0, 1),
        south(0, 0, 1),
        southWest(-1, 0, 1),
        west(-1, 0, 0),
        northWest(-1, 0, -1);

        private int x;
        private int y;
        private int z;

        private int offset;

        mirrorShift(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Location modifyLocation(Location loc) {
            loc.add(this.x * offset, this.y * offset, this.z * offset);
            return loc;
        }

        public int getOffset() {
            return offset;
        }

        public mirrorShift setOffset(int offset) {
            this.offset = offset;
            return this;
        }
    }

    private HashMap<String, blockInfo> offset(Mirrors mirror, Block block, mirrorShift shift) {
        Location blockLoc = shift.modifyLocation(block.getLocation().clone());
        HashMap<String, blockInfo> locs = new HashMap<String, blockInfo>(getMapLocations(mirror.clone().setCenter(shift.modifyLocation(mirror.getCenter().clone())), blockLoc, block));
        locs.put(toString(blockLoc), new blockInfo(blockLoc, (new CMIBlock(block)).getData()));
        return locs;
    }

    private HashMap<String, blockInfo> combineMaps(HashMap<String, blockInfo> locs, HashMap<String, blockInfo> shiftedLocs) {
        for (Entry<String, blockInfo> one : shiftedLocs.entrySet()) {
            if (locs.containsKey(one.getKey()))
                continue;
            locs.put(one.getKey(), one.getValue());
        }
        return locs;
    }

    public void MirrorPlace(Player player, Block block) {

    }

    public void MirrorBreak(Player player, Block block) {

    }

    private Location rotate90horClockWise(Mirrors mirror, Location loc) {
        Location n = loc.clone();

        return n;
    }

    private Location rotate90horCounterClockWise(Mirrors mirror, Location loc) {
        Location n = loc.clone();

        return n;
    }

    private static Location rotate90hor(Mirrors mirror, Location loc, boolean clock) {
        Location n = loc.clone();

        return n;
    }

    private static Location rotate180hor(Mirrors mirror, Location loc) {
        Location n = loc.clone();

        return n;
    }

    private static Location rotate90vert(Mirrors mirror, Location loc) {

        Location n = loc.clone();

        return n;
    }

    private HashMap<String, blockInfo> getMirroredXZMap(Mirrors mirror, Block block, Object data, Location loc, int repeat, HashMap<String, blockInfo> map) {

        return null;
    }

    private HashMap<String, blockInfo> getMirroredZXMap(Mirrors mirror, Block block, Object data, Location loc, int repeat, HashMap<String, blockInfo> map) {

        return null;
    }

    private static Set<Location> getMirroredXZ(Mirrors mirror, Location loc, int repeat) {
        Set<Location> list = new HashSet<Location>();

        return list;
    }

    private static Set<Location> getMirroredZX(Mirrors mirror, Location loc, int repeat) {
        Set<Location> list = new HashSet<Location>();

        return list;
    }

    private HashMap<String, blockInfo> getMirroredZYMap(Mirrors mirror, Block block, Object data, Location loc, int repeat, HashMap<String, blockInfo> map) {
        return null;
    }

    private HashMap<String, blockInfo> getMirroredXYMap(Mirrors mirror, Block block, Object data, Location loc, int repeat, HashMap<String, blockInfo> map) {

        return null;
    }

    private static Set<Location> getMirroredZY(Mirrors mirror, Location loc, int repeat) {
        Set<Location> list = new HashSet<Location>();
        return list;
    }

    private static Set<Location> getMirroredXY(Mirrors mirror, Location loc, int repeat) {
        Set<Location> list = new HashSet<Location>();
        return list;
    }

    private HashMap<String, blockInfo> getMirroredLocMap(Mirrors mirror, Location loc) {

        return null;
    }

    private static Set<Location> getMirroredLocs(Mirrors mirror, Location loc) {

        Set<Location> list = new HashSet<Location>();

        return list;
    }

    private static int getX(Location center, Location loc) {
        int c = center.getBlockX();
        int b = loc.getBlockX();
        int dif = c - b;
        int newValue = c + dif;
        return newValue;
    }

    private static int getY(Location center, Location loc) {
        int c = center.getBlockY();
        int b = loc.getBlockY();
        int dif = c - b;
        int newValue = c + dif;
        return newValue;
    }

    private static int getZ(Location center, Location loc) {
        int c = center.getBlockZ();
        int b = loc.getBlockZ();
        int dif = c - b;
        int newValue = c + dif;
        return newValue;
    }

    private static int getXdif(Location center, Location loc) {
        return center.getBlockX() - loc.getBlockX();
    }

    private static int getYdif(Location center, Location loc) {
        return center.getBlockY() - loc.getBlockY();
    }

    private static int getZdif(Location center, Location loc) {
        return center.getBlockZ() - loc.getBlockZ();
    }

    public void openNewGui(CMIUser user) {

    }
}
