package com.Zrips.CMI.Containers;

public class CMIIpBanEntry {
    private String ip;
    private Long banedAt;
    private String Source;
    private Long bannedUntil;
    private String reason;

    public CMIIpBanEntry(String ip, Long banedAt, String bannedBy, Long bannedUntil, String reason) {
    }

    public String getKey() {
        return null;
    }

    public void setKey(String ip) {
    }

    public Long getBanedAt() {
        return null;
    }

    public void setBanedAt(Long banedAt) {
    }

    public String getSource() {
        return null;
    }

    public void setSource(String bannedBy) {
    }

    public Long getExpires() {
        return null;
    }

    public void setExpires(Long bannedUntil) {
    }

    public String getReason() {
        return null;
    }

    public void setReason(String reason) {
    }
}
