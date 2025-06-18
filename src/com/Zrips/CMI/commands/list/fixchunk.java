package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class fixchunk implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @SuppressWarnings("deprecation")
    @Override
    @CAnnotation(info = "&eScans for damaged chunks", args = "&ew &6[worldName]&e r &6[range in chunks]&e c &6[x:z]&e ", explanation = { "&6SubCommands:", "- &6stats &e- show current scanning stats",
        "- &6pause &e- pause scanning", "- &6continue &e- continue scanning", "- &6stop &e- stop scanning", "- &6stopall &e- stop all scanning", "- &6speed [amount] &e- set current scan speed",
        "- &6autospeed [true/false] &e- set autospeed turned off or on", "- &6messages [true/false] &e- set message output to off or on", "Example:", "/fixchunk w LT_Craft",
        "/fixchunk w LT_Craft r 50 c 1024:-2048", "/fixchunk w LT_Craft r g", "/fixchunk fix" }, regVar = { -100 }, consoleVar = { -100 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
