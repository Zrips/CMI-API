package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Warps.CmiWarp;

public class CMIPlayerWarpEvent extends CMIPlayerCancellableEvent {
    private CmiWarp warp;
    private CommandSender sender;

    public CMIPlayerWarpEvent(Player target, CmiWarp warp, CommandSender sender) {
        super(target);
    }

    public CmiWarp getWarp() {
        return null;
    }

    public void setWarp(CmiWarp warp) {
    }

    public CommandSender getCommandSender() {
        return null;
    }

    public void setCommandSender(CommandSender sender) {
    }
}
