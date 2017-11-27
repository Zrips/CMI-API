/**
 * Copyright (C) 2017 Zrips
 */

package com.Zrips.CMI;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.CMIServerProperties;

public class Reflections {

    private Class<?> CraftServerClass;
    private Class<?> CraftWorldClass;
    private Object CraftServer;
    private Class<?> CraftStatistic;
    private Class<?> Statistics;
    private Class<?> MinecraftServerClass;
    private Class<?> PropertyManagerClass;
    private Object MinecraftServer;
    private Class<?> ServerStatisticManager;

//    private Class<?> EntityPlayer;
//    private Class<?> CraftPlayer;
//    private Class<?> EnumHand;

//    private Class<?> IChatBaseComponent$ChatSerializer;
//    private Class<?> CraftMetaBook;
    private Class<?> CraftItemStack;
    private Class<?> Item;
    private Class<?> IStack;
    private CMI plugin;

    public Reflections(CMI plugin) {
	this.plugin = plugin;
	initialize();
    }

    private void initialize() {
	
    }

    public int getCurrentTick() {
	return 0;
    }


    public Object getItemInfo(int id, String fieldName) {
	return null;
    }

    private static Class<?> getBukkitClass(String nmsClassString) throws ClassNotFoundException {
	return null;
    }

    public Class<?> getMinecraftClass(String nmsClassString) throws ClassNotFoundException {
	return null;
    }

    public void setServerProperties(CMIServerProperties setting, Object value, boolean save) {
    }

    public void manageEnchantment(Enchantment enchant, boolean disable) {
    }

    public void setMotd(String motd) {
    }

    public Long getStatistic(UUID uuid, Statistic stat) {
	return null;
    }

    private static Object getPlayerHandle(Player player) {
	return null;
    }

    private static Object getPlayerConnection(Player player) {
	return null;
    }

    private Object getCraftWorld(World world) {
	return null;
    }

    private Object getTileEntityAt(Location loc) {
	return null;
    }

    public boolean openSignUI(Player player, Sign sign) {	
	return false;
    }

    public void sendPlayerPacket(Player player, Object packet) throws Exception {
    }

    public String getItemMinecraftName(ItemStack item) {
	return null;
    }

    public boolean hasNbt(ItemStack item) {
	    return false;	
    }

    public Object CraftItemStack(ItemStack item) {
	return null;
    }

    public void respawn(Player player) {
    }


    public Object getCraftServer() {
	return null;
    }
}
