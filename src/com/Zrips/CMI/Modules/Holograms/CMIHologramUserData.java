package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Future.CMIFutureBatcher;
import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramFadeInAnimation;
import com.Zrips.CMI.Modules.Packets.FakeInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIHologramUserData {
    private int page;
    private int hoveringLine;
    private CMIHologramHoveringPosition hoveringLeftSide;
    private boolean skipPageChange;
    private long nextUpdate;
    private boolean skipUpdate;
    private boolean updateLocation;
    private CMIHologramBatch batch;
    private List<CMIDataWatcher> dataWatcher;
    private FakeInfo fakeInfo;
    private CMIFutureBatcher batcher;
    private CMIHologram hoveringHologram;
    private CMIHologramFadeInAnimation fadeInAnimation;
    CMITask animationTasker;

    public CMIHologramUserData() {
    }

    public int getPage() {
        return 0;
    }

    public CMIHologramUserData setPage(int page) {
        return null;
    }

    public int getHoveringLine() {
        return 0;
    }

    public int getHoveringLineAndReset() {
        return 0;
    }

    public CMIHologramUserData setHoveringLine(int line) {
        return null;
    }

    public CMIHologramHoveringPosition getHoveringSide() {
        return null;
    }

    public CMIHologramUserData setHoveringSide(CMIHologramHoveringPosition hoveringLeftSide) {
        return null;
    }

    public boolean isSkipPageChange() {
        return false;
    }

    public CMIHologramUserData setSkipPageChange(boolean skipPageChange) {
        return null;
    }

    public long getNextUpdate() {
        return 0;
    }

    public void setNextUpdate(long nextUpdate) {
    }

    public CMIHologramBatch getHologramBatch() {
        return null;
    }

    public void setHologramBatch(CMIHologramBatch batch) {
    }

    @Deprecated
    public List<CMIDataWatcher> getDataWatcher() {
        return null;
    }

    @Deprecated
    public void setDataWatcher(List<CMIDataWatcher> dataWatcher) {
    }

    public FakeInfo getFakeInfo() {
        return null;
    }

    public void setFakeInfo(FakeInfo fakeInfo) {
    }

    public boolean isSkipUpdate() {
        return false;
    }

    public void setSkipUpdate(boolean skipUpdate) {
    }

    public CMIFutureBatcher getBatcher() {
        return null;
    }

    public CompletableFuture<?> addBatch(CompletableFuture<?> future) {
        return null;
    }

    public CMIHologramFadeInAnimation getFadeInAnimation() {
        return null;
    }

    public void setFadeInAnimation(CMIHologramFadeInAnimation fadeInAnimation) {
    }

    public void initializeFadeInAnimation(double targetScale, double targetBackgroundOpacity, double targetTextOpacity) {
    }

    public void startFadeInAnimation(CMIHologram holo, Player player) {
    }

    public boolean isUpdateLocation() {
        return false;
    }

    public void setUpdateLocation(boolean updateLocation) {
    }

    public CMIHologram getHoveringHologram() {
        return null;
    }

    public void setHoveringHologram(CMIHologram hoveringHologram) {
    }
}
