package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public final class CMIPlayerBanEvent extends CMIEvent {

    private String reason;
    private Long until;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerBanEvent(CommandSender by, final UUID banned, String reason, Long until) {
        this.banned = banned;
        this.by = by;
        this.reason = reason;
        this.until = until;
    }

    public String getReason() {
	return reason;
    }

    public Long getUntil() {
        return until;
    }

    public CommandSender getBannedBy() {
        return by;
    }

    public UUID getBanned() {
        return banned;
    }
}
