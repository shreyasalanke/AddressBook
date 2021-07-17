package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	 static ArrayList<Contact> contactList = new ArrayList<>();
	   
	    public static void main(String[] args) 
	    {
	        System.out.println("Welcome to the Address book program"); 
	        AddressBook addressMain = new AddressBook();
	        addressMain.addingContactList();
	    }
	    public void display(ArrayList<Contact> contactList)
	   {
	        for (Contact contact : contactList) 
	        {
	            System.out.println(contact);
	        }
	    }	
	    public void addingContactList() 
	    {
	        while (true) 
	        {
	            System.out.println("Press 0 - Display all contacts");
	            System.out.println("Press 1 - Add contact");
	            System.out.println("Press 2 - Edit contact");
	            System.out.println("Press 3 - Delete contact");
	            System.out.println("Press 4 - Exit");
	            int option = sc.nextInt();
	            sc.nextLine();

	            switch (option) 
	            {
	                case 0 : display(contactList);
	                case 1 : addingContact(null, contactList);
	                case 2 : editContact();
	                case 3 : deletingContact(contactList);
	            }
	            if (option == 4) 
	            {
	                break;
	            }
	        }
	    }

	    public void addingContact(Contact contact, ArrayList<Contact> contactList) {

	        contact = new Contact();

	        System.out.println("Enter first name : ");
	        contact.firstName = sc.next();

	        System.out.println("Enter last name : ");
	        contact.lastName = sc.next();

	        System.out.println("Enter address : ");
	        contact.address = sc.next();
	       

	        System.out.println("Enter city : ");
	        contact.city = sc.next();

	        System.out.println("Enter state : ");
	        contact.state = sc.next();

	        System.out.println("Enter zip code : ");
	        contact.zip = sc.nextInt();

	        System.out.println("Enter phone number : ");
	        contact.phoneNumber = sc.nextLong();

	        System.out.println("Enter email : ");
	        contact.email = sc.next();

	        contactList.add(contact);

	    }
 
	    public void deletingContact(ArrayList<Contact> contactList) 
	    {
	        System.out.println("Enter the first name of the contact you wish to delete");
	        String delete = sc.next();
	        contactList.removeIf(contact -> contact.firstName.equals(delete));   
	    }

	    public void editContact() 
		{
	        System.out.println("Enter the first name of contact you wish to edit");
	        String edit = sc.nextLine();
	        System.out.println("Press 1 - To edit first name");
	        System.out.println("Press 2 - To edit last name");
	        System.out.println("Press 3 - To edit address");
	        System.out.println("Press 4 - To edit city");
	        System.out.println("Press 5 - To edit state");
	        System.out.println("Press 6 - To edit zip code");
	        System.out.println("Press 7 - To edit phone number");
	        System.out.println("Press 8 - To edit email");
	        int choice = sc.nextInt();
	        if (choice == 1) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new first name");
	                    contactItems.firstName = sc.next();
	                }
	            }
	        }
	        if (choice == 2) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new last name");
	                    contactItems.lastName = sc.next();
	                }
	            }
	        }
	        if (choice == 3) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new address");
	                    contactItems.address = sc.next();
	                }
	            }
	        }
	        if (choice == 4) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new city");
	                    contactItems.city = sc.next();
	                }
	            }
	        }
	        if (choice == 5) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new state");
	                    contactItems.state = sc.next();
	                }
	            }
	        }
	        if (choice == 6) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new zip code");
	                    contactItems.zip = sc.nextInt();
	                }
	            }
	        }
	        if (choice == 7) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new phone number");
	                    contactItems.phoneNumber = sc.nextLong();
	                }
	            }
	        }
	        if (choice == 8) {
	            for (Contact contactItems : contactList) {
	                if (contactItems.firstName.equals(edit)) {
	                    System.out.println("Enter new email");
	                    contactItems.email = sc.next();
	                }
	            }
	        }
	    }	   
}