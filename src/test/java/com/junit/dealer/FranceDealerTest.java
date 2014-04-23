package com.junit.dealer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.w3c.dom.Document;

import com.helios.connectors.MongoConnector;
import com.helios.services.dealer.france.FranceDealerFormatter;
import com.helios.services.dealer.france.datamodels.DealerModel;
import com.helios.tools.FormatterUtils;
import com.helios.tools.ValidatorUtils;
import com.junit.BaseTest;

@RunWith(JUnit4.class)
public class FranceDealerTest extends BaseTest{
	
	List<Document> docList= new ArrayList<Document>();
	
	//Input data
//	public String url = "http://localhost:8888";
	public String url = "http://localhost:8081";
	
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
	public void verifyFranceDealer() throws Exception{
		
				
//		HttpResponse responseMessage = protocol.sendGet(url, message.toString());
		String myMessage = FormatterUtils.printResutls(formatter.generateFranceData(dModel));
//		docList.add(formatter.generateFranceData(dModel));
//		String myMessage = FormatterUtils.printResutls(formatter.generateDocumentRoot(docList));
		
		HttpResponse responseMessage = protocol.sendGet(url, myMessage);
		
		validatorUtils.printMessage(responseMessage);
		
		System.out.println(responseMessage.getEntity().toString());
//		System.out.println(EntityUtils.toString(responseMessage.getEntity()).toString());
		
		
			
		mongo.displayAllDataSets();
		mongo.displayCollectionNames();
	}

}
