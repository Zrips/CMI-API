package com.Zrips.CMI.Modules.TimedCommands;

import java.util.HashSet;
import java.util.Set;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimedCommandManager {

    private CMI plugin;
    private CMITask autoTimerBukkitId = null;
    private long nextIn = -1L;
    private boolean delay = false;

    public TimedCommandManager(CMI plugin) {
        this.plugin = plugin;
    }

    public Set<CMIUser> timed = new HashSet<CMIUser>();

    public void addTimed(CMIUser user) {

    }

    public void stop() {
    }

    private Runnable autoTimer = new Runnable() {
        @Override
        public void run() {
        }
    };

    private void checkUsers() {

    }

    private void updateNextIn(Long time) {
    }

    public boolean checkTFly(final CMIUser user, boolean logout) {

        return true;
    }

    public boolean checkTGod(final CMIUser user, boolean logout) {

        return true;
    }
}
