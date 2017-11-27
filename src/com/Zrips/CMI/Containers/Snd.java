package com.Zrips.CMI.Containers;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Snd {
    private Player sender;
    private CMIUser senderUser;
    private ConsoleCommandSender console;
    private Player target;
    private CMIUser targetUser;
    private ConsoleCommandSender targetConsole;
    private Player source;
    private CMIUser sourceUser;
    private ConsoleCommandSender sourceConsole;

    public Player getPlayerSender() {
	return sender;
    }

    public ConsoleCommandSender getConsoleSender() {
	return console;
    }

    public Snd setSender(Player sender) {
	this.sender = sender;
	return this;
    }

    public Snd setSender(CMIUser user) {
	this.senderUser = user;
	return this;
    }

    public Snd setSender(CommandSender sender) {
	return null;
    }

    public Snd setSender(ConsoleCommandSender console) {
	return null;
    }

    public Player getPlayerTarget() {
	return null;
    }

    public ConsoleCommandSender getConsoleTarget() {
	return null;
    }

    public Snd setTarget(Player sender) {
	return null;
    }

    public Snd setTarget(CMIUser user) {
	return null;
    }

    public Snd setTarget(CommandSender sender) {
	return null;
    }

    public Snd setTarget(ConsoleCommandSender console) {
	return null;
    }

    public Player getPlayerSource() {
	return null;
    }

    public ConsoleCommandSender getConsoleSource() {
	return null;
    }

    public Snd setSource(Player sender) {
	return null;
    }

    public Snd setSource(CMIUser user) {
	return null;
    }

    public Snd setSource(CommandSender sender) {
	return null;
    }

    public Snd setSource(ConsoleCommandSender console) {
	return null;
    }

    public CMIUser getSenderUser() {
	return null;
    }

    public void setSenderUser(CMIUser senderUser) {
    }

    public CMIUser getTargetUser() {
	return null;
    }

    public void setTargetUser(CMIUser targetUser) {
    }

    public CMIUser getSourceUser() {
	return null;
    }

    public void setSourceUser(CMIUser sourceUser) {
    }
}
