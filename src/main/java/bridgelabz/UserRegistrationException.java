package bridgelabz;

public class UserRegistrationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message;
	public UserRegistrationException(String message) {
		super(message);
	}
}
