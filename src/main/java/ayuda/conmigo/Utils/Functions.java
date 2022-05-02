package ayuda.conmigo.Utils;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;

import ayuda.conmigo.Business.Cards_Fun;
import ayuda.conmigo.Business.Combo_Fun;
import ayuda.conmigo.Dao.ProductDao;
import ayuda.conmigo.Entities.Product;



public class Functions {
	
	public void prepareCreateAlert (ServletConfig servletConfig, HttpServletRequest request) {
			
			/*DATOS PARA CREAR EL COMBO TIPO DE PRODUCTO----------------------------------------*/
			ArrayList<Product> listTypeProduct = new ProductDao(servletConfig).getValues();  				  	  //Saco los  tipos de producto de la BD	con preparada					
			String defaultSelect = listTypeProduct.get(0).getType_product();
			System.out.println(defaultSelect);//Elijo por defecto el primer tipo (string)
			
			if (request.getParameter("comboType") != null) {
				defaultSelect = request.getParameter("comboType");									   			//VV.seleccionada si pulso combo
			}
				
			/*DATOS PARA CREAR TARJETAS DE PRODUCTOS SEGUN EL TIPO ----------------------------------------*/	
			ArrayList<Product> listDataProduct = new ProductDao(servletConfig).getValuesById(defaultSelect);  //Lista de los productos por tipo seleccionado
			String defaultSelectProduct = listDataProduct.get(0).getName_producto();						 //Elijo por defecto el primer producto de la lista (string)
			System.out.println(defaultSelectProduct);
			if (request.getParameter("btnProductSelect") != null) {
				defaultSelectProduct = request.getParameter("btnProductSelect");						   //VV.seleccionada si pulso el boton de seleccionar ese producto en concreto
			}
				
			
			/*FOTOS DE LOS PRODUCTOS: el nombre de la foto (producto general) se corresponde con BD---------------*/
			String imageFood[]={"fa-solid fa-bowl-food","fa-solid fa-salad","fa-solid fa-carrot"} ;
			String imageClothing[]={"fa-solid fa-clothes-hanger","fa-solid fa-shirt","fa-solid fa-boot"};
				
		
			/*CREO COMBO TIPO Y TARJETA PRODUCTOS Y GUARDO EN ETIQUETA ----------------------------------------*/
				
			request.setAttribute("comboType", new Combo_Fun().comboTypeProduct(listTypeProduct, defaultSelect));   //Creo combo con dato por defecto
			
			if(defaultSelect != "Comida") {
				request.setAttribute("cardProduct", new Cards_Fun().cardProductByType(listDataProduct, defaultSelectProduct, imageClothing));
			}else {
				request.setAttribute("cardProduct", new Cards_Fun().cardProductByType(listDataProduct, defaultSelectProduct, imageFood));
			}	
					
		
		}	
		
}
