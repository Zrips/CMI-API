package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public class CMIIpUnBanEvent extends CMICancellableEvent {
    private CommandSender by;
    private String ip;

    public CMIIpUnBanEvent(CommandSender by, String ip) {
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public String getIp() {
        return null;
    }
}
