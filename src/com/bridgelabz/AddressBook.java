package com.bridgelabz;

import java.util.Scanner;
import java.io.Console;
import java.util.*;

public class AddressBook 
   {
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phonenumber;
	private String emailid;
	Scanner sc =  new Scanner(System.in);
 
	AddressBook(String firstname,String lastname,String address,String city,String state,String zip,String phonenumber,String emailid)
	{
		this.firstname = "";
		this.lastname = "";
		this.address = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.phonenumber = "";
		this.emailid = "";
    }
	
	AddressBook()
	{
		firstname = "";
        lastname = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        phonenumber = "";
        emailid = "";
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter address: ");
        String address = scanner.next();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.print("Enter state: ");
        String state = scanner.next();
        System.out.print("Enter zip: ");
        long zip = scanner.nextLong();
        System.out.print("Enter phone no: ");
        long phonenumber = scanner.nextLong();
        System.out.print("Enter email: ");
        String emailid = scanner.next();
        
        
      }
   }
