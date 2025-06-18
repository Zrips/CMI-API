package com.Zrips.CMI.Containers;

import org.bukkit.Material;

import net.Zrips.CMILib.Items.CMIMaterial;

public class itemInfo {
    private Material mat;
    private int chance;

    @Deprecated
    public itemInfo(CMIMaterial mat) {
    }

    public itemInfo(Material mat) {
    }

    @Deprecated
    public CMIMaterial getMat() {
        return null;
    }

    public Material getMaterial() {
        return null;
    }

    @Deprecated
    public void setId(CMIMaterial mat) {
    }

    public void setMaterial(Material mat) {
    }

    public int getChance() {
        return 0;
    }

    public void setChance(int chance) {
    }
}
