package fisique;

import algebraique.Vector;
import espace.CorpsCosmiqueable;

public interface fisiqueable {
	public void calcForce(CorpsCosmiqueable a, CorpsCosmiqueable de);
	public void calcAcceleration(CorpsCosmiqueable a, Vector force);
	public void calcVitesse(CorpsCosmiqueable a, double delta);
	public void calcPosition(CorpsCosmiqueable a, double delta);
}
