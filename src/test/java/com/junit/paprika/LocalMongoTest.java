package com.junit.paprika;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.persistance.MongoUtils;
import com.helios.persistance.dealer.FranceDealerPersist;
import com.helios.services.dealer.france.datamodels.DealerModel;

@RunWith(JUnit4.class)
public class LocalMongoTest {

	@Test
	public void connectToMongoDB() throws Exception{
		MongoUtils mongoUtilus = new MongoUtils();
		
		DealerModel dmodel = new DealerModel(true);
		FranceDealerPersist.saveFranceDealer(dmodel, this.getClass().getName());
		mongoUtilus.displayCollectionNames();
//		FranceDealerPersist.displayItem();
	}
}
