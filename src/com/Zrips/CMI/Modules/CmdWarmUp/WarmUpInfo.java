package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class WarmUpInfo {

    private String cmd;
    private Location loc;
    private boolean move = true;
    private CMITask task = null;
    private CMIVisualEffect effectAnimation;
    private int leftCount = 0;
    private BossBarInfo bar;

    public WarmUpInfo(String cmd, boolean move) {
        this.cmd = cmd;
        this.move = move;
    }

    public WarmUpInfo(Location loc, boolean move) {
        this.loc = loc;
        this.move = move;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public CMIVisualEffect getEffectAnimation() {
        return effectAnimation;
    }

    public void setEffectAnimation(CMIVisualEffect effectAnimation) {
        this.effectAnimation = effectAnimation;
    }

    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }

    public BossBarInfo getBar() {
        return bar;
    }

    public void setBar(BossBarInfo bar) {
        this.bar = bar;
    }

    public CMITask getTask() {
        return task;
    }

    public void setTask(CMITask task) {
        this.task = task;
    }

}
