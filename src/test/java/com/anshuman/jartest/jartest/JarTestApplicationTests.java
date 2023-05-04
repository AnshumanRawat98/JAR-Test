package com.anshuman.jartest.jartest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JarTestApplicationTests {

	JarTest jartest = new JarTest();

	@Test
	void jarTestTest() {
		assertEquals("helloWorld", jartest.mathTest());
	}

}
