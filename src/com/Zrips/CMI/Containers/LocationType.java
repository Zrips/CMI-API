package com.Zrips.CMI.Containers;

public enum LocationType {
    INVENTORY("Inventory"),
    ENDERCHEST("Enderchest");
    
    private String name;
    private LocationType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
