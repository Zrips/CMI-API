package com.Zrips.CMI.Modules.ChatFilter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.Zrips.CMILib.Chat.ChatFilterBlockType;

public class ChatFilterRule {
    private String replaceWith;
    private ChatFilterBlockType blockType;
    private String ruleName;
    private List<Pattern> pattern;
    private String messageToStaff;
    private List<String> commands;
    private String group;
    private boolean informConsole;
    private boolean applyToPrivateMessages;

    public ChatFilterRule(String ruleName, String group, List<String> list, String replaceWith, ChatFilterBlockType blockType, String messageToStaff, List<String> commands) {
    }

    public ChatFilterRule(String ruleName, List<String> list) {
    }

    public ChatFilterRule() {
    }

    public List<Pattern> getPattern() {
        return null;
    }

    public ChatFilterRule setPattern(String list) {
        return null;
    }

    public void setPattern(List<String> list) {
    }

    public String getReplaceWith() {
        return null;
    }

    public void setReplaceWith(String replaceWith) {
    }

    public ChatFilterBlockType getBlockType() {
        return null;
    }

    public void setBlockType(ChatFilterBlockType blockType) {
    }

    public String getRuleName() {
        return null;
    }

    public void setRuleName(String ruleName) {
    }

    public Matcher getMatcher(String msg) {
        return null;
    }

    public String getMessageToStaff() {
        return null;
    }

    public void setMessageToStaff(String messageToStaff) {
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public String getGroup() {
        return null;
    }

    public void setGroup(String group) {
    }

    public boolean isInformConsole() {
        return false;
    }

    public void setInformConsole(boolean informConsole) {
    }

    public boolean isApplyToPrivateMessages() {
        return false;
    }

    public void setApplyToPrivateMessages(boolean applyToPrivateMessages) {
    }
}
