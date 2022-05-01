package ayuda.conmigo.Business;



public class EjemploCheck {

	/*COMPROBAR QUE EL USUARIO ESTÁ LOGUEADO*/
	public static boolean checkLogUser(Object obj) {
		
		//VV neceraria
		boolean logueado = false;
		
		//Si el objeto "usuario" no está vacio y el objeto es de tipo usuario (Porque podria ser otro dipo y no dejamos entrar)
		if( obj!= null && obj instanceof Usuario ) {
				logueado = true;
			//CONVERTIR ALGO EN OBJETO SE HACE ((Usuario)obj).XXXX
			//((UsuarioEnt)obj).getNombre(); => solo pueden entrar estos
			//if(((UsuarioEnt)obj).getCategoria() == "profesor"){return out = true}; => solo puede entrar que tenga XX categoria
		}
		return logueado;
	
	}
	
}
