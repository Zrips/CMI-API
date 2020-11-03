package com.Zrips.CMI.Modules.GeoIP;

public class IPLocation {
    private String countryCode;
    private String countryName;
    private String region;
    private String city;
    private String postalCode;

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    public String getCountryName() {
	return countryName;
    }

    public void setCountryName(String countryName) {
	this.countryName = countryName;
    }

    public String getRegion() {
	return region;
    }

    public void setRegion(String region) {
	this.region = region;
    }

    public String getCity() {
	return city == null ? "" : city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }
}
