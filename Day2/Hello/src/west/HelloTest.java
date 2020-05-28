package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {


	@Test
	public void testSayHello() {

		Hello  hello = new Hello();

		String actualOutput   = hello.sayHello();
		String expectedOutput = "Hello World!";

		assertEquals  ( expectedOutput, actualOutput );
	
	}

}
