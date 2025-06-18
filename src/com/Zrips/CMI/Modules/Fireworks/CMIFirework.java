package com.Zrips.CMI.Modules.Fireworks;

import java.util.Set;
import java.util.regex.Pattern;

import org.bukkit.FireworkEffect;

public class CMIFirework {
    int count;
    int power;
    boolean shootAtAngle;
    private Set<FireworkEffect> explosions;
    private static String prefix;
    private static String suffix;
    static Pattern p;
    static Pattern c;
    static Pattern ex;

    public CMIFirework() {
    }

    public CMIFirework(String text) {
    }
}
