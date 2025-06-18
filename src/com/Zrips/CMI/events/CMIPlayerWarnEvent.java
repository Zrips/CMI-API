package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;

public class CMIPlayerWarnEvent extends CMIUserCancellableEvent {
    private CMIPlayerWarning warning;

    public CMIPlayerWarnEvent(CMIUser user, CMIPlayerWarning warning) {
        super(user);
    }

    public CMIPlayerWarning getWarning() {
        return null;
    }
}
