package com.Zrips.CMI.Modules.Logs;

import java.util.HashSet;
import java.util.Set;

import com.Zrips.CMI.CMI;

public class CMILogManager {

    Set<CMILogType> enabledLogs = new HashSet<CMILogType>();

    boolean enabledDebug = false;

    public CMILogManager() {
    }

    public void print(CMIDebug log) {
    }

}
