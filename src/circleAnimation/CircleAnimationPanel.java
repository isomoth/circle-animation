package circleAnimation;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class CircleAnimationPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private int x = 0;
	private int y = 0; 
	private int dx = 0;
	private int dy = 0;
	
	// An object to generate random coordinates
	
	Random slump = new Random();
	
	// Generate a 200-second delay

	Timer tm = new Timer(200, this);

	public CircleAnimationPanel() {
		initComponents();
	}

	private void initComponents() {
		setPreferredSize(new Dimension(350, 280));
	}

	public void actionPerformed(ActionEvent e) {

		// Define the borders for the circle's movements (based on the panel's dimensions)
		if ((x < 0 || x > 350)  && (y < 0 || y > 280)) {
			// Change directions
			dx = -dx;
			dy = -dy;

		}
		
		// Move one step further
		
		x = x + dx; 
		y = y + dy;
		
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		x = slump.nextInt(250); //random x coordinate
		y = slump.nextInt(230); //random y coordinate
		g.fillOval(x, y, 50, 50);
		
		// Delay

		tm.start();

	}

}
