package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.Product;

public class Alert_template {

		public String alertTemplatePage (ArrayList<Alert> listAlertsByONG)  {
			
			String tableAlert = "";
			//Alerta en pagina principal sin imagen => opcion borrar
			for (Alert a : listAlertsByONG) {
				tableAlert += "<div style='border:1px solid black' class='row mt-2 ml-2 mt-2 mp-2'>"
					+ "<div class='col-md-12 imagenONGAlert'><form method=\"post\" action=\"\"><table class='table table-sm table-light'><thead><tr> <th scope='col' colspan='3'>"+ a.getOng()+"</th>"
					+ "</tr></thead> <tbody> <tr> <th scope='col' colspan='3' >"+ a.getProduct() +"</th> </tr>"
					+ "<tr> <th scope='col'>Comienzo fecha de entrega</th><th scope='row'>Localización:</th>  <th scope='row'>*Alergenos</th></tr>"
					+ "<tr> <th scope='row'>"+ a.getDate_alert()+" </th><th scope='row'>"+ a.getPlace_alert()+" </th>  "
					+ "<th scope='row'>"+a.getAllergen_alert()+"</th></tr>"
					+ "<tr><th scope='row' colspan='3'>*Especificaciones</th></tr>"
					+ "<tr> <th scope='row'>"+a.getAnnotation_alert()+"</th>"
					+ "<th scope='row'></th></tr>"
					+ "<tr><th scope='row'></th>"
					+ "<th scope='row'><input type='text' value='"+a.getId_alert()+"' name='alert' style='display: none;'/></th><th scope='row'><input type='submit' name='btnDelete' class='btn btn-danger' value='Eliminar' formaction=\"Alerts_Controller\"/></th></tr>"
					+ "</tbody></table></form></div></div>";
			}
			
		
			return  tableAlert;
		}	
	
		/*public String alertTemplatePage (Alert obj, String name, String nameONG)  {
			
			//Alerta en pagina principal sin imagen => opcion borrado
			String tableAlert = "";
			return  tableAlert += "<div class='row mt-2 ml-2 mt-2 mp-2' name='"+obj.getId_alert()+"'>"
					+ "<div class='col-md-4'><div class="col-md-4"></div></div>"
					+ "<div class='col-md-8 imagenONGAlert'><table class='table table-sm table-light'><thead><tr> <th scope='col' colspan='3'>"+nameONG+"</th>"
					+ " </tr></thead> <tbody> <tr> <th scope='col' colspan='3'>" +name+"</th> </tr> <tr> <th scope='col'>Comienzo fecha de entrega</th>"
					+ "<th scope='row'>Localización:</th>  <th scope='row'>*Alergenos</th></tr> <tr> <th scope='row'>"+obj.getDate_alert()+" </th><th scope='row'>"+obj.getPlace_alert()+" </th>  "
					+ " <th scope='row'>"+obj.getAllergen_alert()+"</th></tr><tr><th scope='row' colspan='3'>*Especificaciones</th></tr> <tr> <th scope='row'>"+obj.getAnnotation_alert()+"</th>"
					+ " <th scope='row'></th></tr><tr><th scope='row'></th>"
					+ " <th scope='row'></th><th scope='row'><input type='submit' name='btnDoDelete' id='btnDeleteAlert' class='btn btn-danger' value='Eliminar'/></th> </tr>"
					+ "</tbody></table></div></div>";
		}	
		*/
	
		public String alertTemplateHome (ArrayList<Alert> listDataAlerts)  {
			
			String tableAlertHome = "";
			//Alerta en pagina principal sin imagen => opcion borrar
			for (Alert a : listDataAlerts) {
				tableAlertHome += "<div  class='row mt-2 ml-2 mt-2 mp-2'>"
					+ "<div class=\"col-md-4\"><img src=\"./images/img/flor_morada.png\" class=\"img-fluid imagenONGAlert\" alt=\"imgONG\" width=\"80%\"></div>"
					+ "<div class='col-md-8 imagenONGAlert'><form method=\"post\" action=\"\"><table class='table table-sm table-light'><thead><tr> <th scope='col' colspan='3'>"+ a.getOng()+"</th>"
					+ "</tr></thead> <tbody> <tr> <th scope='col' colspan='3' >"+ a.getProduct() +"</th> </tr>"
					+ "<tr> <th scope='col'>Comienzo fecha de entrega</th><th scope='row'>Localización:</th>  <th scope='row'>*Alergenos</th></tr>"
					+ "<tr> <th scope='row'>"+ a.getDate_alert()+" </th><th scope='row'>"+ a.getPlace_alert()+" </th>  "
					+ "<th scope='row'>"+a.getAllergen_alert()+"</th></tr>"
					+ "<tr><th scope='row' colspan='3'>*Especificaciones</th></tr>"
					+ "<tr> <th scope='row'>"+a.getAnnotation_alert()+"</th>"
					+ "<th scope='row'></th></tr>"
					+ "</tbody></table></form></div></div>";
			}
			
			return  tableAlertHome;
			
			
		}	
		
		
		
}
