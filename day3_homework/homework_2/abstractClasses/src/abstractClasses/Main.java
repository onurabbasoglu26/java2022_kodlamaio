package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womangamecalculator = new WomanGameCalculator();
		womangamecalculator.calculate();
		womangamecalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
