package com.Zrips.CMI.Modules.Chat;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIEventPriority;

public class ChatManager {
    private CMI plugin;
    private boolean ModifyChatFormat;
    private boolean ChatClickHoverMessages;
    private boolean ChatDiscordSRV;
    private String ChatDiscordSRVGlobalChannel;
    private String DiscordSRVLabel;
    private String DiscordSRVUnlinkedLabel;
    private boolean DiscordSRVRanged;
    private boolean ChatDynMapChat;
    private boolean ChatReplyToLastMessenger;
    private int LastMessengerTimeOut;
    private boolean PrivateMessagesGroups;
    private boolean ColorsPublicMessages;
    private CMIEventPriority ColorsPublicMessagesPriority;
    private CMIEventPriority formatPublicMessagesPriority;
    private boolean ColorsPrivateMessage;
    private boolean ChatIgnorePublicMessage;
    private boolean ColorsMe;
    private boolean ColorsNickName;
    private List<String> cleanUpWhiteList;
    private Set<CMIPlayerMessageColor> chatColors;
    private Map<UUID, CMIPlayerMessageColor> messageColorCache;
    public static String fileName;

    public void addToCache(UUID uuid, CMIPlayerMessageColor color) {
    }

    public void removeFromCache(UUID uuid) {
    }

    public CMIPlayerMessageColor getColorFromCache(UUID uuid) {
        return null;
    }

    public ChatManager(CMI plugin) {
    }

    public boolean loadConfig(boolean isReload) {
        return false;
    }

    public boolean isModifyChatFormat() {
        return false;
    }

    public boolean isChatClickHoverMessages() {
        return false;
    }

    public boolean isColorsPublicMessages() {
        return false;
    }

    public boolean isColorsPrivateMessage() {
        return false;
    }

    public boolean isChatIgnorePublicMessage() {
        return false;
    }

    public List<String> getCleanUpWhiteList() {
        return null;
    }

    public boolean isChatReplyToLastMessenger() {
        return false;
    }

    public int getLastMessengerTimeOut() {
        return 0;
    }

    public boolean isColorsMe() {
        return false;
    }

    public boolean isChatDynMapChat() {
        return false;
    }

    public boolean isPrivateMessagesGroups() {
        return false;
    }

    public boolean isChatDiscordSRV() {
        return false;
    }

    public String getChatDiscordSRVGlobalChannel() {
        return null;
    }

    public String getDiscordSRVLabel() {
        return null;
    }

    public String getDiscordSRVUnlinkedLabel() {
        return null;
    }

    public boolean isDiscordSRVRanged() {
        return false;
    }

    public boolean isColorsNickName() {
        return false;
    }

    public Set<CMIPlayerMessageColor> getChatColors() {
        return null;
    }

    public CMIEventPriority getColorsPublicMessagesPriority() {
        return null;
    }

    public CMIEventPriority getFormatPublicMessagesPriority() {
        return null;
    }
}
