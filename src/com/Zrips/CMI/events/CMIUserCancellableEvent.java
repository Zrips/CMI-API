package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserCancellableEvent extends CMICancellableEvent {

    private final CMIUser user;

    public CMIUserCancellableEvent(CMIUser user) {
        this.user = user;
    }

    public CMIUser getUser() {
        return user;
    }
}
