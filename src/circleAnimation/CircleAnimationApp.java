package circleAnimation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class CircleAnimationApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createGUI(); 
			}
		});
	}

	private static void createGUI() {

		JFrame f = new JFrame("Circle Animation");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.getContentPane().add(new CircleAnimationPanel());
		f.pack();
		f.setVisible(true);

	} 

	public CircleAnimationApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	class MyPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public MyPanel() {
			setBorder(BorderFactory.createLineBorder(Color.black));
		}

		public Dimension getPreferredSize() {
			return new Dimension(230,280);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);    

		}

	}

}
