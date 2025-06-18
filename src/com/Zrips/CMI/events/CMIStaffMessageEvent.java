package com.Zrips.CMI.events;

import java.util.Set;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMIStaffMessageEvent extends CMICancellableEvent {
    private CommandSender by;
    private Set<Player> receivers;
    private String message;

    public CMIStaffMessageEvent(CommandSender by, Set<Player> receivers, String message) {
    }

    public CommandSender getSentBy() {
        return null;
    }

    public Set<Player> getReceivers() {
        return null;
    }

    public void setReceivers(Set<Player> receivers) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {
    }
}
