package com.Zrips.CMI.Modules.DataBase;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;

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

    public void start(ConfigReader c) {
	
    }

    private synchronized DBMySQL startMysql() {
	
	return null;
    }

    private synchronized DBSQLite startSqlite() {
	return null;
    }

    public DataBaseType getDbType() {
	return null;
    }

    private Set<InvSave> invToSave = new HashSet<InvSave>();
    private Set<CMIUser> playerListToSave = new HashSet<CMIUser>();
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

    public void addForSave(CMIUser user, String inventory) {
    }


    public void clear() {
    }

    private Runnable autoSave = new Runnable() {
	@Override
	public void run() {
	    saveBatch();
	}
    };

    public void saveBatch() {
	
    }
}
