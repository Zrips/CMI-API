package com.Zrips.CMI;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.jar.JarFile;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.DamageControl;
import com.Zrips.CMI.Containers.RandomTeleport;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.Kits.KitsManager.CMIKitGUILayout;
import com.Zrips.CMI.Modules.tp.TpManager.TpAction;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Config {

    public static String imageFolder = CMI.getInstance().getDataFolder().getPath() + File.separator + "Images";

    private boolean ShowNewVersion = true;
    public static boolean DyeBoundToPlayer = true;
    public boolean CheckForNameChangeOnLogin = true;
    public boolean PerformCommandsOnNewName = false;
    private List<String> OptimizationsNameChangeCommands = new ArrayList<String>();
    private HashMap<String, Integer> FlyAboveRoofLimitationsMap = new HashMap<String, Integer>();
    public int CheckForNameChangeAmountToShow = 3;
    public boolean CheckForNameChangeOnInfoShow = true;
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
    public int OfflineDays;
    public int SpawnMobMaxQuantity;
    public int SpawnMobMaxPassengers;
    public double scanSoftCap;
    public double lfixSoftCap;
    public boolean fixLightOngeneration;
    private List<String> fixWorldsToFix = new ArrayList<String>();
    public boolean hungeroveride = false;
    public String Lang = "EN";

    public static boolean monochromeConsole = false;
    public static int ImmortalityOnJoin = 3;
    public boolean fileSaveAsync = false;
    private boolean PartialPlayerName = false;
    public static boolean PrioritizeOnlinePlayers = false;
//    private boolean DiscordSRVSupport = false;
    public boolean PreventDifferentCapitalizationNames = true;
    public boolean PlayTimeFromStats = false;
    public static boolean PlayTimeAutoUpdater = false;
    private boolean PreloadTopPlaytime = false;
    private List<Material> ItemLoreTypeBlackList = new ArrayList<Material>();
    private boolean ItemNameMarkChanged = false;
    private boolean ItemLoreMarkChanged = false;
    private boolean CMIPlayTimeTracking = false;

    public static List<String> PlaytimeTopExclude = new ArrayList<String>();

    private boolean RepairShareProtectNormalRepair = false;
    private boolean RepairShareProtectCommandRepair = false;
    private boolean RepairShareBypassWithPerm = true;
    private boolean RepairShareAddLore = true;
    private boolean RepairShareCancelEvent = true;
    private boolean RepairShareInformWithMessage = true;
    public static boolean ItemRepairRepairConfirmation = true;
    public static List<Integer> RepairBlockedCustomDataID = new ArrayList<Integer>();
    private int RepairShareDurability = 1;

    private boolean DisableWorldChunkCheckInfo = true;

    private boolean OnLimitedItemUseInform = true;

    private boolean PreventEntityBoatEnterAnimals = true;
    private boolean PreventEntityBoatEnterMonsters = true;
    private boolean PreventEntityBoatEnterVillagers = true;

    private boolean PreventBedExplosionNether = true;
    private boolean PreventBedExplosionTheEnd = true;
    private boolean PreventPlayersOnNetherRoof = true;
    private boolean PreventPlayersBelowBedrock = true;

    private boolean PreventIronGolemRoses = false;
    public static boolean ShowMainHelpPage = true;
    private boolean PreventHook = false;
    public static int NearDefaultDistance = 200;
    public static boolean NearCommand = false;
    public static boolean NearDirection = true;
    public static int NearCommandCount = 10;
    private boolean MulticraftDisableList = false;
    private boolean PreventExpPortals = false;
    public static boolean NoCommandsInBed = false;
    public static boolean LimitBooks = false;

//    public static boolean AttachedCommandsAllowNonEncrypted = true;
//    public static boolean AttachedCommandsEncrypt = true;
//    public static boolean AttachedCommandsOldItemConversion = true;
    public static List<String> CommandsClearExclude = new ArrayList<String>();
    public static boolean CommandsClearConfirmation = true;
    public static boolean CommandsListASCOrder = true;

    private boolean FlyAboveRoof = true;

    private boolean durabilityLossUse = true;
    private boolean armorDurabilityLossUse = true;
    private int durabilityLossPercentage = 10;
    private int armorDurabilityLossPercentage = 10;

//    private String MoneyFormat;
//    private boolean MoneyFormatSwitch;
    private String LongDateFormat;
    private String ShortDateFormat;
    private boolean SellLog;

    private int TeleportTpaWarmup;
    private boolean TeleportTpaMove;

    public int TeleportTpaTime;
    private boolean TeleportSwitchPlaces;
    private boolean TeleportCurrentLoc;
    private int TeleportJumpDefault;
//    private boolean TeleportVehicleWorkArround;
    public boolean SafeLocationDownThenUp;
//    public static boolean KickFromBed;
    public static int TeleportInvulnerability = 2;
    public static boolean TeleportToSpawnBefore;
    public static boolean TeleportDenyConfirm;
    public int TeleportTpaBlock;
    public int TeleportTpBypass;
//    public boolean TeleportMergeBack;

//    public static boolean VanishAutoDisable = false;

    private boolean PermisionOnError;
    private boolean PermisionInConsole;
    private boolean OptimizationsCommandSorting;
    private boolean OptimizationsCommandRemoveLabel;
//    private Boolean customAlias = false;

    private HashMap<CMIItemStack, String> ItemRenamingPreventMap = new HashMap<CMIItemStack, String>();
    public static boolean ItemRenamingGlobalDisable = false;

    private HashMap<World, RandomTeleport> randomTeleports = new HashMap<World, RandomTeleport>();
    private int randomTeleportCooldown = 3;
    private int randomTeleportMaxTries = 10;
    private List<Biome> randomTeleportExcludedBiomes = new ArrayList<Biome>();

    private boolean PotionEffectsDeductWhileOffline = false;

    public int IPdelay;
    public static boolean IPRecord = true;
    public static boolean helpopfeedbackMessage = true;

    public boolean LoginDisabled = false;
    public boolean LogoutDisabled = false;
    public boolean LoginCustomUse = false;
    public boolean LogoutCustomUse = false;
    public boolean FirstJoinMessageUse = false;
    private int LogoutAutoHideFrom = -1;
    private int LoginAutoHideFrom = -1;
    private int DeathMessageAutoHideFrom = -1;

    private boolean NotesShowOnAlertEvent = true;
    public static long alertTimer = 1440;

    public String TimeDay;
    public String TimeNight;
    public String TimeMorning;
    public String TimeDusk;
    public int AutoTimeInterval;
    private boolean AutoTimeSmooth;
    private int AutoTimeSmoothSpeed;

//    private boolean AliasClearBaseCommands;

    public String PlayerDataSourceFolder;
    public String PlayerDataDestinationFolder;
    public boolean PlayerDataDeleteFiles = false;
    public boolean PlayerDataEnabled = false;

    public String PlayerAdvancementsSourceFolder;
    public String PlayerAdvancementsDestinationFolder;
    public boolean PlayerAdvancementsDeleteFiles = false;
    public boolean PlayerAdvancementsEnabled = false;

    public String PlayerStatsSourceFolder;
    public String PlayerStatsDestinationFolder;
    public boolean PlayerStatsDeleteFiles = false;
    public boolean PlayerStatsEnabled = false;

    public String EssentialsSourceFolder;
    public String EssentialsDestinationFolder;
    public boolean EssentialsDeleteFiles = false;
    public boolean EssentialsEnabled = false;

    private CText Motd = null;

    public boolean LwcEnabled = false;

    public boolean CleanOnStart = false;
    public boolean SearchPurge = false;
    public boolean ScanPurge = false;

    public static boolean MuteNoPm = true;
    public boolean CuffMute = true;
    public List<String> CuffAllowed = new ArrayList<String>();
    private List<Material> GroundCleanWhiteList = new ArrayList<Material>();

    private boolean SpawnersSupportDisabled = false;
    public static int SpawnersBreakBaseDropChance = 100;
    private boolean SpawnersXpDrop = true;
    public boolean SpawnersBreakEnabled = false;
    public boolean SpawnersPlaceEnabled = false;
    public boolean SpawnersPlaceRequiresPermission = false;
    public boolean SpawnersBreakRequiresExactPermission = false;
    public boolean SpawnersPlaceRequiresExactPermission = false;
    public boolean SpawnersEggInteractRequiresPermission = false;
    public int SpawnersBreakSilkTouchLevel = 1;

    public boolean SpawnerDropFromTnt = false;
    public int SpawnerDropChanceTnt = 30;
    public boolean SpawnerDropFromCreeper = false;
    public int SpawnerDropChanceCreeper = 30;

//    public HashMap<String, List<Object>> variables = new HashMap<String, List<Object>>();

    public boolean WorldLimits = false;
    public HashMap<String, GameMode> worldGameMode = new HashMap<String, GameMode>();
    public HashMap<String, Boolean> worldFlyMode = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> worldGodMode = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> worldElytraMode = new HashMap<String, Boolean>();

    private HashMap<Material, Integer> blockedItems = new HashMap<Material, Integer>();
    private HashMap<TpAction, Boolean> BlackListedItemsEnabledFor = new HashMap<TpAction, Boolean>();

    private HashMap<String, List<SpawnReason>> blockedSpawnReasons = new HashMap<String, List<SpawnReason>>();

    private int BackMinDistance = 5;
//    public static boolean BackExcludeCommandTypeEvent = true;
    public static boolean BackWithWE = true;
    private List<String> BackBlackList = new ArrayList<String>();

    public boolean hatIgnoreLored = false;

    public boolean RemoveNegative = false;
    public List<String> RemoveNegativeEffects = new ArrayList<String>();
    private List<String> CommandSpyBlackListed = new ArrayList<String>();
    private List<String> CommandSpyCommandList = new ArrayList<String>();
    private int SpyDelayForTrigger = 1;

    public boolean ElytraBoostUseItems = false;
    public double ElytraBoostMultyplier = 0.2D;
    public double ElytraBoostSuperMultyplier = 0.6D;

    public CMIMaterial ElytraBoostItem = CMIMaterial.FEATHER;
    public CMIMaterial ElytraBoostItemConsume = CMIMaterial.STONE;
    public CMIMaterial ElytraLaunchItem = CMIMaterial.FEATHER;
    public int ElytraBoostAmount = 1;
    public int ElytraBoostSuperAmount = 5;
    public int ElytraBoostSpeedLimit = 1;
    public boolean ElytraBoostSpeedLimitStop = false;
    public boolean ElytraBoostRequiresItem = true;
    public boolean ElytraBoostShowParticles = true;
    private boolean ElytraPreventSelfDamage = true;
    public boolean ElytraPreventRocketUsage = true;
    public boolean ElytraBoostSpeedDecimals = true;
    public double ElytraLaunchTime = 2;
    private CMIParticle PointDefaultParticle = CMIParticle.COLOURED_DUST;
    private boolean disableRiptide = true;

    public int CounterRange = 10;

    private int MaxHp = 20;

    private boolean NetherPortalPreventCreation = false;
    public int NetherPortalMaxHeight = 23;
    public int NetherPortalMaxWidth = 23;

    public HashMap<DamageCause, ArrayList<DamageControl>> DamageControlMap = new HashMap<DamageCause, ArrayList<DamageControl>>();
//    private LinkedHashMap<Biome, CMIBiome> biomeNames = new LinkedHashMap<Biome, CMIBiome>();

    public int MirrorMaxRange = 50;

    public boolean ChargesUse = false;
    public boolean ChargesBreakWithoutCharge = false;
    public boolean SpawnersProximityUse = false;
    public int SpawnersProximityRange = 0;

    private CMIItemStack SelectionTool;

    private CMILocation firstSpawnPoint = null;
//    private Location spawnPoint = null;
//    private boolean RespawnLocation = false;

    private boolean ColorsPublicMessages = false;
    private boolean ColorsPrivateMessage = false;
    private boolean ChatIgnorePublicMessage = false;
    private boolean ColorsMe = false;

    private boolean ModifyChatFormat = false;
    private boolean ChatClickHoverMessages = false;
    public static boolean ChatDiscordSRV = false;
    public static String ChatDiscordSRVGlobalChannel = "global";
//    private boolean ChatDiscordSRVChangeIncomming = false;
    public static String DiscordSRVLabel = "";
    public static String DiscordSRVUnlinkedLabel = "";
    private boolean ChatDynMapChat = false;
    private boolean ChatReplyToLastMessenger = false;
    public static boolean PrivateMessagesGroups = false;
    private int LastMessengerTimeOut = 120;
    private List<String> cleanUpWhiteList;

    public static List<String> timeSpeedUpWorlds = new ArrayList<String>();
    public static List<String> InvBlackList = new ArrayList<String>();
//    public static boolean SleepingDisableVanillaMessage = false;
    public static boolean SleepingOnlyDurringNight, SleepingSpeedup, SleepingExcludeAfk, SleepingPercentage, SleepingInform;
    public static int SleepingBaseSpeed, SleepingInformDelay,
	SleepingMinBeforeSpeeding, SleepingMinSpeed;
    private boolean CompassBossBar = false;
    public static boolean CompassDefaultState = false;
    private boolean CompassRequireCompass = false;
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
    private String SleepingSpeedupInfoType;

    private int PlayerNotesExpiresIn = 30;
    private int PlayerMailExpiresIn = 30;
    private int PlayerMailAllDays = 30;

    private int DisposeUILines = 4;

    private boolean KitsGUI = true;
    private boolean KitsGUIFillEmptyFields = true;
    private CMIItemStack GUIEmptyField = null;

    private ConfigReader localeFile = null;
    private ConfigReader cfg = null;

    public static ChatFilterRule InteractiveCommandsSignRegex = new ChatFilterRule();
    public static boolean InteractiveCommandsSort = true;

    public static boolean ShowSkullOwner = true;
    public static boolean ShowBeeHive = true;
    private String ElevatorIndicator = "[CMIElevator]";
    private String ElevatorStaticIndicator = "[*]";
    private boolean maintenance = false;
    public static boolean DisableTeamManagement = false;
    private boolean AutoDownloadGeoIp = true;
    private boolean AutoDownloadGeoLiteCity = true;
    private boolean ArmorStandsCheckBlockPlace = true;
    private String maintenanceMessage = null;
    public static Boolean maintenanceBossbar = null;
    public static Boolean maintenanceAutoKick = null;

    HashMap<CMIKitGUILayout, CMIItemStack> kitButtons = new HashMap<CMIKitGUILayout, CMIItemStack>();

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
	for (String one : list) {
	    newLn(header);
	    header.append(one);
	}
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

    public boolean load(boolean isReload) {
	return true;
    }

    private void allias(String cmd, String cmiCmd, boolean enabled) {
    }

    private static DamageCause getCause(String name) {
	return null;
    }

    public static List<String> getClassesFromPackage(String pckgname, String cleaner) throws ClassNotFoundException {
	List<String> result = new ArrayList<String>();

	return result;
    }

    private static List<String> getClassesInSamePackageFromJar(String packageName, String jarPath, String cleaner) {
	JarFile jarFile = null;
	List<String> listOfCommands = new ArrayList<String>();

	return listOfCommands;
    }

    public void reload(CommandSender player) {

    }

    public boolean reloadLanguage() {
	boolean langLoaded = LoadLang("EN", true);
	return langLoaded;
    }

//    public Location getSpawnPoint() {
//	return spawnPoint;
//    }
//
//    public boolean isRespawnLocation() {
//	return RespawnLocation;
//    }

    public Location getFirstSpawnPoint() {
	return firstSpawnPoint == null ? null : firstSpawnPoint.clone();
    }

    public boolean isModifyChatFormat() {
	return ModifyChatFormat;
    }

    public boolean isChatClickHoverMessages() {
	return ChatClickHoverMessages;
    }

    public boolean isColorsPublicMessages() {
	return ColorsPublicMessages;
    }

    public boolean isColorsPrivateMessage() {
	return ColorsPrivateMessage;
    }

    public ConfigReader getConfig() {
	return cfg;
    }

    public long getPlayerNotesExpiresIn() {
	return PlayerNotesExpiresIn * 24L * 60L * 60L * 1000L;
    }

    public long getPlayerMailExpiresIn() {
	return PlayerMailExpiresIn * 24L * 60L * 60L * 1000L;
    }

    public boolean isKitsGUI() {
	return KitsGUI;
    }

    public boolean isKitsGUIFillEmptyFields() {
	return KitsGUIFillEmptyFields;
    }

    public HashMap<Material, Integer> getBlockedItems() {
	return blockedItems;
    }

    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
	if (!BlackListedItemsEnabledFor.containsKey(action))
	    return false;
	return BlackListedItemsEnabledFor.get(action);
    }

//    public Boolean isCustomAliasEnabled() {
//	return customAlias;
//    }

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

    public boolean isTeleportSwitchPlaces() {
	return TeleportSwitchPlaces;
    }

    public boolean isOnLimitedItemUseInform() {
	return OnLimitedItemUseInform;
    }

    public boolean isRepairShareProtectNormalRepair() {
	return RepairShareProtectNormalRepair;
    }

    public int getRepairShareDurability() {
	return RepairShareDurability;
    }

    public boolean isRepairShareAddLore() {
	return RepairShareAddLore;
    }

    public boolean isRepairShareCancelEvent() {
	return RepairShareCancelEvent;
    }

    public boolean isRepairShareInformWithMessage() {
	return RepairShareInformWithMessage;
    }

    public boolean isRepairShareProtectCommandRepair() {
	return RepairShareProtectCommandRepair;
    }

    public int getDisposeUILines() {
	return DisposeUILines;
    }

    public int getMaxHp() {
	return MaxHp > 2048 ? 2048 : MaxHp;
    }

    public boolean isNotesShowOnAlertEvent() {
	return NotesShowOnAlertEvent;
    }

    public boolean isRepairShareBypassWithPerm() {
	return RepairShareBypassWithPerm;
    }

    public boolean isPreventExpPortals() {
	return PreventExpPortals;
    }

    public ConfigReader getLocaleConfig() {
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

    public int getVisualizerSidesCap() {
	return 1000;
    }

    public int getVisualizerFrameCap() {
	return 1000;
    }

    public CMIParticle getSelectedSpigotSides() {
	return CMIParticle.COLOURED_DUST;
//	return null;
    }

    public CMIParticle getSelectedSpigotFrame() {
	return CMIParticle.HAPPY_VILLAGER;
//	return null;
    }

    public long getVisualizerShowFor() {
	return 60 * 1000L;
    }

    public long getVisualizerUpdateInterval() {
	return 10L;
    }

    public CMIItemStack getSelectionTool() {
	return SelectionTool;
    }

    public CMIItemStack getGUIEmptyField() {
	return GUIEmptyField;
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

    public boolean isChatIgnorePublicMessage() {
	return ChatIgnorePublicMessage;
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

    public int getTeleportTpaWarmup() {
	return TeleportTpaWarmup;
    }

    public boolean isTeleportTpaMove() {
	return TeleportTpaMove;
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

    public List<String> getCleanUpWhiteList() {
	return cleanUpWhiteList;
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

    public boolean isSpawnersSupportDisabled() {
	return SpawnersSupportDisabled;
    }

    public boolean isTeleportCurrentLoc() {
	return TeleportCurrentLoc;
    }

    public int getTeleportJumpDefault() {
	return TeleportJumpDefault;
    }

    public String getBooksDefaultAuthor() {
	return BooksDefaultAuthor;
    }

    public boolean isChatReplyToLastMessenger() {
	return ChatReplyToLastMessenger;
    }

    public int getLastMessengerTimeOut() {
	return LastMessengerTimeOut;
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

    public int getBackMinDistance() {
	return BackMinDistance;
    }

    public boolean isColorsMe() {
	return ColorsMe;
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

    public boolean isSpawnersXpDrop() {
	return SpawnersXpDrop;
    }

    public boolean isSafeLocationDownThenUp() {
	return SafeLocationDownThenUp;
    }

    public int getLogoutAutoHideFrom() {
	return LogoutAutoHideFrom;
    }

    public int getLoginAutoHideFrom() {
	return LoginAutoHideFrom;
    }

    public int getDeathMessageAutoHideFrom() {
	return DeathMessageAutoHideFrom;
    }

    public boolean isAutoDownloadGeoIp() {
	return AutoDownloadGeoIp;
    }

    public boolean isAutoDownloadGeoLiteCity() {
	return AutoDownloadGeoLiteCity;
    }

    public boolean isChatDynMapChat() {
	return ChatDynMapChat;
    }

    public boolean isPreloadTopPlaytime() {
	return PreloadTopPlaytime;
    }

    public List<String> getOptimizationsNameChangeCommands() {
	return OptimizationsNameChangeCommands;
    }

    public boolean isElytraPreventSelfDamage() {
	return ElytraPreventSelfDamage;
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

    public CMIItemStack getKitPreviewIcon(CMIKitGUILayout type) {
	return kitButtons.get(type) == null ? new CMIItemStack(new ItemStack(Material.STONE)) : kitButtons.get(type);
    }

    public String getSleepingSpeedupInfoType() {
	return SleepingSpeedupInfoType;
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

    public RandomTeleport getRandomTeleport(World w) {
	return getRandomTeleport(w, false);
    }

    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
	RandomTeleport rt = randomTeleports.get(w);
	return rt == null ? null : randomTeleports.get(w).isEnabled() ? rt : includeDisabled ? rt : null;
    }

    public HashMap<World, RandomTeleport> getRandomTeleports() {
	return randomTeleports;
    }

    public int getRandomTeleportMaxTries() {
	return randomTeleportMaxTries;
    }

    public int getRandomTeleportCooldown() {
	return randomTeleportCooldown;
    }

    public List<Biome> getRandomTeleportExcludedBiomes() {
	return randomTeleportExcludedBiomes;
    }

    public List<Material> getItemLoreTypeBlackList() {
	return ItemLoreTypeBlackList;
    }

    public boolean isDisableRiptide() {
	return disableRiptide;
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

    public boolean isArmorStandsCheckBlockPlace() {
	return ArmorStandsCheckBlockPlace;
    }

    public List<String> getBackBlackList() {
	return BackBlackList;
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
}
