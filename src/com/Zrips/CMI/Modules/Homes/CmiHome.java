package com.Zrips.CMI.Modules.Homes;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CmiHome {
    private CMILocation loc;
    private String name;
    private boolean privateH;
    private boolean bed;
    private boolean fav;
    private int slot;
    private CMIMaterial material;

    public CmiHome(String name, CMILocation loc) {
    }

    public CmiHome(String name, CMILocation loc, boolean privateH) {
    }

    public CMILocation getLoc() {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean isPrivate() {
        return false;
    }

    public void setPrivate(boolean privateH) {
    }

    public CMIMaterial getIconMaterial() {
        return null;
    }

    public CMIMaterial getMaterial() {
        return null;
    }

    public void setMaterial(CMIMaterial material) {
    }

    public Integer getSlot() {
        return null;
    }

    public void setSlot(Integer slot) {
    }

    public boolean isBed() {
        return false;
    }

    public void setBed(boolean bed) {
    }

    public boolean isFavorite() {
        return false;
    }

    public void setFavorite(boolean fav) {
    }
}
