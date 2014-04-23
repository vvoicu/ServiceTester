package com.junit;

import junit.framework.TestCase;

import org.junit.After;

import com.helios.connectors.MainProtocol;
import com.helios.connectors.MongoConnector;
import com.helios.tools.ValidatorUtils;


public class BaseTest extends TestCase{

	public MainProtocol protocol = new MainProtocol();

	public MongoConnector mongo = new MongoConnector();
	
	public ValidatorUtils validatorUtils = new ValidatorUtils();
	
	@After
	public void closeAll(){
		protocol.close();
	}

}
