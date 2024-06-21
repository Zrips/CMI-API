package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public final class CMIUserBalanceChangeEvent extends CMIUserEvent {

    private CMIUser source;
    private double from;
    private double to;
    private String actionType;

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to) {
        this(user, from, to, "Unknown");
    }

    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType, CMIUser source) {
        super(user, true);
        this.from = from;
        this.to = to;
        this.actionType = actionType;
        this.source = source;
    }

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType) {
        this(user, from, to, actionType, null);
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
    * Only indicates player from or to who money got transferred if possible
    */
    public CMIUser getSource() {
        return source;
    }
}