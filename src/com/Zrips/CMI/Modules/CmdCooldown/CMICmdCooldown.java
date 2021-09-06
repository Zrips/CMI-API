package com.Zrips.CMI.Modules.CmdCooldown;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public class CMICmdCooldown {

    private int cdSeconds = 0;
    private String command;
    private CMIPresetAnimations animation;

    public CMICmdCooldown(String command, int cdSeconds) {
	this.command = command;
	this.cdSeconds = cdSeconds;
    }

    public int getCooldownSeconds() {
	return cdSeconds;
    }

    public void setCooldown(int cdSeconds) {
	this.cdSeconds = cdSeconds;
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
