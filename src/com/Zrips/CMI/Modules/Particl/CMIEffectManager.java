package com.Zrips.CMI.Modules.Particl;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Effect.Type;

public class CMIEffectManager {

    public enum CMIParticleEffectType {
	SOUND, VISUAL, PARTICLE, NONE;
    }

    public enum CMIParticleEffect {
	CLICK2("null", 0, CMIParticleEffectType.SOUND, null),
	CLICK1("null", 1, CMIParticleEffectType.SOUND, null),
	BOW_FIRE("null", 2, CMIParticleEffectType.SOUND, null),
	DOOR_TOGGLE("null", 3, CMIParticleEffectType.SOUND, null),
	IRON_DOOR_TOGGLE("null", 4, CMIParticleEffectType.SOUND, null),
	TRAPDOOR_TOGGLE("null", 5, CMIParticleEffectType.SOUND, null),
	IRON_TRAPDOOR_TOGGLE("null", 6, CMIParticleEffectType.SOUND, null),
	FENCE_GATE_TOGGLE("null", 7, CMIParticleEffectType.SOUND, null),
	DOOR_CLOSE("null", 8, CMIParticleEffectType.SOUND, null),
	IRON_DOOR_CLOSE("null", 9, CMIParticleEffectType.SOUND, null),
	TRAPDOOR_CLOSE("null", 10, CMIParticleEffectType.SOUND, null),
	IRON_TRAPDOOR_CLOSE("null", 11, CMIParticleEffectType.SOUND, null),
	FENCE_GATE_CLOSE("null", 12, CMIParticleEffectType.SOUND, null),
	EXTINGUISH("null", 13, CMIParticleEffectType.SOUND, null),
	RECORD_PLAY("null", 14, CMIParticleEffectType.SOUND, null),
	GHAST_SHRIEK("null", 15, CMIParticleEffectType.SOUND, null),
	GHAST_SHOOT("null", 16, CMIParticleEffectType.SOUND, null),
	BLAZE_SHOOT("null", 17, CMIParticleEffectType.SOUND, null),
	ZOMBIE_CHEW_WOODEN_DOOR("null", 18, CMIParticleEffectType.SOUND, null),
	ZOMBIE_CHEW_IRON_DOOR("null", 19, CMIParticleEffectType.SOUND, null),
	ZOMBIE_DESTROY_DOOR("null", 20, CMIParticleEffectType.SOUND, null),
	SMOKE("null", 21, CMIParticleEffectType.VISUAL, null),
	STEP_SOUND("null", 22, CMIParticleEffectType.SOUND, null),
	POTION_BREAK("null", 23, CMIParticleEffectType.VISUAL, null),
	ENDER_SIGNAL("null", 24, CMIParticleEffectType.VISUAL, null),
	MOBSPAWNER_FLAMES("null", 25, CMIParticleEffectType.VISUAL, null),
	BREWING_STAND_BREW("null", 26, CMIParticleEffectType.SOUND, null),
	CHORUS_FLOWER_GROW("null", 27, CMIParticleEffectType.SOUND, null),
	CHORUS_FLOWER_DEATH("null", 28, CMIParticleEffectType.SOUND, null),
	PORTAL_TRAVEL("null", 29, CMIParticleEffectType.SOUND, null),
	ENDEREYE_LAUNCH("null", 30, CMIParticleEffectType.SOUND, null),
	FIREWORK_SHOOT("null", 31, CMIParticleEffectType.SOUND, null),
	VILLAGER_PLANT_GROW("null", 32, CMIParticleEffectType.VISUAL, null),
	DRAGON_BREATH("null", 33, CMIParticleEffectType.VISUAL, null),
	ANVIL_BREAK("null", 34, CMIParticleEffectType.SOUND, null),
	ANVIL_USE("null", 35, CMIParticleEffectType.SOUND, null),
	ANVIL_LAND("null", 36, CMIParticleEffectType.SOUND, null),
	ENDERDRAGON_SHOOT("null", 37, CMIParticleEffectType.SOUND, null),
	WITHER_BREAK_BLOCK("null", 38, CMIParticleEffectType.SOUND, null),
	WITHER_SHOOT("null", 39, CMIParticleEffectType.SOUND, null),
	ZOMBIE_INFECT("null", 40, CMIParticleEffectType.SOUND, null),
	ZOMBIE_CONVERTED_VILLAGER("null", 41, CMIParticleEffectType.SOUND, null),
	BAT_TAKEOFF("null", 42, CMIParticleEffectType.SOUND, null),
	END_GATEWAY_SPAWN("null", 43, CMIParticleEffectType.VISUAL, null),
	ENDERDRAGON_GROWL("null", 44, CMIParticleEffectType.SOUND, null),
	FIREWORKS_SPARK("fireworksSpark", 45, CMIParticleEffectType.PARTICLE, Material.FIREWORK_CHARGE),
	CRIT("crit", 46, CMIParticleEffectType.PARTICLE, Material.IRON_SWORD),
	MAGIC_CRIT("magicCrit", 47, CMIParticleEffectType.PARTICLE, Material.POTION),
	POTION_SWIRL("mobSpell", 48, CMIParticleEffectType.PARTICLE, Material.BLAZE_ROD),
	POTION_SWIRL_TRANSPARENT("mobSpellAmbient", 49, CMIParticleEffectType.PARTICLE, Material.BLAZE_POWDER),
	SPELL("spell", 50, CMIParticleEffectType.PARTICLE, Material.MILK_BUCKET),
	INSTANT_SPELL("instantSpell", 51, CMIParticleEffectType.PARTICLE, Material.GLASS_BOTTLE),
	WITCH_MAGIC("witchMagic", 52, CMIParticleEffectType.PARTICLE, Material.SPIDER_EYE),
	NOTE("note", 53, CMIParticleEffectType.PARTICLE, Material.NOTE_BLOCK),
	PORTAL("portal", 54, CMIParticleEffectType.PARTICLE, Material.OBSIDIAN),
	FLYING_GLYPH("enchantmenttable", 55, CMIParticleEffectType.PARTICLE, Material.ENCHANTMENT_TABLE),
	FLAME("flame", 56, CMIParticleEffectType.PARTICLE, Material.FIREBALL),
	LAVA_POP("lava", 57, CMIParticleEffectType.PARTICLE, Material.FLINT_AND_STEEL),
	FOOTSTEP("footstep", 58, CMIParticleEffectType.PARTICLE, Material.IRON_BOOTS),
	SPLASH("splash", 59, CMIParticleEffectType.PARTICLE, Material.STICK),
	PARTICLE_SMOKE("smoke", 60, CMIParticleEffectType.PARTICLE, Material.ANVIL),
	EXPLOSION_HUGE("hugeexplosion", 61, CMIParticleEffectType.PARTICLE, Material.FURNACE),
	EXPLOSION_LARGE("largeexplode", 62, CMIParticleEffectType.PARTICLE, Material.FURNACE),
	EXPLOSION("explode", 63, CMIParticleEffectType.PARTICLE, Material.TNT),
	VOID_FOG("depthsuspend", 64, CMIParticleEffectType.PARTICLE, Material.RAW_FISH),
	SMALL_SMOKE("townaura", 65, CMIParticleEffectType.PARTICLE, Material.MYCEL),
	CLOUD("cloud", 66, CMIParticleEffectType.PARTICLE, Material.WEB),
	COLOURED_DUST("reddust", 67, CMIParticleEffectType.PARTICLE, Material.REDSTONE),
	SNOWBALL_BREAK("snowballpoof", 68, CMIParticleEffectType.PARTICLE, Material.SNOW_BALL),
	WATERDRIP("dripWater", 69, CMIParticleEffectType.PARTICLE, Material.WATER_BUCKET),
	LAVADRIP("dripLava", 70, CMIParticleEffectType.PARTICLE, Material.LAVA_BUCKET),
	SNOW_SHOVEL("snowshovel", 71, CMIParticleEffectType.PARTICLE, Material.DIAMOND_SPADE),
	SLIME("slime", 72, CMIParticleEffectType.PARTICLE, Material.SLIME_BALL),
	HEART("heart", 73, CMIParticleEffectType.PARTICLE, Material.RED_ROSE),
	VILLAGER_THUNDERCLOUD("angryVillager", 74, CMIParticleEffectType.PARTICLE, Material.EMERALD),
	HAPPY_VILLAGER("happyVillager", 75, CMIParticleEffectType.PARTICLE, Material.BOOK),
	LARGE_SMOKE("largesmoke", 76, CMIParticleEffectType.PARTICLE, Material.FURNACE),
	ITEM_BREAK("iconcrack", 77, CMIParticleEffectType.NONE, Material.DIAMOND_BOOTS),
	TILE_BREAK("blockcrack", 78, CMIParticleEffectType.PARTICLE, Material.MELON_BLOCK),
	TILE_DUST("blockdust", 79, CMIParticleEffectType.PARTICLE, Material.MELON_BLOCK);

	private String name;
	private int id;
	private CMIParticleEffectType type;
	private Material icon;

	CMIParticleEffect(String name, int id, CMIParticleEffectType type, Material icon) {
	    this.name = name;
	    this.id = id;
	    this.type = type;
	    this.icon = icon;
	}

	public String getName() {
	    return name;
	}

	public int getId() {
	    return id;
	}

	public CMIParticleEffectType getType() {
	    return type;
	}

	public boolean isParticle() {
	    return type == CMIParticleEffectType.PARTICLE;
	}

	public boolean isColored() {
	    return this.equals(COLOURED_DUST) || this.equals(NOTE);
	}

	public static boolean isParticle(Effect effect) {
	    return false;
	}

	public static Material getSafeIcon(Effect effect) {
	    return null;
	}

	public static CMIParticleEffect getCMIParticle(String name) {
	    return null;
	}

	public static Effect getEffect(String name) {
	    return null;
	}

	public Effect getEffect() {
	    return null;
	}

	public Material getIcon() {
	    return icon;
	}

	private static List<CMIParticleEffect> getParticleList() {
	    return null;
	}

	public CMIParticleEffect getNextPartcileEffect() {
	    return null;
	}

	public CMIParticleEffect getPrevParticleEffect() {
	    return null;
	}
    }
}
