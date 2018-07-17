package Spaceable;

import math.DoubleCalc;
import math.IntegerCalc;
import math.VectorInterface;
import math.baseVector;

public class baseSObject implements SpaceBodyInterface {
	private VectorInterface<Double> acceleration;
	private VectorInterface<Double> speed;
	private Integer rad = 0;
	//private Double field = 0.0;
	private VectorInterface<Integer> positions;
	private VectorInterface<Double> fieldVector = new baseVector(0.0, 0.0, 0.0,  DoubleCalc.INSTANCE);
	
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
	public VectorInterface<Integer> getPositions() {
		return this.positions;
	}

	@Override
	public void setPositions(VectorInterface<Integer> positions) {
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

	@Override
	public void setRad(Integer rad) {
		this.rad = rad;
	}

	@Override
	public Integer getRad() {
		return this.rad;
	}

}
