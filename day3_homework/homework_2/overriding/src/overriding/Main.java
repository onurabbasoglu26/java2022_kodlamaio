package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new FarmerCredit(), new TeacherCredit(), new StudentCredit() };

		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(10000));
		}
	}

}
