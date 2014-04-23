package com.helios.connectors;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import com.helios.tools.Constants;

@SuppressWarnings("deprecation")
public class MainProtocol {

	public DefaultHttpClient httpclient = new DefaultHttpClient();
	public HttpClient client = new DefaultHttpClient();
	public boolean validateResponseStatusCode = true;
	
	public HttpEntity entity;
	public int i = 0;

	public MainProtocol() {
		httpclient = new DefaultHttpClient();
		client = new DefaultHttpClient();
	}

	public HttpResponse postMessage(String URL, JSONObject message) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(URL);

		post.setHeader("Content-Type", "application/json");
		post.setHeader("SapEndpoint", "Development");

		post.setEntity(new StringEntity(message.toString()));

		return httpclient.execute(post);

	}

	public HttpResponse sendGet(String url, String message) throws Exception {

		HttpGetWithEntity myGet = new HttpGetWithEntity();
		URI uri = URI.create(url);
		myGet.setURI(uri);
//		myGet.setHeader("Content-Type", "text/json");
		myGet.setHeader("Content-Type", "text/xml");
		myGet.setEntity(new StringEntity(message, "UTF8"));

		System.out.println("Request: " + myGet.toString());

		entity = new StringEntity(message, "UTF8");

		HttpResponse response = httpclient.execute(myGet);
//		HttpResponse response = client.execute(myGet);


		System.out.println("Response Code : " + response.getStatusLine());
		
		
		return response;
	}

	/**
	 * Write xml style, message Entity from given response;
	 * @param response
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public void writeToFile(HttpResponse response,String tc) throws IllegalStateException, IOException {
		
		InputStream is = response.getEntity().getContent();
		
		String timeNow = String.valueOf(System.currentTimeMillis());
		String filePath = Constants.REPORT_FOLDER + timeNow + "_" +  tc + "_ReceivedMessage.xml";
		FileOutputStream fos = new FileOutputStream(filePath);
		int inByte;
		while ((inByte = is.read()) != -1)
			fos.write(inByte);
		is.close();
		fos.close();
	}
	/**
	 * Write xml style, message Entity from given response;
	 * @param response
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public void writeToFile(String response,String tc) throws IllegalStateException, IOException {
		
//		InputStream is = response.getEntity().getContent();
		
		String timeNow = String.valueOf(System.currentTimeMillis());
		String filePath = Constants.REPORT_FOLDER + timeNow + "_" +  tc + "_ReceivedMessage.xml";
		FileOutputStream fos = new FileOutputStream(filePath);
		byte[] contentInBytes = response.getBytes();
		 
		fos.write(contentInBytes);
		fos.flush();
		fos.close();
	}
	

	public void close() {
		httpclient.close();
	}

}
