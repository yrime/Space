package Spaceable;

import java.util.List;

import math.VectorInterface;
import math.baseVector;
import physics.PhysicsModelInterface;

public class baseSystemTestEasy implements SystemInterface, Runnable {
	
	private PhysicsModelInterface physicsModel;
	private List<SpaceObjectInterface> spaceObjList;
	private SpaceObjectInterface centre;
	
	private boolean toWorkingThread = true;

	public void run() {
		if(spaceObjList != null & centre != null & physicsModel != null) {
			physicsModel.setSystemObjects(spaceObjList);
			physicsModel.setTemp(100);
			//int i = 0;
			while(this.toWorkingThread) {//i < 10) {
				//++i;
				physicsModel.nextState();
				System.out.println(spaceObjList.get(0).getPositions().getX() + " p " + spaceObjList.get(0).getPositions().getY());
				this.correlationPositions();
				System.out.println(spaceObjList.get(0).getPositions().getX() + " c " + spaceObjList.get(0).getPositions().getY());
			}
		}
	}

	@Override
	public List<SpaceObjectInterface> getSystemObjects() {
		return this.spaceObjList;
	}

	@Override
	public void setSystemObjects(List<SpaceObjectInterface> lObj) {
		this.spaceObjList = lObj;
		if(centre != null) {
			spaceObjList.add(centre);
		}
	}

	@Override
	public void setSystemObjects(SpaceObjectInterface obj) throws Exception {
		if(spaceObjList != null) {
			spaceObjList.add(obj);
		}else {
			throw new Exception("parameters n'est pas initilise");
		}
	}

	@Override
	public void setCentre(SpaceObjectInterface obj) {
		this.centre = obj;
		if(spaceObjList != null) {
			spaceObjList.add(centre);
		}
	}

	@Override
	public void setPhysicMech(PhysicsModelInterface physicsModel) {
		this.physicsModel = physicsModel;
	}
	
	private void correlationPositions() {
		VectorInterface v = baseVector.multi(centre.getPositions(), -1.0);
		for(int i = 0; i < spaceObjList.size(); ++i) {
			spaceObjList.get(i).getPositions().add(v);
		}
	}
}
