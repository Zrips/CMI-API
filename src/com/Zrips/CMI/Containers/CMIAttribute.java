package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;

import javax.annotation.Nullable;

import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Entity;

public enum CMIAttribute {
    SCALE("GENERIC_SCALE"), MOVEMENT_SPEED("GENERIC_MOVEMENT_SPEED"), MAX_HEALTH("GENERIC_MAX_HEALTH");

    Object attribute;
    private static Method method = null;

    CMIAttribute(org.bukkit.attribute.Attribute attribute) {
    }

    CMIAttribute(String attribute) {
    }

    public Object getAttribute() {
        return null;
    }

    @Nullable
    public AttributeInstance get(Entity ent) {
        return null;
    }

    public void setBaseValue(Entity ent, double value) {
    }

    public double getValue(Entity ent) {
        return 0.0;
    }

    public double getBaseValue(Entity ent) {
        return 0.0;
    }
}
