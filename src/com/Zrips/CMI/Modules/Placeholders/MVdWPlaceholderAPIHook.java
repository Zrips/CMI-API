package com.Zrips.CMI.Modules.Placeholders;

import com.Zrips.CMI.CMI;

public class MVdWPlaceholderAPIHook {

    public MVdWPlaceholderAPIHook(CMI plugin) {
    }

    private static boolean isMetaPlaceHolder(String identifier) {
        return identifier.startsWith("user_meta_");
    }
}
