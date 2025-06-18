package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class exp implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 180, info = "&eSet players exp. Use L to set levels", args = "[playerName] [add/set/take/clear] [amount][%rand/10-20%][1%[min-max][[playerName]]] (-s)", tab = {
        "playername" }, explanation = { "Example:", "/exp 10", "/exp add 10", "/exp set 10L", "/exp take 10", "/exp Zrips clear", "/exp Zrips add 10", "/exp Zrips add 10%[10-50]" }, regVar = { 0, 1, 2, 3,
            4 }, consoleVar = { 1, 2, 3, 4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static long processValue(CMIUser user, long amount, Integer percentMin, Integer percentMax, String percentPlayerName, boolean level) {
        return 0;
    }

    private enum Action {
        Set, Add, Clear, Take;
    }
}
