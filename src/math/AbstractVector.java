package math;

public abstract class AbstractVector<T> implements VectorInterface<T> {
	abstract VectorInterface<Double> add(VectorInterface<Double> a1, VectorInterface<Double> a2);
	
	abstract Double multiScal(VectorInterface<Double> a1, VectorInterface<Double> a2);
	
	abstract VectorInterface<Double> multiVec(VectorInterface<Double> a1, VectorInterface<Double> a2);
	
}
