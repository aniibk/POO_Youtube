
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
public class Main {
	
	public static void main(String[] args) {
		
		Usuario marlene = new Usuario("MarleneCeballo", "1234");
		
		Video pipipi = new Video("Pipipi","bailando");
		
		// List<Video> VideosDeUsuario = new ArrayList<>();	
		
		marlene.subirVideo(pipipi);	
		
		marlene.agregarVideoACuenta(pipipi);
		
		
		Usuario ana = new Usuario ("AnaKim", "9999");
		
		ana.reproducirVideo(pipipi);		
		
		Usuario ramiro = new Usuario("RamiroSanguineti", "4321");
		
		ramiro.reproducirVideo(pipipi);
		
		// String comentario = JOptionPane.showInputDialog("Ingrese comentario");
		
		// ramiro.comentarVideo(comentario, pipipi);
		
	}

	
	

}
