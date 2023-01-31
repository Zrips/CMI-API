package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

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
import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.Modules.ChatFormat.CMIChatRoom;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.DeathMessages.damageInformation;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightCharge;
import com.Zrips.CMI.Modules.GeoIP.IPLocation;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Mirror.Mirrors;
import com.Zrips.CMI.Modules.Notify.Notification;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayTime;
import com.Zrips.CMI.Modules.PlayTimeRewards.PTROneTime;
import com.Zrips.CMI.Modules.PlayerCombat.CMIPlayerCombat;
import com.Zrips.CMI.Modules.PlayerCombat.EntityKillCount;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerKillCount;
import com.Zrips.CMI.Modules.PlayerMeta.PlayerMeta;
import com.Zrips.CMI.Modules.PlayerOptions.PlayerOption;
import com.Zrips.CMI.Modules.Ranks.CMIRank;
import com.Zrips.CMI.Modules.SavedInv.SavedInventories;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;
import com.Zrips.CMI.Modules.Statistics.CMIStats;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import com.Zrips.CMI.Modules.Warnings.CMIWarningCategory;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Version.Version;

public class CMIUser {

    private Player player;
//    private OfflinePlayer offplayer;
    private String namePlatePrefix;
    private String namePlateSuffix;
    private ChatColor namePlateNameColor;
    private Boolean collision;
    private String name;
    private String nickName;
    private String displayName;
    private String tagName;
    private UUID uuid;
    private CMIEconomyAcount economy;
    private Integer id;
    private Integer invId;
    private Integer playTimeId;
    private Integer playTimerewardId;
    private LinkedHashMap<String, Integer> ips;
    private Location logOutLocation;
    private List<String> lockedIps;
    private Long lastLogin;
    private Long lastLogoff;
    private Long totalPlayTime;
    private CMILocation DeathLoc;
    private Location TpLoc;
    private Long pTime;
    private Boolean cuffed;
    private Long alertUntil;
    private String alertReason;
    private Boolean joinedCounter;
    private Boolean god;
    private HashMap<String, Long> counter;
    private Mirrors mirror;
    private LinkedHashMap<Kit, CMIKitUsage> kits;
    private PlayerCharge PCharge;
    private HashMap<String, Notification> notifications;
    private CmdCooldown CommandCooldown;
    private Long totemCooldown;
    private Long totemWarmup;
    private Long tfly;
    private Long tgod;
    private Long teleportInvulnerability;
    private CMIVanish vanish;

    private Long mutedUntil;
    private Long shadowMutedUntil;
    private String mutedReason;

    private ChatColor glow;

    private Boolean isFakeAccount;

    private String nameColor;
    private String prefix;
    private String suffix;
    private String group;

    private List<PlayerNote> notes;
    private List<PlayerMail> mail;

    private Long lastPatrol;

    private LinkedHashMap<String, CmiHome> homes;

    private CMIStats stats;

    private CMIRank rank;

    private AfkInfo afkInfo;
    private Long lastBlockLeave;

    private CMIBanEntry ban;

    private Set<UUID> ignores;

    private Boolean silenceMode;

    private FlightCharge flightCharge;

    private PlayerMeta PlayerMeta;

    private Boolean hadAllowFlight;
    private Boolean AllowFlight;
    private Boolean Flying;

    private Integer votifierVotes;
    private List<Long> votifierVotesByTime;

//    private Long jailedUntil = null;
    private Long jailedForTime;
    private String jailedReason;
    private CMIJailCell cell;

    private CMIPlayTime playTime;
    private Long PlayTimeOptimized;

    private String skin;

    private HashMap<String, Long> repeatableRewards;
    private Set<String> oneTimeRewards;

    private List<CMIPlayerWarning> warnings;

    private Object fakeEntity;

//    private HashMap<UUID, List<CMIItemDonations>> donationsTo;
    private HashMap<UUID, CMIItemDonations> donationsFrom;

    private HashMap<UUID, PlayerKillCount> kills;
    private HashMap<EntityType, EntityKillCount> entityKills;

    HashMap<updateType, Long> lastInfoUpdate;

    private Long afkImunity = null;

    private Long lastRespawn;

//    ConcurrentHashMap<String, BossBarInfo> barMap;

    HashMap<String, worldFlyState> tempFlyModes = new HashMap<String, worldFlyState>();

    private TreeMap<Long, damageInformation> lastDamage;

    private CMIChatRoom chatRoom;

    private int hungerSched = 0;

    private CMIPlayerCombat combat = null;

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
        return Bukkit.getPlayer(this.uuid) != null;
    }

    public Location getLogOutLocation() {
        return logOutLocation;
    }

    public Location getLocation() {
        return this.getPlayer(true).getLocation();
    }

    public void setLogOutLocation(Location logOutLocation) {
    }

    public void saveIfOffline() {
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
        String ip = null;
        return ip;
    }

    public String getCountry() {
        IPLocation location = CMI.getInstance().getLookupService().getLocation(this.getLastIp());
        return location == null ? "N/A" : location.getCountryName();
    }

    public String getCountryCode() {
        IPLocation location = CMI.getInstance().getLookupService().getLocation(this.getLastIp());
        return location == null ? "N/A" : location.getCountryCode();
    }

    public String getCity() {
        IPLocation location = CMI.getInstance().getLookupService().getLocation(this.getLastIp());
        return location == null ? "N/A" : location.getCity();
    }

    public boolean addAllIps(Map<String, Integer> map) {
        boolean added = false;
        return added;
    }

    private Integer schedId;
    private Boolean extend;

    private void ScheduleDataClear() {

    }

    public Player getPlayer() {
        return getPlayer(!this.isFakeAccount());
    }

    public Player getPlayer(boolean loadOfflineObject) {

        return player;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastLogin() {
        return getLastLogin(false);
    }

    public long getLastLogin(boolean forceUpdate) {
        if (forceUpdate && (lastLogin == null || lastLogin == 0L) && getOfflinePlayer() != null)
            lastLogin = getOfflinePlayer().getLastPlayed();
        return lastLogin == null ? 0L : lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public long getLastLogoff() {
        return getLastLogoff(false);
    }

    public long getLastLogoff(boolean forceUpdate) {
        if (forceUpdate && (lastLogoff == null || lastLogoff == 0L) && getOfflinePlayer() != null) {
            lastLogoff = getOfflinePlayer().getLastPlayed();
            this.addForDelayedSave();
        }
        return lastLogoff == null ? 0L : lastLogoff;
    }

    public Long getLastLogoffClean() {
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
        player = Bukkit.getPlayer(this.uuid);
        if (player != null)
            name = player.getName();
        updatePermissions();
    }

    public void setUuidNoPermUpdate(UUID uuid) {
        this.uuid = uuid;
        player = Bukkit.getPlayer(this.uuid);
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
        return CMIChatColor.translate(nickName);
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
        return nickName;
    }

    private enum updateType {
        prefix, suffix, group, nameColor, displayname;
    }

    private boolean timeToUpdate(updateType type) {
        return false;
    }

    public String getGroupName() {
        if (this.isOnline() && timeToUpdate(updateType.group))
            updateGroup();
        return group == null ? "" : group;
    }

    public String getNameColor() {
        return this.nameColor;
    }

    public String getPrefix() {
        return null;
    }

    public String getSuffix() {
        return suffix == null ? "" : suffix;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName, boolean save) {
    }

    public Long getpTime() {
        return pTime == null ? -1L : pTime;
    }

    public void setpTime(Long i) {
        setpTime(i, true);
    }

    public void setpTime(Long pTime, boolean save) {
        this.pTime = pTime;
        if (save)
            addForDelayedSave();
    }

    public boolean isCuffed() {
        return cuffed == null ? false : cuffed;
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
        boolean s = getLockedIps().remove(Ip);
        addForDelayedSave();
        return s;
    }

    public boolean isJoinedCounter() {
        return joinedCounter == null ? false : joinedCounter;
    }

    public void setJoinedCounter(boolean joinedCounter) {
        this.joinedCounter = joinedCounter;
    }

    public HashMap<String, Long> getCounter() {
        if (counter == null)
            counter = new HashMap<String, Long>();
        return counter;
    }

    public Long getCounter(String cmd) {
        return getCounter().get(cmd);
    }

    public void addCounter(String cmd, Long time) {
        getCounter().put(cmd, time);
    }

    public Long getAlertUntil() {
        return alertUntil;
    }

    public void setAlertUntil(Long alertUntil) {
        setAlertUntil(alertUntil, true);
    }

    public void removeAlert() {
    }

    public void setAlertUntil(Long alertUntil, boolean save) {
        if (alertUntil != null && alertUntil < System.currentTimeMillis()) {
            return;
        }
        this.alertUntil = alertUntil;

        CMI.getInstance().getPlayerManager().addAlert(this.getUniqueId());

        if (save)
            addForDelayedSave();
    }

    public String getAlertReason() {
        return alertReason;
    }

    public void setAlertReason(String alertReason) {
        setAlertReason(alertReason, true);
    }

    public void setAlertReason(String alertReason, boolean save) {
        this.alertReason = alertReason;
        if (save)
            addForDelayedSave();
    }

    public Boolean isGod() {
        if (Version.isCurrentEqualOrHigher(Version.v1_9_R1)) {
            Player p = getPlayer(false);
            if (p == null)
                return false;
            god = p.isInvulnerable();

            return god;
        }

        god = CMI.getInstance().getNMS().getGodMode(getPlayer(false));
        return god == null ? false : god;
    }

    public void setGod(Boolean god) {
        this.god = god;
        addForDelayedSave();
    }

    public Mirrors getMirror() {
        if (mirror == null)
            mirror = new Mirrors();
        return mirror;
    }

    public void setMirror(Mirrors mirror) {
        this.mirror = mirror;
    }

    public LinkedHashMap<Kit, CMIKitUsage> getKits() {
        if (kits == null)
            kits = new LinkedHashMap<Kit, CMIKitUsage>();
        return kits;
    }

    public HashMap<String, Long> getKitsAsMap() {
        HashMap<String, Long> map = new HashMap<String, Long>();
        for (Entry<Kit, CMIKitUsage> one : getKits().entrySet()) {
            map.put(one.getKey().getConfigName() + PlayerManager.multiSeparator + one.getValue().getUsedTimes(), one.getValue().getLastUsage());
        }
        return map;
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
        return 0L;
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
        if (PCharge == null)
            PCharge = new PlayerCharge(this, update);
        return PCharge;
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
        return totalPlayTime == null ? 0L : totalPlayTime;
    }

    public long getTotalPlayTimeClean() {
        return totalPlayTime == null ? 0L : totalPlayTime;
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

    public Long getTotemCooldown() {
        return totemCooldown == null ? 0L : totemCooldown;
    }

    public void setTotemCooldown(Long totemCooldown) {
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

    public Long getTotemWarmup() {
        return totemWarmup == null ? 0L : totemWarmup;
    }

    public void setTotemWarmup(Long totemWarmup) {
        this.totemWarmup = totemWarmup;
    }

    public Long getTfly() {

        return tfly == null || tfly + 2000L < System.currentTimeMillis() ? null : tfly;
    }

    public void setTfly(Long tfly) {
        setTfly(tfly, true);
    }

    public void setTfly(Long tfly, boolean save) {
        this.tfly = tfly != null && (tfly == 0 || tfly < 0) ? null : tfly;

        if (save)
            addForDelayedSave();
    }

    public Long getTgod() {
        return tgod == null || tgod + 2000L < System.currentTimeMillis() ? null : tgod;
    }

    public void setTgod(Long tgod) {
        setTgod(tgod, true);
    }

    public void setTgod(Long tgod, boolean save) {
        this.tgod = tgod != null && (tgod == 0 || tgod < 0) ? null : tgod;
        if (save)
            addForDelayedSave();
    }

    public LinkedHashMap<String, CmiHome> getHomes() {
        if (homes == null)
            homes = new LinkedHashMap<String, CmiHome>();
        return homes;
    }

    public Set<CmiHome> getHomesFromWorld(String worldName) {
        Set<CmiHome> temp = new HashSet<CmiHome>();
        for (Entry<String, CmiHome> one : getHomes().entrySet()) {

            if (!one.getValue().getLoc().getWorldName().equalsIgnoreCase(worldName))
                continue;
            temp.add(one.getValue());
        }
        return temp;
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
        Set<CmiHome> set = new HashSet<CmiHome>();
        return set;
    }

    public LinkedHashMap<String, CMILocation> getHomesAsMap() {
        LinkedHashMap<String, CMILocation> hm = new LinkedHashMap<String, CMILocation>();
        return hm;
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
        return id == null ? 0 : id;
    }

    public void setId(int id) {
        this.id = id;
        CMI.getInstance().getPlayerManager().addUser(this, id);
    }

    public int getInvId() {
        return invId == null ? 0 : invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public int getPlayTimeId() {
        return playTimeId == null ? 0 : playTimeId;
    }

    public void setPlayTimeId(int playTimeId) {
        this.playTimeId = playTimeId;
    }

    public List<PlayerNote> getNotes() {
        return getNotes(true);
    }

    public List<PlayerNote> getNotes(boolean filterOldOut) {
        return notes;
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

        return mail;
    }

    public void setMail(List<PlayerMail> mail) {
        this.mail = mail;
    }

    public void addMail(PlayerMail mail, boolean save) {
        getMails().add(mail);
        if (save)
            addForDelayedSave();
    }

    public Long getLastPatrol() {
        return lastPatrol;
    }

    public void setPatroled() {
        this.lastPatrol = System.currentTimeMillis();
    }

    public Long getStatistic(CMIStatistic stat) {
        return getStatistic(stat, null);
    }

    public Long getStatistic(CMIStatistic stat, Object thing) {
        if (stats == null)
            stats = new CMIStats(this);
        return stats.getStat(stat, thing);
    }

    public CMIRank getNullRank() {
        return rank;
    }

    public CMIRank getRank() {
        if (rank == null) {
            rank = CMI.getInstance().getRankManager().getDefaultRank(this.getPlayer(false));
        }
        return rank;
    }

    public CMIRank recalculateRank() {

        return rank;
    }

    public void setRank(CMIRank rank) {
        this.rank = rank;
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
        return getAfkInfo().getAfkFrom() != null;
    }

    public AfkInfo getAfkInfo() {
        if (afkInfo == null)
            afkInfo = new AfkInfo();
        return afkInfo;
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
        getAfkInfo().setReason(reason);
    }

    public String getAfkReason() {
        return getAfkInfo().getReason();
    }

    public boolean isBanned() {
        if (getBanEntry() != null) {
            if (getBanEntry().getExpiration() == null)
                return false;
            if (getBanEntry().getExpiration() > System.currentTimeMillis())
                return true;
            if (getBanEntry().getExpiration() == -1l)
                return true;
        }
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
            return setBanned(reason, CMI.getInstance().getPlayerManager().getUser((Player) by), until, new Date(System.currentTimeMillis()));
        return setBanned(reason, null, until, new Date(System.currentTimeMillis()));
    }

    public CMIUser setBanned(String reason, CMIUser by, Date until, Date when) {

        return this;
    }

    public CMIUser unBan() {

        return this;
    }

    public CMIBanEntry getBanEntryRaw() {
        return this.ban;
    }

    public CMIBanEntry getBanEntry() {
        return getBanEntry(true);
    }

    public void updateBanEntry(BanEntry entry) {

    }

    public CMIBanEntry getBanEntry(boolean update) {

        return this.ban;
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
        return silenceMode == null ? false : silenceMode;
    }

    public void setSilenceMode(boolean silenceMode) {
        this.silenceMode = silenceMode;
    }

    public CMIVanish getVanish() {
        if (vanish == null)
            vanish = new CMIVanish(this);
        return vanish;
    }

    public boolean isVanished() {

        return false;
    }

    public boolean isCMIVanished() {
        return false;
    }

    public void setVanished(boolean vanished) {

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
        return mutedUntil == null || mutedUntil < System.currentTimeMillis() ? false : true;
    }

    public void setMutedUntil(Long mutedUntil) {
        this.mutedUntil = mutedUntil;
    }

    public Long getShadowMutedUntil() {
        return shadowMutedUntil;
    }

    public void setShadowMutedUntil(Long shadowMutedUntil) {
        this.shadowMutedUntil = shadowMutedUntil;
    }

    public boolean isShadowMuted() {
        return shadowMutedUntil == null || shadowMutedUntil < System.currentTimeMillis() ? false : true;
    }

    /**
    * Sets the value for a variable
    * @param source only used to indicate from who money is deposited but doesn't deduct from it
    */
    public Double deposit(Double balance, CMIUser source) {
        return deposit(null, balance, source);
    }

    public Double deposit(Double balance) {
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
        return withdraw(null, balance, target);
    }

    public Double withdraw(Double balance) {
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
        return hasMoney(balance);
    }

    public boolean hasMoney(Double balance) {
        if (balance == 0D)
            return true;
        return has(null, balance);
    }

    public boolean has(String worldName, Double balance) {
        return getEconomyAccount().has(worldName, balance);
    }

    public Double getBalance() {
        return getBalance(null);
    }

    public Double getBalance(String worldName) {
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

    public void setExp(int exp) {
        if (this.getPlayer() == null)
            return;
        exp = exp < 0 ? 0 : exp;
        if (player == null)
            return;
        player.setLevel(0);
        player.setExp(0);
        player.setTotalExperience(0);
        player.giveExp(exp);
    }

    public void addExp(int exp) {
        if (this.getPlayer() == null)
            return;
        int old = getExp();
        setExp(old + exp);
    }

    public void takeExp(int exp) {
        if (this.getPlayer() == null)
            return;
        int old = getExp();
        setExp(old - exp);
    }

    public int getMissingExp() {
        return 0;
    }

    public int getLevel() {
        if (this.getPlayer() == null)
            return 0;
        return this.getPlayer().getLevel();
    }

    public int getExpForCurrentLevel() {
        return 0;
    }

    public int getExp() {
        return 0;
    }

    public int getExpToLevel(int level) {
        return 0;
    }

    public FlightCharge getFlightCharge() {
        if (flightCharge == null)
            flightCharge = new FlightCharge();
        return flightCharge;
    }

    public boolean hasPermission(CMIPerm perm) {
        return perm.hasPermission(this.getPlayer(false));
    }

    public boolean hasSetPermission(CMIPerm perm) {
        return perm.hasSetPermission(this.getPlayer(false));
    }

    public boolean hasMeta() {
        return getMeta().containsValues();
    }

    public PlayerMeta getMeta() {
        if (PlayerMeta == null)
            PlayerMeta = new PlayerMeta();
        return PlayerMeta;
    }

    public String getMeta(String Key) {
        return getMeta().getValue(Key);
    }

    public boolean isAllowFlight() {
        if (this.isOnline())
            return this.getPlayer().getAllowFlight();
        return AllowFlight == null ? false : AllowFlight;
    }

    public void setAllowFlight(boolean allowFlight) {
    }

    public void setGameMode(GameMode mode) {
        CMI.getInstance().getReflectionManager().setGameMode(this.getPlayer(), mode);
    }

    public boolean wasFlying() {
        return Flying == null ? false : Flying;
    }

    public boolean hadAllowFlight() {
        return hadAllowFlight == null ? false : hadAllowFlight;
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
        return Flying == null ? false : Flying;
    }

    public void setFlying(boolean flying) {
    }

    public SavedInventories getSavedInventories() {
        return CMI.getInstance().getSavedInventoryManager().getInventories(this);
    }

    public int getVotifierVotes() {
        return votifierVotes == null ? 0 : votifierVotes;
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

    public boolean isJailed() {
        return true;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId) {
        return jail(jailTimeSec, jail, cellId, null);
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason) {
        this.jailedReason = reason;
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

    public Long getJailedForTime() {
        Long t = this.jailedForTime;
        if (t != null && CMI.getInstance().getJailManager().isCountWhileOffline() && !this.isOnline() && this.getLastLogoff() > 0) {
            t -= System.currentTimeMillis() - this.getLastLogoff();
        }
        if (t != null && t <= 0) {
            this.jailedForTime = null;
        }
        return t == null || t <= 0 ? 0 : t;
    }

    public void setJailedForTime(Long jailedForTime) {
        setJailedForTime(jailedForTime, false);
    }

    public void setJailedForTime(Long jailedForTime, boolean save) {
    }

    public CMIJailCell getCell() {
        return cell;
    }

    public void setCell(CMIJailCell cell) {
    }

    public Boolean isFakeAccount() {
        return isFakeAccount == null ? false : isFakeAccount;
    }

    public void setFakeAccount(Boolean isFakeAccount) {
        this.isFakeAccount = isFakeAccount == null ? false : isFakeAccount;
    }

    public CMIPlayTime getCMIPlayTime() {
        if (playTime == null) {
            playTime = new CMIPlayTime(this);
        }
        return playTime;
    }

    public void setCMIPlayTime(CMIPlayTime playTime) {
        this.playTime = playTime;
    }

    public void updatePlayTime() {
        getCMIPlayTime().updatePlayTime();
    }

    public Long getPlayTimeOptimizedOn() {
        return PlayTimeOptimized == null ? 0L : PlayTimeOptimized;
    }

    public void setPlayTimeOptimizedOn(Long playTimeOptimized) {
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
        if (!this.isJailed())
            jailedReason = null;
        return jailedReason;
    }

    public void setJailedReason(String jailedReason) {
        this.jailedReason = jailedReason;
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
        return playTimerewardId == null ? 0 : playTimerewardId;
    }

    public void setPlayTimeRewardId(int playTimeRewardId) {
        this.playTimerewardId = playTimeRewardId;
    }

    public String getPTRRString() {
        String full = "";
        return full;
    }

    public String getPTROString() {
        String full = "";
        return full;
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
        if (this.player == null || this.isOnline())
            return;
        CMI.getInstance().getNMS().unloadData(player);
        this.player = null;
        cacheClear();
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
        if (collision)
            collision = null;
    }

    public Boolean isCollidable() {
        return collision == null ? true : collision;
    }

    @Deprecated
    public Boolean getCollision() {
        return isCollidable();
    }

    private void applyCollision() {

    }

    public void reaplyNamePlate() {

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
        if (warnings == null)
            warnings = new ArrayList<CMIPlayerWarning>();
        for (CMIPlayerWarning one : new ArrayList<CMIPlayerWarning>(warnings)) {
            if (one.getGivenAt() + one.getCategory().getLifeTime() < System.currentTimeMillis())
                warnings.remove(one);
        }
        return warnings;
    }

    public void setWarnings(List<CMIPlayerWarning> warnings) {
        this.warnings = warnings;
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
        CMIPlayerWarning warning = new CMIPlayerWarning();
        warning.setGivenAt(System.currentTimeMillis());
        warning.setGivenBy(source);
        warning.setCategory(category == null ? CMI.getInstance().getWarningManager().getDefaultCategory() : category);
        warning.setReason(reason.isEmpty() ? null : reason);
        return addWarning(warning);
    }

    public CMIPlayerWarning addWarning(CMIPlayerWarning warning) {
        getWarnings().add(warning);
        return warning;
    }

    public HashMap<String, Long> getWarningsAsMap() {
        HashMap<String, Long> map = new HashMap<String, Long>();
        return map;
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
        return combat == null ? null : combat.getGotLastDamageAt();
    }

    private CMIPlayerCombat getCombatRecord() {
        if (combat == null)
            combat = new CMIPlayerCombat();
        return combat;
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
        getCombatRecord().setGotLastDamageAt(gotLastDamageAt);
    }

    public boolean isInCombatWithPlayer() {
        if (combat == null)
            return false;
        return combat.isInCombatWithPlayer();
    }

    public Long getGotLastDamageFromPlayer() {
        return combat == null ? 0L : combat.getGotLastDamageFromPlayer();
    }

    public void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer) {
        if (!isInCombatWithPlayer())
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoCombat(this);
        getCombatRecord().setGotLastDamageFromPlayer(gotLastDamageFromPlayer);
    }

    public void setDidLastDamageToPlayer(Long didLastDamageToPlayer) {
        if (!isInCombatWithPlayer())
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoCombat(this);
        getCombatRecord().setDidLastDamageToPlayer(didLastDamageToPlayer);
    }

    public boolean isInCombatWithMob() {
        if (combat == null)
            return false;
        return combat.isInCombatWithMob();
    }

    public Long getGotLastDamageFromMob() {
        return combat == null ? 0L : combat.getGotLastDamageFromMob();
    }

    public void setGotLastDamageFromMob(Long gotLastDamageFromMob) {
        if (!isInCombatWithMob())
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoMobCombat(this);
        getCombatRecord().setGotLastDamageFromMob(gotLastDamageFromMob);
    }

    public void setDidLastDamageToEntity(Long didLastDamageToMob) {
        if (!isInCombatWithMob()) {
            CMI.getInstance().getPlayerCombatManager().addPlayerIntoMobCombat(this);
        }
        getCombatRecord().setDidLastDamageToMob(didLastDamageToMob);
    }

    public long getLeftCombatTime() {
        if (combat == null)
            return 0L;
        return getCombatRecord().getLeftCombatTime();
    }

    public void sendMessage(String msg) {
        if (this.isOnline())
            CMI.getInstance().sendMessage(this, msg);
    }

    public void sendMessage(String command, String shortPath, Object... variables) {
        if (this.isOnline()) {
            CMI.getInstance().info(command, this, shortPath, variables);
        }
    }

    public boolean teleport(Entity ent) {
        return teleport(ent.getLocation(), TeleportType.Unknown);
    }

    public boolean teleport(Location loc) {
        return teleport(loc, TeleportType.Unknown);
    }

    public boolean teleport(Location loc, TeleportType type) {
        type = type == null ? TeleportType.Unknown : type;
        return CMI.getInstance().getTeleportations().teleport(this.getPlayer(), loc, type);
    }

    public CompletableFuture<Boolean> teleportAsync(Location loc, TeleportType type) {
        return CompletableFuture.supplyAsync(() -> CMI.getInstance().getTeleportations().getSafeLocationAsync(getPlayer(), loc, false, true, null)).thenApply(greeting -> {
            try {
                return CMI.getInstance().getTeleportations().teleportAsync(null, getPlayer(), true, greeting, type, true);
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return false;
        });
    }

    public Object getFakeEntity() {
        return fakeEntity;
    }

    public void setFakeEntity(Object fakeEntity) {
        this.fakeEntity = fakeEntity;
    }

    public HashMap<UUID, PlayerKillCount> getKills() {
        if (kills == null)
            kills = new HashMap<UUID, PlayerKillCount>();
        return kills;
    }

    public void addHeadDropCount(UUID uuid) {
        PlayerKillCount killCount = getKills().get(uuid);
        if (killCount == null) {
            killCount = new PlayerKillCount(uuid);
            getKills().put(uuid, killCount);
        }
        killCount.addHeadDropCount();
    }

    public void addKill(UUID uuid) {
        PlayerKillCount kill = getKills().get(uuid);
        if (kill == null) {
            kill = new PlayerKillCount(uuid);
            getKills().put(uuid, kill);
        }
        kill.addKill();
    }

    @Deprecated
    public double getHeadDropChance(UUID uuid) {
        return getHeadDropChance(uuid, true);
    }

    public double getHeadDropChance(UUID uuid, boolean addEnchantBonus) {

        return 0;
    }

    public HashMap<EntityType, EntityKillCount> getEntityKills() {
        if (entityKills == null)
            entityKills = new HashMap<EntityType, EntityKillCount>();
        return entityKills;
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

    public String getTagName() {
        return tagName == null ? this.getName(false) : tagName;
    }

    public void setTagName(String tagName) {
        if (tagName.length() > 16)
            tagName = tagName.substring(0, 15);
        this.tagName = tagName;
    }

    public Long getAfkImunityUntil() {
        return afkImunity;
    }

    public void addFlyToCache(String worldName, boolean state, boolean temp) {
        tempFlyModes.put(worldName, new worldFlyState(state, temp));
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

    public Long getLastBlockLeave() {
        return lastBlockLeave;
    }

    public void setLastBlockLeave(Long lastBlockLeave) {
        this.lastBlockLeave = lastBlockLeave;
    }

    public CMIChatRoom getChatRoom() {
        return chatRoom;
    }

    public boolean leaveChatRoom() {
        if (this.chatRoom == null)
            return false;
        return this.chatRoom.removeUser(this);
    }

    public void joinChatRoom(String name) {
        CMI.getInstance().getChatFormatManager().joinChatRoom(this, name);
    }

    public void setChatRoom(CMIChatRoom cmiChatRoom) {
        this.chatRoom = cmiChatRoom;
        if (chatRoom != null && !chatRoom.getUsers().contains(this))
            chatRoom.getUsers().add(this);
    }

    public void dropItemNearPlayer(ItemStack one) {
        Location loc = this.getPlayer().getLocation();
        Vector direction = loc.getDirection().clone();
        direction.multiply(0.4);
        this.getPlayer().getWorld().dropItem(loc.clone().add(0, 1, 0).add(direction), one);
    }

    public void addItemDonationFrom(CMIItemDonations donation) {
        if (donationsFrom == null)
            donationsFrom = new HashMap<UUID, CMIItemDonations>();
        donationsFrom.put(donation.getDonor(), donation);
    }

    public HashMap<UUID, CMIItemDonations> getPendingDonations() {
        if (donationsFrom == null)
            donationsFrom = new HashMap<UUID, CMIItemDonations>();
        return donationsFrom;
    }

    public Long getTeleportInvulnerability() {
        return teleportInvulnerability;
    }

    public void setTeleportInvulnerability(Long teleportInvulnerability) {
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
        if (lastDamage == null)
            lastDamage = new TreeMap<Long, damageInformation>(Collections.reverseOrder());
        return lastDamage;
    }

    public damageInformation getLastDamage(damageInformation comparison) {
        return null;
    }

    public void addLastDamage(damageInformation lastDamage) {

        Iterator<Entry<Long, damageInformation>> iter = getLastDamage().entrySet().iterator();
        while (iter.hasNext()) {
            Entry<Long, damageInformation> entry = iter.next();

            if (entry.getKey() + CMI.getInstance().getPlayerCombatManager().getCombatTimer() * 1000L < System.currentTimeMillis()) {
                iter.remove();
            }
        }
        getLastDamage().put(lastDamage.getTime(), lastDamage);
    }

    public void resetLastDamage() {
        lastDamage = null;
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
    }
}
