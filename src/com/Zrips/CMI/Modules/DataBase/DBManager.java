package com.Zrips.CMI.Modules.DataBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class DBManager {
    private DBDAO dao;
    private CMI plugin;
    private DataBaseType DbType;
    int autoSaveInterval;
    private boolean ForceSaveOnLogOut;
    private boolean ForceLoadOnLogIn;
    private static final String fileName = null;
    private String username;
    private String password;
    private String hostname;
    private String database;
    private String prefix;
    private boolean autoReconnect;
    private boolean useSSL;
    private boolean verifyServerCertificate;
    private ConcurrentHashMap<CMIUser, InvSave> invToSave;
    private Set<CMIUser> playerListToSave;
    private Set<CMIUser> playerPlayTimeRewardToSave;
    CMITask autosaveBukkitId;
    CompletableFuture<Void> task;
    Long startedAt;
    private Runnable autoSave;
    HashMap<String, CMIUser> getPlayerId;
    HashMap<Integer, CMIUser> getPlayerInvId;
    HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId;
    HashMap<Integer, CMIUser> getPlayerPlayTimeRewardId;
    Boolean all;
    Integer oldRapidvalue;
    boolean startingDb;

    public DBManager(CMI plugin) {
    }

    public DBDAO getDB() {
        return null;
    }

    public void switchDataBase() {
    }

    public void load() {
    }

    private synchronized DBMySQL startMysql(boolean reload) {
        return null;
    }

    private synchronized DBSQLite startSqlite(boolean reload) {
        return null;
    }

    public DataBaseType getDbType() {
        return null;
    }

    public void stop() {
    }

    public void start() {
    }

    public void addForSave(CMIUser user) {
    }

    public void addForPlayTimeRewardSave(CMIUser user) {
    }

    public void addForSave(CMIUser user, String inventory) {
    }

    public void clear() {
    }

    private synchronized HashSet<CMIUser> getFirstPlayersForSave(boolean all) {
        return null;
    }

    public void saveAllInNextCicle() {
    }

    public void saveBatchAsync(boolean allEntries) {
    }

    public void startRapidSave() {
    }

    public void saveBatch(boolean all) {
    }

    private void saveInventories() {
    }

    private void savePlaytimeRewards() {
    }

    private void saveCMIPlaytime(HashSet<CMIUser> temp) {
    }

    public boolean isRapidModeEnabled() {
        return false;
    }

    public boolean isForceSaveOnLogOut() {
        return false;
    }

    public boolean isForceLoadOnLogIn() {
        return false;
    }

    public enum DataBaseType {
        MySQL, SqLite;
    }

    class InvSave {
        private CMIUser user;
        private String inv;

        public InvSave(CMIUser user, String inv) {
        }

        public String getInv() {
            return null;
        }

        public CMIUser getUser() {
            return null;
        }
    }
}
