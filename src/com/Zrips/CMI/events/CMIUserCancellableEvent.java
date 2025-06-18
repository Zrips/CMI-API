package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserCancellableEvent extends CMICancellableEvent {
    private final CMIUser user = null;

    public CMIUserCancellableEvent(CMIUser user) {
    }

    public CMIUser getUser() {
        return null;
    }
}
