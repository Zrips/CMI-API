package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Worth.WorthEnchantment;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.CMIGuiButton;

public class setenchantworth implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eChange enchantment worth", args = "", regVar = { 0, 1, 2 }, consoleVar = { 666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static void enchantWorthMenu(Player player) {
    }

    private static void enchantWorthSubmenu(Player player, Enchantment enchant) {
    }

    private static void enchantWorthPriceEdit(Player player, Enchantment enchant, int level) {
    }

    private static void updateLore(CMIGui gui, WorthEnchantment worth) {
    }

    private static void priceLore(CMIGuiButton button, WorthEnchantment worth) {
    }
}
