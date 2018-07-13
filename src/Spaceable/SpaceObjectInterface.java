package Spaceable;

import math.VectorInterface;

public interface SpaceObjectInterface {
	int getMass();
	void setMass(int mass);
	
	VectorInterface<Double> getFieldVector();
	VectorInterface<Double> getSpeed();
	VectorInterface<Double> getAcceleration();
	//Double getField();
	VectorInterface<Double> getPositions();
	void setSpeed(VectorInterface<Double> speed);
	void setAcceleration(VectorInterface<Double> acceleration);
	//void setField(Double field);
	void setPositions(VectorInterface<Double> positions);
	void setFieldVector(VectorInterface<Double> vec);
}
