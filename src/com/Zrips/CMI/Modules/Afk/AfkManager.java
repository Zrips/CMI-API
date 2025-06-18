package com.Zrips.CMI.Modules.Afk;

import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AfkManager {
    private HashMap<CMIUser, Long> lastAction;
    private HashMap<UUID, AfkInfo> afkPlayersMap;
    private final NavigableMap<Integer, Long> afkKickTimers = null;
    private CMI plugin;
    private CMITask sched;
    private long awayTrigerTime;
    private List<String> awayTrigerCommands;
    private List<String> manualAwayTrigerCommands;
    private List<String> manualLeaveCommands;
    private List<String> autoLeaveCommands;
    private long defaultKickTime;
    private int AutoKickFromPlayerCount;
    private long RepeatingAutoKickInterval;
    private List<String> kickTrigerCommands;
    private List<String> disabledWorlds;
    private boolean AfkEnabled;
    private boolean PreventJumping;
    private boolean TitleMessage;
    private boolean SubTitleMessage;
    private boolean PreventDamage;
    private boolean PreventMobDamage;
    private boolean StopPlayTime;
    private int interval;
    private boolean disableOnPublicChat;
    private boolean disableOnPrivateChat;
    private boolean disableOnInteract;
    private boolean SmartInteractCheck;
    private boolean AntiAfkMachines;
    private boolean DisableOnInventoryClick;
    private boolean DisableOnitemDrop;
    private boolean RepeatKickCommand;
    private boolean disableOnCommand;
    private boolean disableOnMove;
    private boolean disableOnLookAround;
    private boolean disableItemPickup;
    private boolean disableFishing;
    private boolean PreventMobSpawning;
    private boolean PreventMobSpawningNatural;
    private boolean PreventMobSpawningSpawners;
    private boolean PreventMobVillageDefence;
    private boolean PreventPushing;
    private boolean PreventHook;
    private boolean disableExpPickup;
    int messageSize;
    List<String> afkSubTitle;
    private CMITask afkSched;
    List<CMIUser> afkList;

    public long getClosestKickTime() {
        return 0;
    }

    public boolean isAfk(UUID uuid) {
        return false;
    }

    public AfkInfo getAfkInfo(UUID uuid) {
        return null;
    }

    public AfkInfo createAfkInfo(UUID uuid) {
        return null;
    }

    public void removeAfkInfo(UUID uuid) {
    }

    public AfkManager(CMI plugin) {
    }

    public void stop() {
    }

    public void loadConfig() {
    }

    private void loadAfk() {
    }

    private void tasker() {
    }

    public void showTitle(CMIUser user, boolean fade) {
    }

    public void hideTitle(CMIUser user) {
    }

    private String getTitle(CMIUser user) {
        return null;
    }

    private String getSubtitle(CMIUser user) {
        return null;
    }

    public void setUserToAfk(CMIUser user, List<String> cmds) {
    }

    public void removeUserFromAfk(CMIUser user, List<String> cmds) {
    }

    public void removeUser(CMIUser user) {
    }

    public void updateUser(CMIUser user) {
    }

    public void setLastAction(CMIUser user, long time) {
    }

    public Long getLastAction(CMIUser user) {
        return null;
    }

    public boolean isAfkEnabled() {
        return false;
    }

    public boolean isDisableOnMove() {
        return false;
    }

    public boolean isDisableOnFishing() {
        return false;
    }

    public boolean isDisableOnInteract() {
        return false;
    }

    public boolean isDisableOnInventoryClick() {
        return false;
    }

    public boolean isDisableOnCommand() {
        return false;
    }

    public boolean isDisableItemPickup() {
        return false;
    }

    public boolean isDisableOnPublicChat() {
        return false;
    }

    public boolean isDisableOnPrivateChat() {
        return false;
    }

    public List<String> getAwayTrigerCommands() {
        return null;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
    }

    public boolean isPreventDamage() {
        return false;
    }

    public boolean isPreventMobDamage() {
        return false;
    }

    public boolean isPreventJumping() {
        return false;
    }

    @Deprecated
    public List<String> getLeaveTrigerCommands() {
        return null;
    }

    public List<String> getManualLeaveCommands() {
        return null;
    }

    public void setManualLeaveCommands(List<String> manualLeaveCommands) {
    }

    public List<String> getAutoLeaveCommands() {
        return null;
    }

    public void setAutoLeaveCommands(List<String> autoLeaveCommands) {
    }

    public boolean isSmartInteractCheck() {
        return false;
    }

    public boolean isAntiAfkMachines() {
        return false;
    }

    public int getCheckInterval() {
        return 0;
    }

    public boolean isStopPlayTime() {
        return false;
    }

    public void setStopPlayTime(boolean stopPlayTime) {
    }

    public void removeFromAfkTimePreventer(CMIUser user) {
    }

    public void AddToAfkTimePreventer(CMIUser user) {
    }

    private void AfkTimePreventer() {
    }

    public List<String> getManualAwayTrigerCommands() {
        return null;
    }

    public void setManualAwayTrigerCommands(List<String> manualAwayTrigerCommands) {
    }

    public long getAwayTrigerTime() {
        return 0;
    }

    public boolean nearActivePlayer(Location loc, SpawnReason reason) {
        return false;
    }

    public static Boolean isNear(Location loc1, Location loc2) {
        return null;
    }

    public boolean isDisableExpPickup() {
        return false;
    }

    public boolean isDisableOnItemDrop() {
        return false;
    }

    public boolean isDisabledWorld(World world) {
        return false;
    }

    public boolean isDisabledWorld(String name) {
        return false;
    }

    public boolean isPreventMobSpawning() {
        return false;
    }

    public boolean isPreventMobSpawningNatural() {
        return false;
    }

    public boolean isPreventMobSpawningSpawners() {
        return false;
    }

    public boolean isPreventMobVillageDefence() {
        return false;
    }

    public boolean isPreventPushing() {
        return false;
    }

    public Set<CMIUser> getAfkPlayers() {
        return null;
    }

    public HashMap<UUID, AfkInfo> getAfkPlayersMap() {
        return null;
    }

    public int getAfkPlayerCount() {
        return 0;
    }

    public boolean isDisableOnLookAround() {
        return false;
    }

    public boolean isPreventHook() {
        return false;
    }
}
