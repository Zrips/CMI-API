package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserEvent extends CMIEvent {

    private final CMIUser user;

    public CMIUserEvent(CMIUser user, boolean async) {
	super(async);
        this.user = user;
    }

    public CMIUserEvent(CMIUser user) {
        this(user, false);
    }

    public CMIUser getUser() {
        return user;
    }
}
