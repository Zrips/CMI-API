package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;

public final class CMIPlayerWarnEvent extends CMIUserCancellableEvent {

    private CMIPlayerWarning warning;

    public CMIPlayerWarnEvent(final CMIUser user, CMIPlayerWarning warning) {
        super(user);
        this.warning = warning;
    }

    public CMIPlayerWarning getWarning() {
        return warning;
    }
}
