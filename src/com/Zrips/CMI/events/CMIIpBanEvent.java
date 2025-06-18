package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public class CMIIpBanEvent extends CMICancellableEvent {
    private CommandSender by;
    private String ip;
    private Long until;
    private String reason;

    public CMIIpBanEvent(CommandSender by, String ip, String reason, Long until) {
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public String getIp() {
        return null;
    }

    public Long getUntil() {
        return null;
    }

    public String getReason() {
        return null;
    }
}
