package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public final class CMIIpBanEvent extends CMICancellableEvent {

    private CommandSender by;
    private String ip;
    private Long until;
    private String reason;

    public CMIIpBanEvent(CommandSender by, String ip, String reason, Long until) {
        this.by = by;
        this.ip = ip;
        this.reason = reason;
        this.until = until;
    }

    public CommandSender getBannedBy() {
        return by;
    }

    public String getIp() {
        return ip;
    }

    public Long getUntil() {
        return until;
    }

    public String getReason() {
        return reason;
    }
}
