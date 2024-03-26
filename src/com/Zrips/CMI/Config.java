package com.Zrips.CMI;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.Zrips.CMI.Containers.DamageControl;
import com.Zrips.CMI.Containers.RandomTeleport;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Config {

    public static String imageFolder = CMI.getInstance().getDataFolder().getPath() + File.separator + "Images";

    private boolean ShowNewVersion = true;
    public static boolean DyeBoundToPlayer = true;

    private List<String> signEditBlackList = new ArrayList<String>();
    private HashMap<String, Integer> FlyAboveRoofLimitationsMap = new HashMap<String, Integer>();

    public boolean VaultMoney = true;

    private boolean OverrideLoginMessage = true;
    private boolean BossBarHpBarEnabled = true;
    private List<EntityType> HpBarBlackList = new ArrayList<EntityType>();

    private String BooksDefaultAuthor;
    public static boolean BooksAddDate = false;
    public boolean VaultGroup = true;
    public boolean GlobalRangeByDefault = false;
    public boolean DynamicViewRangeEnabled = false;
    private int OptimizationsSimilarCommandChecker;
    private boolean OptimizationsSimilarCommandPrevention;
    public int scanDefaultSpeed;
    public int lfixDefaultSpeed;
    public int DefaultRange;
    public int SpawnMobMaxQuantity;
    public int SpawnMobMaxPassengers;
    public double scanSoftCap;
    public double lfixSoftCap;
    public boolean fixLightOngeneration;
    private List<String> fixWorldsToFix = new ArrayList<String>();
    public boolean hungeroveride = false;
    public String Lang = "EN";
    public boolean LanguageDownload = true;

    public static boolean monochromeConsole = false;
    public static int ImmortalityOnJoin = 3;
    public boolean fileSaveAsync = false;
    private boolean PartialPlayerName = false;
    public static boolean PrioritizeOnlinePlayers = false;
    public boolean PreventDifferentCapitalizationNames = true;
    public boolean PlayTimeFromStats = false;
    public static boolean PlayTimeAutoUpdater = false;
    private boolean PreloadTopPlaytime = false;
    private List<Material> ItemLoreTypeBlackList = new ArrayList<Material>();
    private boolean ItemNameMarkChanged = false;
    private boolean ItemLoreMarkChanged = false;
    public static int ItemLoreMaxLength = 64;
    private boolean CMIPlayTimeTracking = false;

    public static List<String> PlaytimeTopExclude = new ArrayList<String>();
    public static long PlaytimeTopOffline = 0;

    private boolean PerformCommandsOnNewName;
    private List<String> OptimizationsNameChangeCommands;

    private boolean DisableWorldChunkCheckInfo = true;

    private boolean OnLimitedItemUseInform = true;

    private boolean PreventEntityBoatEnterAnimals = true;
    private boolean PreventEntityBoatEnterMonsters = true;
    private boolean PreventEntityBoatEnterVillagers = true;

    private boolean PreventBedExplosionNether = true;
    private boolean PreventBedExplosionTheEnd = true;
    private boolean PreventPlayersOnNetherRoof = true;
    private int netherRoofHeight = 0;
    private boolean PreventPlayersBelowBedrock = true;

    private boolean PreventIronGolemRoses = false;
    public static boolean ShowMainHelpPage = true;
    private boolean PreventHook = false;
    public static int NearDefaultDistance = 200;
    public static boolean NearCommand = false;
    public static List<Integer> lastonlineTimers = new ArrayList<>();
    public static boolean NearHideInvisible = false;
    public static boolean NearHideObfuscate = false;
    public static boolean NearDirection = true;
    public static int NearCommandCount = 10;
    private boolean MulticraftDisableList = false;
    private boolean PreventExpPortals = false;
    public static boolean NoCommandsInBed = false;
    public static boolean LimitBooks = false;
    public static boolean BlockEndPortalItemTransfers = false;

    public static List<String> CommandsClearExclude = new ArrayList<String>();
    public static boolean CommandsClearConfirmation = true;
    public static boolean CommandsListASCOrder = true;

    private boolean FlyAboveRoof = true;

    private boolean durabilityLossUse = true;
    private boolean armorDurabilityLossUse = true;
    private int durabilityLossPercentage = 10;
    private int armorDurabilityLossPercentage = 10;

    private String LongDateFormat;
    private String ShortDateFormat;
    private boolean SellLog;

    private boolean PermisionOnError;
    private boolean PermisionInConsole;
    private boolean OptimizationsCommandSorting;
    private boolean AllowRconCommands;
    private boolean OptimizationsCommandRemoveLabel;

    private HashMap<CMIItemStack, String> ItemRenamingPreventMap = new HashMap<CMIItemStack, String>();
    public static boolean ItemRenamingGlobalDisable = false;
    public static int ItemRenamingMaxLength = 64;

    private boolean PotionEffectsDeductWhileOffline = false;

    public int IPdelay;
    public static boolean IPRecord = true;
    public static boolean helpopfeedbackMessage = true;

    public boolean LoginDisabled = false;
    public boolean LogoutDisabled = false;
    public boolean LoginCustomUse = false;
    public boolean LogoutCustomUse = false;
    public boolean LogoutServerSwitch = false;
    public boolean LoginServerSwitch = false;
    public boolean FirstJoinMessageUse = false;

    public static boolean loginNameFilterUse = false;
    public static boolean logoutNameFilterUse = false;

    public static ChatFilterRule loginLogoutNameFilter = new ChatFilterRule();

    private int LogoutAutoHideFrom = -1;
    private int LoginAutoHideFrom = -1;

    private boolean NotesShowOnAlertEvent = true;
    public static long alertTimer = 1440;

    public String TimeDay;
    public String TimeNight;
    public String TimeMorning;
    public String TimeDusk;
    public int AutoTimeInterval;
    private boolean AutoTimeSmooth;
    private int AutoTimeSmoothSpeed;

    private CText Motd = null;

    public boolean SearchPurge = false;
    public boolean ScanPurge = false;

    public static boolean MuteNoPm = true;
    public boolean CuffMute = true;
    public List<String> CuffAllowed = new ArrayList<String>();
    private List<Material> GroundCleanWhiteList = new ArrayList<Material>();

    public boolean WorldLimits = false;
    public HashMap<String, GameMode> worldGameMode = new HashMap<String, GameMode>();
    public HashMap<String, Boolean> worldFlyMode = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> worldGodMode = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> worldElytraMode = new HashMap<String, Boolean>();

    private HashMap<String, List<SpawnReason>> blockedSpawnReasons = new HashMap<String, List<SpawnReason>>();

    public boolean hatIgnoreLored = false;
    public boolean hatBlockArmorItems = false;
    public boolean hatBlockNoneHatEnchanted = false;
    public boolean hatAllowMobHeads = true;
    public List<CMIMaterial> hatWhiteList = new ArrayList<CMIMaterial>();

    public boolean RemoveNegative = false;
    public List<String> RemoveNegativeEffects = new ArrayList<String>();
    private List<String> CommandSpyBlackListed = new ArrayList<String>();
    private List<String> CommandSpyCommandList = new ArrayList<String>();
    private int SpyDelayForTrigger = 1;

    private CMIParticle PointDefaultParticle = CMIParticle.COLOURED_DUST;

    private boolean ExploitPatcherRiptide = true;
    private boolean ExploitPatcherCheckItem = true;

    public int CounterRange = 10;

    private int MaxHp = 20;

    private boolean NetherPortalPreventCreation = false;
    public int NetherPortalMaxHeight = 23;
    public int NetherPortalMaxWidth = 23;

    public HashMap<DamageCause, ArrayList<DamageControl>> DamageControlMap = new HashMap<DamageCause, ArrayList<DamageControl>>();

    public int MirrorMaxRange = 50;
    private boolean MirrorBreakDisabled = false;

    private CMIItemStack SelectionTool;

    private CMILocation firstSpawnPoint = null;

    private boolean InvDisableOffline = false;
    public static List<String> InvBlackList = new ArrayList<String>();

    private boolean CompassBossBar = false;
    private boolean CompassRequireCompass = false;
    private boolean recoveryRequireCompass = false;
    private boolean recoveryAsRegularCompass = false;
    private int CompassUpdateInterval = 200;
    private String CompassShape;
    private String CompassColor;
    private String CompassHomeIcon;
    private String CompassSpawnIcon;
    private String CompassDeathIcon;
    private String CompassTargetIcon;
    public static List<String> CompassColors = new ArrayList<String>();
    public static boolean CompassShowHome;
    public static boolean CompassShowSpawn;
    public static boolean CompassShowDeath;
    public static boolean CompassShowCompass;

    private long PlayerNotesExpiresIn = 30L;
    private long PlayerMailExpiresIn = 30L;
    private int PlayerMailAllDays = 30;
    private int PlayerMailMax = 30;

    public int DisposeUILines = 4;
    public boolean DisposeCustomModelData = true;
    public boolean DisposeAttachedCommands = true;

    private ConfigReader localeFile = null;
    private ConfigReader cfg = null;

    public static ChatFilterRule InteractiveCommandsSignRegex = new ChatFilterRule();
    public static boolean InteractiveCommandsSort = true;
    public static boolean UseFakeOperator = false;
    public static boolean InfiniteLoopDetection = true;

    public static boolean ShowSkullOwner = true;
    public static boolean ShowBeeHive = true;
    private String ElevatorIndicator = "[CMIElevator]";
    private String ElevatorStaticIndicator = "[*]";
    private boolean maintenance = false;
    public static boolean DisableTeamManagement = false;
    private boolean AutoDownloadGeoIp = true;
    private boolean AutoDownloadGeoLiteCity = true;

    private String maintenanceMessage = null;
    public static Boolean maintenanceBossbar = null;
    public static Boolean maintenanceAutoKick = null;

    private CMI plugin;

    public Config(CMI plugin) {
        this.plugin = plugin;
    }

    public void ChangeConfig(String path, Object list) {
        ChangeConfig(path, list, true);
    }

    public void ChangeConfig(String path, Object list, boolean load) {
    }

    private static void newLn(StringBuilder header) {
        header.append(System.lineSeparator());
    }

    private static StringBuilder formStringBuilder(List<String> list) {
        StringBuilder header = new StringBuilder();
        return header;
    }

    // Language file
    public boolean LoadLang(String lang) {
        return LoadLang(lang, false);
    }

    public boolean LoadLang(String lang, boolean isReload) {
        return true;
    }

    public boolean load() {
        return load(false);
    }

    private static void exportChatSection(ConfigReader cfg) {
     
    }

    public boolean load(boolean isReload) {    
        return true;
    }


    public void reload(CommandSender sender) {


    }

    public boolean reloadLanguage() {
        boolean langLoaded = LoadLang("EN", true);
        return langLoaded;
    }

    public Location getFirstSpawnPoint() {
        return firstSpawnPoint == null ? null : firstSpawnPoint.clone();
    }

    public ConfigReader getConfig() {
        if (cfg == null) {
            try {
                cfg = new ConfigReader(CMI.getInstance(), "config.yml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cfg;
    }

    public long getPlayerNotesExpiresIn() {
        return PlayerNotesExpiresIn;
    }

    public long getPlayerMailExpiresIn() {
        return PlayerMailExpiresIn;
    }

    @Deprecated
    public boolean isDurabilityLossUse() {
        return isToolDurabilityLossUse();
    }

    public boolean isToolDurabilityLossUse() {
        return durabilityLossUse;
    }

    @Deprecated
    public int getDurabilityLossPercentage() {
        return getToolDurabilityLossPercentage();
    }

    public int getToolDurabilityLossPercentage() {
        return durabilityLossPercentage;
    }

    public HashMap<CMIItemStack, String> getItemRenamingPreventMap() {
        return ItemRenamingPreventMap;
    }

    public boolean isOnLimitedItemUseInform() {
        return OnLimitedItemUseInform;
    }

    @Deprecated
    public boolean isRepairShareProtectNormalRepair() {
        return CMI.getInstance().getRepairManager().isRSProtectNormalRepair();
    }

    @Deprecated
    public int getRepairShareDurability() {
        return CMI.getInstance().getRepairManager().getRSDurability();
    }

    @Deprecated
    public boolean isRepairShareAddLore() {
        return CMI.getInstance().getRepairManager().isRSAddLore();
    }

    @Deprecated
    public boolean isRepairShareCancelEvent() {
        return CMI.getInstance().getRepairManager().isRSCancelEvent();
    }

    @Deprecated
    public boolean isRepairShareInformWithMessage() {
        return CMI.getInstance().getRepairManager().isRSInformWithMessage();
    }

    @Deprecated
    public boolean isRepairShareProtectCommandRepair() {
        return CMI.getInstance().getRepairManager().isRSProtectCommandRepair();
    }

    @Deprecated
    public boolean isRepairShareBypassWithPerm() {
        return CMI.getInstance().getRepairManager().isRSBypassWithPerm();
    }

    public int getMaxHp() {
        return MaxHp;
    }

    public boolean isNotesShowOnAlertEvent() {
        return NotesShowOnAlertEvent;
    }

    public boolean isPreventExpPortals() {
        return PreventExpPortals;
    }

    public ConfigReader getLocaleConfig() {
        if (localeFile == null) {
            File f = new File(plugin.getDataFolder(), "Translations" + File.separator + "Locale_" + this.Lang + ".yml");
            try {
                this.localeFile = new ConfigReader(f);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        return localeFile;
    }

    public boolean isDisableWorldChunkCheckInfo() {
        return DisableWorldChunkCheckInfo;
    }

    public boolean isPreventEntityBoatEnterAnimals() {
        return PreventEntityBoatEnterAnimals;
    }

    public boolean isPreventEntityBoatEnterMonsters() {
        return PreventEntityBoatEnterMonsters;
    }

    public boolean isPreventBedExplosionNether() {
        return PreventBedExplosionNether;
    }

    public boolean isPreventIronGolemRoses() {
        return PreventIronGolemRoses;
    }

    public boolean isMulticraftDisableList() {
        return MulticraftDisableList;
    }

    public boolean isPreventBedExplosionTheEnd() {
        return PreventBedExplosionTheEnd;
    }

    public CMIItemStack getSelectionTool() {
        return SelectionTool;
    }

    public boolean isNetherPortalPreventCreation() {
        return NetherPortalPreventCreation;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        ChangeConfig("Optimizations.Maintenance", maintenance, false);
        this.maintenance = maintenance;
    }

    public String getMaintenanceMessage() {
        return maintenanceMessage;
    }

    public void setMaintenanceMessage(String maintenanceMessage) {
        this.maintenanceMessage = maintenanceMessage;
    }

    public boolean isOverrideLoginMessage() {
        return OverrideLoginMessage;
    }

    public CText getMotd() {
        return Motd;
    }

    public boolean isPermisionOnError() {
        return PermisionOnError;
    }

    public List<String> getFixWorldsToFix() {
        return fixWorldsToFix;
    }

    public List<String> getCommandSpyBlackListed() {
        return CommandSpyBlackListed;
    }

    public int getSpyDelayForTrigger() {
        return SpyDelayForTrigger;
    }

    public boolean isOptimizationsCommandSorting() {
        return OptimizationsCommandSorting;
    }

    public boolean isPreventPlayersOnNetherRoof() {
        return PreventPlayersOnNetherRoof;
    }

    public boolean isPreventPlayersBelowBedrock() {
        return PreventPlayersBelowBedrock;
    }

    public boolean isBossBarHpBarEnabled() {
        return BossBarHpBarEnabled;
    }

    public List<Material> getGroundCleanWhiteList() {
        return GroundCleanWhiteList;
    }

    public boolean isPartialPlayerName() {
        return PartialPlayerName;
    }

    public boolean isOptimizationsCommandRemoveLabel() {
        return OptimizationsCommandRemoveLabel;
    }

    public boolean isBlockedSpawnReason(String worldName, SpawnReason reason) {
        List<SpawnReason> reaons = blockedSpawnReasons.get(worldName);
        if (reaons == null)
            return false;
        return reaons.contains(reason);
    }

    public boolean isPreventHook() {
        return PreventHook;
    }

    public CMIParticle getPointDefaultParticle() {
        return PointDefaultParticle;
    }

    public boolean isPermisionInConsole() {
        return PermisionInConsole;
    }

    public boolean isSellLog() {
        return SellLog;
    }

    @Deprecated
    public boolean isSpawnersSupportDisabled() {
        return plugin.getSpawnerChargesManager().isSpawnersSupportDisabled();
    }

    public String getBooksDefaultAuthor() {
        return BooksDefaultAuthor;
    }

    @Deprecated
    public List<String> getCleanUpWhiteList() {
        return plugin.getChatManager().getCleanUpWhiteList();
    }

    @Deprecated
    public boolean isChatReplyToLastMessenger() {
        return plugin.getChatManager().isChatReplyToLastMessenger();
    }

    @Deprecated
    public int getLastMessengerTimeOut() {
        return plugin.getChatManager().getLastMessengerTimeOut();
    }

    @Deprecated
    public boolean isColorsMe() {
        return plugin.getChatManager().isColorsMe();
    }

    @Deprecated
    public boolean isChatDynMapChat() {
        return plugin.getChatManager().isChatDynMapChat();
    }

    @Deprecated
    public boolean isModifyChatFormat() {
        return plugin.getChatManager().isModifyChatFormat();
    }

    @Deprecated
    public boolean isChatClickHoverMessages() {
        return plugin.getChatManager().isChatClickHoverMessages();
    }

    @Deprecated
    public boolean isColorsPublicMessages() {
        return plugin.getChatManager().isColorsPublicMessages();
    }

    @Deprecated
    public boolean isColorsPrivateMessage() {
        return plugin.getChatManager().isColorsPrivateMessage();
    }

    @Deprecated
    public boolean isChatIgnorePublicMessage() {
        return plugin.getChatManager().isChatIgnorePublicMessage();
    }

    public List<String> getCommandSpyCommandList() {
        return CommandSpyCommandList;
    }

    public boolean isCMIPlayTimeTracking() {
        return CMIPlayTimeTracking;
    }

    public void setCMIPlayTimeTracking(boolean cMIPlayTimeTracking) {
        CMIPlayTimeTracking = cMIPlayTimeTracking;
    }

    public int getPlayerMailAllDays() {
        return PlayerMailAllDays;
    }

    public String getElevatorIndicator() {
        return ElevatorIndicator;
    }

    public String getElevatorStaticIndicator() {
        return ElevatorStaticIndicator;
    }

    @Deprecated
    public boolean isSpawnersXpDrop() {
        return plugin.getSpawnerChargesManager().isSpawnersXpDrop();
    }

    public int getLogoutAutoHideFrom() {
        return LogoutAutoHideFrom;
    }

    public int getLoginAutoHideFrom() {
        return LoginAutoHideFrom;
    }

    public boolean isAutoDownloadGeoIp() {
        return AutoDownloadGeoIp;
    }

    public boolean isAutoDownloadGeoLiteCity() {
        return AutoDownloadGeoLiteCity;
    }

    public boolean isPreloadTopPlaytime() {
        return PreloadTopPlaytime;
    }

    @Deprecated
    public boolean isElytraPreventSelfDamage() {
        return plugin.getElytraManager().isPreventSelfDamage();
    }

    public boolean isFlyAboveRoof() {
        return FlyAboveRoof;
    }

    public int getOptimizationsSimilarCommandChecker() {
        return OptimizationsSimilarCommandChecker;
    }

    public HashMap<String, Integer> getFlyAboveRoofLimitationsMap() {
        return FlyAboveRoofLimitationsMap;
    }

    public String getLongDateFormat() {
        return LongDateFormat;
    }

    public String getShortDateFormat() {
        return ShortDateFormat;
    }

    public boolean isAutoTimeSmooth() {
        return AutoTimeSmooth;
    }

    public int getAutoTimeSmoothSpeed() {
        return AutoTimeSmoothSpeed;
    }

    public boolean isBossBarCompassEnabled() {
        return CompassBossBar;
    }

    public List<EntityType> getHpBarBlackList() {
        return HpBarBlackList;
    }

    public boolean isCompassRequireCompass() {
        return CompassRequireCompass;
    }

    public int getCompassUpdateInterval() {
        return CompassUpdateInterval;
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w) {
        return getRandomTeleport(w, false);
    }

    @Deprecated
    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
        return plugin.getRandomTeleportationManager().getRandomTeleport(w, includeDisabled);
    }

    @Deprecated
    public HashMap<String, RandomTeleport> getRandomTeleports() {
        return plugin.getRandomTeleportationManager().getRandomTeleports();
    }

    @Deprecated
    public int getRandomTeleportMaxTries() {
        return plugin.getRandomTeleportationManager().getRandomTeleportMaxTries();
    }

    @Deprecated
    public int getRandomTeleportCooldown() {
        return plugin.getRandomTeleportationManager().getRandomTeleportCooldown();
    }

    @Deprecated
    public List<Biome> getRandomTeleportExcludedBiomes() {
        return plugin.getRandomTeleportationManager().getRandomTeleportExcludedBiomes();
    }

    public List<Material> getItemLoreTypeBlackList() {
        return ItemLoreTypeBlackList;
    }

    @Deprecated
    public boolean isDisableRiptide() {
        return plugin.getElytraManager().isDisableRiptide();
    }

    public boolean isOptimizationsSimilarCommandPrevention() {
        return OptimizationsSimilarCommandPrevention;
    }

    public String getCompassShape() {
        return CompassShape;
    }

    public String getCompassColor() {
        return CompassColor;
    }

    public String getCompassHomeIcon() {
        return CompassHomeIcon;
    }

    public String getCompassSpawnIcon() {
        return CompassSpawnIcon;
    }

    public String getCompassDeathIcon() {
        return CompassDeathIcon;
    }

    public String getCompassTargetIcon() {
        return CompassTargetIcon;
    }

    public boolean isPotionEffectsDeductWhileOffline() {
        return PotionEffectsDeductWhileOffline;
    }

    public boolean isPreventEntityBoatEnterVillagers() {
        return PreventEntityBoatEnterVillagers;
    }

    public int getArmorDurabilityLossPercentage() {
        return armorDurabilityLossPercentage;
    }

    public void setArmorDurabilityLossPercentage(int armorDurabilityLossPercentage) {
        this.armorDurabilityLossPercentage = armorDurabilityLossPercentage;
    }

    public boolean isArmorDurabilityLossUse() {
        return armorDurabilityLossUse;
    }

    public void setArmorDurabilityLossUse(boolean armorDurabilityLossUse) {
        this.armorDurabilityLossUse = armorDurabilityLossUse;
    }

    public boolean isItemNameMarkChanged() {
        return ItemNameMarkChanged;
    }

    public boolean isItemLoreMarkChanged() {
        return ItemLoreMarkChanged;
    }

    public boolean isShowNewVersion() {
        return ShowNewVersion;
    }

    public boolean isSignEditBlocked(String line) {
        return signEditBlackList.contains(CMIChatColor.stripColor(line).toLowerCase());
    }

    public boolean isRecoveryRequireCompass() {
        return recoveryRequireCompass;
    }

    public boolean isRecoveryAsRegularCompass() {
        return recoveryAsRegularCompass;
    }

    public int getNetherRoofHeight() {
        return netherRoofHeight;
    }

    public boolean isInvDisableOffline() {
        return InvDisableOffline;
    }

    public boolean isMirrorBreakDisabled() {
        return MirrorBreakDisabled;
    }

    public boolean isExploitPatcherRiptide() {
        return ExploitPatcherRiptide;
    }

    public int getPlayerMailMax() {
        return PlayerMailMax;
    }

    @Deprecated
    public int getTeleportTpaMaxDistance() {
        return plugin.getTeleportManager().getTpaMaxDistance();
    }

    @Deprecated
    public int getTeleportTpaHereMaxDistance() {
        return plugin.getTeleportManager().getTpaHereMaxDistance();
    }

    @Deprecated
    public List<String> getBackBlackList() {
        return plugin.getTeleportManager().getBackBlackList();
    }

    @Deprecated
    public int getBackMinDistance() {
        return plugin.getTeleportManager().getBackMinDistance();
    }

    @Deprecated
    public boolean isSafeLocationDownThenUp() {
        return plugin.getTeleportManager().isSafeLocationDownThenUp();
    }

    @Deprecated
    public boolean isTpaCurrentLoc() {
        return plugin.getTeleportManager().isTpaCurrentLoc();
    }

    @Deprecated
    public boolean isTpahereCurrentLoc() {
        return plugin.getTeleportManager().isTpahereCurrentLoc();
    }

    @Deprecated
    public int getTeleportJumpDefault() {
        return plugin.getTeleportManager().getJumpDefaultDistance();
    }

    @Deprecated
    public HashMap<Material, Integer> getBlockedItems() {
        return plugin.getTeleportManager().getBlockedItems();
    }

    @Deprecated
    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
        return plugin.getTeleportManager().isBlackListedItemsEnabledFor(action);
    }

    @Deprecated
    public boolean isTeleportSwitchPlaces() {
        return plugin.getTeleportManager().isSwitchTeleportPlaces();
    }

    @Deprecated
    public int getTeleportTpaWarmup() {
        return plugin.getTeleportManager().getTpaWarmupTime();
    }

    @Deprecated
    public boolean isTeleportTpaMove() {
        return plugin.getTeleportManager().isTpaMove();
    }

    public boolean isAllowRconCommands() {
        return AllowRconCommands;
    }

    public boolean isPerformCommandsOnNewName() {
        return PerformCommandsOnNewName;
    }

    public List<String> getOptimizationsNameChangeCommands() {
        return OptimizationsNameChangeCommands;
    }

    public boolean isExploitPatcherCheckItem() {
        return ExploitPatcherCheckItem;
    }
}
