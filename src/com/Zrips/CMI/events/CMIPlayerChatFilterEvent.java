package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.ChatFilter.RuleResponse;

public class CMIPlayerChatFilterEvent extends CMIPlayerCancellableEvent {
    private RuleResponse response;

    public CMIPlayerChatFilterEvent(Player player, RuleResponse response) {
        super(player);
    }

    public RuleResponse getResponse() {
        return null;
    }
}
