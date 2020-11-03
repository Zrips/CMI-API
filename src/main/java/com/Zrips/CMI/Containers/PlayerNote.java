package com.Zrips.CMI.Containers;

public class PlayerNote {

    private String sender;
    private Long time;
    private String note;
    
    public PlayerNote(String sender, Long time, String note) {
	this.sender = sender;
	this.time = time;
	this.note = note;
    }

    public String getSender() {
	return sender;
    }

    public void setSender(String sender) {
	this.sender = sender;
    }

    public Long getTime() {
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
    }

    public String getNote() {
	return note;
    }

    public void setNote(String note) {
	this.note = note;
    }

}
