package com.Zrips.CMI.Modules.Holograms;

public enum CMIFont {

    SPACE(' ', 3),
    DEFAULT('a', 4);

    private char character;
    private int length;

    CMIFont(char character, int length) {
        this.character = character;
        this.length = length;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getLength() {
        return this.length;
    }

    public int getBoldLength() {
        if (this == CMIFont.SPACE)
            return this.getLength();
        return this.length + 1;
    }

    public static CMIFont getDefaultFontInfo(char c) {
        return CMIFont.DEFAULT;
    }

    public static int getWidth(String text) {
        int pixels = 0;
        return pixels;
    }
}
