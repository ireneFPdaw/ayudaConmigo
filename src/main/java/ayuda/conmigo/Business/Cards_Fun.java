package ayuda.conmigo.Business;

import java.util.ArrayList;

import ayuda.conmigo.Entities.Product;

public class Cards_Fun {

	//Dependiendo del tipo elegido se moestrarán unas tarjetas
	public String cardProductByType (ArrayList<Product> listDataProduct, String select, String[] images)  {
		
	 int contIcon = 0;
		String card = "<div class=\"card-deck\">";
		for(Product p: listDataProduct) {
			card += "<div class=\'card\'>" + "<i class=\' " + images[contIcon] +"\'></i> "
					   + "<div class=\'card-body\'>   <h5 class=\'card-title\'>"+ p.getName_producto()  +"</h5></div>"
					   + "<div class=\'card-footer\'>  <input type=\'button\' class=\'btn btn-secondary\' id=\'"+  p.getName_producto() +"\' value=\'SELECCIONAR \'> </div></div>";
			if(contIcon == 2) {
				contIcon = 0;
			}else {
				contIcon++;
			}
		}
		card += "</div>";
		return card;
		
		
		

	}
}
