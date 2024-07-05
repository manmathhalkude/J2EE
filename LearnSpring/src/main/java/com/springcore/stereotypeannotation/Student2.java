package com.springcore.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student2 {
	@Value("manmath")
	private String name;
	@Value("pune")
	private String city;
	@Value("#{temp}")  
	private List<String> address;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

}
