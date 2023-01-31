package com.Zrips.CMI.Modules.DeathMessages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class DeathMessageManager {

    private CMI plugin;

    HashMap<String, DeathMessages> messages = new HashMap<String, DeathMessages>();

    private List<String> playerHover = new ArrayList<String>();
    private List<String> killerHover = new ArrayList<String>();

    private List<String> disabledWorlds = new ArrayList<String>();
    private List<String> mutedWorlds = new ArrayList<String>();
    private List<String> ignoredPlayers = new ArrayList<String>();

    private long spamTimeRange = 30 * 1000L;
    private int spamCount = 3;

    private HashMap<UUID, List<Long>> spamProtection = new HashMap<UUID, List<Long>>();

    public DeathMessageManager(CMI plugin) {
        this.plugin = plugin;
    }

    private boolean enabled = false;
    private int autoHideFrom = -1;
    private int range = -1;

    public void load() {
        loadConfig();
        loadLocale();
    }

    private void loadConfig() {

    }

    private void loadLocale() {

    }

    private void addMessages(String path, List<String> ls) {
        messages.put(path, new DeathMessages(path, ls));
    }

    public String getDeathMessage(String path) {
        return null;
    }

    private List<Player> getPlayersFromRange(Location loc, int range) {
        List<Player> list = new ArrayList<Player>();

        return list;
    }

    public boolean broadcastDeathMessage(Player player, RawMessage rm) {

        return false;
    }

    private void addSpamRecord(UUID uuid) {

    }

    private boolean isUnderSpamCooldown(UUID uuid) {
        return true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getAutoHideFrom() {
        return autoHideFrom;
    }

    public List<String> getPlayerHover() {
        return new ArrayList<String>(playerHover);
    }

    public List<String> getKillerHover() {
        return new ArrayList<String>(killerHover);
    }

    private boolean isInMutedWorld(World world) {
        if (world == null || world.getName() == null)
            return false;
        return isInMutedWorld(world.getName());
    }

    private boolean isInMutedWorld(String worldName) {
        return mutedWorlds.contains(worldName.toLowerCase());
    }

    private boolean isInDisabledWorld(World world) {
        if (world == null || world.getName() == null)
            return false;
        return isInDisabledWorld(world.getName());
    }

    private boolean isInDisabledWorld(String worldName) {
        return disabledWorlds.contains(worldName.toLowerCase());
    }
}
