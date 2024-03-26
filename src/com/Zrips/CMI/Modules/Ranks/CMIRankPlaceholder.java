package com.Zrips.CMI.Modules.Ranks;

import java.util.regex.Pattern;

import org.bukkit.entity.Player;

public class CMIRankPlaceholder {

    private static final String regex = "^(.*?)(>=|<=|==)(.*?)(;)(.+)";
    private static final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    private String placeholder = "";
    private Object value = "";
    private rankPlaceholderType type = rankPlaceholderType.invalid;
    private rankPlaceholderAction action = rankPlaceholderAction.equal;
    private String message = "";

    public CMIRankPlaceholder(String line) {

    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public rankPlaceholderType getType() {
        return type;
    }

    public void setType(rankPlaceholderType type) {
        this.type = type;
    }

    public rankPlaceholderAction getAction() {
        return action;
    }

    public void setAction(rankPlaceholderAction action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double percent(Player player) {

        return 0D;
    }
}
