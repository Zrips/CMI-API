package com.Zrips.CMI.Modules.Search;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class SearchTypeItem extends SearchTypeContentsBase {
    SearchTypeItem parent;
    private CMIPlayerSearchPlaceType currentCheckPlace;
    Set<CMIDataResultBase> results;
    private UUID uuid;
    private ItemStack itemToCompare;
    protected int checkTotalAmount;
    Map<CMIPlayerSearchPlaceType, CMIDataResultItem> totalCountResult;

    public SearchTypeItem(SearchTypeItem parent) {
    }

    public synchronized void setCurrentCheckedLocation(CMIPlayerSearchPlaceType type) {
    }

    private CMIPlayerSearchPlaceType getCurrentCheckedLocation() {
        return null;
    }

    protected CMIDataResultItem getTotalCountResult(CMIPlayerSearchPlaceType type) {
        return null;
    }

    protected void setTotalCountResult(CMIDataResultItem result) {
    }

    protected void clearTotalCountResult() {
    }

    protected UUID getCurrentUUID() {
        return null;
    }

    public void setCurrentUUID(UUID player) {
    }

    protected ItemStack getItemToCompare() {
        return null;
    }

    protected int getCheckTotalAmount() {
        return 0;
    }

    protected void setItemToCompare(ItemStack itemStack) {
    }

    protected void addResult(CMIDataResultBase result) {
    }

    @Override
    public Set<CMIDataResultBase> checkContent(ItemStack[] contents) {
        return null;
    }

    private void checkTotalResult() {
    }

    private void checkTotalResult(CMIPlayerSearchPlaceType currentCheckPlace) {
    }

    private void checkTotalResult(CMIPlayerSearchPlaceType currentCheckPlace, String identifier) {
    }

    private void finishTotalResult() {
    }

    private void finishTotalResult(boolean reset) {
    }

    public void finishedLocationCheck() {
    }

    protected boolean checkShulkerBundle() {
        return false;
    }

    private boolean checkShulker() {
        return false;
    }

    private boolean checkBundle() {
        return false;
    }

    protected boolean isValid() {
        return false;
    }
}
