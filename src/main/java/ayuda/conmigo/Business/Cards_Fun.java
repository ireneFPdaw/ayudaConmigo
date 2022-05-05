package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Product;

public class Cards_Fun {

	//Dependiendo del tipo elegido se moestrarán unas tarjetas
	public String cardProductByType (ArrayList<Product> listDataProduct, String select, String[] images)  {
		
	 
		String card = "<div class=\"card-deck\">";
		for(Product p: listDataProduct) {
			card += "<div class=\'card\'>"
					   + "<div class=\'card-body\'>   <h5 class=\'card-title\'>"+ p.getName_producto()  +"</h5></div>"
					   + "<div class=\'card-footer\'>  <input type=\'radio\' class=\'btn btn-secondary\' value=\'"+  p.getType_product() +"\'  name= \'producto\' id=\'" +  p.getName_producto() + "\'> </div></div>";
		}
		card += "</div>";
		return card;
	
	}
}
