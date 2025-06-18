package com.Zrips.CMI.commands.list;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class bossbarmsg implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends boss bar message to player", args = "[playerName/all] (-sec:[seconds])(-t:[timeToKeepFor]) (-n:nameOfBar) (-p:[maxValue/current]) (-c:[color]) (-s:[1,6,10,12,20]) (-cmd:\"command;;command2\") (-pcmd:\"command;;command2\") (-a:[ticks]) [message] (-cancel:nameOfBar)", tab = {
        "playername" }, explanation = { "PlaceHolderAPI is supported for progression and text it self",
            "Time is defined in regular way, like 1s is one second and 1m is one minute. This will determine for how long to keep bar shown for player before automatically hiding",
            "nameOfBar is option and when defining same one, then current bar will update with new information", "colors can be: red, green, pink, purple, white, yellow",
            "max and current values determines bar fillup, PlaceHolderAPI variables can be used for dynamic updates", "Examples:", "/cmi bossbar Zrips BossBarTitle",
            "/cmi bossbarmsg all -t:1s -p:%server_max_players%/%server_online% -n:testbar -c:red &2Title of bar %server_online%/%server_max_players% &e%cmi_user_name%",
            "/cmi bossbarmsg all -p:+1 -n:testbar - will add one percent towards current progresion bar by name",
            "/cmi bossbarmsg all -p:-1 -n:testbar - will take out one percent from current progresion bar by name",
            "/cmi bossbarmsg all -s:10 -n:testbar - will set bossbar style to 10 segments by bar name", "/cmi bossbarmsg all -sec:5 - will count for 5 seconds from 0 to 5",
            "/cmi bossbarmsg all -sec:-5 - will count for 5 seconds from 5 to 0",
            "-cmd: will perform commands either for single player if target is specific player or only once if its for everyone (all). This will not translated variables lie [playerName] if used with 'all' variable. Use -pcmd: instead",
            "-pcmd: will perform commands on each player if target is 'all'", "https://www.zrips.net/cmi/commands/bossbarmsg-handling/" }, regVar = { -100, -1 }, consoleVar = { -100,
                -1 }, ignoreHelpPage = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static Double getProgress(Player Target, String progresionMax, String progresionCurrent) {
        return null;
    }

    private static void cancelBossbar(String one, boolean toAll, Player target) {
    }

    private static BarStyle getStyle(String one) {
        return null;
    }

    private static BarColor getBarColor(String one) {
        return null;
    }
}
