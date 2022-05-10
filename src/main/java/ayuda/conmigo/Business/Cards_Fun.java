package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Product;

public class Cards_Fun {

	//Dependiendo del tipo elegido se moestrarán unas tarjetas
	public String cardProductByType (ArrayList<Product> listDataProduct, int select, String[] images)  {
		
	 
		String card = "<div class=\"card-deck pr-5 pt-3\">";
		for(Product p: listDataProduct) {
			card += "<div class=\'card\'>"
					   + "<div class=\'card-body\'>   <h5 class=\'card-title\'>"+ p.getName_producto()  +"</h5></div>"
					   + "<div class=\'card-footer\'>  <input type=\'radio\' class=\'btn btn-secondary\' value=\'"+  p.getId_producto() +"\'  name= \'product\' id=\'" +  p.getName_producto() + "\'> </div></div>";
		}
		card += "</div>";
		return card;
	
	}
}
