package Day09_AddressBook;

import java.io.Console;
import java.util.Scanner;
import java.util.Vector;
/**
 * 
 * AddressBook object with variables firstname, lastName,City, State,
 * PhoneNumber, ZipCode.
 * 
 */
public class Address {
    String address;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int phonenumber;
    private int zipcode;
   
   
    Address(String firstName, String lastName, String city, String state, int phonenumber,
            int zipcode){

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.phonenumber = phonenumber ;
        this.zipcode = zipcode;   
       
    }
    
    public String getfirstName() {
        return this.firstName;
    }

    
    public void setfirstName(String newfirstName) {
        this.firstName = newfirstName;
    }
    
    public String getlastName() {
        return this.lastName;
    }

    public void setlastName(String newlastName) {
        this.lastName = newlastName;
    }
    
    public String getCity() {
        return this.city;
    }
   
    public void setCity(String newCity) {
        this.city = newCity;
    }
   
    public String getState() {
        return this.state;
    }

    
    public void setState(String newState) {
        this.state = newState;
    }
   
    public int getZipCode() {
        return this.zipcode;
    }

   
    public void setZipCode(int newZipCode) {
        this.zipcode = newZipCode;
    }
    
    public int getPhoneNumber() {
        return this.phonenumber;
    }

    public void setPhoneNumber(int newPhoneNumber) {
        this.phonenumber = newPhoneNumber;
    }
    
    public String toString() {
        return "fisrtName=" + firstName + " " + "lastName=" + lastName + " " + "city="
        + city + " " + "State=" + state + " " + "zipcode=" + zipcode + " " + "phonenumber=" + phonenumber ;

    }
    public static void main(String[]args)
    {
    	
    	System.out.println("Welcome to Address Book Program in AddressBook");
    	
    	
    	
    }
    

}

