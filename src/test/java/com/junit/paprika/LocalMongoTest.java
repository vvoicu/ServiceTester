package com.junit.paprika;

import java.net.UnknownHostException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.persistance.MongoUtils;
import com.helios.services.dealer.france.datamodels.DealerModel;

@RunWith(JUnit4.class)
public class LocalMongoTest {

	@Test
	public void connectToMongoDB() throws Exception{
		MongoUtils mongoUtilus = new MongoUtils();
		
		DealerModel dmodel = new DealerModel(true);
		mongoUtilus.saveFranceDealer(dmodel, this.getClass().getName());
		mongoUtilus.displayCollectionNames();
		mongoUtilus.displayItem();
	}
}
