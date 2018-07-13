import java.awt.List;
import java.util.ArrayList;

import Spaceable.SpaceObjectInterface;
import Spaceable.SystemInterface;
import Spaceable.baseSObject;
import Spaceable.baseSystemTestEasy;
import math.baseVector;
import physics.baseModelTestEasy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemInterface sysI = new baseSystemTestEasy();
		SpaceObjectInterface obj1 = new baseSObject(), obj2 = new baseSObject(), obj3 = new baseSObject(), obj4 = new baseSObject(), obj = new baseSObject();
		
		ArrayList<SpaceObjectInterface> lObj = new ArrayList<SpaceObjectInterface>();
		
		obj.setMass(1000000);
		obj.setAcceleration(new baseVector(0.0, 0.0, 0.0));
		obj.setSpeed(new baseVector(0.0, 0.0, 0.0));
		obj.setPositions(new baseVector(0.0, 0.0, 0.0));
		
		obj1.setMass(1000);
		obj1.setAcceleration(new baseVector(1.0, 0.0, 0.0));
		obj1.setSpeed(new baseVector(0.0, 1.0, 0.0));
		obj1.setPositions(new baseVector(4.0, 4.0, 0.0));
		obj2.setMass(7000);
		obj2.setAcceleration(new baseVector(0.0, 2.0, 0.0));
		obj2.setSpeed(new baseVector(3.0, 0.0, 0.0));
		obj2.setPositions(new baseVector(7.0, -4.0, 0.0));
		obj3.setMass(4000);
		obj3.setAcceleration(new baseVector(1.0, 1.0, 0.0));
		obj3.setSpeed(new baseVector(-3.0, 6.0, 0.0));
		obj3.setPositions(new baseVector(9.0, 5.0, 0.0));
		obj4.setMass(3000);
		obj4.setAcceleration(new baseVector(0.0, 0.0, 0.0));
		obj4.setSpeed(new baseVector(0.0, 0.0, 0.0));
		obj4.setPositions(new baseVector(22.0, 20.0, 0.0));
		
		lObj.add(obj1);
		lObj.add(obj2);
		lObj.add(obj3);
		lObj.add(obj4);

		sysI.setCentre(obj);
		sysI.setPhysicMech(new baseModelTestEasy());
		sysI.setSystemObjects(lObj);
		Thread t = new Thread((Runnable)sysI);
		t.start();
	}

}
