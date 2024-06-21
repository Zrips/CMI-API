package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Kits.Kit;

public final class CMIUserKitAcquireEvent extends CMIUserCancellableEvent {

    private Kit kit;
    private boolean giveItems;

    public CMIUserKitAcquireEvent(CMIUser user, Kit kit, boolean giveItems) {
        super(user);
        this.kit = kit;
        this.giveItems = giveItems;
    }

    public Kit getKit() {
        return kit;
    }

    public boolean isGiveItems() {
        return giveItems;
    }

    public void setGiveItems(boolean giveItems) {
        this.giveItems = giveItems;
    }
}
