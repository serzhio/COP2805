
public class OutOfMilkException extends Exception {
	
	public OutOfMilkException(String message, long timeElapsed) {
		super(message + " Drank milk for " + timeElapsed + " miliseconds.");
	}

}
