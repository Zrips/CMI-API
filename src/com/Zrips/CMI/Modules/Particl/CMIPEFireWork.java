package com.Zrips.CMI.Modules.Particl;

import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import com.Zrips.CMI.CMI;

public class CMIPEFireWork extends CMIPEAnimation {

    private static Method world_getHandle = null;
    private static Method nms_world_broadcastEntityEffect = null;
    private static Method firework_getHandle = null;

    private Color fadeFrom = null;
    private Color fadeTo = null;
    private Type type = null;
    private Boolean flicker = null;
    private Boolean trail = null;

    public CMIPEFireWork() {
	this.setDuration(0);
    }

    @Override
    public boolean render(List<Player> players) {

	return true;
    }

    private static void ShotFirework(Location loc, FireworkEffect fe) throws Exception {

    }

    private static Method getMethod(Class<?> cl, String method) {
	return null;
    }

    public Color getFadeFrom() {
	return fadeFrom;
    }

    public void setFadeFrom(Color fadeFrom) {
	this.fadeFrom = fadeFrom;
    }

    public Color getFadeTo() {
	return fadeTo;
    }

    public void setFadeTo(Color fadeTo) {
	this.fadeTo = fadeTo;
    }

    public Type getType() {
	return type;
    }

    public void setType(Type type) {
	this.type = type;
    }

    public Boolean getFlicker() {
	return flicker;
    }

    public void setFlicker(Boolean flicker) {
	this.flicker = flicker;
    }

    public Boolean getTrail() {
	return trail;
    }

    public void setTrail(Boolean trail) {
	this.trail = trail;
    }

}
