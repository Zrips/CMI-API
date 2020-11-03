package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Advancements.AdvancementManager;
import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.CustomText.CText;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.RawMessages.RawMessage;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class CMIMultiMessage {

    private boolean updateSnd = false;
    private boolean translateColors = true;
    private boolean translatePlaceholders = true;
    private CMIMultiMessageType type = null;
    private String message;
    private List<Object> extra;

    public CMIMultiMessage(String msg) {
    }

    public boolean show(CMIUser user) {
	if (!user.isOnline())
	    return false;
	return show(user.getPlayer(false));
    }

    public boolean show(CommandSender sender) {
	return true;
    }

    public boolean isTranslateColors() {
	return translateColors;
    }

    public void setTranslateColors(boolean translateColors) {
	this.translateColors = translateColors;
    }

    public boolean isUpdateSnd() {
	return updateSnd;
    }

    public void setUpdateSnd(boolean updateSnd) {
	this.updateSnd = updateSnd;
    }

    public CMIMultiMessageType getType() {
	return type;
    }

    public String getMessage() {
	return message;
    }

    public List<Object> getExtra() {
	if (extra == null)
	    extra = new ArrayList<Object>();
	return extra;
    }

    public boolean isMultiType() {
	return type != null && !type.equals(CMIMultiMessageType.plain);
    }

    public boolean isTranslatePlaceholders() {
	return translatePlaceholders;
    }

    public void setTranslatePlaceholders(boolean translatePlaceholders) {
	this.translatePlaceholders = translatePlaceholders;
    }
}
