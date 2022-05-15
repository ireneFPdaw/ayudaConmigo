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

<!-- Cuando se esté logueado -->
<%
	//Si es false lo mandamos al login
	//if(!Confirm_Log.checkLogUser(session.getAttribute("logueado"))){
		//response.sendRedirect("Login.jsp");
	//}
%>
	<script type="text/javaScript" src="./js/Validation.js"></script>
	
<!--Contenedor-->
<div class="container">

  <!-- FILA 1 HEADER -->

  <div class="row">

    <nav class="navbar navbar-expand-lg navbar-light bg-light header fixed-top ml-2 mr-2 mt-2">
      
      <!-- HEADER -->
      <a class="navbar-brand textTitle" href="#">
        <img src="./images/ico/logo png.ico" alt="logo" id="logo" class="bg-white headerLogo pt-1 pr-2 pl-1 pb-1">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <h4 class="titleheader">Ayuda Conmigo</h4>
        
      <!-- Iconos collapse-->
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
          <h2 class="navbar-brand textTitle"> 34-625750340</h2>
          <li class="nav-item active">
            <a class="nav-link " href="#" data-lat="-15,25" data-toggle="modal" data-target="#myMapModal" class="btn btn-primary">
              
              <i class="fas fa-map-marker-alt"></i>
              <span
                class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#" data-toggle="modal" data-target="#exampleModal"><i class="fas fa-envelope-square"></i> <span
                class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#"><i class="fas fa-user-circle"></i> <span class="sr-only">(current)</span></a>
          </li>
          
          <!--Buscador-->
          <li class="nav-item active">
            <!--<a class="nav-link" href="#"><i class="fas fa-search"></i><span class="sr-only">(current)</span></a>-->
            <a class="nav-link dropdown-toggle text-light" href="#" id="lupa" data-toggle="dropdown"
            aria-haspopup="true" aria-expanded="false"><i class="fas fa-search"></i><span class="sr-only">(current)</span></a>
            <!-- Desplegable de la lupa -->
            <div class="dropdown-menu ml-auto p-2" href="#" id="buscador">
              <nav class="navbar navbar-expand-sm ">
                  <form class="form-inline w-70 active-purple-4" action="">
                      <input class="form-control mr-sm-2 w-50" type="text" placeholder="search...">
                      <button class="btn btn btn-secondary w-30" type="submit">Buscar</button>
                  </form>
              </nav>
            </div>
          </li>
        </ul>
      </div>
    </nav>

  </div>

  <!-- FILA 2 CONTENIDO-->
  <div class="row mt-2">

        <!-- Barra navegación vertical -->

        <div class="col-md-2 mt-5 pt-5">
          <div class="d-flex flex-column flex-shrink-0 bg-dark vh-100 mt-3 fixed-left" style="width: 100px;">
            <ul class="nav nav-pills nav-flush flex-column mb-auto text-center mt-3">
              <li> <a href="#" class="nav-linked py-3 border-bottom rounded-circle mb-3"> <i
                    class="fa fa-hand-pointer-o" aria-hidden="true"></i><small>Ayuda Conmigo</small></a></li>
              <li> <a href="#" class="nav-linked py-3 border-bottom rounded-circle mb-3"> <i class="fa fa-handshake-o"
                    aria-hidden="true"></i> <small>ONGs</small></a></li>
              <li> <a href="#" class="nav-linked py-3 border-bottom rounded-circle mb-3"> <i class="fa fa-star-half-o"
                    aria-hidden="true"></i> <small>Reseñas</small></a></li>
              <li> <a href="#" class="nav-linked py-3 border-bottom rounded-circle"> <i class="fa fa-sign-in"
                    aria-hidden="true"></i> <small>Registro</small></a></li>
            </ul>
          </div>
        </div>

        <!-- DIV DE ALERTAS GENERADAS => DENTRO EN JAVA -->
        <div class="col-md-9 pl-2 mt-5 pt-5 pr-2 justifycontento verflow-auto ">
            <div class="row col-12">
                <div class="col-md-6 pl-5 pt-3 justify-content-center createBox">
	                <div class="row titleCreate"><h2 class="text-center">CREAR ALERTA</h2></div>
	                <div class="row">
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
	                        <input type="submit" value="Crear Alerta" class="btn btn-info ml-5 mb-3 mt-1" id="Confirm" name="btnDoAlert"/>
	                        <input type="button" value="Limpiar Formulario" class="btn btn-info mb-3 mt-1" id="cancel" name="btnDoCancel" onclick="clear()"/>
	                    </form>
	                </div>
                </div><!--CREAR ALERTAS-->
                <div class="col-md-6 pl-2 pt-3 justify-content-center createBox">
                 <div class="row titleCreate"><h2 class="text-center">DATOS ONG</h2></div>
                
                </div><!--DATOS ONG-->
            </div>
            <div class="row">
                <div class="col-md-12  alertsONG">
                     ${AlertNewONG}${alertsBdByOng}
                </div><!--ALERTAS CREADAS-->
            </div>
        </div>
  </div>

  <!--mapa-->

  <div class="modal fade rounded" id="myMapModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header"  id="colorModalLocal">
                <h4 class="modal-title w-100 text-center">LOCALIZACIÓN<span id="lat" class="float-right"></span></h4>
            </div>
            <div class="modal-body">
              <img src="./images/fotoMapa.png" class="img-fluid imagenONGAlert" alt="imgMaps" width="100%"> 
            </div>
            <div class="modal-footer justify-content-center text-center"  id="colorModalLocal"> 
            C. Ministro Fernandez Ordoñez, 4, 28924 Alcorcón, Madrid <hr>
                <button type="button" class="btn btn-dark" data-dismiss="modal" id="botonCierre">Cerrar</button>
            </div>
        </div>
    </div>
  </div>

  <!-- Contáctanos ICONO SOBRE -->

  <div class="modal fade" id="exampleModal">
    <div class="modal-dialog modal-mg" role="document">
      <div class="modal-content text-center">  
        <div class="modal-header modal-title w-100 text-center" id="colorModalLocal">
          <h4 class="modal-title w-60 text-center">CONTACTO <span id="lat" class="float-right"></span></h4>
          </div>
          <div class="modal-body justify-content-center text-center">
            <p>Si necesitas contactar con nosotros envía un email a:<p>
            <p id="correoNegrita">help.with.us.ong@gmail.com<p>
            <p>También puedes localizarnos en:<p>
            <a href="#"><i class="fa fa-facebook fa-2x mr-4" aria-hidden="true"></i></a>
            <a href="#"><i class="fa fa-twitter fa-2x mr-4" aria-hidden="true"></i></a>
            <a href="#"><i class="fa fa-linkedin fa-2x mr-4" aria-hidden="true"></i></a>
            <a href="#"><i class="fa fa-instagram fa-2x mr-4" aria-hidden="true"></i></a>
          </div>
          <div class="modal-footer" id="colorModalLocal">
            <button type="button" class="btn btn-dark " data-dismiss="modal" id="botCenter">Cerrar</button>
        </div>
      </div>
    </div>
  </div>

    <!-- FILA 3 FOOTER-->
    <div class="row">
      <!-- Footer -->
      <footer class="page-footer font-small blue pt-4 footerStyle mb-2 col-md-12">
        <!-- Copyright -->
        <div class="footer-list">
          <div class="row">
            <div class="col-md-4">
              <ul>
                <li>1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
              </ul>
            </div>
            <div class="col-md-4">
              <ul>
                <li>1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
              </ul>
            </div>
            <div class="col-md-4">
              <ul>
                <li>1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
              </ul>
            </div>
          </div>
        </div>
        <div class="footer-copyright text-center py-3">© 2020 Copyright:
        </div>
        <!-- Copyright -->
      </footer>
      <!-- Final Footer -->
    </div>

<!--Final PG-->
</div>
</body>
</html>