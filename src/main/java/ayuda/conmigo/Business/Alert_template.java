package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.Product;

public class Alert_template {

	//Dependiendo del tipo elegido se moestrarán unas tarjetas
		public String alertTemplateHome (Alert obj, String name, String nameONG)  {
			
			String tableAlert = "";
			return  tableAlert +=" <div class='col-md-4'>"
					+ "<img src='./images/img/alert_img/flor_morada.jpg' class='img-fluid imagenONGAlert' alt='imgONG'></div>"
					+ "<div class='col-md-8 imagenONGAlert'>"
					+ "<table class='table table-sm table-light'>"
					+ "<thead><tr><th scope=\"col\" colspan=\"2\">"+nameONG+"</th></tr>"
					+ "<tr>  <th scope='col'>" + name + "</th>"
					+ "<th scope='col'>Comienzo fecha de entrega</th></tr></thead>"
					+ "<tbody> <tr><th scope='row'>Localización:</th> <th scope='row'>" + obj.getDate_alert()+": </th></tr> <tr> <th scope='row'>"+obj.getPlace_alert()+"</th> <th scope='row'>*Alergenos</th>"
					+ "</tr> <tr> <th scope='row'>Especificaciones</th> <th scope='row'>"+obj.getAllergen_alert()+"</th></tr>  <tr> <th scope='row'><button type='button' class='btn btn-success'>Success</button></th><th scope='row'>"+obj.getAnnotation_alert()+"</th> "
					+ "</tr></tbody></table></div> </div>";
		}	
}
