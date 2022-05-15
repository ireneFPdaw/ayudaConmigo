package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ayuda.conmigo.Business.Alert_template;
import ayuda.conmigo.Dao.CommentDao;
import ayuda.conmigo.Entities.Comment;
import ayuda.conmigo.Utils.FunctionsAlerts;

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
		
		new FunctionsAlerts().prepareAlertHome(getServletConfig(), request);
		
		if(request.getParameter("searchBtn") != null) {
			
			//Recojo el filtro
			String dataSearch = request.getParameter("searchData");
			
			//Recogemos las alertas que son seleccionadas y solo mostramos esas actualizando el show
			
			new FunctionsAlerts().prepareAlertHomeFiltre(getServletConfig(), request, dataSearch);
			
		}
		
		if(request.getParameter("btnSelect") != null) {
			//Al dejar el aviso recogemos los datos
			String comment = request.getParameter("observation");
			String nameCom = request.getParameter("nameComment");
			String id_alert = request.getParameter("alert");
			int id = Integer.parseInt(id_alert);
			
			//Objeto por defecto sin id del comentario
			Comment newComment = new Comment();
			newComment.setComment(comment);
			newComment.setName_user(nameCom);
			newComment.setId_alert(id);
			
			
			//Creamos en BD el comentario de la alerta y es enviado a ONGS view y mostrados en desplegable en el home
			if(new CommentDao(getServletConfig()).create(newComment)) {
				
				String creado = "insertado";
				
				new FunctionsAlerts().prepareCommentAlert(getServletConfig(), request, id);
				
				
			}else {
				
				String creado = "no creado";
			}
			
		}
		
		String destino = "Home.jsp";
		request.getRequestDispatcher(destino).forward(request, response);
		
		//doGet(request, response);
	}

}
