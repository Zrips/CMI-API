package com.Zrips.CMI.Modules.CustomText;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class CTextManager {
    private LinkedHashMap<String, CText> map;
    private HashMap<UUID, String> chatMap;
    private CMI plugin;
    private ChatFilterRule pageLabelRegex;
    public static final String directoryName = null;

    public CTextManager(CMI plugin) {
    }

    public HashMap<String, CText> getAll() {
        return null;
    }

    public void deleteCText(String name) {
    }

    public CText getCText(String name) {
        return null;
    }

    public boolean isChatEditing(Player player) {
        return false;
    }

    public void addChatEditor(Player player, String cmd) {
    }

    public void removeChatEditor(Player player) {
    }

    public String getChatEditorCmd(Player player) {
        return null;
    }

    public CText addNewCText(String name) {
        return null;
    }

    public void load() {
    }

    private void loadDirectory(File directory) {
    }

    public CText getCTextFromFile(File file) {
        return null;
    }

    private void createDirectories(String path) {
    }

    public void save(CText cText) {
    }

    public void delete(CText cText) {
    }

    public void removeCTextLine(CText cText, Integer pageNumber, Integer line) {
    }

    public List<String> move(List<String> list, int place, int direction) {
        return null;
    }

    public void showCTextEditor(CommandSender sender, CText cText, Integer pageNumber) {
    }

    public void showCText(CommandSender sender, CText cText, Integer page) {
    }

    public void showCText(CommandSender sender, CMIUser source, CText cText, Integer page) {
    }

    public void showCText(Set<Player> senders, CMIUser source, CText cText, Integer pageNumber) {
    }

    public static String clean(String text) {
        return null;
    }
}
