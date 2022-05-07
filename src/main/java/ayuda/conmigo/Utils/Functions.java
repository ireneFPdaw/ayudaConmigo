package ayuda.conmigo.Utils;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;

import ayuda.conmigo.Business.Alert_template;
import ayuda.conmigo.Business.Cards_Fun;
import ayuda.conmigo.Business.Combo_Fun;
import ayuda.conmigo.Dao.AlertDao;
import ayuda.conmigo.Dao.ProductDao;
import ayuda.conmigo.Entities.Alert;
import ayuda.conmigo.Entities.Product;



public class Functions {
	
	public void prepareCreateAlert (ServletConfig servletConfig, HttpServletRequest request) {
			
			/*DATOS PARA CREAR EL COMBO TIPO DE PRODUCTO----------------------------------------*/
			ArrayList<Product> listTypeProduct = new ProductDao(servletConfig).getValues();  				  	  //Saco los  tipos de producto de la BD	con preparada					
			String defaultSelect = listTypeProduct.get(0).getType_product();
			
			
			if (request.getParameter("comboType") != null) {
				defaultSelect = request.getParameter("comboType");									   			//VV.seleccionada si pulso combo
			}
				
			/*DATOS PARA CREAR TARJETAS DE PRODUCTOS SEGUN EL TIPO ----------------------------------------*/	
			ArrayList<Product> listDataProduct = new ProductDao(servletConfig).getValuesById(defaultSelect);  //Lista de los productos por tipo seleccionado
			int defaultSelectProduct = listDataProduct.get(0).getId_producto();						 //Elijo por defecto el primer producto de la lista (string)
				
			
			/*FOTOS DE LOS PRODUCTOS: el nombre de la foto (producto general) se corresponde con BD---------------*/
			String imageFood[]={"fa-solid fa-bowl-food","fa-solid fa-salad","fa-solid fa-carrot"} ;
			String imageClothing[]={"fa-solid fa-clothes-hanger","fa-solid fa-shirt","fa-solid fa-boot"};
					
		
			/*CREO COMBO TIPO , TARJETA PRODUCTOS----------------------------------------*/
				
			request.setAttribute("comboType", new Combo_Fun().comboTypeProduct(listTypeProduct, defaultSelect));   //Creo combo con dato por defecto
			
			if(defaultSelect != "Comida") {
				request.setAttribute("cardProduct", new Cards_Fun().cardProductByType(listDataProduct, defaultSelectProduct, imageClothing));
			}else {
				request.setAttribute("cardProduct", new Cards_Fun().cardProductByType(listDataProduct, defaultSelectProduct, imageFood));
			}	
				
		}	
	
	public void prepareShowAlert (ServletConfig servletConfig, HttpServletRequest request, int idONG) {
		
		/*DATOS PARA MOSTRAR ALERTAS YA CREADAS ----------------------------------------*/
		ArrayList<Alert> listDataAlerts = new AlertDao(servletConfig).getValues(); //Obtengo todas las alertas para el HOME
		ArrayList<Alert> listAlertsByONG = new ArrayList<Alert>();	
		for (Alert alert : listDataAlerts) {
			if(alert.getOng() == idONG) {
				listAlertsByONG.add(alert);
			}
		}
		
		if(listAlertsByONG.size() != 0) {
			request.setAttribute("alertsBdByOng", new Alert_template().alertTemplatePage(listAlertsByONG));
		}else {
			request.setAttribute("alertsBdByOng", "No ha creado ninguna alerta");
		}
		
	}
	
	public void prepareAlertHome (ServletConfig servletConfig, HttpServletRequest request) {
		
		ArrayList<Alert> listDataAlerts = new AlertDao(servletConfig).getValues();
		if(listDataAlerts.size() != 0) {
			request.setAttribute("alertsHome", new Alert_template().alertTemplateHome(listDataAlerts));
		}else {
			request.setAttribute("alertsHome", "No hay alertas disponibles");
		}
		
	}

		
}
