package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class clear implements Cmd {
    HashMap<UUID, Long> map;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eClear players inventory", args = "(playerName) (item(:amount)(;data)) (-s) (+clearType) -exact", multiTab = {
        "[playerName] +quickbar,+inventory,+partinventory,+weapons,+armorslots,+tools,+armors,+mainhand,+offhand,-confirmed,-exact" }, explanation = {
            "Possible clearTypes: quickbar, inventory, partinventory, weapons, armorslots, tools, armors, mainhand, offhand", "Should start with + sign", "Multiple types can be used",
            "cmi clear +armors - will remove armor type items", "cmi clear +armorslots - will remove items from armorslots" }, regVar = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }, consoleVar = { 1, 2, 3, 4,
                5, 6, 7, 8, 9, 10, 11 }, customAlias = { "ci" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static boolean isExcluded(ItemStack item) {
        return false;
    }

    enum clearTypes {
        quickbar, inventory, partinventory, weapons, armorslots, tools, armors, mainhand, offhand;

        public static clearTypes getByName(String name) {
            return null;
        }
    }
}
