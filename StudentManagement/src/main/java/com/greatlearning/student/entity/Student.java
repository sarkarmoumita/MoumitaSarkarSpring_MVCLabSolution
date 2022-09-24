package com.greatlearning.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "dept")
	private String dept;

	@Column(name = "country")
	private String country;

	// define constructors

	public Student() {

	}

	public Student(String name, String dept, String country) {
		super();

		this.name = name;
		this.dept = dept;
		this.country = country;
	}

	// define getter/setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country =country;
	}

	// define tostring
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", country=" + country + "]";
	}

}
