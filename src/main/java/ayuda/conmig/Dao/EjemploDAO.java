package ayuda.conmig.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;

import com.mysql.cj.jdbc.CallableStatement;

import ayuda.conmigo.Entities.EjemploEntiti;
import ayuda.conmigo.Interfaz.DAOMethods;

public class EjemploDAO extends Conexion implements DAOMethods<EjemploEntiti, Integer> {

	public EjemploDAO(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}
	
	
	/*--------------------------NECESARIAS-------------------------*/
	@Override
	public ArrayList<EjemploEntiti> getValues(){
		
		//COnexion
		conectar();
		
		//Me devuelve
		ArrayList<EjemploEntiti> listaProfes = new ArrayList<>();
		EjemploEntiti p = null;
		
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getProfes()}");
			ResultSet datos = consulta.executeQuery();
			while(datos.next()) {
				p = new EjemploEntiti(datos.getInt("id_profe"),datos.getString("nombre"), datos.getString("apellidos"),datos.getInt("edad"),datos.getInt("horas_semana") );
				listaProfes.add(p);
			}
			
			consulta.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		return listaProfes;
	}



	@Override
	public boolean delete(EjemploEntiti obj) {
		
		//Conexion
		conectar();
		
		//VV necesaria
		boolean eliminado = false;
		int filasEliminadas = 0;
		
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call deleteProfe(?)}");
			consulta.setInt(1,obj.getId_profe());
			filasEliminadas = consulta.executeUpdate();
			
			if(filasEliminadas > 0) {
				
				eliminado = true;
			}
			
			consulta.close();
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
			desconectar();
		return eliminado;
	}
	
	
	
	/*-------------------------NO NECESARIAS*/
	@Override
	public boolean create(EjemploEntiti obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EjemploEntiti read(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean update(EjemploEntiti obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public ArrayList<EjemploEntiti> getValuesById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
	
}
