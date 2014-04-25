package com.helios.services.dealers.france.datamodels;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

import com.helios.services.dealers.france.FranceConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class BrandModel {

	private String brandTag;

	private String receiveLead;
	private String type;
	private String imgURL;

	public BrandModel(boolean isValid) throws Exception {
		setBrandTag(isValid);
		setReceiveLead(isValid);
		setType(isValid);
		setImgURL(isValid);
	}

	public String getBrandTag() {
		return brandTag;
	}

	public String getReceiveLead() {
		return receiveLead;
	}

	public String getType() {
		return type;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setBrandTag(String brandTag) {
		this.brandTag = brandTag;
	}

	public void setBrandTag(boolean isValid) throws Exception {
		String value;
		Random random = new Random();

		if (isValid)
			value = FranceConstants.BRAND_TAGS[random.nextInt(FranceConstants.BRAND_TAGS.length)];
		else
			value = FieldGenerators.generateRandomString(5, Mode.ALPHANUMERIC);

		this.brandTag = value;
	}

	public void setReceiveLead(String receiveLead) {
		this.receiveLead = receiveLead;
	}

	public void setReceiveLead(boolean isValid) {

		Random random = new Random();
		String value;

		if (isValid)
			value = FranceConstants.IS_TRUE_OR_FALSE[random.nextInt(FranceConstants.IS_TRUE_OR_FALSE.length)];
		else
			value = RandomStringUtils.randomNumeric(8);

		this.receiveLead = value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setType(boolean isValid) {

		Random random = new Random();
		String value;

		if (isValid)
			value = FranceConstants.BRAND_TYPES[random.nextInt(FranceConstants.BRAND_TYPES.length)];
		else
			value = RandomStringUtils.randomNumeric(8);

		this.type = value;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public void setImgURL(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = "http://" + FieldGenerators.generateRandomString(8, Mode.ALPHANUMERIC) + "/One.jpg";
		else
			value = FieldGenerators.generateRandomString(18, Mode.ALPHANUMERICSCHAR);

		this.imgURL = value;
	}
}
