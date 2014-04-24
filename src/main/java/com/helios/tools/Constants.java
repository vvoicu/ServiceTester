package com.helios.tools;

import java.io.File;

public class Constants {

	
	public static String REPORT_FOLDER = "target" + File.separator;
	
	//Mule MongoDB - configuration
	public static final String Mule_MONGO_URL = "172.22.9.40";
	public static final int Mule_MONGO_PORT = 27017;
	public static final String Mule_MONGO_DB = "test";
	
	//Testing MongoDB - configuration
	public static final String TDD_MONGO_URL = "localhost";
	public static final int TDD_MONGO_PORT = 27017;
	public static final String TDD_MONGO_DB = "test";
	
}
