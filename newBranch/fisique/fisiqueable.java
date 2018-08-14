package fisique;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import espacexception.ChocException;

public interface fisiqueable {
	/**
	 * <p>calculate un vector du force pour un premiere corps</p>
	 * <p>un seconde corps de l'attraction</p>
	 * @param a premiere
	 * @param de seconde
	 */
	public void calcForce(CorpsCosmiqueable a, CorpsCosmiqueable de);
	public void calcAcceleration(CorpsCosmiqueable a, Vector force);
	public void calcVitesse(CorpsCosmiqueable a, double delta);
	public void calcPosition(CorpsCosmiqueable a, double delta);
}
