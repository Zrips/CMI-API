package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class kit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 170, info = "&eGives predefined kit.", args = "[kitName] (playerName) (-s) (-open) (-preview) (-c)", tab = { "kitp", "playername", "-s%%" }, explanation = { "&ePermissions:",
        "&6cmi.kit.[kitName] &e- allows to use particular kit", "&6cmi.kit.bypass.money &e- bypass money requirement", "&6cmi.kit.bypass.exp &e- bypass exp requirement",
        "&6cmi.kit.bypass.onetimeuse &e- bypass one time use", "&6/cmi kit [kitName] [playerName] &e- will give kit to another player" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 0, 2,
            3 }, paccess = true, others = true, modules = { "kits" }, customAlias = { "kits", "!+-preview:kitpreview", "!+-open:kitopen" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private void openKit(Player player, Kit k) {
    }
}
