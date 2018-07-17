package Spaceable;

import math.VectorInterface;

public interface SpaceObjectInterface {
	int getMass();
	void setMass(int mass);
	
	VectorInterface<Double> getFieldVector();
	VectorInterface<Double> getSpeed();
	VectorInterface<Double> getAcceleration();
	//Double getField();
	VectorInterface<Integer> getPositions();
	void setSpeed(VectorInterface<Double> speed);
	void setAcceleration(VectorInterface<Double> acceleration);
	//void setField(Double field);
	void setPositions(VectorInterface<Integer> positions);
	void setFieldVector(VectorInterface<Double> vec);
}
