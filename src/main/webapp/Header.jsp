<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
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
</body>
</html>