package com.Zrips.CMI.Modules.CmdCooldown;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public class CMICmdCooldown {
    private int cdSeconds;
    private String command;
    private CMIPresetAnimations animation;

    public CMICmdCooldown(String command, int cdSeconds) {
    }

    public int getCooldownSeconds() {
        return 0;
    }

    public void setCooldown(int cdSeconds) {
    }

    public String getCommand() {
        return null;
    }

    public String getSubCommand() {
        return null;
    }

    public void setCommand(String command) {
    }

    public CMIPresetAnimations getAnimation() {
        return null;
    }

    public void setAnimation(CMIPresetAnimations animation) {
    }
}
