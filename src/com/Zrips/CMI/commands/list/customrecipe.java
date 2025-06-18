package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.Recipes.CMIRecipe;
import net.Zrips.CMILib.Recipes.CMIRecipeType;

public class customrecipe implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eManages item custom recipes", args = "", regVar = { 0 }, consoleVar = { 666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public void openMainMenu(Player player, int page) {
    }

    public void openSubMenu(Player player, CMIRecipeType t) {
    }

    public void openSubMenu(Player player, CMIRecipe recipe) {
    }

    public void openSubMenu(Player player, CMIRecipeType t, CMIRecipe recipe) {
    }

    private static boolean startChatKeyRecord(Player player, CMIGui gui) {
        return false;
    }
}
