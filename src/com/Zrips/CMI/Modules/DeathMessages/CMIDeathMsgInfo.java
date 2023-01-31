package com.Zrips.CMI.Modules.DeathMessages;

import java.util.UUID;

class CMIDeathMsgInfo {

    private UUID uuid = null;
    
    private CMIKillerInfo killerInfo;
    private CMIKillerInfo PreviousDamageInfo;
    private String prefixPath = null;
    private String suffixPath = null;

    private String basePath = null;
    
    private String message = null;

    public CMIDeathMsgInfo(UUID uuid, CMIKillerInfo killerInfo) {
	this.uuid = uuid;
	this.killerInfo = killerInfo;
    }

    public CMIKillerInfo getKillerInfo() {
	return killerInfo;
    }

    public void setKillerInfo(CMIKillerInfo killerInfo) {
	this.killerInfo = killerInfo;
    }

    public String getPrefixPath() {
	return prefixPath;
    }

    public void setPrefixPath(String prefixPath) {
	this.prefixPath = prefixPath;
    }

    public String getSuffixPath() {
	return suffixPath;
    }

    public void setSuffixPath(String suffixPath) {
	this.suffixPath = suffixPath;
    }

    public CMIKillerInfo getPreviousDamageInfo() {
	return PreviousDamageInfo;
    }

    public void setPreviousDamageInfo(CMIKillerInfo previousDamageInfo) {
	PreviousDamageInfo = previousDamageInfo;
    }

    public String getBasePath() {
	return basePath;
    }

    public void setBasePath(String basePath) {
	this.basePath = basePath;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public UUID getUniqueId() {
	return uuid;
    }

}
