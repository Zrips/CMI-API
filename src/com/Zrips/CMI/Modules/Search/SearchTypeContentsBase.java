package com.Zrips.CMI.Modules.Search;

import java.util.Set;

import javax.annotation.Nonnull;

import org.bukkit.inventory.ItemStack;

public class SearchTypeContentsBase extends SearchTypeBase {
    @Nonnull
    public Set<CMIDataResultBase> checkContent(ItemStack[] contents) {
        return null;
    }
}
