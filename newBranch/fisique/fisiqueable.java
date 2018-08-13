package fisique;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import espacexception.ChocException;

public interface fisiqueable {
	public void calcForce(CorpsCosmiqueable a, CorpsCosmiqueable de) throws ChocException;
	public void calcAcceleration(CorpsCosmiqueable a, Vector force);
	public void calcVitesse(CorpsCosmiqueable a, double delta);
	public void calcPosition(CorpsCosmiqueable a, double delta);
}
