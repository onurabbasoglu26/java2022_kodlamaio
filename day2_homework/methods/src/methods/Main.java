package methods;

public class Main {

	public static void main(String[] args) {
		numberSearch();

	}

	public static void numberSearch() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searching = 9;
		boolean thereIs = false;

		for (int number : numbers) {
			if (number == searching) {
				thereIs = true;
				break;
			}
		}

		if (thereIs) {
			sendMessage(searching + " Sayısı mevcuttur.");
		} else {
			sendMessage(searching + " Sayısı mevcut değildir.");
		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
