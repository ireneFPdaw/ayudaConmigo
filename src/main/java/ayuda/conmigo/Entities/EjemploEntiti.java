package ayuda.conmigo.Entities;

public class EjemploEntiti {

	//Variables
	private int id_profe;
	private String nombre;
	private String apellidos;
	private int edad;
	private int horas_semana;
	
	//Constructor defecto
	public EjemploEntiti() {
		super();
		this.id_profe = 0;
		this.nombre = "no identificado";
		this.apellidos ="no identificado";
		this.edad = 0;
		this.horas_semana = 0;
	}
	
	//Constructor
	public EjemploEntiti(int id_profe, String nombre, String apellidos, int edad, int horas_semana) {
		super();
		this.id_profe = id_profe;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.horas_semana = horas_semana;
	}
	
	//Getter y setter

	public int getId_profe() {
		return id_profe;
	}

	public void setId_profe(int id_profe) {
		this.id_profe = id_profe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getHoras_semana() {
		return horas_semana;
	}

	public void setHoras_semana(int horas_semana) {
		this.horas_semana = horas_semana;
	}
	
	

	
	
}
