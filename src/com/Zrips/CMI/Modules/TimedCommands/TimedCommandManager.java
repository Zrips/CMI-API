package com.Zrips.CMI.Modules.TimedCommands;

import java.util.Set;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimedCommandManager {
    private CMI plugin;
    private CMITask autoTimerBukkitId;
    private long nextIn;
    private boolean delay;
    public Set<CMIUser> timed;
    private Runnable autoTimer;

    public TimedCommandManager(CMI plugin) {
    }

    public void addTimed(CMIUser user) {
    }

    public void stop() {
    }

    private void checkUsers() {
    }

    private void updateNextIn(Long time) {
    }

    public boolean checkTFly(CMIUser user, boolean logout) {
        return false;
    }

    public boolean checkTGod(CMIUser user, boolean logout) {
        return false;
    }
}
