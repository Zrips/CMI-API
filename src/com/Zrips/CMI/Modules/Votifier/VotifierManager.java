package com.Zrips.CMI.Modules.Votifier;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class VotifierManager {
    private CMI plugin;
    private List<String> CommandsOnVote;
    private List<String> ExcludeList;
    private boolean CountVotes;
    private boolean PerformCommands;
    private int cooldown;
    private int MaxVotesInADay;
    private HashMap<Integer, List<String>> rewards;
    private HashMap<UUID, HashMap<String, Long>> cooldowns;
    private HashMap<UUID, voteReminder> voteReminder;
    private ConcurrentSkipListMap<Double, CMIUser> Top;
    private Set<CMIUser> withVotes;
    Long lastUpdate;
    CMITask sched;
    int updateDelay;
    boolean calculating;

    public void removeVoteReminder(UUID uuid) {
    }

    public void addToVoteReminder(UUID uuid) {
    }

    public VotifierManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    @Deprecated
    public void processVote(CMIUser user, String service) {
    }

    public void processVote(CMIUser user, String service, String ip) {
    }

    public void updateVoteCountList(CMIUser user) {
    }

    private void delayUpdate() {
    }

    public void updateTopList() {
    }

    private void recalculate() {
    }

    public ConcurrentSkipListMap<Double, CMIUser> getTop() {
        return null;
    }

    public int getMaxVotesInADay() {
        return 0;
    }

    private class voteReminder {
        private int times;
        private long last;

        public voteReminder() {
        }

        public void recordNotified() {
        }

        public int getTimes() {
            return 0;
        }

        public long getLast() {
            return 0;
        }
    }
}
