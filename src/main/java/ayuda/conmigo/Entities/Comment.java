package ayuda.conmigo.Entities;

public class Comment {


	//VV
	private int id;
	private String comment;
	private String name_user;
	private int id_alert;
	
	//CONSTRUCTORES
	public Comment() {
		super();
		this.comment = "";
		this.name_user = "";
		this.id_alert = 0;
	}
	
	public Comment(int id, String comment, String name_user, int id_alert) {
		super();
		this.id = id;
		this.comment = comment;
		this.name_user = name_user;
		this.id_alert = id_alert;
	}

	//GETTER Y SETTER
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getId() {
		return id;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public int getId_alert() {
		return id_alert;
	}

	public void setId_alert(int id_alert) {
		this.id_alert = id_alert;
	}
	
	
	
	
	
	
	
	
	
}
