package com.junit.dealer;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.services.dealer.france.FranceDealerFormatter;
import com.helios.services.dealer.france.datamodels.DealerModel;
import com.helios.services.paprika.PaprikaModel;
import com.junit.BaseTest;

@RunWith(JUnit4.class)
public class FranceDealerTest extends BaseTest{
	
public String response;
	
	//Input data
	public String url = "http://localhost:8081";
//	public PaprikaModel message;
	public String msgValidatrion = "Message";
	public DealerModel dModel;
	public FranceDealerFormatter formatter= new FranceDealerFormatter();
	

	@Before
	public void dataSetup() throws Exception{
		
		dModel = new DealerModel(true);
		//Data Setup for the message to be delivered
//		message = new PaprikaModel(true);
//		message.setIsPresent("true");
	}
	
	@Test
	public void verifyPaprika() throws ParserConfigurationException, IOException{
//		HttpResponse responseMessage = protocol.sendGet(url, message.toString());
		formatter.generateFranceData(dModel);
		
	}

}
