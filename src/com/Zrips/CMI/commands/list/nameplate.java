package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class nameplate implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 70, info = "&eSet players name plate prefix, suffix or its color", args = "(playerName) (-pref:[some_prefix]) (-suf:[some_suffix]) (-c:[colorCode]) (reset) (-s)", tab = {
        "playername", "reset%%-pref:", "%%-suf:", "%%-c:" }, explanation = { "Use _ to add space and __ to add underscore for placeholder and similar" }, regVar = { -666 }, consoleVar = {
            -100 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
