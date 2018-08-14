package algebraique;
/**
 * 
 * @author Rodionov.FN, yrime
 * @version 1.0
 * 
 * <p>класс вектора</p>
 */
public class Vector {
	private Double x;
	private Double y;
	private Double z;
	/**
	 * 
	 * @param x  Х coordinate rad-vector
	 * @param y	 Y coordinate rad-vector	
	 * @param z  Z coordinate rad-vector
	 */
	public Vector(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/**
	 * 
	 * @return X coordinate
	 */
	public double getX() {
		return this.x;		
	}	
	/**
	 * 
	 * @param x set X coordinate de rad-vector
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * 
	 * @return Y coordinate de rad-vector
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * 
	 * @param y set Y coordinate de rad-vector
	 */
	public void setY(double y) {
		this.y = y;
	}
	 /**
	  * 
	  * @return Z coordinate de rad-vector
	  */
	public double getZ() {
		return this.z;
	}
	/**
	 * 
	 * @param z set Z coordinate de rad-vector
	 */
	public void setZ(double z) {
		this.z = z;
	}
	/**
	 * <p>cet vector moins vector de param</p>
	 * @param moins 
	 */
	public void moins(Vector moins) {
		this.x -= moins.x;
		this.y -= moins.y;
		this.z -= moins.z;
	}
	/**
	 * <p>cet vector plus vector de param</p>
	 * @param add
	 */
	public void add(Vector add) {
		this.x += add.x;
		this.y += add.y;
		this.z += add.z;
	}
	/**
	 * <p>cet vector multi en double value</p>
	 * @param r
	 */
	public void multi(double r) {
		this.x *= r;
		this.y *= r;
		this.z *= r;
	}
	/**
	 * 
	 * @return module de vector
	 */
	public double module() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
	public double scal(Vector a) {
		return this.x * a.getX() + this.y * a.getY() + this.z * a.getZ();
	}
	
	public double radian(Vector a) {
		double b = this.scal(a);
		double c = (this.module() * a.module());
		double v = b/c;
		return Math.acos(v) * 180 /Math.PI;
	}
}
