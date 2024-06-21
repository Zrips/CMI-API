package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

public final class CMIPlayerChatFilterCapsEvent extends CMIPlayerCancellableEvent {

    private String message;

    public CMIPlayerChatFilterCapsEvent(final Player player, String message) {
        super(player);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
