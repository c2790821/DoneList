package com.example.Warehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.DoneList.Hello;

@SpringBootTest(classes = Hello.class)
class DoneListApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1,1);
	}

}
