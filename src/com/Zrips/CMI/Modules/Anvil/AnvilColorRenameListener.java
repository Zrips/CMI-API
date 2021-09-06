package com.Zrips.CMI.Modules.Anvil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Version.Version;

public class AnvilColorRenameListener implements Listener {
    private CMI plugin;

    public AnvilColorRenameListener(CMI plugin) {
	this.plugin = plugin;
    }

}
