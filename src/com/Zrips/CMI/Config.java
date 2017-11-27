package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Containers.DamageControl;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.tp.TpManager.TpAction;

public class Config {
    public boolean ShowNewVersion = true;
    public boolean CheckForNameChangeOnLogin = true;
    public int CheckForNameChangeAmountToShow = 3;
    public boolean CheckForNameChangeOnInfoShow = true;
    public boolean VaultMoney = true;

    private boolean OverrideLoginMessage = true;

    public boolean VaultGroup = true;
    public boolean GlobalRangeByDefault = false;
    public boolean DynamicViewRangeEnabled = false;
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
    List<String> HelpPage = new ArrayList<String>();
    private YamlConfiguration locale;
    private CommentedYamlConfiguration localeWriter;
    public String Lang = "EN";
    public boolean fileSaveAsync = false;
    public boolean AutoNameComplete = false;
    public boolean PreventDifferentCapitalizationNames = true;
    public boolean PlayTimeFromStats = false;

    private boolean RepairShareProtectNormalRepair = false;
    private boolean RepairShareProtectCommandRepair = false;
    private boolean RepairShareBypassWithPerm = true;
    private boolean RepairShareAddLore = true;
    private boolean RepairShareCancelEvent = true;
    private boolean RepairShareInformWithMessage = true;
    private int RepairShareDurability = 1;

    private boolean DisableWorldChunkCheckInfo = true;

    private boolean OnLimitedItemUseInform = true;

    private boolean ExploitPatcherPreventItemPickup = true;

    private boolean PreventEntityBoatEnterAnimals = true;
    private boolean PreventEntityBoatEnterMonsters = true;

    private boolean PreventBedExplosionNether = true;
    private boolean PreventBedExplosionTheEnd = true;
    private boolean PreventPlayersOnNetherRoof = true;

    private boolean PreventIronGolemRoses = false;
    private boolean MulticraftDisableList = false;
    private boolean PreventExpPortals = false;

    private boolean durabilityLossUse = true;
    private int durabilityLossPercentage = 10;

    private String MoneyFormat;

    private int TeleportTpaWarmup;
    private boolean TeleportTpaMove;

    public int TeleportTpaTime;
    private boolean TeleportSwitchPlaces;
    private boolean TeleportVehicleWorkArround;
    public int TeleportTpaBlock;
    public int TeleportTpBypass;
    public boolean TeleportMergeBack;

    private boolean PermisionOnError;
    private boolean OptimizationsCommandSorting;
//    private Boolean customAlias = false;

    private HashMap<CMIItemStack, String> ItemRenamingPreventMap = new HashMap<CMIItemStack, String>();

    public int IPdelay;

    public boolean LoginDisabled = false;
    public boolean LogoutDisabled = false;
    public boolean LoginCustomUse = false;
    public boolean LogoutCustomUse = false;
    public boolean FirstJoinMessageUse = false;

    private boolean NotesShowOnAlertEvent = true;

    public String TimeDay;
    public String TimeNight;
    public String TimeMorning;
    public String TimeDusk;
    public int AutoTimeInterval;

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

    public boolean CuffMute = true;
    public List<String> CuffAllowed = new ArrayList<String>();

    public boolean SpawnersBreakEnabled = false;
    public boolean SpawnersPlaceEnabled = false;
    public boolean SpawnersPlaceRequiresPermission = false;
    public boolean SpawnersPlaceRequiresExactPermission = false;
    public boolean SpawnersEggInteractRequiresPermission = false;
    public int SpawnersBreakSilkTouchLevel = 1;

    public boolean SpawnerDropFromTnt = false;
    public int SpawnerDropChanceTnt = 30;
    public boolean SpawnerDropFromCreeper = false;
    public int SpawnerDropChanceCreeper = 30;

    public boolean enchantLimitEnabled = true;

    public HashMap<String, List<Object>> variables = new HashMap<String, List<Object>>();

    public boolean WorldLimits = false;
    public HashMap<String, GameMode> worldGameMode = new HashMap<String, GameMode>();
    public HashMap<String, Boolean> worldFlyMode = new HashMap<String, Boolean>();
    public HashMap<String, Boolean> worldGodMode = new HashMap<String, Boolean>();

    private HashMap<Material, Integer> blockedItems = new HashMap<Material, Integer>();
    private HashMap<TpAction, Boolean> BlackListedItemsEnabledFor = new HashMap<TpAction, Boolean>();

    public boolean RemoveNegative = false;
    public List<String> RemoveNegativeEffects = new ArrayList<String>();
    private List<String> CommandSpyBlackListed = new ArrayList<String>();
    private int SpyDelayForTrigger = 1;

    public boolean ElytraBoostUseItems = false;
    public double ElytraBoostMultyplier = 0.2D;
    public double ElytraBoostSuperMultyplier = 0.6D;

    public CMIItemStack ElytraBoostItem = new CMIItemStack(Material.FEATHER);
    public int ElytraBoostAmount = 1;
    public int ElytraBoostSuperAmount = 5;
    public int ElytraBoostSpeedLimit = 1;
    public boolean ElytraBoostSpeedLimitStop = false;
    public boolean ElytraBoostRequiresItem = true;
    public boolean ElytraBoostShowParticles = true;
    public boolean ElytraBoostSpeedDecimals = true;
    public int ElytraLaunchTime = 2;

    public int CounterRange = 10;

    private int MaxHp = 20;

    private boolean NetherPortalPreventCreation = false;
    public int NetherPortalMaxHeight = 23;
    public int NetherPortalMaxWidth = 23;

    public HashMap<DamageCause, ArrayList<DamageControl>> DamageControlMap = new HashMap<DamageCause, ArrayList<DamageControl>>();

    public int MirrorMaxRange = 50;

    public boolean ChargesUse = false;
    public boolean ChargesBreakWithoutCharge = false;
    public boolean SpawnersProximityUse = false;
    public int SpawnersProximityRange = 0;

    private CMIItemStack SelectionTool;

    private Location firstSpawnPoint = null;
    private Location spawnPoint = null;
    private boolean RespawnLocation = false;

    private boolean TotemRemoveFromInventory = false;
    private boolean TotemCooldownUse = false;
    private boolean TotemWarmupUse = false;
    private int TotemCooldownTime = -1;
    private int TotemWarmupTime = -1;

    private boolean ColorsPublicMessages = false;
    private boolean ColorsPrivateMessage = false;
    private boolean ChatIgnorePublicMessage = false;
    private boolean ModifyChatFormat = false;
    private boolean ChatClickHoverMessages = false;

    private int PlayerNotesExpiresIn = 30;
    private int PlayerMailExpiresIn = 30;

    private int DisposeUILines = 4;

    private boolean KitsGUI = true;
    private boolean KitsGUIFillEmptyFields = true;
    private CMIItemStack GUIEmptyField = null;

    private ConfigReader c = null;
    private ConfigReader cfg = null;

    private boolean maintenance = false;
    private String maintenanceMessage = null;

    private CMI plugin;

    public Config(CMI plugin) {
	this.plugin = plugin;
    }

    public String LangConfig(FileConfiguration fileConfig, String configValue, String text, boolean colorize) {
	return "";
    }

    public void ChangeConfig(String path, Object list) {
    }

    public int GetConfigValue(String path) {
	return 0;
    }

    public String GetConfig(String path, String text, CommentedYamlConfiguration writer, YamlConfiguration conf, Boolean colorize) {
	return null;
    }

    public List<String> GetConfig(String path, List<String> text, CommentedYamlConfiguration writer, YamlConfiguration conf, Boolean colorize) {
	return null;
    }

    public Boolean GetConfig(String path, Boolean text, CommentedYamlConfiguration writer, YamlConfiguration conf) {
	return null;
    }

    public int GetConfig(String path, int text, CommentedYamlConfiguration writer, YamlConfiguration conf) {
	return 0;
    }

    public Double GetConfig(String path, Double text, CommentedYamlConfiguration writer, YamlConfiguration conf) {
	return null;
    }

    public List<String> ColorsArray(List<String> text, Boolean colorize) {
	return null;
    }

    public String Colors(String text) {
	return null;
    }

    public List<String> GetConfigArray(String path, List<String> text, Boolean colorize) {
	return null;
    }

    public String GetConfigString(String path, String text, Boolean colorize) {
	return null;
    }

    public String Get(String key) {
	return null;
    }

    private synchronized static void copySetting(Configuration reader, Configuration writer, String path) {
    }

    private static void newLn(StringBuilder header) {
    }

    private static StringBuilder formStringBuilder(List<String> list) {
	return null;
    }

    // Language file
    public void LoadLang(String lang) {

    }

    public void load() {

    }

    private void allias(String cmd, String cmiCmd, boolean enabled) {
    }

    private static DamageCause getCause(String name) {
	return null;
    }

    public static List<String> getClassesFromPackage(String pckgname, String cleaner) throws ClassNotFoundException {
	return null;
    }

    private static List<String> getClassesInSamePackageFromJar(String packageName, String jarPath, String cleaner) {

	return null;
    }

    public void copyOverTranslations() {
    }

    public void reload(CommandSender player) {

    }

    public Location getSpawnPoint() {
	return spawnPoint;
    }

    public boolean isRespawnLocation() {
	return RespawnLocation;
    }

    public Location getFirstSpawnPoint() {
	return firstSpawnPoint;
    }

    public boolean isTotemRemoveFromInventory() {
	return TotemRemoveFromInventory;
    }

    public boolean isTotemCooldownUse() {
	return TotemCooldownUse;
    }

    public boolean isTotemWarmupUse() {
	return TotemWarmupUse;
    }

    public int getTotemCooldownTime() {
	return TotemCooldownTime;
    }

    public int getTotemWarmupTime() {
	return TotemWarmupTime;
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

    public boolean isDurabilityLossUse() {
	return durabilityLossUse;
    }

    public int getDurabilityLossPercentage() {
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

    public boolean isExploitPatcherPreventItemPickup() {
	return ExploitPatcherPreventItemPickup;
    }

    public boolean isPreventExpPortals() {
	return PreventExpPortals;
    }

    public ConfigReader getLocaleConfig() {
	return c;
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

    public Effect getSelectedSpigotSides() {
	return Effect.COLOURED_DUST;
    }

    public Effect getSelectedSpigotFrame() {
	return Effect.HAPPY_VILLAGER;
    }

    public long getVisualizerShowFor() {
	return 60 * 1000;
    }

    public long getVisualizerUpdateInterval() {
	return 10;
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

    public String getMoneyFormat() {
	return MoneyFormat;
    }

    public int getSpyDelayForTrigger() {
	return SpyDelayForTrigger;
    }

    public boolean isTeleportVehicleWorkArround() {
	return TeleportVehicleWorkArround;
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

}
