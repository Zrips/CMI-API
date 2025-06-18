package com.Zrips.CMI.Modules.Economy;

import java.io.File;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class EconomyManager {
    private CMI plugin;
    private boolean Enabled;
    private boolean CustomWorldsEnabled;
    private boolean Confirmation;
    private boolean LogEnabled;
    private List<String> logIgnoredUsers;
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
    private HashMap<String, Double> shortAmountValues;
    private String townyTownPrefix;
    private String townyNationPrefix;
    private String townyDebtPrefix;
    private String townyClosed_economy;
    private Boolean recalculatingTop;
    public final static String CMIDefaultWorld = null;
    HashMap<String, WorldGroup> groups;
    private WorldGroup defaultGroup;
    private VaultManager vmanager;
    SortedMap<Double, UUID> balTop;
    Map<UUID, Double> balTopUsers;
    private Double totalServerMoney;
    Long lastRecalculated;
    boolean locked;
    Map<UUID, baltopUpdateCache> balanceUpdateCache;
    int updateDelay;
    CompletableFuture<Void> recTask;
    DecimalFormat defaultFormat;
    DecimalFormat shortDefaultFormat;
    File file;
    Writer writer;
    boolean checkedOldFile;
    private boolean recording;

    public EconomyManager(CMI plugin) {
    }

    public void setForBalTopRecalculation() {
    }

    public String format(Double money) {
        return null;
    }

    public boolean isVaultEnabled() {
        return false;
    }

    public void removeFromUpdateCache(UUID uuid) {
    }

    public synchronized void updateBalTop(CMIUser user) {
    }

    private void forceUpdateBalTop(CMIUser user) {
    }

    public void recalculateBalTop() {
    }

    private boolean startsWithExcluded(String name) {
        return false;
    }

    public SortedMap<Double, UUID> getBalTopMap() {
        return null;
    }

    public int getBalTopPlace(UUID uuid) {
        return 0;
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
        return null;
    }

    public Double translateMoney(String value) {
        return null;
    }

    public DecimalFormat getShortMoneyFormat() {
        return null;
    }

    public DecimalFormat getMoneyFormat(String worldName) {
        return null;
    }

    public void loadConfig() {
    }

    public boolean isCustomWorldsEnabled() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public VaultManager getVaultManager() {
        return null;
    }

    public boolean isConfirmation() {
        return false;
    }

    public List<String> getBalTopExclude() {
        return null;
    }

    public void setBalTopExclude(List<String> balTopExclude) {
    }

    public Boolean isRecalculatingTop() {
        return null;
    }

    public void setRecalculatingTop(boolean recalculatingTop) {
    }

    public Double getMaxChequeValue() {
        return null;
    }

    public Double getTotalServerMoney() {
        return null;
    }

    public WorldGroup getDefaultGroup() {
        return null;
    }

    public void closeStream() {
    }

    public void moneyLog(CMIUser targetUser, CMIUser sourceUser, double change, CMIMoneyLogType type, String sType) {
    }

    public String getTownyTownPrefix() {
        return null;
    }

    public void setTownyTownPrefix(String townyTownPrefix) {
    }

    public String getTownyNationPrefix() {
        return null;
    }

    public void setTownyNationPrefix(String townyNationPrefix) {
    }

    public boolean isBalTopIncludeFakes() {
        return false;
    }

    public boolean isTownyAccount(String playerName) {
        return false;
    }

    public String getTownyClosedEconomyName() {
        return null;
    }

    public boolean isBalTopDisplayWithShorts() {
        return false;
    }

    public String getTownyDebtPrefix() {
        return null;
    }

    public void setTownyDebtPrefix(String townyDebtPrefix) {
    }

    public boolean isChequePaperRequired() {
        return false;
    }

    public boolean isChequeRequiresPermission() {
        return false;
    }

    public boolean isChequeInCreative() {
        return false;
    }

    public boolean isChequeAcceptNotEncoded() {
        return false;
    }

    class baltopUpdateCache {
        private long time;
        private CMITask task;

        public long getTime() {
            return 0;
        }

        public baltopUpdateCache setTime(long time) {
            return null;
        }

        public CMITask getTask() {
            return null;
        }

        public baltopUpdateCache setTask(CMITask task) {
            return null;
        }
    }

    public enum EconResponseType {
        SUCCESS, FAILURE, NOT_IMPLEMENTED;
    }

    public class CMIEconomyResponse {
        private double amount;
        private double balance;
        private EconResponseType type;

        public CMIEconomyResponse(double amount, double balance, EconResponseType type) {
        }

        public double getAmount() {
            return 0.0;
        }

        public double getBalance() {
            return 0.0;
        }

        public EconResponseType getType() {
            return null;
        }
    }

    public class WorldGroup {
        private Double StartingAmount;
        private Double MinimalAmount;
        private Double MaximumAmount;
        private Double MinimalPay;
        private String CurrencyName;
        private String CurrencySymbol;
        private String CurrencyFormat;
        private String Placing;
        private boolean switchPlaces;
        private boolean UseShortNumbers;
        private boolean fractions;
        private HashMap<Double, String> ShortNumbersSuffixes;
        private String name;

        public WorldGroup(String name) {
        }

        public Double getStartingAmount() {
            return null;
        }

        public WorldGroup setStartingAmount(Double startingAmount) {
            return null;
        }

        public Double getMinimalAmount() {
            return null;
        }

        public WorldGroup setMinimalAmount(Double minimalAmount) {
            return null;
        }

        public Double getMaximumAmount() {
            return null;
        }

        public WorldGroup setMaximumAmount(Double maximumAmount) {
            return null;
        }

        public String getCurrencyName() {
            return null;
        }

        public WorldGroup setCurrencyName(String currencyName) {
            return null;
        }

        public String getCurrencySymbol() {
            return null;
        }

        public WorldGroup setCurrencySymbol(String currencySymbol) {
            return null;
        }

        public String getName() {
            return null;
        }

        public void setName(String name) {
        }

        public String getCurrencyFormat() {
            return null;
        }

        public WorldGroup setCurrencyFormat(String currencyFormat) {
            return null;
        }

        public boolean isSwitchPlaces() {
            return false;
        }

        public WorldGroup setSwitchPlaces(boolean switchPlaces) {
            return null;
        }

        public String getPlacing() {
            return null;
        }

        public WorldGroup setPlacing(String Placing) {
            return null;
        }

        public boolean isUseShortNumbers() {
            return false;
        }

        public WorldGroup setUseShortNumbers(boolean useShortNumners) {
            return null;
        }

        public HashMap<Double, String> getShortNumbersSuffixes() {
            return null;
        }

        public WorldGroup setShortNumbersSuffixes(HashMap<Double, String> shortNumbersSuffixes) {
            return null;
        }

        public Double getMinimalPay() {
            return null;
        }

        public WorldGroup setMinimalPay(Double minimalPay) {
            return null;
        }

        public boolean isFractions() {
            return false;
        }

        public WorldGroup setFractions(boolean fractions) {
            return null;
        }
    }

    public enum CMIMoneyLogType {
        Unknown, Transfer;

        private boolean enabled;

        CMIMoneyLogType() {
        }

        public boolean isEnabled() {
            return false;
        }

        public void setEnabled(boolean enabled) {
        }
    }
}
