package ayuda.conmigo.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ayuda.conmigo.Business.Alert_template;
import ayuda.conmigo.Dao.AlertDao;
import ayuda.conmigo.Dao.ProductDao;
import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.Product;
import ayuda.conmigo.Utils.Functions;



@WebServlet("/Alerts_Controller")
public class Alerts_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Alerts_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			//Datos ONG logueada (necesarios SACAR DATOS DE BD Y MOSTRAR)
			String nameONG = "Cruz roja"; //=> lo sacaremos de la ong logueada
			String ONG = "El pato Amarillo"; // => lo sacaremos de la ong logueada
			int idONG = 1;
			//Para mantener datos en formulario con onchange del combo
			request.setAttribute("date_alert", request.getParameter("date_alert")); 	   
			request.setAttribute("place_alert", request.getParameter("place_alert"));	  
			
			//Primera carga => Combo , Cards y alertas ya creadas
			new Functions().prepareCreateAlert(getServletConfig(), request);
			
			//Primera carga => mostramos alertas ya generadas por esa ONG
			new Functions().prepareShowAlert(getServletConfig(), request, ONG);
			
			//Necesarias Carga
			request.setAttribute("AlertNewONG", "");
			
			//Datos Validados 
			String date = request.getParameter("date_alert");
			String place = request.getParameter("place_alert");		
			String allergen = request.getParameter("allergen_alert");
			String annotation = request.getParameter("annotation_alert");
			
		
			//CREAR ALERTA
			if(request.getParameter("btnDoAlert") != null) {
				
				String productFood =request.getParameter("product"); 					//id del seleccionado en string
				int pdNew = Integer.parseInt(productFood);								//id del seleccionado en int
				Product productByID = new ProductDao(getServletConfig()).read(pdNew);	//Obtenemos producto por id seleccionado
				String nameProduct = productByID.getName_producto();					//Nombre del producto seleccionado
				
				
				// obj alerta
				Alert alertNew = new Alert();
				alertNew.setDate_alert(date); 		 
				alertNew.setPlace_alert(place);	
				alertNew.setAllergen_alert(allergen); 		//pueden ser vacios = null
				alertNew.setAnnotation_alert(annotation);	//pueden ser vacios = null
				alertNew.setProduct(pdNew);
				alertNew.setOng(idONG);
				
				//RR = true BD
				if(new AlertDao(getServletConfig()).create(alertNew)) {
					
					//request.setAttribute("AlertNewONG", new Alert_template().alertTemplatePage(alertNew, nameProduct,nameONG)); //**Cambiar nameONG por el de la ONG logueada
					request.setAttribute("AlertNewONG", "Se pudo crear alerta");
					
					//Actualizamos show de alertas de esta ONG
					new Functions().prepareShowAlert(getServletConfig(), request, ONG);
					
				}else {
					request.setAttribute("AlertNewONG", "Error. No sé pudo crear la alerta" );
				}
				
			}
			
			//BORRAR ALERTA
			if(request.getParameter("btnDelete") != null) {
				
				
				String alertSelect = request.getParameter("alert"); //Recojo id
				int idAlert = Integer.parseInt(alertSelect);
				
				if(new AlertDao(getServletConfig()).delete(idAlert)) {
					
					request.setAttribute("AlertNewONG", "eliminado con exito");
					
					new Functions().prepareShowAlert(getServletConfig(), request, ONG); //Actualizamos
					
				}else {
					request.setAttribute("AlertNewONG", "no eliminado. Erorr BD");
				}
		
			}
			
		
		//SACAR ALERTA EN PG Principal ONG con boton eliminar
		//SACAR ALERTA EN Home -> si la elimina desde su pagina principal se elimina del home
		
		String destino = "Alert.jsp";
		request.getRequestDispatcher(destino).forward(request, response);	
		
	}

}
