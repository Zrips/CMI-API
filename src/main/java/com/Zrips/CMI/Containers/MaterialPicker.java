package com.Zrips.CMI.Containers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;

public class MaterialPicker {

    Player player;

    public MaterialPicker(Player player) {
	this.player = player;
    }

    public void pickedMaterial(GUIClickType type, CMIMaterial material) {
    }

    public boolean openPicker(int page, String title) {
	return true;
    }

}
