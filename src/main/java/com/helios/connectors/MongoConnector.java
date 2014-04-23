package com.helios.connectors;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

public class MongoConnector {

	public void displayAllDataSets() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("172.22.9.40", 27017);
		DB db = mongoClient.getDB("test");
		// boolean auth = db.authenticate("username", "password".toCharArray());

		List<String> dbs = mongoClient.getDatabaseNames();
		for (String dbme : dbs) {
			System.out.println(dbme);
		}
	}

}
