package com.Zrips.CMI.Modules.Display;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.entity.Display.Billboard;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Transformation;

public class CMIDisplay {
    CMIDisplayTransform transform;
    private static Constructor<?> TextDisplay;
    private static Constructor<?> ItemDisplay;
    private static Constructor<?> BlockDisplay;
    private static Constructor<?> InteractDisplay;
    private static Object textDisplayEntityType;
    private static Object itemDisplayEntityType;
    private static Object blockDisplayEntityType;
    private static Object interactionEntityType;
    private static Class<?> worldClass;
    private static Constructor<?> PacketPlayOutSpawnEntity;
    private static Constructor<?> PacketPlayOutEntityMetadata;
    private static Constructor<?> PacketPlayOutEntityDestroy;
    private static Method sendPacket;
    private static Method method1;
    private static Method method2;
    private static Field playerConnection;
    private static Method setLocationMethod;
    protected Location loc;
    protected org.bukkit.entity.Entity display;
    protected Object d;
    private int id;
    private CMIDisplayType type;
    private static Constructor<?> packetConstructor;
    private static Field vehicleField;
    private static Field passengersField;
    private static boolean fail;

    public CMIDisplay(CMIDisplayType type, Location loc) {
    }

    public Entity getDisplayEntity() {
        return null;
    }

    public Transformation getTransformation() {
        return null;
    }

    public void getTransformation(Transformation transformation) {
    }

    public void setWidth(double width) {
    }

    public void setHeight(double height) {
    }

    public void setInterpolationDuration(int duration) {
    }

    public int getInterpolationDuration() {
        return 0;
    }

    public void setInterpolationDelay(int delay) {
    }

    public int getInterpolationDelay() {
        return 0;
    }

    public void setLocation(Location loc) {
    }

    public float getRange() {
        return 0.0f;
    }

    public void setRange(int range) {
    }

    public void setBrightness(int skyValue, int blockValue) {
    }

    public void setBillboard(Billboard billboard) {
    }

    public Billboard getBillboard() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public Object getDisplay() {
        return null;
    }

    private static void initPassengerPacket() {
    }

    public void addAsPassenger(Player receiver, Entity vehicle) {
    }

    public void addAsPassenger(Set<Player> receivers, Entity vehicle) {
    }

    private static void sendPacket(Object connection, Object packet) {
    }

    public void show(Player player) {
    }

    public void update(Player player) {
    }

    public void update(Player player, boolean updatePosition) {
    }

    public void destroy(Player player) {
    }

    public int getId() {
        return 0;
    }
}
