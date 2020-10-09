package com.Zrips.CMI;

import java.io.File;
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
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIMultiMessage;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.PageInfo;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Locale.Language;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager;
import com.Zrips.CMI.Modules.ActionBar.ActionBarManager;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Alias.AliasManager;
import com.Zrips.CMI.Modules.Animations.AnimationManager;
import com.Zrips.CMI.Modules.Anvil.AnvilManager;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager;
import com.Zrips.CMI.Modules.BossBar.BossBarManager;
import com.Zrips.CMI.Modules.BungeeCord.BungeeCordManager;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager;
import com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager;
import com.Zrips.CMI.Modules.ChatTag.TagManager;
import com.Zrips.CMI.Modules.ChunkPreview.ChunkPreview;
import com.Zrips.CMI.Modules.CmdCooldown.CooldownManager;
import com.Zrips.CMI.Modules.CmdCost.CMICommandCostManager;
import com.Zrips.CMI.Modules.CmdWarmUp.WarmUpManager;
import com.Zrips.CMI.Modules.CmiItems.ItemManager;
import com.Zrips.CMI.Modules.CustomText.CTextManager;
import com.Zrips.CMI.Modules.DataBase.DBClassLoader;
import com.Zrips.CMI.Modules.DataBase.DBManager;
import com.Zrips.CMI.Modules.DiscordSRV.DiscordSRVManager;
import com.Zrips.CMI.Modules.DynMap.DynMapManager;
import com.Zrips.CMI.Modules.DynamicSigns.SignManager;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.Enchants.EnchantManager;
import com.Zrips.CMI.Modules.EventActions.EventActionManager;
import com.Zrips.CMI.Modules.FindBiome.FindBiomeManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightChargeManager;
import com.Zrips.CMI.Modules.GUI.GUIManager;
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
import com.Zrips.CMI.Modules.Logs.CMILogManager;
import com.Zrips.CMI.Modules.Mirror.MirrorManager;
import com.Zrips.CMI.Modules.NickName.NickNameManager;
import com.Zrips.CMI.Modules.Packets.PacketInjector;
import com.Zrips.CMI.Modules.Painting.PaintingManager;
import com.Zrips.CMI.Modules.Particl.ParticleManager;
import com.Zrips.CMI.Modules.Patrol.PatrolManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.Placeholders.Placeholder;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager;
import com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsManager;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager;
import com.Zrips.CMI.Modules.Portals.PortalManager;
import com.Zrips.CMI.Modules.Ranks.RankManager;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.Modules.RawMessages.RawMessageCommand;
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
import com.Zrips.CMI.Modules.TitleMessages.TitleMessageManager;
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
import com.Zrips.CMI.utils.ActionBar;
import com.Zrips.CMI.utils.ChunkFix;
import com.Zrips.CMI.utils.Lag;
import com.Zrips.CMI.utils.PrevNamesFetcher;
import com.Zrips.CMI.utils.Purge;
import com.Zrips.CMI.utils.Sorting;
import com.Zrips.CMI.utils.TimeManager;
import com.Zrips.CMI.utils.UnloadChunks;
import com.Zrips.CMI.utils.Util;
import com.Zrips.CMI.utils.Util.CommandType;
import com.Zrips.CMI.utils.VersionChecker;

public class CMI extends JavaPlugin {

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

    private Placeholder Placeholder;

    public static String bugReportLink = "";
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

    protected PaintingManager PaintingManager;
    protected VanishManager VanishManager;
    protected BossBarManager BossBarManager;
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
    protected ItemManager itemManager;

    protected EventActionManager eventActionManager;

    protected CustomNBTManager CustomNBTManager;

    protected CMILogManager logManager;

    protected FindBiomeManager findBiomeManager;

    protected ChatFilterManager chatFilterManager;
    protected GUIManager GUIManager;
    protected SavedInventoryManager SavedInventoryManager;
    protected PatrolManager PatrolManager;

    private DBManager dbManager;
    private RankManager rankManager;

    private Lag lagMeter;

    protected ActionBarManager ActionBar;
    protected ActionBar legacyActionBar;
    protected TitleMessageManager titleMessageManager;

    protected PlayerManager PM;
    protected Sorting Sorting;

    private TabComplete tab;

    private long timer = 0L;

    private boolean spigotPlatform = false;
    private boolean paperSpigotPlatform = false;
    private boolean paperSpigotMethods = false;

    private boolean mcmmoexpmodulepresent = false;
    private boolean jobsPresent = false;

    protected HashMap<String, List<String>> preFetchNames = new HashMap<String, List<String>>();
    protected HashMap<String, UUID> preFetchUUIDs = new HashMap<String, UUID>();
    private static final UUID ServerUUID = UUID.fromString("00000000-0000-0000-0000-000000000000");

    protected static CMI instance;

    public String prefix = ChatColor.GOLD + "[CMI] " + ChatColor.DARK_AQUA;

    protected Scoreboard scoreboard = null;

    private PacketInjector injector;

    public PacketInjector getPacketInjector() {
	return injector;
    }

    protected String getWorldFolderPath() {
	return null;
    }

    public static CMI getInstance() {
	return instance;
    }

    private DBClassLoader classLoader;

    public DBClassLoader getDBClassloader() {
	return null;
    }

    public void setDBClassloader() {
    }

    public HashMap<String, List<String>> preFetchNames() {
	return null;
    }

    public HashMap<String, UUID> preFetchUUIDS() {
	return null;
    }

    public NMS getNMS() {
	return null;
    }

    @Deprecated
    public Reflections getRef() {
	return null;
    }

    public Reflections getReflectionManager() {
	return null;
    }

    public MirrorManager getMirrorManager() {
	return null;
    }

    public LookupService getLookupService() {
	return null;
    }

    public void defaultLocaleDownloader() {
    }

    public DiscordSRVManager getDiscordSRVManager() {
	return null;
    }

    public ArmorStandManager getArmorStandManager() {
	return null;
    }

    public CMILogManager getLogManager() {
	return null;
    }

    public PlayerCombatManager getPlayerCombatManager() {
	return null;
    }

    public DynMapManager getDynMapManager() {
	return null;
    }

    public WarningManager getWarningManager() {
	return null;
    }

    public EnchantManager getEnchantManager() {
	return null;
    }

    public VotifierManager getVotifierManager() {
	return null;
    }

    public CitizensManager getCitizensManager() {
	return null;
    }

    public BossBarManager getBossBarManager() {
	return null;
    }

    public SpecializedCommandManager getSpecializedCommandManager() {
	return null;
    }

    public InteractiveCommandManager getInteractiveCommandManager() {
	return null;
    }

    public ChatFormatManager getChatFormatManager() {
	return null;
    }

    public KitsManager getKitsManager() {
	return null;
    }

    public SpawnerChargeManager getSpawnerChargesManager() {
	return null;
    }

    public SkinManager getSkinManager() {
	return null;
    }

    public RecipeManager getRecipeManager() {
	return null;
    }

    public PaintingManager getPaintingManager() {
	return null;
    }

    public VanishManager getVanishManager() {
	return null;
    }

    public ParticleManager getParticleManager() {
	return null;
    }

    public FlightChargeManager getFlightChargeManager() {
	return null;
    }

    public Lag getLagMeter() {
	return null;
    }

    public EnderChestManager getEnderChestManager() {
	return null;
    }

    public RegChestManager getRegChestManager() {
	return null;
    }

    public HologramManager getHologramManager() {
	return null;
    }

    public EconomyManager getEconomyManager() {
	return null;
    }

    public CMICommandCostManager getCommandCostManager() {
	return null;
    }

    public CooldownManager getCooldownManager() {
	return null;
    }

    public PortalManager getPortalManager() {
	return null;
    }

    public SignManager getSignManager() {
	return null;
    }

    public SelectionManager getSelectionManager() {
	return null;
    }

    public WarmUpManager getWarmUpManager() {
	return null;
    }

    public WorldManager getRegionManager() {
	return null;
    }

    public ShulkerBoxManager getShulkerBoxManager() {
	return null;
    }

    public TimedCommandManager getTimedCommandManager() {
	return null;
    }

    public PermissionsManager getPermissionsManager() {
	return null;
    }

    public NickNameManager getNickNameManager() {
	return null;
    }

    public TagManager getTagManager() {
	return null;
    }

    public WarpManager getWarpManager() {
	return null;
    }

    public IpManager getIpManager() {
	return null;
    }

    public PlayTimeRewardsManager getPlayTimeRewardManager() {
	return null;
    }

    public TpManager getTpManager() {
	return null;
    }

    public Teleportations getTeleportations() {
	return null;
    }

    public StatsManager getStatsManager() {
	return null;
    }

    public JailManager getJailManager() {
	return null;
    }

    public WorthManager getWorthManager() {
	return null;
    }

    public AliasManager getAliasManager() {
	return null;
    }

    public AfkManager getAfkManager() {
	return null;
    }

    public TabListHeaderFooterHandler getTabListHandler() {
	return null;
    }

    public TabListManager getTabListManager() {
	return null;
    }

    public CTextManager getCTextManager() {
	return null;
    }

    public ItemManager getItemManager() {
	return null;
    }

    public CustomNBTManager getCustomNBTManager() {
	return null;
    }

    public EventActionManager getEventActionManager() {
	return null;
    }

    public HomeManager getHomeManager() {
	return null;
    }

    public SchedulerManager getSchedulerManager() {
	return null;
    }

    public AnvilManager getAnvilManager() {
	return null;
    }

    public TotemManager getTotemManager() {
	return null;
    }

    public AnimationManager getAnimationManager() {
	return null;
    }

    @Deprecated
    public ActionBar getActionBar() {
	return null;
    }

    public ActionBarManager getActionBarManager() {
	return null;
    }

    public TitleMessageManager getTitleMessageManager() {
	return null;
    }

    public FindBiomeManager getFindBiomeManager() {
	return null;
    }

    public ChatFilterManager getChatFilterManager() {
	return null;
    }

    public GUIManager getGUIManager() {
	return null;
    }

    public SavedInventoryManager getSavedInventoryManager() {
	return null;
    }

    BungeeCordManager BungeeCordManager;

    public BungeeCordManager getBungeeCordManager() {
	return null;
    }

    public PatrolManager getPatrolManager() {
	return null;
    }

    public RankManager getRankManager() {
	return null;
    }

    public PlayerManager getPlayerManager() {
	return null;
    }

    public Sorting getSortingManager() {
	return null;
    }

    public PrevNamesFetcher getNamesChecker() {
	return null;
    }

    public TimeManager getTimeManager() {
	return null;
    }

    public VersionChecker getVersionCheckManager() {
	return null;
    }

    public CommandsHandler getCommandManager() {
	return null;
    }

    public SavedItemManager getSavedItemManager() {
	return null;
    }

    public PlayTimeManager getPlayTimeManager() {
	return null;
    }

    public LightFix getLightFixManager() {
	return null;
    }

    public ChunkPreview getChunkPreviewManager() {
	return null;
    }

    public ViewRangeManager getViewRangeManager() {
	return null;
    }

    public Search getSearchManager() {
	return null;
    }

    public Scan getScanManager() {
	return null;
    }

    public ChunkFix getChunkFixManager() {
	return null;
    }

    public ReplaceBlock getReplaceBlockManager() {
	return null;
    }

    public UnloadChunks getUnloadChunksManager() {
	return null;
    }

    public Purge getPurgeManager() {
	return null;
    }

    public Util getUtilManager() {
	return null;
    }

    public Config getConfigManager() {
	return null;
    }

    public ScavengeManager getScavengeManager() {
	return null;
    }

    public DBManager getDbManager() {
	return null;
    }

    public Language getLM() {
	return null;
    }

    @Override
    public void onDisable() {

    }

    int lagId = -1;

    public Scoreboard getSB() {
	return null;
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

    @Override
    public void onEnable() {
	instance = this;
    }

    public void consoleMessage(String message) {
    }

    public void loadMessage(Integer amount, String type, Long took) {
	consoleMessage("&3Loaded (&f" + amount + "&3) &7" + type + " &3into memory. &6Took &e" + took + "&6ms");
    }

    public String getOffOn(Player player, Player whoGets) {
	return getOffOn(whoGets == null ? player.isOnline() : whoGets.canSee(player) && player.isOnline());
    }

    public String getOffOn(Player player) {
	return getOffOn(player.isOnline());
    }

    public String getOffOn(boolean state) {
	return state ? this.getMsg(LC.info_variables_Online) : this.getMsg(LC.info_variables_Offline);
    }

    public void save(Player player) {
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
	return null;
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
	return null;
    }

    public boolean isSpigotPlatform() {
	return spigotPlatform;
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
	return null;
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
	ShowPagination(sender, pi.getTotalPages(), pi.getCurrentPage(), pi.getTotalEntries(), getCommandManager().getLabel() + " " + cmd.getClass().getSimpleName(), pagePref);
    }

    public void ShowPagination(CommandSender sender, PageInfo pi, String cmd, String pagePref) {
	ShowPagination(sender, pi.getTotalPages(), pi.getCurrentPage(), pi.getTotalEntries(), cmd, pagePref);
    }

    public void ShowPagination(CommandSender sender, int pageCount, int CurrentPage, int totalEntries, String cmd, String pagePref) {
    }

    public void autoPagination(CommandSender sender, PageInfo pi, String cmd, String pagePref) {
    }

    public int getViewRange(World world) {
	return 0;
    }

    public boolean isMcmmoexpmodulepresent() {
	return mcmmoexpmodulepresent;
    }

    public boolean isJobsPresent() {
	return jobsPresent;
    }

    public void performCommand(CommandSender sender, String cmd) {
    }

    public boolean isVotifierEnabled() {
	return VotifierEnabled;
    }

    public boolean isPaperSpigotPlatform() {
	return paperSpigotPlatform;
    }

    public boolean isFullyLoaded() {
	return fullyLoaded;
    }

    public boolean isCitizensEnabled() {
	return CitizensEnabled;
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

    public File getFile(Player player) {
	return getFile(player.getUniqueId());
    }

    public File getFile(UUID uuid) {
	return new File(this.getWorldFolderPath() + "playerdata" + File.separator + uuid + ".dat");
    }

    public boolean isPaperSpigotMethods() {
	return paperSpigotMethods;
    }

    public void setPaperSpigotMethods(boolean paperSpigotMethods) {
	this.paperSpigotMethods = paperSpigotMethods;
    }
}
