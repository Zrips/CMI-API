package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class setwarp implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 115, info = "&eSets warp location", args = "[warpName] (reqPermission) (hand/head/head:[playerName]) (slot) (autoLore) (-g:[groupName]) (world;x;y;z;yaw;pitch) (-confirm)", explanation = {
        "Examples:", "/cmi setwarp spawn - simple warp to spawn", "/cmi setwarp spawn true - creates warp and will require cmi.command.warp.[warpname] permission node to use it",
        "/cmi setwarp spawn hand - creates warp will take item from hand to display in gui for this warp", "/cmi setwarp spawn 13 - creates warp and sets gui slot to be used in gui (1-54)",
        "/cmi setwarp spawn true hand 13 - creates warp with icon from hand, slot 13 and requires permission",
        "/cmi setwarp spawn true hand 13 false - same as previous, but doesn't generate lore" }, regVar = { 1, 2, 3, 4, 5, 6, 7, 8 }, consoleVar = { 2, 3, 4, 5, 6, 7, 8 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
