package com.helios.services.dealers.renaultVO;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.helios.services.dealers.renaultVO.datamodel.EquipmentModel;
import com.helios.services.dealers.renaultVO.datamodel.HeaderInfoModel;
import com.helios.services.dealers.renaultVO.datamodel.VOModel;
import com.helios.tools.utils.FormatterUtils;

public class RenaultVOFormatter extends FormatterUtils {

	/**
	 * Will generate a dealer - France Type - XML
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public Document generateRenaultVOData(VOModel model) throws Exception {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root element
		Document doc = docBuilder.newDocument();

		Element stockVO = doc.createElement(RenaultVOConstants.DOC_ROOT);
		doc.appendChild(stockVO);

		// header info section
		HeaderInfoModel headerInfoModel = model.getHeaderInfo();

		Element headerInfo = doc.createElement(RenaultVOConstants.HEADER_INFO);
		stockVO.appendChild(headerInfo);
		Attr hdAttr1 = doc.createAttribute(RenaultVOConstants.DATE_STOCK_DMS);
		hdAttr1.setValue(headerInfoModel.getDateStockDMS());
		headerInfo.setAttributeNode(hdAttr1);

		Attr hdAttr2 = doc.createAttribute(RenaultVOConstants.NBVO);
		hdAttr2.setValue(headerInfoModel.getNbVO());
		headerInfo.setAttributeNode(hdAttr2);

		Attr hdAttr3 = doc.createAttribute(RenaultVOConstants.COUNTRY_CODE);
		hdAttr3.setValue(headerInfoModel.getCountryCode());
		headerInfo.setAttributeNode(hdAttr3);

		// VO section
		Element vOContainer = doc.createElement(RenaultVOConstants.VO);
		stockVO.appendChild(vOContainer);

		Attr voAttr1 = doc.createAttribute(RenaultVOConstants.TRANSACTION_TYPE);
		voAttr1.setValue(model.getTransactionType());
		vOContainer.setAttributeNode(voAttr1);

		Attr voAttr2 = doc.createAttribute(RenaultVOConstants.VEHICLE_REF_CODE);
		voAttr2.setValue(model.getVehicleRefCode());
		vOContainer.setAttributeNode(voAttr2);

		Attr voAttr3 = doc.createAttribute(RenaultVOConstants.DEALER_ID);
		voAttr3.setValue(model.getDealerId());
		vOContainer.setAttributeNode(voAttr3);

		Attr voAttr4 = doc.createAttribute(RenaultVOConstants.USED_CAR_NB);
		voAttr4.setValue(model.getUsedCarNb());
		vOContainer.setAttributeNode(voAttr4);

		Attr voAttr5 = doc.createAttribute(RenaultVOConstants.LANG_CODE);
		voAttr5.setValue(model.getLangCode());
		vOContainer.setAttributeNode(voAttr5);

		Attr voAttr6 = doc.createAttribute(RenaultVOConstants.CURRENCY);
		voAttr6.setValue(model.getCurrency());
		vOContainer.setAttributeNode(voAttr6);

		Attr voAttr7 = doc.createAttribute(RenaultVOConstants.VEHICLE_GENDER);
		voAttr7.setValue(model.getVehicleGender());
		vOContainer.setAttributeNode(voAttr7);

		Attr voAttr8 = doc.createAttribute(RenaultVOConstants.SPECIAL_OFFER);
		voAttr8.setValue(model.getSpecialOffer());
		vOContainer.setAttributeNode(voAttr8);

		Attr voAttr9 = doc.createAttribute(RenaultVOConstants.VO_MANUFACTURER);
		voAttr9.setValue(model.getvOManufacturer());
		vOContainer.setAttributeNode(voAttr9);

		Attr voAttr10 = doc.createAttribute(RenaultVOConstants.BRAND);
		voAttr10.setValue(model.getBrand());
		vOContainer.setAttributeNode(voAttr10);

		Attr voAttr11 = doc.createAttribute(RenaultVOConstants.MODEL);
		voAttr11.setValue(model.getModel());
		vOContainer.setAttributeNode(voAttr11);

		Attr voAttr12 = doc.createAttribute(RenaultVOConstants.MODEL_FULL);
		voAttr12.setValue(model.getModelFull());
		vOContainer.setAttributeNode(voAttr12);

		Attr voAttr13 = doc.createAttribute(RenaultVOConstants.VERSION);
		voAttr13.setValue(model.getVersion());
		vOContainer.setAttributeNode(voAttr13);

		Attr voAttr14 = doc.createAttribute(RenaultVOConstants.FUEL);
		voAttr14.setValue(model.getFuel());
		vOContainer.setAttributeNode(voAttr14);

		Attr voAttr15 = doc.createAttribute(RenaultVOConstants.TRIM);
		voAttr15.setValue(model.getTrim());
		vOContainer.setAttributeNode(voAttr15);

		Attr voAttr16 = doc.createAttribute(RenaultVOConstants.COLOR);
		voAttr16.setValue(model.getColor());
		vOContainer.setAttributeNode(voAttr16);

		Attr voAttr17 = doc.createAttribute(RenaultVOConstants.TRANSMISSION_TYPE);
		voAttr17.setValue(model.getTransactionType());
		vOContainer.setAttributeNode(voAttr17);

		Attr voAttr18 = doc.createAttribute(RenaultVOConstants.MODEL_YEAR);
		voAttr18.setValue(model.getModelYear());
		vOContainer.setAttributeNode(voAttr18);

		Attr voAttr19 = doc.createAttribute(RenaultVOConstants.POWER_DIN);
		voAttr19.setValue(model.getPowerDIN());
		vOContainer.setAttributeNode(voAttr19);

		Attr voAttr20 = doc.createAttribute(RenaultVOConstants.FISCAL_CRITERIA);
		voAttr20.setValue(model.getFiscalCriteria());
		vOContainer.setAttributeNode(voAttr20);

		Attr voAttr21 = doc.createAttribute(RenaultVOConstants.FIRST_REGISTRATION_DATE);
		voAttr21.setValue(model.getFirstRegistrationDate());
		vOContainer.setAttributeNode(voAttr21);

		Attr voAttr22 = doc.createAttribute(RenaultVOConstants.REGISTRATION_NUMBER);
		voAttr22.setValue(model.getRegistrationNumber());
		vOContainer.setAttributeNode(voAttr22);

		Attr voAttr23 = doc.createAttribute(RenaultVOConstants.MILEAGE);
		voAttr23.setValue(model.getMileage());
		vOContainer.setAttributeNode(voAttr23);

		Attr voAttr24 = doc.createAttribute(RenaultVOConstants.DISTANCE_UNIT);
		voAttr24.setValue(model.getDistanceUnit());
		vOContainer.setAttributeNode(voAttr24);

		Attr voAttr25 = doc.createAttribute(RenaultVOConstants.PVTTC);
		voAttr25.setValue(model.getpVTTC());
		vOContainer.setAttributeNode(voAttr25);

		Attr voAttr26 = doc.createAttribute(RenaultVOConstants.WARRANTY);
		voAttr26.setValue(model.getWarranty());
		vOContainer.setAttributeNode(voAttr26);

		Attr voAttr27 = doc.createAttribute(RenaultVOConstants.FREE_COMMENT);
		voAttr27.setValue(model.getFreeComment());
		vOContainer.setAttributeNode(voAttr27);

		Attr voAttr28 = doc.createAttribute(RenaultVOConstants.SEATS_NUMBER);
		voAttr28.setValue(model.getSeatsNumber());
		vOContainer.setAttributeNode(voAttr28);

		Attr voAttr29 = doc.createAttribute(RenaultVOConstants.EXHIBITION_SITE);
		voAttr29.setValue(model.getExhibitionSite());
		vOContainer.setAttributeNode(voAttr29);

		Attr voAttr30 = doc.createAttribute(RenaultVOConstants.NB_DOORS);
		voAttr30.setValue(model.getNbDoors());
		vOContainer.setAttributeNode(voAttr30);

		Attr voAttr31 = doc.createAttribute(RenaultVOConstants.RENAULT_EXCELLENCE);
		voAttr31.setValue(model.getRenaultExcellence());
		vOContainer.setAttributeNode(voAttr31);

		Attr voAttr32 = doc.createAttribute(RenaultVOConstants.CONTACT_NAME);
		voAttr32.setValue(model.getContactName());
		vOContainer.setAttributeNode(voAttr32);

		Attr voAttr33 = doc.createAttribute(RenaultVOConstants.BRAND_FULL);
		voAttr33.setValue(model.getBrandFull());
		vOContainer.setAttributeNode(voAttr33);

		Attr voAttr34 = doc.createAttribute(RenaultVOConstants.VERSION_FULL);
		voAttr34.setValue(model.getVersionFull());
		vOContainer.setAttributeNode(voAttr34);

		Attr voAttr35 = doc.createAttribute(RenaultVOConstants.FUEL_FULL);
		voAttr35.setValue(model.getFuelFull());
		vOContainer.setAttributeNode(voAttr35);

		Attr voAttr36 = doc.createAttribute(RenaultVOConstants.TRIM_FULL);
		voAttr36.setValue(model.getTrimFull());
		vOContainer.setAttributeNode(voAttr36);

		Attr voAttr37 = doc.createAttribute(RenaultVOConstants.COLOR_FULL);
		voAttr37.setValue(model.getColorFull());
		vOContainer.setAttributeNode(voAttr37);

		// EquipmentList section

		if (model.getEquipmentList().size() > 0) {
			for (EquipmentModel eqModel : model.getEquipmentList()) {
				Element equipmentListTag = doc.createElement(RenaultVOConstants.EQUIPMENT_LIST);
				stockVO.appendChild(equipmentListTag);

				Attr eqAttr1 = doc.createAttribute(RenaultVOConstants.DESCRIPTION);
				eqAttr1.setValue(eqModel.getDescription());
				equipmentListTag.setAttributeNode(eqAttr1);

				Attr eqAttr2 = doc.createAttribute(RenaultVOConstants.USED_CAR_NB);
				eqAttr2.setValue(eqModel.getUsedCarNb());
				equipmentListTag.setAttributeNode(eqAttr2);

				Attr eqAttr3 = doc.createAttribute(RenaultVOConstants.COUNTRY_CODE);
				eqAttr3.setValue(eqModel.getCountryCode());
				equipmentListTag.setAttributeNode(eqAttr3);

				Attr eqAttr4 = doc.createAttribute(RenaultVOConstants.LANG_CODE);
				eqAttr4.setValue(eqModel.getLangCode());
				equipmentListTag.setAttributeNode(eqAttr4);

				Attr eqAttr5 = doc.createAttribute(RenaultVOConstants.TITLE);
				eqAttr5.setValue(eqModel.getTitle());
				equipmentListTag.setAttributeNode(eqAttr5);

			}
		}

		return doc;

	}

}
