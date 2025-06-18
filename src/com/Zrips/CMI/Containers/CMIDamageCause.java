package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public enum CMIDamageCause {
    BLOCK_EXPLOSION, CONTACT, CRAMMING, CUSTOM, DRAGON_BREATH, DROWNING, DRYOUT, ENTITY_ATTACK, ENTITY_EXPLOSION, ENTITY_SWEEP_ATTACK, FALL, FALLING_BLOCK, FIRE, FIRE_TICK, FLY_INTO_WALL, HOT_FLOOR, LAVA,
    LIGHTNING, MAGIC, MELTING, POISON, PROJECTILE, STARVATION, SUFFOCATION, SUICIDE, THORNS, VOID, WITHER;

    static HashMap<String, CMIDamageCause> byName = new HashMap<>();
    private String name = null;
    private String secondaryName = null;
    private DamageCause cause = null;

    CMIDamageCause() {
    }

    CMIDamageCause(String name, String secondaryName) {
    }

    public String getName() {
        return null;
    }

    public String getSecondaryName() {
        return null;
    }

    public static CMIDamageCause getByName(String name) {
        return null;
    }

    public DamageCause getCause() {
        return null;
    }
}
