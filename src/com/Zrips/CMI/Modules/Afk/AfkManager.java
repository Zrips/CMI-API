package com.Zrips.CMI.Modules.Afk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.CMILC;

import net.Zrips.CMILib.TitleMessages.CMITitleMessage;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AfkManager {

    private HashMap<CMIUser, Long> lastAction = new HashMap<CMIUser, Long>();
//    private Set<CMIUser> afkPlayers = new HashSet<CMIUser>();

    private HashMap<UUID, AfkInfo> afkPlayersMap = new HashMap<UUID, AfkInfo>();

    public boolean isAfk(UUID uuid) {
        if (!afkPlayersMap.containsKey(uuid))
            return false;
        return getAfkInfo(uuid).getAfkFrom() > 0;
    }

    public AfkInfo getAfkInfo(UUID uuid) {
        return afkPlayersMap.get(uuid);
//        return afkPlayersMap.computeIfAbsent(uuid, k -> new AfkInfo());
    }

    public AfkInfo createAfkInfo(UUID uuid) {
//        return afkPlayersMap.get(uuid);
        return afkPlayersMap.computeIfAbsent(uuid, k -> new AfkInfo());
    }

    public void removeAfkInfo(UUID uuid) {
        afkPlayersMap.remove(uuid);
    }

    private CMI plugin;

    public AfkManager(CMI plugin) {
        this.plugin = plugin;
    }

    private CMITask sched = null;
    private long awayTrigerTime = 3000;
    private List<String> awayTrigerCommands = new ArrayList<String>();
    private List<String> manualAwayTrigerCommands = new ArrayList<String>();
    private List<String> leaveTrigerCommands = new ArrayList<String>();
    private long kickTrigerTime = 5000;
    private long RepeatingAutoKickInterval = 5000;
    private List<String> kickTrigerCommands = new ArrayList<String>();
    private List<String> disabledWorlds = new ArrayList<String>();

    private boolean AfkEnabled = true;
    private boolean PreventJumping = true;
    private boolean TitleMessage = true;
    private boolean SubTitleMessage = true;
    private boolean PreventDamage = true;
    private boolean StopPlayTime = false;
    private int interval = 1;

    private boolean disableOnPublicChat = true;
    private boolean disableOnPrivateChat = true;
    private boolean disableOnInteract = true;
    private boolean SmartInteractCheck = true;
    private boolean AntiAfkMachines = true;
    private boolean DisableOnInventoryClick = true;
    private boolean DisableOnitemDrop = true;
    private boolean RepeatKickCommand = false;
    private boolean disableOnCommand = true;
    private boolean disableOnMove = true;
    private boolean disableOnLookAround = true;
    private boolean disableItemPickup = false;
    private boolean disableFishing = true;
    private boolean PreventMobSpawning = false;
    private boolean PreventMobSpawningNatural = false;
    private boolean PreventMobSpawningSpawners = true;
    private boolean PreventMobVillageDefence = true;

    private boolean PreventPushing = true;
    private boolean PreventHook = true;

    private boolean disableExpPickup = false;

    public void stop() {
        if (sched != null) {
            sched.cancel();
            sched = null;
        }
        if (afkSched != null) {
            afkSched.cancel();
            afkSched = null;
        }
    }

    public void loadConfig() {

    }

    private void loadAfk() {
        afkSubTitle = CMILC.getIML("afk", "afkSubTitle");
        messageSize = afkSubTitle.size();
    }

    int messageSize = -1;
    List<String> afkSubTitle = new ArrayList<String>();

    private void tasker() {

    }

    public void showTitle(CMIUser user, boolean fade) {
        if (!TitleMessage || !user.isAfk() || !user.isOnline())
            return;

        CMITitleMessage.send(user.getPlayer(), getTitle(user), getSubtitle(user), fade ? 20 : 0, (interval * 20) + 3, 0);

    }

    public void hideTitle(CMIUser user) {
        if (!TitleMessage || !user.isOnline())
            return;

        CMITitleMessage.send(user.getPlayer(), getTitle(user), getSubtitle(user), 0, 0, 20);
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
        this.lastAction.remove(user);
//        afkPlayers.remove(user);
        if (lastAction.isEmpty() && sched != null) {
            sched.cancel();
            sched = null;
        }
    }

    public void updateUser(CMIUser user) {

    }

    public void setLastAction(CMIUser user, long time) {
        if (this.sched == null) {
            this.tasker();
        }
        this.lastAction.put(user, time);
    }

    public Long getLastAction(CMIUser user) {
        Long action = this.lastAction.get(user);
        return action;
    }

    public boolean isAfkEnabled() {
        return AfkEnabled;
    }

    public boolean isDisableOnMove() {
        return disableOnMove;
    }

    public boolean isDisableOnFishing() {
        return disableFishing;
    }

    public boolean isDisableOnInteract() {
        return disableOnInteract;
    }

    public boolean isDisableOnInventoryClick() {
        return DisableOnInventoryClick;
    }

    public boolean isDisableOnCommand() {
        return disableOnCommand;
    }

    public boolean isDisableItemPickup() {
        return disableItemPickup;
    }

    public boolean isDisableOnPublicChat() {
        return disableOnPublicChat;
    }

    public boolean isDisableOnPrivateChat() {
        return disableOnPrivateChat;
    }

    public List<String> getAwayTrigerCommands() {
        return awayTrigerCommands;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
        this.awayTrigerCommands = awayTrigerCommands;
    }

    public boolean isPreventDamage() {
        return PreventDamage;
    }

    public boolean isPreventJumping() {
        return PreventJumping;
    }

    public List<String> getLeaveTrigerCommands() {
        return leaveTrigerCommands;
    }

    public void setLeaveTrigerCommands(List<String> leaveTrigerCommands) {
        this.leaveTrigerCommands = leaveTrigerCommands;
    }

    public boolean isSmartInteractCheck() {
        return SmartInteractCheck;
    }

    public boolean isAntiAfkMachines() {
        return AntiAfkMachines;
    }

    public int getCheckInterval() {
        return interval;
    }

    public boolean isStopPlayTime() {
        return StopPlayTime;
    }

    public void setStopPlayTime(boolean stopPlayTime) {
        StopPlayTime = stopPlayTime;
    }

    private CMITask afkSched = null;

    List<CMIUser> afkList = new ArrayList<CMIUser>();

    public void removeFromAfkTimePreventer(CMIUser user) {
        afkList.remove(user);
    }

    public void AddToAfkTimePreventer(CMIUser user) {
//	if (user.isOnline() && this.isDisabledWorld(user.getLocation().getWorld())) {
//	    return;
//	}
        afkList.add(user);
        AfkTimePreventer();
    }

    @SuppressWarnings("deprecation")
    private void AfkTimePreventer() {

    }

    public List<String> getManualAwayTrigerCommands() {
        return manualAwayTrigerCommands;
    }

    public void setManualAwayTrigerCommands(List<String> manualAwayTrigerCommands) {
        this.manualAwayTrigerCommands = manualAwayTrigerCommands;
    }

    public long getAwayTrigerTime() {
        return awayTrigerTime;
    }

    public boolean nearActivePlayer(Location loc, SpawnReason reason) {

        return true;
    }

    public static Boolean isNear(Location loc1, Location loc2) {

        return true;
    }

    public boolean isDisableExpPickup() {
        return disableExpPickup;
    }

    public boolean isDisableOnItemDrop() {
        return DisableOnitemDrop;
    }

    public boolean isDisabledWorld(World world) {
        if (world == null)
            return false;
        return isDisabledWorld(world.getName());
    }

    public boolean isDisabledWorld(String name) {
        if (name == null)
            return false;
        return this.disabledWorlds.contains(name.toLowerCase());
    }

    public boolean isPreventMobSpawning() {
        return PreventMobSpawning;
    }

    public boolean isPreventMobSpawningNatural() {
        return PreventMobSpawningNatural;
    }

    public boolean isPreventMobSpawningSpawners() {
        return PreventMobSpawningSpawners;
    }

    public boolean isPreventMobVillageDefence() {
        return PreventMobVillageDefence;
    }

    public boolean isPreventPushing() {
        return PreventPushing;
    }

    public Set<CMIUser> getAfkPlayers() {
        return afkPlayersMap
            .keySet()
            .stream()
            .map(CMIUser::getUser)
            .filter(Objects::nonNull)
            .collect(Collectors.toSet());
    }

    public HashMap<UUID, AfkInfo> getAfkPlayersMap() {
        return afkPlayersMap;
    }

    public int getAfkPlayerCount() {
        return afkPlayersMap.size();
    }

    public boolean isDisableOnLookAround() {
        return disableOnLookAround;
    }

    public boolean isPreventHook() {
        return PreventHook;
    }

}
