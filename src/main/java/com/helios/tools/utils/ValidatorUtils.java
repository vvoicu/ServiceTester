package com.helios.tools.utils;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

/**
 * This class will be used to assert dev db data is persisted. Only read
 * operations should be performed on the dev db.
 * 
 * @author vladvoicu
 * 
 */
public class ValidatorUtils {

	public void assertMessage(String msgValidatrion, String response) throws IOException {
		assertTrue("Failure: Response message is invalid: " + response, response.contains(msgValidatrion));
	}

	public void assertMessage(HttpResponse response, String desiredMessage) throws ParseException, IOException {
		HttpEntity entity = response.getEntity();
		String res = null;
		res = EntityUtils.toString(entity);

		System.out.println("Response: " + res);
		assertTrue("Failure: Response message is invalid: " + res, res.contains(desiredMessage));
	}

	public void printMessage(HttpResponse response) throws ParseException, IOException {
		HttpEntity entity = response.getEntity();
		String res = null;
		res = EntityUtils.toString(entity);

		System.out.println("Response: " + res);
	}

}
