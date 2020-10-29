import java.sql.Date;
import java.util.ArrayList;

public class Usuario {
	
	private String plan;
	private String usuario;
	private String contrasena;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	Usuario(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public String getContrasena() {
		return this.contrasena;
	}
	
	public static void videos(Video[]args) {
		ArrayList<Video> videos = new ArrayList<Video>();
	}
	
	public static void listaDeReproduccion(ListaDeReproduccion[]args) {
		ArrayList<ListaDeReproduccion> listaDeReproduccion = new ArrayList<ListaDeReproduccion>();
	}
	
	public static void suscripciones(Usuario[]args) {
		ArrayList<Usuario> suscripciones = new ArrayList<Usuario>();
	}
	
	public static void cambiarPlan() {
		System.out.println("Se ha cambiado el plan");
	}
	
	public static void cerrarSesion() {
		System.out.println("Se ha cerrado su sesión");
	}
	
	public static void subirVideo(Video video) {
		System.out.println("Se ha subido el video " + video.getTitulo() + 
				"\nDescripcion: " + video.getDescripcion());
	}
	
	public static void comentarVideo(String comentario, Video video) {
	System.out.println("Nuevo comentario: " + comentario) ;
	}
}