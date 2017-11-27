package com.Zrips.CMI.Modules.Search;

public enum SearchType {
    ID("Id"),
    NAME("Name"),
    LORE("Lore"),
    GM("Gm"),
    GOD("God"),
    ENCHANT("Enchant"),
    MAXHP("MaxHp"),
    POTION("Potion"),
    FLY("Fly"),
    OVERSIZE("Oversize");
    
    private String name;
    private SearchType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
