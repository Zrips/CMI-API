package com.Zrips.CMI.Modules.PlayerOptions;

import java.util.List;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIItemStack;

public class PlayerOptionsManager {
    private CMI plugin;

    private Boolean guiCloseButton;
    private int guiCloseButtonSlot;
    private CMIItemStack guiCloseButtonItem;
    private List<String> guiCloseButtonCommands;

    private boolean guiInfoButton;
    private int guiInfoButtonSlot;
    private CMIItemStack guiInfoButtonItem;
    private List<String> guiInfoButtonCommands;

    public PlayerOptionsManager(CMI plugin) {
        this.plugin = plugin;
    }

    public static String defaultString = "";

    public void loadConfig() {

    }

    public void openOptionGUI(CMIUser user) {

    }
}
