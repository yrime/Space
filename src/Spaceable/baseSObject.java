package Spaceable;

import math.VectorInterface;
import math.baseVector;

public class baseSObject implements SpaceObjectInterface {
	private VectorInterface<Double> acceleration;
	private VectorInterface<Double> speed;
	//private Double field = 0.0;
	private VectorInterface<Double> positions;
	private VectorInterface<Double> fieldVector = new baseVector(0.0, 0.0, 0.0);
	
	private int mass = 0;

	@Override
	public int getMass() {
		return mass;
	}

	@Override
	public void setMass(int mass) {
		this.mass = mass;
	}

	@Override
	public VectorInterface<Double> getSpeed() {
		return this.speed;
	}

	@Override
	public VectorInterface<Double> getAcceleration() {
		return this.acceleration;
	}

	@Override
	public void setSpeed(VectorInterface<Double> speed) {
		this.speed = speed;
	}

	@Override
	public void setAcceleration(VectorInterface<Double> acceleration) {
		this.acceleration = acceleration;
	}
/*
	@Override
	public Double getField() {
		return this.field;
	}

	@Override
	public void setField(Double force) {
		this.field = force;
	}
*/
	@Override
	public VectorInterface<Double> getPositions() {
		return this.positions;
	}

	@Override
	public void setPositions(VectorInterface<Double> positions) {
		this.positions = positions;
	}

	@Override
	public VectorInterface<Double> getFieldVector() {
		return this.fieldVector;
	}

	@Override
	public void setFieldVector(VectorInterface<Double> vec) {
		this.fieldVector = vec;
	}

}
