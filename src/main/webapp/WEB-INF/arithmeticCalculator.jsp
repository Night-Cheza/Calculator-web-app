<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Arithmetic Calculator</title>
	</head>
	
	<body>
		<h1>Arithmetic Calculator</h1>
		<form action="arithmetic" method="post"> <!--arithmetic is url used for servlet when creating the servlet -->
			<label for = "firstNum">First:</label>
			<input type = "number" name = "firstNum" id = "firstNum">
			
			<label for = "secontNum">Second:</label>
			<input type = "number" name = "secontNum" id = "secontNum"> <br>
			<button type = "submit" name="calc" value = "plus">+</button>
			<button type = "submit" name = "calc" value = "minus">-</button>
			<button type = "submit" name = "calc" value = "multi">*</button>
			<button type = "submit" name = "calc" value = "modul">%</button>
		</form>
		
		<p>${message}</p> <!-- message is a first parameter from request.setAttribute in servlet file -->
		
		<a href ="age">Age Calculator</a>
	</body>
</html>
