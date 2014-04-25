package com.helios.services.dealers.france;

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

public class FranceConstants {

	// Custom Data
	@SuppressWarnings("deprecation")
	public static Date RANDOM_DATE_MIN = new Date("1/12/2014");
	@SuppressWarnings("deprecation")
	public static Date RANDOM_DATE_MAX = new Date("20/12/2015");

	public static String[] IS_TRUE_OR_FALSE = { "true", "false" };

	public static String[] BRAND_TAGS = { "dacia", "renault", "nissan" };
	public static String[] BRAND_TYPES = { "MINOR", "MAJOR" };
	public static String[] SERVICE_NAMES = { "VENTE Á CLIENTS PROFESSIONNELS", "ATELIER MÉCANIQUE", "MAGASIN PIÈCES DE RECHANGE", "BOUTIQUE" };

	// ------------------------------XML FIELDS----------------//
	// Wrappers

	public static final String DOC_ROOT = "search_result";
	public static final String DOC_DEALERS = "dealers";

	// Dealer fields
	public static String DEALER_TAG = "dealer";
	public static String BIR_ID_TAG = "bir_id";

	public static final String COUNTRY_TAG = "country";
	public static final String DEALER_NAME = "dealer_name";
	public static final String HAS_FIXED_PRICE_TAG = "has_fixedprice";

	public static final String SERVICES_TAG = "services";

	public static final String DISTANCE = "distance";

	// Address fields
	public static final String ADR_TAG = "address";
	public static final String ADR_COMPLETLINE = "complementAddressLine";
	public static final String ADR_CITY = "city";
	public static final String ADR_COUNTRY = "country";
	public static final String ADR_POSTCODE = "post_code";
	public static final String ADR_TEL = "telephone";
	public static final String ADR_FAX = "fax";
	public static final String ADR_LON = "longitude";
	public static final String ADR_LAT = "latitude";

	// Services Fields
	public static final String SRV_TAG = "service";

	public static final String SRV_NAME = "name";
	public static final String SRV_ID = "id";
	public static final String SRV_IMG = "imgURL";

	// Sbol - fields
	public static final String SBOL_TAG = "sbol";

	public static final String SBOL_ISAVL = "available";
	public static final String SBOL_ISAVL_VAL = "true";

	public static final String SBOL_APPOINTMENTS = "appointments";

	// Appointment Fields
	public static final String APO_TAG = "appointment";
	public static final String APOS_TAG = "appointments";
	public static final String APO_AVAIL = "available";
	public static final String APO_DAY = "day";
	public static final String APO_START = "start";
	public static final String APO_END = "end";

}
