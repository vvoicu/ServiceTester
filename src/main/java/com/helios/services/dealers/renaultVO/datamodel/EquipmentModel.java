package com.helios.services.dealers.renaultVO.datamodel;

import java.util.Random;

import com.helios.services.dealers.renaultVO.RenaultVOConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class EquipmentModel {

	private String description;
	private String usedCarNb;
	private String countryCode;
	private String langCode;
	private String title;

	/**
	 * Generate all fields with one param - valid or invalid data
	 * 
	 * @param isValid
	 * @throws Exception
	 */
	public EquipmentModel(boolean isValid) throws Exception {
		setDescription(isValid);
		setUsedCarNb(isValid);
		setCountryCode(isValid);
		setLangCode(isValid);
		setTitle(isValid);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(100, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(105, Mode.NUMERIC);

		this.description = value;
	}

	public String getUsedCarNb() {
		return usedCarNb;
	}

	public void setUsedCarNb(String usedCarNb) {
		this.usedCarNb = usedCarNb;
	}

	public void setUsedCarNb(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.usedCarNb = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCountryCode(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.LANG_COUNTRY_CODES[random.nextInt(RenaultVOConstants.LANG_COUNTRY_CODES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.countryCode = value;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setLangCode(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.LANG_COUNTRY_CODES[random.nextInt(RenaultVOConstants.LANG_COUNTRY_CODES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.langCode = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.NUMERIC);

		this.title = value;
	}

}
