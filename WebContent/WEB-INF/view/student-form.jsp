<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/><br><br/>
		Last Name: <form:input path="lastName"/><br><br/>
		Programming Language:
		Java <form:radiobutton path="programmingLanguage" value="Java"/>
		C# <form:radiobutton path="programmingLanguage" value="C#"/>
		Ruby <form:radiobutton path="programmingLanguage" value="Ruby"/>
		PHP <form:radiobutton path="programmingLanguage" value="PHP"/>
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/> 
		</form:select>
		<br><br>
				<input type="submit" value="Register Student">
	</form:form>
	
</body>
</html>