package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Homes.CmiHome;

public class CMIUserHomeRemoveEvent extends CMIUserCancellableEvent {
    private CmiHome home;

    public CMIUserHomeRemoveEvent(CMIUser user, CmiHome home) {
        super(user);
    }

    public CmiHome getHome() {
        return null;
    }
}
