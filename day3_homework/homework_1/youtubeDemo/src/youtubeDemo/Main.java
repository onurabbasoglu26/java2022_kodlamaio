package youtubeDemo;

public class Main {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer();
		customer.Id = 1;
		customer.FirstName = "Onur";
		customer.LastName = "Abbasoğlu";

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();

		Company company = new Company();
		company.TaxNumber = "100000000";
		company.CompanyName = "Heehehe";
		company.Id = 100;

		CustomerManager customerManager2 = new CustomerManager(new Company());

		Person person = new Person();
		person.NationalIdendity = "123456";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

	}

}
