import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Spring;

public class Contact{

private String firstName, lastName, address;
private String number;
private static final long LIMIT = 10000000000L;
private static long uuid = 0;

	public Contact(String firstName, String lastName, String number, String address) throws Exception{
		this.firstName=checkFirstName(firstName);
		this.lastName=checkLastName(lastName);
		this.number=checkNumber(number);
		this.address=checkAddress(address);
		this.uuid = setID();
	}

	private static long setID() {
	  // 10 digits.
	  long id = System.currentTimeMillis() % LIMIT;
	  if ( id <= uuid ) {
	    id = (uuid + 1) % LIMIT;
	  }
	  return uuid = id;
	}

	public void setFirstName(String firstName) throws Exception{
		this.firstName=checkFirstName(firstName);
	}

	public void setLastName(String lastName) throws Exception{
		this.lastName=checkLastName(lastName);
	}
	public void setAddress(String address) throws Exception{
		this.address=checkAddress(address);
	}
	public void setPhoneNumber(String number) throws Exception{
		this.number=checkNumber(number);
	}

	public String checkAddress(String address) throws Exception{
		if(address==null){
			throw new NullPointerException("Cannot be Null!");
		}
		Pattern p = Pattern.compile("^[ a-zA-Z0-9]{0,30}$");
		Matcher m = p.matcher(address);
		if(m.find()){
			return address;
		}
		else {
			throw new IllegalArgumentException("Address must be no longer than 30 characters!");
		}
	}

	public String checkFirstName(String firstName) throws Exception{
		
		if(firstName==null){
			throw new NullPointerException("Cannot be Null!");
		}
		Pattern p = Pattern.compile("^[a-zA-Z]{0,10}$");
		Matcher m = p.matcher(firstName);
		if(m.find()){
			return firstName;
		}
		else {
			throw new Exception("Last Name must be no longer than 10 characters!");
		}
	}
	public String checkLastName(String lastName) throws Exception{
		if(lastName==null){
			throw new NullPointerException("Cannot be Null!");
		}
		Pattern p = Pattern.compile("^[a-zA-Z]{0,10}$");
		Matcher m = p.matcher(lastName);
		if(m.find()){
			return lastName;
		}
		else {
			throw new Exception("Last Name must be no longer than 10 characters!");
		}
	}
	public String checkNumber(String number) throws Exception{
		if(number == null){
			throw new NullPointerException("Cannot be Null!");
		}
		Pattern p = Pattern.compile("^[0-9]{10,10}$");
		Matcher m = p.matcher(number);
		if(m.find()){
			return number;
		}
		else {
			throw new Exception("Number must be exactly 10 numeric characters!");
		}
	}

	public long getID(){
		return this.uuid;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getAddress(){
		return this.address;
	}

	public String getNumber(){
		return this.number;
	}
}