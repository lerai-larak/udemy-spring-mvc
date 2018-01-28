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
		<form:radiobuttons path="programmingLang" items="${pLangOptions}"></form:radiobuttons>
		<br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Solaris <form:checkbox path="operatingSystems" value="Solaris"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="Mac OS"/>
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