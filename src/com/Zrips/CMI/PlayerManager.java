package com.Zrips.CMI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.PlayerMail;
import com.Zrips.CMI.Containers.PlayerNote;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.SpawnerCharge.PlayerCharge;

public class PlayerManager {

    private Map<UUID, CMIUser> users = Collections.synchronizedMap(new HashMap<UUID, CMIUser>());
    private Map<String, CMIUser> usersName = Collections.synchronizedMap(new HashMap<String, CMIUser>());
    private Map<String, List<CMIUser>> duplicateUserNames = Collections.synchronizedMap(new HashMap<String, List<CMIUser>>());
    private Set<String> cuffed = new HashSet<String>();
    private Set<UUID> socialSpy = new HashSet<UUID>();
    private Set<UUID> commandSpy = new HashSet<UUID>();

    private final UUID emptyUserUUID = UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff");

    private CMI plugin;

    public PlayerManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void clearData() {
	users.clear();
	usersName.clear();
	duplicateUserNames.clear();
	cuffed.clear();
    }

    public Map<UUID, CMIUser> getAllUsers() {
	return users;
    }

    public boolean isDuplicatedUserName(String name) {
	if (!duplicateUserNames.containsKey(name.toLowerCase()))
	    return false;
	return true;
    }

    public Map<String, List<CMIUser>> getDuplicatedUsers() {
	return duplicateUserNames;
    }

    public CMIUser getDuplicatedUser(String name) {
	return null;
    }

    public boolean addDuplicatedUser(CMIUser user) {

	return true;
    }

    public int getTotalUserCount() {
	return 0;
    }

    public void softRemoveUser(UUID uuid) {
    }

    public void softRemoveUser(CMIUser user) {
    }

    public void removeUser(CMIUser user) {
    }

    private boolean exist(UUID uuid) {
	return users.containsKey(uuid);
    }

    private CMIUser getByName(String name) {
	if (name == null)
	    return null;
	return usersName.get(name.toLowerCase());
    }

    public void addUser(CMIUser user) {
    }

    public CMIUser getUser(String name) {
	return null;
    }

    public CMIUser getUser(String name, boolean includeDuplicate) {
	return null;

    }

    public boolean isUserExist(UUID uuid) {
	return users.containsKey(uuid);
    }

    public CMIUser getUser(OfflinePlayer player) {
	return null;
    }

    public CMIUser getUser(Player player) {
	return null;
    }

    public CMIUser getUser(UUID uuid) {
	return null;
    }

    public CMIUser loadPlayer(UUID uuid) {
	return null;
    }

    public CMIUser loadPlayer(UUID uuid, File file) {
	return null;
    }

    public void loadData() {
    }

    public boolean checkForExistingSimilarUser(CMIUser user, boolean inform) {
	return true;
    }

    public Map<String, Object> convertLoc(Location loc) {
	return null;
    }

    public String convertLocToString(Location loc) {
	return null;
    }

    public Location convertStringToLocation(String map) {
	return null;
    }

    public Location getLoc(YamlConfiguration conf, String path) {
	return null;
    }

    public void saveUser(CMIUser user) {
    }

    public String serialize(CMIUser user) {
	return null;
    }

    private static String serialize(HashMap<String, Object> map) {
	return null;
    }

    private static HashMap<String, Object> deserialize(String string) {
	return null;
    }

    private void save(CMIUser user) {
    }

    public PreparedStatement savePlayerToDB(CMIUser user, PreparedStatement prest, boolean includeUUID, boolean addId) {
	return null;
    }

    private static final String mapKeySeparator = "%%";
    private static final String sectionSeparator = ":";
    public static final String lineSeparator = ";";

    private static PreparedStatement proccessForSaveField(PreparedStatement prest, int place, Object value, UserTablesFields field) {
	return null;
    }

    public void loadUserFromDb(ResultSet res) {
    }

    private static Location invertLoc(Object loc) {
	return null;
    }

    private static Object getValueFromDb(ResultSet res, UserTablesFields field) {
	return null;
    }

    private static List<String> getStringListFromString(String string) {
	return null;
    }

    private static HashMap<String, Long> getStringLongMapFromString(String string) {
	return null;
    }

    private static HashMap<String, Double> getStringDoubleMapFromString(String string) {
	return null;
    }

    private static HashMap<String, Integer> getStringIntMapFromString(String string) {
	return null;
    }

    private static String convertLocationToString(Location loc) {
	return null;
    }

    private static Double fNumber(float amount) {
	return null;
    }

    private static Double fNumber(Double amount) {
	return null;
    }

    private static HashMap<String, Location> getLocationMapFromString(String string) {
	return null;
    }

    private static Location getLocationFromString(String string) {
	return null;
    }

    public void addCuffed(String name) {
    }

    public void removeCuffed(Player player) {
    }

    public void removeCuffed(String name) {
    }

    public boolean isCuffed(Player player) {
	return isCuffed(player.getName());
    }

    public boolean isCuffed(String name) {
	if (name == null)
	    return false;
	return this.cuffed.contains(name.toLowerCase());
    }

    HashMap<UUID, Integer> delaySSTrigger = new HashMap<UUID, Integer>();

    public void removeSocialSpyDelayed(UUID uuid) {
    }

    public void addSocialSpyDelayed(final UUID uuid) {
    }

    public void addSocialSpy(UUID uuid) {
    }

    public void removeSocialSpy(UUID uuid) {
    }

    public boolean isSocialSpy(UUID uuid) {
	return this.socialSpy.contains(uuid);
    }

    public void sendMessageToSpies(CommandSender sender, Player receiver, String msg) {
    }

    HashMap<UUID, Integer> delayCSTrigger = new HashMap<UUID, Integer>();

    public void removeCommandSpyDelayed(UUID uuid) {
    }

    public void addCommandSpyDelayed(final UUID uuid) {
    }

    public void addCommandSpy(UUID uuid) {
    }

    public void removeCommandSpy(UUID uuid) {
    }

    public boolean isCommandSpy(UUID uuid) {
	return this.commandSpy.contains(uuid);
    }

    public void sendMessageToCommandSpies(Player sender, String msg) {
    }

    public UUID getEmptyUserUUID() {
	return null;
    }
}
