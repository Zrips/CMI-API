package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;

public class RuleResponce {

    private String message;
    private String updatedMessage;
    private HashMap<String, ChatFilterRule> rules = new HashMap<String, ChatFilterRule>();
    private List<String> bypass = new ArrayList<String>();

    public RuleResponce(String message) {
	this.message = message;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public HashMap<String, ChatFilterRule> getRules() {
	return rules;
    }

    public String getRulesNamesAsString() {
	String n = "";
	return n;
    }

    public void addRule(ChatFilterRule rule) {
	if (rule != null && !this.rules.containsKey(rule.getRuleName()))
	    this.rules.put(rule.getRuleName(), rule);
    }

    public ChatFilterBlockType getMaxFilterBlockType() {
	ChatFilterBlockType type = ChatFilterBlockType.None;
	return type;
    }

    public boolean isInformConsole() {
	boolean inform = false;
	for (Entry<String, ChatFilterRule> one : rules.entrySet()) {
	    if (isBypass(one.getValue().getGroup()))
		continue;
	    if (one.getValue().isInformConsole())
		inform = true;
	}
	return inform;
    }

    public boolean isBypass(String bypass) {
	return this.bypass.contains(bypass.toLowerCase());
    }

    public void addBypass(String bypass) {
	if (!this.bypass.contains(bypass.toLowerCase()))
	    this.bypass.add(bypass.toLowerCase());
    }

    public String getUpdatedMessage() {
	if (updatedMessage == null)
	    return message;
	return updatedMessage;
    }

    public void setUpdatedMessage(String updatedMessage) {
	this.updatedMessage = updatedMessage;
    }

}
