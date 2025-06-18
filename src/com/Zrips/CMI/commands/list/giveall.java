package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class giveall implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 46, info = "&eGive item for all players", args = "[itemname] (amount) (e|l|n|offline)", tab = { "itemname", "offline%%n%%l%%e" }, explanation = {
        "&e- give item name or its id with data value", "&e- optionaly provide amount you want to give ", "&e- &6n &e- to define itemname ", "&e- &6l &e- to define item lore ",
        "&e- &6e &e - to define item enchants ", "&e- &6-s &e - wont show feedback message ", "&e- &6h &e - followed with player name will give item from its hand ",
        "&e- &6inv &e - followed by player name will give entire inventory for others ", "&e- &6offline &e- to include offline players", "&ecmi giveall stone 1 n &2Uber_stone l &3Stone_lore offline",
        "&ecmi giveall h Zrips", "&ecmi giveall inv Zrips" }, regVar = { -100 }, consoleVar = { -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
