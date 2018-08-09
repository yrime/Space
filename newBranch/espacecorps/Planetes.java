package espacecorps;

import algebraique.Vector;
import espace.CorpsCosmiqueable;

public class Planetes implements CorpsCosmiqueable {

	private Integer mass;
	private Double rad;
	private Vector position;
	private Vector vitesse = new Vector(0.0, 0.0, 0.0);
	private Vector acceleration = new Vector(0.0, 0.0, 0.0);
	private Vector force = new Vector(0.0, 0.0, 0.0);
	
	@Override
	public Integer getMass() {
		return this.mass;
	}

	@Override
	public void setMass(Integer mass) {
		this.mass = mass;
	}

	@Override
	public Double getRad() {
		return this.rad;
	}

	@Override
	public void setRad(Double rad) {
		this.rad = rad;
	}

	@Override
	public Vector getPosistion() {
		return this.position;
	}

	@Override
	public void setPosition(Vector posistion) {
		this.position = posistion;
	}

	@Override
	public Vector getVitesse() { 
		return this.vitesse;
	}

	@Override
	public void setVitesse(Vector vitesse) {
		this.vitesse = vitesse;
	}

	@Override
	public Vector getAcceleration() { 
		return this.acceleration;
	}

	@Override
	public void setAcceleration(Vector acceleration) { 
		this.acceleration = acceleration;
	}

	@Override
	public Vector getForce() {
		return this.force;
	}

	@Override
	public void setFroce(Vector force) {
		this.force = force;
	}
}
