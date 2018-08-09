import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import espace.CorpsCosmiqueable;


public class TestFrameBranch {
	private int j = 0;
	List<CorpsCosmiqueable> sbi;
	
	public TestFrameBranch(List<CorpsCosmiqueable> sl) {
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
				g2d.fillOval((int)sbi.get(i).getPosistion().getX() + 100, (int)sbi.get(i).getPosistion().getY() + 100, sbi.get(i).getRad().intValue(), sbi.get(i).getRad().intValue());
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
