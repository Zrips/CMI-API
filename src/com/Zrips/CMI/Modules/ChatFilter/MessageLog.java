package com.Zrips.CMI.Modules.ChatFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MessageLog {

    private HashMap<Long, String> messages = new HashMap<Long, String>();
    private int range = 5;

    public MessageLog(int range) {
	this.range = range;
    }

    public void addMessage(String message) {
	messages.put(System.currentTimeMillis(), message);
    }

    private void removeOld() {
	List<Long> list = new ArrayList<Long>();

	for (Entry<Long, String> one : messages.entrySet()) {
	    if (one.getKey() + (range * 1000) < System.currentTimeMillis())
		list.add(one.getKey());
	}
	for (Long one : list) {
	    messages.remove(one);
	}
    }

    public HashMap<Long, String> getMessages() {
	removeOld();
	return messages;
    }

}
