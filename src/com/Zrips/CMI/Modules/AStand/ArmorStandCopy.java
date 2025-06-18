package com.Zrips.CMI.Modules.AStand;

import java.util.Set;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandActions;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandExtraActions;

public class ArmorStandCopy {
    private Player player;
    private ArmorStand stand;
    private Set<armorStandActions> copy;
    private Set<armorStandExtraActions> extraCopy;

    ArmorStandCopy(Player player, ArmorStand stand, Set<armorStandActions> copy, Set<armorStandExtraActions> extraCopy) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public ArmorStand getStand() {
        return null;
    }

    public void setStand(ArmorStand stand) {
    }

    public Set<armorStandActions> getCopy() {
        return null;
    }

    public void duplicateOn(ArmorStand stand) {
    }

    public Set<armorStandExtraActions> getExtraCopy() {
        return null;
    }
}
