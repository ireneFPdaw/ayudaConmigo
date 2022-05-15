<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  <!--mapa-->

  <div class="modal fade rounded" id="myMapModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header"  id="colorModalLocal">
                <h4 class="modal-title w-100 text-center">LOCALIZACI�N<span id="lat" class="float-right"></span></h4>
            </div>
            <div class="modal-body">
              <img src="./images/fotoMapa.png" class="img-fluid imagenONGAlert" alt="imgMaps" width="100%"> 
            </div>
            <div class="modal-footer justify-content-center text-center"  id="colorModalLocal"> 
            C. Ministro Fernandez Ordo�ez, 4, 28924 Alcorc�n, Madrid <hr>
                <button type="button" class="btn btn-dark" data-dismiss="modal" id="botonCierre">Cerrar</button>
            </div>
        </div>
    </div>
  </div>

  <!-- Cont�ctanos ICONO SOBRE -->

  <div class="modal fade" id="exampleModal">
    <div class="modal-dialog modal-mg" role="document">
      <div class="modal-content text-center">  
        <div class="modal-header modal-title w-100 text-center" id="colorModalLocal">
          <h4 class="modal-title w-60 text-center">CONTACTO <span id="lat" class="float-right"></span></h4>
          </div>
          <div class="modal-body justify-content-center text-center">
            <p>Si necesitas contactar con nosotros env�a un email a:<p>
            <p id="correoNegrita">help.with.us.ong@gmail.com<p>
            <p>Tambi�n puedes localizarnos en:<p>
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
        <div class="footer-copyright text-center py-3">� 2020 Copyright:
        </div>
        <!-- Copyright -->
      </footer>
      <!-- Final Footer -->
    </div>
</body>
</html>