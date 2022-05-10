package ayuda.conmigo.Entities;

public class AlertShow {
	
		//Variables
		private int id_alert;					//Deberia de ser constante ascendente
		private String product; 					//relacionado con entidad Producto
		private String ong;						//relacionada con entidad ONG
		private String date_alert;	
		private String place_alert;
		private String allergen_alert;
		private String annotation_alert;
		
		//Constructor por defecto
		public AlertShow() {
			super();
			this.id_alert = 0; 			//Deberia de ser constante ascendente por defecto
			this.product = "";
			this.ong = "";
			this.date_alert = "";
			this.place_alert = "";
			this.allergen_alert = "";
			this.annotation_alert = "";
		}
		
		//Constructor
		public AlertShow(int id, String id_product, String id_ong, String date, String place, String allergen, String annotation) {
			super();
			this.id_alert = id;
			this.product = id_product;
			this.ong = id_ong;
			this.date_alert = date;
			this.place_alert = place;
			this.allergen_alert = allergen;
			this.annotation_alert = annotation;
		}

		public int getId_alert() {
			return id_alert;
		}

		public void setId_alert(int id_alert) {
			this.id_alert = id_alert;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getOng() {
			return ong;
		}

		public void setOng(String ong) {
			this.ong = ong;
		}

		public String getDate_alert() {
			return date_alert;
		}

		public void setDate_alert(String date_alert) {
			this.date_alert = date_alert;
		}

		public String getPlace_alert() {
			return place_alert;
		}

		public void setPlace_alert(String place_alert) {
			this.place_alert = place_alert;
		}

		public String getAllergen_alert() {
			return allergen_alert;
		}

		public void setAllergen_alert(String allergen_alert) {
			this.allergen_alert = allergen_alert;
		}

		public String getAnnotation_alert() {
			return annotation_alert;
		}

		public void setAnnotation_alert(String annotation_alert) {
			this.annotation_alert = annotation_alert;
		}
		
		
}
