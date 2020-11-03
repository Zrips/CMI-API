package com.Zrips.CMI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
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
