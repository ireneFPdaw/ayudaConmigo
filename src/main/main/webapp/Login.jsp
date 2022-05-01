<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<form method="post" action="ServletLogin">
		<label>Usuario: </label>
		<input type="text" name="textUsuario">
		<label>Contraseña: </label>
		<input type="password" name="textContra">
		<br/>
		<input type="submit" value="ENVIAR" id="boton" name="loguear">
	</form></div>
	<div><h1>${encontrado}</h1></div>
	<p>¿No tiene cuenta?Registrese<a href="./Alta.jsp">aquí</a></p>
</body>
</html>