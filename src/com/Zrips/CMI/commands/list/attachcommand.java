package com.Zrips.CMI.commands.list;

import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class attachcommand implements Cmd {
    public static final String seperator = null;
    static Pattern limitedPattern;
    static Pattern safeLimitedPattern;
    static Pattern cooldownPattern;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eAttaches command to item", args = "[command/-clear]", multiTab = { "-clear,[attachedCommand]" }, explanation = { "Separate commands with ",
        "You can define to run command on left or right mouse click separately with", "!left! to perform command on left mouse click", "!right! to perform command on right click",
        "!limiteduse:[amount]! defines how many times you can use this item", "!safelimiteduse:[amount]! will not remove item after all usages are used",
        "!cc! performs command from console, requires cmi.command.attachcommand.cc permission", "!cooldownn:[amount]! adds cooldown on item usage.",
        "[interactedPlayer] inserts name of player you interacted while holding item", "Global variables working in addition with [itemUses]" }, regVar = { -666 }, consoleVar = {
            666 }, alias = true, customAlias = { "!powertool" }, modules = { "attachedcommands" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static Boolean process(CommandSender sender, String command, ItemStack iih, Player player) {
        return null;
    }

    private List<String> processCooldowns(ItemStack iih) {
        return null;
    }
}
