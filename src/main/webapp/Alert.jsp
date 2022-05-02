<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>TARJETAS PRODUCTOS</h1>
	<div class="container">
		<form action="Alerts_Controller" method="post">
			<label>Fecha de entrega:</label>
			<input type="date" name="date_alert">
			<label>Sede: </label>
			<input type="text" name="place_alert">
			<label>Alérgenos:</label>
			<input type="text" name="allergen_alert">
			<label>Anotaciones:</label>
			<input type="text" name="annotation_alert">
			<!-- Combo Tipo producto -->
			${comboType} 
			<br/>
			<!-- Card dependiendo del producto -->
			${cardProduct}
			<br/>
			<input type="submit" value="Crear Alerta" id="btnDoAlert" name="btnDoAlert">
			<input type="submit" value="Cancelar Alerta" id="btnDoCancel" name="btnDoCancel">
		</form>
	</div>
</body>
</html>