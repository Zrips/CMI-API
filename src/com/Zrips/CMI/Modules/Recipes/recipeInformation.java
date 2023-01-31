package com.Zrips.CMI.Modules.Recipes;

import net.Zrips.CMILib.Recipes.CMIRecipeCraftData;

public class recipeInformation {

    private boolean exact = true;
    private String customId = null;
    private CMIRecipeCraftData craftData = null;

    public boolean isExact() {
        return exact;
    }

    public void setExact(boolean exact) {
        this.exact = exact;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public CMIRecipeCraftData getCraftData() {
        return craftData;
    }

    public void setCraftData(CMIRecipeCraftData craftData) {
        this.craftData = craftData;
    }

}
