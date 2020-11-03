package com.Zrips.CMI.Containers;

public class PInfo {

    private String permission;
    private String desc;
    private boolean cmd = false;
    private boolean others;

    public PInfo(String permission, String desc, boolean cmd) {
	this.permission = permission;
	this.desc = desc;
	this.cmd = cmd;
    }

    public PInfo(String permission, String desc, boolean cmd, boolean others) {
	this.permission = permission;
	this.desc = desc;
	this.cmd = cmd;
	this.others = others;
    }

    public PInfo(String permission, String desc) {
	this.permission = permission;
	this.desc = desc;
    }

    public String getPermission() {
	return permission;
    }

    public void setPermission(String permission) {
	this.permission = permission;
    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

    public boolean isCmd() {
	return cmd;
    }

    public void setCmd(boolean cmd) {
	this.cmd = cmd;
    }

    public boolean isOthers() {
	return others;
    }

    public void setOthers(boolean others) {
	this.others = others;
    }

}
