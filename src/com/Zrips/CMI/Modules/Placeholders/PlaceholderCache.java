package com.Zrips.CMI.Modules.Placeholders;

public class PlaceholderCache {
    private long validUntil = 0L;
    private String value = null;

    public long getValidUntil() {
	return validUntil;
    }

    public void setValidUntil(long validUntil) {
	this.validUntil = validUntil;
    }

    public String getValue() {
	return value;
    }

    public void setValue(String value) {
	this.value = value;
    }
}
