package com.helios.services.dealers.france;

import java.net.UnknownHostException;

import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.tools.Constants;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class FranceDealerPersist extends MongoQAConnector{

	public FranceDealerPersist() throws UnknownHostException {
		super();
	}
	
	
	public static void saveFranceDealer(DealerModel dModel,String testName){
//		List<AddressModel> addressezz = dModel.getAddressList();		
//		//TODO Might Break due to multiple entries on same tag
//		for(AddressModel addressNow: addressezz){
//			document.put(
//					FranceConstants.ADR_TAG,
//					new BasicDBObject(FranceConstants.ADR_COMPLETLINE, addressNow.getComplementAddressLine())
//					.append(FranceConstants.ADR_CITY,addressNow.getCity())
//					.append(FranceConstants.ADR_COUNTRY, addressNow.getCountry())
//					.append(FranceConstants.ADR_POSTCODE, addressNow.getPost_code())
//					.append(FranceConstants.ADR_TEL, addressNow.getTelephone())
//					.append(FranceConstants.ADR_FAX, addressNow.getFax())
//					.append(FranceConstants.ADR_LON, addressNow.getLongitude())
//					.append(FranceConstants.ADR_LAT, addressNow.getLongitude()));
//		}
		
		//-------------------------------------
//		workingDB = mongoClient.getDB(Constants.TDD_MONGO_DB);
		workingDB = mongoQaClient.getDB(testName);
		
		DBCollection table = workingDB.getCollection(FranceConstants.DEALER_TAG);
		BasicDBObject document = new BasicDBObject();
		document.put(FranceConstants.BIR_ID_TAG, dModel.getBir_id());
		document.put(FranceConstants.COUNTRY_TAG, dModel.getCountry());
		document.put(FranceConstants.DEALER_NAME, dModel.getDealer_name());
		document.put(FranceConstants.HAS_FIXED_PRICE_TAG, dModel.getHas_fixedprice());
		document.put(FranceConstants.DISTANCE, dModel.getDistance());	
		table.insert(document);		
		
//		table = workingDB.getCollection(FranceConstants.SERVICES_TAG);
		
	}
	
	public static DealerModel getFranceDealear(String testName) {
		DealerModel result = null;
		workingDB = mongoQaClient.getDB(Constants.TDD_MONGO_DB);
//		DBCollection table = workingDB.getCollection(testName);
		DBCursor cursor = workingDB.getCollection(testName).find();
		
		
		try {
		   while(cursor.hasNext()) {
		       System.out.println(cursor.next());
		       result = (DealerModel) cursor.next().get("data");
		   }
		} finally {
		   cursor.close();
		}
		
		return result;
	}

}
