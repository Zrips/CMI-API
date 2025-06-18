package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import org.bukkit.inventory.ItemStack;

public class SearchTypeItemStack extends SearchTypeItem {
    ItemStack searchedItem;
    Set<SearchTypeItem> searchTypes;
    Set<ItemSearchCriteria> criteria;

    public SearchTypeItemStack(ItemStack item, Set<ItemSearchCriteria> criteria) {
        super(null);
    }

    public ItemStack getSearchedItem() {
        return null;
    }

    @Override
    protected boolean isValid() {
        return false;
    }

    @Override
    public String getSearchTypeName() {
        return null;
    }
}
