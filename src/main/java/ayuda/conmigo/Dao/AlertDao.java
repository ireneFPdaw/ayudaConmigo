package ayuda.conmigo.Dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
	
	@Override
	public boolean create(Alert obj) {
		
		//VV need
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

	public boolean delete(Integer id) {
			conectar();
		
			//VV need
			boolean delete= false;
			int rowDelete = 0;
		
			try {
				
				CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call deleteAlert(?)}");
				consulta.setInt(1,id);
				rowDelete= consulta.executeUpdate();
				
				if(rowDelete > 0) {
					delete= true;
				}
				
				consulta.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			desconectar();
			return delete;
	}

	@Override
	public ArrayList<Alert> getValues(){
		return null;
		
		/*conectar();
		ArrayList<Alert> listDataAlert = new ArrayList<Alert>();
		Alert a = null;
		
				
		try {
			
			//Comprobrar que me recoge el tipo fecha como string
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getAlert()}");
			ResultSet datos = consulta.executeQuery();
			while(datos.next()) {
				
				a = new Alert(datos.getInt("id_alert"), datos.getInt("product"), datos.getInt("ngo"), datos.getString("date_alert"), datos.getString("place_alert"),datos.getString("allergens_alert"),datos.getString("annotation_alert")); //Uso constructor por defecto
				listDataAlert.add(a);
			}
			
			
			consulta.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		desconectar();
		return listDataAlert;*/
		//VV need
		

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

	

	@Override
	public boolean update(Alert obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public ArrayList<Alert> getValuesById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
