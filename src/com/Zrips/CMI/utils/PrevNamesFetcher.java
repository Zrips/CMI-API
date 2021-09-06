package com.Zrips.CMI.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;
import net.Zrips.CMILib.Locale.LC;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class PrevNamesFetcher {

    private CMI plugin;

    private HashMap<UUID, String> names = new HashMap<UUID, String>();

    public PrevNamesFetcher(CMI plugin) {
	this.plugin = plugin;
    }

    public void check(final Player player) {
	
    }

    public List<String> start(Player player) {
	
	return null;
    }

    public HashMap<String, Long> getWithTime(OfflinePlayer player) {
	
	return null;
    }

    public UUID getUUID(String name) {
	
	return null;
    }

    public String getPrevNames(UUID uuid, boolean update) {
	
	return null;
    }
}
