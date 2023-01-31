package com.Zrips.CMI.Modules.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Search.Search.SearchPlaceType;

import net.Zrips.CMILib.Items.CMIItemStack;

public class SearchInfo {

    private List<CMIItemStack> itemIds = new ArrayList<CMIItemStack>();
    private List<OfflinePlayer> players = new ArrayList<OfflinePlayer>();
    private int id = -1;
    private ConcurrentHashMap<SearchPlaceType, ConcurrentHashMap<String, Integer>> places = new ConcurrentHashMap<SearchPlaceType, ConcurrentHashMap<String, Integer>>();
    private CommandSender sender;
    private SearchType SearchType = null;

    String ItemName = null;
    String ItemLore = null;
    private Enchantment enchant = null;

    long time = System.currentTimeMillis();
    int current = 1;

    int amount = 1;
    int totalcChecked = 0;
    private int totalPlayersToCheck = 0;

    int NumberState = -1;
    boolean BooleanState = false;

    boolean purge = false;

    public void addChecked() {
        this.totalcChecked++;
    }

    public int getTotalChecked() {
        return this.totalcChecked;
    }

    public boolean isPurge() {
        return purge;
    }

    public void setPurge() {
        this.purge = true;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setTime() {
        this.time = System.currentTimeMillis();
    }

    public int getCurrent() {
        return this.current;
    }

    public long getTime() {
        return this.time;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addItemInfo(CMIItemStack info) {
        this.itemIds.add(info);
    }

    public List<CMIItemStack> getItemInfo() {
        return itemIds;
    }

    public void setNumberState(int id) {
        this.NumberState = id;
    }

    public void setItemName(String name) {
        this.ItemName = name;
    }

    public void setItemLore(String name) {
        this.ItemLore = name;
    }

    public void setBooleanState(boolean state) {
        this.BooleanState = state;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean getBooleanState() {
        return this.BooleanState;
    }

    public int getNumberState() {
        return this.NumberState;
    }

    public String getItemName() {
        return this.ItemName;
    }

    public String getItemLore() {
        return this.ItemLore;
    }

    public SearchInfo() {
    }

    public void setSearchType(SearchType SearchType) {
        this.SearchType = SearchType;
    }

    public com.Zrips.CMI.Modules.Search.SearchType getSearchType() {
        return this.SearchType;
    }

    public void setid(int i) {
        this.id = i;
    }

    public void clear() {
        this.places.clear();
        this.SearchType = null;
    }

    public int getid() {
        return this.id;
    }

    public Integer found() {
        int i = 0;
        for (Entry<SearchPlaceType, ConcurrentHashMap<String, Integer>> one : this.places.entrySet()) {
            i += this.places.get(one.getKey()).size();
        }
        return i;
    }

    public boolean exist(SearchPlaceType type, String name) {
        ConcurrentHashMap<String, Integer> one = this.places.get(type);
        if (one == null)
            return false;
        return one.containsKey(name);
    }

    public Integer get(SearchPlaceType type, String name) {
        return 0;
    }

    public void remove(SearchPlaceType type, String name) {
        ConcurrentHashMap<String, Integer> one = this.places.get(type);
        if (one == null)
            return;
        one.remove(name);
    }

    public ConcurrentHashMap<String, Integer> get(SearchPlaceType type) {
        if (this.places.containsKey(type))
            return this.places.get(type);
        return new ConcurrentHashMap<String, Integer>();
    }

    public void add(SearchPlaceType type, String name) {
        add(type, name, 1);
    }

    public void add(SearchPlaceType type, String name, int amount) {
        ConcurrentHashMap<String, Integer> one = this.places.get(type);
        if (one == null)
            one = new ConcurrentHashMap<String, Integer>();
        Integer sec = one.get(name);
        if (sec == null)
            sec = 0;
        one.put(name, sec + amount);
        this.places.put(type, one);
    }

    public int getTotalPlayersToCheck() {
        return totalPlayersToCheck;
    }

    public void setTotalPlayersToCheck(int totalPlayersToCheck) {
        this.totalPlayersToCheck = totalPlayersToCheck;
    }

    public List<OfflinePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<OfflinePlayer> players) {
        this.players = players;
        setTotalPlayersToCheck(players.size());
    }

    public Enchantment getEnchant() {
        return enchant;
    }

    public void setEnchant(Enchantment enchant) {
        this.enchant = enchant;
    }

    @Deprecated
    public Player getPlayer() {
        return this.sender instanceof Player ? (Player) this.sender : null;
    }

    @Deprecated
    public void setPlayer(Player Player) {
        this.sender = Player;
    }

    public CommandSender getSender() {
        return sender;
    }

    public void setSender(CommandSender sender) {
        this.sender = sender;
    }
}
