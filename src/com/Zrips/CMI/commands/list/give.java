package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.Attributes.Attribute;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Items.CMIItemStack;

public class give implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    private static boolean newMethod(String[] args) {
        return false;
    }

    private static Boolean processNewMethod(CommandSender sender, String[] args) {
        return null;
    }

    private static Boolean processNewItem(CMIItemStack cm, CommandSender sender, Player target, int invSlot, boolean silent, boolean unstack) {
        return null;
    }

    @Override
    @CAnnotation(info = "&eGive item to player", args = "(playerName) [itemdata/hand] (playerName) (-slot:[number]) (unstack) (-s)", tab = { "playername%%itemname", "itemname%%hand",
        "1%%playerName" }, explanation = { "Example: /cmi give diamondsword;{#Gray}My_Uber_Sword;&2Goblin_Slayer!\n{#pink}With_Love!;sharpness:3,durability:3;hideenchants",
            "<T>More information at www.zrips.net/cmi/commands/icwol/</T><URL>https://www.zrips.net/cmi/commands/icwol/</URL>" }, regVar = { -100 }, consoleVar = { -100 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static Boolean processItem(CMIItemStack cm, CommandSender sender, Player Target, String name, List<String> lore, String tag, int invSlot, Boolean unbreakable, Integer amount, Integer data,
        boolean silent, HashMap<Enchantment, Integer> enchants, List<Attribute> attList, boolean unstack) {
        return null;
    }
}
