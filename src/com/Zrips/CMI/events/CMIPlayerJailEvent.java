package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public final class CMIPlayerJailEvent extends CMIUserCancellableEvent {

    private CMIJailCell cell;

    public CMIPlayerJailEvent(CMIUser user, CMIJailCell cell) {
        super(user);
        this.cell = cell;
    }

    public CMIJailCell getCell() {
        return cell;
    }

    public void setCell(CMIJailCell cell) {
        this.cell = cell;
    }

}
