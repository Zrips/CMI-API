package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ptime implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 230, info = "&eControls player personal time", args = "(freeze/unfreeze/day/night/dusk/morning/realtime/reset) (playerName) (-s)", tab = {
        "freeze%%unfreeze%%day%%night%%dusk%%morning%%realtime%%reset", "playername" }, explanation = { "Example:", "/ptime 13:00:00", "/ptime 1pm", "/ptime 13", "/ptime 7000ticks", "/ptime Zrips 1pm",
            "/ptime freeze", "/ptime unfreeze", "/ptime realtime", "/ptime reset" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void timeSet(CMI plugin, CommandSender sender, long time, Player player, boolean silent) {
    }

    private enum Action {
        freeze, unfreeze, day, morning, night, dusk, realtime, reset, na;

        public static Action getByName(String name) {
            return null;
        }
    }
}
