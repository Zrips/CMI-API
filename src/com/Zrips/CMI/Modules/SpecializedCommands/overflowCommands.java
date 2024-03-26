package com.Zrips.CMI.Modules.SpecializedCommands;

import java.util.HashSet;
import java.util.Set;

public class overflowCommands {

    private long time = 0l;
    private Set<String> command = new HashSet<String>();
    private int repeat = 0;

    public overflowCommands(String command) {
        this.command.add(command);
        this.time = System.currentTimeMillis();
        repeat++;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Set<String> getCommands() {
        return command;
    }

    public void addCommand(String command) {
        this.command.add(command);
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public void addRepeat() {
        this.repeat++;
    }
}
