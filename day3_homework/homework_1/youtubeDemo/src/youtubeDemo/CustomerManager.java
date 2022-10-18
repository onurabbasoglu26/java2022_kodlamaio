package youtubeDemo;

public class CustomerManager {

	public Customer _customer;

	public CustomerManager(Customer customer) {
		_customer = customer;
	}

	public void Save() {
		System.out.println("Customer saved : " + _customer.FirstName);
	}

	public void Delete() {
		System.out.println("Customer deleted : " + _customer.FirstName);
	}
}
