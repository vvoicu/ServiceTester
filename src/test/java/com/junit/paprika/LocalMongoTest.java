package com.junit.paprika;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.services.dealers.france.datamodels.DealerModel;

@RunWith(JUnit4.class)
public class LocalMongoTest {

	@Test
	public void connectToMongoDB() throws Exception{
		MongoQAConnector mongoUtilus = new MongoQAConnector();
		
		DealerModel dmodel = new DealerModel(true);
		MongoQAConnector.saveFranceDealer(dmodel, this.getClass().getName());
		mongoUtilus.displayCollectionNames();
//		FranceDealerPersist.displayItem();
	}
}
