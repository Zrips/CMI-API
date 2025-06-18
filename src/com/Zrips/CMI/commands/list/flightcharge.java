package com.Zrips.CMI.commands.list;

import java.util.List;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class flightcharge implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eManage and check flight charges", args = "(add/take/set/show/expcharge/moneycharge/recharge) (playerName) (amount) (-s)", tab = {
        "add%%take%%set%%show%%expcharge%%moneycharge%%recharge", "playername" }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 2, 3, 4 }, customAlias = { "!+recharge:recharge",
            "!fcharge" }, alias = true, modules = "flightcharge", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static List<String> updateLore(List<String> lore, int missing, double cost, boolean money) {
        return null;
    }

    private static String format(double amount, double missing, double cost, boolean money) {
        return null;
    }

    private static void inform(CommandSender sender, CMIUser user, boolean silent) {
    }

    public static boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount) {
        return false;
    }

    public static boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent) {
        return false;
    }

    public static boolean moneyRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent) {
        return false;
    }

    private enum Action {
        add, take, set, show, expcharge, moneycharge, recharge;

        public static Action getByName(String name) {
            return null;
        }
    }
}
