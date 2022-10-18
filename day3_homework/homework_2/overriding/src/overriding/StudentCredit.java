package overriding;

public class StudentCredit extends BaseCreditManager {
	
	public double calculate(double value) {
		return value * 1.10;
	}
}
