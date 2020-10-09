package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class CMISound {

    private static HashMap<String, Sound> soundsByname = new HashMap<String, Sound>();

    private String rawName = null;
    private Sound sound = null;
    private float pitch = 1;
    private float volume = 1;
    private boolean enabled = true;

    public CMISound(String name) {
	this(name, 1, 1);
    }

    public CMISound(String name, float volume, float pitch) {	
    }

    public Sound getSound() {
	return sound;
    }

    public CMISound setSound(Sound sound) {
	this.sound = sound;
	return this;
    }

    public CMISound play(Location loc) {
	return null;
    }

    public CMISound play(Player player) {
	return null;
    }

    public float getPitch() {
	return pitch;
    }

    public CMISound setPitch(float pitch) {
	this.pitch = pitch;
	return this;
    }

    public float getVolume() {
	return volume;
    }

    public CMISound setVolume(float volume) {
	this.volume = volume;
	return this;
    }

    public String getRawName() {
	return rawName;
    }

    @Override
    public String toString() {
	return null;
    }

    private static String fmt(float d) {
	return String.format("%s", d);
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }
}
