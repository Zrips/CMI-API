package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class CMIPlayerUnBanEvent extends CMIPlayerCancellableEvent {

    private CommandSender by;

    public CMIPlayerUnBanEvent(CommandSender by, final Player player) {
        super(player);
        this.by = by;
    }

    public CommandSender getBannedBy() {
        return by;
    }
}
