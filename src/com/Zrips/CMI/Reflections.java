/**
 * Copyright (C) 2017 Zrips
 */

package com.Zrips.CMI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Reflections {

    private Class<?> CraftServerClass;
    private Object CraftServer;
    private Class<?> MinecraftServerClass;
    private Object MinecraftServer;
    private Class<?> PlayerList;

    private Class<?> EntityHuman;
    private Class<?> EntityPlayer;
    private Class<?> EnumGameMode;
    private Class<?> CraftPlayer;
    private Class<?> CEntity;
    private Class<?> nbtTagCompound;
    private Class<?> nbtTagList;
//    private Class<?> NBTBase;
    private Class<?> EnumHand;
    private Class<?> CraftBeehive;
    private Class<?> TileEntityBeehive;

    private Class<?> CraftItemStack;
    private Class<?> IStack;
    private Class<?> dimensionManager;
    private Class<?> PacketPlayOutAnimation;

    Field playerConnection;
    Method sendPacket;

    private CMI plugin;

    public Reflections(CMI plugin) {
        this.plugin = plugin;
        initialize();
    }

    private void initialize() {

    }

    private static Class<?> getBukkitClass(String nmsClassString) {
        return null;
    }

    public Class<?> getMinecraftClass(String nmsClassString) {
        return null;
    }

    public void exitBed(Player p) {

    }

    public void setOnGround(Player p, boolean state) {
     
    }

    public void changePlayerLimit(int amount) {
      
    }

    @SuppressWarnings("deprecation")
    public void setGameMode(Player player, GameMode mode) {
      
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    public void manageEnchantment(Enchantment enchant, boolean disable) {
       
    }

    public void setMotd(String motd) {
       
    }

    public int getPing(Player player) {
       
        return 999;
    }

    public int getHoneyLevel(Block block) {
      
        return 0;
    }

    public int getBeesInside(Block block) {
       
        return 0;
    }

    public boolean openCartographyTable(Player player) {
      
        return false;
    }

    public boolean openGrindstone(Player player) {
       
        return false;
    }

    public boolean openLoom(Player player) {
       
        return false;
    }

    public boolean openSmithingTable(Player player) {

        return false;
    }

    public boolean openStonecutter(Player player) {
      
        return false;
    }

    public boolean openSignUI(Player player, Sign sign) {
      
        return false;
    }

    public void respawn(Player player) {

    }

    public void openBook(ItemStack i, Player p) {
      
    }

    public void printItemNBT(ItemStack item, CommandSender sender) {
       
    }

    public void printEntityNBT(Entity entity, CommandSender sender) {
    }

    public void printNBT(Object t, int level, CommandSender sender, List<String> path) {
       
    }

    public ItemStack tryToMakeShulkerBox(ItemStack item) {       
        return item;
    }
}
