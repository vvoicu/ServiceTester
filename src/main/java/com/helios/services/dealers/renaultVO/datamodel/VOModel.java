package com.helios.services.dealers.renaultVO.datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.helios.services.dealers.renaultVO.RenaultVOConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

// TO DOOOOOO !!!!!! - add setters for valid/invalid fields (once we confirm what is considered valid and what not)

public class VOModel {

	private String transactionType;
	private String vehicleRefCode;
	private String dealerId;
	private String usedCarNb;
	private String langCode;
	private String currency;
	private String vehicleGender;
	private String specialOffer;
	private String vOManufacturer;
	private String brand;
	private String model;
	private String modelFull;
	private String version;
	private String fuel;
	private String trim;
	private String color;
	private String transmissionType;
	private String modelYear;
	private String powerDIN;
	private String fiscalCriteria;
	private String firstRegistrationDate;
	private String registrationNumber;
	private String mileage;
	private String distanceUnit;
	private String pVTTC;
	private String warranty;
	private String freeComment;
	private String seatsNumber;
	private String exhibitionSite;
	private String nbDoors;
	private String renaultExcellence;
	private String contactName;
	private String brandFull;
	private String versionFull;
	private String fuelFull;
	private String trimFull;
	private String colorFull;

	private List<EquipmentModel> equipmentList = new ArrayList<EquipmentModel>();
	private HeaderInfoModel headerInfoModel;

	public VOModel() {
	}

	/**
	 * Generate all fields with one param - valid or invalid data
	 * 
	 * @param isValid
	 * @throws Exception
	 */
	public VOModel(boolean isValid) throws Exception {
		setTransactionType(isValid);
		setVehicleRefCode(isValid);
		setDealerId(isValid);
		setUsedCarNb(isValid);
		setLangCode(isValid);
		setCurrency(isValid);
		setVehicleGender(isValid);
		setSpecialOffer(isValid);
		setvOManufacturer(isValid);
		setBrand(isValid);
		setModel(isValid);
		setModelFull(isValid);
		setVersion(isValid);
		setFuel(isValid);
		setTrim(isValid);
		setColor(isValid);
		setTransmissionType(isValid);
		setModelYear(isValid);
		setPowerDIN(isValid);
		setFiscalCriteria(isValid);
		setFirstRegistrationDate(isValid);
		setRegistrationNumber(isValid);
		setMileage(isValid);
		setDistanceUnit(isValid);
		setpVTTC(isValid);
		setWarranty(isValid);
		setFreeComment(isValid);
		setSeatsNumber(isValid);
		setExhibitionSite(isValid);
		setNbDoors(isValid);
		setRenaultExcellence(isValid);
		setContactName(isValid);
		setBrandFull(isValid);
		setVersionFull(isValid);
		setFuelFull(isValid);
		setTrimFull(isValid);
		setColorFull(isValid);

		EquipmentModel equipmentItem = new EquipmentModel(isValid);
		equipmentList.add(equipmentItem);

		headerInfoModel = new HeaderInfoModel(isValid);

	}

	public HeaderInfoModel getHeaderInfo() {
		return headerInfoModel;
	}

	public List<EquipmentModel> getEquipmentList() {
		return equipmentList;
	}

	public void addEquipmentToList(EquipmentModel eModel) {
		equipmentList.add(eModel);
	}

	public void setEquipmentList(List<EquipmentModel> eList) {
		equipmentList = eList;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public void setTransactionType(boolean isValid) throws Exception {
		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.TRANSACTION_TYPE_TYPES[random.nextInt(RenaultVOConstants.TRANSACTION_TYPE_TYPES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.transactionType = value;
	}

	public String getVehicleRefCode() {
		return vehicleRefCode;
	}

	public void setVehicleRefCode(String vehicleRefCode) {
		this.vehicleRefCode = vehicleRefCode;
	}

	public void setVehicleRefCode(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.vehicleRefCode = value;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public void setDealerId(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(8, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.dealerId = value;
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
			value = getDealerId() + "_VO" + FieldGenerators.generateRandomString(5, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.usedCarNb = value;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCurrency(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(3, Mode.ALPHA);
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.currency = value;
	}

	public String getVehicleGender() {
		return vehicleGender;
	}

	public void setVehicleGender(String vehicleGender) {
		this.vehicleGender = vehicleGender;
	}

	public void setVehicleGender(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.VEHICLE_GENDER_TYPES[random.nextInt(RenaultVOConstants.VEHICLE_GENDER_TYPES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.vehicleGender = value;
	}

	public String getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(String specialOffer) {
		this.specialOffer = specialOffer;
	}

	public void setSpecialOffer(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.YES_OR_NO[random.nextInt(RenaultVOConstants.YES_OR_NO.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.specialOffer = value;
	}

	public String getvOManufacturer() {
		return vOManufacturer;
	}

	public void setvOManufacturer(String vOManufacturer) {
		this.vOManufacturer = vOManufacturer;
	}

	public void setvOManufacturer(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.YES_OR_NO[random.nextInt(RenaultVOConstants.YES_OR_NO.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.vOManufacturer = value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setBrand(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(30, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(35, Mode.ALPHA);

		this.brand = value;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setModel(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(25, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(30, Mode.ALPHA);

		this.model = value;
	}

	public String getModelFull() {
		return modelFull;
	}

	public void setModelFull(String modelFull) {
		this.modelFull = modelFull;
	}

	public void setModelFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(100, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(105, Mode.ALPHA);

		this.modelFull = value;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setVersion(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.version = value;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public void setFuel(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.fuel = value;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public void setTrim(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);
		this.trim = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setColor(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.color = value;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public void setTransmissionType(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.TRANSMISSION_TYPES[random.nextInt(RenaultVOConstants.TRANSMISSION_TYPES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.transmissionType = value;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public void setModelYear(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(4, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.modelYear = value;
	}

	public String getPowerDIN() {
		return powerDIN;
	}

	public void setPowerDIN(String powerDIN) {
		this.powerDIN = powerDIN;
	}

	public void setPowerDIN(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.powerDIN = value;
	}

	public String getFiscalCriteria() {
		return fiscalCriteria;
	}

	public void setFiscalCriteria(String fiscalCriteria) {
		this.fiscalCriteria = fiscalCriteria;
	}

	public void setFiscalCriteria(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.fiscalCriteria = value;
	}

	public String getFirstRegistrationDate() {
		return firstRegistrationDate;
	}

	public void setFirstRegistrationDate(String firstRegistrationDate) {
		this.firstRegistrationDate = firstRegistrationDate;
	}

	public void setFirstRegistrationDate(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(8, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.firstRegistrationDate = value;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setRegistrationNumber(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.registrationNumber = value;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public void setMileage(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(6, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.mileage = value;
	}

	public String getDistanceUnit() {
		return distanceUnit;
	}

	public void setDistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}

	public void setDistanceUnit(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.distanceUnit = value;
	}

	public String getpVTTC() {
		return pVTTC;
	}

	public void setpVTTC(String pVTTC) {
		this.pVTTC = pVTTC;
	}

	public void setpVTTC(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.pVTTC = value;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public void setWarranty(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(40, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(45, Mode.ALPHA);

		this.warranty = value;
	}

	public String getFreeComment() {
		return freeComment;
	}

	public void setFreeComment(String freeComment) {
		this.freeComment = freeComment;
	}

	public void setFreeComment(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(255, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(260, Mode.ALPHA);

		this.freeComment = value;
	}

	public String getSeatsNumber() {
		return seatsNumber;
	}

	public void setSeatsNumber(String seatsNumber) {
		this.seatsNumber = seatsNumber;
	}

	public void setSeatsNumber(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		else
			value = FieldGenerators.generateRandomString(19, Mode.ALPHA);

		this.seatsNumber = value;
	}

	public String getExhibitionSite() {
		return exhibitionSite;
	}

	public void setExhibitionSite(String exhibitionSite) {
		this.exhibitionSite = exhibitionSite;
	}

	public void setExhibitionSite(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(60, Mode.ALPHA);

		this.exhibitionSite = value;
	}

	public String getNbDoors() {
		return nbDoors;
	}

	public void setNbDoors(String nbDoors) {
		this.nbDoors = nbDoors;
	}

	public void setNbDoors(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.DOORS_NUMBER[random.nextInt(RenaultVOConstants.DOORS_NUMBER.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);
		this.nbDoors = value;
	}

	public String getRenaultExcellence() {
		return renaultExcellence;
	}

	public void setRenaultExcellence(String renaultExcellence) {
		this.renaultExcellence = renaultExcellence;
	}

	public void setRenaultExcellence(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.YES_OR_NO[random.nextInt(RenaultVOConstants.YES_OR_NO.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.renaultExcellence = value;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactName(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(255, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(260, Mode.ALPHA);

		this.contactName = value;
	}

	public String getBrandFull() {
		return brandFull;
	}

	public void setBrandFull(String brandFull) {
		this.brandFull = brandFull;
	}

	public void setBrandFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(60, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(65, Mode.ALPHA);

		this.brandFull = value;
	}

	public String getVersionFull() {
		return versionFull;
	}

	public void setVersionFull(String versionFull) {
		this.versionFull = versionFull;
	}

	public void setVersionFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(55, Mode.ALPHA);

		this.versionFull = value;
	}

	public String getFuelFull() {
		return fuelFull;
	}

	public void setFuelFull(String fuelFull) {
		this.fuelFull = fuelFull;
	}

	public void setFuelFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(55, Mode.ALPHA);

		this.fuelFull = value;
	}

	public String getTrimFull() {
		return trimFull;
	}

	public void setTrimFull(String trimFull) {
		this.trimFull = trimFull;
	}

	public void setTrimFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(55, Mode.ALPHA);

		this.trimFull = value;
	}

	public String getColorFull() {
		return colorFull;
	}

	public void setColorFull(String colorFull) {
		this.colorFull = colorFull;
	}

	public void setColorFull(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(55, Mode.ALPHA);

		this.colorFull = value;
	}

}
