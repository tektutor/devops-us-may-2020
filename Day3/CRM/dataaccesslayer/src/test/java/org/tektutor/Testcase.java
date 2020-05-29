package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testcase {

	@Test
	public void testDataAccessLayer() {
		DataAccessLayer dal = new DataAccessLayer();
		
		String actualResponse   = dal.getModuleName();
		String expectedResponse = "DataAccessLayer Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
