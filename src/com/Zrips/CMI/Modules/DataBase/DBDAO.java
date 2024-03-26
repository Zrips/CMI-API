package com.Zrips.CMI.Modules.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;
import com.Zrips.CMI.Modules.PlayTime.CMIPlayDay;

public abstract class DBDAO {

    private DBConnectionPool pool;
    private static String prefix;
    protected CMI plugin;

    private static DataBaseType dbType = DataBaseType.SqLite;

    public enum TablesFieldsType {
        decimal("double"),
        number("int"),
        longtext("longtext"),
        text("text"),
        stringList("longtext"),
        stringLongMap("text"),
        stringIntMap("text"),
        stringDoubleMap("text"),
        stringStringMap("text"),
        locationMap("text"),
        state("boolean"),
        location("text"),
        longNumber("bigint");

        private String type;

        TablesFieldsType(String type) {
            this.type = type;
        }

        public static TablesFieldsType getByname(String name) {
            for (TablesFieldsType one : TablesFieldsType.values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }

        public String getType() {
            return type;
        }
    }

    public enum UserTablesFields {
        player_uuid("text", TablesFieldsType.text),
        username("text", TablesFieldsType.text),
        nickname("text", TablesFieldsType.text),
        LogOutLocation("text", TablesFieldsType.location),
        DeathLocation("text", TablesFieldsType.location),
        TeleportLocation("text", TablesFieldsType.location),
        Homes("text", TablesFieldsType.locationMap),
        LastLoginTime("bigint", TablesFieldsType.longNumber),
        LastLogoffTime("bigint", TablesFieldsType.longNumber),
        TotalPlayTime("bigint", TablesFieldsType.longNumber),
        tFly("bigint", TablesFieldsType.longNumber),
        tGod("bigint", TablesFieldsType.longNumber),
        Glow("text", TablesFieldsType.text),
        Ips("text", TablesFieldsType.stringIntMap),
        Cuffed("boolean", TablesFieldsType.state),
        AlertUntil("bigint", TablesFieldsType.longNumber),
        AlertReason("text", TablesFieldsType.text),
        JoinedCounter("boolean", TablesFieldsType.state),
        LockedIps("text", TablesFieldsType.stringList),
        pTime("bigint", TablesFieldsType.longNumber),
        Kits("text", TablesFieldsType.stringLongMap),
        Charges("text", TablesFieldsType.text),
        Cooldowns("mediumtext", TablesFieldsType.text),
        Balance("double", TablesFieldsType.decimal),
        Notes("text", TablesFieldsType.stringList),
        Rank("text", TablesFieldsType.text),
        BannedUntil("bigint", TablesFieldsType.longNumber),
        BannedAt("bigint", TablesFieldsType.longNumber),
        BannedBy("text", TablesFieldsType.text),
        BanReason("text", TablesFieldsType.text),
        Ignores("text", TablesFieldsType.text),
        Vanish("text", TablesFieldsType.text),
        Economy("text", TablesFieldsType.stringDoubleMap),
        Mail("mediumtext", TablesFieldsType.stringList),
        FlightCharge("double", TablesFieldsType.decimal),
        UserMeta("text", TablesFieldsType.stringStringMap),
        Flying("boolean", TablesFieldsType.state),
        Votifier("int", TablesFieldsType.number),
        Jail("text", TablesFieldsType.text),
        JailedUntil("bigint", TablesFieldsType.longNumber),
        FakeAccount("boolean", TablesFieldsType.state),
        PlaytimeOptimized("bigint", TablesFieldsType.longNumber),
        flightChargeEnabled("boolean", TablesFieldsType.state),
        JailReason("text", TablesFieldsType.text),
        Skin("text", TablesFieldsType.text),
        Collision("boolean", TablesFieldsType.state),
        NamePrefix("text", TablesFieldsType.text),
        NameSuffix("text", TablesFieldsType.text),
        Warnings("text", TablesFieldsType.stringLongMap),
        NameColor("text", TablesFieldsType.text),
        Muted("text", TablesFieldsType.text),
        AFRecharge("text", TablesFieldsType.text),
        DisplayName("text", TablesFieldsType.text),
        Options("text", TablesFieldsType.text),
        ChatColor("text", TablesFieldsType.text);

        // Always add new collumns to the end

        private String type;
        private TablesFieldsType fieldType;

        UserTablesFields(String type, TablesFieldsType fieldType) {
            this.type = type;
            this.fieldType = fieldType;
        }

        @Deprecated
        public String getCollumn() {
            return this.name();
        }

        public String getColumn() {
            return this.name();
        }

        public String getType() {
            return type;
        }

        public TablesFieldsType getFieldType() {
            return fieldType;
        }
    }

    public enum PlaytimeTablesFields {
        player_id(TablesFieldsType.number),
        date(TablesFieldsType.number),
        h0(0, TablesFieldsType.longNumber),
        h1(1, TablesFieldsType.longNumber),
        h2(2, TablesFieldsType.longNumber),
        h3(3, TablesFieldsType.longNumber),
        h4(4, TablesFieldsType.longNumber),
        h5(5, TablesFieldsType.longNumber),
        h6(6, TablesFieldsType.longNumber),
        h7(7, TablesFieldsType.longNumber),
        h8(8, TablesFieldsType.longNumber),
        h9(9, TablesFieldsType.longNumber),
        h10(10, TablesFieldsType.longNumber),
        h11(11, TablesFieldsType.longNumber),
        h12(12, TablesFieldsType.longNumber),
        h13(13, TablesFieldsType.longNumber),
        h14(14, TablesFieldsType.longNumber),
        h15(15, TablesFieldsType.longNumber),
        h16(16, TablesFieldsType.longNumber),
        h17(17, TablesFieldsType.longNumber),
        h18(18, TablesFieldsType.longNumber),
        h19(19, TablesFieldsType.longNumber),
        h20(20, TablesFieldsType.longNumber),
        h21(21, TablesFieldsType.longNumber),
        h22(22, TablesFieldsType.longNumber),
        h23(23, TablesFieldsType.longNumber);

        private TablesFieldsType fieldType;
        private int hour = 0;

        PlaytimeTablesFields(TablesFieldsType fieldType) {
            this.fieldType = fieldType;
        }

        PlaytimeTablesFields(int hour, TablesFieldsType fieldType) {
            this.fieldType = fieldType;
            this.hour = hour;
        }

        public String getCollumn() {
            return this.name();
        }

        public String getType() {
            return fieldType.getType();
        }

        public TablesFieldsType getFieldType() {
            return fieldType;
        }

        public boolean isTimeField() {
            return this.name().startsWith("h") && this.name().length() < 4;
        }

        public int getHour() {
            return hour;
        }
    }

    public enum PlaytimeRewardTablesFields {
        player_id(TablesFieldsType.number),
        repeatable(TablesFieldsType.stringLongMap),
        onetime(TablesFieldsType.stringList);

        private TablesFieldsType fieldType;

        PlaytimeRewardTablesFields(TablesFieldsType fieldType) {
            this.fieldType = fieldType;
        }

        public String getCollumn() {
            return this.name();
        }

        public String getType() {
            return fieldType.getType();
        }

        public TablesFieldsType getFieldType() {
            return fieldType;
        }
    }

    public enum InventoryTablesFields {
        player_id("player_id", "int", TablesFieldsType.number),
        inventories("inventories", "longtext", TablesFieldsType.longtext);

        private String column;
        private String type;
        private TablesFieldsType fieldType;

        InventoryTablesFields(String column, String type, TablesFieldsType fieldType) {
            this.column = column;
            this.type = type;
            this.fieldType = fieldType;
        }

        public String getCollumn() {
            return column;
        }

        public String getType() {
            return type;
        }

        public TablesFieldsType getFieldType() {
            return fieldType;
        }
    }

    public enum DBTables {
        UserTable("users",
            "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
            "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        InvTable("inventories",
            "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
            "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        PlayTime("playtime",
            "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
            "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);"),
        PlayTimeReward("playtimereward",
            "CREATE TABLE `[tableName]` (`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY[fields]);",
            "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);");

        private String mySQL;
        private String sQlite;
        private String tableName;

        DBTables(String tableName, String MySQL, String SQlite) {
            this.tableName = tableName;
            this.mySQL = MySQL;
            this.sQlite = SQlite;
        }

        private String getQR() {
            switch (dbType) {
            case MySQL:
                return this.mySQL.replace("[tableName]", prefix + this.tableName);
            case SqLite:
                return this.sQlite.replace("[tableName]", this.tableName);
            }
            return "";
        }

        public String getQuery() {
            String rp = "";
            switch (this) {
            case InvTable:
                for (InventoryTablesFields one : InventoryTablesFields.values()) {
                    rp += ", " + "`" + one.getCollumn() + "` " + one.getType();
                }
                break;
            case UserTable:
                for (UserTablesFields one : UserTablesFields.values()) {
                    // Future option to prevent UUID duplications happen
//		    if (one.equals(UserTablesFields.player_uuid))
//			rp += ", " + "`" + one.getCollumn() + "` " + one.getType() + " UNIQUE";
//		    else
                    rp += ", " + "`" + one.getCollumn() + "` " + one.getType();
                }
                break;
            case PlayTime:
                for (PlaytimeTablesFields one : PlaytimeTablesFields.values()) {
                    rp += ", " + "`" + one.getCollumn() + "` " + one.getType();
                }
                break;
            case PlayTimeReward:
                for (PlaytimeRewardTablesFields one : PlaytimeRewardTablesFields.values()) {
                    rp += ", " + "`" + one.getCollumn() + "` " + one.getType();
                }
                break;
            default:
                break;

            }

//	    switch (dbType) {
//	    case MySQL:
//		return this.mySQL.replace("[fields]", rp);
//	    case SqLite:
            return getQR().replace("[fields]", rp);
//	    }
//
//	    return mySQL;
        }

        public String getUpdateQuery() {
            switch (this) {
            case InvTable:
                String rp = "";
                for (InventoryTablesFields one : InventoryTablesFields.values()) {
                    if (one == InventoryTablesFields.player_id)
                        continue;
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "` = ?";
                }

                rp = "UPDATE `" + getTableName() + "` SET " + rp + " WHERE `id` = ?;";
                return rp;
            case UserTable:
                rp = "";
                for (UserTablesFields one : UserTablesFields.values()) {
                    if (one == UserTablesFields.player_uuid)
                        continue;
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "` = ?";
                }

                rp = "UPDATE `" + getTableName() + "` SET " + rp + " WHERE `id` = ?;";
                return rp;
            case PlayTime:
                rp = "";
                for (PlaytimeTablesFields one : PlaytimeTablesFields.values()) {
                    if (!one.isTimeField())
                        continue;
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "` = ?";
                }

                rp = "UPDATE `" + getTableName() + "` SET " + rp + " WHERE `id` = ?;";
                return rp;
            case PlayTimeReward:
                rp = "";
                for (PlaytimeRewardTablesFields one : PlaytimeRewardTablesFields.values()) {
                    if (one == PlaytimeRewardTablesFields.player_id)
                        continue;
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "` = ?";
                }

                rp = "UPDATE `" + getTableName() + "` SET " + rp + " WHERE `id` = ?;";
                return rp;
            default:
                break;
            }
            return "";
        }

        public String getInsertQuery() {
            String rp = "";
            String q = "";
            switch (this) {
            case UserTable:
                for (UserTablesFields one : UserTablesFields.values()) {
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "`";

                    if (!q.isEmpty())
                        q += ", ";
                    q += "?";
                }

                break;
            case InvTable:
                for (InventoryTablesFields one : InventoryTablesFields.values()) {
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "`";

                    if (!q.isEmpty())
                        q += ", ";
                    q += "?";
                }
                break;
            case PlayTime:
                for (PlaytimeTablesFields one : PlaytimeTablesFields.values()) {
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "`";

                    if (!q.isEmpty())
                        q += ", ";
                    q += "?";
                }
                break;
            case PlayTimeReward:
                for (PlaytimeRewardTablesFields one : PlaytimeRewardTablesFields.values()) {
                    if (!rp.isEmpty())
                        rp += ", ";
                    rp += "`" + one.getCollumn() + "`";

                    if (!q.isEmpty())
                        q += ", ";
                    q += "?";
                }
                break;
            default:
                break;
            }
            switch (this) {
            case UserTable:
                if (dbType.equals(DataBaseType.SqLite)) {
//                    rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") VALUES (" + q + ");";
                    rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") SELECT " + q + " WHERE NOT EXISTS (SELECT 1 FROM `" + getTableName() + "` WHERE " + UserTablesFields.player_uuid.getCollumn()
                        + " = ?);";
                } else {
                    switch (Format) {
                    case MariaDB:
                        rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") SELECT " + q + " FROM dual WHERE NOT EXISTS (SELECT " + UserTablesFields.player_uuid.getCollumn() + " FROM " + this
                            .getTableName() + " WHERE " + UserTablesFields.player_uuid.getCollumn() + " = ?) LIMIT 1;";
                        break;
                    case MySQL:
                        rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") SELECT " + q + " WHERE NOT EXISTS (SELECT " + UserTablesFields.player_uuid.getCollumn() + " FROM " + this
                            .getTableName() + " WHERE " + UserTablesFields.player_uuid.getCollumn() + " = ?) LIMIT 1;";
                        break;
                    case old:
                        rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") VALUES (" + q + ");";
                        break;
                    }
                }
                break;
            default:
                rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") VALUES (" + q + ");";

                break;
            }
            return rp;
        }

        public String getTableName() {
            return prefix + tableName;
        }
    }

    public enum mysqltypes {
        old, MySQL, MariaDB;
    }

    public static mysqltypes Format = mysqltypes.MySQL;

    protected DBDAO(CMI plugin, String driverName, String url, String username, String password, String pr) {

    }

    public final synchronized void setUp() throws SQLException {

    }

    public abstract Statement prepareStatement(String query) throws SQLException;

    public abstract boolean createTable(String query) throws SQLException;

    public abstract boolean isTable(String table);

    public abstract boolean isCollumn(String table, String collumn);

    public abstract boolean truncate(String table);

    public abstract boolean addCollumn(String table, String collumn, String type);

    public abstract boolean convertTableToUTF8(DBTables table);

    public abstract String getTableCharSet(DBTables table);

    public abstract String getTableRowFormat(DBTables table);

    public abstract boolean convertTableRowFormat(DBTables table);

    public String getPrefix() {
        return prefix;
    }

    // sync
    public void updateUUID(int id, UUID uuid) {

    }

    // sync
    public void updateUserName(int id, String name) {

    }

    /**
     * Executes an SQL query
     * @param sql - The SQL
     * @throws SQLException
     */
    public void executeSQL(String sql) throws SQLException {

    }

    public boolean isConnected() {
        try {
            return pool.getConnection() != null && !pool.getConnection().isClosed();
        } catch (Error | Exception e) {
            return false;
        }
    }

    /**
     * Get a database connection
     * @return  JobsConnection object
     * @throws SQLException 
     */
    protected DBConnection getConnection() {
        try {
            return pool.getConnection();
        } catch (Error | Exception e) {
            plugin.consoleMessage("&cUnable to connect to the database: " + e.getMessage());
            return null;
        }
    }

    /**
     * Close all active database handles
     */
    public synchronized void closeConnections() {
        pool.closeConnection();
    }

    public void close(ResultSet res) {
        if (res != null)
            try {
                res.close();
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
    }

    public void close(Statement stmt) {
        if (stmt != null)
            try {
                stmt.close();
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
    }

    // async
    public boolean updatePlayer(CMIUser user) {
        return true;
    }

    private boolean createNewPlayerRecord(CMIUser user) {

        return true;
    }

    private boolean updatePlayerRecord(CMIUser user) {

        return true;
    }

    // async
    public void updatePlayerPlayTime(CMIUser user) {

    }

    // async
    public void updatePlayerInventory(CMIUser user, String string) {

    }

    // async
    public void updatePlayerPlayTimeRewards(CMIUser user) {

    }

    private PreparedStatement updateBatch = null;
    private boolean updateBatchExecuted = true;
    private PreparedStatement insertBatch = null;
    private boolean insertBatchExecuted = true;

    private PreparedStatement inventoryUpdateBatch = null;
    private boolean inventoryUpdateBatchExecuted = true;
    private PreparedStatement inventoryInsertBatch = null;
    private boolean inventoryInsertBatchExecuted = true;

    private PreparedStatement playtimerewardUpdateBatch = null;
    private boolean playtimerewardUpdateBatchExecuted = true;
    private PreparedStatement playtimerewardInsertBatch = null;
    private boolean playtimerewardInsertBatchExecuted = true;

    private PreparedStatement playtimeUpdateBatch = null;
    private boolean playtimeUpdateBatchExecuted = true;
    private PreparedStatement playtimeInsertBatch = null;
    private boolean playtimeInsertBatchExecuted = true;

    private boolean autoCommit = true;

    private boolean locked = false;

    public void setAutoCommit(boolean state) {
        try {
//	    if (autoCommit != state) {
            getConnection().setAutoCommit(state);
            autoCommit = state;
//	    }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    boolean ignoredFirst = false;

    public boolean executeTempBatch() {

        return true;
    }

    public void prepareTempBatch() {
        if (locked) {
            return;
        }
        setAutoCommit(false);
    }

    // async irelevant child method
    public int getInvId(int iid) {
        int id = 0;
        return id;
    }

    // sync priority
    public String getInv(CMIUser user) {

        return null;
    }

    // sync irelevant
    public void loadUser(UUID uuid) {
    }

    public void loadUser(int id) {
    }

    // sync irelevant
    public void loadAllUsers() {
    }

    // sync irelevant
    public void loadPlayTimes() {

    }

    // sync irrelevant
    public LinkedHashSet<CMIUser> getLastLogOffList(int from, int to) {

        return null;
    }

    public int getLogOffCount(long timeRangeSec) {

        return 0;
    }

    // sync irrelevant
    public void loadPlayTimes(CMIUser user) {

    }

    // sync irelevant
    public void loadPlayerPlayTimeRewards() {

    }

    // async
    public void getUserIds(HashMap<String, CMIUser> users) {

    }

    // async
    public void getUserPlayTimeIds(HashMap<CMIPlayDay, CMIUser> getPlayerPlayTimeId) {

    }

    // async
    public void getUserInvIds(HashMap<Integer, CMIUser> users) {

    }

    // async
    public void getUserPlayTimeRewardIds(HashMap<Integer, CMIUser> users) {

    }

    // sync no priority
    public boolean removeUser(int id) {

        return true;
    }

    private boolean createDefaultTable(DBTables table) {

        return false;
    }

    private boolean checkDefaultUserCollumns() {

        return true;
    }

    private boolean checkDefaultInvCollumns() {

        return true;
    }

    private boolean checkDefaultPlayTimeCollumns() {
        return true;
    }

    private boolean checkDefaultPlayTimeRewardCollumns() {
        for (PlaytimeRewardTablesFields one : PlaytimeRewardTablesFields.values()) {
            if (this.isCollumn(DBTables.PlayTimeReward.getTableName(), one.getCollumn()))
                continue;
            this.addCollumn(DBTables.PlayTimeReward.getTableName(), one.getCollumn(), one.getType());
        }
        return true;
    }

    public DataBaseType getDbType() {
        return dbType;
    }

    public void setDbType(DataBaseType dabType) {
        dbType = dabType;
    }

    public boolean isLocked() {
        return locked;
    }

}
