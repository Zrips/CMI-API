package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class replaceblock implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 286, info = "&eReplaces blocks in current world around you", args = "&eid &6[blockName:data/id:data]&e w &6[blockName:data/id:data] &er &6[range in chunks/g]&e y &6[max height]", tab = {}, explanation = {
        "&6SubCommands:", "&e- &6pause &e- pause replacing", "- &6continue &e- continue replacing", "- &6stop &e- stop replacing", "- &6speed [amount] &e- set current replace speed",
        "- &6autospeed [true/false] &e- set autospeed turned off or on", "- &6messages [true/false] &e- set message output to off or on", "Example:", "/cmi replaceblock id 52 w stone r 10",
        "/cmi replaceblock id 52,gold_block w stone r 15 y 100", "/cmi replaceblock id 52 w air r g y 100", "/cmi replaceblock id iron_ore%75 w stone%90,dirt%5 r g" }, regVar = { -66 }, consoleVar = {
            666 }, others = false)
    public Boolean perform(CMI pl, CommandSender sender, String[] args) {
        return null;
    }
}
