package com.vision.spockdemo.model

import java.text.SimpleDateFormat

import spock.lang.Specification

class InitDataSpec extends Specification{
	def "should init dummy Person in normal way"() {
		given:
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			Person person = new Person();
			person.firstName = "Lan";
			person.lastName = "Bui";
			person.gender = Gender.FEMALE;
			person.birthDate = dateFormat.parse("01.10.1991");
		when:
			System.out.println(person.toString());
		then:
			1 == 1
	}
	
	def "should init dummy Person in Groovy way"() {
		given:
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Person person = new Person(firstName: "Elvis", lastName: "Presley", gender: Gender.MALE, birthDate: dateFormat.parse("08.01.1935") );
		when:
			System.out.println(person.toString());
		then:
			1 == 1
	}
	
	def "should init dummy Person in Groovy the 2nd way"() {
		given:
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Person person = new Person();
		person.with {
			firstName = "Brian"
			lastName = "Tracy"
			gender = Gender.MALE
			birthDate = dateFormat.parse("05.01.1944")
		}
		when:
			System.out.println(person.toString());
		then:
			1 == 1
	}
}
