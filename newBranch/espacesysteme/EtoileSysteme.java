package espacesysteme;

import java.util.List;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import espace.EtoileSystemable;
import espacexception.ChocException;
import fisique.fisiqueable;

public class EtoileSysteme implements EtoileSystemable, Runnable {
	
	private List<CorpsCosmiqueable> corps;
	private CorpsCosmiqueable etoile;
	private fisiqueable fisique;
	private double delta;

	private EtoileSysteme() {}
	
	public EtoileSysteme(fisiqueable fisique, double delta) {
		this.fisique = fisique;
		this.delta = delta;
	}	
	
	@Override
	public void setCorpsCosmiqueList(List<CorpsCosmiqueable> corps) {
		this.corps = corps;
	}

	@Override
	public void setCorpsCosmique(CorpsCosmiqueable corps) {
		if(corps == null) throw new NullPointerException("Corps list n'initialize pas"); 
		this.corps.add(corps);
	}

	@Override
	public void setEtoile(CorpsCosmiqueable etoile) {
		this.etoile = etoile;
	}

	@Override
	public CorpsCosmiqueable getEtoile() {
		return this.etoile;
	}

	@Override
	public List<CorpsCosmiqueable> getCorpsCosmiqueList() {
		return this.corps;
	}

	@Override
	public void update() {
		if(corps == null) throw new NullPointerException("corps list n'initialize pas");
		int j = 0;
		CorpsCosmiqueable premiere, seconde;
		Vector buff = new Vector(0.0, 0.0, 0.0);
		for(int i = 0; i < corps.size(); ++i) {
			premiere = corps.get(i);
			for(j = 0; j < corps.size(); ++j) {
				if(i != j) {
					seconde = corps.get(j);
					buff.setX(seconde.getPosistion().getX() - premiere.getPosistion().getX());
					buff.setY(seconde.getPosistion().getY() - premiere.getPosistion().getY());
					buff.setZ(seconde.getPosistion().getZ() - premiere.getPosistion().getZ());
					if(buff.module() > (premiere.getRad() + seconde.getRad())) {
						fisique.calcForce(premiere, seconde);
					}else {
						System.out.println("CHOC AVEC TERRE " + premiere.getVitesse().radian(buff));
						if(premiere.getVitesse().radian(buff) < 50) {
							
						}
					}
				}
			}
			buff.setX(this.etoile.getPosistion().getX() - premiere.getPosistion().getX());
			buff.setY(this.etoile.getPosistion().getY() - premiere.getPosistion().getY());
			buff.setZ(this.etoile.getPosistion().getZ() - premiere.getPosistion().getZ());
			if(buff.module() > (premiere.getRad() + this.etoile.getRad())) {
				fisique.calcForce(premiere, this.etoile);
				fisique.calcAcceleration(premiere, premiere.getForce());
				fisique.calcVitesse(premiere, this.delta);
				fisique.calcPosition(premiere, this.delta);
			}else {
				//fisique.calcForce(premiere, this.etoile);
				if(premiere.getVitesse().radian(buff) < 50) {
					corps.remove(i);
					--i;
					continue;
				}
				fisique.calcForce(premiere, this.etoile);
				fisique.calcAcceleration(premiere, premiere.getForce());
				System.out.println("CHOC AVEC ETOILE " + premiere.getVitesse().radian(buff));
			}
			fisique.calcVitesse(premiere, this.delta);
			fisique.calcPosition(premiere, this.delta);
		}
	}

	@Override
	public void run() {
	//	int i = 0;
		while(true) {//i < 20) {
			System.out.println(this.corps.get(0).getPosistion().getX());
			//++i;
			this.update();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.corps.get(0).getPosistion().getX());
		}
	}

}
