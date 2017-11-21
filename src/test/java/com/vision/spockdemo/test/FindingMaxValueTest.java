package com.vision.spockdemo.test;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class FindingMaxValueTest {
	@Test
	public void should_return_max_value() throws Exception {
		int maxvalue = Math.max(1, 1);
		assertThat(maxvalue, CoreMatchers.equalTo(1));
		
		maxvalue = Math.max(1, 2);
		assertThat(maxvalue, CoreMatchers.equalTo(2));
		
		maxvalue = Math.max(3, 1);
		assertThat(maxvalue, CoreMatchers.equalTo(1));
		
		maxvalue = Math.max(5, 7);
		assertThat(maxvalue, CoreMatchers.equalTo(7));
		
		maxvalue = Math.max(8, 9);
		assertThat(maxvalue, CoreMatchers.equalTo(8));
	}
}
