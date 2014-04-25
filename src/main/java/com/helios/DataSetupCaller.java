package com.helios;

import java.net.UnknownHostException;

import com.helios.connectors.http.HttpMainProtocol;
import com.helios.connectors.mongo.qa.MongoQAConnector;
import com.helios.services.dealers.france.FranceDealerFormatter;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.tools.utils.FormatterUtils;
import com.helios.tools.utils.ValidatorUtils;


/**
 * This is intended to generate data for external apps. Created for data generation for performance tests with jMeter.
 * @author vladvoicu
 *
 */
public class DataSetupCaller {
	
	public static DealerModel dModel;
	
	public HttpMainProtocol protocol = new HttpMainProtocol();
	public ValidatorUtils validatorUtils = new ValidatorUtils();
	public static MongoQAConnector mongoQA;
	public static FranceDealerFormatter formatter= new FranceDealerFormatter();
	

	
	public static String getDealerModelData(String testName) throws Exception{
		
		 try {
			 mongoQA = new MongoQAConnector();
		} catch (UnknownHostException e) {
			System.out.println("Error: QA Mongo connection could not be initialized");
			e.printStackTrace();
		}
		
		if(mongoQA.hasEntries(testName) > 0){
			dModel = MongoQAConnector.getFranceDealear(testName);
			
		}else{
			dModel = new DealerModel(true);
			MongoQAConnector.saveFranceDealer(dModel, testName);
		}
		
		
		return FormatterUtils.printResutls(formatter.generateFranceData(dModel));
	}
	
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        
//        getDealerModelData(args[1]);
    }

}
