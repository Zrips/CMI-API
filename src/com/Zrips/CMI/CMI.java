package com.Zrips.CMI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import com.Zrips.CMI.AllListeners.silentChest;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Locale.Language;
import com.Zrips.CMI.Modules.Afk.AfkManager;
import com.Zrips.CMI.Modules.Alias.AliasManager;
import com.Zrips.CMI.Modules.Animations.AnimationManager;
import com.Zrips.CMI.Modules.Anvil.AnvilManager;
import com.Zrips.CMI.Modules.BossBar.BossBarManager;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager;
import com.Zrips.CMI.Modules.ChatFormat.ChatFormatManager;
import com.Zrips.CMI.Modules.ChatTag.TagManager;
import com.Zrips.CMI.Modules.ChunkPreview.ChunkPreview;
import com.Zrips.CMI.Modules.CmdCooldown.CooldownManager;
import com.Zrips.CMI.Modules.CmdWarmUp.WarmUpManager;
import com.Zrips.CMI.Modules.CmiItems.ItemManager;
import com.Zrips.CMI.Modules.CustomNBT.CustomNBTManager;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.CustomText.CTextManager;
import com.Zrips.CMI.Modules.DataBase.DBClassLoader;
import com.Zrips.CMI.Modules.DataBase.DBManager;
import com.Zrips.CMI.Modules.Economy.EconomyManager;
import com.Zrips.CMI.Modules.Enchants.EnchantManager;
import com.Zrips.CMI.Modules.EventActions.EventActionManager;
import com.Zrips.CMI.Modules.FindBiome.FindBiomeManager;
import com.Zrips.CMI.Modules.FlightCharge.FlightChargeManager;
import com.Zrips.CMI.Modules.GUI.GUIManager;
import com.Zrips.CMI.Modules.Homes.HomeManager;
import com.Zrips.CMI.Modules.InteractiveCommand.InteractiveBlockManager;
import com.Zrips.CMI.Modules.InvEndEditor.EnderChestListener;
import com.Zrips.CMI.Modules.InvEndEditor.EnderChestManager;
import com.Zrips.CMI.Modules.InvRegEditor.RegChestManager;
import com.Zrips.CMI.Modules.Ips.IpManager;
import com.Zrips.CMI.Modules.Kits.KitsManager;
import com.Zrips.CMI.Modules.LightFix.LightFix;
import com.Zrips.CMI.Modules.Mirror.MirrorManager;
import com.Zrips.CMI.Modules.NickName.NickNameManager;
import com.Zrips.CMI.Modules.Notify.NotifyManager;
import com.Zrips.CMI.Modules.Painting.PaintingManager;
import com.Zrips.CMI.Modules.Particl.ParticleManager;
import com.Zrips.CMI.Modules.Patrol.PatrolManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.PlayTime.PlayerStatsManager;
import com.Zrips.CMI.Modules.Portals.PortalManager;
import com.Zrips.CMI.Modules.Ranks.RankManager;
import com.Zrips.CMI.Modules.Recipes.RecipeManager;
import com.Zrips.CMI.Modules.Region.WorldManager;
import com.Zrips.CMI.Modules.ReplaceBlock.ReplaceBlock;
import com.Zrips.CMI.Modules.SavedInv.SavedInventoryManager;
import com.Zrips.CMI.Modules.Scan.Scan;
import com.Zrips.CMI.Modules.Search.Search;
import com.Zrips.CMI.Modules.Selection.SelectionManager;
import com.Zrips.CMI.Modules.Sheduler.SchedulerManager;
import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxManager;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeManager;
import com.Zrips.CMI.Modules.Statistics.StatsManager;
import com.Zrips.CMI.Modules.TabList.TabListHeaderFooterHandler;
import com.Zrips.CMI.Modules.TabList.TabListManager;
import com.Zrips.CMI.Modules.TimedCommands.TimedCommandManager;
import com.Zrips.CMI.Modules.Totems.TotemManager;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import com.Zrips.CMI.Modules.ViewRange.ViewRangeManager;
import com.Zrips.CMI.Modules.Warps.WarpManager;
import com.Zrips.CMI.Modules.tp.Teleportations;
import com.Zrips.CMI.Modules.tp.TpManager;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.utils.ActionBar;
import com.Zrips.CMI.utils.CMIScoreboardManager;
import com.Zrips.CMI.utils.ChunkFix;
import com.Zrips.CMI.utils.FindLastOnline;
import com.Zrips.CMI.utils.Lag;
import com.Zrips.CMI.utils.Placeholder;
import com.Zrips.CMI.utils.PrevNamesFetcher;
import com.Zrips.CMI.utils.Purge;
import com.Zrips.CMI.utils.Sorting;
import com.Zrips.CMI.utils.TimeManager;
import com.Zrips.CMI.utils.UnloadChunks;
import com.Zrips.CMI.utils.Util;
import com.Zrips.CMI.utils.VersionChecker;
import com.Zrips.CMI.utils.scUtil;
import com.drtshock.playervaults.PlayerVaults;
import com.earth2me.essentials.Essentials;
import com.griefcraft.lwc.LWC;

import net.milkbowl.vault.permission.Permission;

public class CMI extends JavaPlugin {

    protected NMS nms;
    protected Reflections ref;
    private boolean useProtocollib = false;
    private boolean VaultPermEnabled = false;
    private boolean PlayerVaultEnabled = false;
    private boolean PlayerVaultNBTEnabled = false;
    private boolean PlaceholderAPIEnabled = false;
    protected String PluginName = this.getDescription().getName();
    protected String PluginVersion = this.getDescription().getVersion();
    protected YmlMaker Data, Locale, inventories;
    private Permission perms = null;
    protected PlayerVaults PV = null;

    protected CommandsHandler cManager;
    protected LightFix LightFixManager;
    protected ChunkPreview ChunkPreviewManager;
    protected ViewRangeManager ViewRangeManager;
    protected Purge PurgeManager;
    protected Search SearchManager;
    protected Scan ScanManager;
    protected ChunkFix ChunkFixManager;
    protected ReplaceBlock replaceblock;
    protected UnloadChunks unloadchunks;
    protected Util UtilManager;
    protected EnderChestListener enderInvManager;
    protected silentChest sChestManager;
    protected Config config;
    protected Language languageManager;
    protected VersionChecker versionCheckManager;
    protected TimeManager TimeManager;
    protected PrevNamesFetcher NamesChecker;
    protected FindLastOnline FindLO;
    protected MirrorManager mirror;
    protected KitsManager kits;
    protected SpawnerChargeManager charges;
    protected ParticleManager ParticleManager;
    protected FlightChargeManager FlightChargeManager;
    protected NotifyManager notifyManager;
    protected PlayerStatsManager playerStatsManager;
    protected PaintingManager PaintingManager;
    protected VanishManager VanishManager;
    protected BossBarManager BossBarManager;
    protected InteractiveBlockManager InteractiveCommandManager;

    protected EnderChestManager EnderChestManager;
    protected RegChestManager RegChestManager;

    protected AfkManager AfkManager;

    protected TabListManager TabListManager;
    protected TabListHeaderFooterHandler TabListHandler;

    protected RecipeManager RecipeManager;

    protected PortalManager portalManager;
    protected SelectionManager SelectionManager;

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

    protected FindBiomeManager findBiomeManager;

    protected ChatFilterManager chatFilterManager;
    protected GUIManager GUIManager;
    protected SavedInventoryManager SavedInventoryManager;
    protected PatrolManager PatrolManager;

    protected ActionBar ActionBar;
    protected CMIScoreboardManager CMIScoreboardManager;

    protected PlayerManager PM;
    protected Sorting Sorting;

    protected scUtil scutil;

    private long timer = 0L;

    protected LWC lwc = null;
    protected Essentials ess = null;
    private boolean spigotPlatform = false;

    private boolean mcmmoexpmodulepresent = false;
    private boolean jobsPresent = false;

    protected static CMI instance;

    public String prefix = ChatColor.GOLD + "[CMI] " + ChatColor.DARK_AQUA;

    protected Scoreboard scoreboard = null;

    public static CMI getInstance() {
	return instance;
    }

    public DBClassLoader getDBClassloader() {
	return null;
    }

    public void setDBClassloader() {
    }

    public Essentials getEssentials() {
	return null;
    }

    public HashMap<String, List<String>> preFetchNames() {
	return null;
    }

    public HashMap<String, UUID> preFetchUUIDS() {
	return null;
    }

    public LWC getLWC() {
	return null;
    }

    public NMS getNMS() {
	return null;
    }

    public Reflections getRef() {
	return null;
    }

    public scUtil getScUtil() {
	return null;
    }

    public MirrorManager getMirrorManager() {
	return null;
    }

    public EnchantManager getEnchantManager() {
	return null;
    }

    public BossBarManager getBossBarManager() {
	return null;
    }

    public InteractiveBlockManager getInteractiveCommandManager() {
	return null;
    }

    public ChatFormatManager getChatFormatManager() {
	return null;
    }

    public PlayerVaults getPlayerVaults() {
	return null;
    }

    public KitsManager getKitsManager() {
	return null;
    }

    public SpawnerChargeManager getSpawnerChargesManager() {
	return null;
    }

    public NotifyManager getNotifyManager() {
	return null;
    }

    public RecipeManager getRecipeManager() {
	return null;
    }

    public PlayerStatsManager getPlayerStatsManager() {
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

    public EconomyManager getEconomyManager() {
	return null;
    }

    public CooldownManager getCooldownManager() {
	return null;
    }

    public PortalManager getPortalManager() {
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

    public TpManager getTpManager() {
	return null;
    }

    public Teleportations getTeleportations() {
	return null;
    }

    public StatsManager getStatsManager() {
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

    public ActionBar getActionBar() {
	return null;
    }

    public CMIScoreboardManager getCMIScoreboardManager() {
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

    public FindLastOnline getFindLastOnline() {
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

    public silentChest getsChestManager() {
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

    public EnderChestListener getEnderInvManager() {
	return null;
    }

    public Config getConfigManager() {
	return null;
    }

    public DBManager getDbManager() {
	return null;
    }

    public Language getLM() {
	return null;
    }

    public void d(Object... message) {
	getUtilManager().Debug(message);
    }

    public List<String> getColorNames() {
	List<String> list = new ArrayList<String>();
	return list;
    }

    public static List<ChatColor> getColors() {
	List<ChatColor> list = new ArrayList<ChatColor>();
	return list;
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

//    public static DeadBodies DeadBodies = new DeadBodies();

    @Override
    public void onEnable() {
    }

    private boolean setupLWC() {
	return lwc != null;
    }

    private boolean setupEssentials() {
	return ess != null;
    }

    private boolean setupMcMMO() {
	return mcmmoexpmodulepresent;
    }

    private boolean setupJobs() {
	return jobsPresent;
    }

    private boolean setupPermissions() {
	return perms != null;
    }

    private boolean setupPlayerVaults() {
	return PV != null;
    }

    private boolean setupPlaceHolderAPI() {
	return true;
    }

    public void consoleMessage(String message) {
    }

    public String getOffOn(Player player) {
	return null;
    }

    public String getOffOn(boolean state) {
	return null;
    }

    public void save(Player player) {
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd) {
	return null;
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther) {
	return null;
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd) {
	return null;
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd, boolean checkOther) {
	return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd) {
	return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean checkOther) {
	return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd) {
	return null;
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther) {
	return null;
    }

    public void info(Object c, Player player, String path, Object... variables) {
    }

    public void info(String c, CommandSender sender, String path, Object... variables) {
    }

    public void info(String c, Player player, String path, Object... variables) {
    }

    public void info(Object thi, CommandSender sender, String path, Object... variables) {
    }

    public String getIM(Object c, String path, Object... variables) {
	return null;
    }

    public String getIM(String cmd, String path, Object... variables) {
	return null;
    }

    public List<String> getIML(String cmd, String path, Object... variables) {
	return null;
    }

    public List<String> getIML(Object c, String path, Object... variables) {
	return null;
    }

    public void sendMessage(Object sender, LC lc, Object... variables) {
    }

    public void sendMessage(Object sender, String msg) {
    }

    public void sendMessage(Object sender, String msg, boolean updateSnd) {
    }

    public void broadcastMessage(String msg) {
    }

    public void broadcastMessage(CommandSender sender, String msg) {
    }

    public void broadcastMessage(CommandSender sender, String msg, boolean showForsender) {
    }

    private void multyTypeMsg(Player player, String msg, boolean updateSnd) {
    }

    private CText processCustomText(String msg) {
	return null;
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

    public Permission getPerms() {
	return null;
    }

    public TabComplete getTab() {
	return null;
    }

    public List<UUID> getGodModoList() {
	return null;
    }

    public void setUseProtocollib(boolean b) {
    }

    public void ShowPagination(CommandSender sender, int pageCount, int CurrentPage, String cmd) {
    }

    public void ShowPagination(CommandSender sender, int pageCount, int CurrentPage, String cmd, String pagePref) {
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

    public void performCommand(CommandSender sender, String cmd) {
    }

    public boolean hasPermission(CommandSender sender, CMIPerm perm) {
	return sender.hasPermission(perm.getPermission());
    }
}
