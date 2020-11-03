package com.Zrips.CMI.NBT;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Effect;
import org.bukkit.Location;
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

public interface NMS {

    public void setMiscLocation(Player player, Location location);

    public void setMiscLocation(File file, Location location);

    public void clearPotionEffects(Player player);

    public void setPotionEffects(Player player, PotionEffect potion);

    public void relightChunk(Chunk chunk);

    public void resendChunk(Chunk chunk, Player player);

    public void unloadChunk(Chunk chunk, Player player);

    public ItemStack getItemInMainHand(Player player);

    public void setItemInMainHand(Player player, ItemStack item);

    Player getPlayer(CMIUser user);

    BlockPlaceEvent createSignEvent(Block block, Sign sign, Player player);

    BlockPlaceEvent placeSignEvent(Block block, Sign sign, Player player);

    BlockPlaceEvent placeBlockEvent(Block block, Player player);

    ItemStack addAttributes(List<Attribute> ls, ItemStack item);

    void updateCollisions(Player player, boolean collision, boolean onlyTarget);

    void processEntity(Entity ent, String var);

    Inventory getShulkerInv(ItemStack Item);

    Inventory getShulkerInv(Block block);

    int getTickLived(UUID uuid);

    public void showResurection(Player player);

    public int getEggId(ItemStack item);

    EntityType getEggType(ItemStack item);

    ItemStack setEggType(ItemStack item, EntityType etype);

    ItemStack BookLockState(ItemStack item, int state);

    boolean changeGameModePlayerSide(Player player, int state);

    boolean changeInstaBuild(Player player, boolean state, boolean checkInsta);

    ItemStack setUnbreakable(ItemStack item, boolean state);

    boolean changeGodMode(Player player, boolean state);

    boolean getGodMode(Player player);

    String getItemMinecraftName(ItemStack item);

    ItemStack modifyItemStack(ItemStack stack, String arguments);

    ItemStack tryToMakeShulkerBox(ItemStack OneItem);

//    void updateInventoryTitle(Player p, String title);

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

    void printNBT(Object t, int level, CommandSender sender);

    void printEntityTag(Entity entity, Player player);

    Command getCommand(String command);

    void removeHologram(Player player, Integer id);

    CMIDataWatcher spawnHologram(Player player, Location loc, String text, ItemStack item);

    void updateHologram(Player player, CMIDataWatcher aw, String text, ItemStack item);

    CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item);

    CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item, boolean glow);

    void playSound(Player player, Location loc, Sound sound, float volume, float pitch);

    boolean clearSkin(Player player);

    void updatePlayerViaPackets(Player player);

    void unloadData(Player player);

    void loadAdvancement(org.bukkit.NamespacedKey key, String advancement);

    void removeAdvancement(CMIAdvancement advancement);

    void playEffect(Player player, Location location, Effect effect, float offsetX, float offsetY, float offsetZ, float speed, int particleCount);

    ItemStack removeEnchantNbt(ItemStack item, Enchantment enchant);

    @Deprecated
    void playEffect(Player player, Location location, Effect effect, Color color);

    void playEffect(Player player, Location location, CMIEffect ef);

    @Deprecated
    void playEffect(Player player, Location location, CMIParticle eff, float offsetX, float offsetY, float offsetZ, float speed, int particleCount);

    boolean forceTeleport(Player player, Location location);

    HashMap<BlockStateType, String> getBlockStates(Block block);

    CMIHitBox getBlockHitBox(CMIHitBox hb);

    Block getBlockLookingAt(Player player, int reach, boolean fluids);

    CMIHitBox getEntityHitBox(CMIHitBox hb);

    Block getBlockLookingAt(World w, Vector start, Vector end, boolean fluids);

    FakeInfo spawnClickable(Player player, Location loc, Object obj, boolean big);

    Object createFakeEntityForTablist(Player player, String fakeName);

    void sendPacketsForTablistSort(Player player, Player who, Object entity);

    Player createFakeOperator();

    String getWorldName(File file);

    void setEntityTag(Entity entity, String path, Object value);

//    TreeMap<Long, CMIIpBanEntry> getIpBans();

//    void printEntityTag(Entity object, Player player);

}
