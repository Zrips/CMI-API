package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class PlayerListeners implements Listener {
    private CMI plugin;

    public PlayerListeners(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<UUID, Long> informMap = new HashMap<UUID, Long>();


    class HungerCache {
	private int hunger = 20;
	private float saturation = 5F;

	public HungerCache(int hunger, float saturation) {
	    this.hunger = hunger;
	    this.saturation = saturation;
	}

	public int getHunger() {
	    return hunger;
	}

	public void setHunger(int hunger) {
	    this.hunger = hunger;
	}

	public float getSaturation() {
	    return saturation;
	}

	public void setSaturation(float saturation) {
	    this.saturation = saturation;
	}
    }

    HashMap<UUID, HungerCache> hungerMap = new HashMap<UUID, HungerCache>();

    class vehicleLast {
	private UUID uuid;
	private Entity vehicle;
	private int tick;

	public vehicleLast(UUID uuid, Entity vehicle, int tick) {
	    this.uuid = uuid;
	    this.vehicle = vehicle;
	    this.tick = tick;
	}

	public UUID getUuid() {
	    return uuid;
	}

	public Entity getVehicle() {
	    return vehicle;
	}

	public int getTick() {
	    return tick;
	}

    }

    HashMap<UUID, vehicleLast> mapVehicle = new HashMap<UUID, vehicleLast>();


    Set<UUID> signEditCache = new HashSet<UUID>();

    public static HashMap<UUID, String[]> scMap = new HashMap<UUID, String[]>();

    HashMap<UUID, Long> elevatorUsage = new HashMap<UUID, Long>();

}
