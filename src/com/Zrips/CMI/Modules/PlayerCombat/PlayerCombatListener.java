package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class PlayerCombatListener implements Listener {
    private CMI plugin;

    public PlayerCombatListener(CMI plugin) {
	this.plugin = plugin;
    }

    Set<UUID> ignoreFall = new HashSet<UUID>();

}
