package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public final class CMIPlayerKickEvent extends CMICancellableEvent {

    private String reason;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerKickEvent(CommandSender by, final UUID banned, String reason) {
        this.banned = banned;
        this.by = by;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public CommandSender getBannedBy() {
        return by;
    }

    public UUID getBanned() {
        return banned;
    }
}
