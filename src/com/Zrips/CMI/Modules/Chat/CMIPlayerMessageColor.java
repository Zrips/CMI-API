package com.Zrips.CMI.Modules.Chat;

import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class CMIPlayerMessageColor {

    private CMIChatColor color;
    private Set<CMIChatColor> formats = null;

    public CMIPlayerMessageColor(CMIChatColor color) {
        this(color, null);
    }

    public CMIPlayerMessageColor(CMIChatColor color, @Nullable Set<CMIChatColor> formats) {
        this.color = color;
        this.formats = formats == null ? null : formats.isEmpty() ? null : formats;
    }

    public CMIChatColor getColor() {
        return color;
    }

    public void setColor(CMIChatColor color) {
        this.color = color;
    }

    public Set<CMIChatColor> getFormats() {
        return formats;
    }

    public void setFormat(Set<CMIChatColor> formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return color.getBukkitColorCode() + formatsToString();
    }

    public String formatsToString() {
        if (formats == null || formats.isEmpty()) {
            return "";
        }

        return formats.stream()
            .map(CMIChatColor::getBukkitColorCode)
            .collect(Collectors.joining());
    }
}
