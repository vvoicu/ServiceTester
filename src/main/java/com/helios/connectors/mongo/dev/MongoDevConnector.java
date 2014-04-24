package com.helios.connectors.mongo.dev;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.helios.tools.Constants;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


/**
 * MongoConnector Will handle all transactions with the Mule Mongo DB Dev environment.
 * Note: Should not use write operaions on this none of the db's (mongo dev).
 * @author vladvoicu
 *
 */
public class MongoDevConnector {
	
	private MongoClient mongoDevClient;
	private DB workingDB;
	
	public MongoDevConnector() throws UnknownHostException{
		mongoDevClient = new MongoClient(Constants.DEV_MONGO_URL, Constants.DEV_MONGO_PORT);
	}
	
	public void displayAllDataSets() throws UnknownHostException {
		List<String> dbs = mongoDevClient.getDatabaseNames();
		for (String dbme : dbs) {
			System.out.println("DBName: " + dbme);
		}
	}
	
	public void displayCollectionNames() throws NumberFormatException, UnknownHostException{
		workingDB = mongoDevClient.getDB(Constants.DEV_MONGO_DB);		
		Set<String> dbCollectionNames = workingDB.getCollectionNames();
		
		for(String nameNow:dbCollectionNames){
			System.out.println("Collection Now: " + nameNow);
			DBCollection collectionNow = workingDB.getCollection(nameNow);
			displayCollection(collectionNow);
		}
	}
	
	
	public void displayCollection(DBCollection collectionNow){
		List<DBObject> list = collectionNow.getIndexInfo();
		for (DBObject o : list) {
		   System.out.println(o);
		}
	}

}
