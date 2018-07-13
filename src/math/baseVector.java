package math;

public class baseVector implements VectorInterface<Double>{
	
	private double[] vec = new double[3];

	public static VectorInterface<Double> add(VectorInterface<Double> a1, VectorInterface<Double> a2) {
		return new baseVector(
				a1.getX() + a2.getX(),
				a1.getY() + a2.getY(),
				a1.getZ() + a2.getZ());
	}
	
	public static Double multiScal(VectorInterface<Double> a1, VectorInterface<Double> a2) {
		return a1.getX() * a2.getX() + a1.getY() * a2.getY() + a1.getZ() * a2.getZ();
	}
	
	public static VectorInterface<Double> multiVec(VectorInterface<Double> a1, VectorInterface<Double> a2){
		return new baseVector(
				a1.getY() * a2.getZ() - a1.getZ() * a2.getY(), 
				a1.getZ() * a2.getX() - a1.getX() * a2.getZ(), 
				a1.getX() * a2.getY() - a1.getY() * a2.getX());
	}
	
	public static VectorInterface<Double> multi(VectorInterface<Double> a, Double n) {
		return new baseVector((Double)a.getX() * n, (Double)a.getY() * n, (Double)a.getZ() * n);
	}

	
	public baseVector(Double x, Double y, Double z) {
		vec[0] = x;
		vec[1] = y;
		vec[2] = z;
	}
	
	@Override
	public void set(Double x, Double y, Double z) {
		vec[0] = x;
		vec[1] = y;
		vec[2] = z;
	}

	@Override
	public void setX(Double x) {
		vec[0] = x;		
	}

	@Override
	public void setY(Double y) {
		vec[1] = y;
	}

	@Override
	public void setZ(Double z) {
		vec[2] = z;
	}

	@Override
	public Double getX() {
		return vec[0];
	}

	@Override
	public Double getY() {
		return vec[1];
	}

	@Override
	public Double getZ() {
		return vec[2];
	}

	@Override
	public double mod() {
		return Math.sqrt(vec[0] * vec[0] + vec[1] * vec[1] + vec[2] * vec[2]);
	}

	@Override
	public void multi(Double n) {
		vec[0] *= n;
		vec[1] *= n;
		vec[2] *= n;
	}
/*
	@Override
	public Double multiScal(Vector<Double> a1, Vector<Double> a2) {
		return a1.getX() * a2.getX() + a1.getY() * a2.getY() + a1.getZ() * a2.getZ();
	}
*/
	@Override
	public Double multiScal(VectorInterface<Double> a) {
		return vec[0] * a.getX() + vec[1] * a.getY() + vec[2] * a.getZ();
	}
/*
	@Override
	public Vector<Double> multiVec(Vector<Double> a1, Vector<Double> a2) {
		return new customVector(
				a1.getY() * a2.getZ() - a1.getZ() * a2.getY(), 
				a1.getZ() * a2.getX() - a1.getX() * a2.getZ(), 
				a1.getX() * a2.getY() - a1.getY() * a2.getX());
	}
*/
	@Override
	public void multiVec(VectorInterface<Double> a) {
		vec[0] = vec[1] * a.getZ() - vec[2] * a.getY();
		vec[1] = vec[2] * a.getX() - vec[0] * a.getZ();
		vec[2] = vec[0] * a.getY() - vec[1] * a.getX(); 
	}

	@Override
	public void add(VectorInterface<Double> vec) {
		this.vec[0] += vec.getX();
		this.vec[1] += vec.getY();
		this.vec[2] += vec.getZ();
	}
/*
	@Override
	public Vector<Double> add(Vector<Double> a1, Vector<Double> a2) {
		return new customVector(
				a1.getX() + a2.getX(),
				a1.getY() + a2.getY(),
				a1.getZ() + a2.getZ());
	}
*/

}
