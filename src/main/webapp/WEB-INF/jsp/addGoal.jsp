<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<script type="text/css" src="src/main/webapp/WEB-INF/css/app.css"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal</title>

</head>

<body>
	<form:form commandName="goal">
		<form:errors  path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Enter Minutes:</td>
				<td><form:input path="minutes" cssErrorClass="error"/></td>
				<td><form:errors cssClass="error" path="minutes"></form:errors>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enter Goal Minutes" /></td>
			</tr>

		</table>
	</form:form>

</body>
</html>