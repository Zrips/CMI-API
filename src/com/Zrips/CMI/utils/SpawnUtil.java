package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMILocation;

public class SpawnUtil {

    public SpawnUtil() {
    }

    public static final String defaultG = "CMISpawnGroup";
    public static final String defaultGW = "CMISWG";

    public static class SpawnPoint {
        private String group;
        private CMILocation location;
        private boolean respawn = false;
        private Integer rng = null;
        private List<World> worlds;

        public SpawnPoint(String group, CMILocation loc, boolean respawn) {
            this(group, loc, respawn, null, null);
        }

        public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng) {
            this(group, loc, respawn, rng, null);
        }

        public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, List<World> worlds) {
            this.group = group;
            this.location = loc;
            this.respawn = respawn;
            this.rng = rng;
            this.worlds = worlds;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public CMILocation getLocation() {
            if (rng != null && rng > 0) {
                Random random = new Random(System.currentTimeMillis());
                double rx = (random.nextInt(rng * 10 * 2) - (rng * 10)) / 10D;
                double rz = (random.nextInt(rng * 10 * 2) - (rng * 10)) / 10D;
                return new CMILocation(location.clone().add(rx, 0, rz));
            }
            return location;
        }

        public void setLocation(CMILocation location) {
            this.location = location;
        }

        public boolean isRespawn() {
            return respawn;
        }

        public void setRespawn(boolean respawn) {
            this.respawn = respawn;
        }

        public Integer getRng() {
            return rng;
        }

        public void setRng(Integer rng) {
            this.rng = rng;
        }

        public List<World> getWorlds() {
            if (this.worlds == null)
                worlds = new ArrayList<World>();
            return worlds;
        }

        public List<String> getWorldsAsStringList() {
            return null;
        }

        public void setWorlds(List<World> worlds) {
            this.worlds = worlds;
        }
    }

    static HashMap<String, SpawnPoint> map = new HashMap<String, SpawnPoint>();

    private static Set<String> ignoredSpawnWorlds = new HashSet<String>();

    public static void addNew(String group, CMILocation loc, boolean respawn) {
        addNew(group, loc, respawn, null);
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range) {
        addNew(group, loc, respawn, range, new ArrayList<World>());
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range, List<World> worlds) {

    }

    public static CMILocation getSpawnPoint(Player player) {

        return null;
    }

    public static CMILocation getGroupReSpawnPoint(Player player) {

        return null;
    }

    public static void save() {

    }

    private static boolean SpawnSpawnOnJoin = false;

    public static void loadConfig() {

    }

    public static boolean isSpawnSpawnOnJoin() {
        return SpawnSpawnOnJoin;
    }

    public static Set<String> getIgnoredSpawnWorlds() {
        return ignoredSpawnWorlds;
    }

    public static boolean isIgnoresSpawnWorld(String worldName) {
        if (ignoredSpawnWorlds.isEmpty())
            return false;
        return ignoredSpawnWorlds.contains(worldName.toLowerCase());
    }
}
