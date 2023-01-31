package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIMaterial;

public enum PlayerOption {

    // Add new entry to the end, ALWAYS.
    visibleHolograms(10, true, "&eVisible holograms", CMIMaterial.BLACK_STAINED_GLASS),
    shiftSignEdit(10, true, "&eSign shift edit", CMIMaterial.OAK_SIGN),
    totemBossBar(10, true, "&eTotem BossBar", CMIMaterial.TOTEM_OF_UNDYING),
    bassBarCompass(10, true, "&eCompass BossBar", CMIMaterial.COMPASS),
    tagSound(10, true, "&eChat tagging sound", CMIMaterial.PAPER),
    chatSpy(10, false, "&eChat spy", CMIMaterial.BUCKET),
    cmdSpy(10, false, "&eCommand spy", CMIMaterial.WATER_BUCKET),
    signSpy(10, false, "&eSign spy", CMIMaterial.LAVA_BUCKET),
    acceptingPM(10, true, "&eAccepting private messages", CMIMaterial.MAP),
    acceptingTPA(10, true, "&eAccepting teleportations to you", CMIMaterial.CLOCK),
    acceptingMoney(10, true, "&eAccepting money payments", CMIMaterial.KNOWLEDGE_BOOK);
    // Add new entry to the end, ALWAYS.

    private int slot;
    private boolean defaults = true;
    private boolean globalEnabled = true;
    private ItemStack icon;
    private String desc;

    PlayerOption(int slot, boolean defaults, String desc, CMIMaterial icon) {
        this.slot = slot;
        this.defaults = defaults;
        this.desc = desc;
        this.icon = icon.newItemStack();
    }

    public int getUISlot() {
        return slot;
    }

    public boolean isEnabled() {
        return defaults;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    void setEnabled(Boolean state) {
        defaults = state;
    }

    private static HashMap<String, PlayerOption> cache = new HashMap<String, PlayerOption>();

    static {
        for (PlayerOption one : PlayerOption.values()) {
            cache.put(one.toString().toLowerCase(), one);
        }
    }

    public static PlayerOption get(String name) {
        return cache.get(name.toLowerCase());
    }

    private static String to(boolean state) {
        return state ? "1" : "0";
    }

    private static boolean from(String state) {
        return state.equals("1") ? true : false;
    }

    public static HashMap<PlayerOption, Boolean> fromString(String line) {
        HashMap<PlayerOption, Boolean> map = new HashMap<PlayerOption, Boolean>();
        return map;
    }

    public static String toString(HashMap<PlayerOption, Boolean> map) {
        StringBuilder line = new StringBuilder();
        return line.toString();
    }

    public static String defaultString = "";

    public static String toDefaultValueString() {

        return PlayerOptionsManager.defaultString;
    }

    public boolean isGlobalEnabled() {
        return globalEnabled;
    }

    public void setGlobalEnabled(boolean globalEnabled) {
        this.globalEnabled = globalEnabled;
    }

    public ItemStack getIcon() {
        return icon;
    }

    public void setIcon(ItemStack icon) {
        this.icon = icon;
    }
}
