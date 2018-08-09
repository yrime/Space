package physics;

import java.util.List;

import Spaceable.SpaceBodyInterface;
import Spaceable.SpaceObjectInterface;
import math.DoubleCalc;
import math.IntegerCalc;
import math.VectorInterface;
import math.baseVector;

public class baseModelTestEasy implements PhysicsModelInterface {
	private double temp = 0.001;
	private List<SpaceBodyInterface> systemObjects = null;
	
	private boolean check = false;
	
	@Override
	public void setTemp(int t) {
		this.temp = 1/temp;
	}

	@Override
	public void setSystemObjects(List<SpaceBodyInterface> lObj) {
		this.systemObjects = lObj;
	}

	@Override
	public void nextState() {
		//baseVector< b
		try {
			if(!check) {
				this.check();
			}
			SpaceObjectInterface sObj;
			this.calculerField();
			for(int i = 0; i < systemObjects.size(); ++i) {
				sObj = systemObjects.get(i);
				sObj.getPositions().add(baseVector.multi(sObj.getSpeed(), (double)temp, DoubleCalc.INSTANCE));
				sObj.getSpeed().add(baseVector.multi(sObj.getAcceleration(), (double)temp, DoubleCalc.INSTANCE));
				sObj.setAcceleration(sObj.getFieldVector());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void check() throws Exception {
		if(systemObjects == null) {
			throw new Exception("parameters n'est pas initialiser");
		}else {
			check = true;
		}
	}
	
	private void calculerField() throws Exception {
		if(systemObjects == null) {
			throw new Exception("parameters n'est pas initialiser");
		}
		
		int i, j, size = this.systemObjects.size();
		Integer x, y, z;
		double fields;
		VectorInterface<Double> vecField, buffD;
		VectorInterface<Integer> buffI;// = new customVector(0.0, 0.0, 0.0);
		SpaceObjectInterface sObj1, sObj2;
		
		for(i = 0; i < size; ++i) {
			sObj1 = this.systemObjects.get(i);
			vecField = sObj1.getFieldVector();//.add(sObj1.getPositions());
			for(j = 0; j < size; j++) {
				if(i != j) {
					sObj2 = this.systemObjects.get(j);
					buffI = baseVector.add(baseVector.multi(sObj1.getPositions(), -1, IntegerCalc.INSTANCE), sObj2.getPositions(), IntegerCalc.INSTANCE);
					fields = sObj2.getMass() / Math.pow(
							(
								buffI.mod()
							), 2); 
					buffD = new baseVector((double)buffI.getX(), (double)buffI.getY(), (double)buffI.getZ(), DoubleCalc.INSTANCE);
					buffD.multi(fields/buffI.mod());
					//buff = baseVector.multi(buff, fields/buff.mod(), DoubleCalc.INSTANCE);
					vecField.add(buffD);
					//vecField.multi(-1.0);
					//vecField.multi(fields / vecField.mod());
					//baseVector.add(sObj, a2)
				}
			}
			
			//sObj1.setField(fields);
			//fields = 0;
		}
	}

}
