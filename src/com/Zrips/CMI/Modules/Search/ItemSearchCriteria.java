package com.Zrips.CMI.Modules.Search;

import java.util.Set;
import java.util.regex.Pattern;

public enum ItemSearchCriteria {
    MATERIAL, NAME, LORE, ENCHANT, MODELDATA, POTION, AMOUNT, EXACT, OVERSIZE;

    private static String prefix = "{";
    private static Pattern pname = Pattern.compile("^(?i)(name|n)\\" + prefix);
    private static Pattern plore = Pattern.compile("^(?i)(lore|l)\\" + prefix);
    private static Pattern penchant = Pattern.compile("^(?i)(e)\\" + prefix);
    private static Pattern pmodel = Pattern.compile("^(?i)(custommodeldata|custommodel|cm|cmd)\\" + prefix);

    public static ItemSearchCriteria getByName(String name) {
        return null;
    }

    public static Set<ItemSearchCriteria> getFromString(String criteria) {
        return null;
    }
}
