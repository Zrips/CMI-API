package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.Zrips.CMI.Containers.DamageControl;
import com.Zrips.CMI.Containers.RandomTeleport;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Config {
    public static String imageFolder;
    private boolean ShowNewVersion;
    public static boolean DyeBoundToPlayer;
    private List<String> signEditBlackList;
    private HashMap<String, Integer> FlyAboveRoofLimitationsMap;
    public boolean VaultMoney;
    private boolean OverrideLoginMessage;
    private boolean BossBarHpBarEnabled;
    private List<EntityType> HpBarBlackList;
    private String BooksDefaultAuthor;
    public static boolean BooksAddDate;
    public boolean VaultGroup;
    public boolean DynamicViewRangeEnabled;
    private int OptimizationsSimilarCommandChecker;
    private boolean OptimizationsSimilarCommandPrevention;
    public int lfixDefaultSpeed;
    public int SpawnMobMaxQuantity;
    public int SpawnMobMaxPassengers;
    public double lfixSoftCap;
    public boolean fixLightOngeneration;
    private List<String> fixWorldsToFix;
    public boolean hungeroveride;
    public String Lang;
    public boolean LanguageDownload;
    public static boolean monochromeConsole;
    public static int ImmortalityOnJoin;
    public boolean fileSaveAsync;
    private boolean PartialPlayerName;
    public static boolean PrioritizeOnlinePlayers;
    public boolean PreventDifferentCapitalizationNames;
    public boolean PlayTimeFromStats;
    public static boolean PlayTimeAutoUpdater;
    private boolean PreloadTopPlaytime;
    private List<Material> ItemLoreTypeBlackList;
    private boolean ItemNameMarkChanged;
    private boolean ItemLoreMarkChanged;
    public static int ItemLoreMaxLength;
    private boolean CMIPlayTimeTracking;
    public static List<String> PlaytimeTopExclude;
    public static long PlaytimeTopOffline;
    private boolean PerformCommandsOnNewName;
    private List<String> OptimizationsNameChangeCommands;
    private boolean OnLimitedItemUseInform;
    private boolean PreventEntityBoatEnterAnimals;
    private boolean PreventEntityBoatEnterMonsters;
    private boolean PreventEntityBoatEnterVillagers;
    private boolean PreventBedExplosionNether;
    private boolean PreventBedExplosionTheEnd;
    private boolean PreventPlayersOnNetherRoof;
    private int netherRoofHeight;
    private boolean PreventPlayersBelowBedrock;
    private boolean PreventIronGolemRoses;
    public static boolean ShowMainHelpPage;
    private boolean PreventHook;
    public static int NearDefaultDistance;
    public static boolean NearCommand;
    public static List<Integer> lastonlineTimers;
    public static boolean NearHideInvisible;
    public static boolean NearHideObfuscate;
    public static boolean NearDirection;
    public static int NearCommandCount;
    private boolean MulticraftDisableList;
    private boolean PreventExpPortals;
    public static boolean NoCommandsInBed;
    public static boolean LimitBooks;
    public static boolean BlockEndPortalItemTransfers;
    public static List<String> CommandsClearExclude;
    public static boolean CommandsClearConfirmation;
    public static boolean CommandsListASCOrder;
    private boolean FlyAboveRoof;
    private boolean durabilityLossUse;
    private boolean armorDurabilityLossUse;
    private int durabilityLossPercentage;
    private int armorDurabilityLossPercentage;
    private String LongDateFormat;
    private String ShortDateFormat;
    private boolean SellLog;
    private boolean PermisionOnError;
    private boolean PermisionInConsole;
    private boolean OptimizationsCommandSorting;
    private boolean AllowRconCommands;
    private List<String> CustomCommandSenders;
    private boolean CleanRconCommands;
    private boolean OptimizationsCommandRemoveLabel;
    private HashMap<CMIItemStack, String> ItemRenamingPreventMap;
    public static boolean ItemRenamingGlobalDisable;
    public static boolean ItemRenamingCheckSource;
    public static boolean AddItalicByDefault;
    public static int ItemRenamingMaxLength;
    private boolean PotionEffectsDeductWhileOffline;
    public int IPdelay;
    public static boolean IPRecord;
    public static boolean helpopfeedbackMessage;
    public boolean LoginDisabled;
    public boolean LogoutDisabled;
    public boolean LoginCustomUse;
    public boolean LogoutCustomUse;
    public boolean LogoutServerSwitch;
    public boolean LoginServerSwitch;
    public boolean FirstJoinMessageUse;
    public static boolean loginNameFilterUse;
    public static boolean logoutNameFilterUse;
    public static ChatFilterRule loginLogoutNameFilter;
    private int LogoutAutoHideFrom;
    private int LoginAutoHideFrom;
    private boolean NotesShowOnAlertEvent;
    public static long alertTimer;
    public String TimeDay;
    public String TimeNight;
    public String TimeMorning;
    public String TimeDusk;
    public int AutoTimeInterval;
    private boolean AutoTimeSmooth;
    private int AutoTimeSmoothSpeed;
    private CText Motd;
    public boolean SearchPurge;
    public boolean SearchLogIntoFile;
    public static boolean MuteNoPm;
    public boolean CuffMute;
    public List<String> CuffAllowed;
    private List<Material> GroundCleanWhiteList;
    private List<EntityType> GroundCleanEntityWhiteList;
    public boolean WorldLimits;
    public HashMap<String, GameMode> worldGameMode;
    public HashMap<String, Boolean> worldFlyMode;
    public HashMap<String, Boolean> worldGodMode;
    public HashMap<String, Boolean> worldElytraMode;
    public boolean hatIgnoreLored;
    public boolean hatBlockArmorItems;
    public boolean hatBlockNoneHatEnchanted;
    public boolean hatAllowMobHeads;
    public List<CMIMaterial> hatWhiteList;
    public boolean RemoveNegative;
    public List<String> RemoveNegativeEffects;
    private List<String> CommandSpyBlackListed;
    private List<String> CommandSpyCommandList;
    private int SpyDelayForTrigger;
    private CMIParticle PointDefaultParticle;
    private boolean ExploitPatcherRiptide;
    private boolean ExploitPatcherCheckItem;
    public int CounterRange;
    private int MaxHp;
    private boolean NetherPortalPreventCreation;
    public int NetherPortalMaxHeight;
    public int NetherPortalMaxWidth;
    public HashMap<DamageCause, ArrayList<DamageControl>> DamageControlMap;
    public int MirrorMaxRange;
    private boolean MirrorBreakDisabled;
    private CMIItemStack SelectionTool;
    private CMILocation firstSpawnPoint;
    private boolean InvDisableOffline;
    public static List<String> InvBlackList;
    private long PlayerNotesExpiresIn;
    public int DisposeUILines;
    public boolean DisposeCustomModelData;
    public boolean DisposeAttachedCommands;
    public List<CMIMaterial> DisposeMaterials;
    private ConfigReader localeFile;
    private ConfigReader cfg;
    public static ChatFilterRule InteractiveCommandsSignRegex;
    public static boolean InteractiveCommandsSort;
    public static boolean UseFakeOperator;
    public static boolean InfiniteLoopDetection;
    public static boolean ShowSkullOwner;
    public static boolean ShowBeeHive;
    public static boolean ShowDecoratedPot;
    private List<String> ElevatorIndicator;
    private String ElevatorStaticIndicator;
    private boolean maintenance;
    public static boolean DisableTeamManagement;
    private boolean AutoDownloadGeoIp;
    private boolean AutoDownloadGeoLiteCity;
    private String maintenanceMessage;
    public static Boolean maintenanceBossbar;
    public static Boolean maintenanceAutoKick;
    private CMI plugin;
    List<String> CommentList;

    public Config(CMI plugin) {
    }

    public void ChangeConfig(String path, Object list) {
    }

    public void ChangeConfig(String path, Object list, boolean load) {
    }

    private static void newLn(StringBuilder header) {
    }

    private static StringBuilder formStringBuilder(List<String> list) {
        return null;
    }

    public boolean LoadLang(String lang) {
        return false;
    }

    public boolean LoadLang(String lang, boolean isReload) {
        return false;
    }

    public boolean load() {
        return false;
    }

    private static void exportChatSection(ConfigReader cfg) {
    }

    public boolean reload() {
        return false;
    }

    public boolean load(boolean isReload) {
        return false;
    }

    private static DamageCause getCause(String name) {
        return null;
    }

    public void reload(CommandSender sender) {
    }

    public boolean reloadLanguage() {
        return false;
    }

    public Location getFirstSpawnPoint() {
        return null;
    }

    public ConfigReader getConfig() {
        return null;
    }

    public long getPlayerNotesExpiresIn() {
        return 0;
    }

    @Deprecated
    public long getPlayerMailExpiresIn() {
        return 0;
    }

    @Deprecated
    public boolean isDurabilityLossUse() {
        return false;
    }

    public boolean isToolDurabilityLossUse() {
        return false;
    }

    @Deprecated
    public int getDurabilityLossPercentage() {
        return 0;
    }

    public int getToolDurabilityLossPercentage() {
        return 0;
    }

    public HashMap<CMIItemStack, String> getItemRenamingPreventMap() {
        return null;
    }

    public boolean isOnLimitedItemUseInform() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareProtectNormalRepair() {
        return false;
    }

    @Deprecated
    public int getRepairShareDurability() {
        return 0;
    }

    @Deprecated
    public boolean isRepairShareAddLore() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareCancelEvent() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareInformWithMessage() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareProtectCommandRepair() {
        return false;
    }

    @Deprecated
    public boolean isRepairShareBypassWithPerm() {
        return false;
    }

    public int getMaxHp() {
        return 0;
    }

    public boolean isNotesShowOnAlertEvent() {
        return false;
    }

    public boolean isPreventExpPortals() {
        return false;
    }

    public ConfigReader getLocaleConfig() {
        return null;
    }

    @Deprecated
    public boolean isDisableWorldChunkCheckInfo() {
        return false;
    }

    public boolean isPreventEntityBoatEnterAnimals() {
        return false;
    }

    public boolean isPreventEntityBoatEnterMonsters() {
        return false;
    }

    public boolean isPreventBedExplosionNether() {
        return false;
    }

    public boolean isPreventIronGolemRoses() {
        return false;
    }

    public boolean isMulticraftDisableList() {
        return false;
    }

    public boolean isPreventBedExplosionTheEnd() {
        return false;
    }

    public CMIItemStack getSelectionTool() {
        return null;
    }

    public boolean isNetherPortalPreventCreation() {
        return false;
    }

    public boolean isMaintenance() {
        return false;
    }

    public void setMaintenance(boolean maintenance) {
    }

    public String getMaintenanceMessage() {
        return null;
    }

    public void setMaintenanceMessage(String maintenanceMessage) {
    }

    public boolean isOverrideLoginMessage() {
        return false;
    }

    public CText getMotd() {
        return null;
    }

    public boolean isPermisionOnError() {
        return false;
    }

    public List<String> getFixWorldsToFix() {
        return null;
    }

    public List<String> getCommandSpyBlackListed() {
        return null;
    }

    public int getSpyDelayForTrigger() {
        return 0;
    }

    public boolean isOptimizationsCommandSorting() {
        return false;
    }

    public boolean isPreventPlayersOnNetherRoof() {
        return false;
    }

    public boolean isPreventPlayersBelowBedrock() {
        return false;
    }

    public boolean isBossBarHpBarEnabled() {
        return false;
    }

    public List<Material> getGroundCleanWhiteList() {
        return null;
    }

    public List<EntityType> getGroundCleanEntityWhiteList() {
        return null;
    }

    public boolean isPartialPlayerName() {
        return false;
    }

    public boolean isOptimizationsCommandRemoveLabel() {
        return false;
    }

    @Deprecated
    public boolean isBlockedSpawnReason(String worldName, SpawnReason reason) {
        return false;
    }

    public boolean isPreventHook() {
        return false;
    }

    public CMIParticle getPointDefaultParticle() {
        return null;
    }

    public boolean isPermisionInConsole() {
        return false;
    }

    public boolean isSellLog() {
        return false;
    }

    @Deprecated
    public boolean isSpawnersSupportDisabled() {
        return false;
    }

    public String getBooksDefaultAuthor() {
        return null;
    }

    @Deprecated
    public List<String> getCleanUpWhiteList() {
        return null;
    }

    @Deprecated
    public boolean isChatReplyToLastMessenger() {
        return false;
    }

    @Deprecated
    public int getLastMessengerTimeOut() {
        return 0;
    }

    @Deprecated
    public boolean isColorsMe() {
        return false;
    }

    @Deprecated
    public boolean isChatDynMapChat() {
        return false;
    }

    @Deprecated
    public boolean isModifyChatFormat() {
        return false;
    }

    @Deprecated
    public boolean isChatClickHoverMessages() {
        return false;
    }

    @Deprecated
    public boolean isColorsPublicMessages() {
        return false;
    }

    @Deprecated
    public boolean isColorsPrivateMessage() {
        return false;
    }

    @Deprecated
    public boolean isChatIgnorePublicMessage() {
        return false;
    }

    public List<String> getCommandSpyCommandList() {
        return null;
    }

    public boolean isCMIPlayTimeTracking() {
        return false;
    }

    public void setCMIPlayTimeTracking(boolean cMIPlayTimeTracking) {
    }

    @Deprecated
    public int getPlayerMailAllDays() {
        return 0;
    }

    @Deprecated
    public String getElevatorIndicator() {
        return null;
    }

    public List<String> getElevatorIndicators() {
        return null;
    }

    public String getElevatorStaticIndicator() {
        return null;
    }

    @Deprecated
    public boolean isSpawnersXpDrop() {
        return false;
    }

    @Deprecated
    public int getLogoutAutoHideFrom() {
        return 0;
    }

    @Deprecated
    public int getLoginAutoHideFrom() {
        return 0;
    }

    public boolean isAutoDownloadGeoIp() {
        return false;
    }

    public boolean isAutoDownloadGeoLiteCity() {
        return false;
    }

    public boolean isPreloadTopPlaytime() {
        return false;
    }

    @Deprecated
    public boolean isElytraPreventSelfDamage() {
        return false;
    }

    @Deprecated
    public boolean isFlyAboveRoof() {
        return false;
    }

    public int getOptimizationsSimilarCommandChecker() {
        return 0;
    }

    @Deprecated
    public HashMap<String, Integer> getFlyAboveRoofLimitationsMap() {
        return null;
    }

    public String getLongDateFormat() {
        return null;
    }

    public String getShortDateFormat() {
        return null;
    }

    public boolean isAutoTimeSmooth() {
        return false;
    }

    public int getAutoTimeSmoothSpeed() {
        return 0;
    }

    public List<EntityType> getHpBarBlackList() {
        return null;
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w) {
        return null;
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
        return null;
    }

    @Deprecated
    public HashMap<String, RandomTeleport> getRandomTeleports() {
        return null;
    }

    @Deprecated
    public int getRandomTeleportMaxTries() {
        return 0;
    }

    @Deprecated
    public int getRandomTeleportCooldown() {
        return 0;
    }

    @Deprecated
    public List<String> getRandomTeleportExcludedBiomes() {
        return null;
    }

    public List<Material> getItemLoreTypeBlackList() {
        return null;
    }

    @Deprecated
    public boolean isDisableRiptide() {
        return false;
    }

    public boolean isOptimizationsSimilarCommandPrevention() {
        return false;
    }

    @Deprecated
    public boolean isBossBarCompassEnabled() {
        return false;
    }

    @Deprecated
    public boolean isCompassRequireCompass() {
        return false;
    }

    @Deprecated
    public int getCompassUpdateInterval() {
        return 0;
    }

    @Deprecated
    public String getCompassShape() {
        return null;
    }

    @Deprecated
    public String getCompassColor() {
        return null;
    }

    @Deprecated
    public String getCompassHomeIcon() {
        return null;
    }

    @Deprecated
    public String getCompassSpawnIcon() {
        return null;
    }

    @Deprecated
    public String getCompassDeathIcon() {
        return null;
    }

    @Deprecated
    public String getCompassTargetIcon() {
        return null;
    }

    @Deprecated
    public boolean isRecoveryRequireCompass() {
        return false;
    }

    @Deprecated
    public boolean isRecoveryAsRegularCompass() {
        return false;
    }

    public boolean isPotionEffectsDeductWhileOffline() {
        return false;
    }

    public boolean isPreventEntityBoatEnterVillagers() {
        return false;
    }

    public int getArmorDurabilityLossPercentage() {
        return 0;
    }

    public void setArmorDurabilityLossPercentage(int armorDurabilityLossPercentage) {
    }

    public boolean isArmorDurabilityLossUse() {
        return false;
    }

    public void setArmorDurabilityLossUse(boolean armorDurabilityLossUse) {
    }

    public boolean isItemNameMarkChanged() {
        return false;
    }

    public boolean isItemLoreMarkChanged() {
        return false;
    }

    public boolean isShowNewVersion() {
        return false;
    }

    public boolean isSignEditBlocked(String line) {
        return false;
    }

    public int getNetherRoofHeight() {
        return 0;
    }

    public boolean isInvDisableOffline() {
        return false;
    }

    public boolean isMirrorBreakDisabled() {
        return false;
    }

    public boolean isExploitPatcherRiptide() {
        return false;
    }

    @Deprecated
    public int getPlayerMailMax() {
        return 0;
    }

    @Deprecated
    public int getTeleportTpaMaxDistance() {
        return 0;
    }

    @Deprecated
    public int getTeleportTpaHereMaxDistance() {
        return 0;
    }

    @Deprecated
    public List<String> getBackBlackList() {
        return null;
    }

    @Deprecated
    public int getBackMinDistance() {
        return 0;
    }

    @Deprecated
    public boolean isSafeLocationDownThenUp() {
        return false;
    }

    @Deprecated
    public boolean isTpaCurrentLoc() {
        return false;
    }

    @Deprecated
    public boolean isTpahereCurrentLoc() {
        return false;
    }

    @Deprecated
    public int getTeleportJumpDefault() {
        return 0;
    }

    @Deprecated
    public HashMap<Material, Integer> getBlockedItems() {
        return null;
    }

    @Deprecated
    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
        return null;
    }

    @Deprecated
    public boolean isTeleportSwitchPlaces() {
        return false;
    }

    @Deprecated
    public int getTeleportTpaWarmup() {
        return 0;
    }

    @Deprecated
    public boolean isTeleportTpaMove() {
        return false;
    }

    public boolean isAllowRconCommands() {
        return false;
    }

    public boolean isCleanRconCommands() {
        return false;
    }

    public boolean isPerformCommandsOnNewName() {
        return false;
    }

    public List<String> getOptimizationsNameChangeCommands() {
        return null;
    }

    public boolean isExploitPatcherCheckItem() {
        return false;
    }

    public List<String> getCustomCommandSenders() {
        return null;
    }
}
