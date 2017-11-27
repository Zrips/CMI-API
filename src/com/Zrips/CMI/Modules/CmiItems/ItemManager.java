package com.Zrips.CMI.Modules.CmiItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class ItemManager {

    private CMI plugin;

    HashMap<Integer, CMIItemStack> byId = new HashMap<Integer, CMIItemStack>();
    HashMap<String, CMIItemStack> byBukkitName = new HashMap<String, CMIItemStack>();
    HashMap<String, CMIItemStack> byMojangName = new HashMap<String, CMIItemStack>();
    HashMap<Material, CMIItemStack> byMaterial = new HashMap<Material, CMIItemStack>();

    public ItemManager(CMI plugin) {
	this.plugin = plugin;
    }

    @SuppressWarnings("deprecation")
    public void load() {
    }

    public CMIItemStack getItem(Material mat) {
	return null;
    }

    public CMIItemStack getItem(ItemStack item) {
	return null;
    }

    public CMIItemStack getItem(String name) {

	return null;
    }

    public Material getMaterial(String name) {
	return null;
    }

    public CMIMaterial getRealName(CMIItemStack item) {
	return getRealName(item, false);
    }

    public CMIMaterial getRealName(CMIItemStack item, boolean safe) {
	return null;
    }

    private static CMIMaterial proccessItemName(CMIMaterial one) {
	return null;
    }

    public enum colorNames {
	White(0, "White"),
	Orange(1, "Orange"),
	Magenta(2, "Magenta"),
	Light(3, "Light Blue"),
	Yellow(4, "Yellow"),
	Lime(5, "Lime"),
	Pink(6, "Pink"),
	Gray(7, "Gray"),
	Light_Gray(8, "Light Gray"),
	Cyan(9, "Cyan"),
	Purple(10, "Purple"),
	Blue(11, "Blue"),
	Brown(12, "Brown"),
	Green(13, "Green"),
	Red(14, "Red"),
	Black(15, "Black");

	private int id;
	private String name;

	colorNames(int id, String name) {
	    this.id = id;
	    this.name = name;
	}

	public int getId() {
	    return id;
	}

	public String getName() {
	    return name;
	}

	public static colorNames getById(int id) {
	    for (colorNames one : colorNames.values()) {
		if (one.getId() == id)
		    return one;
	    }
	    return colorNames.White;
	}
    }

    public enum CMIEntityType {
	elder_guardian(4, "Elder Guardian"),
	wither_skeleton(5, "Wither Skeleton"),
	stray(6, "Stray"),
	husk(23, "Husk"),
	zombie_villager(27, "Zombie Villager"),
	skeleton_horse(28, "Skeleton horse"),
	pig(90, "Pig"),
	sheep(91, "Sheep"),
	parrot(105, "Parrot"),
	villager(120, "Villager");

	private int id;
	private String name;

	CMIEntityType(int id, String name) {
	    this.id = id;
	    this.name = name;
	}

	public int getId() {
	    return id;
	}

	public String getName() {
	    return name;
	}

	public static CMIEntityType getById(int id) {
	    for (CMIEntityType one : CMIEntityType.values()) {
		if (one.getId() == id)
		    return one;
	    }
	    return CMIEntityType.pig;
	}

	public static CMIEntityType getByType(EntityType entity) {
	    return getByName(entity.toString());
	}

	public static CMIEntityType getByName(String name) {
	    name = name.toLowerCase().replace("_", "");
	    CMIEntityType type = null;
	    for (CMIEntityType one : CMIEntityType.values()) {
		if (one.name().replace("_", "").equalsIgnoreCase(name) || one.name.replace(" ", "").equalsIgnoreCase(name)) {
		    type = one;
		    break;
		}
	    }
	    if (type == null)
		for (CMIEntityType one : CMIEntityType.values()) {
		    if (one.name.replace("_", "").contains(name)) {
			type = one;
			break;
		    }
		}
	    return type;
	}

	public EntityType getType() {
	    for (EntityType one : EntityType.values()) {
		if (one.toString().equalsIgnoreCase(this.name()))
		    return one;
	    }
	    return null;
	}
    }

    public enum CMIMaterial {
	air_0_0(0, 0, "Unknown");
	private int id;
	private List<Short> data = new ArrayList<Short>();
	private String name;

	CMIMaterial(int id, int data, String name) {
	    this.id = id;
	    this.data.add((short) data);
	    this.name = name;
	}

	CMIMaterial(int id, List<Integer> data, String name) {
	    this.id = id;
	    for (Integer one : data) {
		this.data.add(one.shortValue());
	    }
	    this.name = name;
	}

	public int getId() {
	    return id;
	}

	public Short getData() {
	    return data.get(0);
	}

	public List<Short> getDataList() {
	    return data;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
    }
}
