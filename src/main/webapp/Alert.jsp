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
			<input type="text" name="place_alert" id="placeInput" value="${place_alert}" placeholder="C/Cuenca...">
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
			<input type="submit" value="Crear Alerta" class="btn btn-info" id="Confirm" name="btnDoAlert" >
			<!-- <button value="Crear Alerta" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Crear</button>
			<!-- Modal
				<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
					      <div class="modal-body">
					      	<h1>¿Está seguro de querer crear la alerta?</h1>
					      </div>
					      <div class="modal-footer">
					        <input type="submit" class="btn btn-sucess" value="Confirmar" id="btnConfirm" name="btnDoAlert" >
					        <button type="button" class="btn btn-primary" data-dismiss="modal">Cancelar</button>
					      </div>
				    </div>
				  </div>
				</div> -->
			<input type="button" value="Limpiar Formulario" class="btn btn-info" id="cancel" name="btnDoCancel" onclick="clear()">
		</form>
		<br/>
		${AlertNewONG}
		${alertsBdByOng}
	</div>
</body>
</html>