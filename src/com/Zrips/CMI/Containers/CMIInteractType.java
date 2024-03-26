package com.Zrips.CMI.Containers;

import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

public enum CMIInteractType {
    LeftClick, RightClick, LeftShiftClick, RightShiftClick;

    public static CMIInteractType getByName(String name) {
        return null;
    }

    public static CMIInteractType getFromAction(Action action, Player player) {

        CMIInteractType type = CMIInteractType.LeftClick;
        return type;
    }
}
