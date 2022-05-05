package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ayuda.conmigo.Business.Alert_template;
import ayuda.conmigo.Dao.AlertDao;
import ayuda.conmigo.Entities.Alert;
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
		

		request.setAttribute("date_alert", request.getParameter("date_alert") );
		request.setAttribute("place_alert", request.getParameter("place_alert") );
		
		//Combo y Cards
		new Functions().prepareCreateAlert(getServletConfig(), request);
		new Functions().prepareCreateAlert(getServletConfig(), request);
		
		//Necesarias Carga
		request.setAttribute("AlertNewONG", "");
		String destino1 = "Alert.jsp";
		
		//Datos ONG logueada (necesarios SACAR DATOS DE BD Y MOSTRAR)
		
		
		
		//Datos Validados (PONER PRIMERA LETRA EN MAYUS antes de registrar)
		String date = request.getParameter("date_alert");
		String place = request.getParameter("place_alert");		
		String allergen = request.getParameter("allergen_alert");
		String annotation = request.getParameter("annotation_alert");
		String productFood = request.getParameter("producto"); //=> es un array checked
		//String nameFood = request.getParameter("annotation_alert"); //=> otra opcion es sacarlo de BD
		String nameONG = "Cruz roja"; //=> lo sacaremos de la ong logueada
		
		/*Prueba..............
		String date = "2022-05-22";
		String place = "C/ Misisipi 34";		
		String allergen = "";
		String annotation = "";
		int productFood = 1;
		String nameProduct = "Leche";
		String nameONG = "Cruz roja";*/
		
		//Si aprieto el boton y no está vacio
		if(request.getParameter("btnDoAlert") != null) {
			
			// obj alerta
			Alert alertNew = new Alert();
			alertNew.setDate_alert(date); 
			alertNew.setPlace_alert(place);
			alertNew.setAllergen_alert(allergen);
			alertNew.setAnnotation_alert(annotation);
			alertNew.setProduct(1);
			
			//RR = true BD
			if(new AlertDao(getServletConfig()).create(alertNew)) {
				
				//Cambiar nameONG por el de la ONG logueada
				//request.setAttribute("AlertNewONG", new Alert_template().alertTemplateHome(alertNew, nameProduct,nameONG));
				
				request.setAttribute("AlertNewONG","se creo bien");
				
			}else {
				
				request.setAttribute("AlertNewONG", "no se creó" );
				
				
			}
			
			
		}
		// 2.2) Tras confirmar "Boton OK" mandamos los datos a la BD / Si se da a "Cancel" no se mandarán los datos
		
		
		//--------------------------------------------SEND DATA
		// 2.3) Mostramos datos de la alerta recien creada en una tarjeta con el boton eliminar 
		
		
		// 3)   Necesitamos = objeto alerta para guardar los datos y enviarlos a la BD
		// 4)   Necesitamos = conexion a BD getServletConfig()
		
		
		String destino = "Alert.jsp";
		request.getRequestDispatcher(destino).forward(request, response);	
		//doGet(request, response);
	}

}
