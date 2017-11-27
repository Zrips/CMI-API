package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.Zrips.CMI.Modules.ChatFilter.ChatFilterManager.ChatFilterBlockType;

public class RuleResponce {

    private String message;
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

    public void addRule(ChatFilterRule rule) {
	if (rule != null && !this.rules.containsKey(rule.getRuleName()))
	    this.rules.put(rule.getRuleName(), rule);
    }

    public ChatFilterBlockType getMaxFilterBlockType() {
	ChatFilterBlockType type = ChatFilterBlockType.None;
	return type;
    }

    public boolean isBypass(String bypass) {
	return this.bypass.contains(bypass.toLowerCase());
    }

    public void addBypass(String bypass) {
    }

}
