package com.vision.spockdemo.model;

public enum Gender {
	MALE("Male"), 
	FEMALE("Female"),
	;
	private String code;

	private Gender(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
