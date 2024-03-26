package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Container.CMIBlock;
import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class CMISign {

//    private String name;

    private CuboidArea area;

    private List<String> lines = new ArrayList<String>();
    private Sign sign;

    private double updateIntervalSec = 5;
    private Long lastUpdate = 0L;
    private boolean personal = true;

    private int activationRange = 8;

    private int currentLine = 0;

    private CMILocation loc;

    public CMISign(CMILocation loc) {
        this.loc = loc;
    }

//    public String getName() {
//	return name;
//    }
//
//    public void setName(String name) {
//	this.name = name;
//    }

    public World getWorld() {
        return loc.getWorld();
    }

    public CMILocation getLoc() {
        return loc;
    }

    public List<String> getLines() {
        return lines;
    }

    public String getLine(int place) {
        return lines.size() - 1 < place || place < 0 ? "" : lines.get(place) == null ? "" : lines.get(place);
    }

    public List<String> getLinesAsList() {
        List<String> ls = new ArrayList<String>();
        for (String one : lines) {
            ls.add(one);
        }
        return ls;
    }

    public void setLines(List<String> l) {
        this.lines = l;
//	lines = new String[l.size()];
//	for (int i = 0; i < l.size(); i++) {
//	    lines[i] = l.get(i);
//	}
//	for (int i = 0; i < lines.length; i++) {
//	    if (lines[i] == null)
//		lines[i] = "";
//	}
    }

    public void setLines(String[] lines) {
        this.lines = Arrays.asList(lines);
//	for (int i = 0; i < lines.length; i++) {
//	    if (lines[i] == null)
//		lines[i] = "";
//	}
    }

    public CuboidArea getArea() {
        if (area == null) {
            Block block = this.getLoc().getBlock();
            if (block != null && block.getState() instanceof Sign) {
                try {
                    CMIBlock cblock = new CMIBlock(block);
                    BlockFace facing = cblock.getFacing();
                    if (facing != null) {
                        area = new CuboidArea(
                            getLoc().clone().add(
                                facing.getModX() == 0 ? -activationRange / 2 : 0,
                                -activationRange / 2,
                                facing.getModZ() == 0 ? -activationRange / 2 : 0),
                            getLoc().clone().add(
                                facing.getModX() == 0 ? activationRange / 2 : activationRange * facing.getModX(),
                                activationRange / 2,
                                facing.getModZ() == 0 ? activationRange / 2 : activationRange * facing.getModZ()));
                    } else {
                        area = new CuboidArea(
                            getLoc().clone().add(-activationRange / 2,
                                -activationRange / 2,
                                -activationRange / 2),
                            getLoc().clone().add(
                                activationRange / 2,
                                activationRange / 2,
                                activationRange / 2));
                    }
                } catch (Exception | Error e) {
                    area = new CuboidArea(getLoc().clone().add(-activationRange, -activationRange, -activationRange), getLoc().clone().add(activationRange, activationRange, activationRange));
                }
            } else {
                area = new CuboidArea(getLoc().clone().add(-activationRange, -activationRange, -activationRange), getLoc().clone().add(activationRange, activationRange, activationRange));
            }

        }
        return area;
    }

    public void setArea(CuboidArea area) {
        this.area = area;
    }

    public Sign getSign() {
        if (sign == null) {
            Block block = loc.getBlock();
            if (!(block.getState() instanceof Sign)) {
                return sign;
            }
            sign = (Sign) block.getState();
        }
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public boolean isTimeToUpdate() {
        return this.lastUpdate + (this.updateIntervalSec * 1000L) - 10L <= System.currentTimeMillis();
    }

    public void setAsUpdated() {
        this.lastUpdate = System.currentTimeMillis();
    }

    public void update() {
        update(null);
    }

    public void update(final Player player) {
        if (getSign() == null)
            return;
        try {
            CMIScheduler.runTaskAsynchronously(() -> {
                final String[] l = new String[4];
                int start = currentLine;
                if (start >= lines.size())
                    start = lines.size() - 1;
                if (start - 1 >= lines.size())
                    start = 0;

                int added = 0;
                for (int i = 0; i < 4; i++) {

                    String text = CMIChatColor.colorize(getLine(start));
                    if (text == null)
                        text = "";
                    if (text.equals("_"))
                        text = "";
                    text = CMI.getInstance().getPlaceholderAPIManager().updatePlaceHolders(player, text);
//			CMI.getInstance().getSignManager().updateSignColors(text);
                    text = CMIChatColor.colorize(text);

                    l[i] = text;
                    start++;
                    if (start >= lines.size())
                        start = 0;
                    added++;
                    if (added >= lines.size())
                        break;
                }

                if (player == null) {
                    for (int i = 0; i < 4; i++) {
                        getSign().setLine(i, l[i]);
                    }
                    CMIScheduler.runTask(() -> {
                        if (getSign().getLocation().getChunk().isLoaded()) {
                            getSign().update();
                        }
                    });

                } else {
                    player.sendSignChange(getSign().getLocation(), l);
                }

            });
        } catch (Exception |

            Error e) {
            e.printStackTrace();
        }
    }

    public double getUpdateIntervalSec() {
        return updateIntervalSec;
    }

    public void setUpdateIntervalSec(double updateIntervalSec) {
        this.updateIntervalSec = updateIntervalSec;
        if (this.updateIntervalSec < 0)
            this.updateIntervalSec = 0;
    }

    public boolean isPersonal() {
        return personal;
    }

    public void setPersonal(boolean personal) {
        this.personal = personal;
    }

    public int getActivationRange() {
        return activationRange;
    }

    public void setActivationRange(int activationRange) {
        this.activationRange = activationRange;
        if (this.activationRange < 1)
            this.activationRange = 1;
    }

    public void updateCurrentLine() {
        if (lines.size() > 4) {
            currentLine++;
        }
        if (currentLine >= lines.size())
            currentLine = 0;
        if (lines.size() <= 4)
            currentLine = 0;
    }

}
