package com.Zrips.CMI.Modules.Teleportations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.RandomTeleport;

public class RandomTeleportationManager {

    private CMI plugin;

    Set<String> cacheFilling = new HashSet<String>();

    private HashMap<String, RandomTeleport> randomTeleports = new HashMap<String, RandomTeleport>();
    private int randomTeleportCooldown = 3;
    private int randomTeleportMaxTries = 10;
    private List<Biome> randomTeleportExcludedBiomes = new ArrayList<Biome>();

    static Random random = new Random(System.nanoTime());

    public RandomTeleportationManager(CMI plugin) {
        this.plugin = plugin;
    }

    private static final String fileName = "RandomTeleportations.yml";

    public void loadConfig() {

    }

    public RandomTeleport getRandomTeleport(World w) {
        return getRandomTeleport(w, false);
    }

    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
        RandomTeleport rt = randomTeleports.get(w.getName());
        return rt == null ? null : rt.isEnabled() && rt.getCenter().getWorld() != null ? rt : includeDisabled ? rt : null;
    }

    public HashMap<String, RandomTeleport> getRandomTeleports() {
        return randomTeleports;
    }

    public int getRandomTeleportMaxTries() {
        return randomTeleportMaxTries;
    }

    public int getRandomTeleportCooldown() {
        return randomTeleportCooldown;
    }

    public List<Biome> getRandomTeleportExcludedBiomes() {
        return randomTeleportExcludedBiomes;
    }

    public CompletableFuture<CMITeleportLocation> getRandomTeleportationLocation(RandomTeleport rtloc, Location loc, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot) {

        return null;
    }

    ConcurrentHashMap<UUID, CMIRunningRandomTeleports> playerRandomTeleports = new ConcurrentHashMap<UUID, CMIRunningRandomTeleports>();

    public CompletableFuture<Boolean> randomTeleport(Player player, World world) {

        return null;
    }

    String[] substrings = { "...", "..", ".", };

    private static CompletableFuture<Boolean> teleportPlayerRandom(Player player, TeleportCause cause, CompletableFuture<CMITeleportLocation> completableFuture) {

        return null;
    }
}
