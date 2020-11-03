package com.Zrips.CMI.Modules.CmdWarmUp;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public class CmdWarmUp {

    private Long WU = 0L;
    private boolean move = true;
    private String command;
    private CMIPresetAnimations animation;

    public CmdWarmUp(String command, Long WU, boolean move) {
	this.command = command;
	this.WU = WU;
	this.move = move;
    }

    public Long getWU() {
	return WU;
    }

    public void setWU(Long WU) {
	this.WU = WU;
    }

    public boolean isMove() {
	return move;
    }

    public void setMove(boolean move) {
	this.move = move;
    }

    public String getCommand() {
	return command;
    }

    public String getSubCommand() {
	return command.startsWith("cmi ") ? command.substring(4) : command;
    }

    public void setCommand(String command) {
	this.command = command;
    }

    public CMIPresetAnimations getAnimation() {
	return animation;
    }

    public void setAnimation(CMIPresetAnimations animation) {
	this.animation = animation;
    }

}
