package com.Zrips.CMI.Containers;

public enum ActionType {
    NORMAL("Normal"),
    ENDER("Ender"),
    CHECKING("Checking"),
    NONE("NONE");
    
    private String name;
    private ActionType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
