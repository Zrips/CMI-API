package com.Zrips.CMI.Modules.CustomText;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class CTextManager {

    private LinkedHashMap<String, CText> map = new LinkedHashMap<String, CText>();
    private HashMap<UUID, String> chatMap = new HashMap<UUID, String>();

    private CMI plugin;

    public CTextManager(CMI plugin) {
	this.plugin = plugin;
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
	if (player == null)
	    return;
	if (!cmd.endsWith(" "))
	    cmd += " ";
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

    public CText getCTextFromFile(File file) {

	return null;
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
	showCText(sender, null, cText, page);
    }

    public void showCText(CommandSender sender, CMIUser source, CText cText, Integer page) {
	if (!(sender instanceof Player))
	    return;
	Set<Player> senders = new HashSet<Player>();
	senders.add((Player) sender);
	showCText(senders, source, cText, page);
    }

    public void showCText(Set<Player> senders, CMIUser source, CText cText, Integer page) {

    }

    public RawMessage translateRaw(String textLine) {
	return translateRaw(null, null, textLine);
    }

    public RawMessage translateRaw(CommandSender sender, RawMessage rm, String textLine) {
	return translateRaw(sender, rm, textLine, false);
    }

    public RawMessage translateRaw(CommandSender sender, RawMessage rm, String textLine, boolean book) {
	
	return null;
    }

}
