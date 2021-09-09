package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Packets.FakeInfo;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIHologram {

    private String name = null;
    private int schedId = -1;
    private int pageSchedId = -1;
    private int lineOfSightSchedId = -1;

    private boolean enabled = true;
    private boolean saveToFile = false;

    private boolean sticky = false;
//    private boolean checkLOS = false;

    private CuboidArea area;
    private CuboidArea areaExtra;

//    private String[] lines = new String[0];
    private List<String> commands = new ArrayList<String>();

    private double LOSupdateIntervalSec = 0;
    private double followPlayer = 1;

    private double updateIntervalSec = HologramManager.defaultUpdateInterval;
    private double pageChangeIntervalSec = HologramManager.defaultpageChangeInterval;
//    private Long lastUpdate = 0L;

    private int updateRange = HologramManager.defaultUpdateRange;
    private int showRange = HologramManager.defaultViewRange;
    private Double spacing = 0.25;
    private Double iconSpacing = 0.5D;

    private boolean downOrder = HologramManager.defaultsPlaceUp;

    private CMILocation loc;

    private boolean interactable = false;
    private boolean bigButton = true;
    private boolean showParticle = true;
    private boolean requestPermission = false;

    private static String left = "!leftclick!";
    private static String right = "!rightclick!";
    private static String shiftLeft = "!shiftleftclick!";
    private static String shiftRight = "!shiftrightclick!";

    static Pattern pagePatern = Pattern.compile("(?i)(!nextpage!)");

    private List<String> lines = new ArrayList<String>();
    private List<String> oldLines = new ArrayList<String>();
    private boolean changedLines = false;
    private ConcurrentHashMap<UUID, Integer> inPage = new ConcurrentHashMap<UUID, Integer>();
    private ConcurrentHashMap<Integer, CMIHologramPage> pages = new ConcurrentHashMap<Integer, CMIHologramPage>();
    private ConcurrentHashMap<Integer, CMIHologramPage> oldPages = new ConcurrentHashMap<Integer, CMIHologramPage>();

    private Set<UUID> lastHoloInRange = Collections.synchronizedSet(new HashSet<UUID>());
    private Set<UUID> lastHoloInRangeExtra = Collections.synchronizedSet(new HashSet<UUID>());

    private boolean uSync = true;

    @Deprecated
    public CMIHologram(String name, Location loc) {
	this.name = name;
	this.loc = new CMILocation(loc);
	updatePages();
    }

    public CMIHologram(String name, CMILocation loc) {
	this.name = name;
	this.loc = loc;
	updatePages();
    }
    
    public void onInteraction(Player player, CMIInteractType type) {
    }
    
    public List<String> getCommands() {
	return commands;
    }

    public List<String> getCommands(Player player) {
	return getCommands(player, null);
    }

    public void goToNextPage(UUID uuid) {
	
    }

    Set<UUID> skipPageChange = new HashSet<UUID>();

    private void goToNextPageAuto(UUID uuid) {
	
    }

    public Integer getPlayerPage(UUID uuid) {
	Integer page = inPage.get(uuid);
	return page == null ? 1 : page;
    }

    public void goToPrevPage(UUID uuid) {
	
    }

    public void goToPage(UUID uuid, int page) {
	
    }

    private void checkPageChange(UUID uuid, Integer oldPage, Integer newPage) {
	
    }

    private List<String> getCommandsByPlayerPage(UUID uuid) {
	return null;
    }

    private List<CMIHologramLine> getLinesByPlayerPage(Player player) {
	return null;
    }

    public void updatePages() {
	
    }

    public List<String> getCommands(Player player, CMIInteractType type) {
	
	return null;
    }

    public void setCommands(List<String> commands) {
	if (this.commands == null)
	    this.commands = new ArrayList<String>();
	this.commands.addAll(commands);
    }

    public World getWorld() {
	return loc.getWorld();
    }

    @Deprecated
    public Location getLoc() {
	return loc;
    }

    public CMILocation getLocation() {
	return loc;
    }

    public void setLoc(Location loc) {
    }

    public List<String> getLines() {
	return lines;
    }

    public String getLine(int place) {
	return lines.size() - 1 < place || place < 0 ? "" : lines.get(place) == null ? "" : lines.get(place);
    }

    public void setLines(List<String> l) {
	
    }

    public void addLine(String line) {
	
    }

    public void setLine(int place, String line) {
	
    }

    public void removeLine(int line) {
	
    }

    public boolean isChangedLine() {
	return changedLines;
    }

    private void recheckLines() {
    }

    public CuboidArea getArea() {
	return null;
    }

    public CuboidArea getAreaExtra() {
	return null;
    }

    public void setArea(CuboidArea area) {
	this.area = area;
    }

    public void setAreaExtra(CuboidArea area) {
	this.areaExtra = area;
    }


    public void update() {
    }

    @Deprecated
    public void hide(Player player) {
	if (player == null)
	    return;
	hide(player.getUniqueId());
    }

    public void refresh() {
	this.hide();
	this.updatePages();
	this.update();
    }

    public void hide() {
	for (Player one : Bukkit.getOnlinePlayers()) {
	    removeFromCache(one.getUniqueId());
	}
    }

    public void hide(UUID uuid) {
	if (uuid == null)
	    return;
	removeFromCache(uuid);
    }

    public double getHeight() {
	double offset = 0;
	
	return offset;
    }

    public Location getCenterLocation() {
	double h = getHeight();
	Location l = this.getLocation().clone();
	l.add(0, 0.25, 0);
	if (isDownOrder()) {
	    l.add(0, -(h / 2D), 0);
	} else {
	    l.add(0, h / 2D, 0);
	}

	return l;
    }

    ConcurrentHashMap<Integer, String> changed = new ConcurrentHashMap<Integer, String>();
    List<Integer> changedPages = new ArrayList<Integer>();

    private void recalcualteChangedLines() {
    }

    private void recalcualteChangedPages() {

    }

    public void superficialMoveTo(final Player player, Location loc) {

    }

    private Double processLineDown(Player player, CMIHologramLine one, int i, Location targetLoc, Double offset) {

	
	return .0;
    }

    private Double processLineUp(Player player, CMIHologramLine one, int i, Location targetLoc, Double offset, int size) {
	return .0;
    }

    public void update(final Player player) {
	update(player, false);
    }

    ConcurrentHashMap<UUID, Long> nextUpdate = new ConcurrentHashMap<UUID, Long>();
    List<UUID> stillUpdating = Collections.synchronizedList(new ArrayList<>());

//    private boolean stillUpdating = false;

    public void update(final Player player, boolean oneTime) {
	
    }

    ConcurrentHashMap<UUID, List<CMIDataWatcher>> cache = new ConcurrentHashMap<UUID, List<CMIDataWatcher>>();
    ConcurrentHashMap<Integer, FakeInfo> clickableById = new ConcurrentHashMap<Integer, FakeInfo>();
    ConcurrentHashMap<UUID, FakeInfo> clickableByPlayer = new ConcurrentHashMap<UUID, FakeInfo>();

    public void removeFromCache(UUID uuid) {

    }

    private void clearIconLines(UUID uuid, CMIHologramPage newHPage) {

    }

    public void removeFromCache(UUID uuid, int size) {
	
    }

    private void updateCache(UUID uuid, int place, CMIDataWatcher w) {
	
    }

    private CMIDataWatcher getCache(UUID uuid, int place) {
	
	return null;
    }

    public double getUpdateIntervalSec() {
	return updateIntervalSec;
    }

    public void setUpdateIntervalSec(double d) {
    }

    public int getUpdateRange() {
	updateRange = updateRange > this.showRange ? this.showRange : updateRange;
	return updateRange;
    }

    public void setUpdateRange(int activationRange) {
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getShowRange() {
	showRange = showRange < this.updateRange ? this.updateRange : showRange;
	return showRange;
    }

    public void setShowRange(int showRange) {

    }

    public Double getIconSpacing() {
	return iconSpacing;
    }

    public void setIconSpacing(Double iconSpacing) {
	this.iconSpacing = iconSpacing;
    }

    public Double getSpacing() {
	return spacing;
    }

    public void setSpacing(Double spacing) {
	this.spacing = spacing;
    }

    public Boolean isDownOrder() {
	return downOrder;
    }

    public void setDownOrder(Boolean downOrder) {
	this.hide();
	this.update();
	this.downOrder = downOrder;
    }

    public boolean isInteractable() {
	return interactable;
    }

    public void setInteractable(boolean interactable) {
	this.interactable = interactable;
    }

    public boolean isShowParticle() {
	return showParticle;
    }

    public void setShowParticle(boolean showParticle) {
	this.showParticle = showParticle;
    }

    public boolean isBigButton() {
	return bigButton;
    }

    public void setBigButton(boolean bigButton) {
	this.bigButton = bigButton;
    }

    public int getSchedId() {
	return schedId;
    }

    public void setId(int schedId) {
	this.schedId = schedId;
    }

    public void stop() {
	if (lineOfSightSchedId != -1) {
	    Bukkit.getScheduler().cancelTask(lineOfSightSchedId);
	    lineOfSightSchedId = -1;
	}
	if (schedId != -1) {
	    Bukkit.getScheduler().cancelTask(schedId);
	    schedId = -1;
	}
	if (pageSchedId != -1) {
	    Bukkit.getScheduler().cancelTask(pageSchedId);
	    pageSchedId = -1;
	}
    }

    private void tasker() {
	
    }

    @SuppressWarnings("deprecation")
    private void lineOfSightTasker() {
	
    }

    private void pageTasker() {
	
    }

    Set<UUID> skipPlayers = Collections.synchronizedSet(new HashSet<UUID>());

    private void updateHolo() {
	
    }

    public Set<UUID> getLastHoloInRange() {
	return lastHoloInRange;
    }

    public void addLastHoloInRange(UUID uuid) {
	this.lastHoloInRange.add(uuid);
	tasker();
	lineOfSightTasker();
	pageTasker();
    }

    public void removeLastHoloInRange(UUID uuid) {
	this.lastHoloInRange.remove(uuid);
	tasker();
	lineOfSightTasker();
	pageTasker();
    }

    public Set<UUID> getLastHoloInRangeExtra() {
	return lastHoloInRangeExtra;
    }

    public void addLastHoloInRangeExtra(UUID uuid) {
	this.lastHoloInRangeExtra.add(uuid);
	lineOfSightTasker();
	update(Bukkit.getPlayer(uuid));
    }

    public void removeLastHoloInRangeExtra(UUID uuid) {
	this.lastHoloInRangeExtra.remove(uuid);
	lineOfSightTasker();
	hide(uuid);
    }

    public boolean isuSync() {
	return uSync;
    }

    public void setuSync(boolean uSync) {
	this.uSync = uSync;
    }

    public void disable() {
	enabled = false;
	this.hide();
    }

    public void enable() {
	enabled = true;
	this.update();
    }

    public boolean isSaveToFile() {
	return saveToFile;
    }

    public void setSaveToFile(boolean saveToFile) {
	this.saveToFile = saveToFile;
    }

    public void makePersistent() {
	this.saveToFile = true;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public int getPageCount() {
	return this.pages.size();
    }

    public CMIHologramPage getPage(int page) {
	return this.pages.get(page);
    }

    public boolean isRequiresPermission() {
	return requestPermission;
    }

    public void setPermissionRequirement(boolean requestPermission) {
	this.requestPermission = requestPermission;
    }

    public double getPageChangeIntervalSec() {
	return pageChangeIntervalSec;
    }

    public void setPageChangeIntervalSec(double pageChangeIntervalSec) {
	boolean update = false;
	if (this.pageChangeIntervalSec != pageChangeIntervalSec)
	    update = true;
	this.pageChangeIntervalSec = Math.ceil((int) (pageChangeIntervalSec * 100D)) / 100D;
	if (this.pageChangeIntervalSec <= 0)
	    this.pageChangeIntervalSec = 0;
	if (update)
	    pageTasker();
    }

    public void remove() {
	CMI.getInstance().getHologramManager().removeHolo(this);
    }

    public boolean isSticky() {
	return sticky;
    }

    public void setSticky(boolean sticky) {
	this.sticky = sticky;
    }

    public boolean isCheckLineOfSight() {
	return LOSupdateIntervalSec > 0;
    }

    public void setLOSInterval(double LOSupdateIntervalSec) {
	if (LOSupdateIntervalSec < 0)
	    LOSupdateIntervalSec = 0;
	this.LOSupdateIntervalSec = Math.ceil((int) (LOSupdateIntervalSec * 100D)) / 100D;
    }

    public double getLOSupdateIntervalSec() {
	return LOSupdateIntervalSec;
    }

    public boolean isFollowPlayer() {
	return LOSupdateIntervalSec > 0;
    }

    public void setFollowPlayer(double followPlayer) {
	if (followPlayer < 0)
	    followPlayer = 0;
	this.followPlayer = Math.ceil((int) (followPlayer * 100D)) / 100D;
    }

    public double getFollowPlayer() {
	return followPlayer;
    }
}
