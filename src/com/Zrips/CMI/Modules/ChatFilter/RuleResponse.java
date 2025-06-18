package com.Zrips.CMI.Modules.ChatFilter;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;

public class RuleResponse {
    private String message;
    private String updatedMessage;
    private HashMap<String, ChatFilterRule> rules;
    private List<String> bypass;

    public RuleResponse(String message) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {
    }

    public HashMap<String, ChatFilterRule> getRules() {
        return null;
    }

    public String getRulesNamesAsString() {
        return null;
    }

    public void addRule(ChatFilterRule rule) {
    }

    public ChatFilterBlockType getMaxFilterBlockType() {
        return null;
    }

    public boolean isInformConsole() {
        return false;
    }

    public boolean isBypass(String bypass) {
        return false;
    }

    public void addBypass(String bypass) {
    }

    public String getUpdatedMessage() {
        return null;
    }

    public void setUpdatedMessage(String updatedMessage) {
    }

    public void informStaff(Player player) {
    }

    public void performCommands(Player player) {
    }
}
