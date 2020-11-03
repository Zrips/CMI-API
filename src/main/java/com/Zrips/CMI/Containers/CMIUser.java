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
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.BanEntry;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.Team;
import org.bukkit.scoreboard.Team.Option;
import org.bukkit.scoreboard.Team.OptionStatus;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Config;
import com.Zrips.CMI.PlayerManager;
import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.ChatFormat.CMIChatRoom;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.FlightCharge.FlightCharge;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Mirror.Mirrors;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;
import com.Zrips.CMI.Modules.Notify.Notification;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayTime;
import com.Zrips.CMI.Modules.PlayTimeRewards.PTROneTime;
import com.Zrips.CMI.Modules.PlayTimeRewards.PTRRepeat;
import com.Zrips.CMI.Modules.PlayerCombat.EntityKillCount;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerKillCount;
import com.Zrips.CMI.Modules.PlayerMeta.PlayerMeta;
import com.Zrips.CMI.Modules.Ranks.CMIRank;
import com.Zrips.CMI.Modules.SavedInv.SavedInventories;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;
import com.Zrips.CMI.Modules.Statistics.CMIStats;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import com.Zrips.CMI.Modules.Warnings.CMIWarningCategory;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;
import com.Zrips.CMI.utils.VersionChecker.Version;

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
    private Boolean showTotemBar;
    private Long tfly;
    private Long tgod;
    private Long teleportInvulnerability;
    private Boolean tagSoundEnabled;
    private Boolean shiftEditEnabled;
    private Boolean spy;
    private Boolean acceptingPM;
    private Boolean commandSpy;
    private Boolean signSpy;
    private Boolean toggleCompass;
    private CMIVanish vanish;

    private Long mutedUntil;
    private Long shadowMutedUntil;
    private String mutedReason;

    private Boolean teleportToggled;
    private Boolean noPayToggle;

    private ChatColor glow;
//    private ChatColor tempGlow;

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

    private HashMap<PTRRepeat, Long> repeatableRewards;
    private Set<PTROneTime> oneTimeRewards;

    private List<CMIPlayerWarning> warnings;

    private Long gotLastDamageAt;
    private Long gotLastDamageFromPlayer;
    private Long didLastDamageToPlayer;

    private Object fakeEntity;

//    private HashMap<UUID, List<CMIItemDonations>> donationsTo;
    private HashMap<UUID, CMIItemDonations> donationsFrom;

    private HashMap<UUID, PlayerKillCount> kills;
    private HashMap<EntityType, EntityKillCount> entityKills;

    HashMap<updateType, Long> lastInfoUpdate;

    private Long afkImunity = null;

    private Long lastRespawn;

    ConcurrentHashMap<String, BossBarInfo> barMap;

    HashMap<String, Boolean> tempFlyModes = new HashMap<String, Boolean>();

    private CMIChatRoom chatRoom;

    private int hungerSched = 0;

    public CMIUser(int id) {
	this.id = id;
	CMI.getInstance().getPlayerManager().addUser(this, id);
    }

    public void cacheClear() {
    }

    public CMIUser(UUID uuid) {
	this.uuid = uuid;
	player = Bukkit.getPlayer(this.uuid);
	if (player != null)
	    name = player.getName();
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
	return null;
    }

    public Location getLocation() {
	return null;
    }

    public void setLogOutLocation(Location logOutLocation) {
    }

    public void saveIfOffline() {
    }

    public void addForDelayedSave() {
    }

    public void setIps(LinkedHashMap<String, Integer> ips) {
    }

    public HashMap<String, Integer> getIps() {
	return null;
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

    private Integer schedId;
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
	return null;
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
	return TpLoc;
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
	TpLoc = tpLoc.clone();
	if (save)
	    addForDelayedSave();
    }

    @Deprecated
    public UUID getUuid() {
	return uuid;
    }

    public UUID getUniqueId() {
	return uuid;
    }

    public void setUuid(UUID uuid) {
    }

    public void setUuidNoPermUpdate(UUID uuid) {
    }

    Long time = null;

    public void updatePermissions() {
    }

    public void updateDisplayName() {
    }

    public void updateDisplayName(boolean force) {
    }

    public void updatePrefix() {
    }

    public void updateSuffix() {
    }

    public void updateGroup() {
    }

    public String getCleanDisplayName() {
	return null;
    }

    public void setDisplayName(String displayName) {
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
	return null;
    }

    public void setLockedIps(List<String> lockedIps) {
	this.lockedIps = lockedIps;
    }

    public void addLockedIps(String Ip) {
    }

    public boolean removeLockedIps(String Ip) {
	return false;
    }

    public boolean isJoinedCounter() {
	return joinedCounter == null ? false : joinedCounter;
    }

    public void setJoinedCounter(boolean joinedCounter) {
	this.joinedCounter = joinedCounter;
    }

    public HashMap<String, Long> getCounter() {
	return null;
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

    public void setAlertUntil(Long alertUntil, boolean save) {
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
	if (god == null && getPlayer(false) != null)
	    god = CMI.getInstance().getNMS().getGodMode(getPlayer(false));
	return god;
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
	return null;
    }

    public void setKits(LinkedHashMap<Kit, CMIKitUsage> kits) {
	this.kits = kits;
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
	return null;
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
	return null;
    }

    public PlayerCharge getPCharge() {
	return getPCharge(true);
    }

    public PlayerCharge getPCharge(boolean update) {
	return null;
    }

    public HashMap<String, Notification> getNotifications() {
	return null;
    }

    public void addNotification(Notification notification) {
    }

    public long getTotalPlayTime() {
	return getTotalPlayTime(true);
    }

    public long getTotalPlayTime(boolean update) {
	return totalPlayTime == null ? 0L : totalPlayTime;
    }

    public long getTotalPlayTimeClean() {
	return totalPlayTime == null ? 0L : totalPlayTime;
    }

    public void setTotalPlayTime(long totalPlayTime) {
	this.totalPlayTime = totalPlayTime;
    }

//    public void addTotalPlayTime() {
//	this.totalPlayTime = totalPlayTime + (System.currentTimeMillis() - getLastLogin());
//    }

    public CmdCooldown getCommandCooldowns() {
	if (CommandCooldown == null)
	    CommandCooldown = new CmdCooldown();
	return CommandCooldown;
    }

//    public void addCommandCooldown(String cmd, Long time) {
//	CommandCooldown.addCooldown(cmd, time);
//    }

    public void addCommandCooldownByEndTime(String cmd, Long time, Long endTime) {
	getCommandCooldowns().addCooldown(cmd, time, endTime - time);
    }

    public Long getTotemCooldown() {
	return totemCooldown == null ? 0L : totemCooldown;
    }

    public void setTotemCooldown(Long totemCooldown) {
	this.totemCooldown = totemCooldown;
    }

    public boolean isShowTotemBar() {
	return showTotemBar == null ? true : showTotemBar;
    }

    public void setShowTotemBar(boolean showTotemBar) {
	this.showTotemBar = showTotemBar;
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
    }

    public LinkedHashMap<String, CmiHome> getHomes() {
	if (homes == null)
	    homes = new LinkedHashMap<String, CmiHome>();
	return homes;
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
	return i == 0 || i < getHomes().size() ? getHomes().size() : i;
    }

    public Set<CmiHome> getHomesBySlot(int slot) {
	Set<CmiHome> set = new HashSet<CmiHome>();
	return set;
    }

    public LinkedHashMap<String, CMILocation> getHomesAsMap() {
	return null;
    }

    public ArrayList<String> getHomesList() {
	return null;
    }

    public CmiHome getHome(String name) {
	return null;
    }

    public void removeHome(CmiHome home) {
    }

    public void removeHome(String name) {
    }

    @Deprecated
    public void addHome(@SuppressWarnings("unused") String name, CmiHome home, boolean save) {
    }

    public void addHome(CmiHome home, boolean save) {
    }

    public ChatColor getGlow() {
	return glow;
    }

    public void setGlow(ChatColor glow, boolean save) {
    }

    public boolean isTeleportToggled() {
	return teleportToggled == null ? false : teleportToggled;
    }

    public void setTeleportToggled(boolean noTeleport, boolean save) {
	this.teleportToggled = noTeleport;
	if (save)
	    addForDelayedSave();
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
	return null;
    }

    public void setRank(CMIRank rank) {
	this.rank = rank;
    }

    public boolean isTagSoundEnabled() {
	return tagSoundEnabled == null ? true : tagSoundEnabled;
    }

    public void setTagSoundEnabled(boolean tagEnabled) {
	this.tagSoundEnabled = tagEnabled;
    }

    public boolean isShiftEditEnabled() {
	return shiftEditEnabled == null ? true : shiftEditEnabled;
    }

    public void setShiftEditEnabled(boolean shiftEditEnabled) {
	this.shiftEditEnabled = shiftEditEnabled;
    }

    public boolean isSpy() {
	return spy == null ? false : spy;
    }

    public void setSpy(boolean spy) {
    }

    public boolean isCommandSpy() {
	return commandSpy == null ? false : commandSpy;
    }

    public void setCommandSpy(boolean spy, boolean save) {
    }

    public boolean isSignSpy() {
	return signSpy == null ? false : signSpy;
    }

    public void setSignSpy(boolean spy, boolean save) {
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

    }

    private void tunOnAfk(AfkType type, List<String> cmds) {
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
	return null;
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
	return null;
    }

    public Set<UUID> getIgnores() {
	return null;
    }

    public String getIgnoresString() {
	return null;
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
	return null;
    }

    public String getFormatedBalance(boolean shorts) {
	return null;
    }

    public String getFormatedBalance(String worldName) {
	return getFormatedBalance(worldName, false);
    }

    public String getFormatedBalance(String worldName, boolean shorts) {
	return null;
    }

    public CMIEconomyAcount getEconomyAccount() {
	return null;
    }

    public World getWorld() {
	return null;
    }

    public boolean respawn() {
	return true;
    }

    public void removeBossBar(String name) {
	BossBarInfo old = this.getBossBar(name);
	if (old == null)
	    return;
	this.removeBossBar(old);
    }

    public void removeBossBar(BossBarInfo bossBar) {
    }

    public void addBossBar(BossBarInfo barInfo) {

    }

    public synchronized BossBarInfo getBossBar(String name) {
	return getBossBarInfo().get(name.toLowerCase());
    }

    public synchronized ConcurrentHashMap<String, BossBarInfo> getBossBarInfo() {
	return null;
    }

    public synchronized void hideBossBars() {
    }

    public void clearBossMaps() {
	for (Entry<String, BossBarInfo> one : getBossBarInfo().entrySet()) {
	    one.getValue().cancelHideScheduler();
	}
	getBossBarInfo().clear();
    }

    public CMIPlayerInventory getInventory() {
	return new CMIPlayerInventory(this);
    }

    public void updateInventory() {
	if (this.isOnline())
	    this.getPlayer().updateInventory();
    }

    public void setExp(int exp) {
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
	if (this.getPlayer() == null)
	    return 0;
	int t1 = deltaLevelToExp(this.getPlayer().getLevel());
	return t1 - getExpForCurrentLevel();
    }

    public int getLevel() {
	if (this.getPlayer() == null)
	    return 0;
	return this.getPlayer().getLevel();
    }

    public int getExpForCurrentLevel() {
	if (this.getPlayer() == null)
	    return 0;
	return getExp() - ExpToLevel(this.getPlayer().getLevel());
    }

    public int getExp() {
	return 0;
    }

    public int getExpToLevel(int level) {
	return ExpToLevel(level) - this.getExp();
    }

    // total xp calculation based by lvl
    private static int ExpToLevel(int level) {
	return 0;
    }

    // xp calculation for one current lvl
    private static int deltaLevelToExp(int level) {
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
	AllowFlight = allowFlight;
	if (this.isOnline()) {
	    this.getPlayer().setAllowFlight(allowFlight);
	}
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
	return votifierVotesByTime.size();
    }

    public Long getLastDailyVoteTime() {
	return null;
    }

    public boolean isJailed() {
	if (this.jailedForTime == null)
	    return false;
	Long t = this.jailedForTime;

	if (CMI.getInstance().getJailManager().isCountWhileOffline() && !this.isOnline() && this.getLastLogoff() > 0) {
	    t -= System.currentTimeMillis() - this.getLastLogoff();
	}

	if (t <= 0) {
	    this.jailedForTime = null;
	    unjail();
	    return false;
	}
	return true;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId) {
	return jail(jailTimeSec, jail, cellId, null);
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason) {
	return false;
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
	return null;
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
	return null;
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

    public boolean isNoPayToggled() {
	return noPayToggle == null ? false : noPayToggle;
    }

    public void setNoPayToggled(boolean noPayToggle) {
	this.noPayToggle = noPayToggle;
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
	return CMI.getInstance().getNMS().getItemInMainHand(this.getPlayer());
    }

    public ItemStack getItemInOffHand() {
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
	return null;
    }

    public String getPTROString() {
	return null;
    }

    public HashMap<PTRRepeat, Long> getRepeatableRewards() {
	return null;
    }

    public Set<PTROneTime> getOneTimeRewards() {
	if (oneTimeRewards == null)
	    oneTimeRewards = new HashSet<PTROneTime>();
	return oneTimeRewards;
    }

    public boolean isClaimedReward(PTROneTime reward) {
	if (oneTimeRewards == null)
	    return false;

	return oneTimeRewards.contains(reward);
    }

    public void unloadData() {
	if (this.player == null || this.isOnline())
	    return;
	CMI.getInstance().getNMS().unloadData(player);
	this.player = null;
	cacheClear();
    }

    public String getNamePlatePrefix() {
	return null;
    }

    public void setNamePlatePrefix(String namePlatePrefix) {
    }

    public String getNamePlateSuffix() {
	return null;
    }

    public void setNamePlateSuffix(String namePlateSuffix) {
    }

    public void setCollision(boolean state) {
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
	return null;
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
	return 1;
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

    public boolean isAcceptingPM() {
	return acceptingPM == null ? true : acceptingPM;
    }

    public void setAcceptingPM(boolean acceptingPM) {
	this.acceptingPM = acceptingPM;
    }

    public Long getGotLastDamageAt() {
	return gotLastDamageAt;
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
	this.gotLastDamageAt = gotLastDamageAt;
    }

    public boolean isInCombatWithPlayer() {
	return false;
    }

    public Long getGotLastDamageFromPlayer() {
	return null;
    }

    public void setGotLastDamageFromPlayer(Long gotLastDamageFromPlayer) {
    }

    public void setDidLastDamageToPlayer(Long didLastDamageToPlayer) {
    }

    public void sendMessage(String msg) {
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
	return null;
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

    public void addKill(UUID uuid) {
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

    public void addFlyToCache(String worldName, boolean state) {
	tempFlyModes.put(worldName, state);
    }

    public Boolean getFlyCachedMode(String worldName) {
	return tempFlyModes.get(worldName);
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
    }

    public void dropItemNearPlayer(ItemStack one) {
    }

    public void addItemDonationFrom(CMIItemDonations donation) {
    }

    public HashMap<UUID, CMIItemDonations> getPendingDonations() {
	return null;
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

    public Boolean isToggledOffBRCompass() {
	return toggleCompass == null ? false : toggleCompass;
    }

    public void setToggledOffBRCompass(Boolean toggleCompass) {
	this.toggleCompass = toggleCompass;
    }

}
