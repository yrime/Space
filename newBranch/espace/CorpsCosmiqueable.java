package espace;

import algebraique.Vector;

public interface CorpsCosmiqueable {
	/**
	 * 
	 * @return mass de corps
	 */
	public Integer getMass();
	/**
	 * <p>set mass de corps</p>
	 * @param mass
	 */
	public void setMass(Integer mass);
	/**
	 * 
	 * @return radius de corps
	 */
	public Double getRad();
	/**
	 * 
	 * @param rad radius de corps
	 */
	public void setRad(Double rad);
	/**
	 * 
	 * @return Vector avec coordination de corps
	 */
	public Vector getPosistion();
	/**
	 * <p>set un vector de la coordination du corps</p>
	 * @param posistion
	 */
	public void setPosition(Vector posistion);
	/**
	 * 
	 * @return un vector de la vitesse
	 */
	public Vector getVitesse();
	/**
	 * <p>set un vector de la vitesse de corps</p>
	 * @param vitesse
	 */
	public void setVitesse(Vector vitesse);
	/**
	 * 
	 * @return un vector de l'acceleration
	 */
	public Vector getAcceleration();
	public void setAcceleration(Vector acceleration);
	/**
	 * 
	 * @return un vector du force
	 */
	public Vector getForce();
	/**
	 * <p> set un vector force
	 * @param force 
	 */
	public void setFroce(Vector force);
}
