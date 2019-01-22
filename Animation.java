import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Animation {

	JButton botonAnimacion;
	int x = 50;
	int y = 50;

	public static void main(String[] args) {
		Animation animacion = new Animation();
		animacion.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel1 panel = new MyDrawPanel1();

		frame.getContentPane().add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);

		for(int i=0; i<130; i++) {
			x++;
			y++;

			panel.repaint();

			try {
				Thread.sleep(30);
			} catch (Exception ex) { }
		}
	}

	class MyDrawPanel1 extends JPanel {

		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight());

			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}
	}
}
