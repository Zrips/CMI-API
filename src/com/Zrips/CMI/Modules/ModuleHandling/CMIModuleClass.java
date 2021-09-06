package com.Zrips.CMI.Modules.ModuleHandling;

import net.Zrips.CMILib.Version.Version;

public class CMIModuleClass {
    private Class<?> listener;
    private Version from = null;
    private Version to = null;

    public CMIModuleClass(Class<?> listener) {
	this(listener, null, null);
    }

    public CMIModuleClass(Class<?> listener, Version from) {
	this(listener, from, null);
    }

    public CMIModuleClass(Class<?> listener, Version from, Version to) {
	this.listener = listener;
	this.from = from;
	this.to = to;
    }

    public Version getFrom() {
	return from;
    }

    public Version getTo() {
	return to;
    }

    public Class<?> getListener() {
	return listener;
    }
}
