package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Tameable;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.VersionChecker.Version;

public enum CMIEntitySubType {

    TAMED,
    UNTAMED,
    BABY,
    ADULT,
    NOAI,
    AI,
    ANGRY,
    PASIVE,
    RED_CAT,
    SIAMESE_CAT,
    WILD_OCELOT,
    BLACK_CAT,

    WHITE,
    ORANGE,
    MAGENTA,
    LIGHT_BLUE,
    YELLOW,
    LIME,
    PINK,
    GRAY,
    LIGHT_GRAY,
    CYAN,
    PURPLE,
    BLUE,
    BROWN,
    GREEN,
    RED,
    BLACK,
    RAINBOW,

    CHESTNUT,
    CREAMY,
    DARK_BROWN,

    //Slimes
    SIZE1,
    SIZE2,
    SIZE3,
    SIZE4,
    SIZE5,
    SIZE6,
    SIZE7,
    SIZE8,
    SIZE9,
    SIZE10,

    //Creeper
    POWERED,
    UNPOWERED,

    // Villagers
    NORMAL,
    FARMER,
    LIBRARIAN,
    PRIEST,
    BLACKSMITH,
    BUTCHER,
    NITWIT,
    HUSK;

    public static CMIEntitySubType getByName(String name) {
	for (CMIEntitySubType one : CMIEntitySubType.values()) {
	    if (one.toString().equalsIgnoreCase(name))
		return one;
	}

	return null;
    }

    public static List<CMIEntitySubType> getSubTypes(Entity ent) {
	
	    return null;
    }

}
