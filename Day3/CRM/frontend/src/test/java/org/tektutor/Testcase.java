package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testcase {

	@Test
	public void testFrontend() {
		Frontend fe = new Frontend();
		
		String actualResponse   = fe.getModuleName();
		String expectedResponse = "Frontend Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
