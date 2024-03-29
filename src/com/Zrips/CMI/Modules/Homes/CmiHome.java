package com.Zrips.CMI.Modules.Homes;

import java.math.BigInteger;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CmiHome {

    private CMILocation loc;
    private String name;
    private boolean privateH = false;
    private boolean bed = false;

    private boolean fav = false;

    private int slot;

    private CMIMaterial material;

    public CmiHome(String name, CMILocation loc) {
        this.name = name;
        this.loc = loc;
    }

    public CmiHome(String name, CMILocation loc, boolean privateH) {
        this.name = name;
        this.loc = loc;
        this.privateH = privateH;
    }

    public CMILocation getLoc() {
        loc.recheck();
        return loc;
    }

    public String getName() {
        return name;
    }

    public boolean isPrivate() {
        return privateH;
    }

    public void setPrivate(boolean privateH) {
        this.privateH = privateH;
    }

    public CMIMaterial getIconMaterial() {

        return null;
    }

    public CMIMaterial getMaterial() {
        return material;
    }

    public void setMaterial(CMIMaterial material) {
        if (material != null && (material == CMIMaterial.NONE || material.isAir()))
            return;
        this.material = material;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot == null ? 0 : slot <= 0 ? 0 : slot;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isFavorite() {
        return fav;
    }

    public void setFavorite(boolean fav) {
        this.fav = fav;
    }

}
