package com.Zrips.CMI.commands;

import com.Zrips.CMI.CMI;

public class CMICommand {

    private Cmd cmdClass;
    private String name;
    private CAnnotation anottation;

    private Boolean enabled = null;
    
    private Boolean baseEnabled = true;
    

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
	return "";
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

    public Boolean getBaseEnabled() {
	return baseEnabled;
    }

    public void setBaseEnabled(Boolean baseEnabled) {
	this.baseEnabled = baseEnabled;
    }

}
