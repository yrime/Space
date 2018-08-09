package algebraique;

public class Vector {
	private Double x;
	private Double y;
	private Double z;
	
	public Vector(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return this.x;		
	}	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y = y;
	}
	 
	public double getZ() {
		return this.z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public void moins(Vector moins) {
		this.x -= moins.x;
		this.y -= moins.y;
		this.z -= moins.z;
	}
	public void add(Vector add) {
		this.x += add.x;
		this.y += add.y;
		this.z += add.z;
	}
	public void multi(double r) {
		this.x *= r;
		this.y *= r;
		this.z *= r;
	}
	public double module() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
}
