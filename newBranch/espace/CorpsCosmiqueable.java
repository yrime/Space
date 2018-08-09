package espace;

import algebraique.Vector;

public interface CorpsCosmiqueable {
	public Integer getMass();
	public void setMass(Integer mass);
	
	public Double getRad();
	public void setRad(Double rad);
	
	public Vector getPosistion();
	public void setPosition(Vector posistion);
	
	public Vector getVitesse();
	public void setVitesse(Vector vitesse);
	
	public Vector getAcceleration();
	public void setAcceleration(Vector acceleration);
	
	public Vector getForce();
	public void setFroce(Vector force);
}
