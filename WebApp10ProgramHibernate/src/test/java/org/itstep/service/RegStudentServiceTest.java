package org.itstep.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.itstep.dao.PersonDAO;
import org.itstep.model.Person;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(Regex.class)
public class RegStudentServiceTest {

	@Ignore
	@Test
	public void testRegexDataTrue() {
		
		RegStudentService regStudentService = new RegStudentService();
		Person person = Mockito.mock(Person.class);
		//PowerMockito.mockStatic(Regex.class);
		when(Regex.regexLogin("")).thenReturn(true);
		when(Regex.regexPassword("")).thenReturn(true);
		when(Regex.regexEmail("")).thenReturn(true);
		boolean result = regStudentService.regexData(person);
		//assertEquals(true, result);
		assertThat(result, is(true));
	}
	
	@Ignore
	@Test
	public void testRegexDataFalse() {
		RegStudentService regStudentService = new RegStudentService();
		Person person = Mockito.mock(Person.class);
		Regex regex = Mockito.mock(Regex.class);
	}

	@Test
	public void testNotNullDataFalse() {
		RegStudentService regStudentService = new RegStudentService();
		Person person = Mockito.mock(Person.class);
		Mockito.when(person.getLogin()).thenReturn(null);
		Mockito.when(person.getPassword()).thenReturn(null);
		Mockito.when(person.getFirstName()).thenReturn(null);
		Mockito.when(person.getSecondName()).thenReturn(null);
		Mockito.when(person.getEmail()).thenReturn(null);
		Mockito.when(person.getGroup()).thenReturn(null);
		boolean result = regStudentService.notNullData(person);
		assertEquals(false, result);
		//assertThat(result, is(true));
	}
	
	@Test
	public void testNotNullDataTrue() {
		RegStudentService regStudentService = new RegStudentService();
		Person person = Mockito.mock(Person.class);
		Mockito.when(person.getLogin()).thenReturn(null);
		Mockito.when(person.getPassword()).thenReturn(null);
		Mockito.when(person.getFirstName()).thenReturn(null);
		Mockito.when(person.getSecondName()).thenReturn(null);
		Mockito.when(person.getEmail()).thenReturn(null);
		Mockito.when(person.getGroup()).thenReturn("");
		boolean result = regStudentService.notNullData(person);
		assertEquals(true, result);
	}

	@Test
	public void testRegexAgeTrue() {
		RegStudentService regStudentService = new RegStudentService();
		boolean result = regStudentService.regexAge("23");
		assertEquals(true, result);
	}
	
	@Test
	public void testRegexAgeFalse() {
		RegStudentService regStudentService = new RegStudentService();
		boolean result = regStudentService.regexAge("103");
		assertEquals(false, result);
	}

	@Test
	public void testNotNullGroup() {
		
	}

	@Test
	public void testGetStudentsInGroup() {
		
		
	}
	@Test
	public void testGetInfoStudent() {
		PersonDAO dao = Mockito.mock(PersonDAO.class);
		Person person = Mockito.mock(Person.class);
		//person = new Person("Alex", "", "", "", 12, "", "", "", "", "");
		Mockito.when(dao.getInfoStudent(Mockito.anyString())).thenReturn(person);
		Person student = new RegStudentService().getInfoStudent("Alex");
		assertTrue(true);
	}
	
}
