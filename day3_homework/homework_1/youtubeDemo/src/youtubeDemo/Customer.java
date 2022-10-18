package youtubeDemo;

public class Customer {
	public int Id;
	public String FirstName;
	public String LastName;

	public Customer() {
		System.out.println("Customer object has started");
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
