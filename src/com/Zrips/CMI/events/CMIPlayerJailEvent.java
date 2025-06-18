package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public class CMIPlayerJailEvent extends CMIUserCancellableEvent {
    private CMIJailCell cell;

    public CMIPlayerJailEvent(CMIUser user, CMIJailCell cell) {
        super(user);
    }

    public CMIJailCell getCell() {
        return null;
    }

    public void setCell(CMIJailCell cell) {
    }
}
