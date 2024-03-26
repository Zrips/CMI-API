package com.Zrips.CMI.Modules.ModuleHandling;

import net.Zrips.CMILib.Version.Version;

public enum CMIModule {

    silentChest("Handles silent chest opening actions"),
    versionCheck("Version check when player logs in"),
    worldLimits("World limitations: fly, game mode and god mode"),
    worldLimitsElytra("World limitations: elytra mode"),
    customMessages("Login, logout and death messages"),
    firstJoinMessages("First join messages"),
    cuffed("Handling of cuffed players"),
    durabilityLoss("Handling of messages appearing when item durability gets low"),
    mirror("Handling of mirror feature, which checks block place and break actions"),
    spawners("Spawner handling, like drop, place, egg interactions"),
    spawnerProximity("Checking spawner place proximity"),
    spawnerCharge("Checking spawner charges"),
    warmup("Handling of command warmups"),
    cooldown("Handling of command cooldowns"),
    interactiveCommands("Handling of interactive commands"),
    attachedCommands("Handling of attached commands"),
    armorEffects("Handling of armor effects"),
    playerChatTag("Handling of player tagging in chat and tabcomplete with @"),
    chatBubble("Handling of chat bubbles"),
    tablist("Handling of tablist"),
    paintingEditor("Handling of painting editing with shift+right click"),
    vanish("Handles player vanish mode"),
    moneyCheque("Handles money cheques"),
    armorstand("Handles armor stand editor"),
    cmiPlaytime("Handles dedicated CMI playtime tracker"),
    holograms("Handles hologram updates"),
    portals("Handles portals"),
    homeInteractions("Handles home bed interactions and bed destroy events. Disabling this homes will still work"),
    dynamicSigns("Handles dynamic signs"),
    signEdit("Handles sign editing"),
    coloredArmor("Handles leather armor which has dynamic colors"),
    noTarget("Handles entity target prevention on player /cmi notarget"),
    ranks("Handles rankup system"),
    votifier("Handles votifier system"),
    playerCombat("Handles player combat system"),
    headDrop("Handles head drops system"),
    kits("Handles kit listener, mainly to give out new player kit"),
    schedule("Handles schedule system"),
    namePlates("Handles player name plates"),
    jail("Handles jail system"),
    flightCharge("Handles cmi flight charge system"),
    shulkerBackpack("Handles shulker box as backpacks"),
    skin("Handles player skins"),
    selection("Handles selection areas. While this is disabled, command can still be used"),
    hpBossBar("Handles mob and player hp bars as boss bar"),
    afk("Handling of afk feature. This will disable any checks related to afk and players will never get into afk mode"),
    timedCommands("Handling timed commands like tfly and tgod"),
    eventCommands("Handling of eventCommands.yml feature "),
    disabledEnchants("Handling of disabled enchants in inventory"),
    sitAnimation("Handling of siting on blocks"),
    rideAnimation("Handling of ride suffocation detection"),
    bossBarCompass("Handling of boss bar compass"),
    elytraBoost("Elytra boost"),
    elytraLaunch("Elytra launch"),
    elytraExploit("Exploit prevention, like using trident for infinite flight or self damage with arrow"),
    totemBehavior("Handling of custom totem behavior"),
    anvilRenameColor("Handling of anvil item renaming and colorization"),
    launchPad("Handling of launch command falldamage"),
    deathMessages("Handling of launch custom death messages")
    ;

    private CMIModuleClass[] listeners;
    private boolean enabled = true;
    private String desc;

    CMIModule(String desc, CMIModuleClass... listener) {
        this.desc = desc;
        this.listeners = listener;
    }

    public static CMIModule getByName(String name) {
        for (CMIModule one : CMIModule.values()) {
            if (one.toString().equalsIgnoreCase(name))
                return one;
        }
        return null;
    }

    public static boolean isEnabled(String name) {
        for (CMIModule one : CMIModule.values()) {
            if (one.toString().equalsIgnoreCase(name))
                return one.enabled;
        }
        return true;
    }

    public Version getFromVersion() {
        Version from = Version.v1_7_R4;
        if (listeners != null)
            for (CMIModuleClass CMIlistener : listeners) {
                if (CMIlistener.getFrom() != null && CMIlistener.getFrom().isHigher(from))
                    from = CMIlistener.getFrom();
            }
        return from;
    }

    public Version getToVersion() {
        Version to = null;
        if (listeners != null)
            for (CMIModuleClass CMIlistener : listeners) {
                if (CMIlistener.getTo() != null)
                    to = CMIlistener.getTo();
            }
        return to;
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
