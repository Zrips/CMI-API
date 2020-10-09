package com.Zrips.CMI.Containers;

public enum ScanFindPlace {
    CHEST("Chest"),
    TRAPPED_CHEST("Traped chest"),
    FURNACE("Furnace"),
    DROPPER("Dropper"),
    DISPENSER("Dispenser"),
    ITEM_FRAME("Item frame"),
    HOPPER("Hopper"),
    BREWING_STAND("Brewing stand"),
    HORSE("Horse"),
    ENTITY("Entity"),
    MINECART_CHEST("Minecart chest"),
    MINECART_HOPPER("Minecart hopper"),
    ARMOR_STAND("Armor stand"),
    SHULKER_BOX("Shulker box"),
    SHULKER_INCEPTION("Shulker box inside [type]"),
    UNKNOWN("Unknown");
    
    private String name;
    private ScanFindPlace(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
