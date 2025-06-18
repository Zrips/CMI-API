package com.Zrips.CMI.Modules.CmdWarmUp;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

public class CmdWarmUp {
    private Long warmUpTime;
    private boolean move;
    private String command;
    private CMIPresetAnimations animation;

    public CmdWarmUp(String command, Long warmUpTime, boolean move) {
    }

    @Deprecated
    public Long getWU() {
        return null;
    }

    @Deprecated
    public void setWU(Long warmUpTime) {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long warmUpTime) {
    }

    public boolean isMove() {
        return false;
    }

    public void setMove(boolean move) {
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
