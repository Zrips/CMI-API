package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class repair implements Cmd {
    HashMap<UUID, String> confirmations;
    HashMap<UUID, ItemStack> confirmationItem;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eRepair items", args = "[hand/offhand/armor/all] (playerName)", tab = { "offhand%%hand%%armor%%all", "playername" }, explanation = {
        "cmi.command.repair.hand - allows a user to repair items in their hand", "cmi.command.repair.offhand - allows a user to repair items in their offhand",
        "cmi.command.repair.armor - allows a user to repair items in armor slots", "cmi.command.repair.all - allows a user to repair their whole inventory",
        "cmi.command.repair.repairshare.bypass - allows a user to repair items without adding repair share protection" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static List<ItemStack> getItems(ItemStack[] i) {
        return null;
    }
}
