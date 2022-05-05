<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--CSS-->
  <link rel="stylesheet" href="./libBoot/bootstrap.min.css">
  <!--Logo cabecera-->
  <link rel="shortcut icon" href="./images/ico/logo png.ico">
  <link rel="stylesheet" href="./css/style.css">
  <!--Librerias-->
  
  <script src="./libBoot/jquery.slim.min.js"></script>
  <script src="./libBoot/popper.min.js"></script>
  <script src="./libBoot/bootstrap.bundle.min.js"></script>
  <script src="./libBoot/fontAwesome.js"></script>
  
<title>Insert title here</title>

</head>
<body>
	<script type="text/javaScript" src="./js/Validation.js"></script>
	<h1>TARJETAS PRODUCTOS</h1>
	<div class="container">
		<form action="Alerts_Controller" method="post" onsubmit="return validationAlertForm()">
			<label>Fecha comienzo de entrega:</label>
			<input type="date" name="date_alert" id="dateInput" value="${date_alert}" >
			<small id="smsDate" class="form-text text-muted"></small>
			<label>Sede: </label>
			<input type="text" name="place_alert" id="placeInput" value="${place_alert}">
			<small id="smsPlace" class="form-text text-muted"></small>
			<br/>
			<!-- Combo Tipo producto -->
			${comboType} 
			<br/>
			<br/>
			<!-- Card dependiendo del producto -->
			${cardProduct}
			<small id="smsProduct" class="form-text text-muted"></small>
			<br/>
			<label>*Alérgenos:</label>
			<input type="text" name="allergen_alert" id="allergenInput" placeholder="leche sin lactosa...">
			<small id="smsAllergen" class="form-text text-muted"></small>
			<label>*Anotaciones(Puede incluir la fecha de finalización de entrega): </label>
			<input type="text" name="annotation_alert" id="annotationInput" placeholder="talla xs...">
			<small id="smsAnnotation" class="form-text text-muted"></small>
			<label>(*Opcionales):</label>
			<br/>
			<br/>
			<input type="submit" value="Crear Alerta" id="btnDoAlert" name="btnDoAlert" >
			<input type="button" value="Cancelar Alerta" id="cancel" name="btnDoCancel" >
		</form>
	</div>
</body>
</html>