package com.helios.services.dealers.renaultVO;

import java.util.Date;

/**
 * Tags for the xml - This is modeled after the france xml response
 * http://www.renault
 * .fr/dealerlocator/searchservice.action?search=&location=paris
 * &latitudeChosen=&longitudeChosen=&radiusIndex=2
 * 
 * @author vladvoicu
 * 
 */

public class RenaultVOConstants {

	// Custom Data
	@SuppressWarnings("deprecation")
	public static Date RANDOM_DATE_MIN = new Date("1/12/2014");
	@SuppressWarnings("deprecation")
	public static Date RANDOM_DATE_MAX = new Date("20/12/2015");

	public static String[] IS_TRUE_OR_FALSE = { "true", "false" };

	public static final String[] LANG_COUNTRY_CODES = { "uk, de, fr, it, es, nl, be, pt, ch, at, pl, si, hr, sk, cz, hu" };
	public static final String[] TRANSACTION_TYPE_TYPES = { "A", "C", "D", "N" };
	public static final String[] VEHICLE_GENDER_TYPES = { "VP", "VU" };
	public static final String[] YES_OR_NO = { "Y", "N" };
	public static final String[] TRANSMISSION_TYPES = { "A", "M" };
	public static final String[] DOORS_NUMBER = { "2", "4", "5", "6", };
	public static final String[] PICTURE_TYPES = { "D", "E", "I" };
	public static final String[] COUNTRY_CODES = { "FR" };

	// ------------------------------XML FIELDS---------------------------------

	// Wrappers

	public static final String DOC_ROOT = "Stock_VO";
	public static final String HEADER_INFO = "HeaderInfo";
	public static final String VO = "VO";
	public static final String EQUIPMENT_LIST = "EquipmentList";
	public static final String PICTURES_LIST = "EquipmentList";

	// Header Info Attributes
	public static final String DATE_STOCK_DMS = "DateStockDMS";
	public static final String NBVO = "NbVO";
	public static final String COUNTRY_CODE = "CountryCode";

	// Equipment List Attributes
	public static final String DESCRIPTION = "Description";
	public static final String TITLE = "Title";

	// Picture List Attributes
	public static final String PICTURE_NAME = "PictureName";
	public static final String PICTURE_TYPE = "PictureType";

	// VO Attributes
	public static final String TRANSACTION_TYPE = "TransactionType";
	public static final String VEHICLE_REF_CODE = "VehicleRefCode";
	public static final String DEALER_ID = "DealerId";
	public static final String USED_CAR_NB = "UsedCarNb";
	public static final String LANG_CODE = "LangCode";
	public static final String CURRENCY = "Currency";
	public static final String VEHICLE_GENDER = "VehicleGender";
	public static final String SPECIAL_OFFER = "SpecialOffer";
	public static final String VO_MANUFACTURER = "VOManufacturer";
	public static final String BRAND = "Brand";
	public static final String MODEL = "Model";
	public static final String MODEL_FULL = "ModelFull";
	public static final String VERSION = "Version";
	public static final String FUEL = "Fuel";
	public static final String TRIM = "Trim";
	public static final String COLOR = "Color";
	public static final String TRANSMISSION_TYPE = "TransmissionType";
	public static final String MODEL_YEAR = "ModelYear";
	public static final String POWER_DIN = "PowerDIN";
	public static final String FISCAL_CRITERIA = "FiscalCriteria";
	public static final String FIRST_REGISTRATION_DATE = "FirstRegistrationDate";
	public static final String REGISTRATION_NUMBER = "RegistrationNumber";
	public static final String MILEAGE = "Mileage";
	public static final String DISTANCE_UNIT = "DistanceUnit";
	public static final String PVTTC = "PVTTC";
	public static final String WARRANTY = "Warranty";
	public static final String FREE_COMMENT = "FreeComment";
	public static final String SEATS_NUMBER = "SeatsNumber";
	public static final String EXHIBITION_SITE = "ExhibitionSite";
	public static final String NB_DOORS = "NbDoors";
	public static final String RENAULT_EXCELLENCE = "RenaultExcellence";
	public static final String CONTACT_NAME = "ContactName";
	public static final String BRAND_FULL = "BrandFull";
	public static final String VERSION_FULL = "VersionFull";
	public static final String FUEL_FULL = "FuelFull";
	public static final String TRIM_FULL = "TrimFull";
	public static final String COLOR_FULL = "ColorFull";

}
