package com.Zrips.CMI.Containers;

import java.util.HashMap;

public class CMIMessageReplies {
    private static HashMap<String, CMIReplyResponder> replyMapBySender;
    private static HashMap<String, CMIReplyResponder> replyMapByReceiver;

    public static String getMessageReplyTo(String sender) {
        return null;
    }

    public static void removeMessageReplyTo(String sender) {
    }

    public static void addMessageReplyTo(String target, String sender) {
    }

    public static void addMessageReplyToBySender(String target, String sender) {
    }
}
