package com.Zrips.CMI.Modules.Economy;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Hooks.CMIHookType;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class EconomyManager {

    private CMI plugin;

    private boolean Enabled = false;
    private boolean CustomWorldsEnabled = false;
    private boolean Confirmation = false;
    private boolean LogEnabled = false;
    private Double MaxChequeValue;
    private boolean ChequePaper;
    private boolean ChequePermission;
    private boolean ChequeInCreative;
    private boolean ChequeAcceptNotEncoded;
    private boolean BalTopIncludeFakes;
    private long ExcludeInactive;
    private boolean BalTopDisplayWithShorts;
    private List<String> BalTopExclude;
    private List<String> BalTopExcludeStartingWith;
    private HashMap<String, Double> shortAmountValues = new HashMap<String, Double>();

    private String townyTownPrefix = "town-";
    private String townyNationPrefix = "nation-";
    private String townyDebtPrefix = "[DEBT]-";
    private String townyClosed_economy = "towny-server";

    private Boolean recalculatingTop = false;

    public final static String CMIDefaultWorld = "CMIGlobal";

    HashMap<String, WorldGroup> groups = new HashMap<String, WorldGroup>();
    private WorldGroup defaultGroup = null;

    private VaultManager vmanager = null;

    public EconomyManager(CMI plugin) {

    }

    SortedMap<Double, UUID> balTop = Collections.synchronizedSortedMap(new TreeMap<Double, UUID>(Collections.reverseOrder()));

    Map<UUID, Double> balTopUsers = Collections.synchronizedMap(new HashMap<UUID, Double>());
    private Double totalServerMoney = 0D;
    Long lastRecalculated = null;

    public void setForBalTopRecalculation() {
        lastRecalculated = null;
    }

    public String format(Double money) {
        if (money == null)
            return "0";
        if (vmanager == null)
            return String.valueOf(money);
        return vmanager.format(money);
    }

    public boolean isVaultEnabled() {
        return vmanager != null && vmanager.getVaultEconomy() != null;
    }

    boolean locked = false;

    class baltopUpdateCache {
        private long time = 0;
        private CMITask task = null;

        public long getTime() {
            return time;
        }

        public baltopUpdateCache setTime(long time) {
            this.time = time;
            return this;
        }

        public CMITask getTask() {
            return task;
        }

        public baltopUpdateCache setTask(CMITask task) {
            this.task = task;
            return this;
        }
    }

    Map<UUID, baltopUpdateCache> balanceUpdateCache = Collections.synchronizedMap(new HashMap<UUID, baltopUpdateCache>());

    public void removeFromUpdateCache(UUID uuid) {
        balanceUpdateCache.remove(uuid);
    }

    int updateDelay = 15;

    public synchronized void updateBalTop(final CMIUser user) {

    }

    private void forceUpdateBalTop(CMIUser user) {

    }

    CompletableFuture<Void> recTask = null;

    public void recalculateBalTop() {

    }

    private boolean startsWithExcluded(String name) {
        name = name.toLowerCase();
        for (String one : BalTopExcludeStartingWith) {
            if (name.startsWith(one))
                return true;
        }
        return false;
    }

    public SortedMap<Double, UUID> getBalTopMap() {

        return null;
    }

    public int getBalTopPlace(UUID uuid) {
        SortedMap<Double, UUID> map = getBalTopMap();
        Double current = balTopUsers.get(uuid);
        if (current == null)
            return plugin.getPlayerManager().getTotalUserCount();

        return map.headMap(current).size() + 1;
    }

    public Set<WorldGroup> getWorldGroups() {
        return null;
    }

    public Set<String> getWorlds(WorldGroup worldGroup) {
        return null;
    }

    public WorldGroup getWorldGroup(String name) {
        return null;
    }

    public DecimalFormat getMoneyFormat() {
        return getMoneyFormat(null);
    }

    public Double translateMoney(String value) {

        return null;
    }

    DecimalFormat defaultFormat;

    DecimalFormat shortDefaultFormat;

    public DecimalFormat getShortMoneyFormat() {
        return shortDefaultFormat;
    }

    public DecimalFormat getMoneyFormat(String worldName) {

        return null;
    }

    public void loadConfig() {

    }

    public boolean isCustomWorldsEnabled() {
        return CustomWorldsEnabled;
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public VaultManager getVaultManager() {
        return vmanager;
    }

    public boolean isConfirmation() {
        return Confirmation;
    }

    public List<String> getBalTopExclude() {
        return BalTopExclude;
    }

    public void setBalTopExclude(List<String> balTopExclude) {
        BalTopExclude = balTopExclude;
    }

    public Boolean isRecalculatingTop() {
        return recalculatingTop;
    }

    public void setRecalculatingTop(boolean recalculatingTop) {
        this.recalculatingTop = recalculatingTop;
    }

    public Double getMaxChequeValue() {
        return MaxChequeValue;
    }

    public Double getTotalServerMoney() {
        return totalServerMoney;
    }

//    public String getGlobalPlacing() {
//	return GlobalPlacing;
//    }

    public WorldGroup getDefaultGroup() {
        return defaultGroup;
    }

    public enum EconResponseType {
        SUCCESS, FAILURE, NOT_IMPLEMENTED;
    }

    public class CMIEconomyResponse {
        private double amount;
        private double balance;
        private EconResponseType type;

        public CMIEconomyResponse(double amount, double balance, EconResponseType type) {
            this.amount = amount;
            this.balance = balance;
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public EconResponseType getType() {
            return type;
        }
    }

    public class WorldGroup {
        private Double StartingAmount = 0D;
        private Double MinimalAmount = 0D;
        private Double MaximumAmount = 100D;
        private Double MinimalPay = 0.5D;
        private String CurrencyName = "Euro";
        private String CurrencySymbol = "€";
        private String CurrencyFormat = "###,##0.00";
        private String Placing = "[money][symbol]";
        private boolean switchPlaces = false;
        private boolean UseShortNumbers = false;
        private boolean fractions = true;
        private HashMap<Double, String> ShortNumbersSuffixes = new HashMap<Double, String>();
        private String name;

        public WorldGroup(String name) {
            this.name = name;
        }

        public Double getStartingAmount() {
            return StartingAmount;
        }

        public WorldGroup setStartingAmount(Double startingAmount) {
            StartingAmount = startingAmount;
            return this;
        }

        public Double getMinimalAmount() {
            return MinimalAmount;
        }

        public WorldGroup setMinimalAmount(Double minimalAmount) {
            MinimalAmount = minimalAmount;
            return this;
        }

        public Double getMaximumAmount() {
            return MaximumAmount;
        }

        public WorldGroup setMaximumAmount(Double maximumAmount) {
            if (maximumAmount == -1)
                MaximumAmount = Double.MAX_VALUE;
            else
                MaximumAmount = maximumAmount;
            return this;
        }

        public String getCurrencyName() {
            return CurrencyName;
        }

        public WorldGroup setCurrencyName(String currencyName) {
            CurrencyName = currencyName;
            return this;
        }

        public String getCurrencySymbol() {
            return CurrencySymbol;
        }

        public WorldGroup setCurrencySymbol(String currencySymbol) {
            CurrencySymbol = currencySymbol;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCurrencyFormat() {
            return CurrencyFormat;
        }

        public WorldGroup setCurrencyFormat(String currencyFormat) {
            CurrencyFormat = currencyFormat;
            return this;
        }

        public boolean isSwitchPlaces() {
            return switchPlaces;
        }

        public WorldGroup setSwitchPlaces(boolean switchPlaces) {
            this.switchPlaces = switchPlaces;
            return this;
        }

        public String getPlacing() {
            return Placing;
        }

        public WorldGroup setPlacing(String Placing) {
            this.Placing = Placing;
            return this;
        }

        public boolean isUseShortNumbers() {
            return UseShortNumbers;
        }

        public WorldGroup setUseShortNumbers(boolean useShortNumners) {
            UseShortNumbers = useShortNumners;
            return this;
        }

        public HashMap<Double, String> getShortNumbersSuffixes() {
            return ShortNumbersSuffixes;
        }

        public WorldGroup setShortNumbersSuffixes(HashMap<Double, String> shortNumbersSuffixes) {
            ShortNumbersSuffixes = shortNumbersSuffixes;
            return this;
        }

        public Double getMinimalPay() {
            return MinimalPay;
        }

        public WorldGroup setMinimalPay(Double minimalPay) {
            MinimalPay = minimalPay;
            return this;
        }

        public boolean isFractions() {
            return fractions;
        }

        public WorldGroup setFractions(boolean fractions) {
            this.fractions = fractions;
            return this;
        }
    }

    File file = null;
    Writer writer = null;

    public void closeStream() {
        if (writer != null) {
            try {
                writer.flush();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public enum CMIMoneyLogType {
        Unknown, Transfer;

        private boolean enabled;

        CMIMoneyLogType() {
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }

    boolean checkedOldFile = false;
    private boolean recording = false;

    public void moneyLog(CMIUser targetUser, CMIUser sourceUser, double change, CMIMoneyLogType type, String sType) {

    }

    public String getTownyTownPrefix() {
        return townyTownPrefix;
    }

    public void setTownyTownPrefix(String townyTownPrefix) {
        this.townyTownPrefix = townyTownPrefix;
    }

    public String getTownyNationPrefix() {
        return townyNationPrefix;
    }

    public void setTownyNationPrefix(String townyNationPrefix) {
        this.townyNationPrefix = townyNationPrefix;
    }

    public boolean isBalTopIncludeFakes() {
        return BalTopIncludeFakes;
    }

    public boolean isTownyAccount(String playerName) {
        if (playerName == null)
            return false;

        return CMIHookType.Towny.isPresent() && (playerName.startsWith(plugin.getEconomyManager().getTownyTownPrefix()) ||
            playerName.startsWith(plugin.getEconomyManager().getTownyNationPrefix()) ||
            playerName.startsWith(plugin.getEconomyManager().getTownyDebtPrefix()) ||
            playerName.equalsIgnoreCase(plugin.getEconomyManager().getTownyClosedEconomyName()));
    }

    public String getTownyClosedEconomyName() {
        return townyClosed_economy;
    }

    public boolean isBalTopDisplayWithShorts() {
        return BalTopDisplayWithShorts;
    }

    public String getTownyDebtPrefix() {
        return townyDebtPrefix;
    }

    public void setTownyDebtPrefix(String townyDebtPrefix) {
        this.townyDebtPrefix = townyDebtPrefix;
    }

    public boolean isChequePaperRequired() {
        return ChequePaper;
    }

    public boolean isChequeRequiresPermission() {
        return ChequePermission;
    }

    public boolean isChequeInCreative() {
        return ChequeInCreative;
    }

    public boolean isChequeAcceptNotEncoded() {
        return ChequeAcceptNotEncoded;
    }
}
