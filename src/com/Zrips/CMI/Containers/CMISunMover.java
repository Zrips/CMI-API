package com.Zrips.CMI.Containers;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMISunMover {
    private CMITask task = null;
    private String moving;

    public CMITask getTimeMoverTask() {
        return task;
    }

    public void setTimeMoverTask(CMITask task) {
        this.task = task;
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        this.moving = moving;
    }
}
