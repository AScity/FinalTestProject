package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="persons")
public class Person {

	@Id
	@Column(name="login", length=50)
	private String login;
	@Column(name="password", length=50)
	private String password;
	@Column(name="first_name", length=50)
	private String firstName;
	@Column(name="second_name", length=50)
	private String secondName;
	@Column(name="age")
	private Integer age;
	@Column(name="sex", length=10)
	private String sex;
	@Column(name="address", length=50)
	private String address;
	@Column(name="email", length=50)
	private String email;
	@Column(name="subject", length=50)
	private String subject;
	@Column(name="groups", length=50)
	private String group;
	@Column(name="role", length=10)
	private String role;
	
	public Person(String login, String password, String firstName, String secondName, Integer age, String sex,
			String address, String email, String subject, String role) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.subject = subject;
		this.role = role;
	}

	public Person(String login, String password, String firstName, String secondName, Integer age, String email,
			String group, String role) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.email = email;
		this.group = group;
		this.role = role;
	}	
}
