package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;

public class CMICancellableEvent extends CMIEvent implements Cancellable {

    private boolean cancel = false;

    @Override
    public final void setCancelled(final boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
        return cancel;
    }
}
