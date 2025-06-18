package com.Zrips.CMI.Modules.Jail;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CMIUserJailData;
import com.Zrips.CMI.Modules.Portals.CuboidArea;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class JailManager {
    private SortedMap<String, CMIJail> jails;
    protected Map<String, Map<ChunkRef, Set<CMIJail>>> chunkJails;
    private Set<CMIUser> onlineInjail;
    protected ConcurrentHashMap<UUID, CMIUserJailData> jailed;
    private int JailCheckInterval;
    private Integer DefaultTime;
    private Integer JailChatRange;
    private boolean CountWhileOffline;
    private boolean NoAfk;
    private boolean PreventDamage;
    private boolean noHunger;
    private List<String> cmdsOnUnJail;
    private List<String> cmdsOnJail;
    private List<String> whiteList;
    private CMI plugin;
    private CMITask sched;
    private String fileName;

    public JailManager(CMI plugin) {
    }

    public synchronized CMIUserJailData getJailData(UUID uuid) {
        return null;
    }

    public synchronized CMIUserJailData getOrCreateJailData(UUID uuid) {
        return null;
    }

    public void recheckAllOnline() {
    }

    public void stop() {
    }

    private void tasker() {
    }

    public boolean isOnlineAndInJail(CMIUser user) {
        return false;
    }

    public boolean anyJailedOnline() {
        return false;
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
        return null;
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
        return null;
    }

    public List<CMIJail> getJailsByDistance(Location loc) {
        return null;
    }

    public void removeJail(CMIJail jail) {
    }

    public int getJailsCheckInterval() {
        return 0;
    }

    private boolean isCellOk(CMIJailCell cell) {
        return false;
    }

    private boolean isJailOk(CMIJail jail) {
        return false;
    }

    public CMIJailCell getValidCell(CMIUser user) {
        return null;
    }

    public CMIJailCell getValidCell(CMIUser user, CMIJail j, Integer cellId) {
        return null;
    }

    public void removePlayerFromJail(CMIUser user) {
    }

    private void processOnUnjailCommands(CMIUser user) {
    }

    public void placePlayerIntoJail(CMIUser user) {
    }

    public boolean placePlayerIntoJail(CMIUser user, CMIJail jail, Integer cellId, Long jailedFor) {
        return false;
    }

    public void informAboutLeftTime(Player player) {
    }

    public void informAboutLeftTime(CMIUser user) {
    }

    public boolean canUseCommand(String command) {
        return false;
    }

    public Integer getDefaultTime() {
        return null;
    }

    public void setDefaultTime(int defaultTime) {
    }

    public Integer getJailChatRange() {
        return null;
    }

    public void setJailChatRange(Integer jailChatRange) {
    }

    public boolean isNoAfk() {
        return false;
    }

    public boolean isCountWhileOffline() {
        return false;
    }

    public void setCountWhileOffline(boolean countWhileOffline) {
    }

    public boolean isPreventDamage() {
        return false;
    }

    public boolean isNoHunger() {
        return false;
    }
}
