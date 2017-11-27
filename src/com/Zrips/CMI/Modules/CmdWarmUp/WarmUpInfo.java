package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.Location;

public class WarmUpInfo {

    private String cmd;
    private Location loc;
    private boolean move = true;
    private int id = -1;

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

}
