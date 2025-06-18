package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class options implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eModify personal options", args = "(playerName) (option) (enable/disable/toggle/status) (-s)", multiTab = {
        "[playerName],[playerOption],!enable,!disable,!toggle,!status,-s !enable,[playerOption],!disable,!toggle,!status,!-s !enable,[playerOption],!disable,!toggle,!status,!-s !-s" }, regVar = { 0, 1, 2,
            3, 4 }, consoleVar = { 1, 2, 3, 4 }, others = true, explanation = {
                "Possible actions: visibleHolograms, shiftSignEdit, totemBossBar, bossBarCompass, tagSound, chatSpy, cmdSpy, signSpy, acceptingPM, acceptingTPA, acceptingMoney, chatbubble" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Actions {
        enable, disable, status, toggle, gui;
    }
}
