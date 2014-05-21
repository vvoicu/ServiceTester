package com.junit.dealer;

import org.apache.http.HttpResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.w3c.dom.Document;

import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.services.dealers.france.FranceDealerFormatter;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.tools.utils.FormatterUtils;
import com.junit.BaseTest;
import com.mongodb.BasicDBObject;

@RunWith(JUnit4.class)
public class FranceDealearAsyncOneTest extends BaseTest {

//	public String url = "http://localhost:8081";
	public String url = "http://localhost:8888";
	public DealerModel dModel;
	public FranceDealerFormatter formatter = new FranceDealerFormatter();

	@Before
	public void dataSetup() throws Exception {

		if (mongoQA.hasEntries(this.getClass().getSimpleName()) > 0) {
			dModel = MongoQAConnector.getFranceDealear(this.getClass().getSimpleName());
			System.out.println("Data has been retrieved from the QA Mongo DB");

		} else {
			dModel = new DealerModel(true);
			MongoQAConnector.saveFranceDealer(dModel, this.getClass().getSimpleName());
			System.out.println("Data has been generated and saved to QA Mongo DB");
		}
	}

	@Test
	public void testDataPersistanceRule() throws Exception {

		String myMessage = FormatterUtils.printResutls(formatter.generateFranceData(dModel));

		HttpResponse responseMessage = protocol.sendGet(url, myMessage);

		validatorUtils.printMessage(responseMessage);

		System.out.println("Read from Dev mongo reads: ");
		mongoDev.displayAllDataSets();
		mongoDev.displayCollectionNames();

		System.out.println("Model display: ");
		System.out.println(dModel.getDealer_name());

		DealerModel qaDealerModel = MongoQAConnector.getFranceDealear(this.getClass().getSimpleName());

		System.out.println("Read from QA mongo: bir -> " + qaDealerModel.getBir_id());
		

	}
}
