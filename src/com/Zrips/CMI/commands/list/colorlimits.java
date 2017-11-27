package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;
import com.Zrips.CMI.utils.RawMessage;

public class colorlimits implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
	c.get("publicmessage", " &ePublic: ");
	c.get("privatemessage", " &ePrivate: ");
	c.get("nickname", " &eNickName: ");
	c.get("signs", " &eSigns: ");
	c.get("None", "&e-");
    }

    public static enum CMIColorTypes {
	publicmessage(true), privatemessage(true), nickname(true), signs(false);
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
    @CAnnotation(priority = 125, info = "&eShows all posible colors", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = {
	0, 1 }, consoleVar = { 1 })
    public boolean perform(CMI pl, CommandSender sender, String[] args) {

	return true;
    }

    private static RawMessage get(Player player, String type) {

	return null;
    }
}
