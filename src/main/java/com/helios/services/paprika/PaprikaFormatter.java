package com.helios.services.paprika;

import org.json.JSONException;
import org.json.JSONObject;

public class PaprikaFormatter {

	public static JSONObject formatPaprikaModel(PaprikaModel message) throws JSONException {
		JSONObject mainContainer = new JSONObject();
		mainContainer.put("modelID", message.getModelID());
		mainContainer.put("boolVal", message.getIsPresent());
		mainContainer.put("freeText", message.getFreeText());

		return mainContainer;
	}
}
