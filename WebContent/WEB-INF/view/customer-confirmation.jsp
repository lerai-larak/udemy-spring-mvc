<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!--  reference jstl library -->

<html>
<head>
<title>Customer Confirmation Page</title>
</head>
<body>
<p>Thanks ${customer.firstName} ${customer.lastName}, age: ${customer.age} for confirmation</p>
<br>Postal Code: ${customer.postalCode}
</body>
</html>