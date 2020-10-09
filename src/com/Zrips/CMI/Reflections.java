/**
 * Copyright (C) 2017 Zrips
 */

package com.Zrips.CMI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.Scoreboard;

import com.Zrips.CMI.Containers.CMIServerProperties;
import com.mojang.authlib.GameProfile;

public class Reflections {

    private Class<?> CraftWorldClass;
    private Object CraftServer;

    public static Class<?> nmsChatSerializer;

    private CMI plugin;

    public Reflections(CMI plugin) {
	this.plugin = plugin;
	initialize();
    }

    private void initialize() {
    }

    public String serializeText(String text) {
	return null;
    }

    public Object textToIChatBaseComponent(String text) {
	return null;
    }


    public void exitBed(Player p) {
    }

    public int getCurrentTick() {
	return 1;
    }

    public Object getItemInfo(int id, String fieldName) {
	return null;
    }

    private static Class<?> getBukkitClass(String nmsClassString) {
	return null;
    }

    public Class<?> getMinecraftClass(String nmsClassString) {
	return null;
    }

    public void setServerProperties(CMIServerProperties setting, Object value, boolean save) {
    }

    public void changePlayerLimit(int amount) {
    }

    @SuppressWarnings("deprecation")
    public void setGameMode(Player player, GameMode mode) {
    }

    public boolean isNbtSimilar(ItemStack is, ItemStack is2) {
	return false;
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    public void manageEnchantment(Enchantment enchant, boolean disable) {
    }

    public void setMotd(String motd) {
    }

    public GameProfile getProfile(Player player) {
	return null;
    }

    public int getPing(Player player) {
	return 999;
    }

    public Long getStatistic(UUID uuid, Statistic stat) {
	return null;
    }

    public Object getPlayerHandle(Player player) {
	return null;
    }

    private Object getEntityHandle(Entity ent) {
	return null;
    }

    private Object getPlayerConnection(Player player) {
	return null;
    }

    private Object getDimensionManager(World world) {
	return null;
    }

    public String getServerName() {
	return null;
    }

    private Object getCraftWorld(World world) {
	return this.CraftWorldClass.cast(world);
    }

    private Object getWorldServer(World world) {
	return null;
    }

    private Object getBlockPosition(Location loc) {
	return null;
    }

    public Object getTileEntityAt(Location loc) {
	return null;
    }

    public int getHoneyLevel(Block block) {
	return 0;
    }

    public int getBeesInside(Block block) {
	return 0;
    }

    public boolean openSignUI(Player player, Sign sign) {	
	return false;
    }

    public void sendPlayerPacket(Player player, Object packet) throws Exception {
    }

    public String toJson(ItemStack item) {
	return null;
    }

    public String getItemMinecraftName(ItemStack item) {
	return null;
    }

    public void upadteItemWithPacket(Player player, ItemStack item, int slot) {
    }

    @SuppressWarnings("deprecation")
    public String getItemMinecraftNamePath(ItemStack item) {
	return null;
    }

    public boolean hasNbt(ItemStack item) {
	return false;
    }

    public Object getNbt(Entity entity) {
	return null;
    }

    public Object getNbt(ItemStack item) {
	return null;
    }

    public Object getNbt(ItemStack item, String path) {
	return null;
    }

    public ItemStack setNbt(ItemStack item, String path, String value) {
	return null;
    }

    public ItemStack setSkullTexture(ItemStack item, String customProfileName, String texture) {	
	return null;
    }

    public Object getNbt(Block block) {
	return null;
    }

    public Short getNbtValueShort(Object tag, String path) {
	return null;
    }

    public Integer getNbtValueInt(Object tag, String path) {
	return null;
    }

    public Object setNbtValueShort(Object tag, String path, Object value) {
	return null;
    }

    public void updateTileEntity(Location loadValue, Object tag) {	
    }

    public Object asNMSCopy(ItemStack item) {
	return null;
    }

    public Object asBukkitCopy(Object item) {
	return null;
    }

    public void respawn(Player player) {
    }

    public Object getCraftServer() {
	return CraftServer;
    }

    public void openBook(ItemStack i, Player p) {	
    }

    public ItemStack getItemInOffHand(Player player) {
	return null;
    }

//    public void setEndermiteActive(Entity ent, boolean state) {
//
//    }

    public Class<?> getClass(String classname) {
	return null;
    }

    public Object getNmsPlayer(Player p) throws Exception {
	return null;
    }

    public Object getNmsScoreboard(Scoreboard s) throws Exception {
	return null;
    }

    public Object getFieldValue(Object instance, String fieldName) throws Exception {
	return null;
    }

    @SuppressWarnings("unchecked")
    public <T> T getFieldValue(Field field, Object obj) {
	return null;
    }

    public Field getField(Class<?> clazz, String fieldName) throws Exception {
	return null;
    }

    public void setValue(Object instance, String field, Object value) {
    }

    public void sendAllPacket(Object packet) throws Exception {
    }

    public void sendListPacket(List<String> players, Object packet) {
    }

    private static final Map<Class<?>, Class<?>> CORRESPONDING_TYPES = new HashMap<Class<?>, Class<?>>();

    public Class<?> getPrimitiveType(Class<?> Class) {
	return null;
    }

    public Method getMethod(String MethodName, Class<?> Class, Class<?>... Parameters) {
	return null;
    }

    public boolean equalsTypeArray(Class<?>[] Value1, Class<?>[] Value2) {
	return true;
    }

    public Class<?>[] toPrimitiveTypeArray(Class<?>[] Classes) {
	return null;
    }

    public Object invokeMethod(String MethodName, Object Parameter) {
	return null;
    }

    public Object getPlayerField(Player Player, String Field) {
	return null;
    }

    public Integer getActiveContainerId(Player player) {
	return null;
    }

    private Integer getActiveContainerId(Object entityplayer) {
	return null;
    }

    private Object getContainer(String name) {
	return null;
    }

    public void updateInventoryTitle(Player p, String title) {
    }

    public ItemStack HideFlag(ItemStack item, int state) {
	return null;
    }

    public void superficialEntityTeleport(Player player, Object entity, Location targetLoc) {
    }

    public void spawnInEntityData(Player player, Entity entity) {
    }
}
