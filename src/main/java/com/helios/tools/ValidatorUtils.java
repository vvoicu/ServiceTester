package com.helios.tools;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

public class ValidatorUtils {
	
	public void assertMessage(String msgValidatrion, String response) throws IOException {
		assertTrue("Failure: Response message is invalid: " + response, response.contains(msgValidatrion));
	}
	
	
	public void assertMessage(HttpResponse response,String desiredMessage) {
		HttpEntity entity = response.getEntity();
		String res = null;
		try {
			res = EntityUtils.toString(entity);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Response: " + res);
		assertTrue("Failure: Response message is invalid: " + res, res.contains(desiredMessage));
	}

}
