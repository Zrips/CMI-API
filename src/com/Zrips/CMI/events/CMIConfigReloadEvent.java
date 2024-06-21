package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public final class CMIConfigReloadEvent extends CMIEvent {

    private CommandSender sender;

    public CMIConfigReloadEvent(CommandSender sender) {
        this.sender = sender;
    }

    public CommandSender getSender() {
        return sender;
    }
}
