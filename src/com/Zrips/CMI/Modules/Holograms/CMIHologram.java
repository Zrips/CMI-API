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
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Packets.FakeInfo;
import com.Zrips.CMI.Modules.Portals.CMIVector3D;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

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
    private double spacing = 0.25;
    private double iconSpacing = 0.5D;

    private boolean downOrder = HologramManager.defaultsPlaceUp;

    private CMILocation loc;

    private Vector centerLocation = null;

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
    private ConcurrentHashMap<UUID, Integer> hoveringLine = new ConcurrentHashMap<UUID, Integer>();
//    private ConcurrentHashMap<UUID, Integer> oldHoveringLine = new ConcurrentHashMap<UUID, Integer>();
    private ConcurrentHashMap<Integer, CMIHologramPage> pages = new ConcurrentHashMap<Integer, CMIHologramPage>();
    private ConcurrentHashMap<Integer, CMIHologramPage> oldPages = new ConcurrentHashMap<Integer, CMIHologramPage>();

    private Set<UUID> lastHoloInRange = Collections.synchronizedSet(new HashSet<UUID>());
    private Set<UUID> lastHoloInRangeExtra = Collections.synchronizedSet(new HashSet<UUID>());

    private boolean uSync = true;

    //Interaction area
    private boolean newIneractionMethod = true;
    private int hoverOverSchedId = -1;
    private double extraInteractionHeight = 0D;
    private double extraInteractionWidth = 0D;

    //Particles    
    private short particlePosition = 0;
    private double particleSpacing = 0D;
    private int particleCount = 1;
    private CMIEffect effect = new CMIEffect(CMIParticle.SMALL_SMOKE);

    private boolean showHoverParticle = true;
    private boolean stabilizedHoverParticles = false;
    private double extraParticleHeight = 0D;
    private double extraParticleWidth = 0D;

    private double particleOffsetX = 0D;
    private double particleOffsetY = 0D;

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

    /**
    * Triggered on player interaction with interactable hologram    * 
    */
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
        Integer page = inPage.get(player.getUniqueId());

        if (page == null) {
            page = 1;
        }

        page = pages.size() < page ? 1 : page;

        if (pages.isEmpty())
            return null;

        CMIHologramPage p = pages.get(page);

        // Fallback to first page
        if (p == null)
            return pages.values().iterator().next().getLines();

        return p.getLines();
    }

    public void updatePages() {

    }

    public List<String> getCommands(Player player, CMIInteractType type) {

        List<String> cmd = new ArrayList<String>();

        return cmd;
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
        return getLocation();
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
        oldLines.clear();
        oldLines.addAll(lines);

        while (lines.size() <= place) {
            lines.add("");
        }

        lines.set(place, line);
        recheckLines();
    }

    public void removeLine(int line) {

    }

    public boolean isChangedLine() {
        return changedLines;
    }

    private void recheckLines() {

    }

    public CuboidArea getArea() {
        if (area == null) {
            area = new CuboidArea(getLoc().clone().add(-updateRange, -updateRange, -updateRange), getLoc().clone().add(updateRange, updateRange, updateRange));
        }
        return area;
    }

    public CuboidArea getAreaExtra() {
        if (areaExtra == null) {
            areaExtra = new CuboidArea(getLoc().clone().add(-this.showRange, -this.showRange, -this.showRange),
                getLoc().clone().add(this.showRange, this.showRange, this.showRange));
        }
        return areaExtra;
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

    }

    public void refresh() {

    }

    public void hide() {

    }

    public void hide(UUID uuid) {

    }

    public double getHeight() {
        double offset = 0;

        return offset;
    }

    private double getHeight(List<CMIHologramLine> l) {
        double offset = getSpacing() / 2;

        return offset;
    }

    public Vector getCenterVector() {
        if (this.centerLocation != null)
            return this.centerLocation.clone();
        this.centerLocation = getCenterLocation().toVector();
        return this.centerLocation.clone();
    }

    public Location getCenterLocation() {

        double h = getHeight();
        Location l = this.getLocation().clone();

        return l;
    }

    public void moveTo(Location loc) {

    }

    public void superficialMoveTo(Location loc) {

    }

    ConcurrentHashMap<Integer, String> changed = new ConcurrentHashMap<Integer, String>();
    List<Integer> changedPages = new ArrayList<Integer>();

    public void update(final Player player) {
        update(player, false);
    }

    ConcurrentHashMap<UUID, Long> nextUpdate = new ConcurrentHashMap<UUID, Long>();
    List<UUID> stillUpdating = Collections.synchronizedList(new ArrayList<>());

    public void checkHoverPosition(Player player) {

    }

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
        List<CMIDataWatcher> old = cache.get(uuid);

        if (old == null) {
            old = new ArrayList<CMIDataWatcher>();
            cache.put(uuid, old);
        }

        return old.size() - 1 < place ? null : old.get(place);
    }

    public double getUpdateIntervalSec() {
        return updateIntervalSec;
    }

    public void setUpdateIntervalSec(double d) {
        this.updateIntervalSec = Math.ceil((int) (d * 100D)) / 100D;
        if (this.updateIntervalSec <= 0)
            this.updateIntervalSec = -1;
    }

    public int getUpdateRange() {
        updateRange = updateRange > this.showRange ? this.showRange : updateRange;
        return updateRange;
    }

    public void setUpdateRange(int activationRange) {
        this.updateRange = activationRange;
        if (this.updateRange < 1)
            this.updateRange = 1;
        if (this.updateRange > 64)
            this.updateRange = 64;
        if (this.updateRange > showRange)
            updateRange = this.showRange;
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
        this.showRange = showRange;
        if (this.showRange < 1)
            this.showRange = 1;
        if (this.showRange > 64)
            this.showRange = 64;
        if (this.showRange < updateRange)
            showRange = this.updateRange;
    }

    public Double getIconSpacing() {
        return iconSpacing;
    }

    public void setIconSpacing(Double iconSpacing) {
        this.iconSpacing = iconSpacing;
        updatePages();
    }

    public Double getSpacing() {
        return spacing;
    }

    public void setSpacing(Double spacing) {
        this.spacing = spacing;
        updatePages();
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

    }

    private void tasker() {

    }

    @SuppressWarnings("deprecation")
    private void lineOfSightTasker() {

    }

    private void pageTasker() {

    }

    private void hoverOverTasker() {

    }

    Set<UUID> skipPlayers = Collections.synchronizedSet(new HashSet<UUID>());

    private void updateHolo() {

    }

    public Set<UUID> getLastHoloInRange() {
        return lastHoloInRange;
    }

    public void addLastHoloInRange(UUID uuid) {

    }

    public void removeLastHoloInRange(UUID uuid) {

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

    public int getHoveringLine(UUID uuid) {
        return hoveringLine.getOrDefault(uuid, 0);
    }

    public boolean isShowHoverParticle() {
        return showHoverParticle;
    }

    public void setShowHoverParticle(boolean showHoverParticle) {
        this.showHoverParticle = showHoverParticle;
    }

    public boolean isNewIneractionMethod() {
        return newIneractionMethod;
    }

    public void setNewIneractionMethod(boolean newIneractionMethod) {
        this.newIneractionMethod = newIneractionMethod;
    }

    public int getParticleCount() {
        return particleCount;
    }

    public void setParticleCount(int particleCount) {
        particleCount = Math.max(1, particleCount);
        particleCount = Math.min(10, particleCount);

        this.particleCount = particleCount;
    }

    public double getParticleSpacing() {
        return particleSpacing;
    }

    public void setParticleSpacing(double particleSpacing) {
        particleSpacing = Math.max(0, particleSpacing);
        particleSpacing = Math.min(1, particleSpacing);
        this.particleSpacing = particleSpacing;
    }

    public double getExtraParticleHeight() {
        return extraParticleHeight;
    }

    public void setExtraParticleHeight(double extraParticleHeight) {

        extraParticleHeight = Math.max(-this.getHeight() / 2, extraParticleHeight);
        extraParticleHeight = Math.min(3, extraParticleHeight);

        this.extraParticleHeight = extraParticleHeight;
    }

    public double getExtraParticleWidth() {
        return extraParticleWidth;
    }

    public void setExtraParticleWidth(double extraParticleWidth) {

        extraParticleWidth = Math.max(-3, extraParticleWidth);
        extraParticleWidth = Math.min(3, extraParticleWidth);

        this.extraParticleWidth = extraParticleWidth;
    }

    public double getExtraInteractionHeight() {
        return extraInteractionHeight;
    }

    public void setExtraInteractionHeight(double extraInteractionHeight) {
        this.extraInteractionHeight = extraInteractionHeight;
    }

    public double getExtraInteractionWidth() {
        return extraInteractionWidth;
    }

    public void setExtraInteractionWidth(double extraInteractionWidth) {
        this.extraInteractionWidth = extraInteractionWidth;
    }

    public CMIEffect getHoverEffect() {
        return effect;
    }

    public void setHoverEffect(CMIParticle effect) {
        this.effect = new CMIEffect(effect);
        this.effect.setAmount(0);
        this.effect.setSpeed(1);
    }

    public double getParticleOffsetX() {
        return particleOffsetX;
    }

    public void setParticleOffsetX(double particleOffsetX) {
        this.particleOffsetX = particleOffsetX;
    }

    public double getParticleOffsetY() {
        return particleOffsetY;
    }

    public void setParticleOffsetY(double particleOffsetY) {
        this.particleOffsetY = particleOffsetY;
    }

    public boolean isStabilizedHoverParticles() {
        return stabilizedHoverParticles;
    }

    public void setStabilizedHoverParticles(boolean stabilizedHoverParticles) {
        this.stabilizedHoverParticles = stabilizedHoverParticles;
    }
}
