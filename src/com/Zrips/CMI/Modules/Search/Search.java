package com.Zrips.CMI.Modules.Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Locale.LC;

import com.Zrips.CMI.Modules.Scan.ScanResultLocations;
import com.Zrips.CMI.utils.PlayerVaultManager;

import net.Zrips.CMILib.ActionBar.CMIActionBar;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class Search {

    public HashMap<UUID, SearchInfo> SearchInfo = new HashMap<UUID, SearchInfo>();
    public int showInterval = 1000;
    private CMI plugin;

    public Search(CMI plugin) {
	this.plugin = plugin;
    }

    public enum SearchPlaceType {
	Inventory("inv", "inv%", "cmi inv [player]"),
	InventoryShulker("invS", "invS%", "cmi inv [player]"),
	EnderChest("ender", "end%", "cmi ender [player]"),
	PlayerVaults("PlayerVault", "Pv%", "pv [player] [nr]"),
	Custom("", "Cs%", "");

	private String Place;
	private String pref;
	private String cmd;

	private SearchPlaceType(String Place, String pref, String cmd) {
	    this.Place = Place;
	    this.pref = pref;
	    this.cmd = cmd;
	}

	public String getPlace() {
	    return Place;
	}

	public String getPref() {
	    return pref;
	}

	public String getCmd() {
	    return cmd;
	}
    }

    public HashMap<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {

	return null;
    }

    public HashMap<Integer, ArrayList<ScanResultLocations>> sortByKey(HashMap<Integer, ArrayList<ScanResultLocations>> list2) {

	return null;
    }

    @SuppressWarnings("deprecation")
    private boolean isThisItemOk(SearchInfo SI, ItemStack OneItem, Player player) {

	return false;
    }

    private void checkPlayer(SearchInfo SI, Player one) {

    }

    public void search(final SearchInfo SI) {

    }

    private void perform(final SearchInfo SI) {

    }

    public void showTimer(SearchInfo SI) {

    }
}
