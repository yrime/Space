package math;

public class DoubleCalc implements Calculator<Double> {
	
	public final static DoubleCalc INSTANCE = new DoubleCalc();
	
	private DoubleCalc() {}

	@Override
	public Double plus(Double a, Double b) {
		return a + b;
	}

	@Override
	public Double moins(Double a, Double b) {
		return a - b;
	}

	@Override
	public Double multi(Double a, Double b) {
		return a * b;
	}

	@Override
	public Double div(Double a, Double b) {
		if(b == 0.0) {
			throw new ArithmeticException("div to 0");
		}
		return a / b;
	}

	@Override
	public Double sqrt(Double a) {
		return Math.sqrt(a);
	}
}
