package com.vision.spockdemo.test.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.vision.spockdemo.model.Gender;
import com.vision.spockdemo.model.Person;

public class InitDataTest {
	private Person initDummyPerson() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Person person = new Person();
		person.setFirstName("Lan");
		person.setLastName("Bui");
		person.setGender(Gender.FEMALE);
		person.setBirthDate(dateFormat.parse("01.10.1991"));
		return person;
	}
	
	@Test
	public void shouldInitDummyPerson() throws Exception {
		System.out.println(initDummyPerson().toString());
	}
}
