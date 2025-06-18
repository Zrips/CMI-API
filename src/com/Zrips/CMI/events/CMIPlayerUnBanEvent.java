package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMIPlayerUnBanEvent extends CMIPlayerCancellableEvent {
    private CommandSender by;

    public CMIPlayerUnBanEvent(CommandSender by, Player player) {
        super(player);
    }

    public CommandSender getBannedBy() {
        return null;
    }
}
