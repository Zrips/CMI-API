package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserEvent extends CMIEvent {
    private final CMIUser user = null;

    public CMIUserEvent(CMIUser user, boolean async) {
        super(async);
    }

    public CMIUserEvent(CMIUser user) {
    }

    public CMIUser getUser() {
        return null;
    }
}
