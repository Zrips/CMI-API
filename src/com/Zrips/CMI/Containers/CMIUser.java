package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightCharge;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Mirror.Mirrors;
import com.Zrips.CMI.Modules.Notify.Notification;
import com.Zrips.CMI.Modules.Ranks.CMIRank;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;
import com.Zrips.CMI.Modules.Statistics.CMIStats;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

public class CMIUser {

    private Player player;
    private String name;
    private String nickName = null;
    private UUID uuid;
    private CMIEconomyAcount economy = new CMIEconomyAcount(this);
    private int id = 0;
    private int invId = 0;
    private LinkedHashMap<String, Integer> ips = new LinkedHashMap<String, Integer>();
    private Location logOutLocation;
    private List<String> lockedIps = new ArrayList<String>();
    private long lastLogin = 0L;
    private long lastLogoff = 0L;
    private long totalPlayTime = 0L;
    private Location DeathLoc;
    private Location TpLoc;
    private Long pTime = -1L;
    private boolean cuffed = false;
    private Long alertUntil = null;
    private String alertReason = null;
    private boolean joinedCounter = false;
    private Boolean god = null;
    private HashMap<String, Long> counter = new HashMap<String, Long>();
    private Mirrors mirror = new Mirrors();
    private LinkedHashMap<Kit, Long> kits = new LinkedHashMap<Kit, Long>();
    private PlayerCharge PCharge;
    private HashMap<String, Notification> notifications = new HashMap<String, Notification>();
    private CmdCooldown CommandCooldown = new CmdCooldown();
    private Long totemCooldown = 0L;
    private Long totemWarmup = 0L;
    private boolean showTotemBar = true;
    private Long tfly = null;
    private Long tgod = null;
    private boolean tagSoundEnabled = true;
    private boolean shiftEditEnabled = true;
    private boolean spy = false;
    private boolean commandSpy = false;
    private CMIVanish vanish = null;

    private Long mutedUntil = null;

    private boolean teleportToggled = false;

    private ChatColor glow = null;

    private String prefix = null;
    private String suffix = null;
    private String group = null;

    private List<PlayerNote> notes = new ArrayList<PlayerNote>();
    private List<PlayerMail> mail = new ArrayList<PlayerMail>();

    private Long lastPatrol = null;

    private HashMap<String, CmiHome> homes = new HashMap<String, CmiHome>();

    private CMIStats stats;

    private CMIRank rank;

    private AfkInfo afkInfo = new AfkInfo();

    private CMIBanEntry ban = null;

    private Set<UUID> ignores = new HashSet<UUID>();

    private boolean silenceMode = false;

    private FlightCharge flightCharge = null;

    public CMIUser(int id) {
	this.id = id;
    }

//    public CMIUser(Player player) {
//	this.player = player;
//	this.name = player.getName();
//	this.uuid = player.getUniqueId();
//	updatePermissions();
//    }

    public CMIUser(UUID uuid) {
    }

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

    public void setLogOutLocation(Location logOutLocation) {
    }

    public void setLogOutLocation(Location logOutLocation, boolean save) {
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

    public boolean addAllIps(Map<String, Integer> map) {
	boolean added = false;
	return added;
    }

    public Player getPlayer() {
	return null;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public String getName() {
	return null;
    }

    public OfflinePlayer getOfflinePlayer() {
	return null;
    }

    public String getName(boolean update) {
	return null;
    }

    public void setName(String name) {
    }

    public long getLastLogin() {
	return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
    }

    public void setLastLogin(long lastLogin, boolean save) {
    }

    public long getLastLogoff() {
	return lastLogoff;
    }

    public long getLastLogoffClean() {
	return lastLogoff;
    }

    public void setLastLogoff(long lastLogoff, boolean save) {
    }

    public Location getDeathLoc() {
	return null;
    }

    public void setDeathLoc(Location deathLoc) {
    }

    public void setDeathLoc(Location deathLoc, boolean save) {
    }

    public Location getTpLoc() {
	return null;
    }

    public void setTpLoc(Location tpLoc) {
    }

    public void setTpLoc(Location tpLoc, boolean save) {
    }

    @Deprecated
    public UUID getUuid() {
	return null;
    }

    public UUID getUniqueId() {
	return null;
    }

    public void setUuid(UUID uuid) {
    }

    public void setUuidNoPermUpdate(UUID uuid) {
    }

    public void updatePermissions() {
    }

    public void updateDisplayName() {
    }

    public void updatePrefix() {
    }

    public void updateSuffix() {
    }

    public void updateGroup() {
    }

    public String getDisplayName() {
	return null;
    }

    public String getGroupName() {
	return null;
    }

    public String getPrefix() {
	return null;
    }

    public String getSuffix() {
	return null;
    }

    public String getNickName() {
	return null;
    }

    public void setNickName(String nickName, boolean save) {
    }

    public Long getpTime() {
	return null;
    }

    public void setpTime(Long i) {
    }

    public void setpTime(Long pTime, boolean save) {
    }

    public boolean isCuffed() {
	return cuffed;
    }

    public void setCuffed(boolean cuffed) {
    }

    public void setCuffed(boolean cuffed, boolean save) {
    }

    public List<String> getLockedIps() {
	return null;
    }

    public void setLockedIps(List<String> lockedIps) {
    }

    public void addLockedIps(String Ip) {
    }

    public boolean removeLockedIps(String Ip) {
	boolean s = this.lockedIps.remove(Ip);
	return s;
    }

    public boolean isJoinedCounter() {
	return joinedCounter;
    }

    public void setJoinedCounter(boolean joinedCounter) {
    }

    public void setJoinedCounter(boolean joinedCounter, boolean save) {
    }

    public HashMap<String, Long> getCounter() {
	return counter;
    }

    public Long getCounter(String cmd) {
	return counter.get(cmd);
    }

    public void addCounter(String cmd, Long time) {
	this.counter.put(cmd, time);
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
    }

    public void setAlertReason(String alertReason, boolean save) {
    }

    public Boolean isGod() {
	return null;
    }

    public void setGod(Boolean god) {
    }

    public Mirrors getMirror() {
	return mirror;
    }

    public void setMirror(Mirrors mirror) {
	this.mirror = mirror;
    }

    public LinkedHashMap<Kit, Long> getKits() {
	return kits;
    }

    public HashMap<String, Long> getKitsAsMap() {
	return null;
    }

    public void setKits(LinkedHashMap<Kit, Long> kits) {
	this.kits = kits;
    }

    public void addKit(Kit kit, Long time) {
    }

    public void addKit(Kit kit, Long time, boolean save) {
    }

    public Long getKitTime(Kit kit) {
	return null;
    }

    public boolean canUseKit(Kit kit) {
	return false;
    }

    public boolean usedOneTimeKit(Kit kit) {
	return true;
    }

    public PlayerCharge getPCharge() {
	return null;
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
	return totalPlayTime;
    }

    public long getTotalPlayTimeClean() {
	return totalPlayTime;
    }

    public void setTotalPlayTime(long totalPlayTime) {
	this.totalPlayTime = totalPlayTime;
    }

    private void checkPlayTime() {
    }

    public void addTotalPlayTime() {
    }

    public CmdCooldown getCommandCooldowns() {
	return CommandCooldown;
    }

    public void addCommandCooldown(String cmd, Long time) {
	CommandCooldown.addCooldown(cmd, time);
    }

    public Long getTotemCooldown() {
	return totemCooldown;
    }

    public void setTotemCooldown(Long totemCooldown) {
	this.totemCooldown = totemCooldown;
    }

    public boolean isShowTotemBar() {
	return showTotemBar;
    }

    public void setShowTotemBar(boolean showTotemBar) {
	this.showTotemBar = showTotemBar;
    }

    public Long getTotemWarmup() {
	return totemWarmup;
    }

    public void setTotemWarmup(Long totemWarmup) {
	this.totemWarmup = totemWarmup;
    }

    public Long getTfly() {
	return tfly;
    }

    public void setTfly(Long tfly) {
	setTfly(tfly, true);
    }

    public void setTfly(Long tfly, boolean save) {
    }

    public Long getTgod() {
	return tgod;
    }

    public void setTgod(Long tgod) {
	setTgod(tgod, true);
    }

    public void setTgod(Long tgod, boolean save) {
    }

    public HashMap<String, CmiHome> getHomes() {
	return homes;
    }

    public HashMap<String, Location> getHomesAsMap() {
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
    public void addHome(String name, CmiHome home, boolean save) {
    }

    public void addHome(CmiHome home, boolean save) {
    }

    public ChatColor getGlow() {
	return glow;
    }

    public void setGlow(ChatColor glow, boolean save) {
    }

    public boolean isTeleportToggled() {
	return teleportToggled;
    }

    public void setTeleportToggled(boolean noTeleport, boolean save) {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getInvId() {
	return invId;
    }

    public void setInvId(int invId) {
	this.invId = invId;
    }

    public List<PlayerNote> getNotes() {
	return null;
    }

    public void setNotes(List<PlayerNote> notes) {
	this.notes = notes;
    }

    public void addNote(PlayerNote note, boolean save) {
	this.notes.add(note);
	if (save)
	    addForDelayedSave();
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

    Long nextStatCheck = 0L;

    public CMIStats getStats() {
	return null;
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
	return tagSoundEnabled;
    }

    public void setTagSoundEnabled(boolean tagEnabled) {
	this.tagSoundEnabled = tagEnabled;
    }

    public boolean isShiftEditEnabled() {
	return shiftEditEnabled;
    }

    public void setShiftEditEnabled(boolean shiftEditEnabled) {
	this.shiftEditEnabled = shiftEditEnabled;
    }

    public boolean isSpy() {
	return spy;
    }

    public void setSpy(boolean spy) {
    }

    public boolean isCommandSpy() {
	return commandSpy;
    }

    public void setCommandSpy(boolean spy, boolean save) {
    }

    public boolean isAfk() {
	return afkInfo.getAfkFrom() != null;
    }

    public AfkInfo getAfkInfo() {
	return afkInfo;
    }

    public void setAfk(boolean afk) {
	setAfk(afk, AfkType.manual);
    }

    public void setAfk(boolean afk, AfkType type) {
    }

    private void tunOnAfk(AfkType type, List<String> cmds) {
    }

    private void tunOffAfk(AfkType type) {
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
	return null;
    }

    public CMIUser setBanned(String reason, CMIUser by, Date until, Date when) {
	return null;
    }

    public CMIUser unBan() {
	return null;
    }

    public CMIBanEntry getBanEntry() {
	return null;
    }

    public CMIBanEntry getBanEntry(boolean update) {
	return null;
    }

    public Set<UUID> getIgnores() {
	return ignores;
    }

    public String getIgnoresString() {
	return null;
    }

    public void setIgnores(Set<UUID> ignores) {
	this.ignores = ignores;
    }

    public void addIgnore(UUID ignore, boolean save) {
    }

    public void removeIgnore(UUID ignore) {
	this.ignores.remove(ignore);
    }

    public boolean isIgnoring(UUID uuid) {
	return this.ignores.contains(uuid) || this.ignores.contains(CMI.getInstance().getPlayerManager().getEmptyUserUUID());
    }

    public boolean isSilenceMode() {
	return silenceMode;
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

    public boolean isSitting() {
	return false;
    }

    public Long getMutedUntil() {
	return mutedUntil;
    }

    public void setMutedUntil(Long mutedUntil) {
	this.mutedUntil = mutedUntil;
    }

    public Double deposit(Double balance) {
	return null;
    }

    public Double deposit(String worldName, Double balance) {
	return null;
    }

    public Double withdraw(Double balance) {
	return null;
    }

    public Double withdraw(String worldName, Double balance) {
	return null;
    }

    public boolean has(Double balance) {
	return has(this.getWorld() == null ? EconomyManager.CMIDefaultWorld : this.getWorld().getName(), balance);
    }

    public boolean has(String worldName, Double balance) {
	return this.economy.has(worldName, balance);
    }

    public Double getBalance() {
	return null;
    }

    public Double getBalance(String worldName) {
	return null;
    }

    public String getFormatedBalance() {
	return null;
    }

    public String getFormatedBalance(String worldName) {
	return null;
    }

    public CMIEconomyAcount getEconomyAccount() {
	return null;
    }

    public World getWorld() {
	return null;
    }

    private long lastRespawn = 0L;

    public boolean respawn() {
	return true;
    }

    HashMap<String, BossBarInfo> barMap = new HashMap<String, BossBarInfo>();

    public void removeBossBar(BossBarInfo bossBar) {
    }

    public void addBossBar(BossBarInfo bossBar) {
    }

    public BossBarInfo getBossBar(String name) {
	return null;
    }

    public synchronized HashMap<String, BossBarInfo> getBossBarInfo() {
	return null;
    }

    public synchronized void hideBossBars() {
    }

    public void clearBossMaps() {
    }

    public CMIPlayerInventory getInventory() {
	return null;
    }

    public void setExp(int exp) {
    }

    public void addExp(int exp) {
    }

    public void takeExp(int exp) {
    }

    public int getExpForCurrentLevel() {
	return 0;
    }

    public int getExp() {
	return 0;
    }

    // total xp calculation based by lvl
    private static int getExpToLevel(int level) {
	return 0;
    }

    // xp calculation for one current lvl
    private static int deltaLevelToExp(int level) {
	return 0;
    }

    public FlightCharge getFlightCharge() {
	return null;
    }
}
