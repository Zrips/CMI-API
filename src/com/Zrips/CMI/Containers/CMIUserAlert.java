package com.Zrips.CMI.Containers;

public class CMIUserAlert {

    private long until = 0;
    private String reason = null;

    public CMIUserAlert(long until) {
        this(until, null);
    }

    public CMIUserAlert(long until, String reason) {
        this.until = until;
        this.reason = reason;
    }

    public long getUntil() {
        return until;
    }

    public void setUntil(long until) {
        this.until = until;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
