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
  
<title>AyudaConmigo</title>
</head>
<body>
	<!--Contenedor-->
  <div class="container">

    <!-- FILA 1 HEADER -->
    <div class="row">
      <!-- HEADER -->
      <nav class="navbar navbar-expand-lg navbar-light bg-light header fixed-top ml-2 mr-2 mt-2">
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
              <a class="nav-link " href="#">
                <i class="fas fa-map-marker-alt"></i>
                <span
                  class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="#"><i class="fas fa-envelope-square"></i> <span
                  class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="#"><i class="fas fa-user-circle"></i> <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="#"><i class="fas fa-search"></i> <span class="sr-only">(current)</span></a>
            </li>
          </ul>
        </div>
      </nav>
    </div>

    <!-- FILA 2 CONTENIDO-->
    <div class="row mt-2 ">
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

          <!-- ALERTAS -->
          <div class="col-md-9 pl-2 mt-5 pt-5 pr-2 justifycontento ">
			${alertsHome}
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
      <!-- Footer -->
    </div>
  </div>
</body>
</html>