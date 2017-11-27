package com.Zrips.CMI.Containers;

public enum LocaleTest {
    first_second("Normal", true),
    first_one("Ender", true),
    CHECKING("Checking", true),
    NONE("NONE", true);

    private Object text;
    private boolean color;

    private LocaleTest(Object text, boolean color) {
	this.text = text;
	this.color = color;
    }

    public Object getText() {
	return text;
    }
    
    public boolean isColorize() {
	return color;
    }
}
