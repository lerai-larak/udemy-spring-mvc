package org.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {

	private String firstName;
	private String lastName;
	private LinkedHashMap <String, String> countryOptions;
	private String country;
	private String programmingLang;
	
	
	
	
	
	public Student() {
		
		//populate country options: can read from file, database or web service
		countryOptions = new LinkedHashMap<>();
		//use ISO country code
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("KE", "Kenya");
		countryOptions.put("DE", "Germany");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}

		
	
	
	
}
