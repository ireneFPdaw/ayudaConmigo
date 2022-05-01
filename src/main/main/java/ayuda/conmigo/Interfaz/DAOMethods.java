package ayuda.conmigo.Interfaz;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOMethods<E,T> {
	
		//E = objeto ; T= tipo de dato
		//Arrojan excepciones
	
		public boolean create(E obj) throws SQLException;
		public E read(T id) throws SQLException;			
		public boolean delete(E obj) throws SQLException;
		public boolean update(E obj) throws SQLException;
		public ArrayList<E> getValues() throws SQLException;	
		public ArrayList<E> getValuesById(T id) throws SQLException;

		
}
