package com.cucumber.scenarios.paprika;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.helios.connectors.HttpMainProtocol;
import com.helios.services.paprika.PaprikaModel;
import com.helios.services.paprika.PaprikaValidator;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaprikaScenario {

	public HttpMainProtocol protocol = new HttpMainProtocol();
	public PaprikaValidator serviceActions = new PaprikaValidator();
	public PaprikaModel message;
	public String response;

	@Given("^I have a \"([^\"]*)\" data set$")
	public void generateData(String isValid) throws Throwable {
		if (isValid.contains("valid")) {
			message = new PaprikaModel(true);
		} else {
			message = new PaprikaModel(false);
		}
	}

	@And("^with the isPresent set to \"([^\"]*)\"$")
	public void modifyIsPresent(String propVal) throws Throwable {
		message.setIsPresent(propVal);
	}

	@When("^I send the message to the url: \"([^\"]*)\"$")
	public void sendMessage(String url) throws Throwable {
		// Sending nessage
		HttpResponse responseMessage = protocol.sendGet(url, message.toString());
		response = EntityUtils.toString(responseMessage.getEntity());
	}
	
	@Then("^the response contains \"(.*?)\"$")
	public void the_response_contains(String msgValidatrion) throws Throwable {
		//Validate message
		serviceActions.assertMessage(msgValidatrion, response);
	}
	
	@After
	public void closeDriver() throws IllegalStateException, IOException {
		//Write response to xml file - for Debugging
		protocol.writeToFile(response,"PaprikaTest");
		protocol.close();
	}

}
