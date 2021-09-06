package com.Zrips.CMI.Modules.DeathMessages;

import java.util.HashMap;
import java.util.List;

import com.Zrips.CMI.CMI;

public class DeathMessageManager {

    private CMI plugin;

    HashMap<String, DeathMessages> messages = new HashMap<String, DeathMessages>();

    public DeathMessageManager(CMI plugin) {
	this.plugin = plugin;
	if (DeathMessageListener.enabled)
	    load();
    }

    boolean Enabled = false;

    public void load() {
	if (DeathMessageListener.enabled) {
	    loadConfig();
	    loadLocale();
	}
    }

    private void loadConfig() {
    }

    private void loadLocale() {

    }

    private void addMessages(String path, List<String> ls) {
	messages.put(path, new DeathMessages(path, ls));
    }

    public String getDeathMessage(String path) {
	return null;
    }
}
