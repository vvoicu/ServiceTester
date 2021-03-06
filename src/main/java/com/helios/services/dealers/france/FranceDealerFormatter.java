package com.helios.services.dealers.france;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.helios.services.dealers.france.datamodels.AddressModel;
import com.helios.services.dealers.france.datamodels.AppointmentModel;
import com.helios.services.dealers.france.datamodels.DealerModel;
import com.helios.services.dealers.france.datamodels.ServiceModel;
import com.helios.tools.utils.FormatterUtils;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class FranceDealerFormatter extends FormatterUtils {

	/**
	 *  Will generate a dealer - France Type - XML
	 * @param model
	 * @return
	 * @throws ParserConfigurationException
	 * @throws IOException
	 */
	public Document generateFranceData(DealerModel model) throws ParserConfigurationException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root element
		Document doc = docBuilder.newDocument();

		Element searchResults = doc.createElement(FranceConstants.DOC_ROOT);
		doc.appendChild(searchResults);

		Element dealersContainer = doc.createElement(FranceConstants.DOC_DEALERS);
		searchResults.appendChild(dealersContainer);

		Element dealerRoot = doc.createElement(FranceConstants.DEALER_TAG);
		dealersContainer.appendChild(dealerRoot);

		Element birID = doc.createElement(FranceConstants.BIR_ID_TAG);
		birID.appendChild(doc.createTextNode(model.getBir_id()));
		dealerRoot.appendChild(birID);

		// addresses - DONE
		Element addressContainer = doc.createElement(FranceConstants.ADR_TAG);
		dealerRoot.appendChild(addressContainer);

		if (model.getAddressList().size() > 0) {
			for (AddressModel modelNow : model.getAddressList()) {
				Element adrLine = doc.createElement(FranceConstants.ADR_COMPLETLINE);
				adrLine.appendChild(doc.createTextNode(modelNow.getComplementAddressLine()));
				addressContainer.appendChild(adrLine);

				Element cityLine = doc.createElement(FranceConstants.ADR_CITY);
				cityLine.appendChild(doc.createTextNode(modelNow.getCity()));
				addressContainer.appendChild(cityLine);

				Element countryLine = doc.createElement(FranceConstants.ADR_COUNTRY);
				countryLine.appendChild(doc.createTextNode(modelNow.getCountry()));
				addressContainer.appendChild(countryLine);

				Element pcLine = doc.createElement(FranceConstants.ADR_POSTCODE);
				pcLine.appendChild(doc.createTextNode(modelNow.getPost_code()));
				addressContainer.appendChild(pcLine);

				Element telLine = doc.createElement(FranceConstants.ADR_TEL);
				telLine.appendChild(doc.createTextNode(modelNow.getTelephone()));
				addressContainer.appendChild(telLine);

				Element faxLine = doc.createElement(FranceConstants.ADR_FAX);
				faxLine.appendChild(doc.createTextNode(modelNow.getFax()));
				addressContainer.appendChild(faxLine);

				Element lonLine = doc.createElement(FranceConstants.ADR_LON);
				lonLine.appendChild(doc.createTextNode(modelNow.getLongitude()));
				addressContainer.appendChild(lonLine);

				Element latLine = doc.createElement(FranceConstants.ADR_LAT);
				latLine.appendChild(doc.createTextNode(modelNow.getLatitude()));
				addressContainer.appendChild(latLine);
			}
		}

		Element countryCode = doc.createElement(FranceConstants.COUNTRY_TAG);
		countryCode.appendChild(doc.createTextNode(model.getCountry()));
		dealerRoot.appendChild(countryCode);

		Element dealerName = doc.createElement(FranceConstants.DEALER_NAME);
		dealerName.appendChild(doc.createTextNode(model.getDealer_name()));
		dealerRoot.appendChild(dealerName);

		Element fixedPrice = doc.createElement(FranceConstants.HAS_FIXED_PRICE_TAG);
		fixedPrice.appendChild(doc.createTextNode(model.getHas_fixedprice()));
		dealerRoot.appendChild(fixedPrice);

		// services - Done

		Element servicesContainer = doc.createElement(FranceConstants.SERVICES_TAG);
		dealerRoot.appendChild(servicesContainer);

		Attr attr = doc.createAttribute("class");
		attr.setValue("linked-list");
		servicesContainer.setAttributeNode(attr);

		if (model.getServiceList().size() > 0) {
			for (ServiceModel modelNow : model.getServiceList()) {
				Element service = doc.createElement(FranceConstants.SRV_TAG);
				servicesContainer.appendChild(service);

				Element nameLine = doc.createElement(FranceConstants.SRV_NAME);
				nameLine.appendChild(doc.createTextNode(modelNow.getName()));
				service.appendChild(nameLine);

				Element idLine = doc.createElement(FranceConstants.SRV_ID);
				idLine.appendChild(doc.createTextNode(modelNow.getId()));
				service.appendChild(idLine);

				Element imgLine = doc.createElement(FranceConstants.SRV_IMG);
				imgLine.appendChild(doc.createTextNode(modelNow.getImgUrl()));
				service.appendChild(imgLine);
			}
		}

		// sbol
		Element sbolRoot = doc.createElement(FranceConstants.SBOL_TAG);
		dealerRoot.appendChild(sbolRoot);

		Element isAvailable = doc.createElement(FranceConstants.SBOL_ISAVL);
		isAvailable.appendChild(doc.createTextNode(FranceConstants.SBOL_ISAVL_VAL));
		sbolRoot.appendChild(isAvailable);

		Element appontmentsTag = doc.createElement(FranceConstants.APOS_TAG);
		sbolRoot.appendChild(appontmentsTag);

		if (model.getAppointmentList().size() > 0) {
			for (AppointmentModel modelNow : model.getAppointmentList()) {
				Element appointment = doc.createElement(FranceConstants.APO_TAG);
				appontmentsTag.appendChild(appointment);

				Element avail = doc.createElement(FranceConstants.APO_AVAIL);
				avail.appendChild(doc.createTextNode(modelNow.getAvailable()));
				appointment.appendChild(avail);

				Element day = doc.createElement(FranceConstants.APO_DAY);
				day.appendChild(doc.createTextNode(modelNow.getDay()));
				appointment.appendChild(day);

				Element start = doc.createElement(FranceConstants.APO_START);
				start.appendChild(doc.createTextNode(modelNow.getStart()));
				appointment.appendChild(start);

				Element end = doc.createElement(FranceConstants.APO_END);
				end.appendChild(doc.createTextNode(modelNow.getEnd()));
				appointment.appendChild(end);
			}
		}

		// TODO Brand Status

		Element distance = doc.createElement(FranceConstants.DISTANCE);
		distance.appendChild(doc.createTextNode(model.getDistance()));
		dealerRoot.appendChild(distance);

		return doc;

	}

	public BasicDBObject generateJsonData(DealerModel dModel) {

		BasicDBObject document = new BasicDBObject();
		document.put(FranceConstants.BIR_ID_TAG, dModel.getBir_id());
		document.put(FranceConstants.COUNTRY_TAG, dModel.getCountry());
		document.put(FranceConstants.DEALER_NAME, dModel.getDealer_name());
		document.put(FranceConstants.HAS_FIXED_PRICE_TAG, dModel.getHas_fixedprice());
		document.put(FranceConstants.DISTANCE, dModel.getDistance());
		return document;
	}

}
