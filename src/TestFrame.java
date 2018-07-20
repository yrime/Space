import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import Spaceable.SpaceBodyInterface;

public class TestFrame {
	
	private int j = 0;
	List<SpaceBodyInterface> sbi;
	
	public TestFrame(List<SpaceBodyInterface> sl) {
		this.sbi = sl;
		JFrame w = new JFrame("graphics to testing");
		w.setSize(400, 400);
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		w.setLayout(new BorderLayout(1,1));
		
		Canvas canv = new Canvas();
		w.add(canv);
		w.setVisible(true);
	}
	
	class Canvas extends JComponent{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			for(int i = 0; i < sbi.size(); ++i) {
				g2d.fillOval(sbi.get(i).getPositions().getX() + 1, sbi.get(i).getPositions().getY() + 1, sbi.get(i).getRad(), sbi.get(i).getRad());
			}
			j++;
			if(j == 20) {
				j = 0;
			}
			g2d.drawString("ololo", 150 + j, 150 + j);
			super.repaint();
		}
	}
}
