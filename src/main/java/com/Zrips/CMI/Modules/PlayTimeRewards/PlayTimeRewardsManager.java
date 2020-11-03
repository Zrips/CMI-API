package com.Zrips.CMI.Modules.PlayTimeRewards;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class PlayTimeRewardsManager {

    private CMI plugin;

    private HashMap<String, PTRRepeat> repeatableRewards = new HashMap<String, PTRRepeat>();
    private TreeMap<Long, PTROneTime> oneTimeRewards = new TreeMap<Long, PTROneTime>();
    private TreeMap<String, PTROneTime> oneTimeRewardsByName = new TreeMap<String, PTROneTime>();

    public PlayTimeRewardsManager(CMI plugin) {
	this.plugin = plugin;
    }

    private int sched = -1;

    private int interval = 60;
    private int OneTimeAmount = 1;
    private Long RewardInform = 1000L;
    private boolean Enabled = false;
    private boolean ExcludeAfk = false;
    public static boolean RequiresPermission = false;

    public void stop() {
	if (sched == -1)
	    return;
	Bukkit.getScheduler().cancelTask(sched);
	sched = -1;
    }

    public void loadConfig() {

	ConfigReader cfg = plugin.getConfigManager().getConfig();
	cfg.addComment("PlaytimeRewards.Enabled", "Enable or disable playtime rewards.", "This is required if you want to have auto rewards");
	Enabled = cfg.get("PlaytimeRewards.Enabled", false);

	cfg.addComment("PlaytimeRewards.ExcludeAfk", "When enabled, while player is in afk mode, repeatable playtime rewards will not increase in playtime",
	    "ATENTION! this setting will not have any effect if you have Afk.StopPlayTime set to true", "When StopPlayTime set to true, afk will be expluded automatically");
	ExcludeAfk = cfg.get("PlaytimeRewards.ExcludeAfk", false);
	cfg.addComment("PlaytimeRewards.RewardInform", "Defines time in minutes to inform player about pending reward which needs to be claimed");
	RewardInform = cfg.get("PlaytimeRewards.RewardInform", 15) * 60 * 1000L;
	cfg.addComment("PlaytimeRewards.OneTimeAmount", "Defines how many one time rewards you want to show in list",
	    "This will show next X amount rewards from your current playtime",
	    "No point in listing all rewards if player is still far away");
	OneTimeAmount = cfg.get("PlaytimeRewards.OneTimeAmount", 2);

	cfg.addComment("PlaytimeRewards.RequiresPermission", "When set to true player will be required to have cmi.prewards.[name] permission node to get particular playtime reward");
	RequiresPermission = cfg.get("PlaytimeRewards.RequiresPermission", false);

	if (plugin.isEnabled() && Enabled)
	    tasker();
	else
	    stop();
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
	if (sched != -1)
	    return;
	sched = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
	    @Override
	    public void run() {
		Bukkit.getScheduler().runTaskAsynchronously(plugin, new Runnable() {
		    @Override
		    public void run() {
//			CMI.getInstance().d("Checking rewards");

//			Long took = System.nanoTime(); 
			for (final Player one : Bukkit.getOnlinePlayers()) {
			    CMIUser user = plugin.getPlayerManager().getUser(one);
			    HashMap<PTRRepeat, Long> repeatable = user.getRepeatableRewards();
			    long totalPlayTime = user.getTotalPlayTime(false);

			    long afkDif = 0L;

			    if (isExcludeAfk() && user.isAfk() && !plugin.getAfkManager().isStopPlayTime()) {
				Long afkLastAction = plugin.getAfkManager().getLastAction(user);
				if (afkLastAction != null) {
				    Long prewardsLastAction = lastAction.get(user);
				    if (prewardsLastAction != null) {
					afkDif = System.currentTimeMillis() - prewardsLastAction;
				    } else {
					afkDif = System.currentTimeMillis() - afkLastAction;
				    }
				    lastAction.put(user, System.currentTimeMillis());
				} else if (user.isAfk()) {
				    plugin.getAfkManager().updateUser(user);
				}
			    }

			    for (Entry<String, PTRRepeat> oneR : repeatableRewards.entrySet()) {
				final PTRRepeat reward = oneR.getValue();
				Long givenAt = repeatable.get(reward);

				if (isExcludeAfk() && user.isAfk() && !plugin.getAfkManager().isStopPlayTime()) {
				    givenAt = givenAt + afkDif;
				    if (givenAt > System.currentTimeMillis())
					givenAt = System.currentTimeMillis();
				    repeatable.put(reward, givenAt);
				    continue;
				}

				if (givenAt == null) {
				    repeatable.put(reward, totalPlayTime);
				    continue;
				}
//				plugin.d(totalPlayTime, reward.getPayEvery(), givenAt);

				long dif = totalPlayTime - givenAt;

				int times = (int) (dif / reward.getPayEvery().doubleValue());

				if (times < 1)
				    continue;

				if (reward.isAutoClaim()) {
				    if (one != null && one.isOnline()) {
//					CMI.getInstance().d("getting reward");
					long add = reward.getPayEvery() * times;
					add = givenAt + add > totalPlayTime ? totalPlayTime : givenAt + add;
					repeatable.put(reward, add);
					plugin.getDbManager().addForPlayTimeRewardSave(user);

					if (!PlayTimeRewardsManager.RequiresPermission || CMIPerm.prewards_$1.hasPermission(one, reward.getName().toLowerCase()))

					    Bukkit.getScheduler().runTask(plugin, new Runnable() {
						@Override
						public void run() {
						    if (one.isOnline())
							reward.performCommands(one);
						}
					    });
				    }
				} else {
				    if (one != null && one.isOnline())
					informPlayer(one, reward.getName());
				}
			    }

			    Set<PTROneTime> oneTime = user.getOneTimeRewards();

			    for (Entry<Long, PTROneTime> oneR : oneTimeRewards.entrySet()) {
				if (oneTime.contains(oneR.getValue()))
				    continue;

				if (oneR.getKey() > totalPlayTime)
				    break;

				final PTROneTime reward = oneR.getValue();

				if (reward.isAutoClaim()) {
				    if (one != null && one.isOnline()) {

					if (!PlayTimeRewardsManager.RequiresPermission || CMIPerm.prewards_$1.hasPermission(one, reward.getName().toLowerCase())) {
					    Bukkit.getScheduler().runTask(plugin, new Runnable() {
						@Override
						public void run() {
						    if (one.isOnline()) {
							reward.performCommands(one);
						    }
						}
					    });
					    oneTime.add(reward);
					    plugin.getDbManager().addForPlayTimeRewardSave(user);
					}
				    }
				} else {
				    informPlayer(one, oneR.getValue().getName());
				}

			    }

			}
		    }
		});

	    }
	}, 0L, interval * 20L);
    }

    HashMap<UUID, Long> informMap = new HashMap<UUID, Long>();

    public void informPlayer(Player player, String rewardName) {
	Long old = informMap.get(player.getUniqueId());
	if ((old == null || old < System.currentTimeMillis()) && CMIPerm.prewards_notification.hasPermission(player)) {
	    if (!PlayTimeRewardsManager.RequiresPermission || CMIPerm.prewards_$1.hasPermission(player, rewardName.toLowerCase()))
		plugin.info("prewards", player, "inform");
	    old = old == null ? System.currentTimeMillis() + (60 * 1000) : old + RewardInform;
	    informMap.put(player.getUniqueId(), old);
	}
    }

    public void load() {
	Long time = System.currentTimeMillis();

	HashMap<String, PTRRepeat> oldRepetable = new HashMap<String, PTRRepeat>(repeatableRewards);
	HashMap<String, PTROneTime> oldOneTime = new HashMap<String, PTROneTime>(oneTimeRewardsByName);

	repeatableRewards.clear();
	oneTimeRewards.clear();
	oneTimeRewardsByName.clear();

	File file = new File(plugin.getDataFolder(), "PlayTimeRewards.yml");

	if (!file.exists()) {
	    try {
		file.createNewFile();
	    } catch (IOException e) {
	    }
	    return;
	}

	YamlConfiguration k = null;
	try {
	    k = YamlConfiguration.loadConfiguration(file);
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	if (k.getKeys(false).isEmpty())
	    return;

	Set<String> keys = k.getKeys(false);
	boolean auto = false;
	for (String key : keys) {

	    try {
		String name = key;

		String displayName = k.getString(key + ".DisplayName");
		boolean autoClaim = false;
		if (k.isBoolean(key + ".AutoClaim"))
		    autoClaim = k.getBoolean(key + ".AutoClaim");
		List<String> description = k.getStringList(key + ".Description");
		List<String> commands = k.getStringList(key + ".Commands");

		Boolean repeatable = true;
		Long timeRange = null;
		Boolean stackRewards = true;

		if (k.isInt(key + ".PayEvery")) {
		    repeatable = true;
		    timeRange = (long) k.getInt(key + ".PayEvery");
		} else if (k.isInt(key + ".PayFor")) {
		    repeatable = false;
		    timeRange = (long) k.getInt(key + ".PayFor");
		} else if (k.isLong(key + ".PayEvery")) {
		    repeatable = true;
		    timeRange = k.getLong(key + ".PayEvery");
		} else if (k.isLong(key + ".PayFor")) {
		    repeatable = false;
		    timeRange = k.getLong(key + ".PayFor");
		}
		if (k.isBoolean(key + ".StackRewards")) {
		    stackRewards = k.getBoolean(key + ".StackRewards");
		}

		if (autoClaim)
		    auto = true;

		if (repeatable) {
		    PTRRepeat ptr = new PTRRepeat(name);

		    if (oldRepetable.containsKey(name))
			ptr = oldRepetable.get(name);
		    ptr.setAutoClaim(autoClaim);
		    ptr.setCommands(commands);
		    ptr.setDescription(description);
		    ptr.setDisplayName(displayName);
		    ptr.setPayEvery(timeRange);
		    ptr.setStackRewards(stackRewards);
		    repeatableRewards.put(key.toLowerCase(), ptr);
		} else {
		    PTROneTime ptr = new PTROneTime(name);

		    if (oldOneTime.containsKey(name))
			ptr = oldOneTime.get(name);

		    ptr.setAutoClaim(autoClaim);
		    ptr.setCommands(commands);
		    ptr.setDescription(description);
		    ptr.setDisplayName(displayName);
		    ptr.setPayFor(timeRange);
		    oneTimeRewards.put(ptr.getPayFor(), ptr);
		    oneTimeRewardsByName.put(ptr.getName().toLowerCase(), ptr);
		}
	    } catch (Exception e) {
		plugin.consoleMessage("&cCould not load play time reward (&4" + key + "&c) Double check spelling");
	    }
	}

//	if (auto && !Enabled) {
//	    plugin.consoleMessage("&5We detected that you have playtime reward set to autoclaim mode but PlaytimeRewards->Enabled is disabled in your config file.");
//	    plugin.consoleMessage("&5This will prevent players from receiving rewards automatically.");
//	}

	plugin.loadMessage((repeatableRewards.size() + oneTimeRewards.size()), "playtime rewards", System.currentTimeMillis() - time);
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
}
