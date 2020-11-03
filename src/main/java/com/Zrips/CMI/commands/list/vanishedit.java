package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

public class vanishedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    public enum VanishAction {
	// Add new thing to the end, always.
	isVanished(4, false, "&eVanished"),
	damageToEntity(10, false, "&eCan deal damage to others"),
	playerDamage(11, false, "&eCan take damage"),
	itemPickup(12, false, "&eCan pickup items"),
	mobAggro(13, false, "&eMobs can target"),
	interaction(14, false, "&eCan physically interact"),
	noisyChest(15, false, "&eNoisy chest's"),
	informOnLeave(19, false, "&eShows leave message"),
	informOnJoin(20, false, "&eShows join message"),
	nightVision(16, true, "&eApply night vision"),
	bossbar(24, true, "&eShow bossBar when vanished"),
	afkcommands(25, false, "&eTrigger afk when vanished"),
	PrivateMessages(22, false, "&eAccept private messages"),
	relogDisable(23, false, "&eDisable vanish on relog"),
	noMessages(21, false, "&eNo public messages"),
	fakeJoinLeave(31, false, "&eShow fake join/leave messages on vanish state change"),	
	mobSpawning(32, false, "&eMobs will spawn nearby");

	private int slot;
	private boolean defaults = true;
	private String desc;

	VanishAction(int slot, boolean defaults, String desc) {
	    this.slot = slot;
	    this.defaults = defaults;
	    this.desc = desc;
	}

	public int getSlot() {
	    return slot;
	}

	public void setSlot(int slot) {
	    this.slot = slot;
	}

	public boolean isEnabled() {
	    return defaults;
	}

	public void setEnabled(boolean defaults) {
	    this.defaults = defaults;
	}

	public String getDesc() {
	    return desc;
	}

	public void setDesc(String desc) {
	    this.desc = desc;
	}

	public static VanishAction get(String name) {
	    for (VanishAction oneA : VanishAction.values()) {
		if (oneA.name().equalsIgnoreCase(name)) {
		    return oneA;
		}
	    }
	    return null;
	}
    }

    @Override
    @CAnnotation(priority = 120, info = "&eEdit vanish mode for player", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = {
	666 }, modules = "vanish", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
	return true;
    }

}
