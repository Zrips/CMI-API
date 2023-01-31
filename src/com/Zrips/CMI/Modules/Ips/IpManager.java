package com.Zrips.CMI.Modules.Ips;

import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class IpManager {

    private CMI plugin;
    HashMap<String, Set<CMIUser>> ips = new HashMap<String, Set<CMIUser>>();
    private static final Pattern PATTERN = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    private static final Pattern ALTPATTERN = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\_){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public boolean ipIsOk(final String ip) {
        return PATTERN.matcher(ip).matches();
    }

    public boolean alternateIpIsOk(final String ip) {
        return ALTPATTERN.matcher(ip).matches();
    }

    public IpManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void addIp(HashMap<String, Integer> map, CMIUser user) {

    }

    public void addIp(String ip, CMIUser user) {

    }

    public Set<CMIUser> getUsers(String ip) {
        return ips.get(ip);
    }
}
