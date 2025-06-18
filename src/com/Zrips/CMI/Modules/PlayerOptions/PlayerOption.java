package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Version.Version;

public enum PlayerOption {
    visibleHolograms(10, true, "&eVisible holograms", CMIMaterial.BLACK_STAINED_GLASS), shiftSignEdit(10, true, "&eSign shift edit", CMIMaterial.OAK_SIGN), totemBossBar(10, true, "&eTotem BossBar",
        CMIMaterial.TOTEM_OF_UNDYING), bossBarCompass(10, true, "&eCompass BossBar", CMIMaterial.COMPASS), tagSound(10, true, "&eChat tagging sound", CMIMaterial.PAPER), chatSpy(10, false, "&eChat spy",
            CMIMaterial.BUCKET), cmdSpy(10, false, "&eCommand spy", CMIMaterial.WATER_BUCKET), signSpy(10, false, "&eSign spy", CMIMaterial.LAVA_BUCKET), acceptingPM(10, true,
                "&eAccepting private messages", CMIMaterial.MAP), acceptingTPA(10, true, "&eAccepting teleportations to you", CMIMaterial.CLOCK), acceptingMoney(10, true, "&eAccepting money payments",
                    CMIMaterial.KNOWLEDGE_BOOK), chatbubble(10, true, "&eChat bubbles", CMIMaterial.LANTERN, Version.v1_19_R3), pmSound(10, true, "&ePrivate messages sounds", CMIMaterial.STONE_BUTTON),
    rideMe(10, true, "&ePlayers can ride you", CMIMaterial.SADDLE), pveDamageNumbers(10, true, "&eShows PvE damage numbers", CMIMaterial.WOODEN_SWORD), pvpDamageNumbers(10, true,
        "&eShows PvP damage numbers", CMIMaterial.DIAMOND_SWORD), InformDurability(10, true, "&eInform on item durability loss", CMIMaterial.ANVIL), receivePets(10, true,
            "&eDo you want to receive pets as gifts", CMIMaterial.LEAD);

    private int slot;
    private boolean defaults = true;
    private boolean globalEnabled = true;
    private ItemStack icon;
    private String desc;
    private Version versionFrom;
    private static HashMap<String, PlayerOption> cache = new HashMap<>();
    public static String defaultString = "";

    PlayerOption(int slot, boolean defaults, String desc, CMIMaterial icon) {
    }

    PlayerOption(int slot, boolean defaults, String desc, CMIMaterial icon, Version version) {
    }

    public int getUISlot() {
        return 0;
    }

    public boolean isEnabled() {
        return false;
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String desc) {
    }

    void setEnabled(Boolean state) {
    }

    public static PlayerOption get(String name) {
        return null;
    }

    private static String to(boolean state) {
        return null;
    }

    private static boolean from(String state) {
        return false;
    }

    public static HashMap<PlayerOption, Boolean> fromString(String line) {
        return null;
    }

    public static String toString(HashMap<PlayerOption, Boolean> map) {
        return null;
    }

    public static String toDefaultValueString() {
        return null;
    }

    public boolean isGlobalEnabled() {
        return false;
    }

    public void setGlobalEnabled(boolean globalEnabled) {
    }

    public ItemStack getIcon() {
        return null;
    }

    public void setIcon(ItemStack icon) {
    }

    public Version getVersionFrom() {
        return null;
    }
}
