package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testcase {

	@Test
	public void testBusinessLayer() {
		BusinessLayer be = new BusinessLayer();
		
		String actualResponse   = be.getModuleName();
		String expectedResponse = "BusinessLayer Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
