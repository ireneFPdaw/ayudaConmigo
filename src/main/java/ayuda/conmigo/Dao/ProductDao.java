package ayuda.conmigo.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import com.mysql.cj.jdbc.CallableStatement;
import ayuda.conmigo.Entities.Product;
import ayuda.conmigo.Interfaz.DAOMethods;

public class ProductDao extends Conexion implements DAOMethods<Product, Integer>{

	public ProductDao(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}


	//--------------------------------- NEED
	@Override
	public Product read(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getValuesById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//------------------------------- NOT NEED
	@Override
	public boolean delete(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean create(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean update(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Product> getValues() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
