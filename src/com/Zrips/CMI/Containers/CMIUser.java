package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.BanEntry;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.PlayerManager;
import com.Zrips.CMI.Locale.CMILC;
import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.Modules.Chat.CMIPlayerMessageColor;
import com.Zrips.CMI.Modules.ChatFormat.CMIChatRoom;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.DeathMessages.damageInformation;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightCharge;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Mirror.Mirrors;
import com.Zrips.CMI.Modules.Notify.Notification;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayTime;
import com.Zrips.CMI.Modules.PlayTimeRewards.PTROneTime;
import com.Zrips.CMI.Modules.PlayerCombat.EntityKillCount;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerKillCount;
import com.Zrips.CMI.Modules.PlayerMeta.PlayerMeta;
import com.Zrips.CMI.Modules.PlayerOptions.PlayerOption;
import com.Zrips.CMI.Modules.Ranks.CMIRank;
import com.Zrips.CMI.Modules.SavedInv.SavedInventories;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;
import com.Zrips.CMI.Modules.Statistics.CMIStats;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Teleportations.CMITeleportFeedback;
import com.Zrips.CMI.Modules.Teleportations.CMITeleportType;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import com.Zrips.CMI.Modules.Warnings.CMIWarningCategory;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Messages.CMIMessages;
import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIUser {

    private Player player;
    private String namePlatePrefix;
    private String namePlateSuffix;
    private ChatColor namePlateNameColor;
    private boolean collision = true;
    private String name;
    private String nickName;
    private String displayName;

    private UUID uuid;
    private CMIEconomyAcount economy;
    private int id = 0;
    private int invId = 0;
    private int playTimeId = 0;
    private int playTimerewardId = 0;
    private LinkedHashMap<String, Integer> ips;
    private Location logOutLocation;
    private List<String> lockedIps;
    private long lastLogin = 0;
    private long lastLogoff = 0;
    private long totalPlayTime = 0;
    private CMILocation DeathLoc;
    private Location TpLoc;
    private String bungeeBackLocation;
    private long pTime = -1L;
    private boolean cuffed = false;

    private LinkedHashMap<Kit, CMIKitUsage> kits;

    private HashMap<String, Notification> notifications;
    private CmdCooldown CommandCooldown;
    private long totemCooldown = 0;
    private long totemWarmup = 0;
    private long tfly = 0;
    private long tgod = 0;
    private long teleportInvulnerability = 0;

    private long mutedUntil = 0;
    private long shadowMutedUntil = 0;
    private String mutedReason;

    private ChatColor glow;

    private boolean isFakeAccount = false;

    private String nameColor;
    private String prefix;
    private String suffix;
    private String group;

    private List<PlayerNote> notes;
    private List<PlayerMail> mail;

    private long lastPatrol = 0;

    private LinkedHashMap<String, CmiHome> homes;

    private Set<UUID> ignores;

    private boolean silenceMode = false;

    private boolean hadAllowFlight = false;
    private boolean AllowFlight = false;
    private boolean Flying = false;

    private int votifierVotes = 0;
    private List<Long> votifierVotesByTime;

    private long PlayTimeOptimized = 0;

    private String skin;

    private HashMap<String, Long> repeatableRewards;
    private Set<String> oneTimeRewards;

    HashMap<updateType, Long> lastInfoUpdate;

    private long afkImunity = 0;

    private long lastRespawn = 0;

    HashMap<String, worldFlyState> tempFlyModes = new HashMap<String, worldFlyState>();

    private int hungerSched = 0;

    HashMap<PlayerOption, Boolean> options = null;

    public CMIUser(int id) {
        this.id = id;
        CMI.getInstance().getPlayerManager().addUser(this, id);
    }

    public void cacheClear() {
    }

    public CMIUser(UUID uuid) {
    }

    @Deprecated
    public CMIUser(UUID uuid, boolean updatePerm) {
    }

    public CMIUser(OfflinePlayer player) {
    }

    public boolean isOnline() {
        return getOnlinePlayer(this.uuid) != null;
    }

    public Location getLogOutLocation() {
        if (logOutLocation == null && this.isOnline())
            logOutLocation = this.getPlayer(false).getLocation();
        return logOutLocation;
    }

    public Location getLocation() {
        if (!this.isOnline())
            return getLogOutLocation();
        return this.getPlayer(true).getLocation();
    }

    public void setLogOutLocation(Location logOutLocation) {
        this.logOutLocation = logOutLocation;
    }

    public void saveIfOffline() {
        if (!isOnline())
            addForDelayedSave();
    }

    Boolean fakeUser = null;

    public void addForDelayedSave() {
    }

    public void addForPlayTimeRewardSave() {
        CMI.getInstance().getDbManager().addForPlayTimeRewardSave(this);
    }

    public void setIps(LinkedHashMap<String, Integer> ips) {
        this.ips = ips;
    }

    public HashMap<String, Integer> getIps() {
        if (ips == null)
            ips = new LinkedHashMap<String, Integer>();
        return ips;
    }

    public boolean addIps(String ip) {
        return true;
    }

    public String getLastIp() {
        return null;
    }

    public String getCountry() {
        return null;
    }

    public String getCountryCode() {
        return null;
    }

    public String getCity() {
        return null;
    }

    public boolean addAllIps(Map<String, Integer> map) {
        boolean added = false;
        return added;
    }

    private CMITask schedId;
    private Boolean extend;

    private void ScheduleDataClear() {

    }

    public Player getPlayer() {
        return getPlayer(!this.isFakeAccount());
    }

    public Player getPlayer(boolean loadOfflineObject) {

        return null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return getName(false);
    }

    public OfflinePlayer getOfflinePlayer() {
        if (this.isOnline()) {
            return this.getPlayer(false);
        }
        if (this.getUniqueId() == null)
            return null;
        return Bukkit.getOfflinePlayer(this.getUniqueId());
    }

    public String getName(boolean update) {

        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastLogin() {
        return getLastLogin(false);
    }

    public long getLastLogin(boolean forceUpdate) {
        if (forceUpdate && lastLogin == 0L && getOfflinePlayer() != null)
            lastLogin = getOfflinePlayer().getLastPlayed();
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public long getLastLogoff() {
        return getLastLogoff(false);
    }

    public long getLastLogoff(boolean forceUpdate) {
        if (forceUpdate && lastLogoff == 0L && getOfflinePlayer() != null) {
            lastLogoff = getOfflinePlayer().getLastPlayed();
            this.addForDelayedSave();
        }
        return lastLogoff;
    }

    public long getLastLogoffClean() {
        return lastLogoff;
    }

    public void setLastLogoff(long lastLogoff) {
        this.lastLogoff = lastLogoff;
    }

    public Location getDeathLoc() {
        return DeathLoc;
    }

    public void setDeathLoc(CMILocation deathLoc) {
        DeathLoc = deathLoc;
    }

    @Deprecated
    public Location getTpLoc() {
        return getLastTeleportLocation();
    }

    public Location getLastTeleportLocation() {
        return TpLoc;
    }

    @Deprecated
    public void setTpLoc(Location tpLoc) {
        setLastTeleportLocation(tpLoc, true);
    }

    @Deprecated
    public void setTpLoc(Location tpLoc, boolean save) {
        setLastTeleportLocation(tpLoc, save);
    }

    public void setLastTeleportLocation(Location tpLoc) {
        setLastTeleportLocation(tpLoc, true);
    }

    public void setLastTeleportLocation(Location tpLoc, boolean save) {
        TpLoc = tpLoc != null ? tpLoc.clone() : null;
        if (save)
            addForDelayedSave();
    }

    @Deprecated
    public UUID getUuid() {
        return getUniqueId();
    }

    public UUID getUniqueId() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
        player = getOnlinePlayer(this.uuid);
        if (player != null)
            name = player.getName();
        updatePermissions();
    }

    public void setUuidNoPermUpdate(UUID uuid) {
        this.uuid = uuid;
        player = getOnlinePlayer(this.uuid);
        if (player != null)
            name = player.getName();
    }

    Long time = null;

    public void updatePermissions() {

    }

    public void updateDisplayName() {
        updateDisplayName(false);
    }

    public void updateDisplayName(boolean force) {

    }

    public void updatePrefix() {
    }

    public void updateSuffix() {
    }

    public void updateGroup() {
        group = CMI.getInstance().getPermissionsManager().getMainGroup(this.getPlayer(false));
    }

    public String getCleanDisplayName() {

        return null;
    }

    public void setDisplayName(String displayName) {
        if (displayName == null || !displayName.isEmpty())
            this.displayName = displayName;
    }

    public String getDisplayName() {
        return getDisplayName(true);
    }

    public String getDisplayName(boolean update) {
        return CMIChatColor.translate(getDisplayNameClean(update));
    }

    public String getDisplayNameClean(boolean update) {

        return null;
    }

    private enum updateType {
        prefix, suffix, group, nameColor, displayname;
    }

    private boolean timeToUpdate(updateType type) {

        return false;
    }

    public String getGroupName() {
        return null;
    }

    public String getNameColor() {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public String getSuffix() {
        return null;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName, boolean save) {
    }

    @Deprecated
    public long getpTime() {
        return getPlayerTime();
    }

    public long getPlayerTime() {
        return pTime;
    }

    @Deprecated
    public void setpTime(long i) {
        setPlayerTime(i, true);
    }

    public void setPlayerTime(long i) {
        setPlayerTime(i, true);
    }

    @Deprecated
    public void setpTime(long pTime, boolean save) {
        setPlayerTime(pTime, save);
    }

    public void setPlayerTime(long pTime, boolean save) {
        this.pTime = pTime;
        if (save)
            addForDelayedSave();
    }

    public boolean isCuffed() {
        return cuffed;
    }

    public void setCuffed(boolean cuffed) {
        setCuffed(cuffed, true);
    }

    public void setCuffed(boolean cuffed, boolean save) {
    }

    public List<String> getLockedIps() {
        if (lockedIps == null)
            lockedIps = new ArrayList<String>();
        return lockedIps;
    }

    public void setLockedIps(List<String> lockedIps) {
        this.lockedIps = lockedIps;
    }

    public void addLockedIps(String Ip) {
        if (Ip == null)
            return;
        Ip = Ip.replace("_", ".");
        if (!getLockedIps().contains(Ip))
            getLockedIps().add(Ip);
        addForDelayedSave();
    }

    public boolean removeLockedIps(String Ip) {
        if (Ip == null)
            return false;
        addForDelayedSave();
        return getLockedIps().remove(Ip);
    }

    public boolean isJoinedCounter() {
        return CMICounter.isJoinedCounter(this.getUniqueId());
    }

    public void setJoinedCounter(boolean joinedCounter) {
        CMICounter.setJoinedCounter(getUniqueId(), joinedCounter);
    }

    public HashMap<String, Long> getCounter() {
        return CMICounter.getCounter(getUniqueId());
    }

    public Long getCounter(String cmd) {
        return getCounter().get(cmd);
    }

    public void addCounter(String cmd, Long time) {
        getCounter().put(cmd, time);
    }

    public long getAlertUntil() {
        CMIUserAlert alert = CMI.getInstance().getPlayerManager().getAlert(this.getUniqueId());
        return alert == null ? 0 : alert.getUntil();
    }

    public void setAlertUntil(long alertUntil) {
        setAlertUntil(alertUntil, true);
    }

    public void removeAlert() {
        CMI.getInstance().getPlayerManager().removeAlert(this.getUniqueId());
        addForDelayedSave();
    }

    public void setAlertUntil(long alertUntil, boolean save) {
    }

    public String getAlertReason() {
        CMIUserAlert alert = CMI.getInstance().getPlayerManager().getAlert(this.getUniqueId());
        return alert == null ? null : alert.getReason();
    }

    public void setAlertReason(String alertReason) {
        setAlertReason(alertReason, true);
    }

    public void setAlertReason(String alertReason, boolean save) {
        CMIUserAlert alert = CMI.getInstance().getPlayerManager().getAlert(this.getUniqueId());
        if (alert != null)
            alert.setReason(alertReason);
        if (save)
            addForDelayedSave();
    }

    public boolean isGod() {
        return false;
    }

    public Mirrors getMirror() {
        return CMI.getInstance().getMirrorManager().getMirror(getUniqueId());
    }

    public void setMirror(Mirrors mirror) {
        CMI.getInstance().getMirrorManager().setMirror(getUniqueId(), mirror);
    }

    public LinkedHashMap<Kit, CMIKitUsage> getKits() {
        if (kits == null)
            kits = new LinkedHashMap<Kit, CMIKitUsage>();
        return kits;
    }

    public HashMap<String, Long> getKitsAsMap() {
        return null;
    }

    @Deprecated
    public void setKits(LinkedHashMap<Kit, CMIKitUsage> kits) {
        getKits().clear();
        for (Entry<Kit, CMIKitUsage> one : kits.entrySet()) {
            getKits().put(one.getKey(), new CMIKitUsage(one.getKey(), one.getValue().getLastUsage(), one.getValue().getUsedTimes()));
        }
    }

    public void addKit(Kit kit, Long time) {
        addKit(kit, time, true);
    }

    public void addKit(Kit kit, Long time, boolean save) {
        addKit(kit, time, null, save);
    }

    public void addKit(Kit kit, Long time, Integer usedTimes, boolean save) {

    }

    public Long getKitTime(Kit kit) {
        return getKits().get(kit) == null ? null : getKits().get(kit).getLastUsage();
    }

    public Long getKitUseTimeIn(Kit kit) {
        return null;
    }

    public boolean canUseKit(Kit kit) {
        return false;
    }

    public int getLeftKitUseTimes(Kit kit) {
        CMIKitUsage usage = getKits().get(kit);
        if (usage == null)
            return kit.getMaxUsages();
        if (kit.getMaxUsages() < 0)
            return kit.getMaxUsages();
        return kit.getMaxUsages() - usage.getUsedTimes() < 0 ? 0 : kit.getMaxUsages() - usage.getUsedTimes();
    }

    public int getKitUseTimes(Kit kit) {
        CMIKitUsage usage = getKits().get(kit);
        if (usage == null)
            return 0;
        return usage.getUsedTimes();
    }

    public CMIUser resetKitUseTimes(Kit kit) {
        CMIKitUsage usage = getKits().get(kit);
        if (usage == null)
            return this;
        usage.setUsedTimes(0);
        return this;
    }

    public PlayerCharge getPCharge() {
        return getPCharge(true);
    }

    public PlayerCharge getPCharge(boolean update) {
        return CMI.getInstance().getSpawnerChargesManager().getPCharge(this, update);
    }

    public HashMap<String, Notification> getNotifications() {
        if (notifications == null)
            notifications = new HashMap<String, Notification>();
        return notifications;
    }

    public void addNotification(Notification notification) {
        getNotifications().put(notification.getNotifyier(), notification);
        addForDelayedSave();
    }

    public long getTotalPlayTime() {
        return getTotalPlayTime(true);
    }

    private static Statistic statCheck = null;

    public long getTotalPlayTime(boolean update) {

        return totalPlayTime;
    }

    public long getTotalPlayTimeClean() {
        return totalPlayTime;
    }

    public void setTotalPlayTime(long totalPlayTime) {
        this.totalPlayTime = totalPlayTime;
    }

    public CmdCooldown getCommandCooldowns() {
        if (CommandCooldown == null)
            CommandCooldown = new CmdCooldown();
        return CommandCooldown;
    }

    public void addCommandCooldownByEndTime(String cmd, Long time, Long endTime) {
        getCommandCooldowns().addCooldown(cmd, time, endTime - time);
    }

    public long getTotemCooldown() {
        return totemCooldown;
    }

    public void setTotemCooldown(long totemCooldown) {
        this.totemCooldown = totemCooldown;
    }

    @Deprecated
    public boolean isShowTotemBar() {
        return this.getOptionState(PlayerOption.totemBossBar);
    }

    @Deprecated
    public void setShowTotemBar(boolean showTotemBar) {
        this.setOptionState(PlayerOption.totemBossBar, showTotemBar);
    }

    public long getTotemWarmup() {
        return totemWarmup;
    }

    public void setTotemWarmup(long totemWarmup) {
        this.totemWarmup = totemWarmup;
    }

    public long getTfly() {
        return tfly == -1 ? -1 : tfly + 2000L < System.currentTimeMillis() ? 0 : tfly;
    }

    public void setTfly(long tfly) {
        setTfly(tfly, true);
    }

    public void setTfly(long tfly, boolean save) {
        this.tfly = tfly <= -1 ? -1 : tfly;
        if (save)
            addForDelayedSave();
    }

    public boolean isTgod() {
        return tgod == -1 ? true : tgod + 2000L > System.currentTimeMillis();
    }

    public long getTgod() {
        return tgod == -1 ? -1 : tgod + 2000L < System.currentTimeMillis() ? 0 : tgod;
    }

    public void setTgod(long tgod) {
        setTgod(tgod, true);
    }

    public void setTgod(long tgod, boolean save) {
        this.tgod = tgod <= -1 ? -1 : tgod;
        if (save)
            addForDelayedSave();
    }

    public LinkedHashMap<String, CmiHome> getHomes() {
        if (homes == null)
            homes = new LinkedHashMap<String, CmiHome>();
        return homes;
    }

    public int getTotalFavoriteHomeCount() {
        if (homes == null)
            return 0;

        int fav = 0;

        for (CmiHome one : getHomes().values()) {
            if (one.isFavorite())
                fav++;
        }

        return fav;
    }

    public Set<CmiHome> getHomesFromWorld(String worldName) {
        return null;
    }

    public int getValidHomeCount() {
        if (homes == null)
            homes = new LinkedHashMap<String, CmiHome>();
        int count = 0;
        for (CmiHome one : homes.values()) {
            if (!one.getLoc().isValid())
                continue;
            count++;
        }
        return count;
    }

    public int getLastHomeSlot() {
        int i = 0;
        for (Entry<String, CmiHome> one : homes.entrySet()) {
            if (one.getValue().getSlot() == null)
                continue;
            if (i < one.getValue().getSlot())
                i = one.getValue().getSlot();
        }
        return i == 0 || i < getHomes().size() ? getHomes().size() : i;
    }

    public Set<CmiHome> getHomesBySlot(int slot) {
        return null;
    }

    public LinkedHashMap<String, CMILocation> getHomesAsMap() {
        return null;
    }

    public ArrayList<String> getHomesList() {
        ArrayList<String> list = new ArrayList<String>();
        for (Entry<String, CmiHome> one : getHomes().entrySet()) {
            list.add(one.getKey());
        }
        return list;
    }

    public CmiHome getHome(String name) {
        return null;
    }

    public CmiHome getBedHome() {
        return null;
    }

    public void removeHome(CmiHome home) {
        if (home != null)
            getHomes().remove(home.getName());
    }

    public void removeHome(String name) {
        if (name == null)
            return;
        CmiHome home = getHome(name);
        removeHome(home);
    }

    @Deprecated
    public void addHome(@SuppressWarnings("unused") String name, CmiHome home, boolean save) {
        addHome(home, save);
    }

    public void addHome(CmiHome home, boolean save) {
        getHomes().put(home.getName(), home);
        if (home.getName().equals(CMI.getInstance().getHomeManager().getDefaultBedHomeName())) {
            CMI.getInstance().getHomeManager().addBedHome(this, home);
        }
        if (save)
            addForDelayedSave();
    }

    public ChatColor getGlow() {
        return glow;
    }

    public void setGlow(ChatColor glow, boolean save) {

    }

    @Deprecated
    public boolean isTeleportToggled() {
        return !this.getOptionState(PlayerOption.acceptingTPA);
    }

    @Deprecated
    public void setTeleportToggled(boolean noTeleport, boolean save) {
        this.setOptionState(PlayerOption.acceptingTPA, noTeleport);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        CMI.getInstance().getPlayerManager().addUser(this, id);
    }

    public int getInvId() {
        return invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public int getPlayTimeId() {
        return playTimeId;
    }

    public void setPlayTimeId(int playTimeId) {
        this.playTimeId = playTimeId;
    }

    public List<PlayerNote> getNotes() {
        return getNotes(true);
    }

    public List<PlayerNote> getNotes(boolean filterOldOut) {
        return null;
    }

    public void setNotes(List<PlayerNote> notes) {
        this.notes = notes;
    }

    public void addNote(PlayerNote note, boolean save) {
        getNotes(save).add(note);
        if (save)
            addForDelayedSave();
    }

    public void removeMail(PlayerMail mail) {
        if (this.mail != null)
            this.mail.remove(mail);
    }

    public void clearMails() {
        if (mail != null)
            mail.clear();
    }

    public List<PlayerMail> getMails() {

        return null;
    }

    public void setMail(List<PlayerMail> mail) {
        this.mail = mail;
    }

    public void addMail(PlayerMail mail, boolean save) {
        getMails().add(mail);
        if (save)
            addForDelayedSave();
    }

    public long getLastPatrol() {
        return lastPatrol;
    }

    public void setPatroled() {
        this.lastPatrol = System.currentTimeMillis();
    }

    public long getStatistic(CMIStatistic stat) {
        return getStatistic(stat, null);
    }

    public long getStatistic(CMIStatistic stat, Object thing) {
        return CMIStats.getStat(this, stat, thing);
    }

    public CMIRank getNullRank() {
        return CMI.getInstance().getRankManager().getNullRank(this);
    }

    public CMIRank getRank() {
        return CMI.getInstance().getRankManager().getRank(this);
    }

    public CMIRank recalculateRank() {
        return CMI.getInstance().getRankManager().recalculateRank(this);
    }

    public void setRank(CMIRank rank) {
        CMI.getInstance().getRankManager().setRank(this, rank);
    }

    @Deprecated
    public boolean isTagSoundEnabled() {
        return this.getOptionState(PlayerOption.tagSound);
    }

    @Deprecated
    public void setTagSoundEnabled(boolean tagEnabled) {
        this.setOptionState(PlayerOption.tagSound, tagEnabled);
    }

    @Deprecated
    public boolean isShiftEditEnabled() {
        return this.getOptionState(PlayerOption.shiftSignEdit);
    }

    @Deprecated
    public void setShiftEditEnabled(boolean shiftEditEnabled) {
        this.setOptionState(PlayerOption.shiftSignEdit, shiftEditEnabled);
    }

    @Deprecated
    public boolean isSpy() {
        return this.getOptionState(PlayerOption.chatSpy);
    }

    @Deprecated
    public void setSpy(boolean spy) {
        this.setOptionState(PlayerOption.chatSpy, spy);
    }

    @Deprecated
    public boolean isCommandSpy() {
        return this.getOptionState(PlayerOption.cmdSpy);
    }

    @Deprecated
    public void setCommandSpy(boolean spy, boolean save) {
        this.setOptionState(PlayerOption.cmdSpy, spy);
    }

    @Deprecated
    public boolean isSignSpy() {
        return this.getOptionState(PlayerOption.signSpy);
    }

    @Deprecated
    public void setSignSpy(boolean spy, boolean save) {
        this.setOptionState(PlayerOption.signSpy, spy);
    }

    public boolean isSame(CommandSender sender) {
        if (sender instanceof Player)
            return isSame((Player) sender);
        return false;
    }

    public boolean isSame(Player player) {
        return player.getUniqueId().equals(this.getUniqueId());
    }

    public boolean isAfk() {
        return CMI.getInstance().getAfkManager().isAfk(getUniqueId());
    }

    public @Nullable AfkInfo getAfkInfo() {
        return CMI.getInstance().getAfkManager().getAfkInfo(getUniqueId());
    }

    public AfkInfo getAfkInfoSafe() {
        return CMI.getInstance().getAfkManager().createAfkInfo(getUniqueId());
    }

    public void setAfk(boolean afk) {
        setAfk(afk, AfkType.manual);
    }

    public void setAfk(boolean afk, AfkType type) {
        setAfk(afk, type, true);
    }

    public void setAfk(boolean afk, AfkType type, boolean performCommands) {

    }

    private void turnOnAfk(AfkType type, List<String> cmds) {

    }

    private void turnOffAfk(AfkType type, List<String> cmds) {

    }

    public void setAfkReason(String reason) {
        getAfkInfoSafe().setReason(reason);
    }

    public String getAfkReason() {
        return getAfkInfo() == null ? null : getAfkInfo().getReason();
    }

    public boolean isBanned() {
        return false;
    }

    public CMIUser setBanned() {
        return setBanned(null, null, null, null);
    }

    public CMIUser setBanned(String reason) {
        return setBanned(reason, null, null, null);
    }

    public CMIUser setBanned(Date until) {
        return setBanned(null, null, until, null);
    }

    public CMIUser setBanned(String reason, Date until) {
        return setBanned(reason, null, until, null);
    }

    public CMIUser setBanned(String reason, CommandSender by, Date until) {
        if (by instanceof Player)
            return setBanned(reason, CMIUser.getUser((Player) by), until, new Date(System.currentTimeMillis()));
        return setBanned(reason, null, until, new Date(System.currentTimeMillis()));
    }

    public CMIUser setBanned(String reason, CMIUser by, Date until, Date when) {
        return CMIBanRecords.setBanned(this, reason, by, until, when);
    }

    public CMIUser unBan() {
        return CMIBanRecords.unBan(this);
    }

    public CMIBanEntry getBanEntryRaw() {
        return CMIBanRecords.getBanEntryRaw(this.getUniqueId());
    }

    public CMIBanEntry getBanEntry() {
        return getBanEntry(true);
    }

    public void updateBanEntry(BanEntry entry) {
    }

    public CMIBanEntry getBanEntry(boolean update) {
        return null;
    }

    public Set<UUID> getIgnores() {
        if (ignores == null)
            ignores = new HashSet<UUID>();
        return ignores;
    }

    public String getIgnoresString() {
        StringBuilder ig = new StringBuilder();
        for (UUID one : getIgnores()) {
            if (!ig.toString().isEmpty()) {
                ig.append(PlayerManager.lineSeparator);
            }
            ig.append(one.toString());
        }

        return ig.toString();
    }

    public void setIgnores(Set<UUID> ignores) {
        this.ignores = ignores;
    }

    public void addIgnore(UUID ignore, boolean save) {
        getIgnores().add(ignore);
        if (save)
            this.addForDelayedSave();
    }

    public void removeIgnore(UUID ignore) {
        getIgnores().remove(ignore);
    }

    public boolean isIgnoring(UUID uuid) {
        return getIgnores().contains(uuid) || getIgnores().contains(CMI.getInstance().getPlayerManager().getEmptyUserUUID());
    }

    public boolean isSilenceMode() {
        return silenceMode;
    }

    public void setSilenceMode(boolean silenceMode) {
        this.silenceMode = silenceMode;
    }

    public CMIVanish getVanish() {
        return CMI.getInstance().getVanishManager().getVanish(getUniqueId());
    }

    public boolean isVanished() {
        boolean vanished = isCMIVanished();
        return vanished;
    }

    public boolean isCMIVanished() {
        return false;
    }

    public void setVanished(boolean vanished) {
        setVanished(vanished, true);
    }

    public void setVanished(boolean vanished, boolean fireEvent) {
    }

    public void updateVanishMode() {

    }

    public boolean isSitting() {
        if (!this.isOnline())
            return false;
        return CMI.getInstance().getAnimationManager().isSitting(getPlayer());
    }

    public String getMutedReason() {
        if (!isMuted())
            return null;
        return mutedReason;
    }

    public void setMutedReason(String reason) {
        mutedReason = reason;
    }

    public Long getMutedUntil() {
        return mutedUntil;
    }

    public boolean isMuted() {
        if (isShadowMuted())
            return true;
        return mutedUntil < System.currentTimeMillis() ? false : true;
    }

    public void setMutedUntil(long mutedUntil) {
        this.mutedUntil = mutedUntil;
    }

    public long getShadowMutedUntil() {
        return shadowMutedUntil;
    }

    public void setShadowMutedUntil(long shadowMutedUntil) {
        this.shadowMutedUntil = shadowMutedUntil;
    }

    public boolean isShadowMuted() {
        return shadowMutedUntil < System.currentTimeMillis() ? false : true;
    }

    /**
    * Sets the value for a variable
    * @param source only used to indicate from who money is deposited but doesn't deduct from it
    */
    public Double deposit(Double balance, CMIUser source) {
//	Update for multiworld support
//	return deposit(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return deposit(null, balance, source);
    }

    public Double deposit(Double balance) {
//	Update for multiworld support
//	return deposit(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return deposit(null, balance);
    }

    public Double deposit(String worldName, Double balance) {
        return deposit(worldName, balance, null);
    }

    public Double deposit(String worldName, Double balance, CMIUser source) {
        balance = balance == null ? 0D : balance;
        return getEconomyAccount().deposit(worldName, balance, source);
    }

    /**
    * Sets the value for a variable
    * @param target only used to indicate who gets money but doesn't actually transfer to target player
    */
    public Double withdraw(Double balance, CMIUser target) {
//	Update for multiworld support
//	return withdraw(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return withdraw(null, balance, target);
    }

    public Double withdraw(Double balance) {
//	Update for multiworld support
//	return withdraw(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return withdraw(null, balance);
    }

    public Double withdraw(String worldName, Double balance) {
        return withdraw(worldName, balance, null);
    }

    public Double withdraw(String worldName, Double balance, CMIUser source) {
        balance = balance == null ? 0D : balance;
        return getEconomyAccount().withdraw(worldName, balance, source);
    }

    @Deprecated
    public boolean has(Double balance) {
//	Update for multiworld support
//	return has(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return hasMoney(balance);
    }

    public boolean hasMoney(Double balance) {
        if (balance == 0D)
            return true;
//	Update for multiworld support
//	return has(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
        return has(null, balance);
    }

    public boolean has(String worldName, Double balance) {
        return getEconomyAccount().has(worldName, balance);
    }

    public Double getBalance() {
//	Update for multiworld support
//	return getBalance(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName());
        return getBalance(null);
    }

    public Double getBalance(String worldName) {
//	if (!CMI.getInstance().getEconomyManager().isVaultEnabled())
//	    return null;
        return getEconomyAccount().getBalance(worldName);
    }

    public String getFormatedBalance() {
        return getFormatedBalance(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName());
    }

    public String getFormatedBalance(boolean shorts) {
        return getFormatedBalance(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), shorts);
    }

    public String getFormatedBalance(String worldName) {
        return getFormatedBalance(worldName, false);
    }

    public String getFormatedBalance(String worldName, boolean shorts) {
//	if (!CMI.getInstance().getEconomyManager().isVaultEnabled())
//	    return "";
//	if (this.getPlayer() == null)
//	    return "";
        return getEconomyAccount().getFormatedBalance(worldName, shorts);
    }

    public CMIEconomyAcount getEconomyAccount() {
        if (this.economy == null)
            this.economy = new CMIEconomyAcount(this);
        return this.economy;
    }

    public World getWorld() {
        if (this.isOnline() && this.getPlayer() != null)
            return this.getPlayer().getLocation().getWorld();
        return this.getLogOutLocation() != null ? this.getLogOutLocation().getWorld() : null;
    }

    public boolean respawn() {
        return true;
    }

    public void removeBossBar(String name) {
        CMILib.getInstance().getBossBarManager().removeBossBar(this.getPlayer(false), name);
    }

    public void removeBossBar(BossBarInfo bossBar) {
        CMILib.getInstance().getBossBarManager().removeBossBar(this.getPlayer(false), bossBar);
    }

    public void addBossBar(BossBarInfo barInfo) {
        if (this.getPlayer(false) == null || !this.getPlayer(false).isOnline())
            return;
        CMILib.getInstance().getBossBarManager().addBossBar(this.getPlayer(false), barInfo);
    }

    public synchronized BossBarInfo getBossBar(String name) {
        return CMILib.getInstance().getBossBarManager().getBossBar(this.getPlayer(false), name);
    }

    public synchronized ConcurrentHashMap<String, BossBarInfo> getBossBarInfo() {
        return CMILib.getInstance().getBossBarManager().getBossBarInfo(this.getPlayer(false));
    }

    public synchronized void hideBossBars() {
        if (!this.isOnline()) {
            clearBossMaps();
            return;
        }
        CMILib.getInstance().getBossBarManager().hideBossBars(this.getPlayer(false));
    }

    public void clearBossMaps() {
        CMILib.getInstance().getBossBarManager().clearBossMaps(this.getPlayer(false));
    }

    public CMIPlayerInventory getInventory() {
        return new CMIPlayerInventory(this);
    }

    public void updateInventory() {
        if (this.isOnline())
            this.getPlayer().updateInventory();
    }

    public void setLevel(int level) {
        CMIExperience.setLevel(this.getPlayer(), level);
    }

    public void setExp(long exp) {
        CMIExperience.setExp(this.getPlayer(), exp);
    }

    public void addExp(long exp) {
        CMIExperience.addExp(this.getPlayer(), exp);
    }

    public void takeExp(long exp) {
        CMIExperience.takeExp(this.getPlayer(), exp);
    }

    public long getMissingExp() {
        return CMIExperience.getMissingExp(this.getPlayer());
    }

    public int getLevel() {
        return CMIExperience.getLevel(this.getPlayer());
    }

    public long getExpForCurrentLevel() {
        return CMIExperience.getExpForCurrentLevel(this.getPlayer());
    }

    @Deprecated
    public long getExp() {
        return getTotalExp();
    }

    public long getTotalExp() {
        if (this.getPlayer() == null)
            return 0;

        return CMIExperience.getTotalExp(player);
    }

    public FlightCharge getFlightCharge() {
        return CMI.getInstance().getFlightChargeManager().getFlightCharge(getUniqueId());
    }

    public boolean hasPermission(CMIPerm perm) {
        return perm.hasPermission(this.getPlayer(false));
    }

    public boolean hasSetPermission(CMIPerm perm) {
        return perm.hasSetPermission(this.getPlayer(false));
    }

    public boolean hasMeta() {
        return PlayerMeta.getMetaRaw(getUniqueId()) != null && PlayerMeta.getMetaRaw(getUniqueId()).containsValues();
    }

    public PlayerMeta getMeta() {
        return PlayerMeta.getMeta(getUniqueId());
    }

    public String getMeta(String Key) {
        return getMeta().getValue(Key);
    }

    public boolean isAllowFlight() {
        if (this.isOnline())
            return this.getPlayer().getAllowFlight();
        return AllowFlight;
    }

    public void setAllowFlight(boolean allowFlight) {
        AllowFlight = allowFlight;
        if (this.isOnline()) {
            if (allowFlight || !this.getPlayer().getGameMode().toString().equalsIgnoreCase("SPECTATOR")) {
                this.getPlayer().setAllowFlight(allowFlight);
            }
        }
    }

    public void setGameMode(GameMode mode) {
        CMI.getInstance().getReflectionManager().setGameMode(this.getPlayer(), mode);
    }

    public boolean wasFlying() {
        return Flying;
    }

    public boolean hadAllowFlight() {
        return hadAllowFlight;
    }

    public void setHadAllowFlight(boolean allowFlight) {
        hadAllowFlight = allowFlight;
    }

    public boolean setWasFlying(boolean flying) {
        return Flying = flying;
    }

    public boolean isFlying() {
        if (this.isOnline())
            return this.getPlayer().isFlying();
        return Flying;
    }

    public void setFlying(boolean flying) {
    }

    public SavedInventories getSavedInventories() {
        return CMI.getInstance().getSavedInventoryManager().getInventories(this);
    }

    public int getVotifierVotes() {
        return votifierVotes;
    }

    public void setVotifierVotes(int votifierVotes) {
        this.votifierVotes = votifierVotes;
    }

    public boolean addVotifierVote() {
        return true;
    }

    public int getDailyVoteCount() {

        if (votifierVotesByTime == null || votifierVotesByTime.isEmpty())
            return 0;

        while (votifierVotesByTime.size() > CMI.getInstance().getVotifierManager().getMaxVotesInADay() + 1) {
            votifierVotesByTime.remove(0);
        }

        while (!votifierVotesByTime.isEmpty() && votifierVotesByTime.get(0) < System.currentTimeMillis() - (24 * 60 * 60 * 1000L)) {
            votifierVotesByTime.remove(0);
        }

        return votifierVotesByTime.size();
    }

    public Long getLastDailyVoteTime() {
        return null;
    }

    private CMIUserJailData getJailData() {
        return CMI.getInstance().getJailManager().getJailData(this.getUniqueId());
    }

    public boolean isJailed() {
        return true;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId) {
        return jail(jailTimeSec, jail, cellId, null);
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason) {
        return jail(jailTimeSec, jail, cellId, reason, null);
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason, UUID jailedBy) {
        getJailData().setJailedReason(reason);
        getJailData().setJailedBy(jailedBy);
        boolean feed = CMI.getInstance().getJailManager().placePlayerIntoJail(this, jail, cellId, jailTimeSec * 1000);
        if (feed)
            setJailedForTime(jailTimeSec * 1000, true);
        return feed;
    }

    public void unjail() {
        CMI.getInstance().getJailManager().removePlayerFromJail(this);
    }

    public Long getJailedUntil() {
        return System.currentTimeMillis() + getJailedForTime();
    }

    public void updateJailedTimeOnJoin() {
    }

    public long getJailedForTime() {
        long t = getJailData().getJailedForTime();
        if (CMI.getInstance().getJailManager().isCountWhileOffline() && !this.isOnline() && this.getLastLogoff() > 0) {
            t -= System.currentTimeMillis() - this.getLastLogoff();
        }
        if (t <= 0) {
            getJailData().setJailedForTime(0);
        }
        return t <= 0 ? 0 : t;
    }

    public void setJailedForTime(long jailedForTime) {
        setJailedForTime(jailedForTime, false);
    }

    public void setJailedForTime(long jailedForTime, boolean save) {
    }

    public CMIJailCell getCell() {
        return getJailData().getCell();
    }

    public void setCell(CMIJailCell cell) {
    }

    public Boolean isFakeAccount() {
        return isFakeAccount;
    }

    public void setFakeAccount(boolean isFakeAccount) {
        this.isFakeAccount = isFakeAccount;
    }

    public CMIPlayTime getCMIPlayTime() {
        return CMI.getInstance().getPlayTimeManager().getCMIPlayTime(getUniqueId());
    }

    public void setCMIPlayTime(CMIPlayTime playTime) {
        CMI.getInstance().getPlayTimeManager().setCMIPlayTime(getUniqueId(), playTime);
    }

    public void updatePlayTime() {
        getCMIPlayTime().updatePlayTime();
    }

    public long getPlayTimeOptimizedOn() {
        return PlayTimeOptimized;
    }

    public void setPlayTimeOptimizedOn(long playTimeOptimized) {
        PlayTimeOptimized = playTimeOptimized;
    }

    @Deprecated
    public boolean isNoPayToggled() {
        return !this.getOptionState(PlayerOption.acceptingMoney);
    }

    @Deprecated
    public void setNoPayToggled(boolean noPayToggle) {
        this.setOptionState(PlayerOption.acceptingMoney, noPayToggle);
    }

    public String getJailedReason() {
        return null;
    }

    public void setJailedReason(String jailedReason) {
    }

    public ItemStack getItemInHand() {
        return CMILib.getInstance().getReflectionManager().getItemInMainHand(this.getPlayer());
    }

    public void setItemInHand(ItemStack item) {
        if (getPlayer() != null)
            getPlayer().getInventory().setItemInMainHand(item);
    }

    public void setItemInOffHand(ItemStack item) {
        if (getPlayer() != null && Version.isCurrentHigher(Version.v1_8_R3))
            getPlayer().getInventory().setItemInOffHand(item);
    }

    public ItemStack getItemInOffHand() {
        if (Version.isCurrentHigher(Version.v1_8_R3) && this.getPlayer() != null && this.getPlayer().getInventory() != null)
            return this.getPlayer().getInventory().getItemInOffHand();
        return null;
    }

    public boolean hasSetSkin() {
        return skin != null;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getPlayTimeRewardId() {
        return playTimerewardId;
    }

    public void setPlayTimeRewardId(int playTimeRewardId) {
        this.playTimerewardId = playTimeRewardId;
    }

    public String getPTRRString() {
        return null;
    }

    public String getPTROString() {
        return null;
    }

    public HashMap<String, Long> getRepeatableRewards() {
        if (repeatableRewards == null)
            repeatableRewards = new HashMap<String, Long>();
        return repeatableRewards;
    }

    public void addRepeatableReward(String name, long time) {
        getRepeatableRewards().put(name.toLowerCase(), time);
    }

    public Long getRepeatableRewardTime(String name) {
        return getRepeatableRewards().get(name.toLowerCase());
    }

    public Set<String> getOneTimeRewards() {
        if (oneTimeRewards == null)
            oneTimeRewards = new HashSet<String>();
        return oneTimeRewards;
    }

    public void addOneTimeReward(String name) {
        getOneTimeRewards().add(name.toLowerCase());
    }

    public boolean isClaimedReward(PTROneTime reward) {
        if (oneTimeRewards == null)
            return false;

        return oneTimeRewards.contains(reward.getName().toLowerCase());
    }

    public void unloadData() {
    }

    public String getNamePlatePrefix() {

        if (namePlatePrefix != null && Version.isCurrentEqualOrLower(Version.v1_15_R1) && namePlatePrefix.length() > 16) {
            return namePlatePrefix.substring(0, 15);
        }

        return namePlatePrefix;
    }

    public void setNamePlatePrefix(String namePlatePrefix) {
        this.namePlatePrefix = namePlatePrefix;
        if (this.namePlatePrefix != null && this.namePlatePrefix.isEmpty())
            this.namePlatePrefix = null;
    }

    public String getNamePlateSuffix() {
        if (namePlateSuffix != null && Version.isCurrentEqualOrLower(Version.v1_15_R1) && namePlateSuffix.length() > 16) {
            return namePlateSuffix.substring(0, 15);
        }
        return namePlateSuffix;
    }

    public void setNamePlateSuffix(String namePlateSuffix) {
        this.namePlateSuffix = namePlateSuffix;
        if (this.namePlateSuffix != null && this.namePlateSuffix.isEmpty())
            this.namePlateSuffix = null;
    }

    public void setCollision(boolean state) {
        collision = state;
        applyCollision();
    }

    public boolean isCollidable() {
        return collision;
    }

    @Deprecated
    public Boolean getCollision() {
        return isCollidable();
    }

    private void applyCollision() {

    }

    @Deprecated
    public void reaplyNamePlate() {
        reapplyNamePlate();
    }

    public void reapplyNamePlate() {

    }

    public double getLookDirectionInDegrees() {
        Location loc = this.getPlayer().getLocation();
        if (loc == null)
            return 0;
        return (int) (((loc.getYaw() + 540) % 360) * 100) / 100D;
    }

    public CMIDirection getLookDirection() {
        double deg = getLookDirectionInDegrees();
        return CMIDirection.getFromAngle(deg);
    }

    public List<CMIPlayerWarning> getWarnings() {
        return CMI.getInstance().getWarningManager().getWarnings(getUniqueId());
    }

    public void setWarnings(List<CMIPlayerWarning> warnings) {
        CMI.getInstance().getWarningManager().setWarnings(getUniqueId(), warnings);
    }

    public int getWarningPoints() {
        int points = 0;
        for (CMIPlayerWarning one : this.getWarnings()) {
            points += one.getCategory().getPoints();
        }
        return points;
    }

    public int removeWarning(CMIPlayerWarning warning) {
        getWarnings().remove(warning);
        return getWarningPoints();
    }

    public CMIPlayerWarning addWarning(String source, String reason, CMIWarningCategory category) {
        return null;
    }

    public CMIPlayerWarning addWarning(CMIPlayerWarning warning) {
        getWarnings().add(warning);
        return warning;
    }

    public HashMap<String, Long> getWarningsAsMap() {
        return null;
    }

    @Deprecated
    public boolean isAcceptingPM() {
        return this.getOptionState(PlayerOption.acceptingPM);
    }

    @Deprecated
    public void setAcceptingPM(boolean acceptingPM) {
        this.setOptionState(PlayerOption.acceptingPM, acceptingPM);
    }

    public Long getGotLastDamageAt() {
        return CMI.getInstance().getPlayerCombatManager().getGotLastDamageAt(getUniqueId());
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
        CMI.getInstance().getPlayerCombatManager().setGotLastDamageAt(getUniqueId(), gotLastDamageAt);
    }

    public boolean isInCombatWithPlayer() {
        return CMI.getInstance().getPlayerCombatManager().isInCombatWithPlayer(getUniqueId());
    }

    public Long getGotLastDamageFromPlayer() {
        return CMI.getInstance().getPlayerCombatManager().getGotLastDamageFromPlayer(getUniqueId());
    }

    public void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer) {
        CMI.getInstance().getPlayerCombatManager().setGotLastDamageFromPlayer(getUniqueId(), gotLastDamageFromPlayer);
    }

    public void setDidLastDamageToPlayer(Long didLastDamageToPlayer) {
        CMI.getInstance().getPlayerCombatManager().setDidLastDamageToPlayer(getUniqueId(), didLastDamageToPlayer);
    }

    public boolean isInCombatWithMob() {
        return CMI.getInstance().getPlayerCombatManager().isInCombatWithMob(getUniqueId());
    }

    public Long getGotLastDamageFromMob() {
        return CMI.getInstance().getPlayerCombatManager().getGotLastDamageFromMob(getUniqueId());
    }

    public void setGotLastDamageFromMob(Long gotLastDamageFromMob) {
        CMI.getInstance().getPlayerCombatManager().setGotLastDamageFromMob(getUniqueId(), gotLastDamageFromMob);
    }

    public void setDidLastDamageToEntity(Long didLastDamageToMob) {
        CMI.getInstance().getPlayerCombatManager().setDidLastDamageToEntity(getUniqueId(), didLastDamageToMob);
    }

    public long getLeftCombatTime() {
        return CMI.getInstance().getPlayerCombatManager().getLeftCombatTime(getUniqueId());
    }

    public void sendMessage(String msg) {
        if (msg.isEmpty())
            return;
        if (this.isOnline())
            CMIMessages.sendMessage(this.getPlayer(), msg);
    }

    public void sendMessage(String command, String shortPath, Object... variables) {
        if (this.isOnline()) {
            CMILC.info(command, this, shortPath, variables);
        }
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Entity ent) {
        return teleport(ent.getLocation(), CMITeleportType.Unknown);
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Location loc) {
        return teleport(loc, CMITeleportType.Unknown);
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Location loc, CMITeleportType type) {
        return CMI.getInstance().getTeleportHandler().teleportPlayer(this.getPlayer(), loc, type);
    }

    public HashMap<UUID, PlayerKillCount> getKills() {
        return CMI.getInstance().getPlayerCombatManager().getKills(getUniqueId());
    }

    public void addHeadDropCount(UUID uuid) {
        getKills().computeIfAbsent(uuid, k -> new PlayerKillCount(uuid)).addHeadDropCount();
    }

    public void addKill(UUID uuid) {
        getKills().computeIfAbsent(uuid, k -> new PlayerKillCount(uuid)).addKill();
    }

    @Deprecated
    public double getHeadDropChance(UUID uuid) {
        return getHeadDropChance(uuid, true);
    }

    public double getHeadDropChance(UUID uuid, boolean addEnchantBonus) {

        return 0;
    }

    public HashMap<EntityType, EntityKillCount> getEntityKills() {
        return CMI.getInstance().getPlayerCombatManager().getEntityKills(getUniqueId());
    }

    public void addEntityKill(EntityType type) {
    }

    @Deprecated
    public double getEntityHeadDropChance(EntityType type) {
        return getEntityHeadDropChance(type, true);
    }

    public double getEntityHeadDropChance(EntityType type, Boolean addEnchantBonus) {

        return 0;
    }

    public ChatColor getNamePlateNameColor() {
        return namePlateNameColor;
    }

    public void setNamePlateNameColor(ChatColor namePlateNameColor) {
        this.namePlateNameColor = namePlateNameColor;
    }

    @Deprecated
    public String getTagName() {
        return this.getName(false);
    }

    @Deprecated
    public void setTagName(String tagName) {
    }

    public long getAfkImunityUntil() {
        return afkImunity;
    }

    public void addFlyToCache(String worldName, boolean state, boolean temp) {
        tempFlyModes.put(worldName, new worldFlyState(this.getPlayer().getGameMode(), state, temp));
    }

    public worldFlyState getFlyCachedMode(String worldName) {
        return tempFlyModes.get(worldName);
    }

    public worldFlyState removeFlyCachedMode(String worldName) {
        return tempFlyModes.remove(worldName);
    }

    public void clearCachedFlyModes() {
        tempFlyModes.clear();
    }

    public CMIChatRoom getChatRoom() {
        return CMI.getInstance().getChatFormatManager().getChatRoom(this.getUniqueId());
    }

    public boolean leaveChatRoom() {
        return CMI.getInstance().getChatFormatManager().leaveChatRoom(this.getUniqueId());
    }

    public void joinChatRoom(String name) {
        CMI.getInstance().getChatFormatManager().joinChatRoom(this, name);
    }

    public void setChatRoom(CMIChatRoom cmiChatRoom) {
        CMI.getInstance().getChatFormatManager().setChatRoom(this, cmiChatRoom);
    }

    public void dropItemNearPlayer(ItemStack one) {
        Location loc = this.getPlayer().getLocation();
        Vector direction = loc.getDirection().clone();
        direction.multiply(0.4);
        this.getPlayer().getWorld().dropItem(loc.clone().add(0, 1, 0).add(direction), one);
    }

    public void addItemDonationFrom(CMIItemDonations donation) {
        CMIItemDonations.addItemDonation(donation);
    }

    public HashMap<UUID, CMIItemDonations> getPendingDonations() {
        return CMIItemDonations.getPendingDonations(getUniqueId());
    }

    public long getTeleportInvulnerability() {
        return teleportInvulnerability;
    }

    public void setTeleportInvulnerability(long teleportInvulnerability) {
        this.teleportInvulnerability = teleportInvulnerability;
    }

    public int getHungerSched() {
        return hungerSched;
    }

    public void setHungerSched(int hungerSched) {
        this.hungerSched = hungerSched;
    }

    @Deprecated
    public Boolean isToggledOffBBCompass() {
        return this.getOptionState(PlayerOption.totemBossBar);
    }

    @Deprecated
    public void setToggledOffBBCompass(Boolean toggleCompass) {
        this.setOptionState(PlayerOption.totemBossBar, toggleCompass);
    }

    public TreeMap<Long, damageInformation> getLastDamage() {
        return damageInformation.getLastDamage(getUniqueId());
    }

    public damageInformation getLastDamage(damageInformation comparison) {
        return damageInformation.getLastDamage(getUniqueId(), comparison);
    }

    public void addLastDamage(damageInformation lastDamage) {
        damageInformation.addLastDamage(getUniqueId(), lastDamage);
    }

    public void resetLastDamage() {
        damageInformation.cacheClear(getUniqueId());
    }

    public static CMIUser getUser(String playerName) {
        return CMI.getInstance().getPlayerManager().getUser(playerName);
    }

    public static CMIUser getUser(OfflinePlayer player) {
        return CMI.getInstance().getPlayerManager().getUser(player);
    }

    public static CMIUser getUser(Player player) {
        return CMI.getInstance().getPlayerManager().getUser(player);
    }

    public static CMIUser getUser(UUID uuid) {
        return CMI.getInstance().getPlayerManager().getUser(uuid);
    }

    public Boolean getOptionState(PlayerOption option) {
        if (options == null)
            return option.isEnabled();
        Boolean res = options.get(option);
        return res == null ? option.isEnabled() : res;
    }

    public HashMap<PlayerOption, Boolean> getOptions() {
        if (options == null)
            options = new HashMap<PlayerOption, Boolean>();
        return options;
    }

    public void setOptionState(PlayerOption option, boolean state) {
    }

    public void setOptions(HashMap<PlayerOption, Boolean> options) {
        if (options == null || options.isEmpty()) {
            this.options = new HashMap<PlayerOption, Boolean>();
            return;
        }
        for (Entry<PlayerOption, Boolean> one : options.entrySet()) {
            setOptionState(one.getKey(), one.getValue());
        }
    }

    @Deprecated
    public CMIChatColor getChatColor2() {
        CMIPlayerMessageColor format = CMI.getInstance().getChatManager().getColorFromCache(this.getUniqueId());
        return format == null ? null : format.getColor();
    }

    @Deprecated
    public void setChatColor(CMIChatColor chatColor) {
        if (chatColor == null)
            CMI.getInstance().getChatManager().removeFromCache(this.getUniqueId());
        else
            CMI.getInstance().getChatManager().addToCache(this.getUniqueId(), new CMIPlayerMessageColor(chatColor));
    }

    public void setChatMessageFormat(CMIPlayerMessageColor chatMessageFormat) {
        if (chatMessageFormat == null || chatMessageFormat.getColor() == null)
            CMI.getInstance().getChatManager().removeFromCache(this.getUniqueId());
        else
            CMI.getInstance().getChatManager().addToCache(this.getUniqueId(), chatMessageFormat);
    }

    public CMIPlayerMessageColor getChatMessageFormat() {
        return CMI.getInstance().getChatManager().getColorFromCache(this.getUniqueId());
    }

    public String getChatMessageFormatString() {
        CMIPlayerMessageColor cached = CMI.getInstance().getChatManager().getColorFromCache(this.getUniqueId());
        if (cached == null)
            return "";
        return cached.toString();
    }

    public UUID getJailedBy() {
        return getJailData().getJailedBy();
    }

    public void setJailedBy(UUID jailedBy) {
        getJailData().setJailedBy(jailedBy);
    }

    public static Player getOnlinePlayer(CommandSender sender, String playerName) {
        return getOnlinePlayer(sender, playerName, false);
    }

    public static Player getOnlinePlayer(CommandSender sender, String playerName, boolean partialName) {
        Player player = getOnlinePlayer(playerName, partialName);

        if (!(sender instanceof Player) || player == null)
            return player;

        return ((Player) sender).canSee(player) ? player : null;
    }

    public static Player getOnlinePlayer(String playerName) {
        return getOnlinePlayer(playerName, false);
    }

    public static Player getOnlinePlayer(String playerName, boolean partialName) {
        return null;
    }

    public static Player getOnlinePlayer(UUID uuid) {
        return Bukkit.getPlayer(uuid);
    }

    public static Player getPlayer(String playerName) {

        return null;
    }

    public String getBungeeBackLocation() {
        return bungeeBackLocation;
    }

    public void setBungeeBackLocation(String bungeeBackLocation) {
        this.bungeeBackLocation = bungeeBackLocation;
    }

}
