package com.Zrips.CMI.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import com.Zrips.CMI.CMI;
import com.google.common.io.Files;

/* 
 * Made by Zrips
 */

public class ConfigReader extends YamlConfiguration {
    private HashMap<String, String> comments;
    private HashMap<String, Object> contents;
    YamlConfiguration config;
    private String p = null;
    private File file = null;
    private boolean recordContents = false;

    public ConfigReader(String fileName) throws Exception {
	this(new File(CMI.getInstance().getDataFolder(), fileName));
    }

    public ConfigReader(File file) throws Exception {
	super();
    }

    public void load() {
    }

    @Override
    public void save(String file) throws IOException {
    }

    @Override
    public void save(File file) throws IOException {
    }

    private String insertComments(String yaml) {	
	return null;
    }

    public void addComment(String path, String... commentLines) {
    }

    public YamlConfiguration getyml(File file) throws Exception {
	
	return null;
    }

    public void saveToBackup() {
	
    }

    public void save() {
    }

    private static void newLn(StringBuilder header) {
	header.append(System.lineSeparator());
    }

    private static StringBuilder formStringBuilder(List<String> list) {
	return null;
    }

    public void header(List<String> list) {
	options().header(formStringBuilder(list).toString());
    }

    String[] waitingComment = null;

    private void checkWaitingComment(String path) {
	if (waitingComment == null)
	    return;
	addComment(path, waitingComment);
	waitingComment = null;
    }

    public YamlConfiguration getC() {
	return config;
    }

    public void copyDefaults(boolean value) {
	getC().options().copyDefaults(value);
    }

    public Boolean get(String path, Boolean boo) {
	return null;
    }

    private String process(String path, Object value) {
	return null;
    }

    public Object get(String path, Location boo) {
	return null;
    }

    public int get(String path, int boo) {
	path = process(path, boo);
	return config.getInt(path);
    }

    public List<Integer> getIntList(String path, List<Integer> list) {
	path = process(path, list);
	return config.getIntegerList(path);
    }

    private static String convertUnicode(String st) {
	
	return null;
    }

    public List<String> get(String path, List<String> list) {
	return null;
    }

    public String get(String path, String boo) {
	return null;
    }

    public Double get(String path, Double boo) {
	path = process(path, boo);
	return config.getDouble(path);
    }

    private synchronized void copySetting(String path) {
	set(path, config.get(path));
    }

    public void resetP() {
	p = null;
    }

    public void setP(String cmd) {
	this.p = "command." + cmd + ".info.";
    }

    public String getPath() {
	return this.p;
    }

    public void setRecordContents(boolean recordContents) {
	this.recordContents = recordContents;
    }

    public HashMap<String, Object> getContents() {
	return contents;
    }
}
