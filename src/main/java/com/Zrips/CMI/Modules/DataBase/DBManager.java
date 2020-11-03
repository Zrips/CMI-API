package com.Zrips.CMI.Modules.DataBase;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.PlayerManager;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

public class DBManager {
    private DBDAO dao;
    private CMI plugin;
    private DataBaseType DbType = DataBaseType.SqLite;

    public enum DataBaseType {
	MySQL, SqLite
    }

    public DBManager(CMI plugin) {
	this.plugin = plugin;
    }

    public DBDAO getDB() {
	return dao;
    }

    public void switchDataBase() {
    }

    int autoSaveInterval = 15;
    private boolean ForceSaveOnLogOut = false;
    private boolean ForceLoadOnLogIn = false;
    private static final String dataBaseFile = "dataBaseInfo.yml";

    private String username = "";
    private String password = "";
    private String hostname = "";
    private String database = "";
    private String prefix = "";
    private boolean autoReconnect = true;
    private boolean useSSL = true;
    private boolean verifyServerCertificate = true;

    public void load() {

    }

    private synchronized DBMySQL startMysql(boolean reload) {

	return null;
    }

    private synchronized DBSQLite startSqlite(boolean reload) {
	return null;
    }

    public DataBaseType getDbType() {
	return DbType;
    }

    private Set<InvSave> invToSave = ConcurrentHashMap.newKeySet();
    private Set<CMIUser> playerListToSave = ConcurrentHashMap.newKeySet();
    private Set<CMIUser> playerPlayTimeRewardToSave = ConcurrentHashMap.newKeySet();

    int autosaveBukkitId = -1;

    public void stop() {
    }

    class InvSave {
	private CMIUser user;
	private String inv;

	public InvSave(CMIUser user, String inv) {
	    this.user = user;
	    this.inv = inv;
	}

	public String getInv() {
	    return inv;
	}

	public CMIUser getUser() {
	    return user;
	}
    }

    public void start() {
    }

    public void addForSave(CMIUser user) {
    }

    public void addForPlayTimeRewardSave(CMIUser user) {
	playerPlayTimeRewardToSave.add(user);
    }

    public void addForSave(CMIUser user, String inventory) {

	InvSave inv = new InvSave(user, inventory);

	invToSave.add(inv);
    }

    public void clear() {
    }

    BukkitTask task = null;
    Long startedAt = 0L;

    private Runnable autoSave = new Runnable() {
	@Override
	public void run() {

	}
    };

    HashMap<String, CMIUser> getPlayerId = new HashMap<String, CMIUser>();
    HashMap<Integer, CMIUser> getPlayerInvId = new HashMap<Integer, CMIUser>();
    HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId = new HashMap<CMIPlayDay, CMIUser>();
    HashMap<Integer, CMIUser> getPlayerPlayTimeRewardId = new HashMap<Integer, CMIUser>();

    private synchronized HashSet<CMIUser> getFirstPlayersForSave(boolean all) {

	return null;
    }

    Boolean all = false;

    public void saveAllInNextCicle() {
	all = true;
    }

    public void saveBatchAsync(boolean allEntries) {

    }

    Integer oldRapidvalue = null;

    public void startRapidSave() {
	oldRapidvalue = autoSaveInterval;
	autoSaveInterval = 1;
	all = false;
    }

    public void saveBatch(boolean all) {

    }

    public boolean isRapidModeEnabled() {
	return oldRapidvalue != null;
    }

    private void showStats() {
    }

    public boolean isForceSaveOnLogOut() {
	return ForceSaveOnLogOut;
    }

    public boolean isForceLoadOnLogIn() {
	return ForceLoadOnLogIn;
    }
}
