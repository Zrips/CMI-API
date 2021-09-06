package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public enum CMIDamageCause {

    BLOCK_EXPLOSION,
    CONTACT,
    CRAMMING,
    CUSTOM,
    DRAGON_BREATH,
    DROWNING,
    DRYOUT,
    ENTITY_ATTACK,
    ENTITY_EXPLOSION,
    ENTITY_SWEEP_ATTACK,
    FALL,
    FALLING_BLOCK,
    FIRE,
    FIRE_TICK,
    FLY_INTO_WALL,
    HOT_FLOOR,
    LAVA,
    LIGHTNING,
    MAGIC,
    MELTING,
    POISON,
    PROJECTILE,
    STARVATION,
    SUFFOCATION,
    SUICIDE,
    THORNS,
    VOID,
    WITHER;

    static HashMap<String, CMIDamageCause> byName = new HashMap<String, CMIDamageCause>();

    static {
    }

    private String name = null;
    private String secondaryName = null;
    private DamageCause cause = null;

    CMIDamageCause() {
	this(null, null);
    }

//    CMIDamageCause(String name) {
//	this(name, null);
//    }

    CMIDamageCause(String name, String secondaryName) {
	this.name = name;
	this.secondaryName = secondaryName;
    }

    public String getName() {
	return name;
    }

    public String getSecondaryName() {
	return secondaryName;
    }

    public static CMIDamageCause getByName(String name) {
	return byName.get(name.toLowerCase().replace("_", ""));
    }

    public DamageCause getCause() {
	return cause;
    }
}
