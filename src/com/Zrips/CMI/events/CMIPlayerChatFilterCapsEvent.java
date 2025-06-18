package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public class CMIPlayerChatFilterCapsEvent extends CMIPlayerCancellableEvent {
    private String message;

    public CMIPlayerChatFilterCapsEvent(Player player, String message) {
        super(player);
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {
    }
}
