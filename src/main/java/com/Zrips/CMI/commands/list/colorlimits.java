package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

public class colorlimits implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    public static enum CMIColorTypes {
	publicmessage(true), privatemessage(true), me(true), nickname(true), signs(false), books(true);

	private boolean clean;

	CMIColorTypes(boolean clean) {
	    this.clean = clean;
	}

	public boolean isClean() {
	    return clean;
	}

	public void setClean(boolean clean) {
	    this.clean = clean;
	}
    }

    @Override
    @CAnnotation(priority = 125, info = "&eShows all possible colors", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = {
	0, 1 }, consoleVar = { 1 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {


	return true;
    }

}
