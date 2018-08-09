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
		
		sun.setMass(1000);
		sun.setRad(10.0);
		
		corps.get(0).setMass(10);
		corps.get(0).setRad(5.0);
		corps.get(0).setPosition(new Vector(20.0, 15.0, 0.0));
		
		corps.get(1).setMass(20);
		corps.get(1).setRad(15.0);
		corps.get(1).setPosition(new Vector(10.0, 30.0, 0.0));
		
		corps.get(2).setMass(15);
		corps.get(2).setRad(10.0);
		corps.get(2).setPosition(new Vector(30.0, 25.0, 0.0));
		
		EtoileSystemable espacesysteme = new EtoileSysteme(new Classique(), 0.200);
		espacesysteme.setCorpsCosmiqueList(corps);
		espacesysteme.setEtoile(sun);
		
		TestFrameBranch tf = new TestFrameBranch(corps);
		Thread t = new Thread((Runnable)espacesysteme);
		t.start();

	}

}
