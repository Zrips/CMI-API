package com.Zrips.CMI.Modules.CustomText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.utils.RawMessage;

public class CTextManager {

    private HashMap<String, CText> map = new HashMap<String, CText>();
    private HashMap<UUID, String> chatMap = new HashMap<UUID, String>();

    private HashMap<UUID, ShadowCommand> shadowCommand = new HashMap<UUID, ShadowCommand>();

    private CMI plugin;

    public enum ShadowCommandType {
	Console, Player;
    }

    public CTextManager(CMI plugin) {
	this.plugin = plugin;
    }

    public String addShadowCmd(Player player, String cmd, Boolean infinite, ShadowCommandType type) {
	return null;
    }

    public ShadowCommandInfo getShadowCommand(Player player, String id) {
	return null;
    }

    public HashMap<String, CText> getAll() {
	return map;
    }

    public void deleteCText(String name) {
	map.remove(name.toLowerCase());
    }

    public CText getCText(String name) {
	if (name == null)
	    return null;
	return map.get(name.toLowerCase());
    }

    public boolean isChatEditing(Player player) {
	return chatMap.containsKey(player.getUniqueId());
    }

    public void addChatEditor(Player player, String cmd) {
	chatMap.put(player.getUniqueId(), cmd);
    }

    public void removeChatEditor(Player player) {
	chatMap.remove(player.getUniqueId());
    }

    public String getChatEditorCmd(Player player) {
	return chatMap.get(player.getUniqueId());
    }

    public CText addNewCText(String name) {
	CText cText = new CText(name);
	map.put(name.toLowerCase(), cText);
	return cText;
    }

    public void load() {

    }

    public void save(CText cText) {

    }

    public void delete(CText cText) {
    }

    public void removeCTextLine(CText cText, Integer page, Integer line) {
    }

    public List<String> move(List<String> list, int place, int direction) {
	return null;
    }

    public void showCTextEditor(CommandSender sender, CText cText, Integer page) {

    }

    public void showCText(CommandSender sender, CText cText, Integer page) {

    }

    public RawMessage translateRaw(String textLine) {
	return translateRaw(null, null, textLine);
    }

    public RawMessage translateRaw(CommandSender sender, RawMessage rm, String textLine) {

	return null;
    }

}
