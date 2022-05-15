package ayuda.conmigo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletConfig;

import com.mysql.cj.jdbc.CallableStatement;

import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.AlertShow;
import ayuda.conmigo.Interfaz.DAOMethods;

public class AlertShowDao extends Conexion implements DAOMethods<AlertShow, Integer> {

	public AlertShowDao(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public boolean create(AlertShow obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AlertShow read(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(AlertShow obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AlertShow obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public ArrayList<AlertShow> getValuesByFilter (String filter){
		
		
		//VV need
				conectar();
				ArrayList<AlertShow> listDataAlertByFilter = new ArrayList<AlertShow>();
				AlertShow a = null;
				
				
						
				try {
					
					CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getAlertByFilter(?)}");
					consulta.setString(1,filter);
					ResultSet datos = consulta.executeQuery();
					while(datos.next()) {
						a = new AlertShow(datos.getInt("id_alert"), datos.getString("name_product"), datos.getString("name_ngo"), datos.getString("date_alert"), datos.getString("place_alert"),datos.getString("allergens_alert"),datos.getString("annotation_alert"));
						listDataAlertByFilter.add(a);
					}
					
					
					consulta.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
						
				desconectar();
				return listDataAlertByFilter;
	}
	
	
	@Override
	public ArrayList<AlertShow> getValues() {
		//VV need
				conectar();
				ArrayList<AlertShow> listDataAlert = new ArrayList<AlertShow>();
				AlertShow a = null;
				
						
				try {
					
					//Comprobrar que me recoge el tipo fecha como string
					CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getAlertHome()}");
					ResultSet datos = consulta.executeQuery();
					while(datos.next()) {
						
						a = new AlertShow(datos.getInt("id_alert"), datos.getString("name_product"), datos.getString("name_ngo"), datos.getString("date_alert"), datos.getString("place_alert"),datos.getString("allergens_alert"),datos.getString("annotation_alert")); //Uso constructor por defecto
						listDataAlert.add(a);
					}
					
					
					consulta.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
						
				desconectar();
				return listDataAlert;
		
	}

	@Override
	public ArrayList<AlertShow> getValuesById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
