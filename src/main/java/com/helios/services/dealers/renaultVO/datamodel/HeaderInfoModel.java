package com.helios.services.dealers.renaultVO.datamodel;

import com.helios.services.dealers.france.FranceConstants;
import com.helios.services.dealers.renaultVO.RenaultVOConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class HeaderInfoModel {

	private String dateStockDMS;
	private String nbVO;
	private String countryCode;

	/**
	 * Generate all fields with one param - valid or invalid data
	 * 
	 * @param isValid
	 * @throws Exception
	 */
	public HeaderInfoModel(boolean isValid) throws Exception {
		setDateStockDMS(isValid);
		setNbVO(isValid);
		setCountryCode(isValid);
	}

	public String getDateStockDMS() {
		return dateStockDMS;
	}

	public void setDateStockDMS(String dateStockDMS) {
		this.dateStockDMS = dateStockDMS;
	}

	public void setDateStockDMS(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.getRandomDateBetweenDatesRenaultFormat(RenaultVOConstants.RANDOM_DATE_MIN, FranceConstants.RANDOM_DATE_MAX);
		else
			value = FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC);

		this.dateStockDMS = value;
	}

	public String getNbVO() {
		return nbVO;
	}

	public void setNbVO(String nbVO) {
		this.nbVO = nbVO;
	}

	public void setNbVO(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(5, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(10, Mode.ALPHA);

		this.nbVO = value;
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
			value = RenaultVOConstants.HEADER_COUNTRY_CODES[0];
		else
			value = FieldGenerators.generateRandomString(5, Mode.ALPHANUMERIC);

		this.countryCode = value;
	}

}
