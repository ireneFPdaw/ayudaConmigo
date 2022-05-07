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
	public boolean create(Alert obj) {
		
		conectar();
		boolean insert = false;
		int result = 0;
		
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call createAlert(?,?,?,?,?,?)}");
			consulta.setString(1,obj.getDate_alert());
			consulta.setString(2,obj.getPlace_alert());
			consulta.setString(3,obj.getAllergen_alert());
			consulta.setString(4,obj.getAnnotation_alert());
			consulta.setInt(5,obj.getProduct());
			consulta.setInt(6,obj.getOng());
			
			result = consulta.executeUpdate();
			if(result != 0)
			{
				insert = true;
			}			
			
			consulta.close();
			
			
		}catch(SQLException e) {
			
			
			e.printStackTrace();
		}
		
		desconectar();
		return insert;
	
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
