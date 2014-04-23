package com.junit.paprika;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.services.paprika.PaprikaModel;
import com.helios.services.paprika.PaprikaValidator;
import com.junit.BaseTest;


@RunWith(JUnit4.class)
public class PaprikaTest extends BaseTest {

	public PaprikaValidator serviceActions = new PaprikaValidator();
	public String response;
	
	//Input data
	public String url = "http://localhost:8081";
	public PaprikaModel message;
	public String msgValidatrion = "Message";
	

	@Before
	public void dataSetup(){
		//Data Setup for the message to be delivered
		message = new PaprikaModel(true);
		message.setIsPresent("true");
	}
	

	@Test
	public void verifyPaprika() throws Exception{

		//Sending nessage
		HttpResponse responseMessage = protocol.sendGet(url, message.toString());
		response = EntityUtils.toString(responseMessage.getEntity());
		
		//Validate message
		serviceActions.assertMessage(msgValidatrion, response);
	}

	@After
	public void writeReport() throws IllegalStateException, IOException{
		//Write response to xml file - for Debugging
		protocol.writeToFile(response,this.getClass().getSimpleName());
	}
}
