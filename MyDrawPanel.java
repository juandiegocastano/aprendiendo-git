import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel{

	public void paintComponent(Graphics g) {

		//Hace rectangulo
		//g.setColor(Color.orange);
		//g.fillRect(20,50,100,100);


		//Pone imagen!
		//Image imagen = new ImageIcon("esperanza.jpg").getImage();
		//g.drawImage(imagen,3,4,this);


		//g.fillRect(0,0,this.getWidth(), this.getHeight()); //Pinta de negro. Default color

		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);


		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
	 	blue = (int) (Math.random() * 255);
		Color endColor = new Color(red, green, blue);


		Graphics2D g2d = (Graphics2D) g; //Cast para Graphics2D que es subclase de Graphics
		GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);

		g2d.setPaint(gradient);
		g2d.fillOval(70,70,100,100);


	}
}