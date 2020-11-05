import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Usuario {
	
	private String plan;
	private String usuario = "";
	private String contrasena = "";
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private List<Video> VideosDeUsuario = new ArrayList();

	
	
	Usuario(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		System.out.println("Se ha creado el usuario " + this.usuario );	
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public String getContrasena() {
		return this.contrasena;
	}
	
	
	public void iniciarSesion() {
		
		String esteUsuario = JOptionPane.showInputDialog("Ingrese su usuario");
		String estaContraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
		
		if (this.usuario.equals(esteUsuario) && this.contrasena.equals(estaContraseña)) {
			System.out.println("El usuario: " + this.getUsuario() + " ha ingresado correctamente a YouTube");
		}
		else {
			System.out.println("Usuario y/o contraseña incorrecta");
			System.exit(0);
		}
		
	}
	
	public void agregarVideoACuenta(Video video) {
		VideosDeUsuario.add(video);
		System.out.println("El video " + video.getTitulo() + " se ha agregado a " + this.usuario );		
	}
	
	public void reproducirVideo(Video video) {
		System.out.println("El video " + video.titulo + " se esta reproduciendo por " + this.usuario);
	}
	
	public void pausar(Video video) {
		System.out.println("El video se ha pausado");
	}	
	
	public void cambiarVelocidad(double velocidad) {
		System.out.println("El video se esta reproduciendo a:" + velocidad);
	}	
	
	public void siguienteVideo(Video video) {
		System.out.println("Se ha reproducido el siguiente video");
	}
	
	public void expandirPantalla(boolean expandirPantalla) {
		System.out.println("El video esta en pantalla completa");
	}
	
	public void modificarVolumen(int volumen) {
		System.out.println("El video se esta reproduciendo a: " + volumen) ;
	}
	
	public void compartir() {
		System.out.println("El video esta compartido en red social") ;
	}
	
	public void agregarAListaDeReproduccion(ListaDeReproduccion listaDeReproduccion, Video video) {;
		listaDeReproduccion.videos.add(video);
		System.out.println("Se ha agregado el video " + video.getTitulo() + " a la lista de reproduccion " + listaDeReproduccion.getListaDeReproduccion());
	}
	
	public void reproducirLista(ListaDeReproduccion listaDeReproduccion) {
			System.out.println("Se esta reproduciendo la lista de reproducción: " + listaDeReproduccion.getListaDeReproduccion());
		for (int i = 0 ; i < listaDeReproduccion.videos.size(); i++) {
			System.out.println("Se esta reproduciendo el video: " + listaDeReproduccion.videos.get(i).getTitulo());
			}
		}

	
	
	public void subscribirseAlCanal(Usuario usuario) {
		System.out.println("Se ha suscripto a " + usuario) ;
	}
	
	public void verMasTarde() {
		System.out.println("Se ha agregado a lista verMasTarde") ;
	}
	
	public void ocultar() {
		System.out.println("El video ya está ocultado") ;
	}
	
	public void videos(Video[]args) {
		ArrayList<Video> videos = new ArrayList<Video>();
	}
	
	
	public void suscripciones(Usuario[]args) {
		ArrayList<Usuario> suscripciones = new ArrayList<Usuario>();
	}
	
	public void cambiarPlan() {
		System.out.println("Se ha cambiado el plan");
	}
	
	public void cerrarSesion() {
		System.out.println("Se ha cerrado su sesiÃ³n");
	}
	
	public void subirVideo(Video video) {
		System.out.println("Se ha subido el video " + video.getTitulo() + 
				"\nDescripcion: " + video.getDescripcion());
	}
	
	public void comentarVideo(String comentario, Video video) {
	System.out.println("Nuevo comentario: " + comentario) ;
	}
}