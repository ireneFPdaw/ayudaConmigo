package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ayuda.conmigo.Utils.Functions;

/**
 * Servlet implementation class AlertsHome_Controller
 */
@WebServlet("/AlertsHome_Controller")
public class AlertsHome_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlertsHome_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		new Functions().prepareAlertHome(getServletConfig(), request);
		
		if(request.getParameter("searchBtn") != null) {
			
			//Recojo el filtro
			String dataSearch = request.getParameter("searchData");
			
			//Recogemos las alertas que son seleccionadas y solo mostramos esas actualizando el show
			
			new Functions().prepareAlertHomeFiltre(getServletConfig(), request, dataSearch);
			
		}
		
		String destino = "Home.jsp";
		request.getRequestDispatcher(destino).forward(request, response);
		
		//doGet(request, response);
	}

}
