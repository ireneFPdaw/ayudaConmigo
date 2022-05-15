<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta charset="ISO-8859-1">
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
  <script src="./js/ButtonSelect.js"></script>
  
<title>AyudaConmigo</title>
</head>
<body>

<!--Contenedor-->
<div class="">

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
                  <form class="form-inline w-70 active-purple-4" action="AlertsHome_Controller">
                      <input class="form-control mr-sm-2 w-50" type="text" name="searchData" placeholder="search...">
                      <button class="btn btn btn-secondary w-30" type="submit" name="searchBtn">Buscar</button>
                  </form>
              </nav>
            </div>
          </li>
        </ul>
      </div>
    </nav>

  </div>
  

  <!-- FILA 2 CONTENIDO-->
  <div class="row mt-2 ">

        <!-- Barra navegación vertical -->

        <div class="col-md-3 mt-5 pt-5 pr-3">
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
		  <div class="row">
		  	  <div class="col-md-12 pl-2 mt-1 mb-1 pr-2 justifycontento verflow-auto text-align">
		  	  <p >¿Estás interesado en hacer una donación a alguna de nuestras ONGS? Este proceso es muy sencillo, lo único que tienes que hacer es buscar la donación deslizandote por nuestras alertas o buscándolas en el "Search". 
		  	  Una vez elegida la alerta podrás bloquearla dando al botón "Seleccionar". Una vez que hayas selecciona la alerta no podrán verla otros usuarios por lo que así nuestra organización realiza un control de exceso de excedentes.
		  	  Una vez bloqueada ¡TE ESTAREMOS ESPERANDO CON LOS BRAZOS ABIERTO EN LAS FECHAS MARCAS PARA LA ENTREGA DE TU DONACIÓN!</p><hr/>
		  	  </div>
		  </div>
          ${alertsHome}
          ${commentsByAlert}
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