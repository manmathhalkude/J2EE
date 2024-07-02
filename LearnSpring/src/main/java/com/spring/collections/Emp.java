package com.spring.collections;

import java.util.*;

public class Emp {
	private String name;
	private List<String> phoneno;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties props;

	private Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Emp(String name, List<String> phoneno, Set<String> address, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phoneno=" + phoneno + ", address=" + address + ", courses=" + courses
				+ ", props=" + props + "]";
	}

}
