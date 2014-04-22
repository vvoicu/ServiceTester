package com.junit.paprika;

import junit.framework.TestCase;

import org.junit.After;

import com.helios.connectors.MainProtocol;


public class BaseTest extends TestCase {

	public MainProtocol protocol = new MainProtocol();

	
	@After
	public void closeAll(){
		protocol.close();
	}

}
