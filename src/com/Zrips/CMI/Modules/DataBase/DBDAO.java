package com.Zrips.CMI.Modules.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.UUID;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.DataBase.DBManager.DataBaseType;

public abstract class DBDAO {

    private DBConnectionPool pool;
    private static String prefix;
    protected CMI plugin;

    private static DataBaseType dbType = DataBaseType.SqLite;

    public enum TablesFieldsType {
	decimal, number, longtext, text, stringList, stringLongMap, stringIntMap, stringDoubleMap, locationMap, state, location, longNumber;
	public static TablesFieldsType getByname(String name) {
	    for (TablesFieldsType one : TablesFieldsType.values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}
    }

    public enum UserTablesFields {
	player_uuid("text", TablesFieldsType.text),
	username("text", TablesFieldsType.text),
	nickname("text", TablesFieldsType.text),
	LogOutLocation("text", TablesFieldsType.location),
	DeathLocation("text", TablesFieldsType.location),
	TeleportLocation("text", TablesFieldsType.location),
	teleportToggled("boolean", TablesFieldsType.state),
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
	Cooldowns("text", TablesFieldsType.stringList),
	Balance("double", TablesFieldsType.decimal),
	Notes("text", TablesFieldsType.stringList),
	Rank("text", TablesFieldsType.text),
	TagSound("boolean", TablesFieldsType.state),
	SignShiftEdit("boolean", TablesFieldsType.state),
	Spy("boolean", TablesFieldsType.state),
	CommandSpy("boolean", TablesFieldsType.state),
	BannedUntil("bigint", TablesFieldsType.longNumber),
	BannedAt("bigint", TablesFieldsType.longNumber),
	BannedBy("text", TablesFieldsType.text),
	BanReason("text", TablesFieldsType.text),
	Ignores("text", TablesFieldsType.text),
	Vanish("text", TablesFieldsType.text),
	Economy("text", TablesFieldsType.stringDoubleMap),
	Mail("text", TablesFieldsType.stringList),
	FlightCharge("double", TablesFieldsType.decimal);

	private String type;
	private TablesFieldsType fieldType;

	UserTablesFields(String type, TablesFieldsType fieldType) {
	    this.type = type;
	    this.fieldType = fieldType;
	}

	public String getCollumn() {
	    return this.name();
	}

	public String getType() {
	    return type;
	}

	public TablesFieldsType getFieldType() {
	    return fieldType;
	}
    }

    public enum InventoryTablesFields {
	player_id("player_id", "int", TablesFieldsType.number),
	inventories("inventories", "longtext", TablesFieldsType.longtext);

	private String collumn;
	private String type;
	private TablesFieldsType fieldType;

	InventoryTablesFields(String collumn, String type, TablesFieldsType fieldType) {
	    this.collumn = collumn;
	    this.type = type;
	    this.fieldType = fieldType;
	}

	public String getCollumn() {
	    return collumn;
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
	    "CREATE TABLE `[tableName]` (`id` INTEGER PRIMARY KEY AUTOINCREMENT[fields]);");

	private String mySQL;
	private String sQlite;
	private String tableName;

	DBTables(String tableName, String MySQL, String SQlite) {
	    this.tableName = tableName;
	    this.mySQL = MySQL;
	    this.sQlite = SQlite;
//	    this.mySQL = MySQL.replace("[tableName]", prefix + this.tableName);
//	    this.sQlite = SQlite.replace("[tableName]", this.tableName);
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

		rp = "UPDATE `" + getTableName() + "` SET " + rp + " WHERE `player_id` = ?;";
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
	    default:
		break;
	    }
	    rp = "INSERT INTO `" + getTableName() + "` (" + rp + ") VALUES (" + q + ");";
	    return rp;
	}

	public String getTableName() {
	    return prefix + tableName;
	}
    }

    protected DBDAO(CMI plugin, String driverName, String url, String username, String password, String pr) {
	this.plugin = plugin;
	prefix = pr;
	try {
	    pool = new DBConnectionPool(driverName, url, username, password);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public final synchronized void setUp() throws SQLException {
	setupConfig();
	int version = getSchemaVersion();
	if (version == 0) {
	    plugin.consoleMessage("&cCould not initialize database!  Could not determine schema version!");
	    return;
	}

	try {
//	    checkUpdate();
	    version = 1;
	    updateSchemaVersion(version);
	    createDefaultTable(DBTables.UserTable);
	    checkDefaultUserCollumns();
	    createDefaultTable(DBTables.InvTable);
	    checkDefaultInvCollumns();
	} finally {
	}
    }

    protected abstract void setupConfig() throws SQLException;

    protected abstract void checkUpdate() throws SQLException;

    public abstract Statement prepareStatement(String query) throws SQLException;

    public abstract boolean createTable(String query) throws SQLException;

    public abstract boolean isTable(String table);

    public abstract boolean isCollumn(String table, String collumn);

    public abstract boolean truncate(String table);

    public abstract boolean addCollumn(String table, String collumn, String type);

    public String getPrefix() {
	return prefix;
    }

    /**
     * Gets the current schema version
     * @return schema version number
     */
    protected int getSchemaVersion() {
	int schema = 0;
	return schema;
    }

    private void updateSchemaVersion(int value) {
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
	    return pool.getConnection() != null;
	} catch (SQLException e) {
	    return false;
	}
    }

    /**
     * Get a database connection
     * @return  JobsConnection object
     * @throws SQLException 
     */
    protected DBConnection getConnection() {
	return null;
    }

    /**
     * Close all active database handles
     */
    public synchronized void closeConnections() {
	pool.closeConnection();
    }

    public void close(ResultSet res) {
    }

    public void close(Statement stmt) {
    }

    public void updatePlayer(CMIUser user) {
    }


    public void updatePlayerInventory(CMIUser user, String string) {
	
    }

    private PreparedStatement updateBatch = null;
    private PreparedStatement insertBatch = null;
    private PreparedStatement inventoryUpdateBatch = null;
    private PreparedStatement inventoryInsertBatch = null;

    public void setAutoCommit(boolean state) {
	
    }

    public void commit() {
	
    }

    public void executeTempBatch() {
	
    }

    public void prepareTempBatch() {
	
    }

    public void addPlayerToBatch2(CMIUser user, boolean force) {
	
    }


    public int getInvId(int iid) {
	int id = 0;
	return id;
    }

    public String getInv(CMIUser user) {
	return null;
    }


    public void loadAllUsers() {
    }

    public void getUserIds(HashMap<String, CMIUser> users) {
    }

    public void getUserInvIds(HashMap<Integer, CMIUser> users) {
    }

    public boolean removeUser(UUID uuid) {
	boolean done = false;
	return done;
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

    public DataBaseType getDbType() {
	return dbType;
    }

    public void setDbType(DataBaseType dabType) {
	dbType = dabType;
    }
}
