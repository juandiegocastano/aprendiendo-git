import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {

	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton boton = new JButton("Cambia de color");
		boton.addActionListener(new ButtonListener());

		label = new JLabel("Not clicked");
		

		JButton botonLabel = new JButton("Cambiar label");
		botonLabel.addActionListener(new LabelListener());

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH, boton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.NORTH, label );
		frame.getContentPane().add(BorderLayout.EAST, botonLabel);

		frame.setSize(300,300);
		frame.setVisible(true);
	}

	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("I've been clicked");
		}
	}

	class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
}