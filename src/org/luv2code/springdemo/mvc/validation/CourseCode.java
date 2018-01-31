package org.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//define the default course code value to be used for validation
	public String value() default "LUV";
	
	//define the default error message
	public String message() default "Must start with LUV"; 
	
	//define default groups (used to group related constraints)
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload> [] payload() default {};
}
