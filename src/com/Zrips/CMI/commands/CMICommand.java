package com.Zrips.CMI.commands;

import com.Zrips.CMI.CMI;

public class CMICommand {

    private Cmd cmdClass;
    private String name;
    private CAnnotation anottation;

    private Boolean enabled = null;    
    private boolean baseEnabled = true;
    

    public CMICommand(Cmd cmdClass, String name, CAnnotation anottation) {
	this.cmdClass = cmdClass;
	this.name = name;
	this.anottation = anottation;
    }

    public Cmd getCmdClass() {
	return cmdClass;
    }

    public CMICommand setCmdClass(Cmd cmdClass) {
	this.cmdClass = cmdClass;
	return this;
    }

    public String getName() {
	return name;
    }

    public CMICommand setName(String name) {
	this.name = name;
	return this;
    }

    public CAnnotation getAnottation() {
	return anottation;
    }

    public String getTranslatedArgs() {
        return null;
    }

    public void setAnottation(CAnnotation anottation) {
	this.anottation = anottation;
    }

    public Boolean getEnabled() {
	return enabled;
    }

    public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
    }

    public boolean getBaseEnabled() {
	return baseEnabled;
    }

    public void setBaseEnabled(boolean baseEnabled) {
	this.baseEnabled = baseEnabled;
    }

}
