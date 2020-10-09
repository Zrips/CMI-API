package com.Zrips.CMI.Containers;

import java.util.regex.Pattern;

public enum CMIMultiMessageType {

    plain(""),
    actionBar("^(?i)(!actionbar!)"),
    timedActionBar("^(?i)(!actionbar:)(\\d+)(!)"),
    title("^(?i)(!title!)((.*?(?=!subtitle!))(!subtitle!))?(.*)"),
    toast("^(?i)(!toast!)"),
    broadcast("^(?i)(!broadcast!)"),
    json("^(<T>)(.*)(<\\/T>)"),
    customText("^(?i)(!customtext:)(.+[^\\s])(!)"),
    bossBar("^(?i)(!bossBar:)(\\w+[^\\s])(-((\\d+.)?\\d+))?(!)");

    private Pattern patern;

    CMIMultiMessageType(String regex) {
	patern = Pattern.compile(regex);
    }

    public Pattern getRegex() {
	return patern;
    }
}
