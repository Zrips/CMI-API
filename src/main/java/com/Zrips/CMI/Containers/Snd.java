package com.Zrips.CMI.Containers;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Snd {
    private Player sender;
    private String senderName;
    private CMIUser senderUser;
    private ConsoleCommandSender console;
    private Player target;
    private String targetName;
    private CMIUser targetUser;
    private ConsoleCommandSender targetConsole;
    private Player source;
    private CMIUser sourceUser;
    private ConsoleCommandSender sourceConsole;

    public Snd() {

    }

    public Snd(Player sender, Player target) {
	this.sender = sender;
	if (sender != null)
	    senderName = sender.getName();
	this.target = target;
	if (target != null)
	    targetName = target.getName();
    }

    public Player getPlayerSender() {
	return sender;
    }

    public ConsoleCommandSender getConsoleSender() {
	return console;
    }

    public Snd setSender(Player sender) {
	return this;
    }

    public Snd setSender(CMIUser user) {
	return this;
    }

    public Snd setSender(CommandSender sender) {
	return this;
    }

    public Snd setSender(ConsoleCommandSender console) {
	this.console = console;
	return this;
    }

    public Player getPlayerTarget() {
	return target;
    }

    public ConsoleCommandSender getConsoleTarget() {
	return targetConsole;
    }

    public Snd setTarget(Player sender) {
	this.target = sender;
	return this;
    }

    public Snd setTarget(CMIUser user) {
	this.targetUser = user;
	return this;
    }

    public Snd setTarget(CommandSender sender) {
	return this;
    }

    public Snd setTarget(ConsoleCommandSender console) {
	this.targetConsole = console;
	return this;
    }

    public Player getPlayerSource() {
	return source;
    }

    public ConsoleCommandSender getConsoleSource() {
	return sourceConsole;
    }

    public Snd setSource(Player sender) {
	this.source = sender;
	return this;
    }

    public Snd setSource(CMIUser user) {
	this.sourceUser = user;
	return this;
    }

    public Snd setSource(CommandSender sender) {
	return this;
    }

    public Snd setSource(ConsoleCommandSender console) {
	this.sourceConsole = console;
	return this;
    }

    public CMIUser getSenderUser() {
	return senderUser;
    }

    public void setSenderUser(CMIUser senderUser) {
	this.senderUser = senderUser;
    }

    public CMIUser getTargetUser() {
	return targetUser;
    }

    public void setTargetUser(CMIUser targetUser) {
	this.targetUser = targetUser;
    }

    public CMIUser getSourceUser() {
	return sourceUser;
    }

    public void setSourceUser(CMIUser sourceUser) {
	this.sourceUser = sourceUser;
    }

    public String getSenderName() {
	return senderName;
    }

    public Snd setSenderName(String senderName) {
	this.senderName = senderName;
	return this;
    }

    public String getTargetName() {
	return targetName;
    }

    public Snd setTargetName(String targetName) {
	this.targetName = targetName;
	return this;
    }
}
