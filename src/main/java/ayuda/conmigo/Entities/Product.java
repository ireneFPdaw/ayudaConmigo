package ayuda.conmigo.Entities;

public class Product {
	
	//Variables
	private int id_producto;			//por defecto ascendente.
	private String name_producto;		
	private String type_product;		//ropa, alimentos y otros.
	
	
	//Constructor por defecto
	public Product() {
	super();
	this.id_producto = 0;
	this.name_producto = "";
	this.type_product = "";
	}
	
	//Constructor
	public Product(int id_producto, String name_producto, String type_product) {
	super();
	this.id_producto = id_producto;
	this.name_producto = name_producto;
	this.type_product = type_product;
	}

	//Getter y setter
	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getName_producto() {
		return name_producto;
	}

	public void setName_producto(String name_producto) {
		this.name_producto = name_producto;
	}

	public String getType_product() {
		return type_product;
	}

	public void setType_product(String type_product) {
		this.type_product = type_product;
	}	
	
}
