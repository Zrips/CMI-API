package com.Zrips.CMI;

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

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Attributes.Attribute;
import com.Zrips.CMI.Modules.Scan.ScanResultLocations;

public interface NMS {

    public String GetnameFromFile(File file);

    public void setMiscLocation(Player player, Location location);

    public void setMiscLocation(File file, Location location);

    public Location getMiscLocation(File file);

    public void setIpAndTime(Player player, String ip, long time);

    public String getIp(Player player);

    public long getLoginTime(Player player);

    public ScanResultLocations checkArmorStand(ScanResultLocations results, Entity ent);

    public void removeFromArmorStand(List<ItemStack> toRemove, Entity oneEnt);

    public void clearPotionEffects(Player player);

    public void setPotionEffects(Player player, PotionEffect potion);

    public int getPing(Player player);

    public void relightChunk(Chunk chunk);

    public void resendChunk(Chunk chunk, Player player);

    public void unloadChunk(Chunk chunk, Player player);

    public ItemStack getItemInMainHand(Player player);

    public void setItemInMainHand(Player player, ItemStack item);

    Player getPlayer(CMIUser user);

    Player getPlayer(String playerName);

    BlockPlaceEvent createSignEvent(Block block, Sign sign, Player player);

    BlockPlaceEvent placeSignEvent(Block block, Sign sign, Player player);

    BlockPlaceEvent placeBlockEvent(Block block, Player player);

    void changePlayerLimit(int amount);

    void sendTitle(Player player, Object title, Object subtitle);

    ItemStack addAttributes(List<Attribute> ls, ItemStack item);

    void updateCollisions(Player player, boolean collision, boolean onlyTarget);

    void processEntity(Entity ent, String var);

    Inventory getShulkerInv(ItemStack Item);

    Inventory getShulkerInv(Block block);

    boolean isValidContainer(Block block);

    int getTickLived(UUID uuid);

    public void showResurection(Player player);

    public int getEggId(ItemStack item);

    EntityType getEggType(ItemStack item);

    ItemStack setEggType(ItemStack item, EntityType etype);

    ItemStack HideFlag(ItemStack item, int state);

    ItemStack BookLockState(ItemStack item, int state);

    boolean changeGameModePlayerSide(Player player, int state);

    boolean changeInstaBuild(Player player, boolean state, boolean checkInsta);

    ItemStack setUnbreakable(ItemStack item, boolean state);

    boolean changeGodMode(Player player, boolean state);

    boolean getGodMode(Player player);

    String getItemMinecraftName(ItemStack item);

    ItemStack modifyItemStack(ItemStack stack, String arguments);

    ItemStack tryToMakeShulkerBox(ItemStack OneItem);

    void updateInventoryTitle(Player p, String title);

    List<String> getNBTList(ItemStack item, String name);

    ItemStack setNBTList(ItemStack item, String name, List<String> list);

    ItemStack setNBTString(ItemStack item, String name, String value);

    String getNBTString(ItemStack item, String name);

    void updateExpBar(Player player);

    void printNBT(ItemStack item, CommandSender sender);

    Integer getNBTInt(ItemStack item, String name);

    ItemStack setNBTInt(ItemStack item, String name, Integer value);

    Long getNBTLong(ItemStack item, String name);

    ItemStack setNBTLong(ItemStack item, String name, Long value);

//    void printEntityTag(Entity object, Player player);

}
