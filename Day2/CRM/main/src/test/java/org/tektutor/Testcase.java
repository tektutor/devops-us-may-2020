package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testcase {

	@Test
	public void testMain() {
		Main main = new Main();
		
		String actualResponse   = main.getModuleName();
		String expectedResponse = "Main Module";

		assertEquals ( expectedResponse, actualResponse );
	}

}
