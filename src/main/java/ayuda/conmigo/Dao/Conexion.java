package ayuda.conmigo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;

public class Conexion {

	protected Connection conexion;

	private String driver; 			// driver
	private String dbConnection; 	// host, ip
	private String dbUser;
	private String dbPassword;

	//Pasamos por parametro el objeto que recoge los valores de la conexion en el .xml
	public Conexion(ServletConfig servletConfig) {
		this.driver = "com.mysql.cj.jdbc.Driver";
		this.dbConnection = servletConfig.getServletContext().getInitParameter("dbConnection");;
		this.dbUser = servletConfig.getServletContext().getInitParameter("dbUser");;
		this.dbPassword = servletConfig.getServletContext().getInitParameter("dbPassword");;
	}

	public void conectar() {
		
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(dbConnection, dbUser, dbPassword);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void desconectar() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
			}

		} catch (SQLException e) {
			e.printStackTrace(); //Aqui conectariamos con un modulo-log y mandamos el error alli
		}
	}

}
