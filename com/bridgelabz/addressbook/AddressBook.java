package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
	
		ContactPerson person = new ContactPerson();
		
		public void AddContact() {
			Scanner sc = new Scanner(System.in);	
			System.out.println("Enter First Name : ");
			String firstName = sc.next();
			System.out.println("Enter Last Name : ");
			String lastName = sc.next();
			System.out.println("Enter Address : ");
			String address = sc.next();
			System.out.println("Enter City : ");
			String city = sc.next();
			System.out.println("Enter State : ");
			String state = sc.next();
			System.out.println("Enter Zip : ");
			int zip = sc.nextInt();
			System.out.println("Enter Mobile Number : ");
			long phoneNumber = sc.nextLong();
			System.out.println("Enter Email : ");
			String email = sc.next();
			person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
		}
		
		
		public static void main(String[] args) {
			AddressBook addressBook = new AddressBook();
			addressBook.AddContact();
			System.out.println("Name 	     : "  + addressBook.person.getFirstName() + " " + addressBook.person.getLastName() + "\n"
	                + "Address      : "  + addressBook.person.getAddress() + "\n"
	                + "City         : "  + addressBook.person.getCity() + "\n"
	                + "State        : "  + addressBook.person.getState() + "\n"
	                + "ZipCode      : "  + addressBook.person.getZip() + "\n"
	                + "MobileNumber : "  + addressBook.person.getPhonenumber() + "\n"
	                + "EmailId      : "  + addressBook.person.getEmail() + "\n" );
		}
}
	