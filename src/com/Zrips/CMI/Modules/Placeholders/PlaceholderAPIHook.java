package com.Zrips.CMI.Modules.Placeholders;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import me.clip.placeholderapi.external.EZPlaceholderHook;

public class PlaceholderAPIHook extends EZPlaceholderHook {

    private CMI plugin;

    public PlaceholderAPIHook(CMI plugin) {
	super(plugin, "cmi");
	this.plugin = plugin;
    }

    public enum CMIPlaceHolders {
	user_charges_left,
	user_charges_max,
	user_charges_time,
	user_charges_cooldown,
	user_display_name,
	user_nickname,
	user_name,
	user_cuffed,
	user_god,
	user_afk,
	user_joinedcounter,
	user_banned,
	user_maxhomes,
	user_homeamount,
	user_vanished_symbol,
	user_balance_formated,
	user_balance;

	public static CMIPlaceHolders getByName(String name) {
	    name = name.replace("_", "");
	    for (CMIPlaceHolders one : CMIPlaceHolders.values()) {
		String n = one.name().replace("_", "");
		if (n.equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}

	public String getFull() {
	    return "%cmi_" + this.name() + "%";
	}
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
	return null;
    }

}
