package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

public class CMIPlayerTeleportRequestEvent extends CMIPlayerCancellableEvent {
    private Player whoAccepts;
    private TpAction action;

    public CMIPlayerTeleportRequestEvent(Player whoOffers, Player whoAccepts, TpAction action) {
        super(whoOffers);
    }

    public Player getWhoOffers() {
        return null;
    }

    public Player getWhoAccepts() {
        return null;
    }

    public TpAction getAction() {
        return null;
    }
}
