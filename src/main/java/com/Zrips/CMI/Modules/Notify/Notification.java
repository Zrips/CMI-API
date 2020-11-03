package com.Zrips.CMI.Modules.Notify;

import java.util.ArrayList;
import java.util.List;

public class Notification {

    private String notifyier;
    private List<String> mesages = new ArrayList<String>();

    public Notification(String notifyier) {
	this.notifyier = notifyier;
    }

    public String getNotifyier() {
	return notifyier;
    }

    public void setNotifyier(String notifyier) {
	this.notifyier = notifyier;
    }

    public List<String> getMesages() {
	return mesages;
    }

    public void setMesages(List<String> mesages) {
	this.mesages = mesages;
    }

    public void addMesage(String mesage) {
	this.mesages.add(mesage);
    }

}
