package com.Zrips.CMI.Modules.DeathMessages;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class DeathMessageManager {
    private CMI plugin;
    HashMap<String, DeathMessages> messages;
    private List<String> playerHover;
    private List<String> killerHover;
    private List<String> disabledWorlds;
    private List<String> mutedWorlds;
    private List<String> ignoredPlayers;
    private String prefix;
    private long spamTimeRange;
    private int spamCount;
    private HashMap<UUID, List<Long>> spamProtection;
    private boolean enabled;
    private int autoHideFrom;
    private int range;
    private String destination;

    public DeathMessageManager(CMI plugin) {
    }

    public void relocateDeathMessageLocaleFiles() {
    }

    public void defaultLocaleDownloader() {
    }

    public void load() {
    }

    private void loadConfig() {
    }

    private void loadLocale() {
    }

    private void addMessages(String path, List<String> ls) {
    }

    @Nonnull
    public String getDeathMessage(String path) {
        return null;
    }

    private List<Player> getPlayersFromRange(Location loc, int range) {
        return null;
    }

    public boolean broadcastDeathMessage(Player player, RawMessage rm) {
        return false;
    }

    private void addSpamRecord(UUID uuid) {
    }

    private boolean isUnderSpamCooldown(UUID uuid) {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public int getAutoHideFrom() {
        return 0;
    }

    public List<String> getPlayerHover() {
        return null;
    }

    public List<String> getKillerHover() {
        return null;
    }

    private boolean isInMutedWorld(World world) {
        return false;
    }

    private boolean isInMutedWorld(String worldName) {
        return false;
    }

    private boolean isInDisabledWorld(World world) {
        return false;
    }

    private boolean isInDisabledWorld(String worldName) {
        return false;
    }

    public String getPrefix() {
        return null;
    }
}
