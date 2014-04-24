package com.helios.persistance;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.helios.services.dealer.france.datamodels.DealerModel;
import com.helios.tools.Constants;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoUtils {
	
	private MongoClient mongoClient;
	private DB workingDB;
	
	public MongoUtils() throws UnknownHostException{
		mongoClient = new MongoClient(Constants.TDD_MONGO_URL, Constants.TDD_MONGO_PORT);
	}
	

	public void saveFranceDealer(DealerModel dModel,String testName){
		workingDB = mongoClient.getDB(Constants.TDD_MONGO_DB);
		
		
		DBCollection table = workingDB.getCollection(testName);
		BasicDBObject document = new BasicDBObject();
		document.put("Bir_id", dModel.getBir_id());
		document.put("country", dModel.getCountry());
		table.insert(document);
		
//		workingDB.getCollection(testName).insert(document);
		
	}
	
	
	
	public void displayCollectionNames() throws NumberFormatException, UnknownHostException{
		workingDB = mongoClient.getDB(Constants.TDD_MONGO_DB);		
		Set<String> dbCollectionNames = workingDB.getCollectionNames();
		
		for(String nameNow:dbCollectionNames){
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


	public void displayCollection(DBCollection collectionNow){
		List<DBObject> list = collectionNow.getIndexInfo();
		for (DBObject o : list) {
		   System.out.println(o);
		   System.out.println("keys: " + o.keySet());
		}
	}
	
	public void displayItem(){
		workingDB = mongoClient.getDB(Constants.TDD_MONGO_DB);
		BasicDBObject query = new BasicDBObject("", 1);

//		DBCursor cursor = workingDB.getCollection(Constants.TDD_MONGO_DB).find(query);
//		DBCursor cursor = workingDB.getCollection(Constants.TDD_MONGO_DB).find(query);

		System.out.println("DispCOll: " + workingDB.getCollection("com.junit.paprika.LocalMongoTest"));
		
		
		System.out.println("DispCOll count: " +workingDB.getCollection("com.junit.paprika.LocalMongoTest").count());
		
		DBCursor cursor = workingDB.getCollection("com.junit.paprika.LocalMongoTest").find();
		try {
		   while(cursor.hasNext()) {
		       System.out.println(cursor.next());
		   }
		} finally {
		   cursor.close();
		}
	}

}
