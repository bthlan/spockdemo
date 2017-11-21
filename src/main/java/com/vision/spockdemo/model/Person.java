package com.vision.spockdemo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Gender gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		return "Person[firstName: " + firstName 
				+ ", lastName: " + lastName 
				+ ", gender: " + gender 
				+ ", birthDate: " + dateFormat.format(birthDate) + "]";
	}
}
