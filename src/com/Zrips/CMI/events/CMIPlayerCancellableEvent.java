package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class CMIPlayerCancellableEvent extends CMIPlayerEvent implements Cancellable {

    private boolean cancel = false;

    public CMIPlayerCancellableEvent(Player player, boolean async) {
        super(player, async);
    }

    public CMIPlayerCancellableEvent(Player player) {
        super(player);
    }

    @Override
    public final void setCancelled(final boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
        return cancel;
    }
}
