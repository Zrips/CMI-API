package com.Zrips.CMI.Modules.MirrorV2;

import org.bukkit.util.Vector;

public enum CMIMirrorTypeV2 {
    X("&eMirrors on &6X &eaxis", 0, new Vector(1, 0, 0)), Y("&eMirrors on &6Y &eaxis", 1, new Vector(0, 1, 0)), Z("&eMirrors on &6Z &eaxis", 2, new Vector(0, 0, 1)), XR("&eSpreads on &6X &eaxis", 4,
        new Vector(1, 0, 0), true), YR("&eSpreads on &6Y &eaxis", 5, new Vector(0, 1, 0), true), ZR("&eSpreads on &6Z &eaxis", 6, new Vector(0, 0, 1), true), XY180("&e180 on &6Z &eaxis", 18, new Vector(1,
            1, 0)), YZ180("&e180 on &6X &eaxis", 19, new Vector(0, 1, 1)), ZX180("&e180 on &6Y &eaxis", 20, new Vector(1, 0, 1)), XYZ180("&e180 on &6All &eaxis", 21, new Vector(1, 1, 1)), X90(
                "&e90 on &6X &eaxis", 40, new Vector(1, 0, 0)), Y90("&e90 on &6Y &eaxis", 41, new Vector(0, 1, 0)), Z90("&e90 on &6Z &eaxis", 42, new Vector(0, 0, 1)), X90R("&e-90 on &6X &eaxis", 49,
                    new Vector(-1, 0, 0)), Y90R("&e-90 on &6Y &eaxis", 50, new Vector(0, -1, 0)), Z90R("&e-90 on &6Z &eaxis", 51, new Vector(0, 0, -1)), XYM("&eMirrors by &6X &eto &6Y &eplane", 36,
                        new Vector(1, 1, 0)), XYMR("&eMirrors by &6X &eto &6Y &eplane reverse", 45, new Vector(1, -1, 0)), YZM("&eMirrors by &6Z &eto &6Y &eplane", 37, new Vector(0, 1, 1)), YZMR(
                            "&eMirrors by &6Y &eto &6Z &eplane reverse", 46, new Vector(0, 1, -1)), ZXM("&eMirrors by &6X &eto &6Z &eplane", 38, new Vector(1, 0, 1)), ZXMR(
                                "&eMirrors by &6X &eto &6Z &eplane reverse", 47, new Vector(1, 0, -1));

    private int slot;
    private String desc;
    private Vector vector;
    private boolean sections = false;

    private CMIMirrorTypeV2(String desc, int slot, Vector vector, boolean sections) {
    }

    private CMIMirrorTypeV2(String desc, int slot, Vector vector) {
    }

    public int getSlot() {
        return 0;
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String desc) {
    }

    public String getName() {
        return null;
    }

    public Vector getVector() {
        return null;
    }

    public void setVector(Vector vector) {
    }

    public boolean isSections() {
        return false;
    }

    public void setSections(boolean sections) {
    }
}
