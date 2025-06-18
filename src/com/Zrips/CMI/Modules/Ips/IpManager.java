package com.Zrips.CMI.Modules.Ips;

import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class IpManager {
    private CMI plugin;
    HashMap<String, Set<CMIUser>> ips;
    private static final Pattern PATTERN = null;
    private static final Pattern ALTPATTERN = null;

    public boolean ipIsOk(String ip) {
        return false;
    }

    public boolean alternateIpIsOk(String ip) {
        return false;
    }

    public IpManager(CMI plugin) {
    }

    public void addIp(HashMap<String, Integer> map, CMIUser user) {
    }

    public void addIp(String ip, CMIUser user) {
    }

    public Set<CMIUser> getUsers(String ip) {
        return null;
    }

    public void clearCache() {
    }
}
