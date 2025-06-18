package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Kits.Kit;

public class CMIUserKitAcquireEvent extends CMIUserCancellableEvent {
    private Kit kit;
    private boolean giveItems;

    public CMIUserKitAcquireEvent(CMIUser user, Kit kit, boolean giveItems) {
        super(user);
    }

    public Kit getKit() {
        return null;
    }

    public boolean isGiveItems() {
        return false;
    }

    public void setGiveItems(boolean giveItems) {
    }
}
