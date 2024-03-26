package com.Zrips.CMI.Modules.Vanish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIVanish;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class VanishManager {

    private CMI plugin;

    private Set<UUID> vanishedOnlineList = new HashSet<UUID>();
    private Set<UUID> vanishedList = new HashSet<UUID>();

    private HashMap<UUID, CMIVanish> vanishedCache = new HashMap<UUID, CMIVanish>();

    public CMIVanish getVanish(UUID uuid) {
        return vanishedCache.computeIfAbsent(uuid, k -> new CMIVanish(CMIUser.getUser(uuid)));
    }

    public @Nullable CMIVanish getVanishRaw(UUID uuid) {
        return vanishedCache.get(uuid);
    }

    public VanishManager(CMI plugin) {
        this.plugin = plugin;
    }

    public Set<UUID> getAllVanished() {
        return vanishedList;
    }

    public void addPlayer(CMIUser user) {
        if (user == null)
            return;
        addPlayer(user.getUniqueId());
    }

    public void addPlayer(Player player) {
        if (player == null)
            return;
        addPlayer(player.getUniqueId());
    }

    public void addPlayer(UUID uuid) {
    }

    private static final String vanishBossBar = "CMIVanishBossBar";

    public boolean nearActivePlayer(Location loc) {

        return true;
    }

    public void applyVanish(CMIUser user) {
        applyVanish(user, true, true);
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent) {
        applyVanish(user, fireUnvanishEvent, true);
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages) {
        applyVanish(user, fireUnvanishEvent, showMessages, false);
    }

    public void applyVanish(CMIUser user, boolean fireUnvanishEvent, boolean showMessages, boolean login) {

    }

    public static String defaultString = "";

    public void loadConfig() {

    }

    public void hideVanishedPlayersFor(Player player) {

    }

    public void hidePlayerForEveryone(Player player) {

    }

    public void removePlayer(CMIUser user) {
        if (user == null)
            return;
        removePlayer(user.getUniqueId(), true);
    }

    public void removePlayer(Player player) {
    }

    public void removePlayer(UUID uuid) {
        removePlayer(uuid, true);
    }

    public void removePlayer(UUID uuid, boolean showForOthers) {
    }

    public Set<UUID> getVanishedOnlineList() {
        return vanishedOnlineList;
    }

    private CMITask playtimeSched = null;

    List<CMIUser> playtimeList = new ArrayList<CMIUser>();

    public void removeFromPlayTimePreventer(CMIUser user) {
        playtimeList.remove(user);
    }

    public void addToPlayTimePreventer(CMIUser user) {
        playtimeList.add(user);
        user.getVanish().setPlaytimeAtVanishStart((long) (user.getTotalPlayTime() / 1000) * 1000);
        playTimePreventer();
    }

    private void playTimePreventer() {

    }

}
