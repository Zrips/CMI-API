package com.Zrips.CMI.commands.list;

import org.bukkit.World;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class time implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 230, info = "&eControls server time", args = "(time) (world) (alter [value]) (-smooth)", multiTab = { "1pm,7000ticks [worlds],all,-smooth -smooth",
        "day,night,dusk,morning -smooth", "freeze", "unfreeze", "add,take 0:30 [worlds],all", "realtime [worlds]", "autorealtime start,stop" }, explanation = { "Example:", "/day", "/night",
            "/time 13:00:00", "/time 1pm", "/time 13", "/time 7000ticks", "/time 1pm Lt_Craft", "/time 1pm all", "/time add 0:30", "/time take 0:30", "/time freeze", "/time unfreeze", "/time realtime",
            "/time autorealtime start/stop" }, regVar = { -66 }, consoleVar = { -66 }, alias = true, customAlias = { "!+day:day", "!+night:night", "!+morning:morning", "!+dusk:dusk" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void timeSet(CMI plugin, CommandSender sender, long time, World world) {
    }

    private enum Action {
        freeze, unfreeze, day, morning, night, dusk, add, take, realtime, autorealtime, na;

        public static Action getByName(String name) {
            return null;
        }
    }
}
