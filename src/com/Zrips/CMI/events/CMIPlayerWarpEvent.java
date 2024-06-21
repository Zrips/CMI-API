package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Warps.CmiWarp;

public final class CMIPlayerWarpEvent extends CMIPlayerCancellableEvent {

    private CmiWarp warp;
    private CommandSender sender;

    public CMIPlayerWarpEvent(final Player target, CmiWarp warp, CommandSender sender) {
        super(target);
        this.warp = warp;
        this.sender = sender;
    }

    public CmiWarp getWarp() {
        return warp;
    }

    public void setWarp(CmiWarp warp) {
        this.warp = warp;
    }

    public CommandSender getCommandSender() {
        return sender;
    }

    public void setCommandSender(CommandSender sender) {
        this.sender = sender;
    }
}
