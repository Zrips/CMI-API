package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public final class CMIIpUnBanEvent extends CMICancellableEvent {

    private CommandSender by;
    private String ip;

    public CMIIpUnBanEvent(CommandSender by, String ip) {
        this.by = by;
        this.ip = ip;
    }

    public CommandSender getBannedBy() {
        return by;
    }

    public String getIp() {
        return ip;
    }
}
