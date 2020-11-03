package com.Zrips.CMI.Modules.ChatEditor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.Modules.RawMessages.RawMessageCommand;
import com.Zrips.CMI.utils.Util.CMIText;

public class ChatMessageListEdit {
    private UUID uuid = null;
    Long time = 0L;

    private List<String> lines = new ArrayList<String>();
    private List<String> modifyInfo = new ArrayList<String>();
    private RawMessage topLine;

    public ChatMessageListEdit(CommandSender sender, List<String> lines) {
	this(sender instanceof Player ? ((Player) sender).getUniqueId() : CMI.getInstance().getServerUUID(), lines);
    }

    public ChatMessageListEdit(UUID uuid, List<String> lines) {
	this.uuid = uuid;
	this.lines = lines;
//	ChatEditorManager.add(this);
	time = System.currentTimeMillis();
    }

    public void onUpdate() {
    }

    public void beforePrint() {
    }
//    public void delete() {
//	ChatEditorManager.delete(this);
//    }

    public UUID getUuid() {
	return uuid;
    }

    public void setUuid(UUID uuid) {
	this.uuid = uuid;
    }

    public void print() {
	
    }

    private enum dir {
	up(-1), down(1);
	private int val;

	dir(int val) {
	    this.val = val;
	}

	public int getValue() {
	    return val;
	}
    }

    private void remove(int place) {
	if (lines.size() >= place) {
	    lines.remove(place);
	    onUpdate();
	}
    }

    private void move(int from, dir direction) {
    }

    public List<String> getLines() {
	return lines;
    }

    public void setLines(List<String> lines) {
	this.lines = lines;
    }

    public RawMessage getTopLine() {
	return topLine;
    }

    public void setTopLine(RawMessage topLine) {
	this.topLine = topLine;
    }

    public List<String> getModifyInfo() {
	return modifyInfo;
    }

    public void setModifyInfo(List<String> modifyInfo) {
	this.modifyInfo = modifyInfo;
    }
}
