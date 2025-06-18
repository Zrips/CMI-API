package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public class CMIPlayerKickEvent extends CMICancellableEvent {
    private String reason;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerKickEvent(CommandSender by, UUID banned, String reason) {
    }

    public String getReason() {
        return null;
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public UUID getBanned() {
        return null;
    }
}
