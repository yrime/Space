package fisiquemodel;

import algebraique.Vector;
import espace.CorpsCosmiqueable;
import espacexception.ChocException;
import fisique.fisiqueable;

public class Classique implements fisiqueable {
	
	public final double G = 6.67300E-5;//-11;
	@Override
	public void calcForce(CorpsCosmiqueable a, CorpsCosmiqueable de) throws ChocException {
		double r, mod;
		Vector buff, aV, deV;
		aV = a.getPosistion();
		deV = de.getPosistion();
		buff = new Vector(deV.getX() - aV.getX(), deV.getY() - aV.getY(), deV.getZ() - aV.getZ());
		
		mod = buff.module();
		if(mod > (a.getRad() + de.getRad())){
			buff.multi((G * a.getMass() * de.getMass()) / Math.pow(mod, 3));
			//buff.multi(G);
			a.getForce().add(buff);
		}else {
			throw new ChocException(a, de);
		}		
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
		Vector buff = new Vector(a.getVitesse().getX(), a.getVitesse().getY(), a.getVitesse().getZ());
		buff.multi(delta);
		a.getPosistion().add(buff);
	}

}
