
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!--  reference jstl library -->
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName } <br> Country is: ${student.country}
	<br>Programming Language: ${student.programmingLang}
	<br>
	Operating Systems Selected: 
	<ul>
	<c:forEach var="item" items="${student.operatingSystems}">
		<li>${item}</li>
	</c:forEach>
	</ul>
</body>
</html>