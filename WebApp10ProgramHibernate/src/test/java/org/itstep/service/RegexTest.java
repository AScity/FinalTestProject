package org.itstep.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegexTest {

	@Test
	public void testRegexLoginTrue() {
		Regex regex = new Regex();
		boolean result = regex.regexLogin("Alex");
		assertEquals(true, result);
	}
	
	@Test
	public void testRegexLoginTrueFalse() {
		Regex regex = new Regex();
	}

	@Test
	public void testRegexPassword() {
		
	}

	@Test
	public void testRegexEmail() {
		
	}

	@Test
	public void testRegexFirstName() {
		
	}

	@Test
	public void testRegexSecondName() {
		
	}

}
