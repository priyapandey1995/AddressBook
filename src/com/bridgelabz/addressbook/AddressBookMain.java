package com.bridgelabz.addressbook;

import java.util.Scanner;

/**
 * 
 * @author pande
 *
 */
public class AddressBookMain {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * switch case is used to choose the operations to perform in Address Book
		 */
		
		Scanner sc = new Scanner(System.in);
		int operationNo;
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook = new AddressBook();
		
	do {
		System.out.println("***AddressBook***");
		System.out.println(" \n 1. ADD CONTACT \n 2. DISPLAY CONTACT \n 3. EDIT CONTACT \n 4. DELETE CONTACT \n 5.EXIT");
		System.out.println("Choose the operationNo");
		operationNo = sc.nextInt();
		
		
		switch(operationNo){
		case 1:
			addressBook.addContact();
			break;
		case 2:
			addressBook.displayContact();
			break;
		case 3:
			addressBook.editContact();
			break;
		case 4:
			addressBook.deleteContact();
			break;
		default:
			System.out.println("Wrong Operation No");
			break;
		}
			}while(operationNo != 4);
		
	}
}


