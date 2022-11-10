//Uc 04 -> Ability to add a new Contact to Address Book
//Uc 05 -> Ability to add multiple person to Address Book

package Day09_AddressBook;

import java.util.*;

class Contact implements Comparable<Contact> {
	private String firstName;
	private String lastName;
	private long phoneNumber;

	Contact(String fname, String lname, long phno) {
		firstName = fname;
		lastName = lname;
		phoneNumber = phno;
		
	}

	void setFirstName() {
		this.firstName = firstName;
	}

	void setLastName() {
		this.lastName = lastName;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	@Override
	public int compareTo(Contact o) {
		return getFirstName().compareTo(o.getFirstName());
	}
}

class AddressBook {
	static Set<Contact> contacts;
	public char[] contact;

	public AddressBook() {
		contacts = new TreeSet<Contact>();
	}

	public static void main(String a[]) {
		AddressBook ob = new AddressBook();
		contacts.add(new Contact("shashank", "mani", 880456788));
		contacts.add(new Contact("rahul", "Kadam", 900450678));
		contacts.add(new Contact("mohan", "mani", 989456808));
		contacts.add(new Contact("rajesh", "sharma", 128856889));
		contacts.add(new Contact("ashutosh", "mani", 783457889));
		contacts.add(new Contact("raja", "goyal", 673456789));
		contacts.add(new Contact("mayank", "sharma", 223467889));
		contacts.add(new Contact("Omkar", "Joshi", 1234568809));
		contacts.add(new Contact("nimish", "narayan", 856907834));
		contacts.add(new Contact("c.p", "sharm", 925678890));

		Iterator it = contacts.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}


