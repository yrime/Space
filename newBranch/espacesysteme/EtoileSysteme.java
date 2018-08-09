package espacesysteme;

import java.util.List;

import espace.CorpsCosmiqueable;
import espace.EtoileSystemable;
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
		for(int i = 0; i < corps.size(); ++i) {
			premiere = corps.get(i);
			for(j = 0; j < corps.size(); ++j) {
				if(i != j) {
					seconde = corps.get(j);
					fisique.calcForce(premiere, seconde);
				}
			}
			fisique.calcForce(premiere, this.etoile);
			fisique.calcAcceleration(premiere, premiere.getForce());
			fisique.calcVitesse(premiere, this.delta);
			fisique.calcPosition(premiere, this.delta);
		}
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			this.update();
			System.out.println(this.corps.get(0).getPosistion().getX());
		}
	}

}
