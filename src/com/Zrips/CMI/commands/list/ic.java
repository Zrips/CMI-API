package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.InteractiveCommand.CMIInteractiveCommand;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.RawMessages.RawMessage;

public class ic implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCreate interactive command", args = "(new) (name)", tab = { "new%%newentity%%newblock" }, regVar = { -600 }, consoleVar = { -600 }, modules = {
        "interactivecommands" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private RawMessage generateHeader(CMIInteractiveCommand cmib) {
        return null;
    }

    private String getType(CMIInteractiveCommand one) {
        return null;
    }
}
