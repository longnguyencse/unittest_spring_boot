package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = DemoApplication.class)
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void contextLoads() {

	}

	@Test
	public void givenEmployees_whenGetEmployees_thenStatus200()
			throws Exception {

		mvc.perform(get("/123")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

	}
}