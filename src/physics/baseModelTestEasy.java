package physics;

import java.util.List;

import Spaceable.SpaceObjectInterface;
import math.VectorInterface;
import math.baseVector;

public class baseModelTestEasy implements PhysicsModelInterface {
	private double temp = 0.001;
	private List<SpaceObjectInterface> systemObjects = null;
	
	private boolean check = false;
	
	@Override
	public void setTemp(int t) {
		this.temp = 1/temp;
	}

	@Override
	public void setSystemObjects(List<SpaceObjectInterface> lObj) {
		this.systemObjects = lObj;
	}

	@Override
	public void nextState() {
		try {
			if(!check) {
				this.check();
			}
			SpaceObjectInterface sObj;
			this.calculerField();
			for(int i = 0; i < systemObjects.size(); ++i) {
				sObj = systemObjects.get(i);
				sObj.getPositions().add(baseVector.multi(sObj.getSpeed(), temp));
				sObj.getSpeed().add(baseVector.multi(sObj.getAcceleration(), temp));
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
		double fields;
		VectorInterface<Double> vecField, buff;// = new customVector(0.0, 0.0, 0.0);
		SpaceObjectInterface sObj1, sObj2;
		
		for(i = 0; i < size; ++i) {
			sObj1 = this.systemObjects.get(i);
			vecField = sObj1.getFieldVector();//.add(sObj1.getPositions());
			for(j = 0; j < size; j++) {
				if(i != j) {
					sObj2 = this.systemObjects.get(j);
					buff = baseVector.add(baseVector.multi(sObj1.getPositions(), -1.0), sObj2.getPositions());
					fields = sObj2.getMass() / Math.pow(
							(
								buff.mod()
							), 2); 
					buff.multi(fields/buff.mod());
					vecField.add(buff);
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
