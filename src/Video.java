import java.util.ArrayList;
import javax.swing.*;

public class Video {
	
	String titulo;
	boolean activo;
	double duracion;
	String link;
	String descripcion;
	String comentario; 
	int meGusta;
	int noMeGusta;
	int visualizaciones;
	int resolucion;
	String subtitulos;
	boolean reproduccionAutomatica;
	
	Video(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;	
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public String geComentario() {
		return this.comentario;
	}
	// public static void listaSiguiente(Video[]args) {
	// ArrayList<Video> listaSiguiente = new ArrayList<>();
	// }

	
	public void reproducir() {
		System.out.println("El video " + this.titulo + " se esta reproduciendo");
	}
	
	public static void pausar(Video video) {
		System.out.println("El video se ha pausado");
	}	
	
	public static void cambiarVelocidad(double velocidad) {
		System.out.println("El video se esta reproduciendo a:" + velocidad);
	}
	
	public static void siguienteVideo(Video video) {
		System.out.println("Se ha reproducido el siguiente video");
	}
	
	public static void expandirPantalla(boolean expandirPantalla) {
		System.out.println("El video esta en pantalla completa");
	}
	
	public static void modificarVolumen(int volumen) {
		System.out.println("El video se esta reproduciendo a: " + volumen) ;
	}
	
	public static void compartir() {
		System.out.println("El video esta compartido en red social") ;
	}
	
	public static void agregarAListaDeReproduccion(ListaDeReproduccion listaDeReproduccion) {
		System.out.println("Se ha agregado el video a: " + listaDeReproduccion.getListaDeReproduccion()) ;
	}
	
	public static void subscribirseAlCanal(Usuario usuario) {
		System.out.println("Se ha suscripto a " + usuario) ;
	}
	
	public static void verMasTarde() {
		System.out.println("Se ha agregado a lista verMasTarde") ;
	}
	
	public static void ocultar() {
		System.out.println("El video esta compartido en red social") ;
	}
	

	
	

}
