package com.Zrips.CMI.Modules.DataBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.PlayerManager;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBDAO.UserTablesFields;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

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
        if (dao != null)
            dao.closeConnections();
        plugin.setFullyLoaded(false);
        switch (DbType) {
        case MySQL:
            DbType = DataBaseType.SqLite;
            dao = startSqlite(false);
            dao.setDbType(DbType);
            break;
        case SqLite:
            DbType = DataBaseType.MySQL;
            dao = startMysql(false);
            dao.setDbType(DbType);
            break;
        }
        plugin.setFullyLoaded(true);
    }

    int autoSaveInterval = 15;
    private boolean ForceSaveOnLogOut = false;
    private boolean ForceLoadOnLogIn = false;
    private static final String fileName = "DataBaseInfo.yml";

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

    CMITask autosaveBukkitId = null;

    public void stop() {
        if (autosaveBukkitId != null) {
            CMIDebug.d("Stopped auto save task");
            autosaveBukkitId.cancel();
        }
        if (task != null)
            task.cancel(false);
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

        int autosaveInt = autoSaveInterval;
        if (oldRapidvalue != null)
            autosaveInt = 1;
        if (autosaveInt < 1) {
            autosaveInt = 1;
        }

        autosaveInt = autosaveInt * 20;
        stop();

        autosaveBukkitId = CMIScheduler.scheduleSyncRepeatingTask(autoSave, autosaveInt, autosaveInt);
    }

    public void addForSave(CMIUser user) {
        playerListToSave.add(user);
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

    CompletableFuture<Void> task = null;
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

    boolean startingDb = false;

    public void saveBatch(boolean all) {

    }

    public boolean isRapidModeEnabled() {
        return oldRapidvalue != null;
    }

    private void showStats() {
        for (Entry<UserTablesFields, Long> one : PlayerManager.timer.entrySet()) {
            CMIDebug.d(one.getKey() + " : " + (one.getValue() / PlayerManager.timesProcessed));
        }
    }

    public boolean isForceSaveOnLogOut() {
        return ForceSaveOnLogOut;
    }

    public boolean isForceLoadOnLogIn() {
        return ForceLoadOnLogIn;
    }
}
