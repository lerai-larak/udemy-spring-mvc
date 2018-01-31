package org.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		coursePrefix = constraintAnnotation.value();
	}
	
	//method to do the actual validation
	@Override
	public boolean isValid(String enteredCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = false;
		if(enteredCode != null) {
			result = enteredCode.startsWith(coursePrefix); //starts with LUV
		}else {
			result = true;
		}
		
		return result;
	}

}
