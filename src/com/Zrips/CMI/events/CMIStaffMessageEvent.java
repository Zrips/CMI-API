package com.Zrips.CMI.events;

import java.util.Set;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class CMIStaffMessageEvent extends CMICancellableEvent {

    private CommandSender by;
    private Set<Player> receivers;
    private String message;

    public CMIStaffMessageEvent(CommandSender by, Set<Player> receivers, String message) {
        this.by = by;
        this.receivers = receivers;
        this.message = message;
    }

    public CommandSender getSentBy() {
        return by;
    }

    public Set<Player> getReceivers() {
        return receivers;
    }

    public void setReceivers(Set<Player> receivers) {
        this.receivers = receivers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
