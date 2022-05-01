package ayuda.conmigo.Utils;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;

import ayuda.conmig.Dao.ClasesDAO;
import ayuda.conmig.Dao.HorarioDAO;
import ayuda.conmig.Dao.EjemploDAO;
import ayuda.conmigo.Business.EjemploCombo;
import ayuda.conmigo.Business.EjemploTabla;
import ayuda.conmigo.Business.EjemploValue;
import ayuda.conmigo.Entities.Clases;
import ayuda.conmigo.Entities.Horario;
import ayuda.conmigo.Entities.EjemploEntiti;

public class EjemploFunciones {
	
	//Creamos tabla =  guardo tabla en etiqueta a usar
	public void preparartabla (ServletConfig servletConfig, HttpServletRequest request) throws IOException {
		
		/*DATOS PARA CREAR TABLA*/
		ArrayList<Clases> listaClases = new ClasesDAO(servletConfig).getValues();
		
		/*CREAMOS TABLA Y GUARDO EN ETIQUETA*/
		request.setAttribute("listaC", new EjemploTabla().tabla(listaClases));	
		
	}
	
	
	//Creamos combo (por defecto con 1 seleccionado)= guardo combo en etiqueta a usar
	public void prepararCombo (ServletConfig servletConfig, HttpServletRequest request) throws IOException{
		
		/*DATOS PARA CREAR EL COMBO 1----------------------------------------*/
		
			//Saco la lista de clases que necesito para crear el combo
			ArrayList<Clases> listaClases = new ClasesDAO(servletConfig).getValues();
			
			//Elijo por defecto el primer id => de mi lista cojo objeto en posicion 0 y saco su id
			int extraSelec = listaClases.get(0).getIdExtra();
			
			//VV.seleccionada si pulso combo
			if (request.getParameter("comboClases") != null) {
				extraSelec = Integer.parseInt(request.getParameter("comboClases"));
			}
			
		/*DATOS PARA CREAR EL COMBO 2 ----------------------------------------*/	
			
			//Saco lista de profes
			ArrayList<Horario> listaProfes = new HorarioDAO(servletConfig).getValuesById(extraSelec);
			
			//Elijo por defecto el primer id
			int profeSelec = listaProfes.get(0).getIdProfe();
		
			//VV.seleccionada si pulso combo
			if (request.getParameter("comboProfes") != null) {
				profeSelec = Integer.parseInt(request.getParameter("comboProfes"));
			}
			
			
		/*CREO COMBO 1 y 2 Y GUARDO EN ETIQUETA ----------------------------------------*/
			
			//Guardo el combo (creo combo con la lista y el seleccionado por defecto o el legido) en una etiqueta que usaré en el html
			request.setAttribute("comboClases", new EjemploCombo().comboClases(listaClases, extraSelec));
			
			//Guardo el combo ((creo combo con la lista y el seleccionado por defecto o elegido) en una etiqueta que usaré en el html
			request.setAttribute("comboProfes", new EjemploCombo().comboHorario(listaProfes, profeSelec));
			
	
		/*CREO INPUT CON DATOS DE X PROFESOR----------------------------------------*/
			
			//Compruebo que el id seleccionado corresponde con el de la lista. Si no corresponde me devuelve un objeto con -1 o vacio
			Horario profe = new EjemploValue().getProfebyidProfe(listaProfes, profeSelec);
			
			//Si los dias del objeto no están definidos, entoncs por defecto ponemos que saque los dias del 1º objeto de la lista
			if(profe.getDia() == "") {
				profe = listaProfes.get(0);
			}
			
			//Creamos input con dias
			String input = "<input type=\"text\" id=\"dias\" name=\"dias\"" + "value=\"" + profe.getDia() +"\">";
			request.setAttribute("inputDias", input);
		
		
		/*COMBO PARA BORRADO DE PROFESORES ----------------------------------------*/
			
		ArrayList<EjemploEntiti> listaPro = new EjemploDAO(servletConfig).getValues();
		int pSelec = listaPro.get(0).getId_profe();
		if(request.getParameter("comboProfesoresA") != null) {
			pSelec = Integer.parseInt(request.getParameter("comboProfesoresA"));
		}
		request.setAttribute("comboProfesoresA", new EjemploCombo().comboProfesores(listaPro, pSelec));
		
	}
	

		
		
}
