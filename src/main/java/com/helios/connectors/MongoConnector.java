package com.helios.connectors;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.helios.tools.Constants;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoConnector {
	
	MongoClient mongoClient;
	private DB workingDB;
	

	public void displayAllDataSets() throws UnknownHostException {
		mongoClient = new MongoClient("172.22.9.40", 27017);
//		workingDB = mongoClient.getDB(Constants.MONGO_DB);

		List<String> dbs = mongoClient.getDatabaseNames();
		for (String dbme : dbs) {
			System.out.println(dbme);
		}
	}
	
	public void displayCollectionNames() throws NumberFormatException, UnknownHostException{
		mongoClient = new MongoClient("172.22.9.40", 27017);
		workingDB = mongoClient.getDB(Constants.MONGO_DB);
		
		Set<String> dbCollectionNames = workingDB.getCollectionNames();
		
		for(String nameNow:dbCollectionNames){
			System.out.println("Name Now: " + nameNow);
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
