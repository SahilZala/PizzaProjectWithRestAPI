package com.pack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PizzaProjectWIthRestApiApplicationTests {

	int val = 0;
	@Test
	void contextLoads() {
		assertEquals(0,val);
	}

}
