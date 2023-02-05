package com.application.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class BlogApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void dataBaseTest() {
	}

	@Test
	void getMappingTest() {
	}
	String getIp() throws MalformedURLException {
		String urlString = "http://checkip.amazonaws.com/";
		URL url = new URL(urlString);
		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	void getIpTest() throws MalformedURLException {
		System.out.println("This Tests running on: " + getIp());
	}
}
