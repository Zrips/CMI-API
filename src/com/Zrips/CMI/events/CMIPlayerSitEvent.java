package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Animations.AnimationManager.Chair;

public final class CMIPlayerSitEvent extends CMIPlayerCancellableEvent {

    private Chair chair;

    public CMIPlayerSitEvent(final Player player, Chair chair) {
        super(player);
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }
}
