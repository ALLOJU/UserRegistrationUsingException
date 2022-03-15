import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bridgelabz.SampleEmails;
import bridgelabz.UserRegistration;
import bridgelabz.UserRegistrationException;

public class UserTest {
	/**
	 * PROCEDURE:
	 * 1.Creating object for UserRegistration class
	 * 2.Test method to check first name is valid
	 * 3.Test method to check last name is valid
	 * 4.Test method to check  email id is valid
	 * 5.Test method to check  mobile number is valid
	 * 6.Test method to check  mobile number is valid
	 * 7.Test method to check  sample emails are valid
	 */
	/**
	 * 1.Creating object for UserRegistration class
	 */
	UserRegistration u=new UserRegistration();
	SampleEmails se=new SampleEmails();
	/**
	 * 2.Test method to check first name is valid
	 * @throws UserRegistrationException 
	 */
	@Test
	public void checkValidFirstName() throws UserRegistrationException
	{
		boolean result=u.firstNameofUser("Mou");
		assertTrue(result);
	}
	
	/**
	 * 3.Test method to check last name is valid
	 * @throws UserRegistrationException 
	 */
	@Test
	public void checkValidLastName() throws UserRegistrationException
	{
		boolean result=u.lastNameofUser("Jav");
		assertTrue(result);
	}
	
	/**
	 * 4.Test method to check  email id is valid
	 * @throws UserRegistrationException 
	 */
	@Test
	public void checkValidEmail() throws UserRegistrationException
	{
		boolean result=u.emaiIdofUser("abc@yahoo.com");
		assertTrue(result);
	}
	
	/**
	 * 5.Test method to check  mobile number is valid
	 * @throws UserRegistrationException 
	 */
	@Test
	public void checkValidPhone() throws UserRegistrationException
	{
		boolean result=u.mobileNumberOfUser("91 9866349586");
		assertTrue(result);
	}
	
	/**
	 * 6.Test method to check  mobile number is valid
	 * @throws UserRegistrationException 
	 */
	@Test
	public void checkValidPassword() throws UserRegistrationException
	{
		boolean result=u.passwordOfUser("Password@123");
		assertTrue(result);
	}
	/**
	
	/**
	 * 7.Test method to check  sample emails are valid
	 */
	@Test
	public void checkValidEmails()
	{
		boolean result=se.TestForValidEmails();
		assertTrue(result);
	}
	
}
