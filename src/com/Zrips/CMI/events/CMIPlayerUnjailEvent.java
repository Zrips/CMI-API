package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public final class CMIPlayerUnjailEvent extends CMIEvent {

    private CMIUser user;

    private CMIJailCell cell;

    public CMIPlayerUnjailEvent(CMIUser user, CMIJailCell cell) {
        this.user = user;
        this.cell = cell;
    }

    public CMIUser getUser() {
        return user;
    }

    public CMIJailCell getCell() {
        return cell;
    }

}
