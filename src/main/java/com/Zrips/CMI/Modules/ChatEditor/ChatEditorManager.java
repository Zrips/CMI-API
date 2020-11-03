package com.Zrips.CMI.Modules.ChatEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class ChatEditorManager {
    static HashMap<UUID, ChatMessageEdit> map = new HashMap<UUID, ChatMessageEdit>();

    public static void add(ChatMessageEdit rmc) {
	map.put(rmc.getUuid(), rmc);
    }

    public static void delete(ChatMessageEdit rmc) {
	map.remove(rmc.getUuid());
    }

    public static boolean perform(CommandSender sender, String message) {

	return true;
    }

    public static void remove(UUID uuid) {
	ChatMessageEdit rmc = map.remove(uuid);
	if (rmc != null)
	    rmc.onDisable();
    }

}
