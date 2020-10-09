package com.Zrips.CMI.Modules.CmiItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMIPotionEffect;
import com.Zrips.CMI.Modules.Enchants.CMIEnchantment;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class ItemManager {

    private CMI plugin;

    static HashMap<Material, CMIMaterial> byRealMaterial = new HashMap<Material, CMIMaterial>();
    static HashMap<Integer, CMIMaterial> byId = new HashMap<Integer, CMIMaterial>();
    static HashMap<String, CMIMaterial> byName = new HashMap<String, CMIMaterial>();

    public ItemManager(CMI plugin) {
	this.plugin = plugin;

    }

    public HashMap<Integer, CMIMaterial> idMap() {
	return byId;
    }

    public HashMap<String, CMIMaterial> NameMap() {
	return byName;
    }

    public void load() {

    }

    @Deprecated
    public CMIItemStack getItem(Material mat) {
	return null;
    }

    public CMIItemStack getItem(CMIMaterial mat) {
	return null;
    }

    public CMIItemStack getItem(ItemStack item) {
	return null;
    }

    HashMap<String, ItemStack> headCache = new HashMap<String, ItemStack>();

    public CMIItemStack getItem(String name) {

	return null;
    }

    public List<Recipe> getAllRecipes() {
	return null;
    }

    public List<Recipe> getRecipesFor(ItemStack result) {
	return null;
    }

    public Material getMaterial(String name) {
	return null;
    }

    public enum SlabType {
	TOP,
	BOTTOM,
	DOUBLE,
	NOTSLAB;
    }

}
