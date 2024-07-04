package com.springcore.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, String> feestructure;
	private Properties properties;

	private Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, String> feestructure) {
		this.feestructure = feestructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}

}
