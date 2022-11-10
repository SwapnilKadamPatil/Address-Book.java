package Day09_AddressBook;

import java.util.Scanner;

public class AddressBook 
{

	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String email;
	int zipcode;
	int phone;
	
	public void addContact()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your First Name");
		FirstName =sc.nextLine();
		
		System.out.println("Enter your Last Name");
		LastName =sc.nextLine();
		
		System.out.println("Enter your Address");
		Address =sc.nextLine();
		
		System.out.println("Enter your City Name");
		City =sc.nextLine();
		
		System.out.println("Enter your State Name");
		State =sc.nextLine();
		
		System.out.println("Enter your Email Address");
		email =sc.nextLine();
		
		System.out.println("Enter Zip code");
		zipcode =sc.nextInt();
		System.out.println("Enter phone Number");
		phone =sc.nextInt();
			
		
	}
	public void display()
	{
	System.out.println("First Name :" + FirstName);
	System.out.println("Last Name : " + LastName);
	System.out.println("First Name :" + Address);
	System.out.println("First Name :" + City);
	System.out.println("First Name :" + State);
	System.out.println("First Name :" + email);
	System.out.println("First Name :" + zipcode);
	System.out.println("First Name :" + phone);
	
	}
	public void editContact()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Choose any option :");
		System.out.println("1. First Name ");
		System.out.println("2.Last Name :");
		System.out.println("3. Address :");
		System.out.println("5. City :");
		System.out.println("6. State :");
		System.out.println("7. Email:");
		System.out.println("8. ZipCode:");
		
		int option=sc.nextInt();
		
		switch (option)
		{
		case 1:
			System.out.println("Enter your First Name");
			FirstName =sc.nextLine();
			break;
		case 2:
			System.out.println("Enter your Last Name");
			LastName =sc.nextLine();
			break;
		case 3:
			System.out.println("Enter your Address");
			Address =sc.nextLine();
			break;
		case 4:
			System.out.println("Enter your City Name");
			City =sc.nextLine();
			break;
		case 5:
			System.out.println("Enter your State Name");
			State =sc.nextLine();
			break;
		case 6:
			System.out.println("Enter your Email Address");
			email =sc.nextLine();
			break;
		case 7:
			System.out.println("Enter Zip code");
			zipcode =sc.nextInt();
			break;
		case 8:
			System.out.println("Enter Phone Number");
			phone =sc.nextInt();
			break ;
		
		}
		
		
	}
	public void deleteContact()
	{
		FirstName = null ;
		LastName = null ;
		Address = null ;
		City = null ;
		State = null ;
		email = null ;
		zipcode = 0 ;
		phone = 0;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program in AddressBook");
		AddressBook ob=new AddressBook ();
		Scanner sc=new Scanner (System.in);
		
		boolean add= true;
		
		while (add)
		{
			System.out.println("Choose any option :");
			System.out.println("1. Add Contact ");
			System.out.println("2. Display Contact :");
			System.out.println("3. Edit Contact :");
			System.out.println("4. Delete Contact :");
			
			int choose=sc.nextInt();
			
			switch (choose)
			{
			case 1:
				ob.addContact();
				break ;
			case 2:
				ob.display();
				break ;
			case 3:
				ob.editContact();
				break ;
			case 4:
				ob.deleteContact();
				break ;
			case 5:
				add = false ;
				break ;
			default :
				System.out.println("Please Choose Correct Option");
			}
		}
	}

}
