package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Animations.AnimationManager.Chair;

public class CMIPlayerSitEvent extends CMIPlayerCancellableEvent {
    private Chair chair;

    public CMIPlayerSitEvent(Player player, Chair chair) {
        super(player);
    }

    public Chair getChair() {
        return null;
    }
}
