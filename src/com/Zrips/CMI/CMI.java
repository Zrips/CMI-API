package com.Zrips.CMI;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
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
import com.Zrips.CMI.Modules.Chat.ChatBubbleManager;
import com.Zrips.CMI.Modules.Chat.ChatManager;
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
import com.Zrips.CMI.Modules.Elytra.ElytraManager;
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
import com.Zrips.CMI.Modules.Packets.PacketInjector;
import com.Zrips.CMI.Modules.Painting.PaintingManager;
import com.Zrips.CMI.Modules.Particl.ParticleManager;
import com.Zrips.CMI.Modules.Patrol.PatrolManager;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager;
import com.Zrips.CMI.Modules.Placeholders.Placeholder;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeManager;
import com.Zrips.CMI.Modules.PlayTimeRewards.PlayTimeRewardsManager;
import com.Zrips.CMI.Modules.PlayerCombat.PlayerCombatManager;
import com.Zrips.CMI.Modules.PlayerOptions.PlayerOptionsManager;
import com.Zrips.CMI.Modules.Portals.PortalManager;
import com.Zrips.CMI.Modules.Ranks.RankManager;
import com.Zrips.CMI.Modules.Recipes.RecipeManager;
import com.Zrips.CMI.Modules.Region.WorldManager;
import com.Zrips.CMI.Modules.Repair.RepairManager;
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
import com.Zrips.CMI.Modules.Teleportations.RandomTeleportationManager;
import com.Zrips.CMI.Modules.Teleportations.TeleportHandler;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager;
import com.Zrips.CMI.Modules.TimedCommands.TimedCommandManager;
import com.Zrips.CMI.Modules.Totems.TotemManager;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import com.Zrips.CMI.Modules.ViewRange.ViewRangeManager;
import com.Zrips.CMI.Modules.Votifier.VotifierManager;
import com.Zrips.CMI.Modules.Warnings.WarningManager;
import com.Zrips.CMI.Modules.Warps.WarpManager;
import com.Zrips.CMI.Modules.Worth.WorthManager;
import com.Zrips.CMI.NBT.NMS;
import com.Zrips.CMI.commands.CommandsHandler;
import com.Zrips.CMI.utils.ChunkFix;
import com.Zrips.CMI.utils.Lag;
import com.Zrips.CMI.utils.Purge;
import com.Zrips.CMI.utils.TimeManager;
import com.Zrips.CMI.utils.UnloadChunks;
import com.Zrips.CMI.utils.Util;
import com.Zrips.CMI.utils.VersionChecker;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.GUI.GUIManager;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Util.Sorting;
import net.Zrips.CMILib.Version.Schedulers.CMITask;
import net.milkbowl.vault.permission.Permission;

public class CMI extends JavaPlugin {

    public static final String settingsFolderName = "Settings";
    public static final String savesFolderName = "Saves";
    public static final String kitsFolderName = "Kits";
    public static final String translationsFolderName = "Translations";
    public static final String deathMessagesFolderName = "DeathMessages";

    private boolean fullyLoaded = false;
    private boolean serverLoaded = false;
    protected NMS nms;
    protected Reflections ref;

    private Placeholder Placeholder;

    private Permission vaultPerm = null;

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
    protected ElytraManager ElytraManager;
    protected RepairManager RepairManager;

    protected SkinManager SkinManager;
    protected Util UtilManager;

    protected Config config;
    protected Language languageManager;
    protected ScavengeManager scavengeManager;
    protected VersionChecker versionCheckManager;
    protected PlayTimeRewardsManager PlayTimeRewardsManager;
    protected TimeManager TimeManager;
    protected MirrorManager mirror;
    protected KitsManager kits;
    protected SpawnerChargeManager charges;
    protected ParticleManager ParticleManager;
    protected FlightChargeManager FlightChargeManager;
    protected ChatBubbleManager ChatBubbleManager;
    protected ChatManager ChatManager;

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
    protected TeleportHandler TeleportHandler;
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
    protected RandomTeleportationManager RandomTeleportationManager;

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
    protected TeleportManager TeleportManager;

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

    protected PlayerManager PM;
    protected Sorting Sorting;

    private TabComplete tab;

    private long timer = 0L;

    protected HashMap<String, List<String>> preFetchNames = new HashMap<String, List<String>>();
    protected HashMap<String, UUID> preFetchUUIDs = new HashMap<String, UUID>();
    private static final UUID ServerUUID = new UUID(0, 0);

    protected static CMI instance;

    public String prefix = CMIChatColor.GOLD + "[CMI] " + CMIChatColor.DARK_AQUA;

    protected Scoreboard scoreboard = null;

    private PacketInjector injector;

    public PacketInjector getPacketInjector() {
        return injector;
    }

    protected String getWorldFolderPath() {
        if (worldFolderPath == null)
            worldFolderPath = Bukkit.getWorldContainer().getAbsolutePath() + File.separator + Bukkit.getWorlds().get(0).getName() + File.separator;
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
        return LookupService;
    }

    public void defaultLocaleDownloader() {
    }

    public DiscordSRVManager getDiscordSRVManager() {
        if (DiscordSRVManager == null)
            DiscordSRVManager = new DiscordSRVManager(this);
        return DiscordSRVManager;
    }

    public ArmorStandManager getArmorStandManager() {
        if (ArmorStandManager == null)
            ArmorStandManager = new ArmorStandManager(this);
        return ArmorStandManager;
    }

    public PlayerCombatManager getPlayerCombatManager() {
        if (PlayerCombatManager == null)
            PlayerCombatManager = new PlayerCombatManager(this);
        return PlayerCombatManager;
    }

    public DynMapManager getDynMapManager() {
        if (DynMapManager == null)
            DynMapManager = new DynMapManager(this);
        return DynMapManager;
    }

    public WarningManager getWarningManager() {
        if (WarningManager == null)
            WarningManager = new WarningManager(this);
        return WarningManager;
    }

    public EnchantManager getEnchantManager() {
        if (EnchantManager == null)
            EnchantManager = new EnchantManager(this);
        return EnchantManager;
    }

    public ChatBubbleManager getChatBubbleManager() {
        if (ChatBubbleManager == null)
            ChatBubbleManager = new ChatBubbleManager(this);
        return ChatBubbleManager;
    }

    public VotifierManager getVotifierManager() {
        if (VotifierManager == null)
            VotifierManager = new VotifierManager(this);
        return VotifierManager;
    }

    public ChatManager getChatManager() {
        if (ChatManager == null)
            ChatManager = new ChatManager(this);
        return ChatManager;
    }

    public CitizensManager getCitizensManager() {
        if (CitizensManager == null)
            CitizensManager = new CitizensManager(this);
        return CitizensManager;
    }

    public SpecializedCommandManager getSpecializedCommandManager() {
        if (SpecializedCommandManager == null)
            SpecializedCommandManager = new SpecializedCommandManager(this);
        return SpecializedCommandManager;
    }

    public InteractiveCommandManager getInteractiveCommandManager() {
        if (InteractiveCommandManager == null)
            InteractiveCommandManager = new InteractiveCommandManager(this);
        return InteractiveCommandManager;
    }

    public ChatFormatManager getChatFormatManager() {
        if (ChatFormatManager == null)
            ChatFormatManager = new ChatFormatManager(this);

        return ChatFormatManager;
    }

    public KitsManager getKitsManager() {
        if (kits == null)
            kits = new KitsManager(this);
        return kits;
    }

    public SpawnerChargeManager getSpawnerChargesManager() {
        if (charges == null)
            charges = new SpawnerChargeManager();
        return charges;
    }

    public SkinManager getSkinManager() {
        if (SkinManager == null)
            SkinManager = new SkinManager(this);
        return SkinManager;
    }

    public RecipeManager getRecipeManager() {
        if (RecipeManager == null)
            RecipeManager = new RecipeManager(this);
        return RecipeManager;
    }

    public PaintingManager getPaintingManager() {
        if (PaintingManager == null)
            PaintingManager = new PaintingManager(this);
        return PaintingManager;
    }

    public VanishManager getVanishManager() {
        if (VanishManager == null)
            VanishManager = new VanishManager(this);
        return VanishManager;
    }

    public PlayerOptionsManager getPlayerOptionsManager() {
        if (PlayerOptionsManager == null)
            PlayerOptionsManager = new PlayerOptionsManager(this);
        return PlayerOptionsManager;
    }

    public ParticleManager getParticleManager() {
        if (ParticleManager == null)
            ParticleManager = new ParticleManager(this);
        return ParticleManager;
    }

    public DeathMessageManager getDeathMessageManager() {
        if (DeathMessageManager == null)
            DeathMessageManager = new DeathMessageManager(this);
        return DeathMessageManager;
    }

    public FlightChargeManager getFlightChargeManager() {
        if (FlightChargeManager == null)
            FlightChargeManager = new FlightChargeManager(this);
        return FlightChargeManager;
    }

    public Lag getLagMeter() {
        if (lagMeter == null)
            lagMeter = new Lag();
        return lagMeter;
    }

    public EnderChestManager getEnderChestManager() {
        if (EnderChestManager == null)
            EnderChestManager = new EnderChestManager(getInstance());
        return EnderChestManager;
    }

    public RegChestManager getRegChestManager() {
        if (RegChestManager == null)
            RegChestManager = new RegChestManager(getInstance());
        return RegChestManager;
    }

    public HologramManager getHologramManager() {
        if (HologramManager == null) {
            HologramManager = new HologramManager(getInstance());
        }
        return HologramManager;
    }

    public EconomyManager getEconomyManager() {
        if (economyManager == null)
            economyManager = new EconomyManager(getInstance());
        return economyManager;
    }

    public CMICommandCostManager getCommandCostManager() {
        if (CMICommandCostManager == null)
            CMICommandCostManager = new CMICommandCostManager(getInstance());
        return CMICommandCostManager;
    }

    public CooldownManager getCooldownManager() {
        if (cooldownManager == null)
            cooldownManager = new CooldownManager(getInstance());
        return cooldownManager;
    }

    public PortalManager getPortalManager() {
        if (portalManager == null)
            portalManager = new PortalManager(getInstance());
        return portalManager;
    }

    public SignManager getSignManager() {
        if (signManager == null)
            signManager = new SignManager(getInstance());
        return signManager;
    }

    public SelectionManager getSelectionManager() {
        if (SelectionManager == null)
            SelectionManager = new SelectionManager(getInstance());
        return SelectionManager;
    }

    public ArmorEffectManager getArmorEffectManager() {
        if (armorEffectManager == null)
            armorEffectManager = new ArmorEffectManager(getInstance());
        return armorEffectManager;
    }

    public WarmUpManager getWarmUpManager() {
        if (WarmUpManager == null)
            WarmUpManager = new WarmUpManager(getInstance());
        return WarmUpManager;
    }

    public WorldManager getRegionManager() {
        if (regionManager == null)
            regionManager = new WorldManager(getInstance());
        return regionManager;
    }

    public ShulkerBoxManager getShulkerBoxManager() {
        if (shulkerBoxManager == null)
            shulkerBoxManager = new ShulkerBoxManager(getInstance());
        return shulkerBoxManager;
    }

    public TimedCommandManager getTimedCommandManager() {
        if (timedCommandManager == null)
            timedCommandManager = new TimedCommandManager(getInstance());
        return timedCommandManager;
    }

    public PermissionsManager getPermissionsManager() {
        if (permissionsManager == null)
            permissionsManager = new PermissionsManager(getInstance());
        return permissionsManager;
    }

    public NickNameManager getNickNameManager() {
        if (nickNameManager == null)
            nickNameManager = new NickNameManager(getInstance());
        return nickNameManager;
    }

    public TagManager getTagManager() {
        if (TagManager == null)
            TagManager = new TagManager(getInstance());
        return TagManager;
    }

    public WarpManager getWarpManager() {
        if (warpManager == null)
            warpManager = new WarpManager(getInstance());
        return warpManager;
    }

    public IpManager getIpManager() {
        if (ipManager == null)
            ipManager = new IpManager(getInstance());
        return ipManager;
    }

    public PlayTimeRewardsManager getPlayTimeRewardManager() {
        if (PlayTimeRewardsManager == null)
            PlayTimeRewardsManager = new PlayTimeRewardsManager(getInstance());
        return PlayTimeRewardsManager;
    }

    public TeleportManager getTeleportManager() {
        if (TeleportManager == null)
            TeleportManager = new TeleportManager(getInstance());
        return TeleportManager;
    }

    public TeleportHandler getTeleportHandler() {
        if (TeleportHandler == null)
            TeleportHandler = new TeleportHandler(getInstance());
        return TeleportHandler;
    }

    public StatsManager getStatsManager() {
        if (statsManager == null)
            statsManager = new StatsManager(getInstance());
        return statsManager;
    }

    public JailManager getJailManager() {
        if (JailManager == null)
            JailManager = new JailManager(getInstance());
        return JailManager;
    }

    public WorthManager getWorthManager() {
        if (WorthManager == null)
            WorthManager = new WorthManager(getInstance());
        return WorthManager;
    }

    public AliasManager getAliasManager() {
        if (aliasManager == null)
            aliasManager = new AliasManager(getInstance());
        return aliasManager;
    }

    public AfkManager getAfkManager() {
        if (AfkManager == null)
            AfkManager = new AfkManager(getInstance());
        return AfkManager;
    }

    public TabListHeaderFooterHandler getTabListHandler() {
        if (TabListHandler == null)
            TabListHandler = new TabListHeaderFooterHandler(getInstance());
        return TabListHandler;
    }

    public TabListManager getTabListManager() {
        if (TabListManager == null)
            TabListManager = new TabListManager(getInstance());
        return TabListManager;
    }

    public CTextManager getCTextManager() {
        if (cTextManager == null)
            cTextManager = new CTextManager(getInstance());
        return cTextManager;
    }

    public CustomNBTManager getCustomNBTManager() {
        if (CustomNBTManager == null)
            CustomNBTManager = new CustomNBTManager(getInstance());
        return CustomNBTManager;
    }

    public EventActionManager getEventActionManager() {
        if (eventActionManager == null)
            eventActionManager = new EventActionManager(getInstance());
        return eventActionManager;
    }

    public HomeManager getHomeManager() {
        if (homeManager == null)
            homeManager = new HomeManager(getInstance());
        return homeManager;
    }

    public SchedulerManager getSchedulerManager() {
        if (schedulerManager == null)
            schedulerManager = new SchedulerManager(getInstance());
        return schedulerManager;
    }

    public AnvilManager getAnvilManager() {
        if (anvilManager == null)
            anvilManager = new AnvilManager(getInstance());
        return anvilManager;
    }

    public TotemManager getTotemManager() {
        if (totemManager == null)
            totemManager = new TotemManager(getInstance());
        return totemManager;
    }

    public AnimationManager getAnimationManager() {
        if (AnimationManager == null)
            AnimationManager = new AnimationManager(getInstance());
        return AnimationManager;
    }

    public FindBiomeManager getFindBiomeManager() {
        return findBiomeManager;
    }

    public ChatFilterManager getChatFilterManager() {
        if (chatFilterManager == null)
            chatFilterManager = new ChatFilterManager(this);
        return chatFilterManager;
    }

    public SavedInventoryManager getSavedInventoryManager() {
        if (SavedInventoryManager == null)
            SavedInventoryManager = new SavedInventoryManager(this);
        return SavedInventoryManager;
    }

    BungeeCordManager BungeeCordManager;

    public BungeeCordManager getBungeeCordManager() {
        if (BungeeCordManager == null)
            BungeeCordManager = new BungeeCordManager(this);
        return BungeeCordManager;
    }

    public PatrolManager getPatrolManager() {
        if (PatrolManager == null)
            PatrolManager = new PatrolManager(this);
        return PatrolManager;
    }

    public RankManager getRankManager() {
        if (rankManager == null)
            rankManager = new RankManager(this);
        return rankManager;
    }

    public PlayerManager getPlayerManager() {
        if (PM == null)
            PM = new PlayerManager(this);
        return PM;
    }

    public Sorting getSortingManager() {
        return Sorting;
    }

    public TimeManager getTimeManager() {
        return TimeManager;
    }

    public VersionChecker getVersionCheckManager() {
        if (versionCheckManager == null)
            versionCheckManager = new VersionChecker(this);
        return versionCheckManager;
    }

    public CommandsHandler getCommandManager() {
        if (cManager == null)
            cManager = new CommandsHandler(this);
        return cManager;
    }

    public ElytraManager getElytraManager() {
        if (ElytraManager == null)
            ElytraManager = new ElytraManager(this);
        return ElytraManager;
    }

    public RepairManager getRepairManager() {
        if (RepairManager == null)
            RepairManager = new RepairManager(this);
        return RepairManager;
    }

    public RandomTeleportationManager getRandomTeleportationManager() {
        if (RandomTeleportationManager == null)
            RandomTeleportationManager = new RandomTeleportationManager(this);
        return RandomTeleportationManager;
    }

    public SavedItemManager getSavedItemManager() {
        if (SavedItemManager == null)
            SavedItemManager = new SavedItemManager(this);
        return SavedItemManager;
    }

    public PlayTimeManager getPlayTimeManager() {
        if (PlayTimeManager == null)
            PlayTimeManager = new PlayTimeManager(this);
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
        if (UtilManager == null)
            UtilManager = new Util(this);
        return UtilManager;
    }

    public Config getConfigManager() {
        if (config == null)
            config = new Config(this);
        return config;
    }

    public ScavengeManager getScavengeManager() {
        if (scavengeManager == null)
            scavengeManager = new ScavengeManager(this);
        return scavengeManager;
    }

    public DBManager getDbManager() {
        if (dbManager == null)
            dbManager = new DBManager(this);
        return dbManager;
    }

    public Language getLM() {
        if (languageManager == null) {
            languageManager = new Language(this);
            languageManager.reload();
        }
        return languageManager;
    }

    @Override
    public void onDisable() {
    }

    CMITask lagTask = null;

    public Scoreboard getSB() {
        return scoreboard;
    }

    public boolean safeRenameFile(String file, String toFile) {

        return false;
    }

    public void renameDirectory(String fromDir, String toDir) {

    }

    public void Enabled(boolean state) {
        this.setEnabled(state);
    }

    List<String> logo = new ArrayList<String>(Arrays.asList(
        "&7_______________________________________________________",
        "&7┏━━━┓ &f┏━┓┏━┓ &7┏━━┓",
        "&7┃┏━┓┃ &f┃ ┗┛ ┃ &7┗┫┣┛",
        "&7┃┃ ┗┛ &f┃┏┓┏┓┃ &7 ┃┃ ",
        "&7┃┃ ┏┓ &f┃┃┃┃┃┃ &7 ┃┃ ",
        "&7┃┗━┛┃ &f┃┃┃┃┃┃ &7┏┫┣┓",
        "&7┗━━━┛ &f┗┛┗┛┗┛ &7┗━━┛",
        "&7_______________________________________________________"

    ));

    List<String> SpigotLogo = new ArrayList<String>(Arrays.asList(
        "_______________________________________________________",
        "   ______  ____    ____  _____  ",
        " .' ___  ||_   \\  /   _||_   _| ",
        "/ .'   \\_|  |   \\/   |    | |   ",
        "| |         | |\\  /| |    | |   ",
        "\\ `.___.'\\ _| |_\\/_| |_  _| |_  ",
        " `.____ .'|_____||_____||_____| ",
        "_______________________________________________________"));

    List<String> FoliaError = new ArrayList<String>(Arrays.asList(
        "_______________________________________________________",
        "_ &5Folia server detected. Plugin isint fully compatible with this type of server, yet.",
        "_ &5Expect error messages!",
        "_______________________________________________________"));

    private int lastCMILibVersion = 1000100;
    private int requiredCMILibVersion = 1000100;
    private final String slastCMILibVersion = "1.0.1.0";
    private final String srequiredCMILibVersion = "1.0.1.0";
    public static int cmiLibId = 87610;

    @Override
    public void onEnable() {
        instance = this;
    }

    public void consoleMessage(String message) {

    }

    public void loadMessage(Object amount, String type, Long took) {
    }

    public String getOffOn(Player player, Player whoGets) {

        return getOffOn(whoGets.canSee(player));
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
        return getTarget(sender, playerName, cmd.getClass().getSimpleName(), true, true);
    }

    public Player getTarget(CommandSender sender, String playerName, Object cmd, boolean checkOrther) {
        return getTarget(sender, playerName, cmd.getClass().getSimpleName(), checkOrther, true);
    }

    public Player getTarget(CommandSender sender, String playerName, String cmd) {
        return getTarget(sender, playerName, cmd, true, true);
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
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), inform, checkOther, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd) {
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), true, true, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, Object cmd, boolean checkOther) {
        return getUser(sender, playerName, cmd.getClass().getSimpleName(), true, checkOther, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd) {
        return getUser(sender, playerName, cmd, true, true, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther) {
        return getUser(sender, playerName, cmd, inform, checkOther, true);
    }

    public CMIUser getUser(CommandSender sender, String playerName, String cmd, boolean inform, boolean checkOther, boolean informOnPerm) {
        CMIUser user = null;
        return user;
    }

    @Deprecated
    public Player getPlayer(String playerName) {
        return CMIUser.getPlayer(playerName);
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

    public TabComplete getTab() {
        return tab;
    }

    public int getViewRange(World world) {
        int view = Bukkit.getServer().getViewDistance();
        return view;
    }

    @Deprecated
    public void performCommand(CommandSender sender, Object cls) {
        performCommand(sender, cls, "");
    }

    public void performCommand(CommandSender sender, Class<?> clas) {
        performCommand(sender, CommandsHandler.getLabel() + " " + clas.getSimpleName());
    }

    @Deprecated
    public void performCommand(CommandSender sender, Object cls, String cmd) {
        performCommand(sender, CommandsHandler.getLabel() + " " + cls.getClass().getSimpleName() + (cmd.isEmpty() ? "" : " " + cmd));
    }

    public void performCommand(CommandSender sender, Class<?> clas, String cmd) {
        performCommand(sender, CommandsHandler.getLabel() + " " + clas.getSimpleName() + (cmd.isEmpty() ? "" : " " + cmd));
    }

    public void performCommand(CommandSender sender, String cmd) {

    }

    public boolean isFullyLoaded() {
        return fullyLoaded;
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

    public Permission getVaultPerm() {
        return vaultPerm;
    }

    public void setVaultPerm(Permission vaultPerm) {
        this.vaultPerm = vaultPerm;
    }

    public boolean isServerLoaded() {
        return serverLoaded;
    }
}
