package youtubeEgitim2;

public class Main {

	public static void main(String[] args) {
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 10, 20, 30 };
		numbers1 = numbers2;

		numbers2[0] = 1000;

		for (int i : numbers1) {
			System.out.println(i);
		}
	}

}
