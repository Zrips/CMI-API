package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;

public class WarmUpInfo {

    private String cmd;
    private Location loc;
    private boolean move = true;
    private int id = -1;
    private CMIVisualEffect effectAnimation;
    private int leftCount = 0;
    private BossBarInfo bar;

    public WarmUpInfo(String cmd, boolean move) {
	this.cmd = cmd;
	this.move = move;
    }

    public WarmUpInfo( Location loc, boolean move) {
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

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
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

}
