package math;

public interface Calculator<T extends Number> {
	public T plus(T a, T b);
	public T moins(T a, T b);
	public T multi(T a, T b);
	public T div(T a, T b);
	public Double sqrt(T a);
}
