package com.contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ContactService {
	
	
	//List of contacts
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	
	//Add Contact Method
	public Contact addContact(String contactID, String firstName, String lastName, long phoneNum, String address) {
		
		Contact contact = null;
		
		//Iterator design pattern to iterate through ArrayList of contacts
		Iterator<Contact> myIterator = contacts.iterator();
		
		//If contact already exist to make sure there is no duplicate contact
		while(myIterator.hasNext()) {
			//Local temporary contact
			Contact tempContact = myIterator.next();
			if(tempContact.getContactID() == contactID) {
				contact = tempContact;
			}
		}
		// if not found, make a new contact instance and add to list of contacts
		if (contact == null) {
			contact = new Contact(contactID, firstName, lastName, phoneNum, address);
			contacts.add(contact);
		}

		// return the new/existing contact instance to the caller
		return contact;
		
	}
	
	//Delete Contact Method
	public Contact deleteContact(String contactID) {
		
		
		int index = 0;
		int foundContactIndex = 0;
		
		Iterator<Contact> myIterator = contacts.iterator();
		
		while(myIterator.hasNext()) {
			//Local temporary contact
			Contact tempContact = myIterator.next();
			if(tempContact.getContactID() == contactID) {
				foundContactIndex = index;
			}
			index += 1;
		}
		return contacts.remove(foundContactIndex);
	}
	
	//Update Contact Method
	public Contact updateContact(String contactID, String firstName, String lastName, long phoneNum, String address) {
		Contact contact = null;
		int index = 0;
		int foundContactIndex = 0;
		Iterator<Contact> myIterator = contacts.iterator();
		
		while(myIterator.hasNext()) {
			//Local temporary contact
			Contact tempContact = myIterator.next();
			if(tempContact.getContactID() == contactID) {
				contact = tempContact;
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setPhoneNumber(phoneNum);
				contact.setAddress(address);
				foundContactIndex = index;
				
			}
			index += 1;
		}
		return contacts.set(foundContactIndex, contact);
	}
	
	
	
}
