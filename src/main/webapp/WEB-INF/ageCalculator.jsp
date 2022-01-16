<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Age Calculator</title>
		
		<link href = "css/style.css" type = "text/css" rel = "stylesheet">
	</head>
	
	<body>
		<h1>Age Calculator</h1>
		<form action="age" method="post"> <!--age is url used for servlet (when creating the servlet -->
			<label for = "age">Enter your age</label>
			<input type = "number" name = "age" id = "age">
			<button type = "submit">Submit</button>
		</form>
		
		<p>${message}</p> <!-- message is a first parameter from request.setAttribute in servlet file -->
	</body>
</html>
