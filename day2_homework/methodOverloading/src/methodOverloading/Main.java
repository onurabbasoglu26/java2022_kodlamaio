package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Transactions transactions = new Transactions();
		System.out.println(transactions.addition(2, 3));
		System.out.println(transactions.addition(2, 3, 5));
	}

}
