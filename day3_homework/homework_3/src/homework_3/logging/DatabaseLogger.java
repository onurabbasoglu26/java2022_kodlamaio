package homework_3.logging;

public class DatabaseLogger implements Logger {

	public void log(String data) {
		System.out.println("Logged to database: " + data);
	}

}
