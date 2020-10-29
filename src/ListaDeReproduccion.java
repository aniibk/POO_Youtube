import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ListaDeReproduccion {
	
	private String nombre;
	private Usuario usuario;
	private Date fecha;
	private ArrayList<Video> videos = new ArrayList<Video>();
	
	ListaDeReproduccion(String nombre) {
		this.nombre = nombre;
	}
	
	public String getListaDeReproduccion() {
		return this.nombre;
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

