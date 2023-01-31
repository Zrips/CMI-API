package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.Language;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Alias.AliasManager;
import com.Zrips.CMI.Modules.Animations.AnimationManager;
import com.Zrips.CMI.Modules.Anvil.AnvilManager;
import com.Zrips.CMI.Modules.ArmorEffects.ArmorEffectManager;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager;
import com.Zrips.CMI.Modules.BungeeCord.BungeeCordManager;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager;
import com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager;
import com.Zrips.CMI.Modules.ChatTag.TagManager;
import com.Zrips.CMI.Modules.ChunkPreview.ChunkPreview;
import com.Zrips.CMI.Modules.CmdCooldown.CooldownManager;
import com.Zrips.CMI.Modules.CmdCost.CMICommandCostManager;
import com.Zrips.CMI.Modules.CmdWarmUp.WarmUpManager;
import com.Zrips.CMI.Modules.CustomText.CTextManager;
import com.Zrips.CMI.Modules.DataBase.DBClassLoader;
import com.Zrips.CMI.Modules.DataBase.DBManager;
import com.Zrips.CMI.Modules.DeathMessages.DeathMessageManager;
import com.Zrips.CMI.Modules.DiscordSRV.DiscordSRVManager;
import com.Zrips.CMI.Modules.DynMap.DynMapManager;
import com.Zrips.CMI.Modules.DynamicSigns.SignManager;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.Enchants.EnchantManager;
import com.Zrips.CMI.Modules.EventActions.EventActionManager;
import com.Zrips.CMI.Modules.FindBiome.FindBiomeManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightChargeManager;
import com.Zrips.CMI.Modules.GeoIP.LookupService;
import com.Zrips.CMI.Modules.Holograms.HologramManager;
import com.Zrips.CMI.Modules.Homes.HomeManager;
import com.Zrips.CMI.Modules.InteractiveCommand.CitizensManager;
import com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandManager;
import com.Zrips.CMI.Modules.InvEndEditor.EnderChestManager;
import com.Zrips.CMI.Modules.InvRegEditor.RegChestManager;
import com.Zrips.CMI.Modules.Ips.IpManager;
import com.Zrips.CMI.Modules.Jail.JailManager;
import com.Zrips.CMI.Modules.Kits.KitsManager;
import com.Zrips.CMI.Modules.LightFix.LightFix;
import com.Zrips.CMI.Modules.Mirror.MirrorManager;
import com.Zrips.CMI.Modules.NickName.NickNameManager;
import com.Zrips.CMI.Modules.Painting.PaintingManager;
import com.Zrips.CMI.Modules.Particl.ParticleManager;
import com.Zrips.CMI.Modules.Patrol.PatrolManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.Placeholders.Placeholder;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager;
import com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsManager;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager;
import com.Zrips.CMI.Modules.PlayerOptions.PlayerOptionsManager;
import com.Zrips.CMI.Modules.Portals.PortalManager;
import com.Zrips.CMI.Modules.Ranks.RankManager;
import com.Zrips.CMI.Modules.Recipes.RecipeManager;
import com.Zrips.CMI.Modules.Region.WorldManager;
import com.Zrips.CMI.Modules.ReplaceBlock.ReplaceBlock;
import com.Zrips.CMI.Modules.SavedInv.SavedInventoryManager;
import com.Zrips.CMI.Modules.SavedItems.SavedItemManager;
import com.Zrips.CMI.Modules.Scan.Scan;
import com.Zrips.CMI.Modules.Scavenger.ScavengeManager;
import com.Zrips.CMI.Modules.Search.Search;
import com.Zrips.CMI.Modules.Selection.SelectionManager;
import com.Zrips.CMI.Modules.Sheduler.SchedulerManager;
import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxManager;
import com.Zrips.CMI.Modules.Skin.SkinManager;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeManager;
import com.Zrips.CMI.Modules.SpecializedCommands.SpecializedCommandManager;
import com.Zrips.CMI.Modules.Statistics.StatsManager;
import com.Zrips.CMI.Modules.TabList.TabListHeaderFooterHandler;
import com.Zrips.CMI.Modules.TabList.TabListManager;
import com.Zrips.CMI.Modules.TimedCommands.TimedCommandManager;
import com.Zrips.CMI.Modules.Totems.TotemManager;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import com.Zrips.CMI.Modules.ViewRange.ViewRangeManager;
import com.Zrips.CMI.Modules.Votifier.VotifierManager;
import com.Zrips.CMI.Modules.Warnings.WarningManager;
import com.Zrips.CMI.Modules.Warps.WarpManager;
import com.Zrips.CMI.Modules.Worth.WorthManager;
import com.Zrips.CMI.Modules.tp.Teleportations;
import com.Zrips.CMI.Modules.tp.TpManager;
import com.Zrips.CMI.NBT.NMS;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.utils.ChunkFix;
import com.Zrips.CMI.utils.Lag;
import com.Zrips.CMI.utils.PrevNamesFetcher;
import com.Zrips.CMI.utils.Purge;
import com.Zrips.CMI.utils.TimeManager;
import com.Zrips.CMI.utils.UnloadChunks;
import com.Zrips.CMI.utils.Util;
import com.Zrips.CMI.utils.VersionChecker;

import net.Zrips.CMILib.Container.PageInfo;
import net.Zrips.CMILib.GUI.GUIManager;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Util.Sorting;
import net.milkbowl.vault.permission.Permission;

public class CMI extends JavaPlugin {

    public static final String configFolderName = "Settings";
    public static final String savesFolderName = "Saves";

    private boolean fullyLoaded = false;
    protected NMS nms;
    protected Reflections ref;
    private boolean useProtocollib = false;
    private boolean VaultPermEnabled = false;
    private boolean PlayerVaultXEnabled = false;
    private boolean PlayerVaultEnabled = false;
    private boolean PlayerVaultNBTEnabled = false;
    private boolean PlaceholderAPIEnabled = false;
    private boolean MVdWPlaceholderAPIEnabled = false;
    private boolean VotifierEnabled = false;
    private boolean CitizensEnabled = false;
    private boolean NCPEnabled = false;

    private Placeholder Placeholder;

    private Permission perms = null;

    public static String bugReportLink = "https://github.com/Zrips/CMI/issues/new?assignees=&labels=bug+report&template=bug_report.md&title=";
    private long serverStartupTime = 0L;

    private String worldFolderPath;
    protected SavedItemManager SavedItemManager;
    protected PlayTimeManager PlayTimeManager;
    protected CommandsHandler cManager;
    protected LightFix LightFixManager;
    protected ChunkPreview ChunkPreviewManager;
    protected ViewRangeManager ViewRangeManager;
    protected DiscordSRVManager DiscordSRVManager;
    protected Purge PurgeManager;
    protected Search SearchManager;
    protected Scan ScanManager;
    protected ChunkFix ChunkFixManager;
    protected ReplaceBlock replaceblock;
    protected UnloadChunks unloadchunks;

    protected SkinManager SkinManager;
    protected Util UtilManager;

    protected Config config;
    protected Language languageManager;
    protected ScavengeManager scavengeManager;
    protected VersionChecker versionCheckManager;
    protected PlayTimeRewardsManager PlayTimeRewardsManager;
    protected TimeManager TimeManager;
    protected PrevNamesFetcher NamesChecker;
    protected MirrorManager mirror;
    protected KitsManager kits;
    protected SpawnerChargeManager charges;
    protected ParticleManager ParticleManager;
    protected FlightChargeManager FlightChargeManager;

    private ArmorEffectManager armorEffectManager;

    protected PaintingManager PaintingManager;
    protected VanishManager VanishManager;
    protected PlayerOptionsManager PlayerOptionsManager;
    protected InteractiveCommandManager InteractiveCommandManager;
    protected SpecializedCommandManager SpecializedCommandManager;
    protected ArmorStandManager ArmorStandManager;
    protected LookupService LookupService;
    protected DynMapManager DynMapManager;
    protected WorthManager WorthManager;
    protected JailManager JailManager;
    protected WarningManager WarningManager;
    protected com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager PlayerCombatManager;

    private EconomyManager economyManager;

    protected EnderChestManager EnderChestManager;
    protected RegChestManager RegChestManager;
    protected VotifierManager VotifierManager;
    protected CitizensManager CitizensManager;

    protected AfkManager AfkManager;

    protected TabListManager TabListManager;
    protected TabListHeaderFooterHandler TabListHandler;

    protected RecipeManager RecipeManager;

    protected PortalManager portalManager;
    protected SignManager signManager;
    protected HologramManager HologramManager;
    protected SelectionManager SelectionManager;

    protected CMICommandCostManager CMICommandCostManager;
    protected CooldownManager cooldownManager;
    protected WarmUpManager WarmUpManager;

    protected WorldManager regionManager;

    protected TotemManager totemManager;
    protected AnimationManager AnimationManager;

    protected ChatFormatManager ChatFormatManager;

    protected ShulkerBoxManager shulkerBoxManager;

    protected SchedulerManager schedulerManager;
    protected EnchantManager EnchantManager;

    protected AnvilManager anvilManager;

    protected TimedCommandManager timedCommandManager;

    protected PermissionsManager permissionsManager;
    protected DeathMessageManager DeathMessageManager;

    protected TagManager TagManager;
    protected NickNameManager nickNameManager;
    protected HomeManager homeManager;
    protected WarpManager warpManager;
    protected IpManager ipManager;
    protected TpManager tpManager;

    protected Teleportations teleportations;
    protected StatsManager statsManager;
    protected AliasManager aliasManager;
    protected CTextManager cTextManager;

    protected EventActionManager eventActionManager;

    protected CustomNBTManager CustomNBTManager;

    protected FindBiomeManager findBiomeManager;

    protected ChatFilterManager chatFilterManager;
    protected GUIManager GUIManager;
    protected SavedInventoryManager SavedInventoryManager;
    protected PatrolManager PatrolManager;

    private DBManager dbManager;
    private RankManager rankManager;

    private Lag lagMeter;

//    protected ActionBarManager ActionBar;
//    protected ActionBar legacyActionBar;
//    protected TitleMessageManager titleMessageManager;

    protected PlayerManager PM;
    protected Sorting Sorting;

    private TabComplete tab;

    private long timer = 0L;

    private boolean mcmmoexpmodulepresent = false;
    private boolean jobsPresent = false;

    protected HashMap<String, List<String>> preFetchNames = new HashMap<String, List<String>>();
    protected HashMap<String, UUID> preFetchUUIDs = new HashMap<String, UUID>();
    private static final UUID ServerUUID = new UUID(0, 0);

    protected static CMI instance;

    public String prefix = ChatColor.GOLD + "[CMI] " + ChatColor.DARK_AQUA;

    protected Scoreboard scoreboard = null;

    protected String getWorldFolderPath() {
        return worldFolderPath;
    }

    public static CMI getInstance() {
        return instance;
    }

    private DBClassLoader classLoader;

    public DBClassLoader getDBClassloader() {
        return classLoader;
    }

    public void setDBClassloader() {
        classLoader = new DBClassLoader(this);
    }

    public HashMap<String, List<String>> preFetchNames() {
        return preFetchNames;
    }

    public HashMap<String, UUID> preFetchUUIDS() {
        return preFetchUUIDs;
    }

    public NMS getNMS() {
        return nms;
    }

    @Deprecated
    public Reflections getRef() {
        return getReflectionManager();
    }

    public Reflections getReflectionManager() {
        if (ref == null)
            ref = new Reflections(this);
        return ref;
    }

    public MirrorManager getMirrorManager() {
        return mirror;
    }

    public LookupService getLookupService() {
        return null;
    }

    public void defaultLocaleDownloader() {
    }

    public DiscordSRVManager getDiscordSRVManager() {
        return DiscordSRVManager;
    }

    public ArmorStandManager getArmorStandManager() {
        return ArmorStandManager;
    }

    public PlayerCombatManager getPlayerCombatManager() {
        return PlayerCombatManager;
    }

    public DynMapManager getDynMapManager() {
        return DynMapManager;
    }

    public WarningManager getWarningManager() {
        return WarningManager;
    }

    public EnchantManager getEnchantManager() {
        return EnchantManager;
    }

    public VotifierManager getVotifierManager() {
        return VotifierManager;
    }

    public CitizensManager getCitizensManager() {
        return CitizensManager;
    }

    public SpecializedCommandManager getSpecializedCommandManager() {
        return SpecializedCommandManager;
    }

    public InteractiveCommandManager getInteractiveCommandManager() {
        return InteractiveCommandManager;
    }

    public ChatFormatManager getChatFormatManager() {
        return ChatFormatManager;
    }

    public KitsManager getKitsManager() {
        return kits;
    }

    public SpawnerChargeManager getSpawnerChargesManager() {
        return charges;
    }

    public SkinManager getSkinManager() {
        return SkinManager;
    }

    public RecipeManager getRecipeManager() {
        return RecipeManager;
    }

    public PaintingManager getPaintingManager() {
        return PaintingManager;
    }

    public VanishManager getVanishManager() {
        return VanishManager;
    }

    public PlayerOptionsManager getPlayerOptionsManager() {
        return PlayerOptionsManager;
    }

    public ParticleManager getParticleManager() {
        return ParticleManager;
    }

    public DeathMessageManager getDeathMessageManager() {
        return DeathMessageManager;
    }

    public FlightChargeManager getFlightChargeManager() {
        return FlightChargeManager;
    }

    public Lag getLagMeter() {
        return lagMeter;
    }

    public EnderChestManager getEnderChestManager() {
        return EnderChestManager;
    }

    public RegChestManager getRegChestManager() {
        return RegChestManager;
    }

    public HologramManager getHologramManager() {
        return HologramManager;
    }

    public EconomyManager getEconomyManager() {
        return economyManager;
    }

    public CMICommandCostManager getCommandCostManager() {
        return CMICommandCostManager;
    }

    public CooldownManager getCooldownManager() {
        return cooldownManager;
    }

    public PortalManager getPortalManager() {
        return portalManager;
    }

    public SignManager getSignManager() {
        return signManager;
    }

    public SelectionManager getSelectionManager() {
        return SelectionManager;
    }

    public ArmorEffectManager getArmorEffectManager() {
        return armorEffectManager;
    }

    public WarmUpManager getWarmUpManager() {
        return WarmUpManager;
    }

    public WorldManager getRegionManager() {
        return regionManager;
    }

    public ShulkerBoxManager getShulkerBoxManager() {
        return shulkerBoxManager;
    }

    public TimedCommandManager getTimedCommandManager() {
        return timedCommandManager;
    }

    public PermissionsManager getPermissionsManager() {
        return permissionsManager;
    }

    public NickNameManager getNickNameManager() {
        return nickNameManager;
    }

    public TagManager getTagManager() {
        return TagManager;
    }

    public WarpManager getWarpManager() {
        return warpManager;
    }

    public IpManager getIpManager() {
        return ipManager;
    }

    public PlayTimeRewardsManager getPlayTimeRewardManager() {
        return PlayTimeRewardsManager;
    }

    public TpManager getTpManager() {
        return tpManager;
    }

    public Teleportations getTeleportations() {
        return teleportations;
    }

    public StatsManager getStatsManager() {
        return statsManager;
    }

    public JailManager getJailManager() {
        return JailManager;
    }

    public WorthManager getWorthManager() {
        return WorthManager;
    }

    public AliasManager getAliasManager() {
        return aliasManager;
    }

    public AfkManager getAfkManager() {
        return AfkManager;
    }

    public TabListHeaderFooterHandler getTabListHandler() {
        return TabListHandler;
    }

    public TabListManager getTabListManager() {
        return TabListManager;
    }

    public CTextManager getCTextManager() {
        return cTextManager;
    }

    public CustomNBTManager getCustomNBTManager() {
        return CustomNBTManager;
    }

    public EventActionManager getEventActionManager() {
        return eventActionManager;
    }

    public HomeManager getHomeManager() {
        return homeManager;
    }

    public SchedulerManager getSchedulerManager() {
        return schedulerManager;
    }

    public AnvilManager getAnvilManager() {
        return anvilManager;
    }

    public TotemManager getTotemManager() {
        return totemManager;
    }

    public AnimationManager getAnimationManager() {
        return AnimationManager;
    }

    public FindBiomeManager getFindBiomeManager() {
        return findBiomeManager;
    }

    public ChatFilterManager getChatFilterManager() {
        return chatFilterManager;
    }

    public SavedInventoryManager getSavedInventoryManager() {
        return SavedInventoryManager;
    }

    BungeeCordManager BungeeCordManager;

    public BungeeCordManager getBungeeCordManager() {
        return BungeeCordManager;
    }

    public PatrolManager getPatrolManager() {
        return PatrolManager;
    }

    public RankManager getRankManager() {
        return rankManager;
    }

    public PlayerManager getPlayerManager() {
        return PM;
    }

    public Sorting getSortingManager() {
        return Sorting;
    }

    public PrevNamesFetcher getNamesChecker() {
        return NamesChecker;
    }

    public TimeManager getTimeManager() {
        return TimeManager;
    }

    public VersionChecker getVersionCheckManager() {
        return versionCheckManager;
    }

    public CommandsHandler getCommandManager() {
        return cManager;
    }

    public SavedItemManager getSavedItemManager() {
        return SavedItemManager;
    }

    public PlayTimeManager getPlayTimeManager() {
        return PlayTimeManager;
    }

    public LightFix getLightFixManager() {
        return LightFixManager;
    }

    public ChunkPreview getChunkPreviewManager() {
        return ChunkPreviewManager;
    }

    public ViewRangeManager getViewRangeManager() {
        return ViewRangeManager;
    }

    public Search getSearchManager() {
        return SearchManager;
    }

    public Scan getScanManager() {
        return ScanManager;
    }

    public ChunkFix getChunkFixManager() {
        return ChunkFixManager;
    }

    public ReplaceBlock getReplaceBlockManager() {
        return replaceblock;
    }

    public UnloadChunks getUnloadChunksManager() {
        return unloadchunks;
    }

    public Purge getPurgeManager() {
        return PurgeManager;
    }

    public Util getUtilManager() {
        return UtilManager;
    }

    public Config getConfigManager() {
        return config;
    }

    public ScavengeManager getScavengeManager() {
        return scavengeManager;
    }

    public DBManager getDbManager() {
        return dbManager;
    }

    public Language getLM() {
        return languageManager;
    }

    @Override
    public void onDisable() {

    }

    int lagId = -1;

    public Scoreboard getSB() {
        return scoreboard;
    }

    public void renameDirectory(String fromDir, String toDir) {
    }

    public void Enabled(boolean state) {
        this.setEnabled(state);
    }

    List<String> logo = new ArrayList<String>(Arrays.asList(

        "&7┏━━━┓ &f┏━┓┏━┓ &7┏━━┓",
        "&7┃┏━┓┃ &f┃ ┗┛ ┃ &7┗┫┣┛",
        "&7┃┃ ┗┛ &f┃┏┓┏┓┃ &7 ┃┃ ",
        "&7┃┃ ┏┓ &f┃┃┃┃┃┃ &7 ┃┃ ",
        "&7┃┗━┛┃ &f┃┃┃┃┃┃ &7┏┫┣┓",
        "&7┗━━━┛ &f┗┛┗┛┗┛ &7┗━━┛",
        "&7_______________________________________________________"

    ));

    List<String> SpigotLogo = new ArrayList<String>(Arrays.asList(
        "┏━━━┓ ┏━┓┏━┓ ┏━━┓",
        "┃┏━┓┃ ┃ ┗┛ ┃ ┗┫┣┛",
        "┃┃ ┗┛ ┃┏┓┏┓┃  ┃┃ ",
        "┃┃ ┏┓ ┃┃┃┃┃┃  ┃┃ ",
        "┃┗━┛┃ ┃┃┃┃┃┃ ┏┫┣┓",
        "┗━━━┛ ┗┛┗┛┗┛ ┗━━┛",
        "_______________________________________________________"));

    private int lastCMILibVersion = 1000100;
    private int requiredCMILibVersion = 1000100;
    private final String slastCMILibVersion = "1.0.1.0";
    private final String srequiredCMILibVersion = "1.0.1.0";
    public static int cmiLibId = 87610;

    private void libCheck() {
    }

    private void libDownloader() {

    }

    @Override
    public void onEnable() {
        instance = this;

    }

    public void consoleMessage(String message) {

    }

    public void loadMessage(Integer amount, String type, Long took) {
    }

    public String getOffOn(Player player, Player whoGets) {
        return getOffOn(whoGets == null ? player == null ? false : player.isOnline() : whoGets.canSee(player) && player.isOnline());
    }

    public String getOffOn(Player player) {
        return getOffOn(player.isOnline());
    }

    public String getOffOn(boolean state) {
        return state ? LC.info_variables_Online.getLocale() : LC.info_variables_Offline.getLocale();
    }

    public void save(Player player) {
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther, boolean inform) {
        return getTarget(sender, playerName, cmd.getClass().getSimpleName(), checkOrther, inform);
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd) {
        return getTarget(sender, playerName, cmd.getClass().getSimpleName(), true);
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther) {
        return getTarget(sender, playerName, cmd.getClass().getSimpleName(), checkOrther);
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd) {
        return getTarget(sender, playerName, cmd, true);
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther) {
        return getTarget(sender, playerName, cmd, checkOther, true);
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther, boolean inform) {
        CMIUser user = getUser(sender, playerName, cmd, inform, checkOther);
        if (user == null)
            return null;
        return user.getPlayer();
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean inform, boolean checkOther) {
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), inform, checkOther);
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd) {
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), true, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean checkOther) {
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), true, checkOther);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd) {
        return getUser(sender, playerName, cmd, true, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther) {
        return getUser(sender, playerName, cmd, inform, checkOther, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther, boolean informOnPerm) {
        return null;
    }

    public Player getPlayer(String playerName) {
        return null;
    }

    public void info(Object c, CMIUser user, String path, Object... variables) {
    }

    public void info(Class<?> c, Player player, String path, Object... variables) {
        info(c.getSimpleName(), player, path, variables);
    }

    public void info(Object c, Player player, String path, Object... variables) {
        info(c.getClass().getSimpleName(), player, path, variables);
    }

    public void info(Object thi, CommandSender sender, String path, Object... variables) {
        info(thi.getClass().getSimpleName(), sender, path, variables);
    }

    public void info(String c, CommandSender sender, String path, Object... variables) {
    }

    public void info(String c, Player player, String path, Object... variables) {
    }

    public String getIM(Class<?> c, String path, Object... variables) {
        return getIM(c.getSimpleName(), path, variables);
    }

    public String getIM(Object c, String path, Object... variables) {
        return getIM(c.getClass().getSimpleName(), path, variables);
    }

    public String getIM(String cmd, String path, Object... variables) {
        return getLM().getMessage("command." + cmd + ".info." + path, variables);
    }

    public List<String> getIML(String cmd, String path, Object... variables) {
        return getLM().getMessageList("command." + cmd + ".info." + path, variables);
    }

    public List<String> getIML(Object c, String path, Object... variables) {
        return getIML(c.getClass().getSimpleName(), path, variables);
    }

    public List<String> getIML(Class<?> c, String path, Object... variables) {
        return getIML(c.getSimpleName(), path, variables);
    }

    public void sendMessage(Object sender, LC lc, Object... variables) {

    }

    public void sendMessage(Object sender, String msg) {
        sendMessage(sender, msg, true);
    }

    public void sendMessage(Object sender, String msg, boolean updateSnd) {
        sendMessage(sender, msg, updateSnd, true);
    }

    public void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors) {
        sendMessage(sender, msg, updateSnd, translateColors, true);
    }

    public void sendMessage(Object sender, String msg, boolean updateSnd, boolean translateColors, boolean translatePlaceholders) {

    }

    public int broadcastMessage(String msg) {
        return broadcastMessage(null, msg, false, null, null);
    }

    public int broadcastMessage(CommandSender sender, String msg) {
        return broadcastMessage(sender, msg, true, null, null);
    }

    public int broadcastMessage(CommandSender sender, CMIPerm perm, String msg) {
        return broadcastMessage(sender, msg, true, perm, null);
    }

    public int broadcastMessage(CommandSender sender, String msg, boolean showForsender) {
        return broadcastMessage(sender, msg, showForsender, null, null);
    }

    public int broadcastMessage(CommandSender sender, String msg, boolean showForsender, Set<Player> ignorePlayers) {
        return broadcastMessage(sender, msg, showForsender, null, ignorePlayers);
    }

    public int broadcastMessage(CommandSender sender, String msg, boolean showForsender, CMIPerm perm, Set<Player> ignorePlayers) {
        return 0;
    }

    public String getMsg(LC lc, Object... variables) {
        return lc.getLocale(variables);
    }

    public boolean isUseProtocollib() {
        return useProtocollib;
    }

    public boolean isPlayerVaultEnabled() {
        return PlayerVaultEnabled;
    }

    public boolean isPlayerVaultXEnabled() {
        return PlayerVaultXEnabled;
    }

    public boolean isPlayerVaultNBTEnabled() {
        return PlayerVaultNBTEnabled;
    }

    public boolean isPlaceholderAPIEnabled() {
        return PlaceholderAPIEnabled;
    }

    public Placeholder getPlaceholderAPIManager() {
        if (Placeholder == null)
            Placeholder = new Placeholder(this);
        return Placeholder;
    }

    public long getTimer() {
        return timer;
    }

    public void setTimer(long timer) {
        this.timer = timer;
    }

    public boolean isVaultPermEnabled() {
        return VaultPermEnabled;
    }

    public Permission getPerms() {
        return perms;
    }

    public TabComplete getTab() {
        return tab;
    }

    public void setUseProtocollib(boolean b) {
        useProtocollib = b;
    }

    public void ShowPagination(CommandSender sender, PageInfo pi, String cmd) {
        ShowPagination(sender, pi, cmd, null);
    }

    public void ShowPagination(CommandSender sender, PageInfo pi, Object cmd, String pagePref) {

        ShowPagination(sender, pi.getTotalPages(), pi.getCurrentPage(), pi.getTotalEntries(), CommandsHandler.getLabel() + " " + cmd.getClass().getSimpleName(), pagePref);
    }

    public void ShowPagination(CommandSender sender, PageInfo pi, String cmd, String pagePref) {
        ShowPagination(sender, pi.getTotalPages(), pi.getCurrentPage(), pi.getTotalEntries(), cmd, pagePref);
    }

    public void ShowPagination(CommandSender sender, int pageCount, int CurrentPage, int totalEntries, String cmd, String pagePref) {

    }

    public void ShowPagination(Set<Player> players, int pageCount, int CurrentPage, int totalEntries, String cmd, String pagePref) {

    }

    public void autoPagination(CommandSender sender, PageInfo pi, String cmd, String pagePref) {

    }

    public int getViewRange(World world) {
        int view = Bukkit.getServer().getViewDistance();
        return view;
    }

    public boolean isMcmmoexpmodulepresent() {
        return mcmmoexpmodulepresent;
    }

    public boolean isJobsPresent() {
        return jobsPresent;
    }

    public void performCommand(CommandSender sender, Object cls) {
        performCommand(sender, cls, "");
    }

    public void performCommand(CommandSender sender, Object cls, String cmd) {
        cmd = CommandsHandler.getLabel() + " " + cls.getClass().getSimpleName() + (cmd.isEmpty() ? "" : " " + cmd);
        performCommand(sender, cmd);
    }

    public void performCommand(CommandSender sender, String cmd) {
    }

    public boolean isVotifierEnabled() {
        return VotifierEnabled;
    }

    public boolean isFullyLoaded() {
        return fullyLoaded;
    }

    public boolean isCitizensEnabled() {
        return CitizensEnabled;
    }

    public boolean isNCPEnabled() {
        return NCPEnabled;
    }

    public boolean isMVdWPlaceholderAPIEnabled() {
        return MVdWPlaceholderAPIEnabled;
    }

    public void setFullyLoaded(boolean fullyLoaded) {
        this.fullyLoaded = fullyLoaded;
    }

    public UUID getServerUUID() {
        return ServerUUID;
    }

    public int getLastCMILibVersion() {
        return lastCMILibVersion;
    }

    public int getRequiredCMILibVersion() {
        return requiredCMILibVersion;
    }

    public long getServerStartupTime() {
        return serverStartupTime;
    }
}
