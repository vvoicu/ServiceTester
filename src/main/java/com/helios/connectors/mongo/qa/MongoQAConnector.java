package com.helios.connectors.mongo.qa;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.helios.services.dealers.france.FranceConstants;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.services.dealers.renaultVO.datamodel.HeaderInfoModel;
import com.helios.services.dealers.renaultVO.datamodel.VOModel;
import com.helios.tools.Constants;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * This file is should write test data to a MongoDb. Note: On the
 * MongoDevConnector should not perform write data operations.
 * 
 * @author vladvoicu
 * 
 */
public class MongoQAConnector {

	protected static MongoClient mongoQaClient;
	protected static DB workingDB;
	protected static DB db;

	public MongoQAConnector() throws UnknownHostException {
		mongoQaClient = new MongoClient(Constants.QA_MONGO_URL, Constants.QA_MONGO_PORT);
	}

	public void displayCollectionNames() throws NumberFormatException, UnknownHostException {
		workingDB = mongoQaClient.getDB(Constants.QA_MONGO_DB);
		Set<String> dbCollectionNames = workingDB.getCollectionNames();

		for (String nameNow : dbCollectionNames) {
			System.out.println("Collection Now: " + nameNow);
			DBCollection collectionNow = workingDB.getCollection(nameNow);
			DB extra = collectionNow.getDB();
			displayCollection(collectionNow);
			displayDBData(extra);
		}
	}

	private void displayDBData(DB extra) {
		System.out.println("Extra: " + extra.getName());
		System.out.println("Extra: " + extra.getCollectionNames());

	}

	public void displayCollection(DBCollection collectionNow) {
		List<DBObject> list = collectionNow.getIndexInfo();
		for (DBObject o : list) {
			System.out.println(o);
			System.out.println("keys: " + o.keySet());
		}
	}

	public long hasEntries(String name) {
		workingDB = mongoQaClient.getDB(name);
		long result = 0;

		if (workingDB.getCollection(FranceConstants.DEALER_TAG).count() >= 0) {
			result = workingDB.getCollection(FranceConstants.DEALER_TAG).count();
		}

		return result;
	}

	// ------------------------

	public static void saveFranceDealer(DealerModel dModel, String testName) {

		workingDB = mongoQaClient.getDB(testName);

		DBCollection table = workingDB.getCollection(FranceConstants.DEALER_TAG);
		BasicDBObject document = new BasicDBObject();
		document.put(FranceConstants.BIR_ID_TAG, dModel.getBir_id());
		document.put(FranceConstants.COUNTRY_TAG, dModel.getCountry());
		document.put(FranceConstants.DEALER_NAME, dModel.getDealer_name());
		document.put(FranceConstants.HAS_FIXED_PRICE_TAG, dModel.getHas_fixedprice());
		document.put(FranceConstants.DISTANCE, dModel.getDistance());
		table.insert(document);

	}

	public static DealerModel getFranceDealear(String testName) {
		DBObject dbObject = null;
		DealerModel result = new DealerModel();
		workingDB = mongoQaClient.getDB(testName);
		DBCursor cursor = workingDB.getCollection(FranceConstants.DEALER_TAG).find();

		try {
			while (cursor.hasNext()) {
				dbObject = cursor.next();
				System.out.println("DDIT : " + dbObject.get(FranceConstants.BIR_ID_TAG).toString());
				result.setBir_id(dbObject.get(FranceConstants.BIR_ID_TAG).toString());
				result.setCountry(dbObject.get(FranceConstants.COUNTRY_TAG).toString());
				result.setDealer_name(dbObject.get(FranceConstants.DEALER_NAME).toString());
				result.setHas_fixedprice(dbObject.get(FranceConstants.HAS_FIXED_PRICE_TAG).toString());
				result.setDistance(dbObject.get(FranceConstants.DISTANCE).toString());
			}
		} finally {
			cursor.close();
		}

		return result;
	}

	// ---------------------- tibi play ----------------------------

	public static void writeInfoInMongoDB(VOModel dModel, String dbName) {

		db = mongoQaClient.getDB(dbName);

		// DBCollection dbCollection = db.getCollection("Stock_VO");
		DBCollection dbCollection2 = db.getCollection("HeaderInfo");
		BasicDBObject document = new BasicDBObject();
		document.put("NbVO", "30239");
		document.put("CountryCode", "fr");
		dbCollection2.insert(document);

	}

	public static HeaderInfoModel readInfoFromMongoDB(String dbName) {
		DBObject dbObject = null;
		HeaderInfoModel result = new HeaderInfoModel();
		db = mongoQaClient.getDB(dbName);
		DBCursor dbCursor = db.getCollection("HeaderInfo").find();

		try {
			while (dbCursor.hasNext()) {
				dbObject = dbCursor.next();
				System.out.println("field : " + dbObject.get("NbVO").toString());
				System.out.println("field : " + dbObject.get("CountryCode").toString());
				result.setNbVO(dbObject.get("NbVO").toString());
				result.setCountryCode(dbObject.get("CountryCode").toString());
			}
		} finally {
			dbCursor.close();
		}

		return result;
	}
}
