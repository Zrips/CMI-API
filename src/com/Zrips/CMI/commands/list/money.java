package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class money implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eManage money balance", args = "[pay/give/take/set] [playerName/all/alloffline/allonline] [amount][%rand/1-1000%][1%[min-max][[playerName]]] (-s)", tab = {
        "pay%%give%%take%%set", "playername%%-all%%-alloffline%%-allonline", "-s%%" }, explanation = {}, regVar = { 0, 1, 3, 4 }, consoleVar = { 1, 3, 4 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Actions {
        pay(false), send(false), give(true), add(true), take(true), set(true);

        private boolean adminCmd;

        Actions(boolean adminCmd) {
        }

        public static Actions getByName(String name) {
            return null;
        }

        public boolean isAdminCmd() {
            return false;
        }
    }

    private enum TargetPlayers {
        single, all, allonline, alloffline;

        public static TargetPlayers getByName(String name) {
            return null;
        }
    }
}
