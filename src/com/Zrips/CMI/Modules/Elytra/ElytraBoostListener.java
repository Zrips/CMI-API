package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Effect;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Speed;

public class ElytraBoostListener implements Listener {

    private CMI plugin;

    private Effect eff = null;

    HashMap<UUID, Speed> speedMap = new HashMap<UUID, Speed>();

    public ElytraBoostListener(CMI plugin) {
	this.plugin = plugin;
	for (Effect one : Effect.values()) {
	    if (one.name().equalsIgnoreCase("ENDERDRAGON_SHOOT"))
		eff = one;
	}
    }
}