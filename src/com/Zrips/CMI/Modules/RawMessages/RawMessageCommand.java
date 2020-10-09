package com.Zrips.CMI.Modules.RawMessages;

import org.bukkit.command.CommandSender;

public class RawMessageCommand {
    private Long id = null;
    private Long time = 0L;
    private boolean keep = false;

    public RawMessageCommand() {
	id = RawMessageManager.add(this);
	time = System.currentTimeMillis();
    }

    public void run(CommandSender sender) {
    }

    public Long getId() {
	return id;
    }

    @Deprecated
    public String getCommandToPerform() {
	return getCommand();
    }

    public String getCommand() {
	return RawMessageManager.rmccmd + id;
    }

    public void delete() {
	RawMessageManager.delete(this);
    }

    public boolean isKeep() {
	return keep;
    }

    public void setKeep(boolean keep) {
	this.keep = keep;
    }

    public Long getCreationTime() {
	return time;
    }
}
