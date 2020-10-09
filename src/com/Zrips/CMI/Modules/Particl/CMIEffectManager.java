package com.Zrips.CMI.Modules.Particl;

import java.util.List;

import org.bukkit.Effect;
import org.bukkit.Material;

import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;

public class CMIEffectManager {

    public enum CMIParticleType {
	SOUND, VISUAL, PARTICLE, NONE;
    }

    public enum CMIParticleDataType {
	Void, DustOptions, ItemStack, BlockData, MaterialData;
    }

    public enum CMIParticle {
	CLICK2("null", 0, CMIParticleType.SOUND, null),
	CLICK1("null", 1, CMIParticleType.SOUND, null),
	BOW_FIRE("null", 2, CMIParticleType.SOUND, null),
	DOOR_TOGGLE("null", 3, CMIParticleType.SOUND, null),
	IRON_DOOR_TOGGLE("null", 4, CMIParticleType.SOUND, null),
	TRAPDOOR_TOGGLE("null", 5, CMIParticleType.SOUND, null),
	IRON_TRAPDOOR_TOGGLE("null", 6, CMIParticleType.SOUND, null),
	FENCE_GATE_TOGGLE("null", 7, CMIParticleType.SOUND, null),
	DOOR_CLOSE("null", 8, CMIParticleType.SOUND, null),
	IRON_DOOR_CLOSE("null", 9, CMIParticleType.SOUND, null),
	TRAPDOOR_CLOSE("null", 10, CMIParticleType.SOUND, null),
	IRON_TRAPDOOR_CLOSE("null", 11, CMIParticleType.SOUND, null),
	FENCE_GATE_CLOSE("null", 12, CMIParticleType.SOUND, null),
	EXTINGUISH("null", 13, CMIParticleType.SOUND, null),
	RECORD_PLAY("null", 14, CMIParticleType.SOUND, null),
	GHAST_SHRIEK("null", 15, CMIParticleType.SOUND, null),
	GHAST_SHOOT("null", 16, CMIParticleType.SOUND, null),
	BLAZE_SHOOT("null", 17, CMIParticleType.SOUND, null),
	ZOMBIE_CHEW_WOODEN_DOOR("null", 18, CMIParticleType.SOUND, null),
	ZOMBIE_CHEW_IRON_DOOR("null", 19, CMIParticleType.SOUND, null),
	ZOMBIE_DESTROY_DOOR("null", 20, CMIParticleType.SOUND, null),
	SMOKE("null", 21, CMIParticleType.VISUAL, null),
	STEP_SOUND("null", 22, CMIParticleType.SOUND, null),
	POTION_BREAK("null", 23, CMIParticleType.VISUAL, null),
	ENDER_SIGNAL("null", 24, CMIParticleType.VISUAL, null),
	MOBSPAWNER_FLAMES("null", 25, CMIParticleType.VISUAL, null),
	BREWING_STAND_BREW("null", 26, CMIParticleType.SOUND, null),
	CHORUS_FLOWER_GROW("null", 27, CMIParticleType.SOUND, null),
	CHORUS_FLOWER_DEATH("null", 28, CMIParticleType.SOUND, null),
	PORTAL_TRAVEL("null", 29, CMIParticleType.SOUND, null),
	ENDEREYE_LAUNCH("null", 30, CMIParticleType.SOUND, null),
	FIREWORK_SHOOT("null", 31, CMIParticleType.SOUND, null),
	VILLAGER_PLANT_GROW("null", 32, CMIParticleType.VISUAL, null),
	DRAGON_BREATH("null", 33, CMIParticleType.VISUAL, null),
	ANVIL_BREAK("null", 34, CMIParticleType.SOUND, null),
	ANVIL_USE("null", 35, CMIParticleType.SOUND, null),
	ANVIL_LAND("null", 36, CMIParticleType.SOUND, null),
	ENDERDRAGON_SHOOT("null", 37, CMIParticleType.SOUND, null),
	WITHER_BREAK_BLOCK("null", 38, CMIParticleType.SOUND, null),
	WITHER_SHOOT("null", 39, CMIParticleType.SOUND, null),
	ZOMBIE_INFECT("null", 40, CMIParticleType.SOUND, null),
	ZOMBIE_CONVERTED_VILLAGER("null", 41, CMIParticleType.SOUND, null),
	BAT_TAKEOFF("null", 42, CMIParticleType.SOUND, null),
	END_GATEWAY_SPAWN("null", 43, CMIParticleType.VISUAL, null),
	ENDERDRAGON_GROWL("null", 44, CMIParticleType.SOUND, null),
	FIREWORKS_SPARK("FireworksSpark", 45, CMIParticleType.PARTICLE, CMIMaterial.FIRE_CHARGE.getMaterial()),
	CRIT("Crit", 46, CMIParticleType.PARTICLE, Material.IRON_SWORD),
	MAGIC_CRIT("CritMagic", 47, CMIParticleType.PARTICLE, Material.POTION),
	POTION_SWIRL("MobSpell", "SPELL_MOB", 48, CMIParticleType.PARTICLE, Material.BLAZE_ROD),
	POTION_SWIRL_TRANSPARENT("MobSpellAmbient", "SPELL_MOB_AMBIENT", 49, CMIParticleType.PARTICLE, Material.BLAZE_POWDER),
	SPELL("Spell", 50, CMIParticleType.PARTICLE, Material.MILK_BUCKET),
	INSTANT_SPELL("InstantSpell", "SPELL_INSTANT", 51, CMIParticleType.PARTICLE, Material.GLASS_BOTTLE),
	WITCH_MAGIC("WitchMagic", "SPELL_WITCH", 52, CMIParticleType.PARTICLE, Material.SPIDER_EYE),
	NOTE("Note", 53, CMIParticleType.PARTICLE, Material.NOTE_BLOCK),
	PORTAL("Portal", 54, CMIParticleType.PARTICLE, Material.OBSIDIAN),
	FLYING_GLYPH("EnchantmentTable", 55, CMIParticleType.PARTICLE, CMIMaterial.ENCHANTING_TABLE.getMaterial()),
	FLAME("Flame", 56, CMIParticleType.PARTICLE, CMIMaterial.FIRE_CHARGE.getMaterial()),
	LAVA_POP("Lava", 57, CMIParticleType.PARTICLE, Material.FLINT_AND_STEEL),
	FOOTSTEP("FootStep", 58, CMIParticleType.PARTICLE, Material.IRON_BOOTS),
	SPLASH("Splash", "water splash", 59, CMIParticleType.PARTICLE, Material.STICK),
	PARTICLE_SMOKE("Smoke", "SMOKE_NORMAL", 60, CMIParticleType.PARTICLE, Material.ANVIL),
	EXPLOSION_HUGE("HugeExplosion", 61, CMIParticleType.PARTICLE, Material.FURNACE),
	EXPLOSION_LARGE("LargeExplode", 62, CMIParticleType.PARTICLE, Material.FURNACE),
	EXPLOSION("Explode", "EXPLOSION_NORMAL", 63, CMIParticleType.PARTICLE, Material.TNT),
	VOID_FOG("DepthSuspend", "SUSPENDED_DEPTH", 64, CMIParticleType.PARTICLE, CMIMaterial.SALMON.getMaterial()),
	SMALL_SMOKE("TownAura", 65, CMIParticleType.PARTICLE, CMIMaterial.MYCELIUM.getMaterial()),
	CLOUD("Cloud", 66, CMIParticleType.PARTICLE, CMIMaterial.COBWEB.getMaterial()),
	COLOURED_DUST("Reddust", "redstone", 67, CMIParticleType.PARTICLE, Material.REDSTONE, CMIParticleDataType.DustOptions),
	SNOWBALL_BREAK("SnowBallPoof", "SNOWBALL", 68, CMIParticleType.PARTICLE, CMIMaterial.SNOWBALL.getMaterial()),
	WATERDRIP("DripWater", "WATER_DROP", 69, CMIParticleType.PARTICLE, Material.WATER_BUCKET),
	LAVADRIP("DripLava", 70, CMIParticleType.PARTICLE, Material.LAVA_BUCKET),
	SNOW_SHOVEL("SnowShovel", 71, CMIParticleType.PARTICLE, CMIMaterial.DIAMOND_SHOVEL.getMaterial()),
	SLIME("Slime", 72, CMIParticleType.PARTICLE, Material.SLIME_BALL),
	HEART("Heart", 73, CMIParticleType.PARTICLE, CMIMaterial.ROSE_RED.getMaterial()),
	VILLAGER_THUNDERCLOUD("AngryVillager", "VILLAGER_ANGRY", 74, CMIParticleType.PARTICLE, Material.EMERALD),
	HAPPY_VILLAGER("VillagerHappy", 75, CMIParticleType.PARTICLE, Material.BOOK),
	LARGE_SMOKE("LargeSmoke", "SMOKE_LARGE", 76, CMIParticleType.PARTICLE, Material.FURNACE),
	ITEM_BREAK("Iconcrack", 77, CMIParticleType.NONE, Material.DIAMOND_BOOTS),

	// 1.13
	WATER_BUBBLE("WaterBubble", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	WATER_WAKE("WaterWake", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SUSPENDED("Suspended", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	BARRIER("Barrier", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	MOB_APPEARANCE("MobAppearance", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	END_ROD("EndRod", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	DAMAGE_INDICATOR("DamageIndicator", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SWEEP_ATTACK("SweepAttack", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	TOTEM("Totem", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SPIT("Spit", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SQUID_INK("SquidInk", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	BUBBLE_POP("BubblePop", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	CURRENT_DOWN("CurrentDown", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	BUBBLE_COLUMN_UP("BubbleColumnUp", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	NAUTILUS("Nautilus", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	DOLPHIN("Dolphin", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),

//	Requires extra data when displaying
//	ITEM_CRACK("ItemCrack", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
//	BLOCK_DUST("block_dust", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
//	FALLING_DUST("falling_dust", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),

	//1.16
	WATER_SPLASH("WaterSplash", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	CAMPFIRE_SIGNAL_SMOKE("CampfireSignalSmoke", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	CAMPFIRE_COSY_SMOKE("CampfireCosySmoke", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SNEEZE("sneeze", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	COMPOSTER("composter", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FLASH("flash", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FALLING_LAVA("falling_lava", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	LANDING_LAVA("landing_lava", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FALLING_WATER("falling_water", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	DRIPPING_HONEY("dripping_honey", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FALLING_HONEY("falling_honey", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	LANDING_HONEY("landing_honey", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FALLING_NECTAR("falling_nectar", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SOUL_FIRE_FLAME("soul_fire_flame", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	ASH("ash", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	CRIMSON_SPORE("crimson_spore", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	WARPED_SPORE("warped_spore", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	SOUL("soul", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	DRIPPING_OBSIDIAN_TEAR("dripping_obsidian_tear", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	FALLING_OBSIDIAN_TEAR("falling_obsidian_tear", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	LANDING_OBSIDIAN_TEAR("landing_obsidian_tear", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	REVERSE_PORTAL("reverse_portal", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void),
	WHITE_ASH("white_ash", -1, CMIParticleType.PARTICLE, Material.STONE, CMIParticleDataType.Void);

	private String name;
	private String secondaryName = "";
	private int id;
	private CMIParticleType type;
	private Material icon;
	private Object particle;
	private Effect effect;
	private Object EnumParticle;
	private int[] extra;
	private CMIParticleDataType dataType = CMIParticleDataType.Void;

	CMIParticle(String name, int id, CMIParticleType type) {
	    this(name, null, id, type, null);
	}

	CMIParticle(String name, int id, CMIParticleType type, Material icon) {
	    this(name, null, id, type, icon);
	}

	CMIParticle(String name, String secondaryName, int id, CMIParticleType type, Material icon) {
	    this(name, secondaryName, id, type, icon, CMIParticleDataType.Void);
	}

	CMIParticle(String name, int id, CMIParticleType type, Material icon, CMIParticleDataType dataType) {
	    this(name, null, id, type, icon, dataType);
	}

	CMIParticle(String name, String secondaryName, int id, CMIParticleType type, Material icon, CMIParticleDataType dataType) {
	}

	public String getName() {
	    return name;
	}

	public int getId() {
	    return id;
	}

	public CMIParticleType getType() {
	    return type;
	}

	public boolean isParticle() {
	    return type == CMIParticleType.PARTICLE;
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

	public Material getSafeIcon() {
	    return null;
	}

	public static CMIParticle getCMIParticle(String name) {
	    return null;
	}

	public Effect getEffect() {
	    return null;
	}

	public Material getIcon() {
	    return icon == null ? Material.STONE : icon;
	}

	public static List<CMIParticle> getParticleList() {
	    return null;
	}

	public CMIParticle getNextPartcileEffect() {
	    return null;
	}

	public CMIParticle getPrevParticleEffect() {
	    return null;
	}

	public String getSecondaryName() {
	    return secondaryName == null ? "" : secondaryName;
	}

	public void setSecondaryName(String secondaryName) {
	    this.secondaryName = secondaryName;
	}

	public org.bukkit.Particle getParticle() {
	    return null;
	}

	public Object getEnumParticle() {
	    return EnumParticle;
	}

	public void setEnumParticle(Object enumParticle) {
	    EnumParticle = enumParticle;
	}

	public int[] getExtra() {
	    return extra;
	}

	public void setExtra(int[] extra) {
	    this.extra = extra;
	}

    }

}
