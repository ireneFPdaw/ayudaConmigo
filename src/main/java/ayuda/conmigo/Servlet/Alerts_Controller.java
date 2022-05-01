package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Alerts_Controller")
public class Alerts_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Alerts_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//--------------------------------------------VIEW CREATE ALERTS
		// 1)   Una vez logueada la ONG entrará en este controlador (Página formulario alertas)
		
		
		//--------------------------------------------SEND DATA
		
		// 1.1) Mandar datos de combo producto al formulario (combo creado en utils) (import de clase necesaria)
		// 1.2) Mostramos datos de la ONG logueada (html-String datosONG en utils) (import de clase necesaria)
		
		
		//--------------------------------------------COLLECTING DATA
		// 2)   Recogemos los datos previamente validados con js 
		// 2.1) Mostramos datos en ventana emergente de la alerta generada desde este controlador sin mandar a BD (crear ventana emergente en utils)
		// 2.2) Tras confirmar "Boton OK" mandamos los datos a la BD / Si se da a "Cancel" no se mandarán los datos
		
		
		//--------------------------------------------SEND DATA
		// 2.3) Mostramos datos de la alerta recien creada en una tarjeta con el boton eliminar 
		
		
		// 3)   Necesitamos = objeto alerta para guardar los datos y enviarlos a la BD
		// 4)   Necesitamos = conexion a BD getServletConfig()
		
		
		//doGet(request, response);
	}

}
