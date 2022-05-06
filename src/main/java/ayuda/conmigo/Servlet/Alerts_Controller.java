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
		
	
			request.setAttribute("date_alert", request.getParameter("date_alert")); 	   
			request.setAttribute("place_alert", request.getParameter("place_alert"));	  
			
			
			//Combo y Cards
			new Functions().prepareCreateAlert(getServletConfig(), request);
			new Functions().prepareCreateAlert(getServletConfig(), request);
			
			//Necesarias Carga
			request.setAttribute("AlertNewONG", "");
			String destino1 = "Alert.jsp";
			
			//Datos ONG logueada (necesarios SACAR DATOS DE BD Y MOSTRAR)
			
			//Datos Validados 
			String date = request.getParameter("date_alert");
			String place = request.getParameter("place_alert");		
			String allergen = request.getParameter("allergen_alert");
			String annotation = request.getParameter("annotation_alert");
			String nameONG = "Cruz roja"; //=> lo sacaremos de la ong logueada
			
		
				//Si aprieto el boton y no está vacio: saca popup
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
					
					//RR = true BD
					if(new AlertDao(getServletConfig()).create(alertNew)) {
						
						request.setAttribute("AlertNewONG", new Alert_template().alertTemplatePage(alertNew, nameProduct,nameONG)); //**Cambiar nameONG por el de la ONG logueada
						//String mensaje = " => " +date + "," + place+ "," +allergen +"," + annotation+"," + nameProduct;
						//request.setAttribute("AlertNewONG", mensaje);
						
					}else {
						request.setAttribute("AlertNewONG", "Error. No sé pudo crear la alerta" );
					}
					
				}
		
		//SACAR ALERTA EN PG Principal ONG con boton eliminar
		//SACAR ALERTA EN Home -> si la elimina desde su pagina principal se elimina del home
		
		String destino = "Alert.jsp";
		request.getRequestDispatcher(destino).forward(request, response);	
		
	}

}
