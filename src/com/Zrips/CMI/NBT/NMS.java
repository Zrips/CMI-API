package com.Zrips.CMI.NBT;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Containers.CMIHitBox;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Holograms.CMIDataWatcher;
import com.Zrips.CMI.Modules.Packets.FakeInfo;

public interface NMS {
    public void setMiscLocation(Player player, Location location);

    public void setMiscLocation(File file, Location location);

    public void clearPotionEffects(Player player);

    public void setPotionEffects(Player player, PotionEffect potion);

    public void relightChunk(Chunk chunk);

    public void resendChunk(Chunk chunk, Player player);

    public void unloadChunk(Chunk chunk, Player player);

    Player getPlayer(CMIUser user);

    void updateCollisions(Player player, boolean collision, boolean onlyTarget);

    Inventory getShulkerInv(ItemStack Item);

    Inventory getShulkerInv(Block block);

    int getTickLived(UUID uuid);

    public void showResurection(Player player);

    boolean changeGodMode(Player player, boolean state);

    boolean getGodMode(Player player);

    @Deprecated
    ItemStack setNBTList(ItemStack item, String name, List<String> list);

    void updateExpBar(Player player);

    Command getCommand(String command);

    void removeHologram(Player player, Integer id);

    CMIDataWatcher spawnHologram(Player player, Location loc, String text, ItemStack item);

    void updateHologram(Player player, CMIDataWatcher aw, String text, ItemStack item);

    CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item);

    CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item, boolean glow);

    boolean clearSkin(Player player);

    void updatePlayerViaPackets(Player player);

    void unloadData(Player player);

    ItemStack removeEnchantNbt(ItemStack item, Enchantment enchant);

    boolean forceTeleport(Player player, Location location);

    CMIHitBox getBlockHitBox(CMIHitBox hb);

    Block getBlockLookingAt(Player player, int reach, boolean fluids);

    CMIHitBox getEntityHitBox(CMIHitBox hb);

    Block getBlockLookingAt(World w, Vector start, Vector end, boolean fluids);

    FakeInfo spawnClickable(Player player, Location loc, Object obj, boolean big);

    Player createFakeOperator();

    String getWorldName(File file);

    void setEntityTag(Entity entity, String path, Object value);
}
