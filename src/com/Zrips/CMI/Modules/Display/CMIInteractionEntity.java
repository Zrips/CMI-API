package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;

public class CMIInteractionEntity extends CMIDisplay {

    private org.bukkit.entity.Interaction td;

    public CMIInteractionEntity(Location loc) {
        super(CMIDisplayType.Interaction, loc);
        try {
            td = (org.bukkit.entity.Interaction) this.display;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        this.loc = loc;
    }

    @Override
    public void setWidth(double width) {
        td.setInteractionWidth((float) width);
    }

    @Override
    public void setHeight(double height) {
        td.setInteractionHeight((float) height);
    }

}
