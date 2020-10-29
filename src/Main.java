
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
public class Main {
	
	public static void main(String[] args) {
		
		Usuario marlene = new Usuario("MarleneCeballo", "1234");
		
		Video pipipi = new Video("Pipipi","bailando");
		
		marlene.subirVideo(pipipi);	
		
		marlene.agregarVideoACuenta(pipipi);
		
		Usuario ana = new Usuario ("AnaKim", "9999");
		
		Usuario ramiro = new Usuario("RamiroSanguineti", "4321");
		
		ramiro.reproducirVideo(pipipi);
		
		ListaDeReproduccion videosGraciosos = new ListaDeReproduccion("videosGraciosos");
		
		List<Video> listaDeReproduccion = new ArrayList();
		
		ana.agregarAListaDeReproduccion(listaDeReproduccion, pipipi);
		
		Video lalala = new Video("Lalala","Canto yo");
		
		ana.agregarAListaDeReproduccion(listaDeReproduccion, lalala);
		
		ana.reproducirLista(listaDeReproduccion);	
		
		
		
		// String comentario = JOptionPane.showInputDialog("Ingrese comentario");
		
		// ramiro.comentarVideo(comentario, pipipi);
		
	}

	
	

}
