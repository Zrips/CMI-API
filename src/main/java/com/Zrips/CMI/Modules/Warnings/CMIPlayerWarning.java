package com.Zrips.CMI.Modules.Warnings;

public class CMIPlayerWarning {

    private String givenBy;
    private Long givenAt;
    private String reason;
    private CMIWarningCategory category;

    public CMIPlayerWarning() {

    }

    public String getGivenBy() {
	return givenBy;
    }

    public void setGivenBy(String givenBy) {
	this.givenBy = givenBy;
    }

    public Long getGivenAt() {
	return givenAt;
    }

    public void setGivenAt(Long givenAt) {
	this.givenAt = givenAt;
    }

    public String getReason() {
	return reason;
    }

    public void setReason(String reason) {
	this.reason = reason;
    }

    public CMIWarningCategory getCategory() {
	return category;
    }

    public void setCategory(CMIWarningCategory category) {
	this.category = category;
    }

}
