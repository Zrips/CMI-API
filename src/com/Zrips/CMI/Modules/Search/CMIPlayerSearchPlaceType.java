package com.Zrips.CMI.Modules.Search;

public enum CMIPlayerSearchPlaceType {
    Inventory("inv", "inv%", "cmi inv [player]"), InventoryShulker("invS", "invS%", "cmi inv [player]"), InventoryBundle("invB", "invB%", "cmi inv [player]"), EnderChest("ender", "end%",
        "cmi ender [player]"), EnderChestShulker("enderS", "endS%", "cmi ender [player]"), EnderChestBundle("enderB", "endB%", "cmi ender [player]"), PlayerVaults("PlayerVault", "Pv%", "pv [player] [nr]"),
    Custom("", "Cs%", "");

    private String place;
    private String pref;
    private String cmd;

    private CMIPlayerSearchPlaceType(String place, String pref, String cmd) {
    }

    public String getPlace() {
        return null;
    }

    public String getPref() {
        return null;
    }

    public String getCmd() {
        return null;
    }
}
