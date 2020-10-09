package com.Zrips.CMI;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.PageInfo;
import com.Zrips.CMI.Containers.PlayerMail;
import com.Zrips.CMI.Containers.PlayerNote;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;
import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown.CMICooldown;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.DataBase.DBDAO;
import com.Zrips.CMI.Modules.DataBase.DBDAO.TablesFieldsType;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;
import com.Zrips.CMI.Modules.DataBase.DBDAO.mysqltypes;
import com.Zrips.CMI.Modules.Economy.CMIEconomyAcount;
import com.Zrips.CMI.Modules.Economy.EconomyManager.WorldGroup;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.Homes.CmiHome;
import com.Zrips.CMI.Modules.Jail.CMIJail;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.Modules.Kits.Kit;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.Modules.Vanish.VanishManager;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;
import com.Zrips.CMI.Modules.Warnings.CMIWarningCategory;
import com.Zrips.CMI.Modules.Warps.CmiWarp;
import com.Zrips.CMI.utils.DateFormat;
import com.google.common.base.Charsets;

public class PlayerManager {

    private int realUserCount = 0;

    private Map<UUID, CMIUser> users = Collections.synchronizedMap(new HashMap<UUID, CMIUser>());
    private Map<String, CMIUser> usersName = Collections.synchronizedMap(new HashMap<String, CMIUser>());
    private Map<Integer, CMIUser> usersIds = Collections.synchronizedMap(new HashMap<Integer, CMIUser>());

    private Map<String, List<CMIUser>> duplicateUserNames = Collections.synchronizedMap(new HashMap<String, List<CMIUser>>());

    private Set<UUID> cuffed = new HashSet<UUID>();
    private Set<UUID> socialSpy = new HashSet<UUID>();
    private Set<UUID> commandSpy = new HashSet<UUID>();
    private Set<UUID> signSpy = new HashSet<UUID>();

    protected Player fakeOperator = null;

    private final UUID emptyUserUUID = UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff");
    private final UUID fakeUserUUID = UUID.fromString("ffffffff-ffff-ffff-ffff-fffffffffff0");
    private static final String fakeUserName = "CMIFakeOperator";

    private CMI plugin;

    public PlayerManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void updateUserName(CMIUser user, String newName) {
    }

    public void clearData() {
    }

    public Map<UUID, CMIUser> getAllUsers() {
	return null;
    }

    public boolean isDuplicatedUserName(String name) {
	return false;
    }

    public Map<String, List<CMIUser>> getDuplicatedUsers() {
	return null;
    }

    public CMIUser getDuplicatedUser(String name) {
	return null;
    }

    public boolean switchPlayerData(UUID source, UUID target) {
	return false;
    }

    public boolean switchPlayerData(CMIUser source, CMIUser target) {
	return true;
    }

    public boolean addDuplicatedUser(CMIUser user) {
	return true;
    }

    public int getTotalUserCount() {
	return realUserCount;
    }

    public CMIUser softRemoveUser(UUID uuid) {
	return softRemoveUser(this.getUser(uuid));
    }

    public CMIUser softRemoveUser(UUID uuid, boolean fromDataBse) {
	return softRemoveUser(this.getUser(uuid), fromDataBse);
    }

    public CMIUser softRemoveUser(CMIUser user) {
	return softRemoveUser(user, true);
    }

    public CMIUser softRemoveUser(CMIUser user, boolean fromDataBse) {
	return user;
    }

    public void removeUser(CMIUser user) {
    }

    private CMIUser getByName(String name) {
	return null;
    }

    public void addUser(CMIUser user) {
    }

    public CMIUser getUser(Integer id) {
	return null;
    }

    public void addUser(CMIUser user, Integer id) {
    }

    public CMIUser getUserByAproxName(String name) {
	return getUser(name, true, false, false, false);
    }

    public CMIUser getUser(String name) {
	return getUser(name, true, false, false, true);
    }

    public CMIUser getUser(String name, boolean includeDuplicate) {
	return getUser(name, includeDuplicate, false, false, true);
    }

    @Deprecated
    public CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline) {
	return getUser(name, includeDuplicate, checkOflline, false, true);
    }

    public CMIUser getUser(String name, boolean includeDuplicate, @Deprecated boolean checkOflline, boolean createFake, boolean exactName) {

	return null;

    }

    public boolean isUserExist(UUID uuid) {
	return users.containsKey(uuid);
    }

    public CMIUser getUser(OfflinePlayer player) {
	return getUser(player, true);
    }

    public CMIUser getUser(OfflinePlayer player, boolean createNew) {

	return null;
    }

    public CMIUser getUser(Player player) {

	return null;
    }

    public CMIUser getUser(UUID uuid) {

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

    public String convertLocToString(CMILocation loc) {
	return null;
    }

    public String convertBlockLocToString(Location loc) {
	return null;
    }

    public String convertLocToStringShort(CMILocation loc) {
	return null;
    }

    public String convertLocToStringShort(Location loc) {
	return null;
    }

    public CMILocation convertStringToLocation(String map, boolean includeSpawnPoints) {
	return null;
    }

    public CMILocation convertStringToLocation(String map) {

	return null;
    }

    public CMILocation getLoc(YamlConfiguration conf, String path) {
	return null;
    }

    public void saveUser(CMIUser user) {
	save(user);
    }

    private static String serialize(HashMap<String, Object> map) {
	return null;
    }

    private static HashMap<String, Object> deserialize(String string) {
	return null;
    }

    private void save(CMIUser user) {
    }

    public static HashMap<UserTablesFields, Long> timer = new HashMap<UserTablesFields, Long>();
    public static int timesProcessed = 0;

    public PreparedStatement savePlayerToDB(CMIUser user, PreparedStatement prest, boolean addId) throws Throwable {
	return null;
    }

    public static final String mapKeySeparator = "%%";
    private static final String mapKeySeparatorForsave = "T9C";
    private static final String sectionSeparator = ":";
    private static final String sectionSeparatorForSave = "T8C";
    public static final String lineSeparator = ";";
    private static final String lineSeparatorForSave = "T7C";
    public static final String multiSeparator = "-X-";

    private static Pattern kitPattern = Pattern.compile("(\\S+)(" + multiSeparator + ")(\\d)");

    private String filterOutForLoad(String message) {
	return null;
    }

    private String filterOutForSave(String message) {
	return null;
    }

    private static PreparedStatement proccessForSaveField(PreparedStatement prest, int place, Object value, UserTablesFields field) throws Throwable {

	return null;
    }

    public void loadUserFromDb(ResultSet res) {
    }

    List<String> duplicates = new ArrayList<String>();

    private static CMILocation invertLoc(Object loc) {
	return null;
    }

    public Object getValueFromDb(ResultSet res, TablesFieldsType fieldType, String collumn) {
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

    private static HashMap<String, String> getStringStringMapFromString(String string) {
	return null;
    }

    private static HashMap<String, Integer> getStringIntMapFromString(String string) {
	return null;
    }

    private static String convertLocationToString(CMILocation loc) {
	return null;
    }

    private static String convertLocationToString(Location loc) {
	return null;
    }

    private static Double fNumber(float amount) {
	return null;
    }

    static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private static Double fNumber(Double amount) {
	return null;
    }

    private static String NumberToString(Double amount) {
	return null;
    }

    private static LinkedHashMap<String, CMILocation> getLocationMapFromString(String string) {
	return null;
    }

    private static CMILocation getLocationFromString(String string) {
	return null;
    }

    public void addCuffed(UUID uuid) {
    }

    public void removeCuffed(Player player) {
    }

    public void removeCuffed(UUID uuid) {
    }

    public boolean isCuffed(Player player) {
	return isCuffed(player.getUniqueId());
    }

    public boolean isCuffed(UUID uuid) {
	return false;
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
	return false;
    }

    public void sendMessageToSpies(CommandSender sender, String senderName, Player receiver, String msg) {	
    }

    public void sendChatRoomMessageToSpies(CommandSender sender, String receiver, String msg) {	
    }

    HashMap<UUID, Integer> delayCSTrigger = new HashMap<UUID, Integer>();
    HashMap<UUID, Integer> delaySignSTrigger = new HashMap<UUID, Integer>();

    public void removeCommandSpyDelayed(UUID uuid) {
    }

    public void addCommandSpyDelayed(final UUID uuid) {
    }

    public void addCommandSpy(UUID uuid) {
	this.commandSpy.add(uuid);
    }

    public void removeCommandSpy(UUID uuid) {
	this.commandSpy.remove(uuid);
    }

    public boolean isCommandSpy(UUID uuid) {
	return this.commandSpy.contains(uuid);
    }

    public void sendMessageToCommandSpies(Player sender, String msg) {
    }

    public void addSignSpyDelayed(final UUID uuid) {
    }

    public void addSignSpy(UUID uuid) {
    }

    public void removeSignSpy(UUID uuid) {
    }

    public boolean isSignSpy(UUID uuid) {
return false;
    }

    public void sendMessageToSignSpies(Player sender, String msg, Location loc) {	
	
    }

    public UUID getEmptyUserUUID() {
	return null;
    }

    public void forceSaveAllUsersIntoDataBase() {
    }

    public Player getFakeOperator() {
	return null;
    }

    public String getFakeUserName() {
	return null;
    }

    public UUID getFakeUserUUID() {
	return null;
    }

    public boolean openMailGui(Player player, int page) {
	return true;
    }
}
