package com.Zrips.CMI.Modules.Votifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;

import org.bukkit.Bukkit;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;

public class VotifierManager {

    private CMI plugin;
    private List<String> CommandsOnVote = new ArrayList<String>();
    private List<String> ExcludeList = new ArrayList<String>();
    private boolean CountVotes = true;
    private boolean PerformCommands = true;
    private int cooldown = 0;
    private int MaxVotesInADay = 0;
    private HashMap<Integer, List<String>> rewards = new HashMap<Integer, List<String>>();
    private HashMap<UUID, HashMap<String, Long>> cooldowns = new HashMap<UUID, HashMap<String, Long>>();

    public VotifierManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadConfig() {

    }

    @Deprecated
    public void processVote(CMIUser user, String service) {
	processVote(user, service, null);
    }

    public void processVote(CMIUser user, String service, String ip) {

    }

    private ConcurrentSkipListMap<Double, CMIUser> Top = new ConcurrentSkipListMap<Double, CMIUser>(Collections.reverseOrder());
    private Set<CMIUser> withVotes = new HashSet<CMIUser>();

    public void updateVoteCountList(CMIUser user) {

    }

    Long lastUpdate = 0L;
    int sched = 0;
    int updateDelay = 5;

    private void delayUpdate() {

    }

    public void updateTopList() {

    }

    boolean calculating = false;

    private void recalculate() {

    }

    public ConcurrentSkipListMap<Double, CMIUser> getTop() {
	if (lastUpdate == 0)
	    recalculate();
	return Top;
    }

    public int getMaxVotesInADay() {
	return MaxVotesInADay;
    }
}
