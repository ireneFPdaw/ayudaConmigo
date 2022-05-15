package ayuda.conmigo.Business;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.AlertShow;
import ayuda.conmigo.Entities.Comment;
import ayuda.conmigo.Entities.Product;

public class Alert_template {

		public String alertTemplatePage (ArrayList<AlertShow> listAlertsByONG)  {
			
			String tableAlert = "";
			//Alerta en pagina principal sin imagen => opcion borrar
			for (AlertShow a : listAlertsByONG) {
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
	
	
		public String alertTemplateHome (ArrayList<AlertShow> listDataAlerts)  {
		
			
			String tableAlertHome = "";
			//Alerta en pagina principal sin imagen => opcion seleccionar
			for (AlertShow a : listDataAlerts) {
				tableAlertHome += "<div  class='row mt-2 ml-2 mt-2 mp-2 mw-50' id='"+a.getId_alert()+"'/>"
					+ "<div class=\"col-md-4\">"
					+ "<img src=\"./images/img/flor_morada.png\" class=\"img-fluid imagenONGAlert\" alt=\"imgONG\">"
					+ "</div>"
					+ "<div class='col-md-8 imagenONGAlert'>"
					+ "<form method=\"post\" >"
					+ "<table class='table table-sm table-light'>"
					+ "<thead><tr> <th scope='col' colspan='3' >"+ a.getOng()+"</th>"
					+ "</tr></thead><tbody><tr><th scope='col' colspan='3' >"+ a.getProduct() +"</th> </tr>"
					+ "<tr><th scope='col'>Comienzo fecha de entrega</th><th scope='row'>Localización:</th>"
					+ " <th scope='row'>*Alergenos</th></tr>"
					+ "<tr><th scope='row'>"+ a.getDate_alert()+" </th><th scope='row'>"+ a.getPlace_alert()+" </th>  "
					+ "<th scope='row'>"+a.getAllergen_alert()+"</th></tr>"
					+ "<tr><th scope='row' colspan='3'>*Especificaciones</th></tr>"
					+ "<tr><th scope='row'>"+a.getAnnotation_alert()+"</th><th scope='row'></th></tr><tr></tr>"
					+ "<tr><th scope='row'>Deje un mensaje para la ONG orientativo de la cantidad a donar:</th>"
					+ "<th scope='row' colspan='2'>"
					+ "<textarea name='observation' class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"7\" value='' placeholder=\"Llevaré 5 bolsas/nombre: Juan Ramiro\">"
					+ "</textarea></th></tr><tr><th>Puede indicar su nombre o poner 'Anónimo'</th><th><input type='text' name='nameComment'/></th></tr>"
					+ "<tr><th scope='row'>"
					+ "<input type='text' value='"+a.getId_alert()+"'name='alert' style='display: none;'/></th>"
					+ "<th scope='row'>"
					+ "<input type='submit' name='btnSelect' class='btn btn-info' value='ENVIAR AVISO'/></th><th><input type='button' name='btnShowComment' class='btn btn-info' value='COMENTARIOS'/></th>"
					+ "</tr>"
					+ "</tbody>"
					+ "</table>"
					+ "</form></div>"
					+ "</div>";
			}
			
			return  tableAlertHome;
		}	
		
		public String commentTemplateAlert (ArrayList<Comment> listCommentByAlert) {
			
			
			String commentAlert = "Esto es el comentario : " ;
			
			for (Comment comment : listCommentByAlert) {
				
				commentAlert += comment.getId() + "," + comment.getComment()+ ","+ comment.getName_user() + "," + comment.getId_alert();
				
				
			}
			
			return commentAlert;
			
		
		}
		
		
}
