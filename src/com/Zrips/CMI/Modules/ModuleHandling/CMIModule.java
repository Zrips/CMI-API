package com.Zrips.CMI.Modules.ModuleHandling;

import java.lang.reflect.Constructor;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.AllListeners.BossBarCompassListener;
import com.Zrips.CMI.AllListeners.CustomMessagesListener;
import com.Zrips.CMI.AllListeners.FirstJoinListener;
import com.Zrips.CMI.AllListeners.NoTargetListener;
import com.Zrips.CMI.AllListeners.PlayerItemDamageListener;
import com.Zrips.CMI.AllListeners.UserCuffedEvents;
import com.Zrips.CMI.AllListeners.WorldLimits;
import com.Zrips.CMI.AllListeners.versionCheck;
import com.Zrips.CMI.Modules.AStand.ArmorStandListener;
import com.Zrips.CMI.Modules.Afk.AfkListener;
import com.Zrips.CMI.Modules.Animations.AnimationColoredArmorListener;
import com.Zrips.CMI.Modules.Animations.AnimationSitListener;
import com.Zrips.CMI.Modules.Anvil.AnvilColorRenameListener;
import com.Zrips.CMI.Modules.Anvil.AnvilUnlimitedListener;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTListener;
import com.Zrips.CMI.Modules.ChatTag.TagListener;
import com.Zrips.CMI.Modules.CmdCooldown.CooldownListener;
import com.Zrips.CMI.Modules.CmdWarmUp.WarmUpListener;
import com.Zrips.CMI.Modules.DynamicSigns.SignListener;
import com.Zrips.CMI.Modules.Elytra.ElytraBoostListener;
import com.Zrips.CMI.Modules.Elytra.ElytraExploitListener;
import com.Zrips.CMI.Modules.Elytra.ElytraLaunchListener;
import com.Zrips.CMI.Modules.Enchants.EnchantListener;
import com.Zrips.CMI.Modules.EventActions.EventActionListener;
import com.Zrips.CMI.Modules.EventActions.EventActionListener19;
import com.Zrips.CMI.Modules.FlightCharge.FlightListener;
import com.Zrips.CMI.Modules.Holograms.HologramListener;
import com.Zrips.CMI.Modules.Homes.HomeListener;
import com.Zrips.CMI.Modules.HpBar.HpBarListener;
import com.Zrips.CMI.Modules.InteractiveCommand.InteractiveCommandListener;
import com.Zrips.CMI.Modules.Jail.JailListener;
import com.Zrips.CMI.Modules.Kits.KitListener;
import com.Zrips.CMI.Modules.Mirror.MirrorListener;
import com.Zrips.CMI.Modules.MoneyCheque.MoneyChequeListener;
import com.Zrips.CMI.Modules.Painting.PaintingListener;
import com.Zrips.CMI.Modules.PlayTime.PlayTimeListener;
import com.Zrips.CMI.Modules.Portals.PortalListener;
import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerBoxListener;
import com.Zrips.CMI.Modules.SilentChest.silentChestListener;
import com.Zrips.CMI.Modules.Skin.SkinListener;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerActionsListener;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerChargeListener;
import com.Zrips.CMI.Modules.SpawnerCharge.SpawnerProximityListener;
import com.Zrips.CMI.Modules.TabList.TabListListener;
import com.Zrips.CMI.Modules.TimedCommands.TimedCommandListener;
import com.Zrips.CMI.Modules.Totems.ResurectionListener;
import com.Zrips.CMI.Modules.Vanish.VanishListener;
import com.Zrips.CMI.Modules.Selection.SelectionListener;
import com.Zrips.CMI.Modules.Votifier.VotifierListener;
import com.Zrips.CMI.utils.VersionChecker.Version;

public enum CMIModule {

    silentChest("Handles silent chest opening actions", new CMIModuleClass(silentChestListener.class)),
    versionCheck("Version check when player logs in", new CMIModuleClass(versionCheck.class)),
    worldLimits("World limitations: fly, game mode and god mode", new CMIModuleClass(WorldLimits.class)),
    customMessages("Login, logout and death messages", new CMIModuleClass(CustomMessagesListener.class)),
    firstJoinMessages("First join messages", new CMIModuleClass(FirstJoinListener.class)),
    cuffed("Handling of cuffed players", new CMIModuleClass(UserCuffedEvents.class)),
    durabilityLoss("Handling of messages appearing when item durability gets low", new CMIModuleClass(PlayerItemDamageListener.class)),
    mirror("Handling of mirror feature, which checks block place and break actions", new CMIModuleClass(MirrorListener.class)),
    spawners("Spawner handling, like drop, place, egg interactions", new CMIModuleClass(SpawnerActionsListener.class)),
    spawnerProximity("Checking spawner place proximity", new CMIModuleClass(SpawnerProximityListener.class)),
    spawnerCharge("Checking spawner charges", new CMIModuleClass(SpawnerChargeListener.class)),
    cooldown("Handling of command cooldowns", new CMIModuleClass(CooldownListener.class)),
    warmup("Handling of command warmups", new CMIModuleClass(WarmUpListener.class)),
    interactiveCommands("Handling of interactive commands", new CMIModuleClass(InteractiveCommandListener.class)),
    attachedCommands("Handling of attached commands", new CMIModuleClass(CustomNBTListener.class)),
    playerChatTag("Handling of player tagging in chat and tabcomplete with @", new CMIModuleClass(TagListener.class)),
    tablist("Handling of tablist", new CMIModuleClass(TabListListener.class)),
    paintingEditor("Handling of painting editing with shift+right click", new CMIModuleClass(PaintingListener.class)),
    vanish("Handles player vanish mode", new CMIModuleClass(VanishListener.class)),
    moneyCheque("Handles money cheques", new CMIModuleClass(MoneyChequeListener.class)),
    armorstand("Handles armor stand editor", new CMIModuleClass(ArmorStandListener.class)),
    cmiPlaytime("Handles dedicated CMI playtime tracker", new CMIModuleClass(PlayTimeListener.class)),
    holograms("Handles hologram updates", new CMIModuleClass(HologramListener.class)),
    portals("Handles portals", new CMIModuleClass(PortalListener.class)),
    homeInteractions("Handles home bed interactions and bed destroy events. Disabling this homes will still work", new CMIModuleClass(HomeListener.class)),
    dynamicSigns("Handles dynamic signs", new CMIModuleClass(SignListener.class)),
    coloredArmor("Handles leather armor which has dynamic colors", new CMIModuleClass(AnimationColoredArmorListener.class)),
    noTarget("Handles entity target prevention on player /cmi notarget", new CMIModuleClass(NoTargetListener.class)),
    ranks("Handles rankup system"),
    votifier("Handles votifier system", new CMIModuleClass(VotifierListener.class)),
    kits("Handles kit listener, mainly to give out new player kit", new CMIModuleClass(KitListener.class)),
    schedule("Handles schedule system"),
    namePlates("Handles player name plates"),
    jail("Handles jail system", new CMIModuleClass(JailListener.class)),
    flightCharge("Handles cmi flight charge system", new CMIModuleClass(FlightListener.class)),
    shulkerBackpack("Handles shulker box as backpacks", new CMIModuleClass(ShulkerBoxListener.class, Version.v1_11_R1)),
    skin("Handles player skins", new CMIModuleClass(SkinListener.class, Version.v1_8_R1)),
    selection("Handles selection areas. While this is disabled, command can still be used", new CMIModuleClass(SelectionListener.class)),
    hpBossBar("Handles mob and player hp bars as boss bar", new CMIModuleClass(HpBarListener.class, Version.v1_9_R1)),
    afk("Handling of afk feature. This will disable any checks related to afk and players will never get into afk mode", new CMIModuleClass(AfkListener.class)),
    timedCommands("Handling timed commands like tfly and tgod", new CMIModuleClass(TimedCommandListener.class)),
    eventCommands("Handling of eventCommands.yml feature ", new CMIModuleClass(EventActionListener.class), new CMIModuleClass(EventActionListener19.class, Version.v1_9_R1)),
    disabledEnchants("Handling of disabled enchants in inventory", new CMIModuleClass(EnchantListener.class)),
    sitAnimation("Handling of siting on blocks", new CMIModuleClass(AnimationSitListener.class, Version.v1_8_R1)),
    bossBarCompass("Handling of boss bar compass", new CMIModuleClass(BossBarCompassListener.class, Version.v1_9_R1)),
    elytraBoost("Elytra boost", new CMIModuleClass(ElytraBoostListener.class, Version.v1_9_R1)),
    elytraLaunch("Elytra launch", new CMIModuleClass(ElytraLaunchListener.class, Version.v1_9_R1)),
    elytraExploit("Exploit prevention, like using trident for infinite flight or self damage with arrow", new CMIModuleClass(ElytraExploitListener.class, Version.v1_9_R1)),
    totemBehavior("Handling of custom totem behavior", new CMIModuleClass(ResurectionListener.class, Version.v1_11_R1)),
    anvilRenameColor("Handling of anvil item renaming and colorization", new CMIModuleClass(AnvilColorRenameListener.class, Version.v1_9_R1)),
    anvilUnlimitedRepair("Handling of anvil unlimited repair", new CMIModuleClass(AnvilUnlimitedListener.class, Version.v1_9_R1));

    private CMIModuleClass[] listeners;
    private boolean enabled = true;
    private String desc;

    CMIModule(String desc, CMIModuleClass... listener) {
	this.desc = desc;
	this.listeners = listener;
    }

    public static CMIModule getByName(String name) {
	return null;
    }

    public static boolean isEnabled(String name) {
	return true;
    }

    public Version getFromVersion() {
	return null;
    }

    public Version getToVersion() {
	return null;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void registerListener() {

    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

    public CMIModuleClass[] getListeners() {
	return listeners;
    }
}
