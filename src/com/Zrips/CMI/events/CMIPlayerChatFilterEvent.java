package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.ChatFilter.RuleResponse;

public final class CMIPlayerChatFilterEvent extends CMIPlayerCancellableEvent {

    private RuleResponse response;

    public CMIPlayerChatFilterEvent(final Player player, RuleResponse response) {
        super(player);
        this.response = response;

    }

    public RuleResponse getResponse() {
        return response;
    }

}
