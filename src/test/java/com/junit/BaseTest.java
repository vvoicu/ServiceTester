package com.junit;

import java.net.UnknownHostException;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import com.helios.connectors.http.HttpMainProtocol;
import com.helios.connectors.mongo.dev.MongoDevConnector;
import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.tools.utils.ValidatorUtils;


public class BaseTest extends TestCase{
	public MongoDevConnector mongoDev;
	public HttpMainProtocol protocol = new HttpMainProtocol();
	public ValidatorUtils validatorUtils = new ValidatorUtils();
	public MongoQAConnector mongoQA;

	@Before
	public void startComponents(){
		 try {
			mongoDev = new MongoDevConnector();
		} catch (UnknownHostException e) {
			System.out.println("Error: Dev Mongo connection could not be initialized");
			e.printStackTrace();
		}		 
		 try {
			 mongoQA = new MongoQAConnector();
		} catch (UnknownHostException e) {
			System.out.println("Error: QA Mongo connection could not be initialized");
			e.printStackTrace();
		}
		 
		 
	}
	
	@After
	public void closeAll(){
		protocol.close();
	}

}
