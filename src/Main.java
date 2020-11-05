
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
public class Main {
	
	public static void main(String[] args) {
		
		
		Usuario marlene = new Usuario("MarleneCeballo", "1234");
		
		marlene.iniciarSesion();
		
		Video pipipi = new Video("Pipipi","bailando");
		
		marlene.subirVideo(pipipi);	
		
		marlene.agregarVideoACuenta(pipipi);
		
		Usuario ana = new Usuario ("AnaKim", "9999");
		
		Usuario ramiro = new Usuario("RamiroSanguineti", "4321");
		
		ramiro.reproducirVideo(pipipi);
		
		ListaDeReproduccion videosGraciosos = new ListaDeReproduccion("Videos Graciosos");
		
		Video lalala = new Video("Lalala","Canto yo");
		
		Video jugandoAlAmongUs = new Video("Viciando Among us","Jueguitos");
		
		ana.agregarAListaDeReproduccion(videosGraciosos , pipipi);
		
		ana.agregarAListaDeReproduccion(videosGraciosos, jugandoAlAmongUs);
		
		ana.agregarAListaDeReproduccion(videosGraciosos, lalala);
		
		ana.reproducirLista(videosGraciosos);	
		
	}

	
	

}
