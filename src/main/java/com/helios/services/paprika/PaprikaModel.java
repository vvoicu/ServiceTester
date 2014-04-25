package com.helios.services.paprika;

public class PaprikaModel {

	// field restriction to int
	private String modelID;
	// field restriction to boolean
	private String isPresent;
	// free text field - with special chars
	private String freeText;

	public PaprikaModel(boolean isValid) {
		setModelID(isValid);
		setIsPresent(isValid);
		setFreeText(isValid);
	}

	public String getModelID() {
		return modelID;
	}

	public void setModelID(String modelID) {
		this.modelID = modelID;
	}

	public void setModelID(boolean isValid) {

		if (isValid) {
			this.modelID = String.valueOf(111);
		} else {
			this.modelID = "unu unu unu";
		}

	}

	public String getIsPresent() {
		return isPresent;
	}

	private void setIsPresent(boolean isValid) {
		// TODO Auto-generated method stub

	}

	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}

	public String getFreeText() {
		return freeText;
	}

	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}

	private void setFreeText(boolean isValid) {
		if (isValid) {
			this.freeText = String.valueOf(111);
		} else {
			this.freeText = "unu unu unu";
		}
	}

}
