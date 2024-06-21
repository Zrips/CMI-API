package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

public final class CMIPlayerTeleportRequestEvent extends CMIPlayerCancellableEvent {

    private Player whoAccepts;
    private TpAction action;

    public CMIPlayerTeleportRequestEvent(final Player whoOffers, final Player whoAccepts, TpAction action) {
        super(whoOffers);
        this.whoAccepts = whoAccepts;
        this.action = action;
    }

    public Player getWhoOffers() {
        return getPlayer();
    }

    public Player getWhoAccepts() {
        return whoAccepts;
    }

    public TpAction getAction() {
        return action;
    }

}
