 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm mới</title>
</head>
<body>

<h1>Thêm country</h1>
<form action="InsertProServlet" method="post">
	Country Name <input type="text" name="CountryName"/><br>
	Position <input type="text" name="Position"/><br>
	Area <input type="text" name="Area"/><br>
	Population <input type="text" name="Population"/><br>
	<button>Lưu</button>
</form>
</body>
</html>