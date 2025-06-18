package com.Zrips.CMI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIUserAlert;
import com.Zrips.CMI.Modules.DataBase.DBDAO.TablesFieldsType;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PlayerManager {
    private int realUserCount;
    private Map<UUID, CMIUser> users;
    private Map<String, CMIUser> usersName;
    private Map<Integer, CMIUser> usersIds;
    private Map<String, List<CMIUser>> duplicateUserNames;
    private Set<UUID> cuffed;
    private Set<UUID> socialSpy;
    private Set<UUID> commandSpy;
    private Set<UUID> signSpy;
    private HashMap<UUID, CMIUserAlert> userAlerts;
    protected Player fakeOperator;
    private final UUID emptyUserUUID = null;
    public static final UUID oldFakeUserUUID = null;
    private final UUID fakeUserUUID = null;
    private static final String fakeUserName = null;
    private CMI plugin;
    public static HashMap<UserTablesFields, Long> timer;
    public static int timesProcessed;
    public static final String mapKeySeparator = null;
    private static final String mapKeySeparatorForsave = null;
    private static final String sectionSeparator = null;
    private static final String sectionSeparatorForSave = null;
    public static final String lineSeparator = null;
    private static final String lineSeparatorForSave = null;
    public static final String multiSeparator = null;
    private static Pattern kitPattern;
    List<String> duplicates;
    static DecimalFormat decimalFormat;
    HashMap<UUID, CMITask> delaySSTrigger;
    HashMap<UUID, CMITask> delayCSTrigger;
    HashMap<UUID, CMITask> delaySignSTrigger;
    private static List<String> hardBlackList;

    public PlayerManager(CMI plugin) {
    }

    @Deprecated
    public void updateUserName(CMIUser user, String newName) {
    }

    public void updateUserName(CMIUser user, String oldname, String newName) {
    }

    public void clearData() {
    }

    public synchronized Map<UUID, CMIUser> getAllUsers() {
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
        return false;
    }

    public boolean addDuplicatedUser(CMIUser user) {
        return false;
    }

    public int getTotalUserCount() {
        return 0;
    }

    public CMIUser softRemoveUser(UUID uuid) {
        return null;
    }

    public CMIUser softRemoveUser(UUID uuid, boolean fromDataBse) {
        return null;
    }

    public CMIUser softRemoveUser(CMIUser user) {
        return null;
    }

    public CMIUser softRemoveUser(CMIUser user, boolean fromDataBse) {
        return null;
    }

    public void removeUser(CMIUser user) {
    }

    public CMIUser getByName(String name) {
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
        return null;
    }

    public CMIUser getUser(String name) {
        return null;
    }

    public CMIUser getUser(String name, boolean includeDuplicate) {
        return null;
    }

    @Deprecated
    public CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline) {
        return null;
    }

    public CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline, boolean createFake, boolean exactName) {
        return null;
    }

    public CMIUser getUser(String name, boolean includeDuplicate, boolean checkOflline, boolean createFake, boolean exactName, boolean checkNickName) {
        return null;
    }

    public boolean isUserExist(UUID uuid) {
        return false;
    }

    public CMIUser getUser(OfflinePlayer player) {
        return null;
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
        return false;
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

    public String convertLocToStringShortBlock(CMILocation loc) {
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
    }

    private void save(CMIUser user) {
    }

    public PreparedStatement savePlayerToDB(CMIUser user, PreparedStatement prest, boolean addId) throws Throwable {
        return null;
    }

    private static String filterOutForLoad(String message) {
        return null;
    }

    private static String filterOutForSave(String message) {
        return null;
    }

    private static PreparedStatement proccessForSaveField(PreparedStatement prest, int place, Object value, UserTablesFields field) throws Throwable {
        return null;
    }

    public void loadUserFromDb(ResultSet res) {
    }

    private static CMILocation invertLoc(Object loc) {
        return null;
    }

    public Object getValueFromDb(ResultSet res, TablesFieldsType fieldType, String column) {
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

    private static String locationToString(CMILocation loc) {
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
        return false;
    }

    public boolean isCuffed(UUID uuid) {
        return false;
    }

    public void removeSocialSpyDelayed(UUID uuid) {
    }

    public void addSocialSpyDelayed(UUID uuid) {
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

    public void removeCommandSpyDelayed(UUID uuid) {
    }

    public void addCommandSpyDelayed(UUID uuid) {
    }

    public void addCommandSpy(UUID uuid) {
    }

    public void removeCommandSpy(UUID uuid) {
    }

    public boolean isCommandSpy(UUID uuid) {
        return false;
    }

    public void sendMessageToCommandSpies(Player sender, String msg) {
    }

    public void addSignSpyDelayed(UUID uuid) {
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

    public Player getFakeOperatorRaw() {
        return null;
    }

    public String getFakeUserName() {
        return null;
    }

    public UUID getFakeUserUUID() {
        return null;
    }

    public boolean openMailGui(Player player, int page) {
        return false;
    }

    public Set<UUID> getAlerts() {
        return null;
    }

    @Deprecated
    public void addAlert(UUID uuid) {
    }

    public CMIUserAlert getAlert(UUID uuid) {
        return null;
    }

    public void addAlert(UUID uuid, long until, String reason) {
    }

    public void removeAlert(UUID uuid) {
    }
}
