package ayuda.conmigo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;

import com.mysql.cj.jdbc.CallableStatement;

import ayuda.conmigo.Entities.AlertShow;
import ayuda.conmigo.Entities.Comment;
import ayuda.conmigo.Interfaz.DAOMethods;

public class CommentDao extends Conexion implements DAOMethods<Comment, Integer> {

	public CommentDao(ServletConfig servletConfig) {
		super(servletConfig);
		// TODO Auto-generated constructor stub
	}
	
	/*-------------------------------------------CREAR COMENTARIO*/

	@Override
	public boolean create(Comment obj) {
	
		//VV need
		conectar();
		boolean insert = false;
		int result = 0;
		
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call createComment(?,?,?)}");
			consulta.setString(1,obj.getComment());
			consulta.setString(2,obj.getName_user());
			consulta.setInt(3,obj.getId_alert());
			
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
	
	/*-------------------------------------------RECOGER COMENTARIO DE X ALERTA*/
	
	@Override
	public ArrayList<Comment> getValuesById(Integer id)  {
		
		//Sacar observaciones solo de esa alerta

		conectar();
		ArrayList<Comment> listCommentById = new ArrayList<Comment>();
		Comment c = null;
				
		try {
			
			CallableStatement consulta = (CallableStatement) conexion.prepareCall("{call getComment(?)}");
			consulta.setInt(1,id);
			ResultSet datos = consulta.executeQuery();
			while(datos.next()) {
				c = new Comment(datos.getInt(id), datos.getString("comment"), datos.getString("name_user"), datos.getInt("id_alert"));
				listCommentById.add(c);
			}
			
			
			consulta.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		desconectar();
		return listCommentById ;
	
	}


	@Override
	public Comment read(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Comment obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Comment obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Comment> getValues() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
