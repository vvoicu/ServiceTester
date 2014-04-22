package com.helios.services.dealer.france;
/**
 * Tags for the xml - This is modeled after the france xml response
 * http://www.renault.fr/dealerlocator/searchservice.action?search=&location=paris&latitudeChosen=&longitudeChosen=&radiusIndex=2
 * @author vladvoicu
 *
 */
public class FranceConstants {
	
	//Dealer fields
	public static String DEALER_TAG = "dealer";
	public static String BIR_ID_TAG = "bir_id";

	public static final String COUNTRY_TAG = "country";
	public static final String DEALER_NAME = "dealer_name";
	public static final String HAS_FIXED_PRICE_TAG = "has_fixedprice";
		
	//Address fields
	public static final String ADR_COMPLETLINE = "complementAddressLine";
	public static final String ADR_CITY = "city";
	public static final String ADR_COUNTRY = "country";
	public static final String ADR_POSTCODE = "post_code";
	public static final String ADR_TEL = "telephone";
	public static final String ADR_FAX = "fax";
	public static final String ADR_LON = "longitude";
	public static final String ADR_LAT = "latitude";
	
	//Services Fields
	public static final String SRV_TAG = "service";
	
	public static final String SRV_NAME = "name";
	public static final String SRV_ID = "id";
	public static final String SRV_IMG = "imgURL";
	
	//Sbol - fields
	public static final String SBOL_TAG = "sbol";
	
	public static final String SBOL_ISAVL = "available";
	public static final String SBOL_ISAVL_VAL = "true";
	
	public static final String SBOL_APPOINTMENTS= "appointments";
	
	//Appointment Fields
	public static final String APO_TAG = "appointment";
	public static final String APO_AVAIL = "available";
	public static final String APO_DAY = "day";
	public static final String APO_START = "start";
	public static final String APO_END = "end";

}
