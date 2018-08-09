package fisiquemodel;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import fisique.fisiqueable;

public class Classique implements fisiqueable {
	
	public final double G = 6.67300E-5;//-11;
	@Override
	public void calcForce(CorpsCosmiqueable a, CorpsCosmiqueable de) {
		double r;
		Vector buff, aV, deV;
		aV = a.getPosistion();
		deV = de.getPosistion();
		buff = new Vector(deV.getX() - aV.getX(), deV.getY() - aV.getY(), deV.getZ() - aV.getZ());
		buff.multi((a.getMass() * de.getMass()) / Math.pow(buff.module(), 3));
		buff.multi((1) * G);
		a.getForce().add(buff);
	}

	@Override
	public void calcAcceleration(CorpsCosmiqueable a, Vector force) {
		force.multi(1.0/a.getMass());
		a.setAcceleration(force);
	}

	@Override
	public void calcVitesse(CorpsCosmiqueable a, double delta) {
		a.getAcceleration().multi(delta);
		a.getVitesse().add(a.getAcceleration());
	}

	@Override
	public void calcPosition(CorpsCosmiqueable a, double delta) {
		a.getVitesse().multi(delta);
		a.getPosistion().add(a.getVitesse());
	}

}
