package ayuda.conmigo.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import com.mysql.cj.jdbc.CallableStatement;
import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Interfaz.DAOMethods;

public class AlertDao extends Conexion implements DAOMethods<Alert, Integer> {

	public AlertDao(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}

	
	//---------------------------------NEED
	@Override
	public boolean create(Alert obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Alert read(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Alert obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	//---------------------------------------- NOT NEED
	@Override
	public boolean update(Alert obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	//---------------------------------------- MAYBE
	@Override
	public ArrayList<Alert> getValues() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Alert> getValuesById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
