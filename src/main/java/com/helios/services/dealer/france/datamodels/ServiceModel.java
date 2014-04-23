package com.helios.services.dealer.france.datamodels;

import java.util.Random;

import com.helios.services.dealer.france.FranceConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class ServiceModel {

	private String name;
	private String id;
	private String imgUrl;
	
	public ServiceModel(boolean isValid) throws Exception{
		setName(isValid);
		setId(isValid);
		setImgUrl(isValid);
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(boolean isValid) throws Exception {
		String value;
		Random random = new Random();

		if (isValid)
			value = FranceConstants.SERVICE_NAMES[random.nextInt(FranceConstants.SERVICE_NAMES.length)];
		else
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERIC);

		this.name = value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setId(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = String.valueOf(FieldGenerators.getRandomIntegerBetween(30, 55));
		else
			value = FieldGenerators.generateRandomString(4, Mode.ALPHANUMERIC);

		this.id = value;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setImgUrl(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = "http://" + FieldGenerators.generateRandomString(8, Mode.ALPHANUMERIC) + "/One.jpg";
		else
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERICSCHAR);

		this.imgUrl = value;
	}
}
