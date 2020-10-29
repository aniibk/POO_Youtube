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

	
	public void reproducir(Video video) {
		System.out.println("El video " + video.titulo + " se esta reproduciendo");
	}


	
	

}
