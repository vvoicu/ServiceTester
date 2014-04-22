package com.helios.services.dealer.france.datamodels;

public class AddressModel {
	
	/**
	 * <complementAddressLine>96 R AMELOT</complementAddressLine>
	 * <city>PARIS 11</city>
	 * <country>FR</country>
 	 * <post_code>75011</post_code>
	 * <telephone>01 49 23 55 55</telephone>
	 * <fax>01 49 23 54 20</fax>
	 * <longitude>142.156206</longitude>
	 * <latitude>2931.319884</latitude>
	 */
	
	private String complementAddressLine;
	private String city;
	private String country;
	private String post_code;
	private String telephone;
	private String fax;
	private String longitude;
	private String latitude;
	
	public String getComplementAddressLine() {
		return complementAddressLine;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getPost_code() {
		return post_code;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getFax() {
		return fax;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	
	
	public void setComplementAddressLine(String complementAddressLine) {
		this.complementAddressLine = complementAddressLine;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	

}
