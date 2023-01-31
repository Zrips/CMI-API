package com.Zrips.CMI.Modules.CmdWarmUp;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.commands.CommandsHandler;

public class CmdWarmUp {

    private Long warmUpTime = 0L;
    private boolean move = true;
    private String command;
    private CMIPresetAnimations animation;

    public CmdWarmUp(String command, Long warmUpTime, boolean move) {
        this.command = command;
        this.warmUpTime = warmUpTime;
        this.move = move;
    }

    @Deprecated
    public Long getWU() {
        return getTime();
    }

    @Deprecated
    public void setWU(Long warmUpTime) {
        setTime(warmUpTime);
    }

    public Long getTime() {
        return warmUpTime;
    }

    public void setTime(Long warmUpTime) {
        this.warmUpTime = warmUpTime;
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
        return command.startsWith(CommandsHandler.getLabel() + " ") ? command.substring(4) : command;
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
