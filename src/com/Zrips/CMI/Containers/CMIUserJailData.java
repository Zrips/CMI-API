package com.Zrips.CMI.Containers;

import java.util.UUID;

import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public class CMIUserJailData {
    private long jailedForTime = 0;
    private String jailedReason;
    private UUID jailedBy = null;
    private CMIJailCell cell;

    public long getJailedForTime() {
        return jailedForTime;
    }

    public void setJailedForTime(long jailedForTime) {
        this.jailedForTime = jailedForTime;
    }

    public String getJailedReason() {
        return jailedReason;
    }

    public void setJailedReason(String jailedReason) {
        this.jailedReason = jailedReason;
    }

    public UUID getJailedBy() {
        return jailedBy;
    }

    public void setJailedBy(UUID jailedBy) {
        this.jailedBy = jailedBy;
    }

    public CMIJailCell getCell() {
        return cell;
    }

    public void setCell(CMIJailCell cell) {
        this.cell = cell;
    }
}
