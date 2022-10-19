package homework_3.logging;

public class FileLogger implements Logger {

	public void log(String data) {
		System.out.println("Logged to file: " + data);
	}

}
