package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public String regex;
	/**
	 * Method to perform validations on user input as first name
	 * @param firstName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean firstNameofUser(String firstName) throws UserRegistrationException {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2}");
		Matcher m = p.matcher(firstName);
		boolean bl = m.matches(); 
		if(bl == true) {
			System.out.println("valid name");
			return bl;
		}
		else {
			throw new UserRegistrationException("give proper Name");
		}
	}
	/**
	 * Method to perform validations on user input as last name
	 * @param lastName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean lastNameofUser(String lastName) throws UserRegistrationException{
		regex="^[A-Z][a-z]{2}";
		Pattern p=Pattern.compile(regex);

		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(lastName);
		//System.out.println(m.matches());
		boolean bl=m.matches();
		if(bl==true) {
			System.out.println("valid last name");
			return bl;
		}
		else {
			throw new UserRegistrationException("give proper Last Name");

		}

	}
	/**
	 * Method to perform validations on user input as Emails
	 * @param email - email ids of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean emaiIdofUser(String email) throws UserRegistrationException {
		regex="^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p=Pattern.compile(regex);

		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(email);
		boolean bl=m.matches();
		if(bl==true) {
			System.out.println("valid email");
			return bl;
		}
		else {
			throw new UserRegistrationException("give proper Email ID");
		}
	}
	/**
	 * Method used to perform mobile number validations using regular expression
	 * @param phone - input phone number given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean mobileNumberOfUser(String phone) throws UserRegistrationException {

		regex="^([0-9]{2}[\\s]){1}[0-9]{9,10}$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(phone);
		boolean bl=m.matches();
		if(bl==true) {
			System.out.println("valid mobile number");
			return bl;
		}
		else {
			throw new UserRegistrationException("give proper Mobile Number");
		}
	}
	/**
	 * Method used to perform password  validations using regular expression
	 * As a User need to follow pre-defined Password rules.
	 * Rule 1 : Minimum 8 characters
	 * Rule 2 : Should have at least 1 Upper Case
	 * Rule 3 : Should have at least 1 numeric number in the password
	 * Rule 4 : Has exactly 1 Special Character
	 * @param password - input password given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean passwordOfUser(String password) throws UserRegistrationException {
		regex="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(password);
		boolean bl=m.matches();
		if(bl==true) {
			System.out.println("valid password");
		   return bl;
		}
		else {
			throw new UserRegistrationException("give proper Password");

		}
	}


}
