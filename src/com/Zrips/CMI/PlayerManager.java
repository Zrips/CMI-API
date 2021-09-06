package com.Zrips.CMI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBDAO.TablesFieldsType;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;

import net.Zrips.CMILib.Container.CMILocation;

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

    private Set<UUID> alerts = new HashSet<UUID>();

    protected Player fakeOperator = null;

    private final UUID emptyUserUUID = UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff");
    private final UUID fakeUserUUID = UUID.fromString("ffffffff-ffff-ffff-ffff-fffffffffff0");
    private static final String fakeUserName = "CMI-Fake-Operator";

    private CMI plugin;

    public PlayerManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void updateUserName(CMIUser user, String newName) {
	
    }

    public void clearData() {
    }

    public Map<UUID, CMIUser> getAllUsers() {
	return users;
    }

    public boolean isDuplicatedUserName(String name) {
	return duplicateUserNames.containsKey(name.toLowerCase());
    }

    public Map<String, List<CMIUser>> getDuplicatedUsers() {
	return duplicateUserNames;
    }

    public CMIUser getDuplicatedUser(String name) {

	CMIUser newest = null;

	return newest;
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
	    return null;
    }

    public void removeUser(CMIUser user) {
	
    }


    private CMIUser getByName(String name) {
	if (name == null)
	    return null;
	return usersName.get(name.toLowerCase());
    }

    public void addUser(CMIUser user) {
	    }

    public CMIUser getUser(Integer id) {
	return usersIds.get(id);
    }

    public void addUser(CMIUser user, Integer id) {
	if (id > 0)
	    usersIds.put(id, user);
    }

    public CMIUser getUserByAproxName(String name) {
	return getUser(name, true, false, false, false, true);
    }

    public CMIUser getUser(String name) {
	return getUser(name, true, false, false, true, true);
    }

    public CMIUser getUser(String name, boolean includeDuplicate) {
	return getUser(name, includeDuplicate, false, false, true, true);
    }

    @Deprecated
    public CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline) {
	return getUser(name, includeDuplicate, checkOflline, false, true, true);
    }

    public CMIUser getUser(String name, boolean includeDuplicate, @Deprecated boolean checkOflline, boolean createFake, boolean exactName) {
	return getUser(name, includeDuplicate, checkOflline, createFake, exactName, true);
    }

    public CMIUser getUser(String name, boolean includeDuplicate, @Deprecated boolean checkOflline, boolean createFake, boolean exactName, boolean checkNickName) {
	

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
	Map<String, Object> map = new HashMap<String, Object>();
	return map;
    }

    public String convertLocToString(Location loc) {
	String map = "";
	return map.replace(",", ".");
    }

    public String convertLocToString(CMILocation loc) {
	String map = "";
	return map.replace(",", ".");
    }

    public String convertBlockLocToString(Location loc) {
	String map = "";
	
	return map.replace(",", ".");
    }

    public String convertLocToStringShort(CMILocation loc) {
	String map = "";
	
	return map.replace(",", ".");
    }

    public String convertLocToStringShort(Location loc) {
	String map = "";
	
	return map.replace(",", ".");
    }

    public CMILocation convertStringToLocation(String map, boolean includeSpawnPoints) {
	CMILocation loc = convertStringToLocation(map);

	
	return loc;
    }

    public CMILocation convertStringToLocation(String map) {
	CMILocation loc = null;
	
	return loc;
    }

    public CMILocation getLoc(YamlConfiguration conf, String path) {
	
	return null;
    }

    public void saveUser(CMIUser user) {
	save(user);
    }


    private void save(CMIUser user) {
	
    }

    public static HashMap<UserTablesFields, Long> timer = new HashMap<UserTablesFields, Long>();
    public static int timesProcessed = 0;

    public PreparedStatement savePlayerToDB(CMIUser user, PreparedStatement prest, boolean addId) throws Throwable {
	

	return prest;
    }

    public static final String mapKeySeparator = "%%";
    private static final String mapKeySeparatorForsave = "T9C";
    private static final String sectionSeparator = ":";
    private static final String sectionSeparatorForSave = "T8C";
    public static final String lineSeparator = ";";
    private static final String lineSeparatorForSave = "T7C";
    public static final String multiSeparator = "-X-";

    private static Pattern kitPattern = Pattern.compile("(\\S+)(" + multiSeparator + ")(\\d)");

    private static String filterOutForLoad(String message) {
	return message.replace(mapKeySeparatorForsave, mapKeySeparator).replace(sectionSeparatorForSave, sectionSeparator).replace(lineSeparatorForSave, lineSeparator);
    }

    private static String filterOutForSave(String message) {
	return message.replace(mapKeySeparator, mapKeySeparatorForsave).replace(sectionSeparator, sectionSeparatorForSave).replace(lineSeparator, lineSeparatorForSave);
    }

    private static PreparedStatement proccessForSaveField(PreparedStatement prest, int place, Object value, UserTablesFields field) throws Throwable {
	
	return prest;
    }

    public void loadUserFromDb(ResultSet res) {
	
    }

//    private Long lastUserChecked = 0L;
//    private Long lastUserChecks = 0L;

    List<String> duplicates = new ArrayList<String>();


    public Object getValueFromDb(ResultSet res, TablesFieldsType fieldType, String collumn) {
	Object value = null;
	
	return value;
    }

    static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public void addCuffed(UUID uuid) {
	if (uuid == null)
	    return;
	this.cuffed.add(uuid);
    }

    public void removeCuffed(Player player) {
	removeCuffed(player.getUniqueId());
    }

    public void removeCuffed(UUID uuid) {
	if (uuid == null)
	    return;
	this.cuffed.remove(uuid);
    }

    public boolean isCuffed(Player player) {
	return isCuffed(player.getUniqueId());
    }

    public boolean isCuffed(UUID uuid) {
	if (uuid == null)
	    return false;
	return this.cuffed.contains(uuid);
    }

    HashMap<UUID, Integer> delaySSTrigger = new HashMap<UUID, Integer>();

    public void removeSocialSpyDelayed(UUID uuid) {
	Integer id = delaySSTrigger.remove(uuid);
	if (id != null)
	    Bukkit.getScheduler().cancelTask(id);
    }

    public void addSocialSpyDelayed(final UUID uuid) {
    }

    public void addSocialSpy(UUID uuid) {
	this.socialSpy.add(uuid);
    }

    public void removeSocialSpy(UUID uuid) {
	this.socialSpy.remove(uuid);
    }

    public boolean isSocialSpy(UUID uuid) {
	return this.socialSpy.contains(uuid);
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
	this.signSpy.add(uuid);
    }

    public void removeSignSpy(UUID uuid) {
	this.signSpy.remove(uuid);
    }

    public boolean isSignSpy(UUID uuid) {
	return this.signSpy.contains(uuid);
    }

    public void sendMessageToSignSpies(Player sender, String msg, Location loc) {
	
    }

    public UUID getEmptyUserUUID() {
	return emptyUserUUID;
    }

    public void forceSaveAllUsersIntoDataBase() {
    }

    public Player getFakeOperator() {
	fakeOperator = plugin.getNMS().createFakeOperator();
	return fakeOperator;
    }

    public Player getFakeOperatorRaw() {
	return fakeOperator;
    }

    public String getFakeUserName() {
	return fakeUserName;
    }

    public UUID getFakeUserUUID() {
	return fakeUserUUID;
    }

    public boolean openMailGui(Player player, int page) {

	return true;
    }

    public Set<UUID> getAlerts() {
	return alerts;
    }

    public void addAlert(UUID uuid) {
	this.alerts.add(uuid);
    }

    public void removeAlert(UUID uuid) {
	this.alerts.remove(uuid);
    }
}
