package com.Zrips.CMI.Modules.tp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;

public class Teleportations {

    private CMI plugin;

    private Set<Material> Empty = new HashSet<Material>();
    private Set<Material> bad = new HashSet<Material>();

    private HashMap<UUID, DangerousTp> badTeleports = new HashMap<UUID, DangerousTp>();
    private int btprange = 15;

    public enum TpCondition {
	Lava, Void, Suffocation, Good, Unknown
    }

    private void fill() {
	Empty.add(Material.AIR);

	Empty.add(Material.SAPLING);
	Empty.add(Material.GRASS);
	Empty.add(Material.LONG_GRASS);
	Empty.add(Material.DEAD_BUSH);
	Empty.add(Material.YELLOW_FLOWER);
	Empty.add(Material.RED_ROSE);
	Empty.add(Material.BROWN_MUSHROOM);
	Empty.add(Material.RED_MUSHROOM);
	Empty.add(Material.TORCH);
	Empty.add(Material.LADDER);
	Empty.add(Material.RAILS);
	Empty.add(Material.ACTIVATOR_RAIL);
	Empty.add(Material.DETECTOR_RAIL);
	Empty.add(Material.POWERED_RAIL);

	Empty.add(Material.GOLD_PLATE);
	Empty.add(Material.IRON_PLATE);
	Empty.add(Material.STONE_PLATE);
	Empty.add(Material.WOOD_PLATE);

	Empty.add(Material.REDSTONE_TORCH_OFF);
	Empty.add(Material.REDSTONE_TORCH_ON);

	Empty.add(Material.STONE_BUTTON);
	Empty.add(Material.WOOD_BUTTON);

	Empty.add(Material.SNOW);

	try {
	    Empty.add(Material.IRON_TRAPDOOR);

	    Empty.add(Material.TRAP_DOOR);

	    Empty.add(Material.VINE);
	    Empty.add(Material.WATER_LILY);
	    Empty.add(Material.TRIPWIRE);
	    Empty.add(Material.TRIPWIRE_HOOK);

	    Empty.add(Material.CARPET);

	    Empty.add(Material.PAINTING);

	    Empty.add(Material.WALL_SIGN);

	    Empty.add(Material.ITEM_FRAME);

	    Empty.add(Material.REDSTONE_COMPARATOR);
	    Empty.add(Material.REDSTONE_WIRE);

	    Empty.add(Material.LEVER);

	    Empty.add(Material.NETHER_WARTS);
	    Empty.add(Material.PUMPKIN_STEM);
	    Empty.add(Material.MELON_STEM);
	    Empty.add(Material.SUGAR_CANE_BLOCK);
	    Empty.add(Material.SEEDS);
	    Empty.add(Material.POTATO_ITEM);
	    Empty.add(Material.CARROT_ITEM);

	    bad.add(Material.LAVA);
	    bad.add(Material.FIRE);
	    bad.add(Material.STATIONARY_LAVA);
	} catch (Exception | NoSuchFieldError e) {
	}
	try {
	    bad.add(Material.MAGMA);
	} catch (NoSuchFieldError e) {
	}
    }

    public Teleportations(CMI plugin) {
	this.plugin = plugin;
	fill();
    }

    private static boolean isImortal(Player player) {
	return CMI.getInstance().getPlayerManager().getUser(player).isGod() || player.getGameMode() == GameMode.CREATIVE || player.getGameMode().name().equalsIgnoreCase("SPECTATOR");
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform) {
	return teleport(sender, player, loc, inform, true);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, boolean reqPerm) {
	TpCondition res = teleport(player, loc, reqPerm);
	return res == TpCondition.Good;
    }

    public void addBadTeleport(UUID uuid, Location loc) {
    }

    public Location getBadTp(UUID uuid) {
	return null;
    }

    public TpCondition teleport(Player player, Location loc, boolean reqPerm) {
	return null;
    }

    public TpCondition teleport(Player player, Location loc, boolean reqPerm, boolean forceTeleport) {

	return null;

    }

    private void teleport(Player player, Location loc) {
    }

    public boolean isBad(Block block) {
	return bad.contains(block.getType());
    }

    private boolean isEmpty(Block block) {
	return Empty.contains(block.getType());
    }

    private boolean isFreeSpace(Location loc) {
	if (isEmpty(loc.getBlock()) && isEmpty(loc.clone().add(0, 1, 0).getBlock()))
	    return true;
	return false;
    }

    public double getDistanceToDrop(Location loc) {
	Location down = getDownLocation(loc);
	return down.distance(loc);
    }

    public Location getDownLocation(Location oloc) {

	return null;
    }

    public Location getTopLocation(Location loc) {

	return null;
    }

    public boolean needToFly(Player player) {

	return false;
    }

    public Location getSafeLocation(Player player) {
	return null;
    }
}
