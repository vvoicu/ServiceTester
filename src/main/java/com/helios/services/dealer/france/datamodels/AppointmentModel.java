package com.helios.services.dealer.france.datamodels;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

import com.helios.services.dealer.france.FranceConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class AppointmentModel {

	private String available;
	private String day;
	private String start;
	private String end;
	
	public AppointmentModel(boolean isValid) throws Exception{
		setAvailable(isValid);
		setDay(isValid);
		setStart(isValid);
		setEnd(isValid);
	}

	public String getAvailable() {
		return available;
	}

	public String getDay() {
		return day;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public void setAvailable(boolean isValid) {
		Random random = new Random();
		String value;

		if (isValid)
			value = FranceConstants.IS_TRUE_OR_FALSE[random.nextInt(FranceConstants.IS_TRUE_OR_FALSE.length)];
		else
			value = RandomStringUtils.randomNumeric(8);

		this.available = value;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setDay(boolean isValid) throws Exception {
		String value;

		if (isValid)
			value = FieldGenerators.getRandomDateBetweenDates(FranceConstants.RANDOM_DATE_MIN, FranceConstants.RANDOM_DATE_MAX);
		else
			value = FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC);

		this.day = value;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setStart(boolean isValid) {
		String value;

		if (isValid)
			value = String.valueOf(FieldGenerators.getRandomIntegerBetween(0, 23) + FieldGenerators.getRandomIntegerBetween(0, 59));
		else
			value = String.valueOf(FieldGenerators.getRandomIntegerBetween(1000, 9999));

		this.start = value;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void setEnd(boolean isValid) {
		String value;

		if (isValid)
			value = String.valueOf(FieldGenerators.getRandomIntegerBetween(0, 23) + FieldGenerators.getRandomIntegerBetween(0, 59));
		else
			value = String.valueOf(FieldGenerators.getRandomIntegerBetween(1000, 9999));

		this.end = value;
	}

}
