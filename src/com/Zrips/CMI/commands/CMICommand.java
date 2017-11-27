package com.Zrips.CMI.commands;

public class CMICommand {

    private Cmd cmdClass;
    private String name;
    private boolean isHidden = false;
    private CAnnotation anottation;

    public CMICommand(Cmd cmdClass, String name, CAnnotation anottation) {
	this(cmdClass, name, anottation, false);
    }

    public CMICommand(Cmd cmdClass, String name, CAnnotation anottation, boolean isHidden) {
	this.cmdClass = cmdClass;
	this.name = name;
	this.anottation = anottation;
	this.isHidden = isHidden;
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

    public void setAnottation(CAnnotation anottation) {
	this.anottation = anottation;
    }

    public boolean isHidden() {
	return isHidden;
    }

    public void setHidden(boolean isHidden) {
	this.isHidden = isHidden;
    }

}
