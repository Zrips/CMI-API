package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public final class CMIPlayerNickNameChangeEvent extends CMIUserCancellableEvent {

    private String nickname;

    public CMIPlayerNickNameChangeEvent(final CMIUser user, String nickname) {
        super(user);
        this.nickname = nickname;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickname) {
        this.nickname = nickname;
    }
}
