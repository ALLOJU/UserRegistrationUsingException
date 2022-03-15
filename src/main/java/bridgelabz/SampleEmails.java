package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * To check sample emails are valid or not
 *
 */
public class SampleEmails {
	/**
	 * list of valid emails taken as string array
	 */
	static String[] validEmails= {"abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
			"abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
	/**
	 * list of Invalid emails taken as string array
	 */
	static String[] InvalidEmails= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
			".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com",
			"abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

	
	/**
	 * Method to check valid emails whether they are valid or not
	 * @return 
	 */
	public boolean TestForValidEmails() {
		System.out.println("------Valid Emails----------");
		for(int i=0;i<validEmails.length;i++) {
			String regex="^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(validEmails[i]);
			if(m.matches()) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
			
		}
		return true;
	}
	/**
	 * Method to check Invalid emails whether they are valid or not
	 * @return 
	 */
	public boolean TestForInValidEmails() {
		System.out.println("---------InValid  Emails----------");
		for(int i=0;i<InvalidEmails.length;i++) {
			String regex="^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(InvalidEmails[i]);
			if(m.matches()) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
			
		}
		return false;
	}
	
}
