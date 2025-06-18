package com.Zrips.CMI.Modules.CmdCooldown;

import java.util.HashMap;

public class CmdCooldown {
    HashMap<String, CMICooldown> list;

    public void addCooldown2(String cmd, Long time, Long timePeriod) {
    }

    public void addCooldown(String cmd, int cooldownSeconds) {
    }

    public void addCooldown(String cmd, Long startedAt, int cooldownSeconds) {
    }

    public void addCooldown(String cmd, Long startedAt, double cooldownSeconds) {
    }

    public void removeCooldown(String cmd) {
    }

    public HashMap<String, CMICooldown> getList() {
        return null;
    }

    public void clear() {
    }

    public class CMICooldown {
        private long initialized;
        private int cooldownSeconds;

        public CMICooldown(Long time, int cooldownSeconds) {
        }

        public CMICooldown(Long time, double cooldownSeconds) {
        }

        public Long getInitialized() {
            return null;
        }

        public Long getEndTime() {
            return null;
        }

        public Long getDelta() {
            return null;
        }

        public void setInitialized(Long initialized) {
        }

        public int getTimePeriod() {
            return 0;
        }

        public void setTimePeriod(int cooldownSeconds) {
        }
    }
}
