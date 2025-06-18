package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.BanEntry;
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

import com.Zrips.CMI.Modules.Afk.AfkInfo;
import com.Zrips.CMI.Modules.Chat.CMIPlayerMessageColor;
import com.Zrips.CMI.Modules.ChatFormat.CMIChatRoom;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.DeathMessages.damageInformation;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.FlightCharge.FlightCharge;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Mirror.Mirrors;
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
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;
import com.Zrips.CMI.Modules.Teleportations.CMITeleportFeedback;
import com.Zrips.CMI.Modules.Teleportations.CMITeleportType;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import com.Zrips.CMI.Modules.Warnings.CMIWarningCategory;
import com.Zrips.CMI.events.CMIAfkEnterEvent.AfkType;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIUser {
    private UUID uuid;
    private Player player;
    private boolean collision;
    private String name;
    private String nickName;
    private String displayName;
    private CMIEconomyAcount economy;
    private int id;
    private int invId;
    private int playTimeId;
    private int playTimerewardId;
    private LinkedHashMap<String, Integer> ips;
    private CMILocation logOutLocation;
    private List<String> lockedIps;
    private long lastLogin;
    private long lastLogoff;
    private long totalPlayTime;
    private CMILocation DeathLoc;
    private Location TpLoc;
    private long pTime;
    private long tfly;
    private long tgod;
    private long teleportInvulnerability;
    private boolean isFakeAccount;
    private List<PlayerNote> notes;
    private List<PlayerMail> mail;
    private LinkedHashMap<String, CmiHome> homes;
    private Set<UUID> ignores;
    private boolean silenceMode;
    private boolean hadAllowFlight;
    private boolean AllowFlight;
    private boolean Flying;
    private int votifierVotes;
    private List<Long> votifierVotesByTime;
    private String skin;
    private HashMap<String, Long> repeatableRewards;
    private Set<String> oneTimeRewards;
    HashMap<String, worldFlyState> tempFlyModes;
    HashMap<PlayerOption, Boolean> options;
    private CMITask schedId;
    Boolean fakeUser;
    Long time;
    private static Statistic statCheck;

    public CMIUser(int id) {
    }

    public void cacheClear() {
    }

    private void scheduleDataClear() {
    }

    public CMIUser(UUID uuid) {
    }

    @Deprecated
    public CMIUser(UUID uuid, boolean updatePerm) {
    }

    public CMIUser(OfflinePlayer player) {
    }

    public boolean isOnline() {
        return false;
    }

    public Location getLogOutLocation() {
        return null;
    }

    public CMILocation getCMILogOutLocation() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public void setLogOutLocation(Location logOutLocation) {
    }

    public void setLogOutLocation(CMILocation logOutLocation) {
    }

    public void saveIfOffline() {
    }

    public void addForDelayedSave() {
    }

    public void addForPlayTimeRewardSave() {
    }

    public void setIps(LinkedHashMap<String, Integer> ips) {
    }

    public HashMap<String, Integer> getIps() {
        return null;
    }

    public boolean addIps(String ip) {
        return false;
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
        return false;
    }

    public Player getPlayer() {
        return null;
    }

    public Player getPlayer(boolean loadOfflineObject) {
        return null;
    }

    public void setPlayer(Player player) {
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
        return 0;
    }

    public long getLastLogin(boolean forceUpdate) {
        return 0;
    }

    public void setLastLogin(long lastLogin) {
    }

    public long getLastLogoff() {
        return 0;
    }

    public long getLastLogoff(boolean forceUpdate) {
        return 0;
    }

    public long getLastLogoffClean() {
        return 0;
    }

    public void setLastLogoff(long lastLogoff) {
    }

    public Location getDeathLoc() {
        return null;
    }

    public void setDeathLoc(CMILocation deathLoc) {
    }

    @Deprecated
    public Location getTpLoc() {
        return null;
    }

    public Location getLastTeleportLocation() {
        return null;
    }

    @Deprecated
    public void setTpLoc(Location tpLoc) {
    }

    @Deprecated
    public void setTpLoc(Location tpLoc, boolean save) {
    }

    public void setLastTeleportLocation(Location tpLoc) {
    }

    public void setLastTeleportLocation(Location tpLoc, boolean save) {
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

    public void updateDisplayName(boolean force) {
    }

    public void updateGroup() {
    }

    public void updatePrefix() {
    }

    public void updateSuffix() {
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

    public String getCleanDisplayName() {
        return null;
    }

    public void setDisplayName(String displayName) {
    }

    public String getDisplayName() {
        return null;
    }

    public String getDisplayName(boolean update) {
        return null;
    }

    public String getDisplayNameClean(boolean update) {
        return null;
    }

    private boolean timeToUpdate(UserDataUpdateType type) {
        return false;
    }

    public String getNickName() {
        return null;
    }

    public void setNickName(String nickName, boolean save) {
    }

    @Deprecated
    public long getpTime() {
        return 0;
    }

    public long getPlayerTime() {
        return 0;
    }

    @Deprecated
    public void setpTime(long i) {
    }

    public void setPlayerTime(long i) {
    }

    @Deprecated
    public void setpTime(long pTime, boolean save) {
    }

    public void setPlayerTime(long pTime, boolean save) {
    }

    public boolean isCuffed() {
        return false;
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
        return false;
    }

    public boolean isJoinedCounter() {
        return false;
    }

    public void setJoinedCounter(boolean joinedCounter) {
    }

    public HashMap<String, Long> getCounter() {
        return null;
    }

    public Long getCounter(String cmd) {
        return null;
    }

    public void addCounter(String cmd, Long time) {
    }

    public long getAlertUntil() {
        return 0;
    }

    public void setAlertUntil(long alertUntil) {
    }

    public void removeAlert() {
    }

    public void setAlertUntil(long alertUntil, boolean save) {
    }

    public void setAlertUntil(long alertUntil, String reason) {
    }

    public void setAlertUntil(long alertUntil, String reason, boolean save) {
    }

    public String getAlertReason() {
        return null;
    }

    public void setAlertReason(String alertReason) {
    }

    public void setAlertReason(String alertReason, boolean save) {
    }

    public boolean isGod() {
        return false;
    }

    public Mirrors getMirror() {
        return null;
    }

    public void setMirror(Mirrors mirror) {
    }

    @Deprecated
    public LinkedHashMap<Kit, CMIKitUsage> getKits() {
        return null;
    }

    public Collection<CMIKitUsage> getKitsUsages() {
        return null;
    }

    public HashMap<String, Long> getKitsAsMap() {
        return null;
    }

    public void addKitsUsage(CMIKitUsage usage) {
    }

    @Deprecated
    public void setKits(LinkedHashMap<Kit, CMIKitUsage> kits) {
    }

    public void addKit(Kit kit, Long time) {
    }

    public void addKit(Kit kit, Long time, boolean save) {
    }

    public void addKit(Kit kit, Long time, Integer usedTimes, boolean save) {
    }

    public void addKit(String kitConfigName, Long time, Integer usedTimes, boolean save) {
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

    private CMIKitUsage getKitUsage(Kit kit) {
        return null;
    }

    private CMIKitUsage getKitUsage(String name) {
        return null;
    }

    public int getLeftKitUseTimes(Kit kit) {
        return 0;
    }

    public int getKitUseTimes(Kit kit) {
        return 0;
    }

    public CMIUser resetKitUseTimes(Kit kit) {
        return null;
    }

    public PlayerCharge getPCharge() {
        return null;
    }

    public PlayerCharge getPCharge(boolean update) {
        return null;
    }

    public long getTotalPlayTime() {
        return 0;
    }

    public long getTotalPlayTime(boolean update) {
        return 0;
    }

    public long getTotalPlayTimeClean() {
        return 0;
    }

    public void setTotalPlayTime(long totalPlayTime) {
    }

    public CmdCooldown getCommandCooldowns() {
        return null;
    }

    public void addCommandCooldownByEndTime(String cmd, Long time, Long endTime) {
    }

    public long getTotemCooldown() {
        return 0;
    }

    public void setTotemCooldown(long totemCooldown) {
    }

    public long getTotemWarmup() {
        return 0;
    }

    public void setTotemWarmup(long totemWarmup) {
    }

    @Deprecated
    public boolean isShowTotemBar() {
        return false;
    }

    @Deprecated
    public void setShowTotemBar(boolean showTotemBar) {
    }

    public long getTfly() {
        return 0;
    }

    public void setTfly(long tfly) {
    }

    public void setTfly(long tfly, boolean save) {
    }

    public boolean isTgod() {
        return false;
    }

    public long getTgod() {
        return 0;
    }

    public void setTgod(long tgod) {
    }

    public void setTgod(long tgod, boolean save) {
    }

    public LinkedHashMap<String, CmiHome> getHomes() {
        return null;
    }

    public int getTotalFavoriteHomeCount() {
        return 0;
    }

    public Set<CmiHome> getHomesFromWorld(String worldName) {
        return null;
    }

    public int getValidHomeCount() {
        return 0;
    }

    public int getLastHomeSlot() {
        return 0;
    }

    public Set<CmiHome> getHomesBySlot(int slot) {
        return null;
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

    public CmiHome getBedHome() {
        return null;
    }

    public void removeHome(String name) {
    }

    public void removeHome(CmiHome home) {
    }

    @Deprecated
    public void addHome(String name, CmiHome home, boolean save) {
    }

    public void addHome(CmiHome home, boolean save) {
    }

    public ChatColor getGlow() {
        return null;
    }

    public void setGlow(ChatColor glow, boolean save) {
    }

    @Deprecated
    public boolean isTeleportToggled() {
        return false;
    }

    @Deprecated
    public void setTeleportToggled(boolean noTeleport, boolean save) {
    }

    public int getId() {
        return 0;
    }

    public void setId(int id) {
    }

    public int getInvId() {
        return 0;
    }

    public void setInvId(int invId) {
    }

    public int getPlayTimeId() {
        return 0;
    }

    public void setPlayTimeId(int playTimeId) {
    }

    public List<PlayerNote> getNotes() {
        return null;
    }

    public List<PlayerNote> getNotes(boolean filterOldOut) {
        return null;
    }

    public void setNotes(List<PlayerNote> notes) {
    }

    public void addNote(PlayerNote note, boolean save) {
    }

    public void removeMail(PlayerMail mail) {
    }

    public void clearMails() {
    }

    public List<PlayerMail> getMails() {
        return null;
    }

    public void setMail(List<PlayerMail> mail) {
    }

    public void addMail(PlayerMail mail, boolean save) {
    }

    public long getLastPatrol() {
        return 0;
    }

    public void setPatroled() {
    }

    public long getStatistic(CMIStatistic stat) {
        return 0;
    }

    public long getStatistic(CMIStatistic stat, Object thing) {
        return 0;
    }

    public CMIRank getNullRank() {
        return null;
    }

    public CMIRank getRank() {
        return null;
    }

    public CMIRank recalculateRank() {
        return null;
    }

    public void setRank(CMIRank rank) {
    }

    @Deprecated
    public boolean isTagSoundEnabled() {
        return false;
    }

    @Deprecated
    public void setTagSoundEnabled(boolean tagEnabled) {
    }

    @Deprecated
    public boolean isShiftEditEnabled() {
        return false;
    }

    @Deprecated
    public void setShiftEditEnabled(boolean shiftEditEnabled) {
    }

    @Deprecated
    public boolean isSpy() {
        return false;
    }

    @Deprecated
    public void setSpy(boolean spy) {
    }

    @Deprecated
    public boolean isCommandSpy() {
        return false;
    }

    @Deprecated
    public void setCommandSpy(boolean spy, boolean save) {
    }

    @Deprecated
    public boolean isSignSpy() {
        return false;
    }

    @Deprecated
    public void setSignSpy(boolean spy, boolean save) {
    }

    public boolean isSame(CommandSender sender) {
        return false;
    }

    public boolean isSame(Player player) {
        return false;
    }

    public boolean isAfk() {
        return false;
    }

    @Nullable
    public AfkInfo getAfkInfo() {
        return null;
    }

    public AfkInfo getAfkInfoSafe() {
        return null;
    }

    public void setAfk(boolean afk) {
    }

    public void setAfk(boolean afk, AfkType type) {
    }

    public void setAfk(boolean afk, AfkType type, boolean performCommands) {
    }

    private void turnOnAfk(AfkType type, List<String> cmds) {
    }

    private void turnOffAfk(AfkType type, List<String> cmds) {
    }

    public void setAfkReason(String reason) {
    }

    public String getAfkReason() {
        return null;
    }

    public boolean isBanned() {
        return false;
    }

    public CMIUser setBanned() {
        return null;
    }

    public CMIUser setBanned(String reason) {
        return null;
    }

    public CMIUser setBanned(Date until) {
        return null;
    }

    public CMIUser setBanned(String reason, Date until) {
        return null;
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

    public CMIBanEntry getBanEntryRaw() {
        return null;
    }

    public CMIBanEntry getBanEntry() {
        return null;
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
    }

    public void addIgnore(UUID ignore, boolean save) {
    }

    public void removeIgnore(UUID ignore) {
    }

    public boolean isIgnoring(UUID uuid) {
        return false;
    }

    public boolean isSilenceMode() {
        return false;
    }

    public void setSilenceMode(boolean silenceMode) {
    }

    public CMIVanish getVanish() {
        return null;
    }

    public CMIVanish getVanishOrNull() {
        return null;
    }

    public boolean isVanished() {
        return false;
    }

    public boolean isCMIVanished() {
        return false;
    }

    public void setVanished(boolean vanished) {
    }

    public void setVanished(boolean vanished, boolean fireEvent) {
    }

    public void updateVanishMode() {
    }

    public boolean isSitting() {
        return false;
    }

    public String getMutedReason() {
        return null;
    }

    public void setMutedReason(String reason) {
    }

    public Long getMutedUntil() {
        return null;
    }

    public boolean isMuted() {
        return false;
    }

    public void setMutedUntil(long mutedUntil) {
    }

    public long getShadowMutedUntil() {
        return 0;
    }

    public void setShadowMutedUntil(long shadowMutedUntil) {
    }

    public boolean isShadowMuted() {
        return false;
    }

    public Double deposit(Double balance, CMIUser source) {
        return null;
    }

    public Double deposit(Double balance) {
        return null;
    }

    public Double deposit(String worldName, Double balance) {
        return null;
    }

    public Double deposit(String worldName, Double balance, CMIUser source) {
        return null;
    }

    public Double withdraw(Double balance, CMIUser target) {
        return null;
    }

    public Double withdraw(Double balance) {
        return null;
    }

    public Double withdraw(String worldName, Double balance) {
        return null;
    }

    public Double withdraw(String worldName, Double balance, CMIUser source) {
        return null;
    }

    @Deprecated
    public boolean has(Double balance) {
        return false;
    }

    public boolean hasMoney(Double balance) {
        return false;
    }

    public boolean has(String worldName, Double balance) {
        return false;
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

    public String getFormatedBalance(boolean shorts) {
        return null;
    }

    public String getFormatedBalance(String worldName) {
        return null;
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
        return false;
    }

    public void removeBossBar(String name) {
    }

    public void removeBossBar(BossBarInfo bossBar) {
    }

    public void addBossBar(BossBarInfo barInfo) {
    }

    public synchronized BossBarInfo getBossBar(String name) {
        return null;
    }

    public synchronized ConcurrentHashMap<String, BossBarInfo> getBossBarInfo() {
        return null;
    }

    public synchronized void hideBossBars() {
    }

    public void clearBossMaps() {
    }

    public CMIPlayerInventory getInventory() {
        return null;
    }

    public void updateInventory() {
    }

    public void setLevel(int level) {
    }

    public void setExp(long exp) {
    }

    public void addExp(long exp) {
    }

    public void takeExp(long exp) {
    }

    public long getMissingExp() {
        return 0;
    }

    public int getLevel() {
        return 0;
    }

    public long getExpForCurrentLevel() {
        return 0;
    }

    @Deprecated
    public long getExp() {
        return 0;
    }

    public long getTotalExp() {
        return 0;
    }

    public FlightCharge getFlightCharge() {
        return null;
    }

    public boolean hasPermission(CMIPerm perm) {
        return false;
    }

    public boolean hasSetPermission(CMIPerm perm) {
        return false;
    }

    public boolean hasMeta() {
        return false;
    }

    public PlayerMeta getMeta() {
        return null;
    }

    public String getMeta(String Key) {
        return null;
    }

    public boolean isAllowFlight() {
        return false;
    }

    public void setAllowFlight(boolean allowFlight) {
    }

    public void setGameMode(GameMode mode) {
    }

    public boolean wasFlying() {
        return false;
    }

    public boolean hadAllowFlight() {
        return false;
    }

    public void setHadAllowFlight(boolean allowFlight) {
    }

    public boolean setWasFlying(boolean flying) {
        return false;
    }

    public boolean isFlying() {
        return false;
    }

    public void setFlying(boolean flying) {
    }

    public SavedInventories getSavedInventories() {
        return null;
    }

    public int getVotifierVotes() {
        return 0;
    }

    public void setVotifierVotes(int votifierVotes) {
    }

    public boolean addVotifierVote() {
        return false;
    }

    public int getDailyVoteCount() {
        return 0;
    }

    public Long getLastDailyVoteTime() {
        return null;
    }

    @Nullable
    private CMIUserJailData getJailData() {
        return null;
    }

    private CMIUserJailData getOrCreateJailData() {
        return null;
    }

    public boolean isJailed() {
        return false;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId) {
        return false;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason) {
        return false;
    }

    public boolean jail(Long jailTimeSec, CMIJail jail, Integer cellId, String reason, UUID jailedBy) {
        return false;
    }

    public void unjail() {
    }

    public Long getJailedUntil() {
        return null;
    }

    public void updateJailedTimeOnJoin() {
    }

    public long getJailedForTime() {
        return 0;
    }

    public void setJailedForTime(long jailedForTime) {
    }

    public void setJailedForTime(long jailedForTime, boolean save) {
    }

    public CMIJailCell getCell() {
        return null;
    }

    public void setCell(CMIJailCell cell) {
    }

    public Boolean isFakeAccount() {
        return null;
    }

    public void setFakeAccount(boolean isFakeAccount) {
    }

    public CMIPlayTime getCMIPlayTime() {
        return null;
    }

    public void setCMIPlayTime(CMIPlayTime playTime) {
    }

    public void updatePlayTime() {
    }

    public long getPlayTimeOptimizedOn() {
        return 0;
    }

    public void setPlayTimeOptimizedOn(long playTimeOptimized) {
    }

    @Deprecated
    public boolean isNoPayToggled() {
        return false;
    }

    @Deprecated
    public void setNoPayToggled(boolean noPayToggle) {
    }

    public String getJailedReason() {
        return null;
    }

    public void setJailedReason(String jailedReason) {
    }

    public ItemStack getItemInHand() {
        return null;
    }

    public void setItemInHand(ItemStack item) {
    }

    public void setItemInOffHand(ItemStack item) {
    }

    public ItemStack getItemInOffHand() {
        return null;
    }

    public boolean hasSetSkin() {
        return false;
    }

    public String getSkin() {
        return null;
    }

    public void setSkin(String skin) {
    }

    public int getPlayTimeRewardId() {
        return 0;
    }

    public void setPlayTimeRewardId(int playTimeRewardId) {
    }

    public String getPTRRString() {
        return null;
    }

    public String getPTROString() {
        return null;
    }

    public HashMap<String, Long> getRepeatableRewards() {
        return null;
    }

    public void addRepeatableReward(String name, long time) {
    }

    public Long getRepeatableRewardTime(String name) {
        return null;
    }

    public Set<String> getOneTimeRewards() {
        return null;
    }

    public void addOneTimeReward(String name) {
    }

    public boolean isClaimedReward(PTROneTime reward) {
        return false;
    }

    public void unloadData() {
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

    public ChatColor getNamePlateNameColor() {
        return null;
    }

    public void setNamePlateNameColor(ChatColor namePlateNameColor) {
    }

    public void setCollision(boolean state) {
    }

    public boolean isCollidable() {
        return false;
    }

    @Deprecated
    public Boolean getCollision() {
        return null;
    }

    private void applyCollision() {
    }

    @Deprecated
    public void reaplyNamePlate() {
    }

    public void reapplyNamePlate() {
    }

    public double getLookDirectionInDegrees() {
        return 0.0;
    }

    public CMIDirection getLookDirection() {
        return null;
    }

    @Nullable
    public List<CMIPlayerWarning> getWarnings() {
        return null;
    }

    public void setWarnings(List<CMIPlayerWarning> warnings) {
    }

    public int getWarningPoints() {
        return 0;
    }

    public int removeWarning(CMIPlayerWarning warning) {
        return 0;
    }

    public CMIPlayerWarning addWarning(String source, String reason, CMIWarningCategory category) {
        return null;
    }

    public CMIPlayerWarning addWarning(CMIPlayerWarning warning) {
        return null;
    }

    @Deprecated
    public HashMap<String, Long> getWarningsAsMap() {
        return null;
    }

    public String getWarningsSerialized() {
        return null;
    }

    @Deprecated
    public boolean isAcceptingPM() {
        return false;
    }

    @Deprecated
    public void setAcceptingPM(boolean acceptingPM) {
    }

    public Long getGotLastDamageAt() {
        return null;
    }

    public void setGotLastDamageAt(Long gotLastDamageAt) {
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

    public boolean isInCombatWithMob() {
        return false;
    }

    public Long getGotLastDamageFromMob() {
        return null;
    }

    public void setGotLastDamageFromMob(Long gotLastDamageFromMob) {
    }

    public void setDidLastDamageToEntity(Long didLastDamageToMob) {
    }

    public long getLeftCombatTime() {
        return 0;
    }

    public void sendMessage(String msg) {
    }

    public void sendMessage(String command, String shortPath, Object... variables) {
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Entity ent) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Location loc) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleport(Location loc, CMITeleportType type) {
        return null;
    }

    public HashMap<UUID, PlayerKillCount> getKills() {
        return null;
    }

    public void addHeadDropCount(UUID uuid) {
    }

    public void addKill(UUID uuid) {
    }

    @Deprecated
    public double getHeadDropChance(UUID uuid) {
        return 0.0;
    }

    public double getHeadDropChance(UUID uuid, boolean addEnchantBonus) {
        return 0.0;
    }

    public HashMap<EntityType, EntityKillCount> getEntityKills() {
        return null;
    }

    public void addEntityKill(EntityType type) {
    }

    @Deprecated
    public double getEntityHeadDropChance(EntityType type) {
        return 0.0;
    }

    public double getEntityHeadDropChance(EntityType type, Boolean addEnchantBonus) {
        return 0.0;
    }

    @Deprecated
    public String getTagName() {
        return null;
    }

    @Deprecated
    public void setTagName(String tagName) {
    }

    public long getAfkImunityUntil() {
        return 0;
    }

    public void addFlyToCache(String worldName, boolean state, boolean temp) {
    }

    public worldFlyState getFlyCachedMode(String worldName) {
        return null;
    }

    public worldFlyState removeFlyCachedMode(String worldName) {
        return null;
    }

    public void clearCachedFlyModes() {
    }

    public CMIChatRoom getChatRoom() {
        return null;
    }

    public boolean leaveChatRoom() {
        return false;
    }

    public void joinChatRoom(String name) {
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

    public long getTeleportInvulnerability() {
        return 0;
    }

    public void setTeleportInvulnerability(long teleportInvulnerability) {
    }

    @Deprecated
    public Boolean isToggledOffBBCompass() {
        return null;
    }

    @Deprecated
    public void setToggledOffBBCompass(Boolean toggleCompass) {
    }

    public TreeMap<Long, damageInformation> getLastDamage() {
        return null;
    }

    public damageInformation getLastDamage(damageInformation comparison) {
        return null;
    }

    public void addLastDamage(damageInformation lastDamage) {
    }

    public void resetLastDamage() {
    }

    @Nullable
    public static CMIUser getUser(String playerName) {
        return null;
    }

    public static CMIUser getUser(OfflinePlayer player) {
        return null;
    }

    public static CMIUser getUser(Player player) {
        return null;
    }

    @Nullable
    public static CMIUser getUser(UUID uuid) {
        return null;
    }

    public Boolean getOptionState(PlayerOption option) {
        return null;
    }

    public HashMap<PlayerOption, Boolean> getOptions() {
        return null;
    }

    public void setOptionState(PlayerOption option, boolean state) {
    }

    public void setOptions(HashMap<PlayerOption, Boolean> options) {
    }

    @Deprecated
    public CMIChatColor getChatColor() {
        return null;
    }

    @Deprecated
    public void setChatColor(CMIChatColor chatColor) {
    }

    public void setChatMessageFormat(CMIPlayerMessageColor chatMessageFormat) {
    }

    public CMIPlayerMessageColor getChatMessageFormat() {
        return null;
    }

    public String getChatMessageFormatString() {
        return null;
    }

    public UUID getJailedBy() {
        return null;
    }

    public void setJailedBy(UUID jailedBy) {
    }

    public static Player getOnlinePlayer(CommandSender sender, String playerName) {
        return null;
    }

    public static Player getOnlinePlayer(CommandSender sender, String playerName, boolean partialName) {
        return null;
    }

    public static Player getOnlinePlayer(String playerName) {
        return null;
    }

    public static Player getOnlinePlayer(String playerName, boolean partialName) {
        return null;
    }

    public static Player getOnlinePlayer(UUID uuid) {
        return null;
    }

    public static Player getPlayer(String playerName) {
        return null;
    }

    public String getBungeeBackLocation() {
        return null;
    }

    public void setBungeeBackLocation(String bungeeBackLocation) {
    }

    public static Collection<CMIUser> getUsers() {
        return null;
    }
}
