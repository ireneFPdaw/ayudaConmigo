package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		
		//--------------------------------------------VIEW CREATE ALERTS
		// 1)   Una vez logueada la ONG entrará en este controlador (Página formulario alertas)
		request.setAttribute("date_alert", request.getParameter("date_alert") );
		request.setAttribute("place_alert", request.getParameter("place_alert") );
		
		//--------------------------------------------SEND DATA
		
		// 1.1) Mandar datos de combo producto al formulario (combo creado en utils) (import de clase necesaria)
		new Functions().prepareCreateAlert(getServletConfig(), request);
		
		new Functions().prepareCreateAlert(getServletConfig(), request);
		
		// 1.2) Mostramos datos de la ONG logueada (html-String datosONG en utils) (import de clase necesaria)
		
		
		//--------------------------------------------COLLECTING DATA
		// 2)   Recogemos los datos previamente validados con js 
		
		String date = request.getParameter("date_alert");
		String place = request.getParameter("place_alert");		
		String allergen = request.getParameter("allergen_alert");
		String annotation = request.getParameter("annotation_alert");
		String productComida = request.getParameter("Comida");
		String productRopa = request.getParameter("Ropa");
		
		System.out.println(date);
		System.out.println(place);
		// 2.1) Mostramos datos en ventana emergente de la alerta generada desde este controlador sin mandar a BD (crear ventana emergente en utils)
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
