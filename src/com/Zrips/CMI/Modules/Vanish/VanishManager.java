package com.Zrips.CMI.Modules.Vanish;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIVanish;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class VanishManager {
    private CMI plugin;
    private Set<UUID> vanishedOnlineList;
    private Set<UUID> vanishedList;
    private static HashMap<UUID, CMIVanish> vanishedCache;
    private static final String vanishBossBar = null;
    public static String defaultString;
    private CMITask playtimeSched;
    List<CMIUser> playtimeList;

    @Nullable
    public CMIVanish getVanish(UUID uuid) {
        return null;
    }

    public CMIVanish getOrCreateVanish(CMIUser user) {
        return null;
    }

    public CMIVanish getOrCreateVanish(UUID uuid) {
        return null;
    }

    public static boolean is(UUID uuid, VanishAction action) {
        return false;
    }

    @Nonnull
    public static VanishActionState getState(UUID uuid, VanishAction action) {
        return null;
    }

    @Deprecated
    /**
    * @deprecated use getVanish(UUID) instead,
    *  this will be removed in the future
    * @param UUID
    * @return CMIVanish
    */
    @Nullable
    public CMIVanish getVanishRaw(UUID uuid) {
        return null;
    }

    public VanishManager(CMI plugin) {
    }

    public Set<UUID> getAllVanished() {
        return null;
    }

    public void addPlayer(CMIUser user) {
    }

    public void addPlayer(Player player) {
    }

    public void addPlayer(UUID uuid) {
    }

    public boolean nearActivePlayer(Location loc) {
        return false;
    }

    public void applyVanish(CMIUser user) {
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent) {
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages) {
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages, boolean login) {
    }

    public void loadConfig() {
    }

    public void hideVanishedPlayersFor(Player player) {
    }

    public void hidePlayerForEveryone(Player player) {
    }

    public void removePlayer(CMIUser user) {
    }

    public void removePlayer(Player player) {
    }

    public void removePlayer(UUID uuid) {
    }

    public void removePlayer(UUID uuid, boolean showForOthers) {
    }

    public Set<UUID> getVanishedOnlineList() {
        return null;
    }

    public void removeFromPlayTimePreventer(CMIUser user) {
    }

    public void addToPlayTimePreventer(CMIUser user) {
    }

    private void playTimePreventer() {
    }
}
