package com.Zrips.CMI;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class YmlMaker {
    CMI Plugin;
    public String fileName;
    private JavaPlugin plugin;
    public File ConfigFile;
    private FileConfiguration Configuration;

    public YmlMaker(CMI Plugin) {
	this.Plugin = Plugin;
    }

    public YmlMaker(JavaPlugin plugin, String fileName) {
    }

    public void reloadConfig() {

    }

    public FileConfiguration getConfig() {
	return null;
    }

    public void saveConfig() {
    }

    public void saveDefaultConfig() {
    }
}
