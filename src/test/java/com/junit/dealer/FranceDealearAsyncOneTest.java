package com.junit.dealer;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.services.dealers.france.FranceDealerFormatter;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.tools.utils.FormatterUtils;
import com.junit.BaseTest;

import cucumber.api.java.After;

@RunWith(JUnit4.class)
public class FranceDealearAsyncOneTest extends BaseTest {

	public String url = "http://localhost:8081";
	public DealerModel dModel;
	public FranceDealerFormatter formatter = new FranceDealerFormatter();

	@Before
	public void dataSetup() throws Exception {

		// System.out.println(mongoUtilus.hasEntries(this.getClass().getSimpleName()));
		// System.out.println(this.getClass().getSimpleName());
		// System.out.println(mongoUtilus.hasEntries(this.getClass().getSimpleName()));

		if (mongoQA.hasEntries(this.getClass().getSimpleName()) > 0) {
			dModel = MongoQAConnector.getFranceDealear(this.getClass().getSimpleName());

		} else {
			dModel = new DealerModel(true);
			MongoQAConnector.saveFranceDealer(dModel, this.getClass().getSimpleName());
		}

	}

	@Test
	public void testDataPersistanceRule() throws Exception {

		String myMessage = FormatterUtils.printResutls(formatter.generateFranceData(dModel));
		// docList.add(formatter.generateFranceData(dModel));
		// String myMessage =
		// FormatterUtils.printResutls(formatter.generateDocumentRoot(docList));

		HttpResponse responseMessage = protocol.sendGet(url, myMessage);

		// StringEntity result = new StringEntity(responseMessage.toString(),
		// "UTF8");
		@SuppressWarnings("deprecation")
		String result = EntityUtils.getContentCharSet(responseMessage.getEntity());

		// validatorUtils.printMessage(responseMessage);

		System.out.println("Response message: " + result);
		// System.out.println(EntityUtils.toString(responseMessage.getEntity()).toString());

		mongoDev.displayAllDataSets();
		mongoDev.displayCollectionNames();

		System.out.println(dModel.getDealer_name());

		DealerModel qaDealerModel = MongoQAConnector.getFranceDealear(this.getClass().getSimpleName());

		System.out.println("Read from QA mongo: bir -> " + qaDealerModel.getBir_id());
	}

	@After
	public void saveToQaData() {
		// MongoQAConnector.saveFranceDealer(dModel,
		// this.getClass().getSimpleName());

	}

}
