package com.Zrips.CMI.Containers;

import org.bukkit.command.CommandSender;

public class PlayerMail {
    private String sender;
    private long time;
    private long keepFor;
    private String message;

    public PlayerMail(String sender, Long time, String message) {
    }

    public PlayerMail(String sender, Long time, String message, Long keepForSeconds) {
    }

    public PlayerMail(CommandSender sender, String message) {
    }

    public PlayerMail(CommandSender sender, String message, Long keepForSeconds) {
    }

    public PlayerMail(CommandSender sender, long time, String message, Long keepForSeconds) {
    }

    public String getSender() {
        return null;
    }

    public void setSender(String sender) {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long time) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {
    }

    public Long getKeepFor() {
        return null;
    }

    public void setKeepFor(Long keepFor) {
    }
}
