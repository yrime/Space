package math;

public class IntegerCalc implements Calculator<Integer> {
	
	public final static IntegerCalc INSTANCE = new IntegerCalc();
	
	private IntegerCalc() {}

	@Override
	public Integer plus(Integer a, Integer b) {
		return a + b;
	}

	@Override
	public Integer moins(Integer a, Integer b) {
		return a - b;
	}

	@Override
	public Integer multi(Integer a, Integer b) {
		return a * b;
	}

	@Override
	public Integer div(Integer a, Integer b) {
		if(b == 0) {
			throw new ArithmeticException("div to 0");
		}
		return a / b;
	}

	@Override
	public Double sqrt(Integer a) {
		return Math.sqrt(a);
	}

}
