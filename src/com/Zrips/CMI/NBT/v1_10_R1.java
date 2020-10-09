package com.Zrips.CMI.NBT;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Containers.BlockStateType;
import com.Zrips.CMI.Containers.CMIHitBox;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Advancements.CMIAdvancement;
import com.Zrips.CMI.Modules.Attributes.Attribute;
import com.Zrips.CMI.Modules.Holograms.CMIDataWatcher;
import com.Zrips.CMI.Modules.Packets.FakeInfo;
import com.Zrips.CMI.Modules.Particl.CMIEffect;
import com.Zrips.CMI.Modules.Particl.CMIEffectManager.CMIParticle;

public class v1_10_R1 implements NMS {

    @Override
    public void setMiscLocation(Player player, Location location) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void setMiscLocation(File file, Location location) {
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

    @Override
    public void printNBT(Object t, int level, CommandSender sender) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void printEntityTag(Entity entity, Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Command getCommand(String command) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void removeHologram(Player player, Integer id) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public CMIDataWatcher spawnHologram(Player player, Location loc, String text, ItemStack item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateHologram(Player player, CMIDataWatcher aw, String text, ItemStack item) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item, boolean glow) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void playSound(Player player, Location loc, Sound sound, float volume, float pitch) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean clearSkin(Player player) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public void updatePlayerViaPackets(Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void unloadData(Player player) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void loadAdvancement(NamespacedKey key, String advancement) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void removeAdvancement(CMIAdvancement advancement) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void playEffect(Player player, Location location, Effect effect, float offsetX, float offsetY, float offsetZ, float speed, int particleCount) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public ItemStack removeEnchantNbt(ItemStack item, Enchantment enchant) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void playEffect(Player player, Location location, Effect effect, Color color) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void playEffect(Player player, Location location, CMIEffect ef) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void playEffect(Player player, Location location, CMIParticle eff, float offsetX, float offsetY, float offsetZ, float speed, int particleCount) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean forceTeleport(Player player, Location location) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public HashMap<BlockStateType, String> getBlockStates(Block block) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public CMIHitBox getBlockHitBox(CMIHitBox hb) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Block getBlockLookingAt(Player player, int reach, boolean fluids) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public CMIHitBox getEntityHitBox(CMIHitBox hb) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Block getBlockLookingAt(World w, Vector start, Vector end, boolean fluids) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public FakeInfo spawnClickable(Player player, Location loc, Object obj, boolean big) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Object createFakeEntityForTablist(Player player, String fakeName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void sendPacketsForTablistSort(Player player, Player who, Object entity) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Player createFakeOperator() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String getWorldName(File file) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void setEntityTag(Entity entity, String path, Object value) {
	// TODO Auto-generated method stub
	
    }

}
