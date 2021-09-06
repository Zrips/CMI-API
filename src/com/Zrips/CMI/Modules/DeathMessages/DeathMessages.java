package com.Zrips.CMI.Modules.DeathMessages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DeathMessages {

    private List<String> messages = new ArrayList<String>();
    private String path;

    public DeathMessages(String path, List<String> messages) {
	this.path = path;
	this.messages = messages;
    }

    public DeathMessages addMessage(String message) {
	messages.add(message);
	return this;
    }

    public String getRandom() {
	Collections.shuffle(messages);
	return messages.get(0);
    }

    public String getPath() {
	return path;
    }

    public List<String> getMessages() {
	return messages;
    }

    public void setMessages(List<String> messages) {
	this.messages = messages;
    }
}
