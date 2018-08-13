import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import espace.CorpsCosmiqueable;


public class TestFrameBranch {
	private int j = 0;
	List<CorpsCosmiqueable> sbi;
	CorpsCosmiqueable sun;
	private int sizeFrame = 400;
	
	public TestFrameBranch(List<CorpsCosmiqueable> sl, CorpsCosmiqueable sun) {
		this.sbi = sl;
		this.sun = sun;
		JFrame w = new JFrame("Le test sur de l'etoile systeme");
		w.setSize(sizeFrame, sizeFrame);
		
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
			g.setColor(Color.ORANGE);
			g2d.fillOval((int)sun.getPosistion().getX() + sizeFrame/2, (int)sun.getPosistion().getY() + sizeFrame/2, sun.getRad().intValue(), sun.getRad().intValue());

			for(int i = 0; i < sbi.size(); ++i) {
				g.setColor(Color.BLUE);
				g2d.fillOval((int)sbi.get(i).getPosistion().getX() + sizeFrame/2, (int)sbi.get(i).getPosistion().getY() + sizeFrame/2, sbi.get(i).getRad().intValue(), sbi.get(i).getRad().intValue());
			}
			j++;
			if(j == 20) {
				j = 0;
			}
			//g2d.drawString("ololo", 150 + j, 150 + j);
			super.repaint();
		}
	}
}
