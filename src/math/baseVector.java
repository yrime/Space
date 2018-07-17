package math;

public class baseVector<T extends Number> implements VectorInterface<T>{
	
	private final Calculator<T> calc;
	//private T[] vec = new T[3];
	private T x;
	private T y;
	private T z;

	public static <T extends Number> VectorInterface<T> add(VectorInterface<T> a1, VectorInterface<T> a2, Calculator<T> calc) {
		return new baseVector(
				calc.plus(a1.getX(), a2.getX()),
				calc.plus(a1.getY(), a2.getY()),
				calc.plus(a1.getZ(), a2.getZ()),
				calc);
	}
	
	public static <T extends Number> T multiScal(VectorInterface<T> a1, VectorInterface<T> a2, Calculator<T> calc) {
		return calc.plus(calc.plus(calc.multi(a1.getX(), a2.getX()), calc.multi(a1.getY(), a2.getY())), calc.multi(a1.getZ(), a2.getZ()));
	}
	
	public static VectorInterface<Number> multiVec(VectorInterface<Number> a1, VectorInterface<Number> a2, Calculator<Number> calc){
		return new baseVector(
				calc.moins(calc.multi(a1.getY(), a2.getZ()), calc.multi(a1.getZ(), a2.getY())), 
				calc.moins(calc.multi(a1.getZ(), a2.getX()), calc.multi(a1.getX(), a2.getZ())), 
				calc.moins(calc.multi(a1.getX(), a2.getY()), calc.multi(a1.getY(), a2.getX())),
				calc);
	}
	
	public static <T extends Number> VectorInterface multi(VectorInterface<T> a, T n, Calculator<T> calc) {
		return new baseVector(calc.multi(a.getX(), n), calc.multi(a.getY(), n), calc.multi(a.getZ(), n), calc);
	}

	
	public baseVector(T x, T y, T z, Calculator<T> calc) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.calc = calc;
	}

	@Override
	public void setX(T x) {
		this.x = x;		
	}

	@Override
	public void setY(T y) {
		this.y = y;
	}

	@Override
	public void setZ(T z) {
		this.z = z;
	}

	@Override
	public T getX() {
		return this.x;
	}

	@Override
	public T getY() {
		return this.y;
	}

	@Override
	public T getZ() {
		return this.z;
	}

	@Override
	public Double mod() {
		T a1 = calc.multi(this.x, this.x);
		T a2 = calc.multi(this.y, this.y);
		T a3 = calc.multi(this.z, this.z);
		return calc.sqrt(calc.plus(calc.plus(a1, a2), a3));
	}

	@Override
	public void multi(T n) {
		this.x = calc.multi(this.x, n);
		this.y = calc.multi(this.y, n);
		this.z = calc.multi(this.z, n);
	}

	@Override
	public T multiScal(VectorInterface<T> a) {
		return calc.plus(
				calc.plus(
						calc.multi(this.x, a.getX()), 
						calc.multi(this.y, a.getY())
						), 
				calc.multi(this.z, a.getZ()));
	}
	
	@Override
	public void multiVec(VectorInterface<T> a) {
		this.x = calc.moins(calc.multi(this.y, a.getZ()), calc.multi(this.z, a.getY()));
		this.y = calc.moins(calc.multi(this.z, a.getX()), calc.multi(this.x, a.getZ()));
		this.z = calc.moins(calc.multi(this.x, a.getY()), calc.multi(this.y, a.getX()));
	}

	@Override
	public void add(VectorInterface<T> vec) {
		this.x = calc.plus(this.x, vec.getX());
		this.y = calc.plus(this.y, vec.getY());
		this.z = calc.plus(this.z, vec.getZ());
	}

	@Override
	public void set(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

}
