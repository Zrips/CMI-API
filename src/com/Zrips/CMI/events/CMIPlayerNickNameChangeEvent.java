package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIPlayerNickNameChangeEvent extends CMIUserCancellableEvent {
    private String nickname;

    public CMIPlayerNickNameChangeEvent(CMIUser user, String nickname) {
        super(user);
    }

    public String getNickName() {
        return null;
    }

    public void setNickName(String nickname) {
    }
}
