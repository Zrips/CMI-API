package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class panimation implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&ePlay custom particle animation", args = "(variable/playerName/stopAll) (stop)", tab = { "circle;effect:flying_glyph%%playername%%stopAll",
        "stop" }, explanation = { "Information on usage can be found at https://www.zrips.net/cmi/extra/particles/" }, regVar = { 1, 2 }, consoleVar = { 1, 2 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        stop, stopall;

        public static Action getByName(String name) {
            return null;
        }
    }
}
