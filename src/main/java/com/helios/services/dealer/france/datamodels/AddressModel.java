package com.helios.services.dealer.france.datamodels;

import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class AddressModel {

	/**
	 * <complementAddressLine>96 R AMELOT</complementAddressLine> <city>PARIS
	 * 11</city> <country>FR</country> <post_code>75011</post_code>
	 * <telephone>01 49 23 55 55</telephone> <fax>01 49 23 54 20</fax>
	 * <longitude>142.156206</longitude> <latitude>2931.319884</latitude>
	 */

	private String complementAddressLine;
	private String city;
	private String country;
	private String post_code;
	private String telephone;
	private String fax;
	private String longitude;
	private String latitude;
	
	/**
	 * Generate all fields with one param -  valid or invalid data
	 * @param isValid
	 * @throws Exception
	 */
	public AddressModel(boolean isValid) throws Exception{
		setComplementAddressLine(isValid);
		setCity(isValid);
		setCountry(isValid);
		setPost_code(isValid);
		setTelephone(isValid);
		setFax(isValid);
		setLongitude(isValid);
		setLatitude(isValid);
	}

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

	public void setComplementAddressLine(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.NUMERIC);

		this.complementAddressLine = value;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCity(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.NUMERIC);

		this.city = value;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountry(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.NUMERIC);

		this.country = value;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public void setPost_code(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHANUMERIC);

		this.post_code = value;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setTelephone(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHANUMERIC);

		this.telephone = value;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setFax(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHANUMERIC);

		this.fax = value;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setLongitude(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(3, Mode.NUMERIC) + "." + FieldGenerators.generateRandomString(7, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHANUMERIC);
		
		this.longitude = value;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setLatitude(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(3, Mode.NUMERIC) + "." + FieldGenerators.generateRandomString(7, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHANUMERIC);
		
		this.latitude = value;
	}

}
