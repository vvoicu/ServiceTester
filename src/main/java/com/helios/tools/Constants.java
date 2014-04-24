package com.helios.tools;

import java.io.File;

public class Constants {

	
	public static String REPORT_FOLDER = "target" + File.separator;
	
	//Dev Mule MongoDB - configuration
	public static final String DEV_MONGO_URL = "localhost";
//	public static final String DEV_MONGO_URL = "172.22.9.40";
	public static final int DEV_MONGO_PORT = 27017;
	public static final String DEV_MONGO_DB = "test";
	
	//Testing MongoDB - configuration
	public static final String QA_MONGO_URL = "localhost";
	public static final int QA_MONGO_PORT = 27017;
	public static final String QA_MONGO_DB = "test";
	
}
