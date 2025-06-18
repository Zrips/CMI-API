package com.Zrips.CMI.Modules.PlayTimeRewards;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PlayTimeRewardsManager {
    private CMI plugin;
    private HashMap<String, PTRRepeat> repeatableRewards;
    private TreeMap<Long, PTROneTime> oneTimeRewards;
    private TreeMap<String, PTROneTime> oneTimeRewardsByName;
    private CMITask sched;
    private int interval;
    private int OneTimeAmount;
    private Long RewardInform;
    private boolean Enabled;
    private boolean ExcludeAfk;
    public static boolean RequiresPermission;
    private HashMap<CMIUser, Long> lastAction;
    HashMap<UUID, Long> informMap;
    private String fileName;
    ConcurrentHashMap<UUID, PlaytimeClaimCache> cache;

    public PlayTimeRewardsManager(CMI plugin) {
    }

    public void stop() {
    }

    public void loadConfig() {
    }

    public void removeFromAfkAction(CMIUser user) {
    }

    public void updateAfkAction(CMIUser user) {
    }

    public Long getAfkAction(CMIUser user) {
        return null;
    }

    private void tasker() {
    }

    public void informPlayer(Player player, String rewardName) {
    }

    public void load() {
    }

    public void clearCache(UUID uuid) {
    }

    public int getClaimableRewardCount(CMIUser user) {
        return 0;
    }

    public HashMap<String, PTRRepeat> getRepeatableRewards() {
        return null;
    }

    public void setRepeatableRewards(HashMap<String, PTRRepeat> repeatableRewards) {
    }

    public TreeMap<Long, PTROneTime> getOneTimeRewards() {
        return null;
    }

    public void setOneTimeRewards(TreeMap<Long, PTROneTime> oneTimeRewards) {
    }

    public PTROneTime getOneTimeRewardByName(String name) {
        return null;
    }

    public PTRRepeat getRepeatingRewardByName(String name) {
        return null;
    }

    public int getOneTimeAmount() {
        return 0;
    }

    public void setOneTimeAmount(int oneTimeAmount) {
    }

    public boolean isExcludeAfk() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }
}
