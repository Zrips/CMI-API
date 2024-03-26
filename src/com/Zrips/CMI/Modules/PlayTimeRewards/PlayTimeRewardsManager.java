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

    private HashMap<String, PTRRepeat> repeatableRewards = new HashMap<String, PTRRepeat>();
    private TreeMap<Long, PTROneTime> oneTimeRewards = new TreeMap<Long, PTROneTime>();
    private TreeMap<String, PTROneTime> oneTimeRewardsByName = new TreeMap<String, PTROneTime>();

    public PlayTimeRewardsManager(CMI plugin) {
        this.plugin = plugin;
    }

    private CMITask sched = null;

    private int interval = 1;
    private int OneTimeAmount = 1;
    private Long RewardInform = 1000L;
    private boolean Enabled = false;
    private boolean ExcludeAfk = false;
    public static boolean RequiresPermission = false;

    public void stop() {
        if (sched == null)
            return;
        sched.cancel();
        sched = null;
    }

    public void loadConfig() {

    }

    private HashMap<CMIUser, Long> lastAction = new HashMap<CMIUser, Long>();

    public void removeFromAfkAction(CMIUser user) {
        lastAction.remove(user);
    }

    public void updateAfkAction(CMIUser user) {
        lastAction.put(user, System.currentTimeMillis());
    }

    public Long getAfkAction(CMIUser user) {
        return lastAction.get(user);
    }

    private void tasker() {

    }

    HashMap<UUID, Long> informMap = new HashMap<UUID, Long>();

    public void informPlayer(Player player, String rewardName) {

    }

    private String fileName = "PlayTimeRewards.yml";

    public void load() {

    }

    ConcurrentHashMap<UUID, PlaytimeClaimCache> cache = new ConcurrentHashMap<UUID, PlaytimeClaimCache>();

    public void clearCache(UUID uuid) {
        cache.remove(uuid);
    }

    public int getClaimableRewardCount(CMIUser user) {

        return 0;
    }

    public HashMap<String, PTRRepeat> getRepeatableRewards() {
        return repeatableRewards;
    }

    public void setRepeatableRewards(HashMap<String, PTRRepeat> repeatableRewards) {
        this.repeatableRewards = repeatableRewards;
    }

    public TreeMap<Long, PTROneTime> getOneTimeRewards() {
        return oneTimeRewards;
    }

    public void setOneTimeRewards(TreeMap<Long, PTROneTime> oneTimeRewards) {
        this.oneTimeRewards = oneTimeRewards;
    }

    public PTROneTime getOneTimeRewardByName(String name) {
        return oneTimeRewardsByName.get(name.toLowerCase());
    }

    public PTRRepeat getRepeatingRewardByName(String name) {
        return repeatableRewards.get(name.toLowerCase());
    }

    public int getOneTimeAmount() {
        return OneTimeAmount;
    }

    public void setOneTimeAmount(int oneTimeAmount) {
        OneTimeAmount = oneTimeAmount;
    }

    public boolean isExcludeAfk() {
        return ExcludeAfk;
    }

    public boolean isEnabled() {
        return Enabled;
    }
}
