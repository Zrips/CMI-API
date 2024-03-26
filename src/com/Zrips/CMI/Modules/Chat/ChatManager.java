package com.Zrips.CMI.Modules.Chat;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.Zrips.CMI.CMI;

public class ChatManager {

    private CMI plugin;

    private boolean ModifyChatFormat = false;
    private boolean ChatClickHoverMessages = false;
    private boolean ChatDiscordSRV = false;
    private String ChatDiscordSRVGlobalChannel = "global";
    private String DiscordSRVLabel = "";
    private String DiscordSRVUnlinkedLabel = "";
    private boolean DiscordSRVRanged = true;
    private boolean ChatDynMapChat = false;
    private boolean ChatReplyToLastMessenger = false;
    private int LastMessengerTimeOut = 120;
    private boolean PrivateMessagesGroups = false;
    private boolean ColorsPublicMessages = false;
    private boolean ColorsPrivateMessage = false;
    private boolean ChatIgnorePublicMessage = false;
    private boolean ColorsMe = false;

    private boolean ColorsNickName;

    private List<String> cleanUpWhiteList;

    private Set<CMIPlayerMessageColor> chatColors = new LinkedHashSet<CMIPlayerMessageColor>();

    private Map<UUID, CMIPlayerMessageColor> messageColorCache = Collections.synchronizedMap(new HashMap<UUID, CMIPlayerMessageColor>());

    public void addToCache(UUID uuid, CMIPlayerMessageColor color) {
        synchronized (messageColorCache) {
            messageColorCache.put(uuid, color);
        }
    }

    public void removeFromCache(UUID uuid) {
        synchronized (messageColorCache) {
            messageColorCache.remove(uuid);
        }
    }

    public CMIPlayerMessageColor getColorFromCache(UUID uuid) {
        synchronized (messageColorCache) {
            return messageColorCache.get(uuid);
        }
    }

    public ChatManager(CMI plugin) {
        this.plugin = plugin;
    }

    public static String fileName = "Chat.yml";

    public boolean loadConfig(boolean isReload) {
      
        return true;
    }

    public boolean isModifyChatFormat() {
        return ModifyChatFormat;
    }

    public boolean isChatClickHoverMessages() {
        return ChatClickHoverMessages;
    }

    public boolean isColorsPublicMessages() {
        return ColorsPublicMessages;
    }

    public boolean isColorsPrivateMessage() {
        return ColorsPrivateMessage;
    }

    public boolean isChatIgnorePublicMessage() {
        return ChatIgnorePublicMessage;
    }

    public List<String> getCleanUpWhiteList() {
        return cleanUpWhiteList;
    }

    public boolean isChatReplyToLastMessenger() {
        return ChatReplyToLastMessenger;
    }

    public int getLastMessengerTimeOut() {
        return LastMessengerTimeOut;
    }

    public boolean isColorsMe() {
        return ColorsMe;
    }

    public boolean isChatDynMapChat() {
        return ChatDynMapChat;
    }

    public boolean isPrivateMessagesGroups() {
        return PrivateMessagesGroups;
    }

    public boolean isChatDiscordSRV() {
        return ChatDiscordSRV;
    }

    public String getChatDiscordSRVGlobalChannel() {
        return ChatDiscordSRVGlobalChannel;
    }

    public String getDiscordSRVLabel() {
        return DiscordSRVLabel;
    }

    public String getDiscordSRVUnlinkedLabel() {
        return DiscordSRVUnlinkedLabel;
    }

    public boolean isDiscordSRVRanged() {
        return DiscordSRVRanged;
    }

    public boolean isColorsNickName() {
        return ColorsNickName;
    }

    public Set<CMIPlayerMessageColor> getChatColors() {
        return chatColors;
    }
}
