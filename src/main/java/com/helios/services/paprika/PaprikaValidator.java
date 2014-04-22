package com.helios.services.paprika;

import java.io.IOException;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import static org.junit.Assert.*;

public class PaprikaValidator {

	public void assertMessage(String msgValidatrion, String response) throws IOException {
		assertTrue("Failure: Response message is invalid: " + response, response.contains(msgValidatrion));
	}
	
	
	public void assertMessage(HttpResponse response) throws IOException {
		HttpEntity entity = response.getEntity();
		String res = EntityUtils.toString(entity);
		
		System.out.println("Response: " + res);
		assertTrue("Failure: Response message is invalid: " + res, res.contains("Message"));
	}
}
