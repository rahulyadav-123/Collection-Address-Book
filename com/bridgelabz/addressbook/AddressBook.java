package com.bridgelabz.addressbook;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		String firstName = "Rahul";
		String lastName = "Yadav";
		String address = "Near hanuman Temple";
		String city = "pune";
		String state = "Maharashtra";
		int pinCode = 444001;
		long mobileNumber = 883142763;
		String emailId = "ry219613@gmail.com";
		System.out.println("Name 	     : "  + firstName + " " + lastName + "\n"
                + "Address      : "  + address + "\n"
                + "City         : "  + city + "\n"
                + "State        : "  + state + "\n"
                + "ZipCode      : "  + pinCode + "\n"
                + "MobileNumber : "  + mobileNumber + "\n"
                + "EmailId      : "  + emailId + "\n" );
	}
}
	