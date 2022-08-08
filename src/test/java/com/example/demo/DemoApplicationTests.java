package com.example.demo;

import com.example.demo.student.AdditionalMethods;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public static void main(String[] args) {
		System.out.println(AdditionalMethods.isEmailValid("artak.es.karapetyan@gmail.com"));
		System.out.println(AdditionalMethods.isEmailValid("@mail.com"));
	}

}
