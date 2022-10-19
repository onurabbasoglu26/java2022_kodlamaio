package homework_3.logging;

public class MailLogger implements Logger {

	public void log(String data) {
		System.out.println("Logged to mail: " + data);
	}

}
