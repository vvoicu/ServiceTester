package com.junit.dealer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.helios.services.dealers.renaultVO.RenaultVOFormatter;
import com.helios.services.dealers.renaultVO.datamodel.VOModel;
import com.helios.tools.utils.FormatterUtils;

@RunWith(JUnit4.class)
public class Testul {

	public RenaultVOFormatter formatter = new RenaultVOFormatter();
	public VOModel voModel;

	@Test
	public void testDataPersistanceRule() throws Exception {

		voModel = new VOModel(true);

		// EquipmentModel eModel = new EquipmentModel(true);
		// voModel.addEquipmentToList(eModel);
		// voModel.addEquipmentToList(eModel);
		String myMessage = FormatterUtils.printResutls(formatter.generateRenaultVOData(voModel));

	}

}
