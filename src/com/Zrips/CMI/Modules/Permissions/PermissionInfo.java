package com.Zrips.CMI.Modules.Permissions;

import java.util.Set;

public class PermissionInfo {
    private String permission;
    private boolean enabled;
    private Long delay;
    private Long lastChecked;
    private Double maxValue;
    private Double minValue;
    private Set<String> values;

    public PermissionInfo(String permission, Long delay) {
    }

    public boolean isTimeToRecalculate() {
        return false;
    }

    public String getPermission() {
        return null;
    }

    public void setPermission(String permission) {
    }

    public Long getDelay() {
        return null;
    }

    public void setDelay(long delay) {
    }

    public Long getLastChecked() {
        return null;
    }

    public void setLastChecked(long lastChecked) {
    }

    public Double getMaxValue() {
        return null;
    }

    public Double getMaxValue(double defaultV) {
        return null;
    }

    public int getMaxValue(int defaultV) {
        return 0;
    }

    public void setMaxValue(Double maxValue) {
    }

    public Double getMinValue() {
        return null;
    }

    public Double getMinValue(double defaultV) {
        return null;
    }

    public int getMinValue(int defaultV) {
        return 0;
    }

    public void setMinValue(Double minValue) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public Set<String> getValues() {
        return null;
    }

    public void addValue(String value) {
    }
}
