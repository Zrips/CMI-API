package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserBalanceChangeEvent extends CMIUserEvent {
    private CMIUser source;
    private double from;
    private double to;
    private String actionType;

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to) {
        super(user, true);
    }

    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType, CMIUser source) {
        super(user, true);
    }

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType) {
        super(user, true);
    }

    public double getFrom() {
        return 0.0;
    }

    public double getTo() {
        return 0.0;
    }

    public String getActionType() {
        return null;
    }

    public void setActionType(String actionType) {
    }

    public CMIUser getSource() {
        return null;
    }
}
