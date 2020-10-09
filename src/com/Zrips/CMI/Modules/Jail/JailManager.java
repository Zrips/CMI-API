package com.Zrips.CMI.Modules.Jail;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Portals.CuboidArea;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class JailManager {

    private SortedMap<String, CMIJail> jails;
    protected Map<String, Map<ChunkRef, Set<CMIJail>>> chunkJails;

    private Set<CMIUser> onlineInjail = new HashSet<CMIUser>();

    private int JailCheckInterval = 500;
    private Integer DefaultTime = 500;
    private Integer JailChatRange = 20;
    private boolean CountWhileOffline = false;
    private boolean NoAfk = false;
    private boolean PreventDamage = true;
    private List<String> whiteList;
    private CMI plugin;

    public JailManager(CMI plugin) {
    }

    private int sched = -1;

    public void recheckAllOnline() {

    }

    public void stop() {
    }

    private void tasker() {

    }

    public boolean anyJailedOnline() {
	return !onlineInjail.isEmpty();
    }

    public void removeOnline(CMIUser user) {
    }

    public void addOnline(CMIUser user) {
    }

    public void addJail(CMIJail jail) {
    }

    public void recalculateChunks() {
    }

    public void recalculateChunks(CMIJail jail) {

    }

    public CMIJail getByName(String name) {
	return null;
    }

    public CMIJail getByLoc(Location loc) {

	return null;
    }

    public CMIJail collidesWithJail(CuboidArea newarea) {
	return collidesWithJail(newarea, null);
    }

    public CMIJail collidesWithJail(CuboidArea newarea, CMIJail ignore) {
	return null;
    }

    private static List<ChunkRef> getChunks(CMIJail jail) {
	return null;
    }

    private static List<ChunkRef> getChunks(CMIJail jail, int range) {
	return null;
    }

    public void loadConfig() {

    }

    public void load() {
    }

    public void loadMap(Map<String, Object> root) throws Exception {
    }

    public void save() {

    }

    public SortedMap<String, CMIJail> getJails() {
	return jails;
    }

    public List<CMIJail> getJailsByDistance(Location loc) {

	return null;
    }

    public void removeJail(CMIJail jail) {
    }

    public int getJailsCheckInterval() {
	return JailCheckInterval;
    }

    private boolean isCellOk(CMIJailCell cell) {
	return true;
    }

    private boolean isJailOk(CMIJail jail) {
	return true;
    }

    public CMIJailCell getValidCell(CMIUser user) {
	return getValidCell(user, null, null);
    }

    public CMIJailCell getValidCell(CMIUser user, CMIJail j, Integer cellId) {

	return null;
    }

    public void removePlayerFromJail(CMIUser user) {

    }

    public void placePlayerIntoJail(CMIUser user) {
	placePlayerIntoJail(user, null, null, user.getJailedForTime());
    }

    public boolean placePlayerIntoJail(CMIUser user, CMIJail jail, Integer cellId, Long jailedFor) {

	return true;
    }

    public void informAboutLeftTime(Player player) {
	informAboutLeftTime(plugin.getPlayerManager().getUser(player));
    }

    public void informAboutLeftTime(CMIUser user) {
    }

    public boolean canUseCommand(String command) {
	return false;
    }

    public Integer getDefaultTime() {
	return DefaultTime;
    }

    public void setDefaultTime(int defaultTime) {
	DefaultTime = defaultTime;
    }

    public Integer getJailChatRange() {
	return JailChatRange;
    }

    public void setJailChatRange(Integer jailChatRange) {
	JailChatRange = jailChatRange;
    }

    public boolean isNoAfk() {
	return NoAfk;
    }

    public boolean isCountWhileOffline() {
	return CountWhileOffline;
    }

    public void setCountWhileOffline(boolean countWhileOffline) {
	CountWhileOffline = countWhileOffline;
    }

    public boolean isPreventDamage() {
	return PreventDamage;
    }
}
