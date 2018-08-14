import java.util.ArrayList;
import java.util.List;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import espace.EtoileSystemable;
import espacecorps.Etoiles;
import espacecorps.Planetes;
import espacesysteme.EtoileSysteme;
import fisiquemodel.Classique;

public class TestBranch {

	public static void main(String[] args) {
		CorpsCosmiqueable sun = new Etoiles();
		List<CorpsCosmiqueable> corps = new ArrayList<>();
		//corps.add(sun);
		
		corps.add(new Planetes());
		corps.add(new Planetes());
		corps.add(new Planetes());
		corps.add(new Planetes());
		
		sun.setMass(93000000);
		sun.setRad(45.0);
		
		corps.get(0).setMass(50);
		corps.get(0).setRad(5.0);
		corps.get(0).setPosition(new Vector(70.0, 0.0, 0.0));
		corps.get(0).setVitesse(new Vector(0.0, 9.5, 0.0));
		
		corps.get(1).setMass(2000);
		corps.get(1).setRad(10.0);
		corps.get(1).setPosition(new Vector(90.0, 0.0, 0.0));
		corps.get(1).setVitesse(new Vector(0.0, 7.0, 0.0));
		
		corps.get(2).setMass(1500);
		corps.get(2).setRad(10.0);
		corps.get(2).setPosition(new Vector(120.0, 0.0, 0.0));
		corps.get(2).setVitesse(new Vector(0.0, 6.5, 0.0));
		
		corps.get(3).setMass(4000);
		corps.get(3).setRad(7.5);
		corps.get(3).setPosition(new Vector(-90.0, 0.0, 0.0));
		corps.get(3).setVitesse(new Vector(0.0, -5.5, 0.0));
		
		EtoileSystemable espacesysteme = new EtoileSysteme(new Classique(), 0.200);
		espacesysteme.setCorpsCosmiqueList(corps);
		espacesysteme.setEtoile(sun);
		
		TestFrameBranch tf = new TestFrameBranch(corps, sun);
		Thread t = new Thread((Runnable)espacesysteme);
		t.start();

	}

}
