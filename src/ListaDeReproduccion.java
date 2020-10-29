import java.sql.Date;
import java.util.ArrayList;

public class ListaDeReproduccion {
	
	String nombre;
	Usuario usuario;
	Date fecha;
	
	ListaDeReproduccion(String nombre) {
		this.nombre = nombre;
	}
	
	public String getListaDeReproduccion() {
		return this.nombre;
	}
	
	public void videos(Video[]args) {
		ArrayList<Video> videos = new ArrayList<Video>();
	}
	
	public void agregarVideo(Video video) {
		System.out.println("Se ha agregado " + video + "a la lista");
	}
	
	public void reproducirTodo() {
		System.out.println("Se ha reproducido la lista completa");
	}
	
	public void reproducirEnBucle() {
		System.out.println("Se esta reproduciendo la lista en bucle");
	}
	
	public void reproducirAleatorio() {
		System.out.println("Se ha reproducido la lista en modo aleatorio");
	}
	
	public void quitarVideo(Video video) {
		System.out.println("Se ha quitado el " + video + " de la lista");
	}
	
	public void main() {
		System.out.println("Se ha creado la lista de reproduccion");
	}
		

}

