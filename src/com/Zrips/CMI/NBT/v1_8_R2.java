package com.Zrips.CMI.NBT;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import com.Zrips.CMI.NMS;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Attributes.Attribute;
import com.Zrips.CMI.Modules.Scan.ScanResultLocations;

public class v1_8_R2 implements NMS {

    @Override
    public String GetnameFromFile(File file) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setMiscLocation(Player player, Location location) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setMiscLocation(File file, Location location) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Location getMiscLocation(File file) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setIpAndTime(Player player, String ip, long time) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public String getIp(Player player) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public long getLoginTime(Player player) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public ScanResultLocations checkArmorStand(ScanResultLocations results, Entity ent) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void removeFromArmorStand(List<ItemStack> toRemove, Entity oneEnt) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void clearPotionEffects(Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setPotionEffects(Player player, PotionEffect potion) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public int getPing(Player player) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public void relightChunk(Chunk chunk) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void resendChunk(Chunk chunk, Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void unloadChunk(Chunk chunk, Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public ItemStack getItemInMainHand(Player player) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setItemInMainHand(Player player, ItemStack item) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Player getPlayer(CMIUser user) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Player getPlayer(String playerName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public BlockPlaceEvent createSignEvent(Block block, Sign sign, Player player) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public BlockPlaceEvent placeSignEvent(Block block, Sign sign, Player player) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public BlockPlaceEvent placeBlockEvent(Block block, Player player) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void changePlayerLimit(int amount) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void sendTitle(Player player, Object title, Object subtitle) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public ItemStack addAttributes(List<Attribute> ls, ItemStack item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateCollisions(Player player, boolean collision, boolean onlyTarget) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void processEntity(Entity ent, String var) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Inventory getShulkerInv(ItemStack Item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Inventory getShulkerInv(Block block) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean isValidContainer(Block block) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public int getTickLived(UUID uuid) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public void showResurection(Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public int getEggId(ItemStack item) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public EntityType getEggType(ItemStack item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack setEggType(ItemStack item, EntityType etype) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack HideFlag(ItemStack item, int state) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack BookLockState(ItemStack item, int state) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean changeGameModePlayerSide(Player player, int state) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean changeInstaBuild(Player player, boolean state, boolean checkInsta) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public ItemStack setUnbreakable(ItemStack item, boolean state) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public boolean changeGodMode(Player player, boolean state) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean getGodMode(Player player) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public String getItemMinecraftName(ItemStack item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack modifyItemStack(ItemStack stack, String arguments) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack tryToMakeShulkerBox(ItemStack OneItem) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateInventoryTitle(Player p, String title) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public List<String> getNBTList(ItemStack item, String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack setNBTList(ItemStack item, String name, List<String> list) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack setNBTString(ItemStack item, String name, String value) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getNBTString(ItemStack item, String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateExpBar(Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void printNBT(ItemStack item, CommandSender sender) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Integer getNBTInt(ItemStack item, String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack setNBTInt(ItemStack item, String name, Integer value) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Long getNBTLong(ItemStack item, String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ItemStack setNBTLong(ItemStack item, String name, Long value) {
	// TODO Auto-generated method stub
	return null;
    }

}
