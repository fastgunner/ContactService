import java.util.Scanner;
import java.util.ArrayList;

public class ContactService{
	private ArrayList <Contact> contactList;

	public void createContact() throws Exception{
		Scanner input = new Scanner(System.in);

		System.out.println("Please input First Name");
		String firstName = input.nextLine();
		System.out.println("Please input Last Name");
		String lastName = input.nextLine();
		System.out.println("Please input Address");
		String address = input.nextLine();
		System.out.println("Please input Phone Number");
		String phoneNumber = input.nextLine();

		Contact a = new Contact(firstName,lastName,address,phoneNumber);
		contactList.add(a);
		
		input.close();

	}

	public boolean deleteContact(long uuid){
		for(Contact c : contactList){
			if(c.getID()==uuid){
				contactList.remove(c);
				c=null;
				return true;
			}
		}
		return false;
	}

	public boolean updateContact(long uuid) throws Exception{
		System.out.println("Please update each field by typing the new value and then hitting enter.  There are 4 values.");
		Scanner input = new Scanner(System.in);
		String firstName=input.nextLine();
		String lastName=input.nextLine();
		String address=input.nextLine();
		String number=input.nextLine();
		for(Contact c : contactList){
			if(c.getID()==uuid){
				c.setFirstName(firstName);
				c.setLastName(lastName);
				c.setAddress(address);
				c.setPhoneNumber(number);
				input.close();
				return true;
				
			}
		}
		input.close();
		return false;
	}
}