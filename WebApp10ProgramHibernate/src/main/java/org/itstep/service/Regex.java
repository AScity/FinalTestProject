package org.itstep.service;

public class Regex {

	public static boolean regexLogin(String login) {
		return login.matches("[A-Za-z]{1}[a-z0-9]+");
	}

	public static boolean regexPassword(String password) {
		return password.matches("[A-Za-z0-9]+");
	}
	
	public static boolean regexEmail(String email) {
		return email.matches("[A-Za-z0-9]+@[A-Za-z0-9]+.[a-z]{2,4}");
	}
	
	public static boolean regexFirstName(String firstName) {
		return firstName.matches("[A-Z]{1}[A-Za-z]+");
	}
	
	public static boolean regexSecondName(String secondName) {
		return secondName.matches("[A-Z]{1}[A-Za-z]+");
	}

}
