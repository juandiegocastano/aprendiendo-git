import javax.swing.*;
import java.awt.event.*;

public class UsingPaintComponent {

	public static void main (String[] args) {
 		UsingPaintComponent gui = new UsingPaintComponent();
		gui.go();	
	}

	public void go() {
		JFrame frame = new JFrame();
		MyDrawPanel dibujo = new MyDrawPanel();


		frame.getContentPane().add(dibujo); 

		//Operaciones usuales de JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500,1500);
		frame.setVisible(true);
	}


	
}