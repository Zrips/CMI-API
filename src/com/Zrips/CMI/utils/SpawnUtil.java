package com.Zrips.CMI.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMILocation;

public class SpawnUtil {
    public static final String defaultG = null;
    public static final String defaultGW = null;
    static HashMap<String, SpawnPoint> map;
    private static Set<String> ignoredSpawnWorlds;
    private static boolean SpawnSpawnOnJoin;

    public SpawnUtil() {
    }

    public static void addNew(String group, CMILocation loc, boolean respawn) {
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range) {
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range, Set<String> worlds) {
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

    private static void setToConfig(YamlConfiguration conf, String path, SpawnPoint point) {
    }

    public static void loadConfig() {
    }

    public static boolean isSpawnSpawnOnJoin() {
        return false;
    }

    public static Set<String> getIgnoredSpawnWorlds() {
        return null;
    }

    public static boolean isIgnoresSpawnWorld(String worldName) {
        return false;
    }

    public static class SpawnPoint {
        private String group;
        private CMILocation location;
        private boolean respawn;
        private Integer rng;
        private List<World> worlds;
        private Set<String> worldNames;

        public SpawnPoint(String group, CMILocation loc, boolean respawn) {
        }

        public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng) {
        }

        public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, List<World> worlds) {
        }

        public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, Set<String> worlds) {
        }

        public String getGroup() {
            return null;
        }

        public void setGroup(String group) {
        }

        public CMILocation getLocation() {
            return null;
        }

        public void setLocation(CMILocation location) {
        }

        public boolean isRespawn() {
            return false;
        }

        public void setRespawn(boolean respawn) {
        }

        public Integer getRng() {
            return null;
        }

        public void setRng(Integer rng) {
        }

        public List<World> getWorlds() {
            return null;
        }

        public List<String> getWorldsAsStringList() {
            return null;
        }

        public void setWorlds(List<World> worlds) {
        }
    }
}
