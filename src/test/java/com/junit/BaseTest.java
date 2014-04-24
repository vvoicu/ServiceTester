package com.junit;

import java.net.UnknownHostException;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import com.helios.connectors.MainProtocol;
import com.helios.connectors.mongo.MongoConnector;
import com.helios.tools.ValidatorUtils;


public class BaseTest extends TestCase{
	public MongoConnector mongo;
	public MainProtocol protocol = new MainProtocol();
	public ValidatorUtils validatorUtils = new ValidatorUtils();

	@Before
	public void startComponents(){
		 try {
			mongo = new MongoConnector();
		} catch (UnknownHostException e) {
			System.out.println("Error: Mongo connection could not be initialized");
			e.printStackTrace();
		}
	}
	
	@After
	public void closeAll(){
		protocol.close();
	}

}
