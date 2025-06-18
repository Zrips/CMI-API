package com.Zrips.CMI.Modules.Vanish;

public enum VanishAction {
    isVanished(4, false, "&eVanished"), damageToEntity(10, false, "&eCan deal damage to others"), playerDamage(11, false, "&eCan take damage"), itemPickup(12, false, "&eCan pickup items"), mobAggro(13,
        false, "&eMobs can target"), interaction(14, false, "&eCan physically interact"), noisyChest(15, false, "&eNoisy chest's"), informOnLeave(19, false, "&eShows leave message"), informOnJoin(20,
            false, "&eShows join message"), nightVision(16, true, "&eApply night vision"), bossbar(24, true, "&eShow bossBar when vanished"), afkcommands(25, false, "&eTrigger afk commands when vanished"),
    PrivateMessages(22, false, "&eAccept private messages"), relogDisable(23, false, "&eDisable vanish on relog"), noMessages(21, false, "&eNo public messages"), fakeJoinLeave(29, false,
        "&eShow fake join/leave messages on vanish state change"), mobSpawning(30, false, "&eMobs will spawn nearby"), stopPlaytime(32, true, "&ePlaytime will stop increasing"), sleepIgnore(33, true,
            "&eIgnore for sleeping count"), joinVanished(8, false, "&eAlways join in vanish mode"), deathMessages(31, false, "&eShow death message"), hookPlayers(34, false, "&eHooking entities"), level(3,
                10, "&eVanish level");

    private int slot;
    private boolean defaults = true;
    private String desc;
    private int maxValue = 0;
    private static String defaultString = null;

    VanishAction(int slot, boolean defaults, String desc) {
    }

    VanishAction(int slot, int maxValue, String desc) {
    }

    public VanishActionState valueFomString(String value) {
        return null;
    }

    public int getSlot() {
        return 0;
    }

    public void setSlot(int slot) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean defaults) {
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String desc) {
    }

    public static VanishAction get(String name) {
        return null;
    }

    public int getMaxValue() {
        return 0;
    }

    public void setMaxValue(int maxValue) {
    }

    public static String getDefaultConfigString() {
        return null;
    }

    public static String getDefaultInternalString() {
        return null;
    }
}
