package com.Zrips.CMI.Modules.Ranks;

public class InformTimer {

    private Long nextCheck;
    private Long timesInformed = 0L;

    public InformTimer() {
    }

    public InformTimer(long nextCheck) {
	this.nextCheck = nextCheck;
    }

    public Long getNextCheck() {
	return nextCheck;
    }

    public void setNextCheck(Long nextCheck) {
	this.nextCheck = nextCheck;
    }

    public Long getTimesInformed() {
	return timesInformed;
    }

    public void resetTimesInformed() {
	this.timesInformed = 0L;
    }
    
    public void addTimesInformed() {
	this.timesInformed++;
    }

}
