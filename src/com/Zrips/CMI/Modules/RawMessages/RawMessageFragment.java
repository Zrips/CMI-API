package com.Zrips.CMI.Modules.RawMessages;

import java.util.HashSet;
import java.util.Set;

import com.Zrips.CMI.Containers.CMIChatColor;

public class RawMessageFragment {

    private CMIChatColor lastColor = null;
    private Set<CMIChatColor> formats = new HashSet<CMIChatColor>();
    private String font = null;
    private String text = "";

    public RawMessageFragment() {
    }

    public RawMessageFragment(RawMessageFragment old) {
    }

    public CMIChatColor getLastColor() {
	return lastColor;
    }

    public void setLastColor(CMIChatColor lastColor) {
	this.lastColor = lastColor;
	formats.clear();
    }

    public Set<CMIChatColor> getFormats() {
	return formats;
    }

    public void setFormats(Set<CMIChatColor> formats) {
	this.formats = formats;
    }

    public void addFormat(CMIChatColor format) {
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getFont() {
	return font;
    }

    public void setFont(String font) {
    }
}
