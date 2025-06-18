package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Animations.AnimationManager.LeatherAnimationType;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class dye implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eDye leather armor", args = "(playerName) (red,green,blue/hexCode/colorName/random/clear/rainbow/day/biome/health) (-s)", tab = {
        "playername%%random%%clear%%colors%%rainbow%%day%%_biome%%health" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static ItemStack setCustom(CommandSender sender, Player player, ItemStack iih, LeatherAnimationType custom) {
        return null;
    }
}
