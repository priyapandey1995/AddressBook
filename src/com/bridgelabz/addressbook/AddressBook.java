package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	/**
	 * Arraylist is performed for multiple contacts
	 * addContact() is used to add the contact in address book
	 * displayContact() is used to display the contacts in address Book
	 * editContact() is used edit the contacts in addressBook
	 */
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contactArrayList = new ArrayList<>();
	
	
	
	public void addContact() {
		
		
		Contact contact = new Contact();
		System.out.println("Enter the First Name");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City");
		contact.setCity(sc.next());
		System.out.println("Enter the State");
		contact.setState(sc.next());
		System.out.println("Enter the Zipcode");
		contact.setZip(sc.next());
		System.out.println("Enter the MobileNo");
		contact.setPhoneNo(sc.next());
		System.out.println("Enter the Email id");
		contact.setEmail(sc.next());
		contactArrayList.add(contact);
		
	}
	
	public void displayContact() {
		for(int i = 0; i < contactArrayList.size(); i++) {
			Contact contact = contactArrayList.get(i);
		    System.out.println(contact.toString());
	}
}
	public void editContact() {
		System.out.println("Enter the First Name of the contact to edit");
		String firstName = (sc.next());
		boolean isAvailable = false;
		
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equals(firstName)) {
				isAvailable = true;
				System.out.println("Enter the first name");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name : ");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address : ");
				contact.setAddress(sc.next());
				System.out.println("Enter the City : ");
				contact.setCity(sc.next());
				System.out.println("Enter the State : ");
				contact.setState(sc.next());
				System.out.println("Enter the Zipcode : ");
				contact.setZip(sc.next());
				System.out.println("Enter the Mobile Number : ");
				contact.setPhoneNo(sc.next());
				System.out.println("Enter the Email Id : ");
				contact.setEmail(sc.next());
				
				}
			}
		if(isAvailable == false) {
			System.out.println("Contact not Available");
		}
			}
		
	}
		

