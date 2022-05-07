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



public class ProductDao extends Conexion implements DAOMethods<Product, String>{

	public ProductDao(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ArrayList<Product> getValues() {
		
		//VV.necesarias
		conectar();
		ArrayList<Product> listTypeProduct = new ArrayList<Product>();
		Product p = null;
		
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getTypeProducts()}");
			ResultSet datos = consulta.executeQuery();
			while(datos.next()) {
				p = new Product(datos.getString("type_product")); //Uso constructor por defecto
				listTypeProduct.add(p);
			}
			
			
			consulta.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		return listTypeProduct;
		
	}

	@Override
	public ArrayList<Product> getValuesById(String id) {
	
		
		//VV necesarias
		conectar();
		ArrayList<Product> listDataProduct = new ArrayList<Product>();
		Product ptype = null;
		
		try {
				
				CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getProductByType(?)}");
				consulta.setString(1,id);
				ResultSet datos = consulta.executeQuery();
				while(datos.next()) {
					ptype = new Product(datos.getInt("id_product"), datos.getString("name_product"),datos.getString("type_product")); //Uso segundo constructor
					System.out.println(ptype);
					listDataProduct.add(ptype);
				}
				
				consulta.close();
				
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		return listDataProduct;
	}

	
	
	public Product read(int id) {
			
			
			conectar();
			
			//VV
			Product p = null;
			
			try {
				
				CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getProductbyId(?)}");
				consulta.setInt(1,id);
				ResultSet resultado = consulta.executeQuery();
				
				while(resultado.next()) {
					p = new Product(resultado.getInt("id_product"),resultado.getString("name_product"), resultado.getString("type_product"));
				}
				
				resultado.close();
				consulta.close();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			
			
			desconectar();
			return p;
			
		}
		
	
	@Override
	public boolean create(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public Product read(String id) {
		return null;
	}

	@Override
	public boolean delete(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
}
