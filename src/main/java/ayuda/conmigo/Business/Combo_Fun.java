package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Product;

public class Combo_Fun {
	
	//Dependiendo del tipo elegido se moestrarán unas tarjetas
	public String comboTypeProduct(ArrayList<Product> listTypeProduct, String select)  {

			//Como necesitaremos el tipo será string
			String option = "<select name='comboType' onchange=\"submit()\">";
			for(Product p: listTypeProduct){
				if (p.getType_product() == select) {
					option += "<option value='" + p.getType_product()+ "' selected >" + p.getType_product()+ "</option>";
				}else {
					option += "<option value='" + p.getType_product()+ "'>" + p.getType_product() + "</option>";
				}
			}
			option += "</select>";
			return option;
		}
	}
