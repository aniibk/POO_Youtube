
import javax.swing.*;
public class Main {
	
	public static void main(String[] args) {
		
		Usuario Marlene = new Usuario("MarleneCeballo", "1234");
		
		Video Pipipi = new Video("Pipipi","bailando");
		
		ListaDeReproduccion videosDeMar = new ListaDeReproduccion("Videos de Mar");
		
		Marlene.subirVideo(Pipipi);	
		
		Pipipi.reproducir();
		
		Pipipi.agregarAListaDeReproduccion(videosDeMar);
		
		Usuario Ramiro = new Usuario("RamiroSanguineti", "4321");
		
		String comentario = JOptionPane.showInputDialog("Ingrese comentario");
		
		Ramiro.comentarVideo(comentario, Pipipi);
	}

	
	

}
