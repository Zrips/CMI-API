package com.Zrips.CMI.Modules.ChatEditor;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;

public class ChatMessageEdit {
    private UUID uuid = null;
    Long time = 0L;
    private boolean keep = false;
    private String cancelVariable = "cancel";
    private boolean checkForCancel = false;
    private String pasteInString = null;

    public ChatMessageEdit(CommandSender sender) {
	this(sender instanceof Player ? ((Player) sender).getUniqueId() : CMI.getInstance().getServerUUID());
    }

    public ChatMessageEdit(CommandSender sender, String pasteInText) {
	this(sender instanceof Player ? ((Player) sender).getUniqueId() : CMI.getInstance().getServerUUID(), pasteInText);
    }

    public ChatMessageEdit(UUID uuid) {
	this(uuid, null);
    }

    public ChatMessageEdit(UUID uuid, String pasteInText) {
    }

    public void printMessage() {
	printMessage(null);
    }

    public void printMessage(String customText) {
	
    }

    public void run(String message) {
    }

    public void onCancel() {

    }

    public void onDisable() {
    }

    public void delete() {
	ChatEditorManager.delete(this);
    }

    public UUID getUuid() {
	return uuid;
    }

    public void setUuid(UUID uuid) {
	this.uuid = uuid;
    }

    public boolean isKeep() {
	return keep;
    }

    public void setKeep(boolean keep) {
	this.keep = keep;
    }

    public String getCancelVariable() {
	return cancelVariable;
    }

    public void setCancelVariable(String cancelVariable) {
	this.cancelVariable = cancelVariable;
    }

    public boolean isCheckForCancel() {
	return checkForCancel;
    }

    public void setCheckForCancel(boolean checkForCancel) {
	this.checkForCancel = checkForCancel;
    }

    public String getPasteInString() {
	return pasteInString;
    }
}
