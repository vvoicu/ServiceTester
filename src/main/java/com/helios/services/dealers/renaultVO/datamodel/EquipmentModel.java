package com.helios.services.dealers.renaultVO.datamodel;

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
			value = FieldGenerators.generateRandomString(3, Mode.ALPHA_CAPS);
		else
			value = FieldGenerators.generateRandomString(19, Mode.NUMERIC);

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
			value = FieldGenerators.generateRandomString(8, Mode.NUMERIC) + "_VO" + FieldGenerators.generateRandomString(5, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

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

		if (isValid)
			value = RenaultVOConstants.COUNTRY_CODES[0];
		else
			value = FieldGenerators.generateRandomString(5, Mode.NUMERIC);

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

		if (isValid)
			value = RenaultVOConstants.LANG_CODES[0];
		else
			value = FieldGenerators.generateRandomString(5, Mode.NUMERIC);

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
			value = FieldGenerators.generateRandomString(3, Mode.ALPHA_CAPS);
		else
			value = FieldGenerators.generateRandomString(19, Mode.NUMERIC);

		this.title = value;
	}

}
