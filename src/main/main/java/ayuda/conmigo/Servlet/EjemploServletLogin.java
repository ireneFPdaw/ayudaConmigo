package ayuda.conmigo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ayuda.conmigo.Business.EjemploFunHash;
import ayuda.conmigo.Entities.Usuario;

@WebServlet("/ServletLogin")
public class EjemploServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EjemploServletLogin() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recogemos datos del formulario
		String nombre = request.getParameter("textUsuario");
		String passwd = request.getParameter("textContra");
		
		//Destino default
		String destino = "Login.jsp";
		
		//objeto sesion
		HttpSession session = request.getSession();
		
		//sms por defecto
		request.setAttribute("encontrado", "");
	
		//Comparar contraseñas BD-Form: mandar a pagina intro con la cabecera. Necesito para chekear(nombre, passwd y config)
		if(new EjemploFunHash().checkearAcceso(nombre, passwd, getServletConfig())) {
			
			//objeto Usuario (solo el dato del constructor que nos interesa) para el objeto session
			Usuario user = new Usuario();
			user.setNombre(nombre);
			user.setPasswd("");
			user.setEdad(0);
			
			//Usamos sesion: pide objeto
			session.setAttribute("logueado", user);//session.setMaxInactiveInterval(60*20);
			
			//Cuando se loguea le redirigimos a esta pagina
			destino = "Intro.jsp";
			
		}else {
			
			//Si no coinciden mandar al login y mensaje
			destino = "Login.jsp";
			request.setAttribute("encontrado", "Usuario no encontrado");
		}
		
		//Mando resultados
		request.getRequestDispatcher(destino).forward(request, response);
		
		//doGet(request, response);
	}

}
