package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;

public class CMICancellableEvent extends CMIEvent implements Cancellable {
    private boolean cancel;

    @Override
    public final void setCancelled(boolean cancel) {
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }
}
