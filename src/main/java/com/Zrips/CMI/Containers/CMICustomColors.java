package com.Zrips.CMI.Containers;

public enum CMICustomColors {
    Ivory("FFFFF0"),
    White("FFFFFF");

    private String hex;
    private String[] extra;
    private long rgb = 0;

    CMICustomColors(String hex, String... extra) {
	this.hex = hex.toLowerCase();
	this.extra = extra;
	rgb = Long.parseLong(hex, 16);
    }

    public String getHex() {
	return hex;
    }

    public String[] getExtra() {
	return extra;
    }

    public long getRgb() {
	return rgb;
    }
}