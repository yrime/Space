package math;

public interface VectorInterface<T> {
	void set(T x, T y, T z);
	void setX(T x);
	void setY(T y);
	void setZ(T z);
	T getX();
	T getY();
	T getZ();
	Double mod();
	void add(VectorInterface<T> vec);
	//Vector<T> add(Vector<T> a1, Vector<T> a2);
	//Vector<T> multi(Vector<T> a, T n);
	void multi(T n);
	//Double multiScal(Vector<T> a1, Vector<T> a2);
	T multiScal(VectorInterface<T> a);
	//Vector<T> multiVec(Vector<T> a1, Vector<T> a2);
	void multiVec(VectorInterface<T> a);
}
