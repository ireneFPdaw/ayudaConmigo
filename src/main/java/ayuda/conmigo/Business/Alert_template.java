package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.Product;

public class Alert_template {

		
		public String alertTemplatePage (Alert obj, String name, String nameONG)  {
			
			//Alerta en pagina principal sin imagen => opcion borrado
			String tableAlert = "";
			return  tableAlert += "<div class='row mt-2 ml-2 mt-2 mp-2' name='"+obj.getId_alert()+"'>"
					+ "<div class='col-md-4'></div>"
					+ "<div class='col-md-8 imagenONGAlert'><table class='table table-sm table-light'><thead><tr> <th scope='col' colspan='3'>"+nameONG+"</th>"
					+ " </tr></thead> <tbody> <tr> <th scope='col' colspan='3'>" +name+"</th> </tr> <tr> <th scope='col'>Comienzo fecha de entrega</th>"
					+ "<th scope='row'>Localización:</th>  <th scope='row'>*Alergenos</th></tr> <tr> <th scope='row'>"+obj.getDate_alert()+" </th><th scope='row'>"+obj.getPlace_alert()+" </th>  "
					+ " <th scope='row'>"+obj.getAllergen_alert()+"</th></tr><tr><th scope='row' colspan='3'>*Especificaciones</th></tr> <tr> <th scope='row'>"+obj.getAnnotation_alert()+"</th>"
					+ " <th scope='row'></th></tr><tr><th scope='row'></th>"
					+ " <th scope='row'></th><th scope='row'><input type='submit' name='btnDoDelete' id='btnDeleteAlert' class='btn btn-danger'></th> </tr>"
					+ "</tbody></table></div></div>";
		}	
		
		public String alertTemplateHome (Alert obj, String name, String nameONG)  {
			
			//Alerta en pagina Home con imagen
			String tableAlert = "";
			return  tableAlert += "<div class='row mt-2 ml-2 mt-2 mp-2' name='"+obj.getId_alert()+"'>"
					+ "<div class='col-md-4'><img src='./images/img/flor_morada.png' class='img-fluid imagenONGAlert' alt='imgONG' width='80%'></div>"
					+ "<div class='col-md-8 imagenONGAlert'><table class='table table-sm table-light'><thead><tr> <th scope='col' colspan='3'>"+nameONG+"</th>"
					+ " </tr></thead> <tbody> <tr> <th scope='col' colspan='3'>" +name+"</th> </tr> <tr> <th scope='col'>Comienzo fecha de entrega</th>"
					+ "<th scope='row'>Localización:</th>  <th scope='row'>*Alergenos</th></tr> <tr> <th scope='row'>"+obj.getDate_alert()+" </th><th scope='row'>"+obj.getPlace_alert()+" </th>  "
					+ " <th scope='row'>"+obj.getAllergen_alert()+"</th></tr><tr><th scope='row' colspan='3'>*Especificaciones</th></tr> <tr> <th scope='row'>"+obj.getAnnotation_alert()+"</th>"
					+ " <th scope='row'></th></tr><tr><th scope='row'></th>"
					+ " <th scope='row'></th><th scope='row'><input type='submit' name='btnDoDelete' id='btnDeleteAlert' class='btn btn-danger'>ELIMINAR</button></th> </tr>"
					+ "</tbody></table></div></div>";
		}	
		
		
		
}
