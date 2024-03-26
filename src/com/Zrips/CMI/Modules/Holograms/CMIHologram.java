package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Display.CMIBillboard;
import com.Zrips.CMI.Modules.Display.CMIItemDisplay;
import com.Zrips.CMI.Modules.Display.CMITextAlignment;
import com.Zrips.CMI.Modules.Display.CMITextDisplay;
import com.Zrips.CMI.Modules.Packets.FakeInfo;
import com.Zrips.CMI.Modules.Packets.PacketHandler;
import com.Zrips.CMI.Modules.Portals.CMIVector3D;
import com.Zrips.CMI.Modules.Portals.CuboidArea;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Container.CMINumber;
import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIHologram {

    private String name = null;
    private CMITask schedId = null;
    private CMITask pageSchedId = null;
    private CMITask lineOfSightSchedId = null;

    private boolean enabled = true;
    private boolean saveToFile = false;
    private boolean showWhenNotPersistent = false;

    private Player playerToShowFor = null;
    private int selfDestructIn = 0;

    private boolean sticky = false;
//    private boolean checkLOS = false;

    private boolean autoPagination = false;

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
    private double spacing = 0.24;
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
    private int lineCount = 0;
    private List<String> oldLines = new ArrayList<String>();
    private boolean changedLines = false;
    private ConcurrentHashMap<UUID, Integer> inPage = new ConcurrentHashMap<UUID, Integer>();
    private ConcurrentHashMap<UUID, Integer> hoveringLine = new ConcurrentHashMap<UUID, Integer>();
    private ConcurrentHashMap<UUID, Boolean> hoveringSide = new ConcurrentHashMap<UUID, Boolean>();
//    private ConcurrentHashMap<UUID, Integer> oldHoveringLine = new ConcurrentHashMap<UUID, Integer>();
    private ConcurrentHashMap<Integer, CMIHologramPage> pages = new ConcurrentHashMap<Integer, CMIHologramPage>();
    private ConcurrentHashMap<Integer, CMIHologramPage> oldPages = new ConcurrentHashMap<Integer, CMIHologramPage>();

    private Multiset<UUID> lastHoloInRange = ConcurrentHashMultiset.create();
    private Multiset<UUID> lastHoloInRangeExtra = ConcurrentHashMultiset.create();

//    private Set<UUID> lastHoloInRange = Collections.synchronizedSet(new HashSet<UUID>());
//    private Set<UUID> lastHoloInRangeExtra = Collections.synchronizedSet(new HashSet<UUID>());

    private boolean uSync = true;

    //Interaction area
    private boolean newIneractionMethod = true;
    private CMITask hoverOverSchedId = null;
    private double extraInteractionHeight = 0D;
    private double extraInteractionWidth = 0D;

    // Display text approach
    private boolean newDisplayMethod = false;
    private CMIBillboard billboard = null;
    private CMIBillboard iconBillboard = null;
    private CMITextAlignment textAlignment = null;
    private int yaw = 0;
    private int pitch = 0;
    private CMIChatColor backgroundColor = CMIChatColor.BLACK;
    private int backgroundAlpha = 125;
    private int textAlpha = 230;
    private boolean doubleSided = false;
    private boolean shadowed = true;
    private double scaleW = 1;
    private double scaleH = 1;
    private boolean seeThrough = false;

    private double iconScale = 1;
    private int iconPitch = 0;
    private int iconYaw = 0;

    private int skyLevel = -1;
    private int blockLevel = -1;

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

    public CMIHologram(String name, Location loc) {
        this(name, new CMILocation(loc));
    }

    public CMIHologram(String name, Location loc, Player playerToShowFor) {

    }

    public CMIHologram(Location loc, Player playerToShowFor, List<String> lines) {

    }

    public CMIHologram(String name, CMILocation loc) {

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

    private double getLineHeight() {
        return 0.25D * this.getScaleH();
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
        return null;
    }

    ConcurrentHashMap<Integer, String> changed = new ConcurrentHashMap<Integer, String>();
    List<Integer> changedPages = new ArrayList<Integer>();

    private void recalcualteChangedLines() {
    }

    @Deprecated
    private void recalcualteChangedPages() {
        recalculateChangedPages();
    }

    private void recalculateChangedPages() {

    }

    public void moveTo(Location loc) {
        setLoc(loc);
        move(this.getLocation().clone().toVector(), loc, true);
        if (this.isSaveToFile())
            CMI.getInstance().getHologramManager().save();
    }

    public void superficialMoveTo(Location loc) {
        move(this.getLocation().clone().toVector(), loc, false);
    }

    private void move(Vector oldVector, Location moveToLoc, boolean update) {

    }

    private void moveHologramFor(UUID uuid, Location moveToLoc, double offset) {

    }

    private void moveHologramFor(UUID uuid, Location moveToLoc, Vector oldVector, boolean update) {

    }

    public void update(final Player player) {
        update(player, false);
    }

    ConcurrentHashMap<UUID, Long> nextUpdate = new ConcurrentHashMap<UUID, Long>();
    List<UUID> stillUpdating = Collections.synchronizedList(new ArrayList<>());

    private List<CMIVector3D> getLocation(Player player, int parts) {

        return null;
    }

    private int getLineCount(CMIHologramPage page) {
        return this.isAutoPagination() ? page.getLines().size() + 1 : page.getLines().size();
    }

    public void processPrevNextPageClick(Player player) {

    }

    public void checkHoverPosition(Player player) {

    }

//    private boolean stillUpdating = false;

//    private final static ExecutorService asyncService = Executors.newCachedThreadPool();

    ConcurrentHashMap<UUID, CMIHologramBatch> playerDisplays = new ConcurrentHashMap<UUID, CMIHologramBatch>();

    private void modifyIcon(CMIItemDisplay display) {
    }

    private CMIVector3D getIconPositionOffset(int line) {

        return null;
    }

    private void newUpdate(final Player player) {
    }

    private void addInteractionCheck(Player player) {

    }

    CompletableFuture<Void> task = null;

    private void oldUpdate(final Player player, final boolean oneTime) {

    }

    private CMITextDisplay createDisplay(List<String> finalLines, double offset, boolean frontSide) {

        return null;
    }

    private void updateDisplaySettings(CMITextDisplay display, boolean frontSide) {

    }

    private void generalUpdate(final Player player, boolean oneTime) {

    }

    public void update(final Player player, boolean oneTime) {

    }

    ConcurrentHashMap<UUID, List<CMIDataWatcher>> cache = new ConcurrentHashMap<UUID, List<CMIDataWatcher>>();
    ConcurrentHashMap<Integer, FakeInfo> clickableById = new ConcurrentHashMap<Integer, FakeInfo>();
    ConcurrentHashMap<UUID, FakeInfo> clickableByPlayer = new ConcurrentHashMap<UUID, FakeInfo>();

    public void removeFromCache(UUID uuid) {

    }

    public void clearFakeEntities() {
        PacketHandler.clearFakeEntities();
    }

    public void removeFromCache(UUID uuid, int size) {

    }

    public double getUpdateIntervalSec() {
        return updateIntervalSec;
    }

    public void setUpdateIntervalSec(double d) {
        this.updateIntervalSec = Math.ceil((int) (d * 100D)) / 100D;
        if (this.updateIntervalSec <= 0)
            this.updateIntervalSec = 0;
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

    public CMITask getSched() {
        return schedId;
    }

    public void setSched(CMITask schedId) {
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
        return lastHoloInRange.elementSet();
    }

    public void recheckTaskers() {
        tasker();
        lineOfSightTasker();
        pageTasker();
        hoverOverTasker();
    }

    public void addLastHoloInRange(UUID uuid) {
        this.lastHoloInRange.add(uuid);
        recheckTaskers();
    }

    public void removeLastHoloInRange(UUID uuid) {
        this.lastHoloInRange.remove(uuid);
        recheckTaskers();
    }

    public Set<UUID> getLastHoloInRangeExtra() {
        return lastHoloInRangeExtra.elementSet();
    }

    public void addLastHoloInRangeExtra(UUID uuid) {
        this.lastHoloInRangeExtra.add(uuid);
        recheckTaskers();
//        lineOfSightTasker();
//        update(CMIUser.getOnlinePlayer(uuid));
    }

    public void removeLastHoloInRangeExtra(UUID uuid) {
        this.lastHoloInRangeExtra.remove(uuid);
        recheckTaskers();
//        lineOfSightTasker();
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

    public boolean isShowWhenNotPersistent() {
        return showWhenNotPersistent;
    }

    public void setShowWhenNotPersistent(boolean showWhenNotPersistent) {
        this.showWhenNotPersistent = showWhenNotPersistent;
    }

    public boolean isNewDisplayMethod() {
        return newDisplayMethod;
    }

    public CMIHologram setNewDisplayMethod(boolean newDisplayMethod) {
        this.newDisplayMethod = newDisplayMethod;
        return this;
    }

    public CMIBillboard getBillboard() {
        if (billboard == null)
            return CMIBillboard.VERTICAL;
        return billboard;
    }

    public CMIHologram setBillboard(CMIBillboard billboard) {
        this.billboard = billboard;
        return this;
    }

    public CMIBillboard getIconBillboard() {
        return iconBillboard;
    }

    public CMIHologram setIconBillboard(CMIBillboard billboard) {
        this.iconBillboard = billboard;
        return this;
    }

    public int getYaw() {
        return yaw;
    }

    public CMIHologram setYaw(int angle) {
        this.yaw = angle;
        return this;
    }

    public int getPitch() {
        return pitch;
    }

    public CMIHologram setPitch(int angle) {
        this.pitch = CMINumber.clamp(angle, -180, 180);
        return this;
    }

    public CMITextAlignment getTextAlignment() {
        if (textAlignment == null)
            return CMITextAlignment.CENTER;
        return textAlignment;
    }

    public CMIHologram setTextAlignment(CMITextAlignment textAlignment) {
        this.textAlignment = textAlignment;
        return this;
    }

    public CMIChatColor getBackgroundColor() {
        if (backgroundColor == null)
            backgroundColor = CMIChatColor.BLACK;
        return backgroundColor;
    }

    public CMIHologram setBackgroundColor(CMIChatColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public int getBackgroundAlpha() {
        return backgroundAlpha;
    }

    public CMIHologram setBackgroundAlpha(int alpha) {
        this.backgroundAlpha = CMINumber.clamp(alpha, 0, 255);
        return this;
    }

    public int getTextAlpha() {
        return textAlpha;
    }

    public CMIHologram setTextAlpha(int alpha) {
        this.textAlpha = CMINumber.clamp(alpha, 0, 255);
        return this;
    }

    public boolean isDoubleSided() {
        return doubleSided;
    }

    public CMIHologram setDoubleSided(boolean doubleSided) {
        this.doubleSided = doubleSided;
        return this;
    }

    public boolean isShadowed() {
        return shadowed;
    }

    public CMIHologram setShadowed(boolean shadowed) {
        this.shadowed = shadowed;
        return this;
    }

    public double getScaleW() {
        return scaleW;
    }

    public CMIHologram setScaleW(double scale) {
        scale = (int) (scale * 100) / 100D;
        this.scaleW = CMINumber.clamp(scale, 0.001, 9999);
        return this;
    }

    public double getScaleH() {
        return scaleH;
    }

    public CMIHologram setScaleH(double scale) {
        scale = (int) (scale * 100) / 100D;
        this.scaleH = CMINumber.clamp(scale, 0.001, 9999);
        return this;
    }

    public double getIconScale() {
        return iconScale;
    }

    public CMIHologram setIconScale(double iconScale) {
        this.iconScale = CMINumber.clamp(iconScale, 0.001, 9999);
        return this;
    }

    public int getIconPitch() {
        return iconPitch;
    }

    public CMIHologram setIconPitch(int iconPitch) {
        this.iconPitch = iconPitch;
        return this;
    }

    public int getIconYaw() {
        return iconYaw;
    }

    public CMIHologram setIconYaw(int iconYaw) {
        this.iconYaw = iconYaw;
        return this;
    }

    public int getSkyLevel() {
        return skyLevel;
    }

    public CMIHologram setSkyLevel(int skyLevel) {
        this.skyLevel = skyLevel;
        return this;
    }

    public int getBlockLevel() {
        return blockLevel;
    }

    public CMIHologram setBlockLevel(int blockLevel) {
        this.blockLevel = blockLevel;
        return this;
    }

    public String getWorldName() {
        return this.loc.getWorldName();
    }

    public Player getPlayerToShowFor() {
        return playerToShowFor;
    }

    public CMIHologram setPlayerToShowFor(Player playerToShowFor) {
        this.playerToShowFor = playerToShowFor;
        return this;
    }

    public int getSelfDestructIn() {
        return selfDestructIn;
    }

    public CMIHologram setSelfDestructIn(int selfDestructIn) {
        this.selfDestructIn = selfDestructIn;
        return this;
    }

    public void showToPlayer() {
    }

    public boolean isAutoPagination() {
        return autoPagination;
    }

    public void setAutoPagination(boolean autoPagination) {
        this.autoPagination = autoPagination;
    }

    public boolean isSeeThrough() {
        return seeThrough;
    }

    public void setSeeThrough(boolean seeThrough) {
        this.seeThrough = seeThrough;
    }

}
