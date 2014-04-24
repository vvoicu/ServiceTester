package com.junit;

import java.net.UnknownHostException;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import com.helios.connectors.HttpMainProtocol;
import com.helios.connectors.mongo.MongoDevConnector;
import com.helios.persistance.MongoUtils;
import com.helios.tools.ValidatorUtils;


public class BaseTest extends TestCase{
	public MongoDevConnector mongoDev;
	public HttpMainProtocol protocol = new HttpMainProtocol();
	public ValidatorUtils validatorUtils = new ValidatorUtils();
	public MongoUtils mongoUtilus;

	@Before
	public void startComponents(){
		 try {
			mongoDev = new MongoDevConnector();
		} catch (UnknownHostException e) {
			System.out.println("Error: Mule Mongo connection could not be initialized");
			e.printStackTrace();
		}		 
		 try {
			 mongoUtilus = new MongoUtils();
		} catch (UnknownHostException e) {
			System.out.println("Error: Test Mongo connection could not be initialized");
			e.printStackTrace();
		}
		 
		 
	}
	
	@After
	public void closeAll(){
		protocol.close();
	}

}
