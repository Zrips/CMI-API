package com.Zrips.CMI.Containers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.CommentedYamlConfiguration;

import org.bukkit.ChatColor;
import org.bukkit.Location;

public class ConfigReader {
    YamlConfiguration config;
    CommentedYamlConfiguration writer;
    private String p = null;
    private File file = null;

    public ConfigReader(File file) {
	this.file = file;
	this.config = getyml(file);
	this.writer = new CommentedYamlConfiguration();
    }

    public YamlConfiguration getyml(File file) {
	return null;
    }

    public void saveToBackup() {
    }

    public void save() {
    }

    public CommentedYamlConfiguration getW() {
	return writer;
    }

    private static void newLn(StringBuilder header) {
	header.append(System.lineSeparator());
    }

    private static StringBuilder formStringBuilder(List<String> list) {
	return null;
    }

    public void header(List<String> list) {
	getW().options().header(formStringBuilder(list).toString());
    }

    public void addComment(String path, String... comments) {
    }

    String[] waitingComment = null;

    private void checkWaitingComment(String path) {
    }

    public YamlConfiguration getC() {
	return config;
    }

    public Boolean get(String path, Boolean boo) {
	return null;
    }

    public Object get(String path, Location boo) {
	return null;
    }

    public int get(String path, int boo) {
	return 0;
    }

    public List<Integer> getIntList(String path, List<Integer> list) {
	return null;
    }

    public List<String> get(String path, List<String> list, boolean colorize) {
	return null;
    }

    public List<String> get(String path, List<String> list) {
	return null;
    }

    public String get(String path, String boo) {
	return null;
    }

    private String get(String path, String boo, boolean colorize) {
	return null;
    }

    public Double get(String path, Double boo) {
	return null;
    }

    public void set(String path, Object boo) {
    }

    private synchronized void copySetting(String path) {
    }

    private static List<String> ColorsArray(List<String> text) {
	return null;
    }

    private static String Colors(String text) {
	return null;
    }

    public void resetP() {
	p = null;
    }

    public void setP(String cmd) {
	this.p = "command." + cmd + ".info.";
    }

}
