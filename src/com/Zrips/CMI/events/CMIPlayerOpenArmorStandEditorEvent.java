package com.Zrips.CMI.events;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class CMIPlayerOpenArmorStandEditorEvent extends CMIPlayerCancellableEvent {
    private ArmorStand armorStand;

    public CMIPlayerOpenArmorStandEditorEvent(Player player, ArmorStand armorStand) {
        super(player);
    }

    public ArmorStand getArmorStand() {
        return null;
    }

    public void setArmorStand(ArmorStand armorStand) {
    }
}
