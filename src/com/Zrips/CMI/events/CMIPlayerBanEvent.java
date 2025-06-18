package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public class CMIPlayerBanEvent extends CMIEvent {
    private String reason;
    private Long until;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerBanEvent(CommandSender by, UUID banned, String reason, Long until) {
    }

    public String getReason() {
        return null;
    }

    public Long getUntil() {
        return null;
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public UUID getBanned() {
        return null;
    }
}
