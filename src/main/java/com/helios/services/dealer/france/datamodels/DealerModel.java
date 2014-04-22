package com.helios.services.dealer.france.datamodels;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

public class DealerModel {
	
	private String bir_id;
	private String country;
	private String dealer_name;
	private String has_fixedprice;
	private String distance;
	
	private List<AddressModel> addressesList;
	private List<ServiceModel> serviceList;
	private List<AppointmentModel> appointmentList;
	private List<BrandModel> brandList;
	
	public DealerModel(boolean isValid){
		setBir_id(isValid);
		setCountry(isValid);
		setDealer_name(isValid);
		setHas_fixedprice(isValid);
		setDistance(isValid);
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
	
	public void setBir_id(boolean isValid){
		if(isValid){
			this.bir_id = "DEALER_" + RandomStringUtils.randomNumeric(8);
		}else{
			this.bir_id = RandomStringUtils.random(8);
		}
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setCountry(boolean isValid){
		if(isValid){
			this.country = "FR";
		}else{
			this.country = RandomStringUtils.random(8);
		}
	}
	
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	
	public void setDealer_name(boolean isValid){
		if(isValid){
			this.dealer_name = "RENAULT RETAIL" + RandomStringUtils.random(8);
		}else{
			this.dealer_name = RandomStringUtils.randomNumeric(8);
		}
	}
	
	public void setHas_fixedprice(String has_fixedprice) {
		this.has_fixedprice = has_fixedprice;
	}
	
	public void setHas_fixedprice(boolean isValid){
		
		if(isValid){
			this.has_fixedprice = "RENAULT RETAIL" + RandomStringUtils.random(8);
		}else{
			this.has_fixedprice = RandomStringUtils.randomNumeric(8);
		}
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	public void setDistance(boolean isValid) {
		if(isValid){
			this.has_fixedprice = "1." + RandomStringUtils.randomNumeric(7);
		}else{
			this.has_fixedprice = RandomStringUtils.random(8);
		}
	}
	
	public void setServiceList(List<ServiceModel> serviceList) {
		this.serviceList = serviceList;
	}
	public void setAppointmentList(List<AppointmentModel> appointmentList) {
		this.appointmentList = appointmentList;
	}
	public void setBrandList(List<BrandModel> brandList) {
		this.brandList = brandList;
	}		
	public void setAddressList(List<AddressModel> addressList) {
		this.addressesList = addressList;
	}
}
