<%@ page
	import="java.util.*, java.time.LocalDate,java.text.SimpleDateFormat"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TITOLO</title>
</head>
<body>
	<%
	boolean t = true;
	%>
	<%
	if (t) {
		//System.out.println(t);
	}
	%>

	<h3>
		<%
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		out.print(t + " ");
		//out.print("<BR>");
		out.print("<BR>  ora locale: " + data.toString());
		%>
	</h3>

</body>
</html>