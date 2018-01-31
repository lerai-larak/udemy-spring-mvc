package org.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	@Min(value=0, message="Age too small")
	@Max(value=90, message="Age too high")
	@NotNull(message="WTF!...Age is required, ")
	private Integer age;

	private String firstName;
	
	//add validation rule for last name
	@NotNull(message="WTF!...Last name is required, ")
	@Size(min=1, message="is required")
	private String lastName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Must be valid postal code length 5")
	private String postalCode;
	
	@CourseCode(value="MIT",message="That aint right man, start with MIT")
	private String courseCode;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	

}
