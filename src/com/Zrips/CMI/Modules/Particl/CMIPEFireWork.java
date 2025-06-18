package com.Zrips.CMI.Modules.Particl;

import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class CMIPEFireWork extends CMIPEAnimation {
    private static Method world_getHandle;
    private static Method nms_world_broadcastEntityEffect;
    private static Method firework_getHandle;
    private Color fadeFrom;
    private Color fadeTo;
    private Type type;
    private Boolean flicker;
    private Boolean trail;

    public CMIPEFireWork() {
    }

    @Override
    public boolean render(List<Player> players) {
        return false;
    }

    private static void ShotFirework(Location loc, FireworkEffect fe) throws Exception {
    }

    private static Method getMethod(Class<?> cl, String method) {
        return null;
    }

    public Color getFadeFrom() {
        return null;
    }

    public void setFadeFrom(Color fadeFrom) {
    }

    public Color getFadeTo() {
        return null;
    }

    public void setFadeTo(Color fadeTo) {
    }

    public Type getType() {
        return null;
    }

    public void setType(Type type) {
    }

    public Boolean getFlicker() {
        return null;
    }

    public void setFlicker(Boolean flicker) {
    }

    public Boolean getTrail() {
        return null;
    }

    public void setTrail(Boolean trail) {
    }
}
