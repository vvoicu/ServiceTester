package com.helios.tools;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


public final class FieldGenerators {
	
	

	public static SecureRandom random = new SecureRandom();
	

	
	
	public static enum Mode {
		ALPHA, ALPHANUMERIC, NUMERIC, ALPHANUMERICSCHAR
	}

	public static Integer getRandomInteger(int max) {
		return Math.abs(random.nextInt(max));
	}

	public static Integer getRandomIntegerBetween(int min, int max) {
		int result = random.nextInt(max + 1);
		return (result >= min ? result : result + min);

	}

	public static String generateRandomString(int length, Mode mode) throws Exception {

		StringBuffer buffer = new StringBuffer();
		String characters = "";

		switch (mode) {

		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;

		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;

		case NUMERIC:
			characters = "1234567890";
			break;

		case ALPHANUMERICSCHAR:
			characters = "ab\'cdefghi\"jklmn'opq";
			break;
		}

		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}

	public static String doubleValidFormat(double value) {
		DecimalFormat myFormatter = new DecimalFormat("0.0");
		String output = myFormatter.format(value);
		return output;
	}

	public static String getRandomDateBetweenDates(Date initialDate, Date finalDate) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		String dateString;

		Date result = FieldGenerators.getRandomDatesBetweenDates(initialDate, finalDate);

		date = sdf.format(result);
		dateString = String.valueOf(date);

		return dateString;

	}

	public static Date getRandomDatesBetweenDates(Date initialDate, Date finalDate) {
		List<Date> dates = getListOfDatesBetweenDates(initialDate, finalDate);
		return getRandomItemFromList(dates);
	}

	public static List<Date> getListOfDatesBetweenDates(Date initialDate, Date finalDate) {
		List<Date> dates = new ArrayList<Date>();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(initialDate);
		while (calendar.getTime().before(finalDate)) {
			Date currentDate = calendar.getTime();
			dates.add(currentDate);
			calendar.add(Calendar.DATE, 1);
		}
		return dates;
	}

	public static <T> T getRandomItemFromList(List<T> list) {
		SecureRandom random = new SecureRandom();
		return list.get(random.nextInt(list.size()));
	}
}
