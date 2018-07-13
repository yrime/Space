package math;

public interface MatrixInterface {
	void setX(int x);
	void setY(int y);
	void setSize(int x, int y);
	int getX();
	int getY();
	MatrixInterface add(MatrixInterface a1, MatrixInterface a2);
	void add(MatrixInterface a2);
	MatrixInterface multi(MatrixInterface a1, MatrixInterface a2);
	void multi(double a);
	void multi(int a);
}
