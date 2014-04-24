package com.helios.services.dealer.france.datamodels;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

import com.helios.services.dealer.france.FranceConstants;
import com.helios.tools.FieldGenerators;
import com.helios.tools.FieldGenerators.Mode;

public class DealerModel{

	private String bir_id;
	private String country;
	private String dealer_name;
	private String has_fixedprice;
	private String distance;

	private List<AddressModel> addressesList;
	private List<ServiceModel> serviceList;
	private List<AppointmentModel> appointmentList;
	private List<BrandModel> brandList;

	public DealerModel(boolean isValid) throws Exception {
		setBir_id(isValid);
		setCountry(isValid);
		setDealer_name(isValid);
		setHas_fixedprice(isValid);
		setDistance(isValid);

		AddressModel addressItem = new AddressModel(isValid);
		addressesList = new ArrayList<AddressModel>();
		addressesList.add(addressItem);
		
		AppointmentModel appointmentItem = new AppointmentModel(isValid);
		appointmentList = new ArrayList<AppointmentModel>();
		appointmentList.add(appointmentItem);
		
		ServiceModel serviceItem = new ServiceModel(isValid);
		serviceList = new ArrayList<ServiceModel>();
		serviceList.add(serviceItem);
		
		BrandModel brandItem = new BrandModel(isValid);
		brandList = new ArrayList<BrandModel>();
		brandList.add(brandItem);

	}

	public String getBir_id() {
		return bir_id;
	}

	public String getCountry() {
		return country;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public String getHas_fixedprice() {
		return has_fixedprice;
	}

	public String getDistance() {
		return distance;
	}

	public List<ServiceModel> getServiceList() {
		return serviceList;
	}

	public List<AppointmentModel> getAppointmentList() {
		return appointmentList;
	}

	public List<BrandModel> getBrandList() {
		return brandList;
	}

	public List<AddressModel> getAddressList() {
		return addressesList;
	}

	public void setBir_id(String bir_id) {
		this.bir_id = bir_id;
	}

	public void setBir_id(boolean isValid) {
		if (isValid) {
			this.bir_id = "DEALER_" + RandomStringUtils.randomNumeric(8);
		} else {
			this.bir_id = RandomStringUtils.random(8);
		}
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountry(boolean isValid) {
		if (isValid) {
			this.country = "FR";
		} else {
			this.country = RandomStringUtils.random(8);
		}
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public void setDealer_name(boolean isValid) throws Exception {
		if (isValid) {
			this.dealer_name = "RENAULT RETAIL" + FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC);
		} else {
			this.dealer_name = FieldGenerators.generateRandomString(10, Mode.ALPHANUMERICSCHAR);
		}
	}

	public void setHas_fixedprice(String has_fixedprice) {
		this.has_fixedprice = has_fixedprice;
	}

	public void setHas_fixedprice(boolean isValid) {
		Random random = new Random();

		if (isValid) {
			this.has_fixedprice = FranceConstants.IS_TRUE_OR_FALSE[random.nextInt(FranceConstants.IS_TRUE_OR_FALSE.length)];
		} else {
			this.has_fixedprice = RandomStringUtils.randomNumeric(8);
		}
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public void setDistance(boolean isValid) {
		if (isValid) {
			this.distance = "1." + RandomStringUtils.randomNumeric(7);
		} else {
			this.distance = RandomStringUtils.random(8);
		}
	}

	public void setServiceList(List<ServiceModel> serviceList) {
		this.serviceList = serviceList;
	}

	public void addServiceList(ServiceModel serviceItem) {
		this.serviceList.add(serviceItem);
	}

	public void setAppointmentList(List<AppointmentModel> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public void addAppointmentList(AppointmentModel appointmentItem) {
		this.appointmentList.add(appointmentItem);
	}

	public void setBrandList(List<BrandModel> brandList) {
		this.brandList = brandList;
	}

	public void addBrandList(BrandModel brandItem) {
		this.brandList.add(brandItem);
	}

	public void setAddressList(List<AddressModel> addressList) {
		this.addressesList = addressList;
	}

	public void addAddressList(AddressModel addressItem) {
		this.addressesList.add(addressItem);
	}
}
