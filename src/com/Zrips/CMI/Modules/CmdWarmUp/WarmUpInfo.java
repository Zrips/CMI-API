package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class WarmUpInfo {
    private String cmd;
    private Location loc;
    private boolean move;
    private CMITask task;
    private CMIVisualEffect effectAnimation;
    private int leftCount;
    private BossBarInfo bar;

    public WarmUpInfo(String cmd, boolean move) {
    }

    public WarmUpInfo(Location loc, boolean move) {
    }

    public String getCmd() {
        return null;
    }

    public void setCmd(String cmd) {
    }

    public boolean isMove() {
        return false;
    }

    public void setMove(boolean move) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public CMIVisualEffect getEffectAnimation() {
        return null;
    }

    public void setEffectAnimation(CMIVisualEffect effectAnimation) {
    }

    public int getLeftCount() {
        return 0;
    }

    public void setLeftCount(int leftCount) {
    }

    public BossBarInfo getBar() {
        return null;
    }

    public void setBar(BossBarInfo bar) {
    }

    public CMITask getTask() {
        return null;
    }

    public void setTask(CMITask task) {
    }
}
