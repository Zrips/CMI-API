package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Homes.CmiHome;

public final class CMIUserHomeCreateEvent extends CMIUserCancellableEvent {

    private CmiHome home;

    public CMIUserHomeCreateEvent(CMIUser user, CmiHome home) {
        super(user);
        this.home = home;
    }

    public CmiHome getHome() {
        return home;
    }
}
