package com.example.demo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = ReadingListApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class ReadingListApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

}