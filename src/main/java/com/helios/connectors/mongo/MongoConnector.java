package com.helios.connectors.mongo;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.helios.tools.Constants;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


/**
 * MongoConnector Will handle all transactions with the Mule Mongo DB.
 * @author vladvoicu
 *
 */
public class MongoConnector {
	
	private MongoClient mongoClient;
	private DB workingDB;
	
	public MongoConnector() throws UnknownHostException{
		mongoClient = new MongoClient(Constants.Mule_MONGO_URL, Constants.Mule_MONGO_PORT);
	}
	
	public void displayAllDataSets() throws UnknownHostException {
		List<String> dbs = mongoClient.getDatabaseNames();
		for (String dbme : dbs) {
			System.out.println("DBName: " + dbme);
		}
	}
	
	public void displayCollectionNames() throws NumberFormatException, UnknownHostException{
		workingDB = mongoClient.getDB(Constants.Mule_MONGO_DB);		
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
