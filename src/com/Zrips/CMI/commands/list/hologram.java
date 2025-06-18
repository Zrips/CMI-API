package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class hologram implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eManage holograms", tab = { "new%%addline%%deleteline%%editline%%info%%update%%gui%%reload", "holograms" }, regVar = { -66 }, consoleVar = {
        -66 }, modules = "holograms", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        update, editline, moveup, movedown, createnew, addline, info, deleteLine, gui, list, delete, reload, editCommands;

        public static Action getByName(String name) {
            return null;
        }
    }
}
