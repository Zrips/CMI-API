package com.Zrips.CMI.Containers;

public class CMIIpBanEntry {
    private String ip;
    private Long banedAt;
    private String Source;
    private Long bannedUntil;
    private String reason;

    public CMIIpBanEntry(String ip, Long banedAt, String bannedBy, Long bannedUntil, String reason) {
	this.ip = ip;
	this.banedAt = banedAt;
	this.Source = bannedBy;
	this.bannedUntil = bannedUntil;
	this.reason = reason;
    }

    public String getKey() {
	return ip;
    }

    public void setKey(String ip) {
	this.ip = ip;
    }

    public Long getBanedAt() {
	return banedAt;
    }

    public void setBanedAt(Long banedAt) {
	this.banedAt = banedAt;
    }

    public String getSource() {
	return Source;
    }

    public void setSource(String bannedBy) {
	this.Source = bannedBy;
    }

    public Long getExpires() {
	return bannedUntil;
    }

    public void setExpires(Long bannedUntil) {
	this.bannedUntil = bannedUntil;
    }

    public String getReason() {
	return reason;
    }

    public void setReason(String reason) {
	this.reason = reason;
    }

}
