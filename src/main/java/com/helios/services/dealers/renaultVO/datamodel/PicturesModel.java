package com.helios.services.dealers.renaultVO.datamodel;

import java.util.Random;

import com.helios.services.dealers.renaultVO.RenaultVOConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class PicturesModel {

	private String pictureName;
	private String pictureType;
	private String usedCarNb;

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public void setPictureName(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC) + ".jpg";
		else
			value = FieldGenerators.generateRandomString(25, Mode.NUMERIC);

		this.pictureName = value;
	}

	public String getPictureType() {
		return pictureType;
	}

	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

	public void setPictureType(boolean isValid) throws Exception {

		String value;
		Random random = new Random();

		if (isValid)
			value = RenaultVOConstants.PICTURE_TYPES[random.nextInt(RenaultVOConstants.PICTURE_TYPES.length)];
		else
			value = FieldGenerators.generateRandomString(10, Mode.NUMERIC);

		this.pictureName = value;
	}

	public String getUsedCarNb() {
		return usedCarNb;
	}

	public void setUsedCarNb(String usedCarNb) {
		this.usedCarNb = usedCarNb;
	}

	public void setUsedCarNb(boolean isValid) throws Exception {

		String value;

		if (isValid)
			value = FieldGenerators.generateRandomString(20, Mode.ALPHANUMERIC);
		else
			value = FieldGenerators.generateRandomString(25, Mode.ALPHA);

		this.usedCarNb = value;
	}

}
